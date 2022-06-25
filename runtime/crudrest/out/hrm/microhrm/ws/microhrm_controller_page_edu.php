<?php

 /**
 * Controller class for "edu" Page REST webservice.
 *
 * @since      4.7.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */

require_once('microhrm_controller.php');

class microhrm_controller_page_edu extends microhrm_controller {

  public function __construct() {
	parent::__construct('page_edu','edu','edu',1);
  }
}

