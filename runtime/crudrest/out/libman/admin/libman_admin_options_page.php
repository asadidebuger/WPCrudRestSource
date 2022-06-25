<?php

/**
 * The options page functionality of the plugin.
 *
 * @since      1.0.0
 * @package    libman
 * @author     Mohammadreza Asadi	https://mdse.ui.ac.ir/fa/member/%D9%85%D8%AD%D9%85%D8%AF%D8%B1%D8%B6%D8%A7-%D8%A7%D8%B3%D8%AF%DB%8C/
 */
class libman_admin_options_page {

  private $slug;
  private $title;

  public function __construct($slug,$title) {
	$this->slug = $slug;
	$this->title = $title;
  }

  public function render(){

	include 'partials/libman-admin-options-page.php';
  }
}

	
