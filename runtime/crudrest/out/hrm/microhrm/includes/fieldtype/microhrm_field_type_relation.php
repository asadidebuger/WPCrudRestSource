<?php
/**
 * 
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */

class microhrm_field_type_relation extends microhrm_field_type {
    public function __construct() {
        parent::__construct('relation','v-autocomplete','INT','(11) UNSIGNED');
    }
	public function get_props_func($page,$field,$key){
	   $rules=':rules="[';
if($field->required){
$is_required=__('is required!');
$rules.= "v => !!v || '$field->label $is_required',";
}
$rules.=']"';

return "label=\"$field->label\"
				  :style=\"page.formView.fieldsLayouts.$field->key.style\"
				  v-model=\"item.$key\"
				  :items=\"rData.$key\"
				  :loading=\"!rData.$key\"
				  :item-text=\"(item)=>resolveRelationTitle('$key',item)\"
				  :item-value=\"(item)=>item.id\"
				  :multiple=\"page.entity.relations.$key.many \"
				  :clearable=\"true\"
				  $rules
				  :disabled=\"mode==='view'\"";
	}
	public function from_db_func($item,$key,$value){ 
	 return $value; 
	}
	public function to_db_func($item,$key,$value){ 
	 	  if(is_array($value)){
	    if (array_key_exists('id',$value)) return $value["id"]?(int)$value["id"]:"";
	    $ids=array();
	    foreach ($value as $val){
		  if(is_array($val))$ids[]=(int)$val["id"];
		  else $ids[]=(int)$val;
		}
	    return $ids;
	  }
		return $value?(int)$value:''; 
	}
}
