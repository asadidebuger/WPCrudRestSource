<?php
/**
 * 
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */

class microhrm_field_type_text extends microhrm_field_type {
    public function __construct() {
        parent::__construct('text','v-text-field','TEXT','');
    }
	public function get_props_func($page,$field,$key){
	   $rules=':rules="[';
if($field->required){
$is_required=__('is required!');
$rules.= "v => !!v || '$field->label $is_required',";
}
$rules.=']"';
return  "label=\"$field->label\"
			:style=\"page.formView.fieldsLayouts.$field->key.style\"
		 	v-model=\"item.$key\"
			:clearable=\"true\"
			:disabled=\"mode==='view'\"
			$rules
			";
	}
	public function get_search_expression($key,$value){ 
	 return "$key LIKE '%$value%'"; 
	}
}
