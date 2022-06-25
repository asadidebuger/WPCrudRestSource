<?php
/**
 * Base class for Fields and Relations.
 *
 * @since      1.0.0
 * @package    libman
 * @author     Mohammadreza Asadi	https://mdse.ui.ac.ir/fa/member/%D9%85%D8%AD%D9%85%D8%AF%D8%B1%D8%B6%D8%A7-%D8%A7%D8%B3%D8%AF%DB%8C/
 */

class libman_FieldBase
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
}
