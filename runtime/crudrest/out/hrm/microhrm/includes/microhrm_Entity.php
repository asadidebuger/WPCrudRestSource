<?php
/**
 * Class for entity.
 *
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */

include_once 'microhrm_FieldBase.php';
include_once 'microhrm_Field.php';
include_once 'microhrm_Relation.php';
include_once 'microhrm_field_type.php';
class microhrm_Entity {
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
  public function get_relation($key): ?microhrm_Relation{
	if (array_key_exists($key, $this->relations)) return $this->relations[$key];
	return null;
  }
  public function get_field($key): ?microhrm_FieldBase{
	if (array_key_exists($key, $this->fields)) return $this->fields[$key];
	if (array_key_exists($key, $this->relations)) return $this->relations[$key];
	return null;
  }
  public function get_field_type($key): ?microhrm_field_type{
	return microhrm_field_type::get($this->get_field($key)->type);
  }
}
