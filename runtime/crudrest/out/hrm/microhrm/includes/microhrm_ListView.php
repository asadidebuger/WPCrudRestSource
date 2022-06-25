<?php
/**
 * Class for ListView (grid view) configuration.
 *
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */
include_once 'microhrm_Models.php';
include_once 'microhrm_Field.php';
include_once 'microhrm_Relation.php';
class microhrm_ListView {
  public $props= array('createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>false,'deleteButton'=>true,'itemsPerPage'=>10);
  public $columns= array();
  public $searchable= array();
  public $sortable= array();
  public $bulk= array();
  public $entity_key,$title,$where;

  public function __construct($entity_key,$title,$columns,$sortableColumns,$searchableColumns,$props=null,$bulkActions=null,$where=null)
  {
    if ($props!=null)$this->props=$props;
    if($bulkActions!=null) $this->bulk=$bulkActions;
    else if ($bulkActions==null&&$this->props['deleteButton'])$this->bulk=['delete'=>['title'=>'Remove All','icon'=>'trash']]; 
    $this->entity_key=$entity_key;
    $this->title=$title;
    $this->props=$props;
    $this->columns=$columns;
    $this->sortable=$sortableColumns;
    $this->searchable=$searchableColumns;
    $this->where=$where;
  }
 
  public function getEntity(){
	return microhrm_Models::get_entity($this->entity_key);
  }
}
