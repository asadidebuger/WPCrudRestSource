<?php

 /**
 * Controller class for "member" Page REST webservice.
 *
 * @since      4.7.0
 * @package    libman
 * @author     Mohammadreza Asadi	https://mdse.ui.ac.ir/fa/member/%D9%85%D8%AD%D9%85%D8%AF%D8%B1%D8%B6%D8%A7-%D8%A7%D8%B3%D8%AF%DB%8C/
 */

require_once('libman_controller.php');

class libman_controller_page_member extends libman_controller {

  public function __construct() {
	parent::__construct('page_member','member','member',1);
  }
}

