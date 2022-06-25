<?php

 /**
 * Controller class for "diabled_employee" Page REST webservice.
 *
 * @since      4.7.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */

require_once('microhrm_controller.php');

class microhrm_controller_page_diabled_employee extends microhrm_controller {

  public function __construct() {
	parent::__construct('page_diabled_employee','employee','diabled_employee',1);
  }
}

