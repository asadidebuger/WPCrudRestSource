<?php
/**
 * Fired during plugin activation.
 * @since      1.0.0
 * @package    libman
 * @author     Mohammadreza Asadi	https://mdse.ui.ac.ir/fa/member/%D9%85%D8%AD%D9%85%D8%AF%D8%B1%D8%B6%D8%A7-%D8%A7%D8%B3%D8%AF%DB%8C/
 */
include_once 'libman_Field.php';
include_once 'libman_Relation.php';
class libman_Models {

	//Models instance static field
	private static $instance=null;

	//static function to access plugin model instance as singletone
	public static function get_instance() {
	  if (self::$instance==null) self::$instance = new libman_Models();
	  return self::$instance;
	}

	private $entities=[];
	private $pages=[];
	

	private function get_entity_book(){
		// "book" Fields
		$book_title=new libman_Field('title','title',__('Title','crwp'),true,false,true);
		$book_publishDate=new libman_Field('publishDate','date',__('Publish Date','crwp'),true,false,true);
		$book_isbn=new libman_Field('isbn','title',__('ISBN','crwp'),true,false,true);
		$book_printDate=new libman_Field('printDate','date',__('Print Date','crwp'),true,false,true);
		$book_place=new libman_Field('place','text',__('Place','crwp'),false,false,false);
		$book_qty=new libman_Field('qty','int',__('Quantity','crwp'),true,false,false);

		// "book" Relations
			
		$book_category=new libman_Relation('category','category','book','category','category','id',__('Category','crwp'),false,false,false,false);
			
		$book_publisher=new libman_Relation('publisher','publisher','book','publisher','publisher','id',__('Publisher','crwp'),false,false,false,false);
			
		$book_writer=new libman_Relation('writer','writer','book','m_book_writer','id','book',__('Writer','crwp'),true,false,false,false);
			
		$book_history=new libman_Relation('history','borrow','book','borrow','id','book',__('History','crwp'),true,false,false,false);

		// "book" Entity
		$book_title_script= 'item.title';
		$book=new libman_Entity('book',__('Book','crwp'),__('Books','crwp'), $book_title_script);
		$book->add_field('title',$book_title);
		$book->add_field('publishDate',$book_publishDate);
		$book->add_field('isbn',$book_isbn);
		$book->add_field('printDate',$book_printDate);
		$book->add_field('place',$book_place);
		$book->add_field('qty',$book_qty);
		$book->add_relation('category',$book_category);
		$book->add_relation('publisher',$book_publisher);
		$book->add_relation('writer',$book_writer);
		$book->add_relation('history',$book_history);

		return $book;
	}
	private function get_entity_member(){
		// "member" Fields
		$member_name=new libman_Field('name','title',__('Name','crwp'),true,false,true);
		$member_family=new libman_Field('family','title',__('Family','crwp'),true,false,false);
		$member_code=new libman_Field('code','nationalCode',__('National Code','crwp'),true,true,true);
		$member_mobile=new libman_Field('mobile','mobile',__('Mobile','crwp'),true,true,true);
		$member_address=new libman_Field('address','text',__('Address','crwp'),false,false,false);
		$member_birth=new libman_Field('birth','date',__('Birthdate','crwp'),true,false,true);
		$member_bookLimit=new libman_Field('bookLimit','int',__('Book Limit','crwp'),true,false,true);

		// "member" Relations
			
		$member_history=new libman_Relation('history','borrow','member','borrow','id','member',__('History','crwp'),true,false,false,false);

		// "member" Entity
		$member_title_script= 'item.name+\' \'+item.family';
		$member=new libman_Entity('member',__('Member','crwp'),__('Members','crwp'), $member_title_script);
		$member->add_field('name',$member_name);
		$member->add_field('family',$member_family);
		$member->add_field('code',$member_code);
		$member->add_field('mobile',$member_mobile);
		$member->add_field('address',$member_address);
		$member->add_field('birth',$member_birth);
		$member->add_field('bookLimit',$member_bookLimit);
		$member->add_relation('history',$member_history);

		return $member;
	}
	private function get_entity_publisher(){
		// "publisher" Fields
		$publisher_title=new libman_Field('title','text',__('Title','crwp'),true,true,true);

		// "publisher" Relations
			
		$publisher_book=new libman_Relation('book','book','publisher','book','id','publisher',__('Books','crwp'),true,false,false,false);

		// "publisher" Entity
		$publisher_title_script= 'item.name';
		$publisher=new libman_Entity('publisher',__('Publisher','crwp'),__('Publisher','crwp'), $publisher_title_script);
		$publisher->add_field('title',$publisher_title);
		$publisher->add_relation('book',$publisher_book);

		return $publisher;
	}
	private function get_entity_borrow(){
		// "borrow" Fields
		$borrow_borrowDate=new libman_Field('borrowDate','datetime',__('Borrow date','crwp'),true,false,true);
		$borrow_returnDate=new libman_Field('returnDate','datetime',__('Return date','crwp'),true,false,false);

		// "borrow" Relations
			
		$borrow_member=new libman_Relation('member','member','history','member','member','id',__('Member','crwp'),false,false,false,false);
			
		$borrow_book=new libman_Relation('book','book','history','book','book','id',__('Book','crwp'),false,false,false,false);

		// "borrow" Entity
		$borrow_title_script= 'item.id+\'->\'+item.borrowDate';
		$borrow=new libman_Entity('borrow',__('Borrowed Book','crwp'),__('Borrowed Books','crwp'), $borrow_title_script);
		$borrow->add_field('borrowDate',$borrow_borrowDate);
		$borrow->add_field('returnDate',$borrow_returnDate);
		$borrow->add_relation('member',$borrow_member);
		$borrow->add_relation('book',$borrow_book);

		return $borrow;
	}
	private function get_entity_category(){
		// "category" Fields
		$category_title=new libman_Field('title','title',__('Title','crwp'),true,true,true);

		// "category" Relations
			
		$category_book=new libman_Relation('book','book','category','book','id','category',__('Books','crwp'),true,false,false,false);

		// "category" Entity
		$category_title_script= 'item.title';
		$category=new libman_Entity('category',__('Category','crwp'),__('Categories','crwp'), $category_title_script);
		$category->add_field('title',$category_title);
		$category->add_relation('book',$category_book);

		return $category;
	}
	private function get_entity_writer(){
		// "writer" Fields
		$writer_name=new libman_Field('name','title',__('Firstname','crwp'),true,false,true);
		$writer_family=new libman_Field('family','text',__('Lastname','crwp'),true,false,true);

		// "writer" Relations
			
		$writer_book=new libman_Relation('book','book','writer','m_book_writer','id','writer',__('Books','crwp'),true,false,false,false);

		// "writer" Entity
		$writer_title_script= 'item.name+\' \'+item.family';
		$writer=new libman_Entity('writer',__('Writer','crwp'),__('Writers','crwp'), $writer_title_script);
		$writer->add_field('name',$writer_name);
		$writer->add_field('family',$writer_family);
		$writer->add_relation('book',$writer_book);

		return $writer;
	}

