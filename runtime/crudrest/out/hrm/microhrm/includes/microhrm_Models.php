<?php
/**
 * Fired during plugin activation.
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */
include_once 'microhrm_Field.php';
include_once 'microhrm_Relation.php';
class microhrm_Models {

	//Models instance static field
	private static $instance=null;

	//static function to access plugin model instance as singletone
	public static function get_instance() {
	  if (self::$instance==null) self::$instance = new microhrm_Models();
	  return self::$instance;
	}

	private $entities=[];
	private $pages=[];
	

	private function get_entity_person(){
		// "person" Fields
		$person_name=new microhrm_Field('name','title',__('Firstname','microhrm'),true,false,true);
		$person_family=new microhrm_Field('family','title',__('Lastname','microhrm'),true,false,true);
		$person_code=new microhrm_Field('code','nationalCode',__('National Code','microhrm'),true,false,true);
		$person_birth=new microhrm_Field('birth','date',__('Birthdate','microhrm'),true,false,false);
		$person_description=new microhrm_Field('description','text',__('Description','microhrm'),false,false,false);
		$person_gender=new microhrm_Field('gender','gender',__('Gender','microhrm'),false,false,true);
		$person_mobile=new microhrm_Field('mobile','mobile',__('Mobile','microhrm'),true,true,false);
		$person_phone=new microhrm_Field('phone','phone',__('Phone','microhrm'),false,false,false);

		// "person" Relations
			
		$person_blood=new microhrm_Relation('blood','blood','','blood','blood','id',__('Blood Group','microhrm'),false,false,false,false);
			
		$person_degree=new microhrm_Relation('degree','edu','person','m_edu_person','id','person',__('Degrees','microhrm'),true,false,false,false);
			
		$person_father=new microhrm_Relation('father','person','child','person','father','id',__('Father','microhrm'),false,false,false,false);
			
		$person_child=new microhrm_Relation('child','person','father','person','id','father',__('Children','microhrm'),true,false,false,false);
			
		$person_employee=new microhrm_Relation('employee','employee','person','employee','employee','id',__('Employee','microhrm'),false,false,true,false);

		// "person" Entity
		$person_title_script= 'item.name+\' \'+item.family';
		$person=new microhrm_Entity('person',__('Person','microhrm'),__('People','microhrm'), $person_title_script);
		$person->add_field('name',$person_name);
		$person->add_field('family',$person_family);
		$person->add_field('code',$person_code);
		$person->add_field('birth',$person_birth);
		$person->add_field('description',$person_description);
		$person->add_field('gender',$person_gender);
		$person->add_field('mobile',$person_mobile);
		$person->add_field('phone',$person_phone);
		$person->add_relation('blood',$person_blood);
		$person->add_relation('degree',$person_degree);
		$person->add_relation('father',$person_father);
		$person->add_relation('child',$person_child);
		$person->add_relation('employee',$person_employee);

		return $person;
	}
	private function get_entity_blood(){
		// "blood" Fields
		$blood_title=new microhrm_Field('title','title',__('Title','microhrm'),true,true,true);


		// "blood" Entity
		$blood_title_script= 'item.title';
		$blood=new microhrm_Entity('blood',__('Blood Group','microhrm'),__('Blood Groups','microhrm'), $blood_title_script);
		$blood->add_field('title',$blood_title);

		return $blood;
	}
	private function get_entity_edu(){
		// "edu" Fields
		$edu_title=new microhrm_Field('title','title',__('Title','microhrm'),true,true,true);

		// "edu" Relations
			
		$edu_person=new microhrm_Relation('person','person','degree','m_edu_person','id','edu',__('People','microhrm'),true,false,false,false);

		// "edu" Entity
		$edu_title_script= 'item.title';
		$edu=new microhrm_Entity('edu',__('Education Level','microhrm'),__('Education Levels','microhrm'), $edu_title_script);
		$edu->add_field('title',$edu_title);
		$edu->add_relation('person',$edu_person);

		return $edu;
	}
	private function get_entity_building(){
		// "building" Fields
		$building_title=new microhrm_Field('title','title',__('Title','microhrm'),false,true,true);
		$building_capacity=new microhrm_Field('capacity','int',__('Capacity','microhrm'),false,false,true);

		// "building" Relations
			
		$building_employ=new microhrm_Relation('employ','person','','person','id','building_employ',__('Employees','microhrm'),true,false,false,false);

		// "building" Entity
		$building_title_script= 'item.title';
		$building=new microhrm_Entity('building',__('Building','microhrm'),__('Buildings','microhrm'), $building_title_script);
		$building->add_field('title',$building_title);
		$building->add_field('capacity',$building_capacity);
		$building->add_relation('employ',$building_employ);

		return $building;
	}
	private function get_entity_shift(){
		// "shift" Fields
		$shift_title=new microhrm_Field('title','title',__('Title','microhrm'),false,true,true);
		$shift_start=new microhrm_Field('start','time',__('Start','microhrm'),false,false,true);
		$shift_end=new microhrm_Field('end','time',__('End','microhrm'),false,false,true);

		// "shift" Relations
			
		$shift_employe=new microhrm_Relation('employe','person','','person','id','shift_employe',__('Employees','microhrm'),true,false,false,false);

		// "shift" Entity
		$shift_title_script= 'item.title';
		$shift=new microhrm_Entity('shift',__('Shift','microhrm'),__('Shifts','microhrm'), $shift_title_script);
		$shift->add_field('title',$shift_title);
		$shift->add_field('start',$shift_start);
		$shift->add_field('end',$shift_end);
		$shift->add_relation('employe',$shift_employe);

		return $shift;
	}
	private function get_entity_insurance(){
		// "insurance" Fields
		$insurance_title=new microhrm_Field('title','title',__('Title','microhrm'),false,true,true);
		$insurance_start=new microhrm_Field('start','datetime',__('Start','microhrm'),false,false,true);
		$insurance_end=new microhrm_Field('end','datetime',__('End','microhrm'),false,false,true);

		// "insurance" Relations
			
		$insurance_person=new microhrm_Relation('person','person','','person','id','insurance_person',__('People','microhrm'),true,false,false,false);

		// "insurance" Entity
		$insurance_title_script= 'item.title';
		$insurance=new microhrm_Entity('insurance',__('Insurance','microhrm'),__('Insurances','microhrm'), $insurance_title_script);
		$insurance->add_field('title',$insurance_title);
		$insurance->add_field('start',$insurance_start);
		$insurance->add_field('end',$insurance_end);
		$insurance->add_relation('person',$insurance_person);

		return $insurance;
	}
	private function get_entity_asset(){
		// "asset" Fields
		$asset_title=new microhrm_Field('title','title',__('Title','microhrm'),true,false,true);
		$asset_code=new microhrm_Field('code','title',__('Asset Code','microhrm'),false,false,false);

		// "asset" Relations
			
		$asset_owner=new microhrm_Relation('owner','employee','asset','employee','owner','id',__('Owner','microhrm'),false,false,false,false);
			
		$asset_cat=new microhrm_Relation('cat','assetCat','','assetCat','cat','id',__('Category','microhrm'),false,false,false,false);

		// "asset" Entity
		$asset_title_script= 'item.title';
		$asset=new microhrm_Entity('asset',__('Asset','microhrm'),__('Assets','microhrm'), $asset_title_script);
		$asset->add_field('title',$asset_title);
		$asset->add_field('code',$asset_code);
		$asset->add_relation('owner',$asset_owner);
		$asset->add_relation('cat',$asset_cat);

		return $asset;
	}
	private function get_entity_assetCat(){
		// "assetCat" Fields
		$assetCat_title=new microhrm_Field('title','title',__('Title','microhrm'),true,true,true);


		// "assetCat" Entity
		$assetCat_title_script= 'item.title';
		$assetCat=new microhrm_Entity('assetCat',__('Asset Category','microhrm'),__('Asset Categories','microhrm'), $assetCat_title_script);
		$assetCat->add_field('title',$assetCat_title);

		return $assetCat;
	}
	private function get_entity_employee(){
		// "employee" Fields
		$employee_code=new microhrm_Field('code','title',__('Personal Code','microhrm'),true,true,true);
		$employee_active=new microhrm_Field('active','checkBox',__('Is Active','microhrm'),false,false,false);
		$employee_start=new microhrm_Field('start','date',__('Start Date','microhrm'),false,false,false);

		// "employee" Relations
			
		$employee_person=new microhrm_Relation('person','person','employee','person','person','id',__('Person','microhrm'),false,false,true,false);
			
		$employee_shift=new microhrm_Relation('shift','shift','employe','shift','shift','id',__('Work Shift','microhrm'),false,false,false,false);
			
		$employee_insurance=new microhrm_Relation('insurance','insurance','person','m_employee_insurance','id','employee',__('Insurances','microhrm'),true,false,false,false);
			
		$employee_workplace=new microhrm_Relation('workplace','building','employ','m_building_employee','id','employee',__('Workplace','microhrm'),true,false,false,false);
			
		$employee_asset=new microhrm_Relation('asset','asset','owner','asset','id','owner',__('Assets','microhrm'),true,false,false,false);
			
		$employee_ability=new microhrm_Relation('ability','ability','employee','m_ability_employee','id','employee',__('Abilities','microhrm'),true,false,false,false);
			
		$employee_job=new microhrm_Relation('job','job','employee','job','job','id',__('Job','microhrm'),false,false,false,false);
			
		$employee_workTime=new microhrm_Relation('workTime','workTime','','workTime','id','employee_workTime',__('Work Times','microhrm'),true,false,false,false);
			
		$employee_cat=new microhrm_Relation('cat','jobCategory','employee','jobCategory','cat','id',__('Job Category','microhrm'),false,false,false,false);

		// "employee" Entity
		$employee_title_script= 'item.code';
		$employee=new microhrm_Entity('employee',__('Employee','microhrm'),__('Employees','microhrm'), $employee_title_script);
		$employee->add_field('code',$employee_code);
		$employee->add_field('active',$employee_active);
		$employee->add_field('start',$employee_start);
		$employee->add_relation('person',$employee_person);
		$employee->add_relation('shift',$employee_shift);
		$employee->add_relation('insurance',$employee_insurance);
		$employee->add_relation('workplace',$employee_workplace);
		$employee->add_relation('asset',$employee_asset);
		$employee->add_relation('ability',$employee_ability);
		$employee->add_relation('job',$employee_job);
		$employee->add_relation('workTime',$employee_workTime);
		$employee->add_relation('cat',$employee_cat);

		return $employee;
	}
	private function get_entity_ability(){
		// "ability" Fields
		$ability_title=new microhrm_Field('title','title',__('Title','microhrm'),false,true,true);

		// "ability" Relations
			
		$ability_employee=new microhrm_Relation('employee','employee','ability','m_ability_employee','id','ability',__('Employee','microhrm'),true,false,false,false);

		// "ability" Entity
		$ability_title_script= 'item.title';
		$ability=new microhrm_Entity('ability',__('Ability','microhrm'),__('Abilities','microhrm'), $ability_title_script);
		$ability->add_field('title',$ability_title);
		$ability->add_relation('employee',$ability_employee);

		return $ability;
	}
	private function get_entity_job(){
		// "job" Fields
		$job_title=new microhrm_Field('title','title',__('Title','microhrm'),false,true,true);

		// "job" Relations
			
		$job_employee=new microhrm_Relation('employee','employee','job','employee','id','job',__('Employee','microhrm'),true,false,false,false);

		// "job" Entity
		$job_title_script= 'item.title';
		$job=new microhrm_Entity('job',__('Job','microhrm'),__('Jobs','microhrm'), $job_title_script);
		$job->add_field('title',$job_title);
		$job->add_relation('employee',$job_employee);

		return $job;
	}
	private function get_entity_workTime(){
		// "workTime" Fields
		$workTime_enter=new microhrm_Field('enter','datetime',__('Enter','microhrm'),false,false,true);
		$workTime_exit=new microhrm_Field('exit','datetime',__('Exit','microhrm'),false,false,true);

		// "workTime" Relations
			
		$workTime_employee=new microhrm_Relation('employee','employee','','employee','employee','id',__('Employee','microhrm'),false,false,true,false);

		// "workTime" Entity
		$workTime_title_script= 'item.id';
		$workTime=new microhrm_Entity('workTime',__('Work Time','microhrm'),__('Work Times','microhrm'), $workTime_title_script);
		$workTime->add_field('enter',$workTime_enter);
		$workTime->add_field('exit',$workTime_exit);
		$workTime->add_relation('employee',$workTime_employee);

		return $workTime;
	}
	private function get_entity_jobCategory(){
		// "jobCategory" Fields
		$jobCategory_title=new microhrm_Field('title','title',__('Title','microhrm'),true,true,true);
		$jobCategory_paymentRate=new microhrm_Field('paymentRate','int',__('Payment Rate','microhrm'),false,false,true);

		// "jobCategory" Relations
			
		$jobCategory_employee=new microhrm_Relation('employee','employee','cat','employee','id','cat',__('Employees','microhrm'),true,false,false,false);

		// "jobCategory" Entity
		$jobCategory_title_script= 'item.title';
		$jobCategory=new microhrm_Entity('jobCategory',__('Job Category','microhrm'),__('Job Categories','microhrm'), $jobCategory_title_script);
		$jobCategory->add_field('title',$jobCategory_title);
		$jobCategory->add_field('paymentRate',$jobCategory_paymentRate);
		$jobCategory->add_relation('employee',$jobCategory_employee);

		return $jobCategory;
	}

