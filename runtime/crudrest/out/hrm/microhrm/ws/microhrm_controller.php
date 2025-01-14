<?php

 /**
 * Base Controller class for REST webservice.
 *
 * @since      4.7.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */ 
class microhrm_controller extends WP_REST_Controller {

  protected $key='';
  protected $entity_key='';
  protected $page_key='';
  protected $version=1;

  public function __construct($key, $entity_key, $page_key='',$version=1) {
	$this->key = $key;
	$this->entity_key = $entity_key;
	$this->page_key = $page_key;
	$this->version = $version;
  }

 /**
 * Register the routes for the objects of the controller.
 */
  public function register_routes() {

	$version = $this->version;
	$namespace = 'microhrm/v' . $version; //wp-json/microhrm/.$this->version;
	$base = $this->key;

	register_rest_route( $namespace, '/' . $base, array(
		array(
			'methods'             => WP_REST_Server::READABLE,
			'callback'            => array( $this, 'get_items' ),
			'permission_callback' => array( $this, 'get_items_permissions_check' ),
			'args'                => $this->get_collection_params(),
		),
		array(
			'methods'             => WP_REST_Server::CREATABLE,
			'callback'            => array( $this, 'create_item' ),
			'permission_callback' => array( $this, 'create_item_permissions_check' ),
			'args'                => $this->get_endpoint_args_for_item_schema( WP_REST_Server::CREATABLE ),
		),
	) );
	register_rest_route( $namespace, '/mini/' . $base, array(
		array(
			'methods'             => WP_REST_Server::READABLE,
			'callback'            => array( $this, 'get_items_mini' ),
			'permission_callback' => array( $this, 'get_items_permissions_check' ),
			'args'                => $this->get_collection_params(),
		),
	) );
	register_rest_route( $namespace, '/' . $base . '/(?P<id>[\d]+)', array(
		array(
			'methods'             => WP_REST_Server::READABLE,
			'callback'            => array( $this, 'get_item' ),
			'permission_callback' => array( $this, 'get_item_permissions_check' ),
			'args'                => $this->get_item_params(),
		),
		array(
			'methods'             => WP_REST_Server::EDITABLE,
			'callback'            => array( $this, 'update_item' ),
			'permission_callback' => array( $this, 'update_item_permissions_check' ),
			'args'                => $this->get_endpoint_args_for_item_schema( WP_REST_Server::EDITABLE ),
		),
		array(
			'methods'             => WP_REST_Server::DELETABLE,
			'callback'            => array( $this, 'delete_item' ),
			'permission_callback' => array( $this, 'delete_item_permissions_check' ),
			'args'                => array(	),
		),
	) );

	register_rest_route( $namespace, '/' . $base . '/bulk/(?P<key>[a-zA-Z0-9]+)/', array(

		array(
			'methods'             => WP_REST_Server::EDITABLE,
			'callback'            => array( $this, 'bulk_action' ),
			'permission_callback' => array( $this, 'bulk_action_permissions_check' ),
		),
	) );
	register_rest_route( $namespace, '/' . $base . '/schema', array(
		'methods'  => WP_REST_Server::READABLE,
		'callback' => array( $this, 'get_public_item_schema' ),
	) );
  }


  /**
   * Retrieves the item's schema, conforming to JSON Schema.
   *
   * @since 4.7.0
   *
   * @return array Item schema data.
   */
  public function get_item_schema() {
	return $this->add_additional_fields_schema( array() );
  }

  /**
   * Get a collection of items
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|WP_REST_Response
   */
  public function get_items( $request ) {
	include_once microhrm_PATH.'includes/microhrm_db.php';
	$page=$request->get_param('page');
	$per_page=$request->get_param('per_page');
	$search=$request->get_param('search');
	$sort=$request->get_param('sort');
	$select=$request->get_param('select');
	$where=null;
	$db=microhrm_db::get_db();

	if ($this->page_key) {
		$list=microhrm_Models::get_page($this->page_key)->listView;
	  	$where=$list->where;
	}
	$result = $db->fetch_data($this->entity_key, explode(',',$select),$search,$where,$sort,$per_page,$per_page*($page-1));
	$items=$result["items"];
	$data = array();
	foreach( $items as $item ) {
	  $itemdata = $this->prepare_item_for_response( $item, $request );
	  $data[] = $this->prepare_response_for_collection( $itemdata );
	}
	$result["items"]=$data;
	return new WP_REST_Response( $result, 200 );
  }

