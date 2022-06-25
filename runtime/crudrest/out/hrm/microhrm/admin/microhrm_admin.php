<?php

/**
 * The admin-specific functionality of the plugin.
 *
 * Defines the plugin name, version, and two examples hooks for how to
 * enqueue the admin-specific stylesheet and JavaScript.
 *
 * @since      1.0.0
 * @package    microhrm
 * @author     Mohammadreza Asadi	http://microsign.ir
 */
require microhrm_PATH.'admin/microhrm_admin_menu_page.php';
require microhrm_PATH.'includes/microhrm_Page.php';

class microhrm_Admin {


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
		wp_enqueue_style( $this->plugin_name, plugin_dir_url( __FILE__ ) . 'css/microhrm-admin.css', array(), $this->version, 'all' );
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
		wp_enqueue_script( $this->plugin_name, plugin_dir_url( __FILE__ ) . 'js/microhrm-admin.js', array( 'jquery' ), $this->version, false );
	}
	public function handle_page_microhrm(){
		$page=new microhrm_admin_menu_page('microhrm');
		$page->render();
	}
	public function handle_page_microhrm_personPage(){
		$page=microhrm_Models::get_page('personPage');
		$page->renderList();
	}
	public function handle_page_microhrm_employee(){
		$page=microhrm_Models::get_page('employee');
		$page->renderList();
	}
	public function handle_page_microhrm_blood(){
		$page=microhrm_Models::get_page('blood');
		$page->renderList();
	}
	public function handle_page_microhrm_edu(){
		$page=microhrm_Models::get_page('edu');
		$page->renderList();
	}
	public function handle_page_microhrm_building(){
		$page=microhrm_Models::get_page('building');
		$page->renderList();
	}
	public function handle_page_microhrm_shift(){
		$page=microhrm_Models::get_page('shift');
		$page->renderList();
	}
	public function handle_page_microhrm_insurance(){
		$page=microhrm_Models::get_page('insurance');
		$page->renderList();
	}
	public function handle_page_microhrm_asset(){
		$page=microhrm_Models::get_page('asset');
		$page->renderList();
	}
	public function handle_page_microhrm_assetCat(){
		$page=microhrm_Models::get_page('assetCat');
		$page->renderList();
	}
	public function handle_page_microhrm_ability(){
		$page=microhrm_Models::get_page('ability');
		$page->renderList();
	}
	public function handle_page_microhrm_job(){
		$page=microhrm_Models::get_page('job');
		$page->renderList();
	}
	public function handle_page_microhrm_workTime(){
		$page=microhrm_Models::get_page('workTime');
		$page->renderList();
	}
	public function handle_page_microhrm_jobCategory(){
		$page=microhrm_Models::get_page('jobCategory');
		$page->renderList();
	}
	public function handle_page_microhrm_diabled_employee(){
		$page=microhrm_Models::get_page('diabled_employee');
		$page->renderList();
	}
	public function handle_options_page(){
		require microhrm_PATH.'admin/microhrm_admin_options_page.php';
		$options_page=new microhrm_admin_options_page('options_microhrm',__('Micro HRM Options','microhrm'));
		$options_page->render();

	}
	public function add_menu()
	  {
		add_options_page( __('Micro HRM Options', 'microhrm'), __('Micro HRM', 'microhrm'), 'manage_options', 'options_microhrm', array($this,'handle_options_page'));
		$admin_menus=microhrm_Models::get_admin_menus();
		foreach ($admin_menus as $slug => $menu){
		  add_menu_page($menu['title'], $menu['title'], 'activate_plugins',$slug,array($this,'handle_page_'.$slug),$menu['icon']);
		  foreach ($menu['sub'] as $itemSlug => $menuItem) {
			if (current_user_can('microhrm_page_'.$menuItem['page_key'].'_list'))
 				add_submenu_page($slug,$menuItem['pageTitle'], $menuItem['title'], 'activate_plugins',$slug.'-'.$itemSlug , array($this,'handle_page_'.$slug.'_'.$itemSlug));
		  }
		}
	  }

}
