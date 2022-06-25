<?php
/**
 * Class for Entity's Relations.
 *
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */
include_once 'microhrm_FieldBase.php';
include_once 'microhrm_Entity.php';
class microhrm_Relation extends microhrm_FieldBase
{
  public $many;
  public $entity;
  public $opposite;
  public $join_table;
  public $join_s_key;
  public $join_t_key;

  public function __construct($key,$entity,$opposite,$join_table,$join_s_key,$join_t_key,$label,$many,$index,$unique,$required=false)
  {
	parent::__construct($key,'relation',$label,$index,$unique,$required);
    $this->many=$many;
    $this->entity=$entity;
    $this->opposite=$opposite;
    $this->join_table=$join_table;
    $this->join_t_key=$join_t_key;
    $this->join_s_key=$join_s_key;
  }

}

