<?php

 /**
 * Controller class for "assetCat" REST webservice.
 *
 * @since      4.7.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */

require_once('microhrm_controller.php');

class microhrm_controller_assetCat extends  microhrm_controller {

  public function __construct() {
	parent::__construct('assetCat','assetCat',null,1);
  }
 
}