	public function get_page_member(){
		$page=new libman_Page('member','member',__('Members','crwp'));
		$columns=array('name','family','code','mobile','address','birth','bookLimit','history',);
		$sortable=array('name','family','code','mobile','address','birth','bookLimit','history',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'name'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'family'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'code'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'mobile'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'address'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'birth'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'bookLimit'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'history'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_book(){
		$page=new libman_Page('book','book',__('Books','crwp'));
		$columns=array('title','publishDate','isbn','printDate','place','qty','category','publisher','writer','history',);
		$sortable=array('title','publishDate','isbn','printDate','place','qty','category','publisher','writer','history',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'title'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'publishDate'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'isbn'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'printDate'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'place'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'qty'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'category'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'publisher'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'writer'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'history'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_publisher(){
		$page=new libman_Page('publisher','publisher',__('Publisher','crwp'));
		$columns=array('title','book',);
		$sortable=array('title','book',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'title'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'book'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_borrow(){
		$page=new libman_Page('borrow','borrow',__('Borrowed Books','crwp'));
		$columns=array('borrowDate','returnDate','member','book',);
		$sortable=array('borrowDate','returnDate','member','book',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'borrowDate'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'returnDate'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'member'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'book'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_category(){
		$page=new libman_Page('category','category',__('Categories','crwp'));
		$columns=array('title','book',);
		$sortable=array('title','book',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'title'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'book'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''), ));
		return $page;
	}
	public function get_page_writer(){
		$page=new libman_Page('writer','writer',__('Writers','crwp'));
		$columns=array('name','family','book',);
		$sortable=array('name','family','book',);
		$searchable=array();
		$props=['createButton'=>true,'editButton'=>true,'searchBox'=>true,'detailButton'=>true,'deleteButton'=>true,'itemsPerPage'=>10];
		$bulkActions=array();
		$where= <<<WHEREPUSH
 
WHEREPUSH;
		$page->set_listView($columns,$sortable,$searchable,$props,$bulkActions,trim($where));
		$page->set_formView(array( 'name'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'family'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''),  'book'=>array('class'=>'col-md-12 ',
			'col'=>array('xs'=>0,'sm'=>0,'md'=>12,'lg'=>0, 'xl'=>0), 'style'=>''), ));
		return $page;
	}

	public static function get_admin_menus():array{
		$menus=[
			'mylib'=>['title'=>__('My Library','crwp'), 'icon'=>'dashicons-book', 'sub'=>[
				'member'=>['title'=>__('Members','crwp'), 'pageTitle'=>__('Members','crwp'),'page_key'=>'member'],
				'book'=>['title'=>__('Books','crwp'), 'pageTitle'=>__('Books','crwp'),'page_key'=>'book'],
				'publisher'=>['title'=>__('Publisher','crwp'), 'pageTitle'=>__('Publisher','crwp'),'page_key'=>'publisher'],
				'writer'=>['title'=>__('Writers','crwp'), 'pageTitle'=>__('Writers','crwp'),'page_key'=>'writer'],
				'category'=>['title'=>__('Categories','crwp'), 'pageTitle'=>__('Categories','crwp'),'page_key'=>'category'],
				'borrow'=>['title'=>__('Borrowed Books','crwp'), 'pageTitle'=>__('Borrowed Books','crwp'),'page_key'=>'borrow'],
					],
				],
			];
		return $menus;
	}

	// Get entity model by key
	public static function get_entity($key): ?libman_Entity {
      $models=self::get_instance();
	  if (!$key) return null;
	  if (array_key_exists($key,$models->entities)) return $models->entities[$key];
	  $get_entity_func='get_entity_'.$key;
	  if (!method_exists($models,$get_entity_func)) return null;
	  $entity=$models->$get_entity_func();
	  $models->entities[$key]=$entity;
	  return $entity;
	}
	public static function get_page($key): ?libman_Page{
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
	  self::get_page('member');
	  self::get_page('book');
	  self::get_page('publisher');
	  self::get_page('borrow');
	  self::get_page('category');
	  self::get_page('writer');
	  return self::get_instance()->pages;
  }
	public static function get_entities(): array{
	  self::get_entity('book');
	  self::get_entity('member');
	  self::get_entity('publisher');
	  self::get_entity('borrow');
	  self::get_entity('category');
	  self::get_entity('writer');
	  return self::get_instance()->entities;
  }
}
