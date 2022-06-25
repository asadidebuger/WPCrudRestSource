<?php

/**
 * The admin-specific functionality of the plugin.
 *
 * Defines the plugin name, version, and two examples hooks for how to
 * enqueue the admin-specific stylesheet and JavaScript.
 *
 * @since      1.0.0
 * @package    libman
 * @author     Mohammadreza Asadi	https://mdse.ui.ac.ir/fa/member/%D9%85%D8%AD%D9%85%D8%AF%D8%B1%D8%B6%D8%A7-%D8%A7%D8%B3%D8%AF%DB%8C/
 */
require libman_PATH.'admin/libman_admin_menu_page.php';
require libman_PATH.'includes/libman_Page.php';

class libman_Admin {


	private $plg;

	/**
	 * The ID of this plugin.
	 *
	 * @since    1.0.0
	 * @access   private
	 * @var      string    $plugin_name    The ID of this plugin.
	 */
	private $plugin_name;

	/**
	 * The version of this plugin.
	 *
	 * @since    1.0.0
	 * @access   private
	 * @var      string    $version    The current version of this plugin.
	 */
	private $version;

	/**
	 * Initialize the class and set its properties.
	 *
	 * @since    1.0.0
	 * @param      string    $plugin_name       The name of this plugin.
	 * @param      string    $version    The version of this plugin.
	 */
	public function __construct($plg, $plugin_name, $version ) {

		$this->plg=$plg;
		$this->plugin_name = $plugin_name;
		$this->version = $version;

	}

	/**
	 * Register the stylesheets for the admin area.
	 *
	 * @since    1.0.0
	 */
	public function enqueue_styles() {

		/**
		 * This function is provided for demonstration purposes only.
		 *
		 * An instance of this class should be passed to the run() function
		 * defined in Plugin_Name_Loader as all of the hooks are defined
		 * in that particular class.
		 *
		 * The Plugin_Name_Loader will then create the relationship
		 * between the defined hooks and the functions defined in this
		 * class.
		 */

		wp_enqueue_style( 'Roboto', 'https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900', array(), false, 'all' );
		wp_enqueue_style( 'materialdesignicons', 'https://cdn.jsdelivr.net/npm/@mdi/font@6.x/css/materialdesignicons.min.css', array(), false, 'all' );
		wp_enqueue_style( 'vuetify', 'https://cdn.jsdelivr.net/npm/vuetify@2.x/dist/vuetify.min.css', array(), false, 'all' );
		wp_enqueue_style( $this->plugin_name, plugin_dir_url( __FILE__ ) . 'css/libman-admin.css', array(), $this->version, 'all' );
	}

	/**
	 * Register the JavaScript for the admin area.
	 *
	 * @since    1.0.0
	 */
	public function enqueue_scripts() {

		/**
		 * This function is provided for demonstration purposes only.
		 *
		 * An instance of this class should be passed to the run() function
		 * defined in Plugin_Name_Loader as all of the hooks are defined
		 * in that particular class.
		 *
		 * The Plugin_Name_Loader will then create the relationship
		 * between the defined hooks and the functions defined in this
		 * class.
		 */

		wp_enqueue_script('vue','https://cdn.jsdelivr.net/npm/vue@2.x/dist/vue.min.js');
		wp_enqueue_script('vuetify','https://cdn.jsdelivr.net/npm/vuetify@2.x/dist/vuetify.min.js');
		wp_enqueue_script( $this->plugin_name, plugin_dir_url( __FILE__ ) . 'js/libman-admin.js', array( 'jquery' ), $this->version, false );
	}
	public function handle_page_mylib(){
		$page=new libman_admin_menu_page('mylib');
		$page->render();
	}
	public function handle_page_mylib_member(){
		$page=libman_Models::get_page('member');
		$page->renderList();
	}
	public function handle_page_mylib_book(){
		$page=libman_Models::get_page('book');
		$page->renderList();
	}
	public function handle_page_mylib_publisher(){
		$page=libman_Models::get_page('publisher');
		$page->renderList();
	}
	public function handle_page_mylib_writer(){
		$page=libman_Models::get_page('writer');
		$page->renderList();
	}
	public function handle_page_mylib_category(){
		$page=libman_Models::get_page('category');
		$page->renderList();
	}
	public function handle_page_mylib_borrow(){
		$page=libman_Models::get_page('borrow');
		$page->renderList();
	}
	public function handle_page_mylib_borrownotretuned(){
		$page=libman_Models::get_page('borrownotretuned');
		$page->renderList();
	}
	public function handle_options_page(){
		require libman_PATH.'admin/libman_admin_options_page.php';
		$options_page=new libman_admin_options_page('options_libman',__('Library Manager Options','crwp'));
		$options_page->render();

	}
	public function add_menu()
	  {
		add_options_page( __('Library Manager Options', 'crwp'), __('Library Manager', 'crwp'), 'manage_options', 'options_libman', array($this,'handle_options_page'));
		$admin_menus=libman_Models::get_admin_menus();
		foreach ($admin_menus as $slug => $menu){
		  add_menu_page($menu['title'], $menu['title'], 'activate_plugins',$slug,array($this,'handle_page_'.$slug),$menu['icon']);
		  foreach ($menu['sub'] as $itemSlug => $menuItem) {
			if (current_user_can('libman_page_'.$menuItem['page_key'].'_list'))
 				add_submenu_page($slug,$menuItem['pageTitle'], $menuItem['title'], 'activate_plugins',$slug.'-'.$itemSlug , array($this,'handle_page_'.$slug.'_'.$itemSlug));
		  }
		}
	  }

}
