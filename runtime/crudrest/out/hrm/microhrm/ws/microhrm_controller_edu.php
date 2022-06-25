<?php

 /**
 * Controller class for "edu" REST webservice.
 *
 * @since      4.7.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */

require_once('microhrm_controller.php');

class microhrm_controller_edu extends  microhrm_controller {

  public function __construct() {
	parent::__construct('edu','edu',null,1);
  }
 
}

