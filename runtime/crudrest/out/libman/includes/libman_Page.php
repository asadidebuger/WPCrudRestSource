<?php
/**
 * Class for Page configuration.
 *
 * @since      1.0.0
 * @package    libman
 * @author     Mohammadreza Asadi	https://mdse.ui.ac.ir/fa/member/%D9%85%D8%AD%D9%85%D8%AF%D8%B1%D8%B6%D8%A7-%D8%A7%D8%B3%D8%AF%DB%8C/
 */
include_once 'libman_Models.php';
include_once 'libman_FormView.php';
include_once 'libman_ListView.php';
class libman_Page {

  public $key,$title,$entity_key,$listView,$formView;

  public function __construct($key,$entity_key,$title)
  {
	$this->key=$key;
    $this->entity_key=$entity_key;
    $this->title=$title;
  }
  public function set_formView($fieldsLayouts){
    $this->formView=new libman_FormView($this->entity_key,$fieldsLayouts);
  }
  public function set_listView($columns,$sortableColumns,$searchableColumns,$props=null,$bulkActions=null,$where=null){
    $this->listView=new libman_ListView($this->entity_key,$this->title,$columns,$sortableColumns,$searchableColumns,$props,$bulkActions,$where);
  }
  public function renderList(){
	if (array_key_exists('id',$_REQUEST) && $_REQUEST["id"]) include  libman_PATH.'admin/partials/libman-admin-page-form.php';
	else include  libman_PATH.'admin/partials/libman-admin-page-list.php';
  }
  public function get_form_view():libman_FormView{
    return $this->formView;
  }
  public function get_list_view():libman_ListView{
    return $this->listView;
  }
  public function get_entity():libman_Entity{
	return libman_Models::get_entity($this->entity_key);
  }
}
