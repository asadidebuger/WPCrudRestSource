<?php

 /**
 * Controller class for extend REST webservice.
 *
 * @since      4.7.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */
class microhrm_extend_controller extends WP_REST_Controller {

 /**
 * Register the routes for the objects of the controller.
 */
  public function register_routes() {
	$namespace = 'microhrm';
	$base = 'extend';
	register_rest_route( $namespace, '/v1/' . $base.'total_employ_count', array(
		array(
			'methods'             => array('GET'),
			'callback'            => array( $this, 'get_total_employ_count' ),
			'permission_callback' => array( $this, 'get_total_employ_count_permission_check' ),
		),
	) );
	
  }


  /**
   * GET total_employ_count
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|WP_REST_Response
   */
  public function get_total_employ_count( $request ) {
	$data = array();
	return new WP_REST_Response( $data , 200 );
  }

  /**
   * Check if a given request has access to GET total_employ_count
   *
   * @param WP_REST_Request $request Full data about the request.
   * @return WP_Error|bool
   */
  public function get_total_employ_count_permission_check( $request ) {
	return current_user_can('microhrm_ws_get_total_employ_count');
  }
 
}

