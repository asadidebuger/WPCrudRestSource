<?php
/**
 * 
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */

class microhrm_field_type_nationalCode extends microhrm_field_type {
    public function __construct() {
        parent::__construct('nationalCode','v-text-field','VARCHAR','(10)');
    }
	public function get_props_func($page,$field,$key){
	   $rules=':rules="[';
if($field->required){
$is_required=__('is required!');
$rules.= "v => !!v || '$field->label $is_required',";
}
$invalid=__('is invalid!');
$rules.= "v => !v || /^[0-9]{10,10}$/.test(v) || '$field->label $invalid',";
$rules.=']"';
return  "label=\"$field->label\"
			:style=\"page.formView.fieldsLayouts.$field->key.style\"
		 	v-model=\"item.$key\"
			:clearable=\"true\"
			:disabled=\"mode==='view'\"
			$rules ";
	}
	public function get_search_expression($key,$value){ 
	 return "$key LIKE '%$value%'"; 
	}
}
