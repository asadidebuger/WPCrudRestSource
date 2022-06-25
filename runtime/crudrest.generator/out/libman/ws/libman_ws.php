<?php
/**
 *
 * @since      4.7.0
 * @package    libman
 * @author     Mohammadreza Asadi	https://mdse.ui.ac.ir/fa/member/%D9%85%D8%AD%D9%85%D8%AF%D8%B1%D8%B6%D8%A7-%D8%A7%D8%B3%D8%AF%DB%8C/
 **/
require 'libman_controller_book.php';
require 'libman_controller_member.php';
require 'libman_controller_publisher.php';
require 'libman_controller_borrow.php';
require 'libman_controller_category.php';
require 'libman_controller_writer.php';
require 'libman_controller_page_member.php';
require 'libman_controller_page_book.php';
require 'libman_controller_page_publisher.php';
require 'libman_controller_page_borrow.php';
require 'libman_controller_page_category.php';
require 'libman_controller_page_writer.php';
require 'libman_page_controller.php';
require 'libman_extend_controller.php';
require 'libman_options_controller.php';
class libman_ws{
 private $book;
 private $member;
 private $publisher;
 private $borrow;
 private $category;
 private $writer;
 private $page_member;
 private $page_book;
 private $page_publisher;
 private $page_borrow;
 private $page_category;
 private $page_writer;
 private $page_controller;
 private $extend_controller;
 private $options_controller;

  public function __construct(){
	$this->book=new libman_controller_book();
	$this->member=new libman_controller_member();
	$this->publisher=new libman_controller_publisher();
	$this->borrow=new libman_controller_borrow();
	$this->category=new libman_controller_category();
	$this->writer=new libman_controller_writer();
	$this->page_member=new libman_controller_page_member();
	$this->page_book=new libman_controller_page_book();
	$this->page_publisher=new libman_controller_page_publisher();
	$this->page_borrow=new libman_controller_page_borrow();
	$this->page_category=new libman_controller_page_category();
	$this->page_writer=new libman_controller_page_writer();
	$this->page_controller=new libman_page_controller();
	$this->extend_controller=new libman_extend_controller();
	$this->options_controller=new libman_options_controller();
	add_action( 'rest_api_init',array($this,'init_routes'),90 );
  }

 /**
 * REST webservice enabler.
 */
  public function init_routes(){
	$this->book->register_routes();
	$this->member->register_routes();
	$this->publisher->register_routes();
	$this->borrow->register_routes();
	$this->category->register_routes();
	$this->writer->register_routes();
	$this->page_member->register_routes();
	$this->page_book->register_routes();
	$this->page_publisher->register_routes();
	$this->page_borrow->register_routes();
	$this->page_category->register_routes();
	$this->page_writer->register_routes();
	$this->page_controller->register_routes();
	$this->extend_controller->register_routes();
	$this->options_controller->register_routes();
  }
}

