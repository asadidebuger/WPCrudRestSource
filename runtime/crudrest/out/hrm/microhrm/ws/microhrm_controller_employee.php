<?php

 /**
 * Controller class for "employee" REST webservice.
 *
 * @since      4.7.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */

require_once('microhrm_controller.php');

class microhrm_controller_employee extends  microhrm_controller {

  public function __construct() {
	parent::__construct('employee','employee',null,1);
  }
 
}

