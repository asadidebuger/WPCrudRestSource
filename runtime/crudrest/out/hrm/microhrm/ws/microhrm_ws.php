<?php
/**
 *
 * @since      4.7.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 **/
require 'microhrm_controller_person.php';
require 'microhrm_controller_blood.php';
require 'microhrm_controller_edu.php';
require 'microhrm_controller_building.php';
require 'microhrm_controller_shift.php';
require 'microhrm_controller_insurance.php';
require 'microhrm_controller_asset.php';
require 'microhrm_controller_assetCat.php';
require 'microhrm_controller_employee.php';
require 'microhrm_controller_ability.php';
require 'microhrm_controller_job.php';
require 'microhrm_controller_workTime.php';
require 'microhrm_controller_jobCategory.php';
require 'microhrm_controller_page_personPage.php';
require 'microhrm_controller_page_blood.php';
require 'microhrm_controller_page_edu.php';
require 'microhrm_controller_page_building.php';
require 'microhrm_controller_page_shift.php';
require 'microhrm_controller_page_insurance.php';
require 'microhrm_controller_page_asset.php';
require 'microhrm_controller_page_assetCat.php';
require 'microhrm_controller_page_employee.php';
require 'microhrm_controller_page_ability.php';
require 'microhrm_controller_page_job.php';
require 'microhrm_controller_page_workTime.php';
require 'microhrm_controller_page_jobCategory.php';
require 'microhrm_controller_page_diabled_employee.php';
require 'microhrm_page_controller.php';
require 'microhrm_extend_controller.php';
require 'microhrm_options_controller.php';
class microhrm_ws{
 private $person;
 private $blood;
 private $edu;
 private $building;
 private $shift;
 private $insurance;
 private $asset;
 private $assetCat;
 private $employee;
 private $ability;
 private $job;
 private $workTime;
 private $jobCategory;
 private $page_personPage;
 private $page_blood;
 private $page_edu;
 private $page_building;
 private $page_shift;
 private $page_insurance;
 private $page_asset;
 private $page_assetCat;
 private $page_employee;
 private $page_ability;
 private $page_job;
 private $page_workTime;
 private $page_jobCategory;
 private $page_diabled_employee;
 private $page_controller;
 private $extend_controller;
 private $options_controller;

  public function __construct(){
	$this->person=new microhrm_controller_person();
	$this->blood=new microhrm_controller_blood();
	$this->edu=new microhrm_controller_edu();
	$this->building=new microhrm_controller_building();
	$this->shift=new microhrm_controller_shift();
	$this->insurance=new microhrm_controller_insurance();
	$this->asset=new microhrm_controller_asset();
	$this->assetCat=new microhrm_controller_assetCat();
	$this->employee=new microhrm_controller_employee();
	$this->ability=new microhrm_controller_ability();
	$this->job=new microhrm_controller_job();
	$this->workTime=new microhrm_controller_workTime();
	$this->jobCategory=new microhrm_controller_jobCategory();
	$this->page_personPage=new microhrm_controller_page_personPage();
	$this->page_blood=new microhrm_controller_page_blood();
	$this->page_edu=new microhrm_controller_page_edu();
	$this->page_building=new microhrm_controller_page_building();
	$this->page_shift=new microhrm_controller_page_shift();
	$this->page_insurance=new microhrm_controller_page_insurance();
	$this->page_asset=new microhrm_controller_page_asset();
	$this->page_assetCat=new microhrm_controller_page_assetCat();
	$this->page_employee=new microhrm_controller_page_employee();
	$this->page_ability=new microhrm_controller_page_ability();
	$this->page_job=new microhrm_controller_page_job();
	$this->page_workTime=new microhrm_controller_page_workTime();
	$this->page_jobCategory=new microhrm_controller_page_jobCategory();
	$this->page_diabled_employee=new microhrm_controller_page_diabled_employee();
	$this->page_controller=new microhrm_page_controller();
	$this->extend_controller=new microhrm_extend_controller();
	$this->options_controller=new microhrm_options_controller();
	add_action( 'rest_api_init',array($this,'init_routes'),90 );
  }

 /**
 * REST webservice enabler.
 */
  public function init_routes(){
	$this->person->register_routes();
	$this->blood->register_routes();
	$this->edu->register_routes();
	$this->building->register_routes();
	$this->shift->register_routes();
	$this->insurance->register_routes();
	$this->asset->register_routes();
	$this->assetCat->register_routes();
	$this->employee->register_routes();
	$this->ability->register_routes();
	$this->job->register_routes();
	$this->workTime->register_routes();
	$this->jobCategory->register_routes();
	$this->page_personPage->register_routes();
	$this->page_blood->register_routes();
	$this->page_edu->register_routes();
	$this->page_building->register_routes();
	$this->page_shift->register_routes();
	$this->page_insurance->register_routes();
	$this->page_asset->register_routes();
	$this->page_assetCat->register_routes();
	$this->page_employee->register_routes();
	$this->page_ability->register_routes();
	$this->page_job->register_routes();
	$this->page_workTime->register_routes();
	$this->page_jobCategory->register_routes();
	$this->page_diabled_employee->register_routes();
	$this->page_controller->register_routes();
	$this->extend_controller->register_routes();
	$this->options_controller->register_routes();
  }
}