  public function get_items_mini( $request ) {
	include_once microhrm_PATH.'includes/microhrm_db.php';
	$db=microhrm_db::get_db();
	$entity= microhrm_Models::get_entity($this->entity_key);
	$fields_to_select= $entity->get_in_title_fields_key();
	$result = $db->fetch_data($this->entity_key,$fields_to_select);
	$items=$result["items"];
	$data = array();
	foreach( $items as $item ) {
	  $itemdata = $this->prepare_item_for_response( $item, $request );
	  $data[] = $this->prepare_response_for_collection( $itemdata );
	}
	$result["items"]=$data;
	return new WP_REST_Response( $result, 200 );
  }

  /**
   * Get one item from the collection
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|WP_REST_Response
   */
  public function get_item( $request ) {
	include_once microhrm_PATH.'includes/microhrm_db.php';
	$id = $request->get_param('id');
	$select = $request->get_param('select');
	$db=microhrm_db::get_db();
	$result =$db->fetch_data($this->entity_key,explode(',',$select),null,"{$this->entity_key}.id=$id",null,1,0);
	$data = $this->prepare_item_for_response( $result["items"][0], $request );
	return new WP_REST_Response( $data, 200 );
  }

  /**
   * Create one item from the collection
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|WP_REST_Response
   */
  public function create_item( $request ) {
	include_once microhrm_PATH.'includes/microhrm_db.php';
	$db=microhrm_db::get_db();
	$item = $this->prepare_item_for_database( $request );
	$id=$db->mutation_item($item,$this->entity_key);
	return new WP_REST_Response( array('id'=>$id), 200 );
  }

  /**
   * Update one item from the collection
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|WP_REST_Response
   */
  public function update_item( $request ) {
	include_once microhrm_PATH.'includes/microhrm_db.php';
	$db=microhrm_db::get_db();
	$item = $this->prepare_item_for_database( $request );
	$id=$db->mutation_item($item,$this->entity_key);
	return new WP_REST_Response( array('id'=>$id), 200 );
  }

  /**
   * Delete one item from the collection
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|WP_REST_Response
   */
  public function delete_item( $request ) {
	include_once microhrm_PATH.'includes/microhrm_db.php';
	$db=microhrm_db::get_db();
	$id=$request->get_json_params()["id"];
	if (!$id) return new WP_Error('cant-delete', __('not permit!','microhrm'),  array( 'status' => 400 )  );
	$result=$db->delete_item($id,$this->entity_key);
	return new WP_REST_Response( array('id'=>$result), 200 );
  }

  public function permissions_check( $request ) {
	//return true;// <--use to make readable by all
	if ($this->page_key) $key='microhrm_page_'.$this->page_key;
	else $key='microhrm_ws_'.$this->entity_key;
	$attr=$request->get_attributes();
	$clbk= $attr['callback'][1];
	switch ($clbk){
	  case 'get_item':$key.='_view';
		break;
	  case 'get_items_mini':
	  case 'get_items':$key.='_list';
		break;
	  case 'create_item':$key.='_create';
		break;
	  case 'update_item':$key.='_edit';
		break;
	  case 'delete_item':$key.='_delete';
		break;
	  case 'bulk_action': $key='microhrm_bulk_'.$this->page_key.'_'.$request->get_param('key');
		break;
	}
	return current_user_can($key);
	
  }

  /**
   * Check if a given request has access to get items
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|bool
   */
  public function get_items_permissions_check( $request ) {
	return $this->permissions_check($request);
  }

  /**
   * Check if a given request has access to get a specific item
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|bool
   */
  public function get_item_permissions_check( $request ) {
	return $this->permissions_check($request);
  }

  /**
   * Check if a given request has access to create items
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|bool
   */
  public function create_item_permissions_check( $request ) {
	return $this->permissions_check($request);
  }

  /**
   * Check if a given request has access to update a specific item
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|bool
   */
  public function update_item_permissions_check( $request ) {
	return  $this->permissions_check($request);
  }

  /**
   * Check if a given request has access to delete a specific item
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|bool
   */
  public function delete_item_permissions_check( $request ) {
	return $this->permissions_check($request);
  }

