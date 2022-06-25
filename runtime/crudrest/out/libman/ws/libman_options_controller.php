<?php

 /**
 * Controller class for options REST webservice.
 *
 * @since      4.7.0
 * @package    libman
 * @author     Mohammadreza Asadi	https://mdse.ui.ac.ir/fa/member/%D9%85%D8%AD%D9%85%D8%AF%D8%B1%D8%B6%D8%A7-%D8%A7%D8%B3%D8%AF%DB%8C/
 */
class libman_options_controller extends WP_REST_Controller {

 /**
 * Register the routes for the objects of the controller.
 */
  public function register_routes() {
	$namespace = 'libman';
	$base = 'options';

	register_rest_route( $namespace, '/v1/'.$base, array(
		array(
			'methods'             => array('GET'),
			'callback'            => array( $this, 'get_meta' ),
			'permission_callback' => array( $this, 'permission_check' ),
		),
		array(
			'methods'             => array('POST'),
			'callback'            => array( $this, 'save' ),
			'permission_callback' => array( $this, 'permission_check' ),
		),
	) );
	
  }


  /**
   * 
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|WP_REST_Response
   */
  public function get_meta( $request ) {
	global $wp_roles;
	$roles = $wp_roles->roles;
	$caps= array('create'=>__('Create'),'list'=>__('List'), 'view'=>__('View'), 'delete'=>__('Remove'), 'edit'=>__('Edit'));
	$extends= array();
	$data = array('pages'=>libman_Models::get_pages(),'entities'=>libman_Models::get_entities(), 'roles'=>$roles,'caps'=>$caps, 'extends'=>$extends);
	return new WP_REST_Response( $data , 200 );
  }

  public function save( $request ) {
	$my_roles=$request->get_json_params();
	global $wp_roles;
	foreach ($my_roles as $key=>$caps){
	  $role = $wp_roles->get_role($key);
	  foreach ($caps as $ckey=>$cap)
	  {
		$role->add_cap($ckey,$cap==true);
	  }
	}
	return new WP_REST_Response( 'OK' , 200 );
  }

  /**
   * Check if a given request has access to plugin Options
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|bool
   */
  public function permission_check( $request ) {
	$user = wp_get_current_user();
	$allowed_roles = array('administrator');
	return count(array_intersect($allowed_roles, $user->roles ))>0;
  }
 
}

