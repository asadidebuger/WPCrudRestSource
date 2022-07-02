<?php
/**
 * 
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */
require_once('fieldtype/microhrm_field_type_id.php');
require_once('fieldtype/microhrm_field_type_relation.php');
require_once('fieldtype/microhrm_field_type_text.php');
require_once('fieldtype/microhrm_field_type_int.php');
require_once('fieldtype/microhrm_field_type_checkBox.php');
require_once('fieldtype/microhrm_field_type_gender.php');
require_once('fieldtype/microhrm_field_type_date.php');
require_once('fieldtype/microhrm_field_type_datetime.php');
require_once('fieldtype/microhrm_field_type_time.php');
require_once('fieldtype/microhrm_field_type_nationalCode.php');
require_once('fieldtype/microhrm_field_type_mobile.php');
require_once('fieldtype/microhrm_field_type_title.php');
require_once('fieldtype/microhrm_field_type_email.php');
require_once('fieldtype/microhrm_field_type_phone.php');

class microhrm_field_type {

  public $key,$tag,$url_js,$url_css,$from_db_func,$to_db_func,$get_props_func,$component,$db_field_type,$db_field_expression;
  
  public function __construct($key,$tag,$db_field_type,$db_field_expression)
  {
    $this->key=$key;
    $this->db_field_type=$db_field_type;
    $this->db_field_expression=$db_field_expression;
    $this->tag=$tag;
    $this->get_props_func=function ($page,$field,$key){return "label=\"$field->label\" :style=\"page.formView.fieldsLayouts.$field->key.style\" v-model=\"item.$key\"";};
  }
  public function get_params($page,$field,$key):string
  {
	if (!$this->get_props_func) return '';
	return $this->get_props_func->call($this,$page,$field,$key);
  }
  public function to_db($item,$key,$value)
  {
    if (!$this->to_db_func) return $value;
	return $this->to_db_func->call($this,$item,$key,$value);
  }
  public function from_db($item,$key,$value)
  {
    if (!$this->from_db_func) return $value;
	return $this->from_db_func->call($this,$item,$key,$value);
  }
  private static array $field_types=array();
  public static function init()
  {
	if (count(self::$field_types)>0)return;
	self::$field_types['id']=new microhrm_field_type_id();
	self::$field_types['relation']=new microhrm_field_type_relation();
	self::$field_types['text']=new microhrm_field_type_text();
	self::$field_types['int']=new microhrm_field_type_int();
	self::$field_types['checkBox']=new microhrm_field_type_checkBox();
	self::$field_types['gender']=new microhrm_field_type_gender();
	self::$field_types['date']=new microhrm_field_type_date();
	self::$field_types['datetime']=new microhrm_field_type_datetime();
	self::$field_types['time']=new microhrm_field_type_time();
	self::$field_types['nationalCode']=new microhrm_field_type_nationalCode();
	self::$field_types['mobile']=new microhrm_field_type_mobile();
	self::$field_types['title']=new microhrm_field_type_title();
	self::$field_types['email']=new microhrm_field_type_email();
	self::$field_types['phone']=new microhrm_field_type_phone();
  }
  public static function get($key):microhrm_field_type {
    self::init();
    return self::$field_types[$key];
  }
}
