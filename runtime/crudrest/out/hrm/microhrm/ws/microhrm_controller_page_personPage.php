<?php

 /**
 * Controller class for "personPage" Page REST webservice.
 *
 * @since      4.7.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */

require_once('microhrm_controller.php');

class microhrm_controller_page_personPage extends microhrm_controller {

  public function __construct() {
	parent::__construct('page_personPage','person','personPage',1);
  }
}

