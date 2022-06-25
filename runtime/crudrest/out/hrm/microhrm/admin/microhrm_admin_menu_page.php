<?php

/**
 * The admin-menu-pages functionality of the plugin.
 *
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */
class microhrm_admin_menu_page {

  private $slug;

  public function __construct($slug)
  {
	$this->slug = $slug;
  }
  public function render(){

	include 'partials/microhrm-admin-page-menu.php';
  }
}

	
