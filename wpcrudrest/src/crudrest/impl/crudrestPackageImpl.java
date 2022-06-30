/**
 */
package crudrest.impl;

import crudrest.BulkAction;
import crudrest.CrudRestPlugin;
import crudrest.DBFieldConfig;
import crudrest.Entity;
import crudrest.Field;
import crudrest.FieldBase;
import crudrest.FieldLayout;
import crudrest.FieldType;
import crudrest.FieldTypeRepository;
import crudrest.Form;
import crudrest.HttpMethod;
import crudrest.Layout;
import crudrest.List;
import crudrest.Menu;
import crudrest.MenuItem;
import crudrest.PluginCreator;
import crudrest.PluginDetail;
import crudrest.PluginGUI;
import crudrest.PluginWebService;
import crudrest.Relation;
import crudrest.UIPage;
import crudrest.VueElement;
import crudrest.WebserviceFunction;
import crudrest.crudrestFactory;
import crudrest.crudrestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class crudrestPackageImpl extends EPackageImpl implements crudrestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginCreatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crudRestPluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginWebServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webserviceFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginGUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bulkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldTypeRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbFieldConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vueElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpMethodEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see crudrest.crudrestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private crudrestPackageImpl() {
		super(eNS_URI, crudrestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link crudrestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static crudrestPackage init() {
		if (isInited) return (crudrestPackage)EPackage.Registry.INSTANCE.getEPackage(crudrestPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredcrudrestPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		crudrestPackageImpl thecrudrestPackage = registeredcrudrestPackage instanceof crudrestPackageImpl ? (crudrestPackageImpl)registeredcrudrestPackage : new crudrestPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thecrudrestPackage.createPackageContents();

		// Initialize created meta-data
		thecrudrestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thecrudrestPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(crudrestPackage.eNS_URI, thecrudrestPackage);
		return thecrudrestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginCreator() {
		return pluginCreatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginCreator_Plugin() {
		return (EReference)pluginCreatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginCreator_Repository() {
		return (EReference)pluginCreatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrudRestPlugin() {
		return crudRestPluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrudRestPlugin_Name() {
		return (EAttribute)crudRestPluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrudRestPlugin_Detail() {
		return (EReference)crudRestPluginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrudRestPlugin_Gui() {
		return (EReference)crudRestPluginEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrudRestPlugin_HasAccessControl() {
		return (EAttribute)crudRestPluginEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrudRestPlugin_ServiceProvider() {
		return (EReference)crudRestPluginEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginDetail() {
		return pluginDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDetail_Prefix() {
		return (EAttribute)pluginDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDetail_Description() {
		return (EAttribute)pluginDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDetail_Version() {
		return (EAttribute)pluginDetailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDetail_DbVersion() {
		return (EAttribute)pluginDetailEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDetail_PluginURI() {
		return (EAttribute)pluginDetailEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDetail_Author() {
		return (EAttribute)pluginDetailEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDetail_AuthorURI() {
		return (EAttribute)pluginDetailEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDetail_License() {
		return (EAttribute)pluginDetailEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDetail_LicenseURI() {
		return (EAttribute)pluginDetailEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDetail_TextDomain() {
		return (EAttribute)pluginDetailEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDetail_DomainPath() {
		return (EAttribute)pluginDetailEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDetail_Directory() {
		return (EAttribute)pluginDetailEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDetail_MinVersionWP() {
		return (EAttribute)pluginDetailEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDetail_MinVersionPHP() {
		return (EAttribute)pluginDetailEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDetail_UpdateURI() {
		return (EAttribute)pluginDetailEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDetail_Network() {
		return (EAttribute)pluginDetailEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginWebService() {
		return pluginWebServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginWebService_Extend() {
		return (EReference)pluginWebServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginWebService_EntityModel() {
		return (EReference)pluginWebServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebserviceFunction() {
		return webserviceFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebserviceFunction_Method() {
		return (EAttribute)webserviceFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebserviceFunction_Name() {
		return (EAttribute)webserviceFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebserviceFunction_CheckAccessControl() {
		return (EAttribute)webserviceFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Key() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Label() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_LabelPlural() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_TitleScript() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Fields() {
		return (EReference)entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Relations() {
		return (EReference)entityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Type() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Entity() {
		return (EReference)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Many() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Opposite() {
		return (EReference)relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginGUI() {
		return pluginGUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginGUI_Class() {
		return (EAttribute)pluginGUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginGUI_Style() {
		return (EAttribute)pluginGUIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginGUI_Menu() {
		return (EReference)pluginGUIEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginGUI_Page() {
		return (EReference)pluginGUIEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginGUI_ReusableLayout() {
		return (EReference)pluginGUIEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Name() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Col_xs() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Col_sm() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Col_md() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Col_lg() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Col_xl() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Class() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Style() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Items() {
		return (EReference)menuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_Title() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_Slug() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_Icon() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuItem() {
		return menuItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenuItem_Page() {
		return (EReference)menuItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenuItem_OverrideTitle() {
		return (EAttribute)menuItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIPage() {
		return uiPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIPage_Key() {
		return (EAttribute)uiPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIPage_Entity() {
		return (EReference)uiPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIPage_Form() {
		return (EReference)uiPageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIPage_List() {
		return (EReference)uiPageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIPage_OverrideTitle() {
		return (EAttribute)uiPageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_FieldLayout() {
		return (EReference)formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldLayout() {
		return fieldLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldLayout_Field() {
		return (EReference)fieldLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldLayout_Layout() {
		return (EReference)fieldLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_ShowCreateButton() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_ShowEditButton() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_ShowSearchBox() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_ShowViewDetailButton() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_ShowDeleteButton() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_ShowIdCol() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_ItemsPerPage() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_ListColumns() {
		return (EReference)listEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_SortableColumns() {
		return (EReference)listEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_SearchableColumns() {
		return (EReference)listEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getList_ExtendWhereClause() {
		return (EAttribute)listEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_BulkAction() {
		return (EReference)listEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBulkAction() {
		return bulkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBulkAction_Key() {
		return (EAttribute)bulkActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBulkAction_Title() {
		return (EAttribute)bulkActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBulkAction_Icon() {
		return (EAttribute)bulkActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldBase() {
		return fieldBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldBase_Key() {
		return (EAttribute)fieldBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldBase_Label() {
		return (EAttribute)fieldBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldBase_Index() {
		return (EAttribute)fieldBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldBase_Unique() {
		return (EAttribute)fieldBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldBase_Required() {
		return (EAttribute)fieldBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldTypeRepository() {
		return fieldTypeRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldTypeRepository_FieldType() {
		return (EReference)fieldTypeRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldType() {
		return fieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldType_Key() {
		return (EAttribute)fieldTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_Config() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_Input() {
		return (EReference)fieldTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldType_AdapterFromDB() {
		return (EAttribute)fieldTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldType_AdapterToDB() {
		return (EAttribute)fieldTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldType_AdapterSearch() {
		return (EAttribute)fieldTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBFieldConfig() {
		return dbFieldConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBFieldConfig_Type() {
		return (EAttribute)dbFieldConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBFieldConfig_Expression() {
		return (EAttribute)dbFieldConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVueElement() {
		return vueElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVueElement_Tag() {
		return (EAttribute)vueElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVueElement_UrlJs() {
		return (EAttribute)vueElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVueElement_UrlCss() {
		return (EAttribute)vueElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVueElement_Params() {
		return (EAttribute)vueElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVueElement_Validation() {
		return (EAttribute)vueElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVueElement_Component() {
		return (EAttribute)vueElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHttpMethod() {
		return httpMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public crudrestFactory getcrudrestFactory() {
		return (crudrestFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pluginCreatorEClass = createEClass(PLUGIN_CREATOR);
		createEReference(pluginCreatorEClass, PLUGIN_CREATOR__PLUGIN);
		createEReference(pluginCreatorEClass, PLUGIN_CREATOR__REPOSITORY);

		crudRestPluginEClass = createEClass(CRUD_REST_PLUGIN);
		createEAttribute(crudRestPluginEClass, CRUD_REST_PLUGIN__NAME);
		createEReference(crudRestPluginEClass, CRUD_REST_PLUGIN__DETAIL);
		createEReference(crudRestPluginEClass, CRUD_REST_PLUGIN__GUI);
		createEAttribute(crudRestPluginEClass, CRUD_REST_PLUGIN__HAS_ACCESS_CONTROL);
		createEReference(crudRestPluginEClass, CRUD_REST_PLUGIN__SERVICE_PROVIDER);

		pluginDetailEClass = createEClass(PLUGIN_DETAIL);
		createEAttribute(pluginDetailEClass, PLUGIN_DETAIL__PREFIX);
		createEAttribute(pluginDetailEClass, PLUGIN_DETAIL__DESCRIPTION);
		createEAttribute(pluginDetailEClass, PLUGIN_DETAIL__VERSION);
		createEAttribute(pluginDetailEClass, PLUGIN_DETAIL__DB_VERSION);
		createEAttribute(pluginDetailEClass, PLUGIN_DETAIL__PLUGIN_URI);
		createEAttribute(pluginDetailEClass, PLUGIN_DETAIL__AUTHOR);
		createEAttribute(pluginDetailEClass, PLUGIN_DETAIL__AUTHOR_URI);
		createEAttribute(pluginDetailEClass, PLUGIN_DETAIL__LICENSE);
		createEAttribute(pluginDetailEClass, PLUGIN_DETAIL__LICENSE_URI);
		createEAttribute(pluginDetailEClass, PLUGIN_DETAIL__TEXT_DOMAIN);
		createEAttribute(pluginDetailEClass, PLUGIN_DETAIL__DOMAIN_PATH);
		createEAttribute(pluginDetailEClass, PLUGIN_DETAIL__DIRECTORY);
		createEAttribute(pluginDetailEClass, PLUGIN_DETAIL__MIN_VERSION_WP);
		createEAttribute(pluginDetailEClass, PLUGIN_DETAIL__MIN_VERSION_PHP);
		createEAttribute(pluginDetailEClass, PLUGIN_DETAIL__UPDATE_URI);
		createEAttribute(pluginDetailEClass, PLUGIN_DETAIL__NETWORK);

		pluginWebServiceEClass = createEClass(PLUGIN_WEB_SERVICE);
		createEReference(pluginWebServiceEClass, PLUGIN_WEB_SERVICE__EXTEND);
		createEReference(pluginWebServiceEClass, PLUGIN_WEB_SERVICE__ENTITY_MODEL);

		webserviceFunctionEClass = createEClass(WEBSERVICE_FUNCTION);
		createEAttribute(webserviceFunctionEClass, WEBSERVICE_FUNCTION__METHOD);
		createEAttribute(webserviceFunctionEClass, WEBSERVICE_FUNCTION__NAME);
		createEAttribute(webserviceFunctionEClass, WEBSERVICE_FUNCTION__CHECK_ACCESS_CONTROL);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__KEY);
		createEAttribute(entityEClass, ENTITY__LABEL);
		createEAttribute(entityEClass, ENTITY__LABEL_PLURAL);
		createEAttribute(entityEClass, ENTITY__TITLE_SCRIPT);
		createEReference(entityEClass, ENTITY__FIELDS);
		createEReference(entityEClass, ENTITY__RELATIONS);

		fieldEClass = createEClass(FIELD);
		createEReference(fieldEClass, FIELD__TYPE);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__ENTITY);
		createEAttribute(relationEClass, RELATION__MANY);
		createEReference(relationEClass, RELATION__OPPOSITE);

		pluginGUIEClass = createEClass(PLUGIN_GUI);
		createEAttribute(pluginGUIEClass, PLUGIN_GUI__CLASS);
		createEAttribute(pluginGUIEClass, PLUGIN_GUI__STYLE);
		createEReference(pluginGUIEClass, PLUGIN_GUI__MENU);
		createEReference(pluginGUIEClass, PLUGIN_GUI__PAGE);
		createEReference(pluginGUIEClass, PLUGIN_GUI__REUSABLE_LAYOUT);

		layoutEClass = createEClass(LAYOUT);
		createEAttribute(layoutEClass, LAYOUT__NAME);
		createEAttribute(layoutEClass, LAYOUT__COL_XS);
		createEAttribute(layoutEClass, LAYOUT__COL_SM);
		createEAttribute(layoutEClass, LAYOUT__COL_MD);
		createEAttribute(layoutEClass, LAYOUT__COL_LG);
		createEAttribute(layoutEClass, LAYOUT__COL_XL);
		createEAttribute(layoutEClass, LAYOUT__CLASS);
		createEAttribute(layoutEClass, LAYOUT__STYLE);

		menuEClass = createEClass(MENU);
		createEReference(menuEClass, MENU__ITEMS);
		createEAttribute(menuEClass, MENU__TITLE);
		createEAttribute(menuEClass, MENU__SLUG);
		createEAttribute(menuEClass, MENU__ICON);

		menuItemEClass = createEClass(MENU_ITEM);
		createEReference(menuItemEClass, MENU_ITEM__PAGE);
		createEAttribute(menuItemEClass, MENU_ITEM__OVERRIDE_TITLE);

		uiPageEClass = createEClass(UI_PAGE);
		createEAttribute(uiPageEClass, UI_PAGE__KEY);
		createEReference(uiPageEClass, UI_PAGE__ENTITY);
		createEReference(uiPageEClass, UI_PAGE__FORM);
		createEReference(uiPageEClass, UI_PAGE__LIST);
		createEAttribute(uiPageEClass, UI_PAGE__OVERRIDE_TITLE);

		formEClass = createEClass(FORM);
		createEReference(formEClass, FORM__FIELD_LAYOUT);

		fieldLayoutEClass = createEClass(FIELD_LAYOUT);
		createEReference(fieldLayoutEClass, FIELD_LAYOUT__FIELD);
		createEReference(fieldLayoutEClass, FIELD_LAYOUT__LAYOUT);

		listEClass = createEClass(LIST);
		createEAttribute(listEClass, LIST__SHOW_CREATE_BUTTON);
		createEAttribute(listEClass, LIST__SHOW_EDIT_BUTTON);
		createEAttribute(listEClass, LIST__SHOW_SEARCH_BOX);
		createEAttribute(listEClass, LIST__SHOW_VIEW_DETAIL_BUTTON);
		createEAttribute(listEClass, LIST__SHOW_DELETE_BUTTON);
		createEAttribute(listEClass, LIST__SHOW_ID_COL);
		createEAttribute(listEClass, LIST__ITEMS_PER_PAGE);
		createEReference(listEClass, LIST__LIST_COLUMNS);
		createEReference(listEClass, LIST__SORTABLE_COLUMNS);
		createEReference(listEClass, LIST__SEARCHABLE_COLUMNS);
		createEAttribute(listEClass, LIST__EXTEND_WHERE_CLAUSE);
		createEReference(listEClass, LIST__BULK_ACTION);

		bulkActionEClass = createEClass(BULK_ACTION);
		createEAttribute(bulkActionEClass, BULK_ACTION__KEY);
		createEAttribute(bulkActionEClass, BULK_ACTION__TITLE);
		createEAttribute(bulkActionEClass, BULK_ACTION__ICON);

		fieldBaseEClass = createEClass(FIELD_BASE);
		createEAttribute(fieldBaseEClass, FIELD_BASE__KEY);
		createEAttribute(fieldBaseEClass, FIELD_BASE__LABEL);
		createEAttribute(fieldBaseEClass, FIELD_BASE__INDEX);
		createEAttribute(fieldBaseEClass, FIELD_BASE__UNIQUE);
		createEAttribute(fieldBaseEClass, FIELD_BASE__REQUIRED);

		fieldTypeRepositoryEClass = createEClass(FIELD_TYPE_REPOSITORY);
		createEReference(fieldTypeRepositoryEClass, FIELD_TYPE_REPOSITORY__FIELD_TYPE);

		fieldTypeEClass = createEClass(FIELD_TYPE);
		createEAttribute(fieldTypeEClass, FIELD_TYPE__KEY);
		createEReference(fieldTypeEClass, FIELD_TYPE__CONFIG);
		createEReference(fieldTypeEClass, FIELD_TYPE__INPUT);
		createEAttribute(fieldTypeEClass, FIELD_TYPE__ADAPTER_FROM_DB);
		createEAttribute(fieldTypeEClass, FIELD_TYPE__ADAPTER_TO_DB);
		createEAttribute(fieldTypeEClass, FIELD_TYPE__ADAPTER_SEARCH);

		dbFieldConfigEClass = createEClass(DB_FIELD_CONFIG);
		createEAttribute(dbFieldConfigEClass, DB_FIELD_CONFIG__TYPE);
		createEAttribute(dbFieldConfigEClass, DB_FIELD_CONFIG__EXPRESSION);

		vueElementEClass = createEClass(VUE_ELEMENT);
		createEAttribute(vueElementEClass, VUE_ELEMENT__TAG);
		createEAttribute(vueElementEClass, VUE_ELEMENT__URL_JS);
		createEAttribute(vueElementEClass, VUE_ELEMENT__URL_CSS);
		createEAttribute(vueElementEClass, VUE_ELEMENT__PARAMS);
		createEAttribute(vueElementEClass, VUE_ELEMENT__VALIDATION);
		createEAttribute(vueElementEClass, VUE_ELEMENT__COMPONENT);

		// Create enums
		httpMethodEEnum = createEEnum(HTTP_METHOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fieldEClass.getESuperTypes().add(this.getFieldBase());
		relationEClass.getESuperTypes().add(this.getFieldBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(pluginCreatorEClass, PluginCreator.class, "PluginCreator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPluginCreator_Plugin(), this.getCrudRestPlugin(), null, "plugin", null, 0, 1, PluginCreator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginCreator_Repository(), this.getFieldTypeRepository(), null, "repository", null, 1, 1, PluginCreator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crudRestPluginEClass, CrudRestPlugin.class, "CrudRestPlugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCrudRestPlugin_Name(), ecorePackage.getEString(), "name", "SamplePlugin", 1, 1, CrudRestPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrudRestPlugin_Detail(), this.getPluginDetail(), null, "detail", null, 1, 1, CrudRestPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrudRestPlugin_Gui(), this.getPluginGUI(), null, "gui", null, 0, 1, CrudRestPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrudRestPlugin_HasAccessControl(), ecorePackage.getEBoolean(), "hasAccessControl", null, 1, 1, CrudRestPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrudRestPlugin_ServiceProvider(), this.getPluginWebService(), null, "serviceProvider", null, 0, 1, CrudRestPlugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginDetailEClass, PluginDetail.class, "PluginDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPluginDetail_Prefix(), ecorePackage.getEString(), "prefix", "crwp", 1, 1, PluginDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDetail_Description(), ecorePackage.getEString(), "description", null, 0, 1, PluginDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDetail_Version(), ecorePackage.getEString(), "version", "1.0.0", 1, 1, PluginDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDetail_DbVersion(), ecorePackage.getEInt(), "dbVersion", "1", 1, 1, PluginDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDetail_PluginURI(), ecorePackage.getEString(), "pluginURI", null, 0, 1, PluginDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDetail_Author(), ecorePackage.getEString(), "author", null, 0, 1, PluginDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDetail_AuthorURI(), ecorePackage.getEString(), "authorURI", null, 0, 1, PluginDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDetail_License(), ecorePackage.getEString(), "license", null, 0, 1, PluginDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDetail_LicenseURI(), ecorePackage.getEString(), "licenseURI", null, 0, 1, PluginDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDetail_TextDomain(), ecorePackage.getEString(), "textDomain", "crwp", 0, 1, PluginDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDetail_DomainPath(), ecorePackage.getEString(), "domainPath", "languages", 0, 1, PluginDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDetail_Directory(), ecorePackage.getEString(), "directory", "crwp", 1, 1, PluginDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDetail_MinVersionWP(), ecorePackage.getEString(), "minVersionWP", "4.7", 0, 1, PluginDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDetail_MinVersionPHP(), ecorePackage.getEString(), "minVersionPHP", "5.6.20", 0, 1, PluginDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDetail_UpdateURI(), ecorePackage.getEString(), "updateURI", null, 0, 1, PluginDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDetail_Network(), ecorePackage.getEBoolean(), "network", null, 0, 1, PluginDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginWebServiceEClass, PluginWebService.class, "PluginWebService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPluginWebService_Extend(), this.getWebserviceFunction(), null, "extend", null, 0, -1, PluginWebService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginWebService_EntityModel(), this.getEntity(), null, "entityModel", null, 0, -1, PluginWebService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webserviceFunctionEClass, WebserviceFunction.class, "WebserviceFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebserviceFunction_Method(), this.getHttpMethod(), "method", null, 1, 1, WebserviceFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebserviceFunction_Name(), ecorePackage.getEString(), "name", null, 1, 1, WebserviceFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebserviceFunction_CheckAccessControl(), ecorePackage.getEBoolean(), "checkAccessControl", null, 0, 1, WebserviceFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Key(), ecorePackage.getEString(), "key", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Label(), ecorePackage.getEString(), "label", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_LabelPlural(), ecorePackage.getEString(), "labelPlural", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_TitleScript(), ecorePackage.getEString(), "titleScript", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Fields(), this.getField(), null, "fields", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Relations(), this.getRelation(), null, "relations", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getField_Type(), this.getFieldType(), null, "type", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getField_Type().getEKeys().add(this.getFieldType_Key());

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_Entity(), this.getEntity(), null, "entity", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Opposite(), this.getRelation(), null, "opposite", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginGUIEClass, PluginGUI.class, "PluginGUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPluginGUI_Class(), ecorePackage.getEString(), "class", null, 0, 1, PluginGUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginGUI_Style(), ecorePackage.getEString(), "style", null, 0, 1, PluginGUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginGUI_Menu(), this.getMenu(), null, "menu", null, 0, 1, PluginGUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginGUI_Page(), this.getUIPage(), null, "page", null, 0, -1, PluginGUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginGUI_ReusableLayout(), this.getLayout(), null, "reusableLayout", null, 0, -1, PluginGUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayout_Name(), ecorePackage.getEString(), "name", null, 1, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Col_xs(), ecorePackage.getEInt(), "col_xs", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Col_sm(), ecorePackage.getEInt(), "col_sm", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Col_md(), ecorePackage.getEInt(), "col_md", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Col_lg(), ecorePackage.getEInt(), "col_lg", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Col_xl(), ecorePackage.getEInt(), "col_xl", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Class(), ecorePackage.getEString(), "class", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Style(), ecorePackage.getEString(), "style", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenu_Items(), this.getMenuItem(), null, "items", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_Title(), ecorePackage.getEString(), "title", null, 1, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_Slug(), ecorePackage.getEString(), "slug", null, 1, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuItemEClass, MenuItem.class, "MenuItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenuItem_Page(), this.getUIPage(), null, "page", null, 1, 1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenuItem_OverrideTitle(), ecorePackage.getEString(), "overrideTitle", null, 0, 1, MenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiPageEClass, UIPage.class, "UIPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIPage_Key(), ecorePackage.getEString(), "key", null, 1, 1, UIPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIPage_Entity(), this.getEntity(), null, "entity", null, 1, 1, UIPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIPage_Form(), this.getForm(), null, "form", null, 0, 1, UIPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIPage_List(), this.getList(), null, "list", null, 0, 1, UIPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIPage_OverrideTitle(), ecorePackage.getEString(), "overrideTitle", null, 0, 1, UIPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForm_FieldLayout(), this.getFieldLayout(), null, "fieldLayout", null, 0, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldLayoutEClass, FieldLayout.class, "FieldLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldLayout_Field(), this.getFieldBase(), null, "field", null, 1, 1, FieldLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldLayout_Layout(), this.getLayout(), null, "layout", null, 0, 1, FieldLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getList_ShowCreateButton(), ecorePackage.getEBoolean(), "showCreateButton", "true", 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_ShowEditButton(), ecorePackage.getEBoolean(), "showEditButton", "true", 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_ShowSearchBox(), ecorePackage.getEBoolean(), "showSearchBox", "true", 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_ShowViewDetailButton(), ecorePackage.getEBoolean(), "showViewDetailButton", "true", 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_ShowDeleteButton(), ecorePackage.getEBoolean(), "showDeleteButton", "true", 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_ShowIdCol(), ecorePackage.getEBoolean(), "showIdCol", "true", 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_ItemsPerPage(), ecorePackage.getEInt(), "itemsPerPage", "10", 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getList_ListColumns(), this.getFieldBase(), null, "listColumns", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getList_SortableColumns(), this.getFieldBase(), null, "sortableColumns", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getList_SearchableColumns(), this.getFieldBase(), null, "searchableColumns", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getList_ExtendWhereClause(), ecorePackage.getEString(), "extendWhereClause", null, 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getList_BulkAction(), this.getBulkAction(), null, "bulkAction", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bulkActionEClass, BulkAction.class, "BulkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBulkAction_Key(), ecorePackage.getEString(), "key", null, 1, 1, BulkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBulkAction_Title(), ecorePackage.getEString(), "title", null, 1, 1, BulkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBulkAction_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, BulkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldBaseEClass, FieldBase.class, "FieldBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldBase_Key(), ecorePackage.getEString(), "key", null, 0, 1, FieldBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldBase_Label(), ecorePackage.getEString(), "label", null, 0, 1, FieldBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldBase_Index(), ecorePackage.getEBoolean(), "index", null, 0, 1, FieldBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldBase_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, FieldBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldBase_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, FieldBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldTypeRepositoryEClass, FieldTypeRepository.class, "FieldTypeRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldTypeRepository_FieldType(), this.getFieldType(), null, "fieldType", null, 0, -1, FieldTypeRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldTypeEClass, FieldType.class, "FieldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldType_Key(), ecorePackage.getEString(), "key", null, 1, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_Config(), this.getDBFieldConfig(), null, "config", null, 1, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType_Input(), this.getVueElement(), null, "input", null, 1, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldType_AdapterFromDB(), ecorePackage.getEString(), "adapterFromDB", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldType_AdapterToDB(), ecorePackage.getEString(), "adapterToDB", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldType_AdapterSearch(), ecorePackage.getEString(), "adapterSearch", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dbFieldConfigEClass, DBFieldConfig.class, "DBFieldConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDBFieldConfig_Type(), ecorePackage.getEString(), "type", "VARCHAR", 1, 1, DBFieldConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBFieldConfig_Expression(), ecorePackage.getEString(), "expression", "", 0, 1, DBFieldConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vueElementEClass, VueElement.class, "VueElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVueElement_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, VueElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVueElement_UrlJs(), ecorePackage.getEString(), "urlJs", null, 0, 1, VueElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVueElement_UrlCss(), ecorePackage.getEString(), "urlCss", null, 0, 1, VueElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVueElement_Params(), ecorePackage.getEString(), "params", null, 0, 1, VueElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVueElement_Validation(), ecorePackage.getEString(), "validation", null, 0, 1, VueElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVueElement_Component(), ecorePackage.getEString(), "component", null, 0, 1, VueElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(httpMethodEEnum, HttpMethod.class, "HttpMethod");
		addEEnumLiteral(httpMethodEEnum, HttpMethod.GET);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.POST);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.PUT);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.DELETE);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.PATCH);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.HEAD);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.OPTIONS);

		// Create resource
		createResource(eNS_URI);
	}

} //crudrestPackageImpl
