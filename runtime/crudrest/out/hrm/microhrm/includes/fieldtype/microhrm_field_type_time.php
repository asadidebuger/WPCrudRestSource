<?php
/**
 * 
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */

class microhrm_field_type_time extends microhrm_field_type {
    public function __construct() {
        parent::__construct('time','date-picker','TIME','');
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
			type=\"time\"
			format=\"HH:mm:ss\"
			:clearable=\"true\"
			locale=\"en,fa\"
			:disabled=\"mode==='view'\"
			auto-submit
			:locale-config=\"{ fa: { lang: { label: 'شمسی' } },  en: { lang: { label: 'Gregorian' } }  }\"
			$rules";
	}
	public function from_db_func($item,$key,$value){ 
	 if($value=='00:00:00') return null;
return $value; 
	}
}