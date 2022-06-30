<?php
/**
 * Base class for Fields and Relations.
 *
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */

class microhrm_FieldBase
{
  public $key;
  public $label='';
  public $index=false;
  public $unique=false;
  public $required=false;
  public $type='';

  public function __construct($key,$type,$label,$index,$unique,$required)
  {
    $this->key=$key;
	$this->type=$type;
    $this->label=$label;
    $this->index=$index;
    $this->unique=$unique;
    $this->required=$required;
  }
  public function getFieldType(): microhrm_field_type
  {
     return microhrm_field_type::get($this->type);
  }
}
