<?php
/**
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */
include_once 'microhrm_Field.php';
include_once 'microhrm_Relation.php';
class microhrm_Models {

	//Models instance static field
	private static $instance=null;

	//static function to access plugin model instance as singletone
	public static function get_instance() {
	  if (self::$instance==null) self::$instance = new microhrm_Models();
	  return self::$instance;
	}

	private $entities=[];
	private $pages=[];
	
	private function get_entity_person(){
		return include 'model/entity/person.php';
	}
	private function get_entity_blood(){
		return include 'model/entity/blood.php';
	}
	private function get_entity_edu(){
		return include 'model/entity/edu.php';
	}
	private function get_entity_building(){
		return include 'model/entity/building.php';
	}
	private function get_entity_shift(){
		return include 'model/entity/shift.php';
	}
	private function get_entity_insurance(){
		return include 'model/entity/insurance.php';
	}
	private function get_entity_asset(){
		return include 'model/entity/asset.php';
	}
	private function get_entity_assetCat(){
		return include 'model/entity/assetCat.php';
	}
	private function get_entity_employee(){
		return include 'model/entity/employee.php';
	}
	private function get_entity_ability(){
		return include 'model/entity/ability.php';
	}
	private function get_entity_job(){
		return include 'model/entity/job.php';
	}
	private function get_entity_workTime(){
		return include 'model/entity/workTime.php';
	}
	private function get_entity_jobCategory(){
		return include 'model/entity/jobCategory.php';
	}
	public function get_page_personPage(){
		return  include 'model/page/personPage.php';
	}
	public function get_page_blood(){
		return  include 'model/page/blood.php';
	}
	public function get_page_edu(){
		return  include 'model/page/edu.php';
	}
	public function get_page_building(){
		return  include 'model/page/building.php';
	}
	public function get_page_shift(){
		return  include 'model/page/shift.php';
	}
	public function get_page_insurance(){
		return  include 'model/page/insurance.php';
	}
	public function get_page_asset(){
		return  include 'model/page/asset.php';
	}
	public function get_page_assetCat(){
		return  include 'model/page/assetCat.php';
	}
	public function get_page_employee(){
		return  include 'model/page/employee.php';
	}
	public function get_page_ability(){
		return  include 'model/page/ability.php';
	}
	public function get_page_job(){
		return  include 'model/page/job.php';
	}
	public function get_page_workTime(){
		return  include 'model/page/workTime.php';
	}
	public function get_page_jobCategory(){
		return  include 'model/page/jobCategory.php';
	}
	public function get_page_diabled_employee(){
		return  include 'model/page/diabled_employee.php';
	}
	public static function get_admin_menus():array{
		$menus=array();
			$menus['microhrm']= include 'model/menu/microhrm.php';
		return $menus;
	}

	// Get entity model by key
	public static function get_entity($key): ?microhrm_Entity {
      $models=self::get_instance();
	  if (!$key) return null;
	  if (array_key_exists($key,$models->entities)) return $models->entities[$key];
	  $get_entity_func='get_entity_'.$key;
	  if (!method_exists($models,$get_entity_func)) return null;
	  $entity=$models->$get_entity_func();
	  $models->entities[$key]=$entity;
	  return $entity;
	}
	public static function get_page($key): ?microhrm_Page{
	  if (!$key) return null;
	  $models=self::get_instance();
	  if (array_key_exists($key,$models->pages)) return $models->pages[$key];
	  $get_page_func='get_page_'.$key;
	  if (!method_exists($models,$get_page_func)) return null;
	  $page=$models->$get_page_func();
	  $models->pages[$key]=$page;
	  return $page;
	}
	public static function get_pages(): array{
	  self::get_page('personPage');
	  self::get_page('blood');
	  self::get_page('edu');
	  self::get_page('building');
	  self::get_page('shift');
	  self::get_page('insurance');
	  self::get_page('asset');
	  self::get_page('assetCat');
	  self::get_page('employee');
	  self::get_page('ability');
	  self::get_page('job');
	  self::get_page('workTime');
	  self::get_page('jobCategory');
	  self::get_page('diabled_employee');
	  return self::get_instance()->pages;
  }
	public static function get_entities(): array{
	  self::get_entity('person');
	  self::get_entity('blood');
	  self::get_entity('edu');
	  self::get_entity('building');
	  self::get_entity('shift');
	  self::get_entity('insurance');
	  self::get_entity('asset');
	  self::get_entity('assetCat');
	  self::get_entity('employee');
	  self::get_entity('ability');
	  self::get_entity('job');
	  self::get_entity('workTime');
	  self::get_entity('jobCategory');
	  return self::get_instance()->entities;
  }
}
