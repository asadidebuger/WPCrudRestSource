<?php
/**
 * 
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */

class microhrm_field_type_email extends microhrm_field_type {
    public function __construct() {
        parent::__construct('email','v-text-field','VARCHAR','(30)');
    }
	public function get_props_func($page,$field,$key){
	   $rules=':rules="[';
if($field->required){
$is_required=__('is required!');
$rules.= "v => !!v || '$field->label $is_required',";
}
$invalid=__('is invalid!');
$rules.= "v => !v || /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(v) || '$field->label $invalid',";
$rules.=']"';
return  "label=\"$field->label\"
			:style=\"page.formView.fieldsLayouts.$field->key.style\"
		 	v-model=\"item.$key\"
			:clearable=\"true\"
			:disabled=\"mode==='view'\"
			$rules ";
	}
}
