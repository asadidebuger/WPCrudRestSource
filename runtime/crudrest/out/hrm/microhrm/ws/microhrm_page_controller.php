<?php

 /**
 * Controller class for Page model meta REST webservice.
 *
 * @since      4.7.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */
class microhrm_page_controller extends WP_REST_Controller {

 /**
 * Register the routes for the objects of the controller.
 */
  public function register_routes() {

	$version = '1';
	$namespace = 'microhrm/v' . $version;
	$base = 'page';

	register_rest_route( $namespace, '/' . $base.'/(?P<page_key>[a-zA-Z0-9]+)', array(
		array(
			'methods'             => WP_REST_Server::READABLE,
			'callback'            => array( $this, 'get_item' ),
			'permission_callback' => array( $this, 'get_item_permissions_check' ),
			'args'                => array(

			),
		),
	) );

	register_rest_route( $namespace, '/' . $base, array(
		array(
			'methods'             => WP_REST_Server::READABLE,
			'callback'            => array( $this, 'get_items' ),
			'permission_callback' => array( $this, 'get_items_permissions_check' ),
			'args'                => array(

			),
		),
	) );

	register_rest_route( $namespace, '/admin-menu/(?P<slug>[a-zA-Z0-9]+)', array(
		array(
			'methods'             => WP_REST_Server::READABLE,
			'callback'            => array( $this, 'get_admin_menu' ),
			'permission_callback' => array( $this, 'get_items_permissions_check' ),
			'args'                => array(

			),
		),
	) );

  }

  /**
   * Get a collection of items
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|WP_REST_Response
   */
  public function get_items( $request ) {
	return new WP_REST_Response( array('pages'=>microhrm_Models::get_pages()), 200 );
  }

  /**
   * Get one item from the collection
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|WP_REST_Response
   */
  public function get_item( $request ) {
	//get parameters from request
	$params = $request->get_params();
	//$slugs=explode('_',$params['page_key']) ;
	$item = microhrm_Models::get_page($params['page_key']);
	$item->entity=microhrm_Models::get_entity($item->entity_key);
	foreach ($item->entity->relations as $key=>$relation ){
	  $relation->title_script=microhrm_Models::get_entity($relation->entity)->title_script;
//	  $relation->entity=microhrm_Models::get_entity($relation->entity);
	}
	$data = $this->prepare_item_for_response( $item, $request );
	return new WP_REST_Response( $data, 200 );
  }

  public function get_admin_menu( $request ) {
	//get parameters from request
	$params = $request->get_params();
	$slug=$params['slug'];
	$admin_menus = microhrm_Models::get_admin_menus();
	$items=array();
	foreach ($admin_menus as $slug => $menu){
	  $items[$slug]=array('title'=>$menu['title'],'icon'=>$menu['icon'],'sub'=>array());
	  foreach ($menu['sub'] as $itemSlug => $menuItem) {
		if (current_user_can('microhrm_page_'.$menuItem['page_key'].'_list')) $items[$slug]['sub'][$itemSlug]=$menuItem;
	  }
	}

	return new WP_REST_Response( $items, 200 );
  }

  /**
   * Check if a given request has access to get items
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|bool
   */
  public function get_items_permissions_check( $request ) {
	return true;
	//return current_user_can( 'edit_something' );
  }

  /**
   * Check if a given request has access to get a specific item
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|bool
   */
  public function get_item_permissions_check( $request ) {
	return $this->get_items_permissions_check( $request );
  }

  /**
   * Prepare the item for the REST response
   *
   * @param mixed $item WordPress representation of the item.
   * @param WP_REST_Request $request Request object.
   * @return mixed
   */
  public function prepare_item_for_response( $item, $request ) {
	return array($item->key=> (array)$item);
  }

}

