<?php
/**
 * 
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */

class microhrm_field_type_checkBox extends microhrm_field_type {
    public function __construct() {
        parent::__construct('checkBox','v-checkbox','BOOLEAN','');
    }
	public function get_props_func($page,$field,$key){
	   $rules=':rules="[';
if($field->required){
$is_required=__('is required!');
$rules.= "v => v!==null || '$field->label $is_required',";
}
$rules.=']"';
return  "label=\"$field->label\"
			:style=\"page.formView.fieldsLayouts.$field->key.style\"
		 	v-model=\"item.$key\"
			:disabled=\"mode==='view'\"
			$rules
			";
	}
	public function from_db_func($item,$key,$value){ 
	 if (!$value)return '';
return $value==1?true:false; 
	}
	public function to_db_func($item,$key,$value){ 
	 if (!$value) return null;
return $value==true? 1:2; 
	}
}
