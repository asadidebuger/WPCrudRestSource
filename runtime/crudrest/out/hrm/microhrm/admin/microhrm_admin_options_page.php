<?php

/**
 * The options page functionality of the plugin.
 *
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */
class microhrm_admin_options_page {

  private $slug;
  private $title;

  public function __construct($slug,$title) {
	$this->slug = $slug;
	$this->title = $title;
  }

  public function render(){

	include 'partials/microhrm-admin-options-page.php';
  }
}

	