	public function get_page_personPage(){
		$page=new microhrm_Page('personPage','person',__('People','microhrm'));
		$columns=array('name','family','code','birth','description','gender','mobile','phone','blood','degree','father','child','employee',);
		$sortable=array('name','family','code','birth','description','gender','mobile','phone','blood','degree','father','child','employee',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'name'=>array('class'=>'col-md-3 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>3,'lg'=>0, 'xl'=>0), 'style'=>''),  'family'=>array('class'=>'col-md-3 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>3,'lg'=>0, 'xl'=>0), 'style'=>''),  'code'=>array('class'=>'col-md-3 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>3,'lg'=>0, 'xl'=>0), 'style'=>''),  'birth'=>array('class'=>'col-md-3 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>3,'lg'=>0, 'xl'=>0), 'style'=>''),  'description'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'gender'=>array('class'=>'col-md-3 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>3,'lg'=>0, 'xl'=>0), 'style'=>''),  'mobile'=>array('class'=>'col-md-3 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>3,'lg'=>0, 'xl'=>0), 'style'=>''),  'phone'=>array('class'=>'col-md-3 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>3,'lg'=>0, 'xl'=>0), 'style'=>''),  'blood'=>array('class'=>'col-md-3 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>3,'lg'=>0, 'xl'=>0), 'style'=>''),  'degree'=>array('class'=>'col-md-3 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>3,'lg'=>0, 'xl'=>0), 'style'=>''),  'father'=>array('class'=>'col-md-3 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>3,'lg'=>0, 'xl'=>0), 'style'=>''),  'child'=>array('class'=>'col-md-3 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>3,'lg'=>0, 'xl'=>0), 'style'=>''),  'employee'=>array('class'=>'col-md-3 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>3,'lg'=>0, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_blood(){
		$page=new microhrm_Page('blood','blood',__('Blood Groups','microhrm'));
		$columns=array('title',);
		$sortable=array('title',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'title'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_edu(){
		$page=new microhrm_Page('edu','edu',__('Education Levels','microhrm'));
		$columns=array('title','person',);
		$sortable=array('title','person',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'title'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'person'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_building(){
		$page=new microhrm_Page('building','building',__('Buildings','microhrm'));
		$columns=array('title','capacity','employ',);
		$sortable=array('title','capacity','employ',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'title'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'capacity'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'employ'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_shift(){
		$page=new microhrm_Page('shift','shift',__('Shifts','microhrm'));
		$columns=array('title','start','end','employe',);
		$sortable=array('title','start','end','employe',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'title'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'start'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'end'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'employe'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_insurance(){
		$page=new microhrm_Page('insurance','insurance',__('Insurances','microhrm'));
		$columns=array('title','start','end','person',);
		$sortable=array('title','start','end','person',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'title'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'start'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'end'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'person'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_asset(){
		$page=new microhrm_Page('asset','asset',__('Assets','microhrm'));
		$columns=array('title','code','owner',);
		$sortable=array('title','code','owner',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'title'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'code'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'owner'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_assetCat(){
		$page=new microhrm_Page('assetCat','assetCat',__('Asset Categories','microhrm'));
		$columns=array('title',);
		$sortable=array('title',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'title'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_employee(){
		$page=new microhrm_Page('employee','employee',__('Employees','microhrm'));
		$columns=array('code','active','start','person','shift','insurance','workplace','asset','ability','job','workTime','cat',);
		$sortable=array('code','active','start','person','shift','insurance','workplace','asset','ability','job','workTime','cat',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'code'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'active'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'start'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'person'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'shift'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'insurance'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'workplace'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'asset'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'ability'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'job'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'workTime'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'cat'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_ability(){
		$page=new microhrm_Page('ability','ability',__('Abilities','microhrm'));
		$columns=array('title','employee',);
		$sortable=array('title','employee',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'title'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'employee'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_job(){
		$page=new microhrm_Page('job','job',__('Jobs','microhrm'));
		$columns=array('title','employee',);
		$sortable=array('title','employee',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'title'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'employee'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_workTime(){
		$page=new microhrm_Page('workTime','workTime',__('Work Times','microhrm'));
		$columns=array('enter','exit','employee',);
		$sortable=array('enter','exit','employee',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'enter'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'exit'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'employee'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_jobCategory(){
		$page=new microhrm_Page('jobCategory','jobCategory',__('Job Categories','microhrm'));
		$columns=array('title','paymentRate','employee',);
		$sortable=array('title','paymentRate','employee',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'title'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'paymentRate'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'employee'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_diabled_employee(){
		$page=new microhrm_Page('diabled_employee','employee',__('Retyred Employes','microhrm'));
		$columns=array('code','active','start','person','shift','insurance','workplace','asset','ability','job','workTime','cat',);
		$sortable=array('code','active','start','person','shift','insurance','workplace','asset','ability','job','workTime','cat',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
employee.active IS NOT 1 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'code'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'active'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'start'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'person'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'shift'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'insurance'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'workplace'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'asset'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'ability'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'job'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'workTime'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''),  'cat'=>array('class'=>'col-lg-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>0,'lg'=>12, 'xl'=>0), 'style'=>''), ));
		return $page;
	}

	public static function get_admin_menus():array{
		$menus=[
			'microhrm'=>['title'=>__('Micro HRM','microhrm'), 'icon'=>null, 'sub'=>[
				'personPage'=>['title'=>__('People','microhrm'), 'pageTitle'=>__('People','microhrm'),'page_key'=>'personPage'],
				'employee'=>['title'=>__('Employees','microhrm'), 'pageTitle'=>__('Employees','microhrm'),'page_key'=>'employee'],
				'blood'=>['title'=>__('Blood Groups','microhrm'), 'pageTitle'=>__('Blood Groups','microhrm'),'page_key'=>'blood'],
				'edu'=>['title'=>__('Education Levels','microhrm'), 'pageTitle'=>__('Education Levels','microhrm'),'page_key'=>'edu'],
				'building'=>['title'=>__('Buildings','microhrm'), 'pageTitle'=>__('Buildings','microhrm'),'page_key'=>'building'],
				'shift'=>['title'=>__('Shifts','microhrm'), 'pageTitle'=>__('Shifts','microhrm'),'page_key'=>'shift'],
				'insurance'=>['title'=>__('Insurances','microhrm'), 'pageTitle'=>__('Insurances','microhrm'),'page_key'=>'insurance'],
				'asset'=>['title'=>__('Assets','microhrm'), 'pageTitle'=>__('Assets','microhrm'),'page_key'=>'asset'],
				'assetCat'=>['title'=>__('Asset Categories','microhrm'), 'pageTitle'=>__('Asset Categories','microhrm'),'page_key'=>'assetCat'],
				'ability'=>['title'=>__('Abilities','microhrm'), 'pageTitle'=>__('Abilities','microhrm'),'page_key'=>'ability'],
				'job'=>['title'=>__('Jobs','microhrm'), 'pageTitle'=>__('Jobs','microhrm'),'page_key'=>'job'],
				'workTime'=>['title'=>__('Work Times','microhrm'), 'pageTitle'=>__('Work Times','microhrm'),'page_key'=>'workTime'],
				'jobCategory'=>['title'=>__('Job Categories','microhrm'), 'pageTitle'=>__('Job Categories','microhrm'),'page_key'=>'jobCategory'],
				'diabled_employee'=>['title'=>__('Retyred Employes','microhrm'), 'pageTitle'=>__('Retyred Employes','microhrm'),'page_key'=>'diabled_employee'],
					],
				],
			];
		return $menus;
	}

	// Get entity model by key
	public static function get_entity($key): ?microhrm_Entity {
      $models=self::get_instance();
	  if (!$key) return null;
	  if (array_key_exists($key,$models->entities)) return $models->entities[$key];
	  $get_entity_func='get_entity_'.$key;
	  if (!method_exists($models,$get_entity_func)) return null;
	  $entity=$models->$get_entity_func();
	  $models->entities[$key]=$entity;
	  return $entity;
	}
	public static function get_page($key): ?microhrm_Page{
	  if (!$key) return null;
	  $models=self::get_instance();
	  if (array_key_exists($key,$models->pages)) return $models->pages[$key];
	  $get_page_func='get_page_'.$key;
	  if (!method_exists($models,$get_page_func)) return null;
	  $page=$models->$get_page_func();
	  $models->pages[$key]=$page;
	  return $page;
	}
	public static function get_pages(): array{
	  self::get_page('personPage');
	  self::get_page('blood');
	  self::get_page('edu');
	  self::get_page('building');
	  self::get_page('shift');
	  self::get_page('insurance');
	  self::get_page('asset');
	  self::get_page('assetCat');
	  self::get_page('employee');
	  self::get_page('ability');
	  self::get_page('job');
	  self::get_page('workTime');
	  self::get_page('jobCategory');
	  self::get_page('diabled_employee');
	  return self::get_instance()->pages;
  }
	public static function get_entities(): array{
	  self::get_entity('person');
	  self::get_entity('blood');
	  self::get_entity('edu');
	  self::get_entity('building');
	  self::get_entity('shift');
	  self::get_entity('insurance');
	  self::get_entity('asset');
	  self::get_entity('assetCat');
	  self::get_entity('employee');
	  self::get_entity('ability');
	  self::get_entity('job');
	  self::get_entity('workTime');
	  self::get_entity('jobCategory');
	  return self::get_instance()->entities;
  }
}
