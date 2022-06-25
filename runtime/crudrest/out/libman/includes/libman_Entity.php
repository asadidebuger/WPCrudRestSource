<?php
/**
 * Class for entity.
 *
 * @since      1.0.0
 * @package    libman
 * @author     Mohammadreza Asadi	https://mdse.ui.ac.ir/fa/member/%D9%85%D8%AD%D9%85%D8%AF%D8%B1%D8%B6%D8%A7-%D8%A7%D8%B3%D8%AF%DB%8C/
 */

include_once 'libman_FieldBase.php';
include_once 'libman_Field.php';
include_once 'libman_Relation.php';
include_once 'libman_field_type.php';
class libman_Entity {
  public $fields=[];
  public $relations=[];
  public $key, $label='', $plural='', $title_script='';

  public function __construct($key,$label,$plural,$title_script=null)
  {
    $this->key=$key;
    $this->label=$label;
    $this->plural=$plural;
	$this->title_script=$title_script;
  }
  public function get_all_fields_key():array{
    $all=array();
    foreach ($this->fields as $key=>$field) $all[$key]=$key;
    foreach ($this->relations as $key=>$field) $all[$key]=$key;
    return $all;
  }
  public function get_in_title_fields_key():array{
	$fields=$this->get_all_fields_key();
	$fields_to_select= array();
	foreach( $fields as $field ) {
	  if (strpos($this->title_script, $field) != false) {
		$fields_to_select[]=$field;
	  }
	}
	return $fields_to_select;
  }
  public function add_field($key,$field){
    $this->fields[$key]=$field;
  }
  public function set_fields($fields){
	$this->fields=$fields;
  }
  public function add_relation($key,$relation){
	$this->relations[$key]=$relation;
  }
  public function get_relation($key): ?libman_Relation{
	if (array_key_exists($key, $this->relations)) return $this->relations[$key];
	return null;
  }
  public function get_field($key): ?libman_FieldBase{
	if (array_key_exists($key, $this->fields)) return $this->fields[$key];
	if (array_key_exists($key, $this->relations)) return $this->relations[$key];
	return null;
  }
  public function get_field_type($key): ?libman_field_type{
	return libman_field_type::get($this->get_field($key)->type);
  }
}
