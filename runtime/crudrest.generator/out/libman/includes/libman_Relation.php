<?php
/**
 * Class for Entity's Relations.
 *
 * @since      1.0.0
 * @package    libman
 * @author     Mohammadreza Asadi	https://mdse.ui.ac.ir/fa/member/%D9%85%D8%AD%D9%85%D8%AF%D8%B1%D8%B6%D8%A7-%D8%A7%D8%B3%D8%AF%DB%8C/
 */
include_once 'libman_FieldBase.php';
include_once 'libman_Entity.php';
class libman_Relation extends libman_FieldBase
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

