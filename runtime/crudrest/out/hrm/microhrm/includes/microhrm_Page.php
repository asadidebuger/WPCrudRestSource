<?php
/**
 * Class for Page configuration.
 *
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */
include_once 'microhrm_Models.php';
include_once 'microhrm_FormView.php';
include_once 'microhrm_ListView.php';
class microhrm_Page {

  public $key,$title,$entity_key,$listView,$formView;

  public function __construct($key,$entity_key,$title)
  {
	$this->key=$key;
    $this->entity_key=$entity_key;
    $this->title=$title;
  }
  public function set_formView($fieldsLayouts){
    $this->formView=new microhrm_FormView($this->entity_key,$fieldsLayouts);
  }
  public function set_listView($columns,$sortableColumns,$searchableColumns,$props=null,$bulkActions=null,$where=null){
    $this->listView=new microhrm_ListView($this->entity_key,$this->title,$columns,$sortableColumns,$searchableColumns,$props,$bulkActions,$where);
  }
  public function renderList(){
	if (array_key_exists('id',$_REQUEST) && $_REQUEST["id"]) include  microhrm_PATH.'admin/partials/microhrm-admin-page-form.php';
	else include  microhrm_PATH.'admin/partials/microhrm-admin-page-list.php';
  }
  public function get_form_view():microhrm_FormView{
    return $this->formView;
  }
  public function get_list_view():microhrm_ListView{
    return $this->listView;
  }
  public function get_entity():microhrm_Entity{
	return microhrm_Models::get_entity($this->entity_key);
  }
}
