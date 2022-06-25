<?php

/**
 * The admin-menu-pages functionality of the plugin.
 *
 * @since      1.0.0
 * @package    libman
 * @author     Mohammadreza Asadi	https://mdse.ui.ac.ir/fa/member/%D9%85%D8%AD%D9%85%D8%AF%D8%B1%D8%B6%D8%A7-%D8%A7%D8%B3%D8%AF%DB%8C/
 */
class libman_admin_menu_page {

  private $slug;

  public function __construct($slug)
  {
	$this->slug = $slug;
  }
  public function render(){

	include 'partials/libman-admin-page-menu.php';
  }
}

	
