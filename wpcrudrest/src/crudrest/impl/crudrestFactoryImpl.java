/**
 */
package crudrest.impl;

import crudrest.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class crudrestFactoryImpl extends EFactoryImpl implements crudrestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static crudrestFactory init() {
		try {
			crudrestFactory thecrudrestFactory = (crudrestFactory)EPackage.Registry.INSTANCE.getEFactory(crudrestPackage.eNS_URI);
			if (thecrudrestFactory != null) {
				return thecrudrestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new crudrestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public crudrestFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case crudrestPackage.PLUGIN_CREATOR: return createPluginCreator();
			case crudrestPackage.CRUD_REST_PLUGIN: return createCrudRestPlugin();
			case crudrestPackage.PLUGIN_DETAIL: return createPluginDetail();
			case crudrestPackage.PLUGIN_WEB_SERVICE: return createPluginWebService();
			case crudrestPackage.WEBSERVICE_FUNCTION: return createWebserviceFunction();
			case crudrestPackage.ENTITY: return createEntity();
			case crudrestPackage.FIELD: return createField();
			case crudrestPackage.RELATION: return createRelation();
			case crudrestPackage.PLUGIN_GUI: return createPluginGUI();
			case crudrestPackage.LAYOUT: return createLayout();
			case crudrestPackage.MENU: return createMenu();
			case crudrestPackage.MENU_ITEM: return createMenuItem();
			case crudrestPackage.UI_PAGE: return createUIPage();
			case crudrestPackage.FORM: return createForm();
			case crudrestPackage.FIELD_LAYOUT: return createFieldLayout();
			case crudrestPackage.LIST: return createList();
			case crudrestPackage.BULK_ACTION: return createBulkAction();
			case crudrestPackage.FIELD_BASE: return createFieldBase();
			case crudrestPackage.FIELD_TYPE_REPOSITORY: return createFieldTypeRepository();
			case crudrestPackage.FIELD_TYPE: return createFieldType();
			case crudrestPackage.DB_FIELD_CONFIG: return createDBFieldConfig();
			case crudrestPackage.VUE_ELEMENT: return createVueElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case crudrestPackage.HTTP_METHOD:
				return createHttpMethodFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case crudrestPackage.HTTP_METHOD:
				return convertHttpMethodToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginCreator createPluginCreator() {
		PluginCreatorImpl pluginCreator = new PluginCreatorImpl();
		return pluginCreator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrudRestPlugin createCrudRestPlugin() {
		CrudRestPluginImpl crudRestPlugin = new CrudRestPluginImpl();
		return crudRestPlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginDetail createPluginDetail() {
		PluginDetailImpl pluginDetail = new PluginDetailImpl();
		return pluginDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginWebService createPluginWebService() {
		PluginWebServiceImpl pluginWebService = new PluginWebServiceImpl();
		return pluginWebService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebserviceFunction createWebserviceFunction() {
		WebserviceFunctionImpl webserviceFunction = new WebserviceFunctionImpl();
		return webserviceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginGUI createPluginGUI() {
		PluginGUIImpl pluginGUI = new PluginGUIImpl();
		return pluginGUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuItem createMenuItem() {
		MenuItemImpl menuItem = new MenuItemImpl();
		return menuItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIPage createUIPage() {
		UIPageImpl uiPage = new UIPageImpl();
		return uiPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldLayout createFieldLayout() {
		FieldLayoutImpl fieldLayout = new FieldLayoutImpl();
		return fieldLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BulkAction createBulkAction() {
		BulkActionImpl bulkAction = new BulkActionImpl();
		return bulkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldBase createFieldBase() {
		FieldBaseImpl fieldBase = new FieldBaseImpl();
		return fieldBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldTypeRepository createFieldTypeRepository() {
		FieldTypeRepositoryImpl fieldTypeRepository = new FieldTypeRepositoryImpl();
		return fieldTypeRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldType createFieldType() {
		FieldTypeImpl fieldType = new FieldTypeImpl();
		return fieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBFieldConfig createDBFieldConfig() {
		DBFieldConfigImpl dbFieldConfig = new DBFieldConfigImpl();
		return dbFieldConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VueElement createVueElement() {
		VueElementImpl vueElement = new VueElementImpl();
		return vueElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod createHttpMethodFromString(EDataType eDataType, String initialValue) {
		HttpMethod result = HttpMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public crudrestPackage getcrudrestPackage() {
		return (crudrestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static crudrestPackage getPackage() {
		return crudrestPackage.eINSTANCE;
	}

} //crudrestFactoryImpl
