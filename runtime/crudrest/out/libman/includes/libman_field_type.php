<?php
/**
 * 
 * @since      1.0.0
 * @package    libman
 * @author     Mohammadreza Asadi	https://mdse.ui.ac.ir/fa/member/%D9%85%D8%AD%D9%85%D8%AF%D8%B1%D8%B6%D8%A7-%D8%A7%D8%B3%D8%AF%DB%8C/
 */

class libman_field_type {

  public $key,$tag,$url_js,$url_css,$from_db_func,$to_db_func,$get_props_func,$component;
  
  public function __construct($key,$tag)
  {
    $this->key=$key;
    $this->tag=$tag;
    $this->get_props_func=function ($page,$field,$key){return "label=\"$field->label\" :style=\"page.formView.fieldsLayouts.$field->key.style\" v-model=\"item.$key\"";};
  }
  public function get_params($page,$field,$key):string
  {
	if (!$this->get_props_func) return '';
	return $this->get_props_func->call($this,$page,$field,$key);
  }
  public function to_db($item,$key,$value)
  {
    if (!$this->to_db_func) return $value;
	return $this->to_db_func->call($this,$item,$key,$value);
  }
  public function from_db($item,$key,$value)
  {
    if (!$this->from_db_func) return $value;
	return $this->from_db_func->call($this,$item,$key,$value);
  }
  private static $field_types=array();
  public static function init()
  {
	if (count(self::$field_types)>0)return;

	$relation=new libman_field_type('relation','v-autocomplete');
	$relation->get_props_func=function ($page,$field,$key){
	  return "label=\"$field->label\"
				  :style=\"page.formView.fieldsLayouts.$field->key.style\"
				  v-model=\"item.$key\"
				  :items=\"rData.$key\"
				  :loading=\"!rData.$key\"
				  :item-text=\"(item)=>resolveRelationTitle('$key',item)\"
				  :item-value=\"(item)=>item.id\"
				  :multiple=\"page.entity.relations.$key.many \"
				  :clearable=\"true\"
				  :disabled=\"mode==='view'\"";
	};
	$relation->from_db_func=function($item,$key,$value){
		 return $value;
	};
	$relation->to_db_func=function($item,$key,$value){
	  if(is_array($value)){
	    if (array_key_exists('id',$value)) return $value["id"]?(int)$value["id"]:"";
	    $ids=array();
	    foreach ($value as $val){
		  if(is_array($val))$ids[]=(int)$val["id"];
		  else $ids[]=(int)$val;
		}
	    return $ids;
	  }
		return $value?(int)$value:'';;
	};
	self::$field_types['relation']=$relation;

	$text=new libman_field_type('text','v-text-field');
	$text->get_props_func=function ($page,$field,$key){
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
	};


	self::$field_types['text']=$text;

	$int=new libman_field_type('int','v-text-field');
	$int->get_props_func=function ($page,$field,$key){
	   $rules=':rules="[';
if($field->required){
$is_required=__('is required!');
$rules.= "v => !!v || '$field->label $is_required',";
}
$invalid=__('is invalid!');
$rules.= "v => !v || /[0-9]+/.test(v) || '$field->label $invalid',";
$rules.=']"';

return  "label=\"$field->label\"
			:style=\"page.formView.fieldsLayouts.$field->key.style\"
		 	v-model=\"item.$key\"
			:clearable=\"true\"
			:disabled=\"mode==='view'\"
			type=\"number\"
			$rules
			";
	};


	self::$field_types['int']=$int;

	$checkBox=new libman_field_type('checkBox','v-checkbox');
	$checkBox->get_props_func=function ($page,$field,$key){
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
	};
	$checkBox->from_db_func=function($item,$key,$value){ 
		 if (!$value)return '';
return $value==1?true:false; 
	};
	$checkBox->to_db_func=function($item,$key,$value){ 
		 if (!$value) return null;
return $value==true? 1:2; 
	};
	self::$field_types['checkBox']=$checkBox;

	$gender=new libman_field_type('gender','v-select');
	$gender->get_props_func=function ($page,$field,$key){
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
	};
	$gender->from_db_func=function($item,$key,$value){ 
		 if (!$value)return '';
return $value==1?'Male':'Female'; 
	};
	$gender->to_db_func=function($item,$key,$value){ 
		 if (!$value) return null;
return $value=='Male'? 1:2; 
	};
	self::$field_types['gender']=$gender;

	$date=new libman_field_type('date','date-picker');
	$date->url_js="https://cdn.jsdelivr.net/npm/moment,https://cdn.jsdelivr.net/npm/moment-jalaali@0.9.2/build/moment-jalaali.js,https://cdn.jsdelivr.net/npm/vue-persian-datetime-picker@2.10.4/dist/vue-persian-datetime-picker.umd.min.js";
	$date->component="DatePicker: VuePersianDatetimePicker";
	$date->get_props_func=function ($page,$field,$key){
	   $rules=':rules="[';
if($field->required){
$is_required=__('is required!');
$rules.= "v => !!v || '$field->label $is_required',";
}
$rules.=']"';
return "label=\"$field->label\"
			:style=\"page.formView.fieldsLayouts.$field->key.style\"
		 	v-model=\"item.$key\"
			format=\"YYYY/MM/DD\"
			:clearable=\"true\"
			locale=\"en,fa\"
			:disabled=\"mode==='view'\"
			auto-submit
			:locale-config=\"{ fa: {  displayFormat: 'jYYYY/jMM/jDD', lang: { label: 'شمسی' } },  en: { displayFormat: 'YYYY/MM/DD', lang: { label: 'Gregorian' } }  }\"
			$rules";
	};
	$date->from_db_func=function($item,$key,$value){ 
		 if($value=='0000-00-00') return null;
return $value; 
	};

	self::$field_types['date']=$date;

	$datetime=new libman_field_type('datetime','date-picker');
	$datetime->url_js="https://cdn.jsdelivr.net/npm/moment,https://cdn.jsdelivr.net/npm/moment-jalaali@0.9.2/build/moment-jalaali.js,https://cdn.jsdelivr.net/npm/vue-persian-datetime-picker@2.10.4/dist/vue-persian-datetime-picker.umd.min.js";
	$datetime->component="DatePicker: VuePersianDatetimePicker";
	$datetime->get_props_func=function ($page,$field,$key){
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
	};
	$datetime->from_db_func=function($item,$key,$value){ 
		 if($value=='0000-00-00 00:00:00') return null;
return $value; 
	};

	self::$field_types['datetime']=$datetime;

	$time=new libman_field_type('time','date-picker');
	$time->url_js="https://cdn.jsdelivr.net/npm/moment,https://cdn.jsdelivr.net/npm/moment-jalaali@0.9.2/build/moment-jalaali.js,https://cdn.jsdelivr.net/npm/vue-persian-datetime-picker@2.10.4/dist/vue-persian-datetime-picker.umd.min.js";
	$time->component="DatePicker: VuePersianDatetimePicker";
	$time->get_props_func=function ($page,$field,$key){
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
	};
	$time->from_db_func=function($item,$key,$value){ 
		 if($value=='00:00:00') return null;
return $value; 
	};

	self::$field_types['time']=$time;

	$nationalCode=new libman_field_type('nationalCode','v-text-field');
	$nationalCode->get_props_func=function ($page,$field,$key){
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
	};


	self::$field_types['nationalCode']=$nationalCode;

	$mobile=new libman_field_type('mobile','v-text-field');
	$mobile->get_props_func=function ($page,$field,$key){
	   $rules=':rules="[';
if($field->required){
$is_required=__('is required!');
$rules.= "v => !!v || '$field->label $is_required',";
}
$invalid=__('is invalid!');
$rules.= "v => !v || /^09\d{9}$/.test(v) || '$field->label $invalid',";
$rules.=']"';
return  "label=\"$field->label\"
			:style=\"page.formView.fieldsLayouts.$field->key.style\"
		 	v-model=\"item.$key\"
			:clearable=\"true\"
			:disabled=\"mode==='view'\"
			$rules ";
	};


	self::$field_types['mobile']=$mobile;

	$title=new libman_field_type('title','v-text-field');
	$title->get_props_func=function ($page,$field,$key){
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
	};


	self::$field_types['title']=$title;

	$email=new libman_field_type('email','v-text-field');
	$email->get_props_func=function ($page,$field,$key){
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
	};


	self::$field_types['email']=$email;

	$phone=new libman_field_type('phone','v-text-field');
	$phone->get_props_func=function ($page,$field,$key){
	   $rules=':rules="[';
if($field->required){
$is_required=__('is required!');
$rules.= "v => !!v || '$field->label $is_required',";
}
$invalid=__('is invalid!');
$rules.= "v => !v || /^\+?\d{5,13}$/.test(v) || '$field->label $invalid',";
$rules.=']"';
return  "label=\"$field->label\"
			:style=\"page.formView.fieldsLayouts.$field->key.style\"
		 	v-model=\"item.$key\"
			:clearable=\"true\"
			:disabled=\"mode==='view'\"
			$rules ";
	};


	self::$field_types['phone']=$phone;
  }

  public static function get($key):libman_field_type {
    self::init();
    return self::$field_types[$key];
  }

}
