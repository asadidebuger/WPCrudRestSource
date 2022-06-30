<?php
/**
 * 
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */

class microhrm_field_type_gender extends microhrm_field_type {
    public function __construct() {
        parent::__construct('gender','v-select','INT','(2) UNSIGNED');
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
					:items=\"['Male','Female']\"
					:multiple=\"false\"
					:clearable=\"true\"
					:disabled=\"mode==='view'\"
					$rules";
	}
	public function from_db_func($item,$key,$value){ 
	 if (!$value)return '';
return $value==1?'Male':'Female'; 
	}
	public function to_db_func($item,$key,$value){ 
	 if (!$value) return null;
return $value=='Male'? 1:2; 
	}
}