  /**
   * Prepare the item for create or update operation
   *
   * @param WP_REST_Request $request Request object
   * @return WP_Error|object $prepared_item
   */
  protected function prepare_item_for_database( $request ) {
    $item= $request->get_json_params();
    $prepared_item=array();
    $entity=microhrm_Models::get_entity($this->entity_key);
    foreach ($item as $key=>$value){
      if ($key=='id'){
		$prepared_item['id']=$value;
        continue;
      }
      $field_type=$entity->get_field_type($key);
      $prepared_item[$key]=$field_type->to_db($item,$key,$value);
	}
    return $prepared_item;
  }

  /**
   * Prepare the item for the REST response
   *
   * @param mixed $item WordPress representation of the item.
   * @param WP_REST_Request $request Request object.
   * @return mixed
   */
  public function prepare_item_for_response( $item, $request ) {
	$prepared_item=array();
	$entity=microhrm_Models::get_entity($this->entity_key);
	foreach ($item as $key=>$value){
	  if ($key=='id'){
		$prepared_item['id']=$value;
		continue;
	  }
	  $field_type=$entity->get_field_type($key);
	  $prepared_item[$key]=$field_type->from_db($item,$key,$value);
	}
	return $prepared_item;
  }


  public function bulk_action( $request ) {
	$key= $request->get_param('key');
	$items= $request->get_json_params();
	$func="bulk_action_$key";
	if(method_exists($this, $func)){
	  $result = call_user_func(array($this, $func),$request,$items);
	  return $result;
	}
	return new WP_Error('not exist', __('Action not exist','microhrm'),  array( 'status' => 404 )  );
  }
  public function bulk_action_delete( $request,$items ) {


	include_once microhrm_PATH.'includes/microhrm_db.php';
	$db=microhrm_db::get_db();

	global $wpdb;
	$page=microhrm_Models::get_page($this->page_key);
	$ids=array();
	foreach ($items as $key=>$item){
	  $ids[]=$db->delete_item($item["id"],$page->entity_key);
	}
	return new WP_REST_Response( array('count'=>count($ids),'ids'=>$ids,'message'=>__('Selected items removed!')), 200 );
  }
  public function bulk_action_permissions_check( $request ) {
	return $this->permissions_check($request);;
  }

	/**
	 * Retrieves the query params for the collections.
	 *
	 * @since 4.7.0
	 *
	 * @return array Query parameters for the collection.
	 */
  public function get_collection_params()
  {
	$params = parent::get_collection_params();
	$params["sort"] = array(
		'description' => __('List orderby','microhrm'),
		'type' => 'string',
		'sanitize_callback' => 'sanitize_text_field',
		'validate_callback' => 'rest_validate_request_arg',
	);

	if($this->page_key) {
	  $page = microhrm_Models::get_page($this->page_key);
	  $select=$page->get_list_view()->columns;
	}
	else {
	  $entity= microhrm_Models::get_entity($this->entity_key);
	  $select=$entity->get_all_fields_key();
	}
	$params["select"] = array(
		'description' => __('Select fields for projection separate by `,`','microhrm'),
		'type' => 'string',
		'default'=> implode(",",$select),
		'sanitize_callback' => 'sanitize_text_field',
		'validate_callback' => 'rest_validate_request_arg',
	);
	return $params;
  }

	/**
	 * Retrieves the query params for the item.
	 *
	 * @since 4.7.0
	 *
	 * @return array Query parameters for the collection.
	 */
  public function get_item_params()
  {
	if ($this->page_key) {
	  $page = microhrm_Models::get_page($this->page_key);
	  $layouts=$page->get_form_view()->fieldsLayouts;
	  $select=array();
	  foreach ($layouts as $key=>$val) $select[$key]=$key;
	} else {
	  $entity = microhrm_Models::get_entity($this->entity_key);
	  $select = $entity->get_all_fields_key();
	}
	$params = array(
		"id" => array(
			'description' => __('Item id', 'microhrm'),
			'type' => 'integer',
			'default' => 0,
			'minimum' => 1,
			'sanitize_callback' => 'absint',
			'validate_callback' => 'rest_validate_request_arg',
		),
		'select' => array(
			'description' => __('Select fields for projection separate by `,`', 'microhrm'),
			'type' => 'string',
			'default' => implode(",", $select),
			'sanitize_callback' => 'sanitize_text_field',
			'validate_callback' => 'rest_validate_request_arg',
		)

	);
	return $params;
  }
}

