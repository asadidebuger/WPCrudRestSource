<?php
/**
 * 
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */

class microhrm_field_type_datetime extends microhrm_field_type {
    public function __construct() {
        parent::__construct('datetime','date-picker','DATETIME','');
		$this->url_js="https://cdn.jsdelivr.net/npm/moment,https://cdn.jsdelivr.net/npm/moment-jalaali@0.9.2/build/moment-jalaali.js,https://cdn.jsdelivr.net/npm/vue-persian-datetime-picker@2.10.4/dist/vue-persian-datetime-picker.umd.min.js";
		$this->component="DatePicker: VuePersianDatetimePicker";
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
			type=\"datetime\"
			format=\"YYYY/MM/DD HH:mm:ss\"
			:clearable=\"true\"
			locale=\"en,fa\"
			:disabled=\"mode==='view'\"
			auto-submit
			:locale-config=\"{ fa: {  displayFormat: 'jYYYY/jMM/jDD HH:mm:ss', lang: { label: 'شمسی' } },  en: { displayFormat: 'YYYY/MM/DD HH:mm:ss', lang: { label: 'Gregorian' } }  }\"
			$rules";
	}
	public function from_db_func($item,$key,$value){ 
	 if($value=='0000-00-00 00:00:00') return null;
return $value; 
	}
}
