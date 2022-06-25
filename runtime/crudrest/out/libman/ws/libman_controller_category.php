<?php

 /**
 * Controller class for "category" REST webservice.
 *
 * @since      4.7.0
 * @package    libman
 * @author     Mohammadreza Asadi	https://mdse.ui.ac.ir/fa/member/%D9%85%D8%AD%D9%85%D8%AF%D8%B1%D8%B6%D8%A7-%D8%A7%D8%B3%D8%AF%DB%8C/
 */

require_once('libman_controller.php');

class libman_controller_category extends  libman_controller {

  public function __construct() {
	parent::__construct('category','category',null,1);
  }
 
}

