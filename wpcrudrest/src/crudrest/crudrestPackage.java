/**
 */
package crudrest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see crudrest.crudrestFactory
 * @model kind="package"
 * @generated
 */
public interface crudrestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "crudrest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://crudrest.msde.ui.ac.ir";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "crudrest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	crudrestPackage eINSTANCE = crudrest.impl.crudrestPackageImpl.init();

	/**
	 * The meta object id for the '{@link crudrest.impl.PluginCreatorImpl <em>Plugin Creator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.PluginCreatorImpl
	 * @see crudrest.impl.crudrestPackageImpl#getPluginCreator()
	 * @generated
	 */
	int PLUGIN_CREATOR = 0;

	/**
	 * The feature id for the '<em><b>Plugin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_CREATOR__PLUGIN = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_CREATOR__REPOSITORY = 1;

	/**
	 * The number of structural features of the '<em>Plugin Creator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_CREATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Plugin Creator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_CREATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.CrudRestPluginImpl <em>Crud Rest Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.CrudRestPluginImpl
	 * @see crudrest.impl.crudrestPackageImpl#getCrudRestPlugin()
	 * @generated
	 */
	int CRUD_REST_PLUGIN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_REST_PLUGIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_REST_PLUGIN__DETAIL = 1;

	/**
	 * The feature id for the '<em><b>Gui</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_REST_PLUGIN__GUI = 2;

	/**
	 * The feature id for the '<em><b>Has Access Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_REST_PLUGIN__HAS_ACCESS_CONTROL = 3;

	/**
	 * The feature id for the '<em><b>Service Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_REST_PLUGIN__SERVICE_PROVIDER = 4;

	/**
	 * The number of structural features of the '<em>Crud Rest Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_REST_PLUGIN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Crud Rest Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_REST_PLUGIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.PluginDetailImpl <em>Plugin Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.PluginDetailImpl
	 * @see crudrest.impl.crudrestPackageImpl#getPluginDetail()
	 * @generated
	 */
	int PLUGIN_DETAIL = 2;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL__PREFIX = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Db Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL__DB_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Plugin URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL__PLUGIN_URI = 4;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL__AUTHOR = 5;

	/**
	 * The feature id for the '<em><b>Author URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL__AUTHOR_URI = 6;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL__LICENSE = 7;

	/**
	 * The feature id for the '<em><b>License URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL__LICENSE_URI = 8;

	/**
	 * The feature id for the '<em><b>Text Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL__TEXT_DOMAIN = 9;

	/**
	 * The feature id for the '<em><b>Domain Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL__DOMAIN_PATH = 10;

	/**
	 * The feature id for the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL__DIRECTORY = 11;

	/**
	 * The feature id for the '<em><b>Min Version WP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL__MIN_VERSION_WP = 12;

	/**
	 * The feature id for the '<em><b>Min Version PHP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL__MIN_VERSION_PHP = 13;

	/**
	 * The feature id for the '<em><b>Update URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL__UPDATE_URI = 14;

	/**
	 * The feature id for the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL__NETWORK = 15;

	/**
	 * The number of structural features of the '<em>Plugin Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Plugin Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_DETAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.PluginWebServiceImpl <em>Plugin Web Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.PluginWebServiceImpl
	 * @see crudrest.impl.crudrestPackageImpl#getPluginWebService()
	 * @generated
	 */
	int PLUGIN_WEB_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Extend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_WEB_SERVICE__EXTEND = 0;

	/**
	 * The feature id for the '<em><b>Entity Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_WEB_SERVICE__ENTITY_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Plugin Web Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_WEB_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Plugin Web Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_WEB_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.WebserviceFunctionImpl <em>Webservice Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.WebserviceFunctionImpl
	 * @see crudrest.impl.crudrestPackageImpl#getWebserviceFunction()
	 * @generated
	 */
	int WEBSERVICE_FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVICE_FUNCTION__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVICE_FUNCTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Check Access Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVICE_FUNCTION__CHECK_ACCESS_CONTROL = 2;

	/**
	 * The number of structural features of the '<em>Webservice Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVICE_FUNCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Webservice Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBSERVICE_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.EntityImpl
	 * @see crudrest.impl.crudrestPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Label Plural</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__LABEL_PLURAL = 2;

	/**
	 * The feature id for the '<em><b>Title Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TITLE_SCRIPT = 3;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FIELDS = 4;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__RELATIONS = 5;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.FieldBaseImpl <em>Field Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.FieldBaseImpl
	 * @see crudrest.impl.crudrestPackageImpl#getFieldBase()
	 * @generated
	 */
	int FIELD_BASE = 17;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BASE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BASE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BASE__INDEX = 2;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BASE__UNIQUE = 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BASE__REQUIRED = 4;

	/**
	 * The number of structural features of the '<em>Field Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BASE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Field Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.FieldImpl
	 * @see crudrest.impl.crudrestPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__KEY = FIELD_BASE__KEY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__LABEL = FIELD_BASE__LABEL;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__INDEX = FIELD_BASE__INDEX;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__UNIQUE = FIELD_BASE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__REQUIRED = FIELD_BASE__REQUIRED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = FIELD_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = FIELD_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = FIELD_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.RelationImpl
	 * @see crudrest.impl.crudrestPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__KEY = FIELD_BASE__KEY;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__LABEL = FIELD_BASE__LABEL;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__INDEX = FIELD_BASE__INDEX;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__UNIQUE = FIELD_BASE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__REQUIRED = FIELD_BASE__REQUIRED;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ENTITY = FIELD_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MANY = FIELD_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OPPOSITE = FIELD_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = FIELD_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = FIELD_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.PluginGUIImpl <em>Plugin GUI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.PluginGUIImpl
	 * @see crudrest.impl.crudrestPackageImpl#getPluginGUI()
	 * @generated
	 */
	int PLUGIN_GUI = 8;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_GUI__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_GUI__STYLE = 1;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_GUI__MENU = 2;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_GUI__PAGE = 3;

	/**
	 * The feature id for the '<em><b>Reusable Layout</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_GUI__REUSABLE_LAYOUT = 4;

	/**
	 * The number of structural features of the '<em>Plugin GUI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_GUI_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Plugin GUI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_GUI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.LayoutImpl
	 * @see crudrest.impl.crudrestPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Col xs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__COL_XS = 1;

	/**
	 * The feature id for the '<em><b>Col sm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__COL_SM = 2;

	/**
	 * The feature id for the '<em><b>Col md</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__COL_MD = 3;

	/**
	 * The feature id for the '<em><b>Col lg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__COL_LG = 4;

	/**
	 * The feature id for the '<em><b>Col xl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__COL_XL = 5;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__CLASS = 6;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__STYLE = 7;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.MenuImpl
	 * @see crudrest.impl.crudrestPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 10;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__SLUG = 2;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ICON = 3;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.MenuItemImpl <em>Menu Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.MenuItemImpl
	 * @see crudrest.impl.crudrestPackageImpl#getMenuItem()
	 * @generated
	 */
	int MENU_ITEM = 11;

	/**
	 * The feature id for the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__PAGE = 0;

	/**
	 * The feature id for the '<em><b>Override Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM__OVERRIDE_TITLE = 1;

	/**
	 * The number of structural features of the '<em>Menu Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Menu Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.UIPageImpl <em>UI Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.UIPageImpl
	 * @see crudrest.impl.crudrestPackageImpl#getUIPage()
	 * @generated
	 */
	int UI_PAGE = 12;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PAGE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PAGE__ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PAGE__FORM = 2;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PAGE__LIST = 3;

	/**
	 * The feature id for the '<em><b>Override Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PAGE__OVERRIDE_TITLE = 4;

	/**
	 * The number of structural features of the '<em>UI Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PAGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>UI Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.FormImpl
	 * @see crudrest.impl.crudrestPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 13;

	/**
	 * The feature id for the '<em><b>Field Layout</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__FIELD_LAYOUT = 0;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.FieldLayoutImpl <em>Field Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.FieldLayoutImpl
	 * @see crudrest.impl.crudrestPackageImpl#getFieldLayout()
	 * @generated
	 */
	int FIELD_LAYOUT = 14;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_LAYOUT__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_LAYOUT__LAYOUT = 1;

	/**
	 * The number of structural features of the '<em>Field Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_LAYOUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.ListImpl
	 * @see crudrest.impl.crudrestPackageImpl#getList()
	 * @generated
	 */
	int LIST = 15;

	/**
	 * The feature id for the '<em><b>Show Create Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SHOW_CREATE_BUTTON = 0;

	/**
	 * The feature id for the '<em><b>Show Edit Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SHOW_EDIT_BUTTON = 1;

	/**
	 * The feature id for the '<em><b>Show Search Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SHOW_SEARCH_BOX = 2;

	/**
	 * The feature id for the '<em><b>Show View Detail Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SHOW_VIEW_DETAIL_BUTTON = 3;

	/**
	 * The feature id for the '<em><b>Show Delete Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SHOW_DELETE_BUTTON = 4;

	/**
	 * The feature id for the '<em><b>Show Id Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SHOW_ID_COL = 5;

	/**
	 * The feature id for the '<em><b>Items Per Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ITEMS_PER_PAGE = 6;

	/**
	 * The feature id for the '<em><b>List Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LIST_COLUMNS = 7;

	/**
	 * The feature id for the '<em><b>Sortable Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SORTABLE_COLUMNS = 8;

	/**
	 * The feature id for the '<em><b>Searchable Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SEARCHABLE_COLUMNS = 9;

	/**
	 * The feature id for the '<em><b>Extend Where Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__EXTEND_WHERE_CLAUSE = 10;

	/**
	 * The feature id for the '<em><b>Bulk Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__BULK_ACTION = 11;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.BulkActionImpl <em>Bulk Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.BulkActionImpl
	 * @see crudrest.impl.crudrestPackageImpl#getBulkAction()
	 * @generated
	 */
	int BULK_ACTION = 16;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_ACTION__KEY = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_ACTION__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_ACTION__ICON = 2;

	/**
	 * The number of structural features of the '<em>Bulk Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_ACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bulk Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULK_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.FieldTypeRepositoryImpl <em>Field Type Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.FieldTypeRepositoryImpl
	 * @see crudrest.impl.crudrestPackageImpl#getFieldTypeRepository()
	 * @generated
	 */
	int FIELD_TYPE_REPOSITORY = 18;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_REPOSITORY__FIELD_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Field Type Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Field Type Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.FieldTypeImpl <em>Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.FieldTypeImpl
	 * @see crudrest.impl.crudrestPackageImpl#getFieldType()
	 * @generated
	 */
	int FIELD_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__INPUT = 2;

	/**
	 * The feature id for the '<em><b>Adapter From DB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__ADAPTER_FROM_DB = 3;

	/**
	 * The feature id for the '<em><b>Adapter To DB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__ADAPTER_TO_DB = 4;

	/**
	 * The number of structural features of the '<em>Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.DBFieldConfigImpl <em>DB Field Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.DBFieldConfigImpl
	 * @see crudrest.impl.crudrestPackageImpl#getDBFieldConfig()
	 * @generated
	 */
	int DB_FIELD_CONFIG = 20;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_FIELD_CONFIG__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_FIELD_CONFIG__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Search Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_FIELD_CONFIG__SEARCH_ADAPTER = 2;

	/**
	 * The number of structural features of the '<em>DB Field Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_FIELD_CONFIG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>DB Field Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_FIELD_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.impl.VueElementImpl <em>Vue Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.impl.VueElementImpl
	 * @see crudrest.impl.crudrestPackageImpl#getVueElement()
	 * @generated
	 */
	int VUE_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUE_ELEMENT__TAG = 0;

	/**
	 * The feature id for the '<em><b>Url Js</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUE_ELEMENT__URL_JS = 1;

	/**
	 * The feature id for the '<em><b>Url Css</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUE_ELEMENT__URL_CSS = 2;

	/**
	 * The feature id for the '<em><b>Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUE_ELEMENT__PARAMS = 3;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUE_ELEMENT__VALIDATION = 4;

	/**
	 * The feature id for the '<em><b>Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUE_ELEMENT__COMPONENT = 5;

	/**
	 * The number of structural features of the '<em>Vue Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUE_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Vue Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link crudrest.HttpMethod <em>Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crudrest.HttpMethod
	 * @see crudrest.impl.crudrestPackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 22;


	/**
	 * Returns the meta object for class '{@link crudrest.PluginCreator <em>Plugin Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Creator</em>'.
	 * @see crudrest.PluginCreator
	 * @generated
	 */
	EClass getPluginCreator();

	/**
	 * Returns the meta object for the containment reference '{@link crudrest.PluginCreator#getPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plugin</em>'.
	 * @see crudrest.PluginCreator#getPlugin()
	 * @see #getPluginCreator()
	 * @generated
	 */
	EReference getPluginCreator_Plugin();

	/**
	 * Returns the meta object for the reference '{@link crudrest.PluginCreator#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see crudrest.PluginCreator#getRepository()
	 * @see #getPluginCreator()
	 * @generated
	 */
	EReference getPluginCreator_Repository();

	/**
	 * Returns the meta object for class '{@link crudrest.CrudRestPlugin <em>Crud Rest Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crud Rest Plugin</em>'.
	 * @see crudrest.CrudRestPlugin
	 * @generated
	 */
	EClass getCrudRestPlugin();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.CrudRestPlugin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crudrest.CrudRestPlugin#getName()
	 * @see #getCrudRestPlugin()
	 * @generated
	 */
	EAttribute getCrudRestPlugin_Name();

	/**
	 * Returns the meta object for the containment reference '{@link crudrest.CrudRestPlugin#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Detail</em>'.
	 * @see crudrest.CrudRestPlugin#getDetail()
	 * @see #getCrudRestPlugin()
	 * @generated
	 */
	EReference getCrudRestPlugin_Detail();

	/**
	 * Returns the meta object for the containment reference '{@link crudrest.CrudRestPlugin#getGui <em>Gui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gui</em>'.
	 * @see crudrest.CrudRestPlugin#getGui()
	 * @see #getCrudRestPlugin()
	 * @generated
	 */
	EReference getCrudRestPlugin_Gui();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.CrudRestPlugin#isHasAccessControl <em>Has Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Access Control</em>'.
	 * @see crudrest.CrudRestPlugin#isHasAccessControl()
	 * @see #getCrudRestPlugin()
	 * @generated
	 */
	EAttribute getCrudRestPlugin_HasAccessControl();

	/**
	 * Returns the meta object for the containment reference '{@link crudrest.CrudRestPlugin#getServiceProvider <em>Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Provider</em>'.
	 * @see crudrest.CrudRestPlugin#getServiceProvider()
	 * @see #getCrudRestPlugin()
	 * @generated
	 */
	EReference getCrudRestPlugin_ServiceProvider();

	/**
	 * Returns the meta object for class '{@link crudrest.PluginDetail <em>Plugin Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Detail</em>'.
	 * @see crudrest.PluginDetail
	 * @generated
	 */
	EClass getPluginDetail();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginDetail#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see crudrest.PluginDetail#getPrefix()
	 * @see #getPluginDetail()
	 * @generated
	 */
	EAttribute getPluginDetail_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginDetail#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see crudrest.PluginDetail#getDescription()
	 * @see #getPluginDetail()
	 * @generated
	 */
	EAttribute getPluginDetail_Description();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginDetail#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see crudrest.PluginDetail#getVersion()
	 * @see #getPluginDetail()
	 * @generated
	 */
	EAttribute getPluginDetail_Version();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginDetail#getDbVersion <em>Db Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Version</em>'.
	 * @see crudrest.PluginDetail#getDbVersion()
	 * @see #getPluginDetail()
	 * @generated
	 */
	EAttribute getPluginDetail_DbVersion();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginDetail#getPluginURI <em>Plugin URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin URI</em>'.
	 * @see crudrest.PluginDetail#getPluginURI()
	 * @see #getPluginDetail()
	 * @generated
	 */
	EAttribute getPluginDetail_PluginURI();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginDetail#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see crudrest.PluginDetail#getAuthor()
	 * @see #getPluginDetail()
	 * @generated
	 */
	EAttribute getPluginDetail_Author();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginDetail#getAuthorURI <em>Author URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author URI</em>'.
	 * @see crudrest.PluginDetail#getAuthorURI()
	 * @see #getPluginDetail()
	 * @generated
	 */
	EAttribute getPluginDetail_AuthorURI();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginDetail#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see crudrest.PluginDetail#getLicense()
	 * @see #getPluginDetail()
	 * @generated
	 */
	EAttribute getPluginDetail_License();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginDetail#getLicenseURI <em>License URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License URI</em>'.
	 * @see crudrest.PluginDetail#getLicenseURI()
	 * @see #getPluginDetail()
	 * @generated
	 */
	EAttribute getPluginDetail_LicenseURI();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginDetail#getTextDomain <em>Text Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Domain</em>'.
	 * @see crudrest.PluginDetail#getTextDomain()
	 * @see #getPluginDetail()
	 * @generated
	 */
	EAttribute getPluginDetail_TextDomain();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginDetail#getDomainPath <em>Domain Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Path</em>'.
	 * @see crudrest.PluginDetail#getDomainPath()
	 * @see #getPluginDetail()
	 * @generated
	 */
	EAttribute getPluginDetail_DomainPath();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginDetail#getDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory</em>'.
	 * @see crudrest.PluginDetail#getDirectory()
	 * @see #getPluginDetail()
	 * @generated
	 */
	EAttribute getPluginDetail_Directory();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginDetail#getMinVersionWP <em>Min Version WP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Version WP</em>'.
	 * @see crudrest.PluginDetail#getMinVersionWP()
	 * @see #getPluginDetail()
	 * @generated
	 */
	EAttribute getPluginDetail_MinVersionWP();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginDetail#getMinVersionPHP <em>Min Version PHP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Version PHP</em>'.
	 * @see crudrest.PluginDetail#getMinVersionPHP()
	 * @see #getPluginDetail()
	 * @generated
	 */
	EAttribute getPluginDetail_MinVersionPHP();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginDetail#getUpdateURI <em>Update URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update URI</em>'.
	 * @see crudrest.PluginDetail#getUpdateURI()
	 * @see #getPluginDetail()
	 * @generated
	 */
	EAttribute getPluginDetail_UpdateURI();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginDetail#isNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network</em>'.
	 * @see crudrest.PluginDetail#isNetwork()
	 * @see #getPluginDetail()
	 * @generated
	 */
	EAttribute getPluginDetail_Network();

	/**
	 * Returns the meta object for class '{@link crudrest.PluginWebService <em>Plugin Web Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin Web Service</em>'.
	 * @see crudrest.PluginWebService
	 * @generated
	 */
	EClass getPluginWebService();

	/**
	 * Returns the meta object for the containment reference list '{@link crudrest.PluginWebService#getExtend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extend</em>'.
	 * @see crudrest.PluginWebService#getExtend()
	 * @see #getPluginWebService()
	 * @generated
	 */
	EReference getPluginWebService_Extend();

	/**
	 * Returns the meta object for the containment reference list '{@link crudrest.PluginWebService#getEntityModel <em>Entity Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Model</em>'.
	 * @see crudrest.PluginWebService#getEntityModel()
	 * @see #getPluginWebService()
	 * @generated
	 */
	EReference getPluginWebService_EntityModel();

	/**
	 * Returns the meta object for class '{@link crudrest.WebserviceFunction <em>Webservice Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Webservice Function</em>'.
	 * @see crudrest.WebserviceFunction
	 * @generated
	 */
	EClass getWebserviceFunction();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.WebserviceFunction#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see crudrest.WebserviceFunction#getMethod()
	 * @see #getWebserviceFunction()
	 * @generated
	 */
	EAttribute getWebserviceFunction_Method();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.WebserviceFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crudrest.WebserviceFunction#getName()
	 * @see #getWebserviceFunction()
	 * @generated
	 */
	EAttribute getWebserviceFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.WebserviceFunction#isCheckAccessControl <em>Check Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Access Control</em>'.
	 * @see crudrest.WebserviceFunction#isCheckAccessControl()
	 * @see #getWebserviceFunction()
	 * @generated
	 */
	EAttribute getWebserviceFunction_CheckAccessControl();

	/**
	 * Returns the meta object for class '{@link crudrest.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see crudrest.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.Entity#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see crudrest.Entity#getKey()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Key();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.Entity#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see crudrest.Entity#getLabel()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Label();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.Entity#getLabelPlural <em>Label Plural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Plural</em>'.
	 * @see crudrest.Entity#getLabelPlural()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_LabelPlural();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.Entity#getTitleScript <em>Title Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Script</em>'.
	 * @see crudrest.Entity#getTitleScript()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_TitleScript();

	/**
	 * Returns the meta object for the containment reference list '{@link crudrest.Entity#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see crudrest.Entity#getFields()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Fields();

	/**
	 * Returns the meta object for the containment reference list '{@link crudrest.Entity#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see crudrest.Entity#getRelations()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Relations();

	/**
	 * Returns the meta object for class '{@link crudrest.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see crudrest.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the reference '{@link crudrest.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see crudrest.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Type();

	/**
	 * Returns the meta object for class '{@link crudrest.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see crudrest.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link crudrest.Relation#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see crudrest.Relation#getEntity()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Entity();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.Relation#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see crudrest.Relation#isMany()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Many();

	/**
	 * Returns the meta object for the reference '{@link crudrest.Relation#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see crudrest.Relation#getOpposite()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Opposite();

	/**
	 * Returns the meta object for class '{@link crudrest.PluginGUI <em>Plugin GUI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin GUI</em>'.
	 * @see crudrest.PluginGUI
	 * @generated
	 */
	EClass getPluginGUI();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginGUI#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see crudrest.PluginGUI#getClass_()
	 * @see #getPluginGUI()
	 * @generated
	 */
	EAttribute getPluginGUI_Class();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.PluginGUI#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see crudrest.PluginGUI#getStyle()
	 * @see #getPluginGUI()
	 * @generated
	 */
	EAttribute getPluginGUI_Style();

	/**
	 * Returns the meta object for the containment reference '{@link crudrest.PluginGUI#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Menu</em>'.
	 * @see crudrest.PluginGUI#getMenu()
	 * @see #getPluginGUI()
	 * @generated
	 */
	EReference getPluginGUI_Menu();

	/**
	 * Returns the meta object for the containment reference list '{@link crudrest.PluginGUI#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see crudrest.PluginGUI#getPage()
	 * @see #getPluginGUI()
	 * @generated
	 */
	EReference getPluginGUI_Page();

	/**
	 * Returns the meta object for the containment reference list '{@link crudrest.PluginGUI#getReusableLayout <em>Reusable Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reusable Layout</em>'.
	 * @see crudrest.PluginGUI#getReusableLayout()
	 * @see #getPluginGUI()
	 * @generated
	 */
	EReference getPluginGUI_ReusableLayout();

	/**
	 * Returns the meta object for class '{@link crudrest.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see crudrest.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.Layout#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crudrest.Layout#getName()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Name();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.Layout#getCol_xs <em>Col xs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col xs</em>'.
	 * @see crudrest.Layout#getCol_xs()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Col_xs();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.Layout#getCol_sm <em>Col sm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col sm</em>'.
	 * @see crudrest.Layout#getCol_sm()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Col_sm();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.Layout#getCol_md <em>Col md</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col md</em>'.
	 * @see crudrest.Layout#getCol_md()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Col_md();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.Layout#getCol_lg <em>Col lg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col lg</em>'.
	 * @see crudrest.Layout#getCol_lg()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Col_lg();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.Layout#getCol_xl <em>Col xl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col xl</em>'.
	 * @see crudrest.Layout#getCol_xl()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Col_xl();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.Layout#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see crudrest.Layout#getClass_()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Class();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.Layout#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see crudrest.Layout#getStyle()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Style();

	/**
	 * Returns the meta object for class '{@link crudrest.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see crudrest.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link crudrest.Menu#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see crudrest.Menu#getItems()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Items();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.Menu#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see crudrest.Menu#getTitle()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_Title();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.Menu#getSlug <em>Slug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slug</em>'.
	 * @see crudrest.Menu#getSlug()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_Slug();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.Menu#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see crudrest.Menu#getIcon()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_Icon();

	/**
	 * Returns the meta object for class '{@link crudrest.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Item</em>'.
	 * @see crudrest.MenuItem
	 * @generated
	 */
	EClass getMenuItem();

	/**
	 * Returns the meta object for the reference '{@link crudrest.MenuItem#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page</em>'.
	 * @see crudrest.MenuItem#getPage()
	 * @see #getMenuItem()
	 * @generated
	 */
	EReference getMenuItem_Page();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.MenuItem#getOverrideTitle <em>Override Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Override Title</em>'.
	 * @see crudrest.MenuItem#getOverrideTitle()
	 * @see #getMenuItem()
	 * @generated
	 */
	EAttribute getMenuItem_OverrideTitle();

	/**
	 * Returns the meta object for class '{@link crudrest.UIPage <em>UI Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Page</em>'.
	 * @see crudrest.UIPage
	 * @generated
	 */
	EClass getUIPage();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.UIPage#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see crudrest.UIPage#getKey()
	 * @see #getUIPage()
	 * @generated
	 */
	EAttribute getUIPage_Key();

	/**
	 * Returns the meta object for the reference '{@link crudrest.UIPage#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see crudrest.UIPage#getEntity()
	 * @see #getUIPage()
	 * @generated
	 */
	EReference getUIPage_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link crudrest.UIPage#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form</em>'.
	 * @see crudrest.UIPage#getForm()
	 * @see #getUIPage()
	 * @generated
	 */
	EReference getUIPage_Form();

	/**
	 * Returns the meta object for the containment reference '{@link crudrest.UIPage#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see crudrest.UIPage#getList()
	 * @see #getUIPage()
	 * @generated
	 */
	EReference getUIPage_List();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.UIPage#getOverrideTitle <em>Override Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Override Title</em>'.
	 * @see crudrest.UIPage#getOverrideTitle()
	 * @see #getUIPage()
	 * @generated
	 */
	EAttribute getUIPage_OverrideTitle();

	/**
	 * Returns the meta object for class '{@link crudrest.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see crudrest.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the containment reference list '{@link crudrest.Form#getFieldLayout <em>Field Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Layout</em>'.
	 * @see crudrest.Form#getFieldLayout()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_FieldLayout();

	/**
	 * Returns the meta object for class '{@link crudrest.FieldLayout <em>Field Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Layout</em>'.
	 * @see crudrest.FieldLayout
	 * @generated
	 */
	EClass getFieldLayout();

	/**
	 * Returns the meta object for the reference '{@link crudrest.FieldLayout#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see crudrest.FieldLayout#getField()
	 * @see #getFieldLayout()
	 * @generated
	 */
	EReference getFieldLayout_Field();

	/**
	 * Returns the meta object for the reference '{@link crudrest.FieldLayout#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout</em>'.
	 * @see crudrest.FieldLayout#getLayout()
	 * @see #getFieldLayout()
	 * @generated
	 */
	EReference getFieldLayout_Layout();

	/**
	 * Returns the meta object for class '{@link crudrest.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see crudrest.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.List#isShowCreateButton <em>Show Create Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Create Button</em>'.
	 * @see crudrest.List#isShowCreateButton()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_ShowCreateButton();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.List#isShowEditButton <em>Show Edit Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Edit Button</em>'.
	 * @see crudrest.List#isShowEditButton()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_ShowEditButton();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.List#isShowSearchBox <em>Show Search Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Search Box</em>'.
	 * @see crudrest.List#isShowSearchBox()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_ShowSearchBox();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.List#isShowViewDetailButton <em>Show View Detail Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show View Detail Button</em>'.
	 * @see crudrest.List#isShowViewDetailButton()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_ShowViewDetailButton();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.List#isShowDeleteButton <em>Show Delete Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Delete Button</em>'.
	 * @see crudrest.List#isShowDeleteButton()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_ShowDeleteButton();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.List#isShowIdCol <em>Show Id Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Id Col</em>'.
	 * @see crudrest.List#isShowIdCol()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_ShowIdCol();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.List#getItemsPerPage <em>Items Per Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Items Per Page</em>'.
	 * @see crudrest.List#getItemsPerPage()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_ItemsPerPage();

	/**
	 * Returns the meta object for the reference list '{@link crudrest.List#getListColumns <em>List Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List Columns</em>'.
	 * @see crudrest.List#getListColumns()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_ListColumns();

	/**
	 * Returns the meta object for the reference list '{@link crudrest.List#getSortableColumns <em>Sortable Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sortable Columns</em>'.
	 * @see crudrest.List#getSortableColumns()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_SortableColumns();

	/**
	 * Returns the meta object for the reference list '{@link crudrest.List#getSearchableColumns <em>Searchable Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Searchable Columns</em>'.
	 * @see crudrest.List#getSearchableColumns()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_SearchableColumns();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.List#getExtendWhereClause <em>Extend Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extend Where Clause</em>'.
	 * @see crudrest.List#getExtendWhereClause()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_ExtendWhereClause();

	/**
	 * Returns the meta object for the containment reference list '{@link crudrest.List#getBulkAction <em>Bulk Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bulk Action</em>'.
	 * @see crudrest.List#getBulkAction()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_BulkAction();

	/**
	 * Returns the meta object for class '{@link crudrest.BulkAction <em>Bulk Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bulk Action</em>'.
	 * @see crudrest.BulkAction
	 * @generated
	 */
	EClass getBulkAction();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.BulkAction#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see crudrest.BulkAction#getKey()
	 * @see #getBulkAction()
	 * @generated
	 */
	EAttribute getBulkAction_Key();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.BulkAction#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see crudrest.BulkAction#getTitle()
	 * @see #getBulkAction()
	 * @generated
	 */
	EAttribute getBulkAction_Title();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.BulkAction#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see crudrest.BulkAction#getIcon()
	 * @see #getBulkAction()
	 * @generated
	 */
	EAttribute getBulkAction_Icon();

	/**
	 * Returns the meta object for class '{@link crudrest.FieldBase <em>Field Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Base</em>'.
	 * @see crudrest.FieldBase
	 * @generated
	 */
	EClass getFieldBase();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.FieldBase#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see crudrest.FieldBase#getKey()
	 * @see #getFieldBase()
	 * @generated
	 */
	EAttribute getFieldBase_Key();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.FieldBase#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see crudrest.FieldBase#getLabel()
	 * @see #getFieldBase()
	 * @generated
	 */
	EAttribute getFieldBase_Label();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.FieldBase#isIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see crudrest.FieldBase#isIndex()
	 * @see #getFieldBase()
	 * @generated
	 */
	EAttribute getFieldBase_Index();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.FieldBase#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see crudrest.FieldBase#isUnique()
	 * @see #getFieldBase()
	 * @generated
	 */
	EAttribute getFieldBase_Unique();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.FieldBase#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see crudrest.FieldBase#isRequired()
	 * @see #getFieldBase()
	 * @generated
	 */
	EAttribute getFieldBase_Required();

	/**
	 * Returns the meta object for class '{@link crudrest.FieldTypeRepository <em>Field Type Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Type Repository</em>'.
	 * @see crudrest.FieldTypeRepository
	 * @generated
	 */
	EClass getFieldTypeRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link crudrest.FieldTypeRepository#getFieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Type</em>'.
	 * @see crudrest.FieldTypeRepository#getFieldType()
	 * @see #getFieldTypeRepository()
	 * @generated
	 */
	EReference getFieldTypeRepository_FieldType();

	/**
	 * Returns the meta object for class '{@link crudrest.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Type</em>'.
	 * @see crudrest.FieldType
	 * @generated
	 */
	EClass getFieldType();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.FieldType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see crudrest.FieldType#getKey()
	 * @see #getFieldType()
	 * @generated
	 */
	EAttribute getFieldType_Key();

	/**
	 * Returns the meta object for the containment reference '{@link crudrest.FieldType#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see crudrest.FieldType#getConfig()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_Config();

	/**
	 * Returns the meta object for the containment reference '{@link crudrest.FieldType#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see crudrest.FieldType#getInput()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_Input();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.FieldType#getAdapterFromDB <em>Adapter From DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter From DB</em>'.
	 * @see crudrest.FieldType#getAdapterFromDB()
	 * @see #getFieldType()
	 * @generated
	 */
	EAttribute getFieldType_AdapterFromDB();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.FieldType#getAdapterToDB <em>Adapter To DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter To DB</em>'.
	 * @see crudrest.FieldType#getAdapterToDB()
	 * @see #getFieldType()
	 * @generated
	 */
	EAttribute getFieldType_AdapterToDB();

	/**
	 * Returns the meta object for class '{@link crudrest.DBFieldConfig <em>DB Field Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Field Config</em>'.
	 * @see crudrest.DBFieldConfig
	 * @generated
	 */
	EClass getDBFieldConfig();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.DBFieldConfig#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see crudrest.DBFieldConfig#getType()
	 * @see #getDBFieldConfig()
	 * @generated
	 */
	EAttribute getDBFieldConfig_Type();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.DBFieldConfig#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see crudrest.DBFieldConfig#getExpression()
	 * @see #getDBFieldConfig()
	 * @generated
	 */
	EAttribute getDBFieldConfig_Expression();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.DBFieldConfig#getSearchAdapter <em>Search Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search Adapter</em>'.
	 * @see crudrest.DBFieldConfig#getSearchAdapter()
	 * @see #getDBFieldConfig()
	 * @generated
	 */
	EAttribute getDBFieldConfig_SearchAdapter();

	/**
	 * Returns the meta object for class '{@link crudrest.VueElement <em>Vue Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vue Element</em>'.
	 * @see crudrest.VueElement
	 * @generated
	 */
	EClass getVueElement();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.VueElement#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see crudrest.VueElement#getTag()
	 * @see #getVueElement()
	 * @generated
	 */
	EAttribute getVueElement_Tag();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.VueElement#getUrlJs <em>Url Js</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Js</em>'.
	 * @see crudrest.VueElement#getUrlJs()
	 * @see #getVueElement()
	 * @generated
	 */
	EAttribute getVueElement_UrlJs();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.VueElement#getUrlCss <em>Url Css</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Css</em>'.
	 * @see crudrest.VueElement#getUrlCss()
	 * @see #getVueElement()
	 * @generated
	 */
	EAttribute getVueElement_UrlCss();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.VueElement#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Params</em>'.
	 * @see crudrest.VueElement#getParams()
	 * @see #getVueElement()
	 * @generated
	 */
	EAttribute getVueElement_Params();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.VueElement#getValidation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation</em>'.
	 * @see crudrest.VueElement#getValidation()
	 * @see #getVueElement()
	 * @generated
	 */
	EAttribute getVueElement_Validation();

	/**
	 * Returns the meta object for the attribute '{@link crudrest.VueElement#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component</em>'.
	 * @see crudrest.VueElement#getComponent()
	 * @see #getVueElement()
	 * @generated
	 */
	EAttribute getVueElement_Component();

	/**
	 * Returns the meta object for enum '{@link crudrest.HttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Method</em>'.
	 * @see crudrest.HttpMethod
	 * @generated
	 */
	EEnum getHttpMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	crudrestFactory getcrudrestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link crudrest.impl.PluginCreatorImpl <em>Plugin Creator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.PluginCreatorImpl
		 * @see crudrest.impl.crudrestPackageImpl#getPluginCreator()
		 * @generated
		 */
		EClass PLUGIN_CREATOR = eINSTANCE.getPluginCreator();

		/**
		 * The meta object literal for the '<em><b>Plugin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_CREATOR__PLUGIN = eINSTANCE.getPluginCreator_Plugin();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_CREATOR__REPOSITORY = eINSTANCE.getPluginCreator_Repository();

		/**
		 * The meta object literal for the '{@link crudrest.impl.CrudRestPluginImpl <em>Crud Rest Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.CrudRestPluginImpl
		 * @see crudrest.impl.crudrestPackageImpl#getCrudRestPlugin()
		 * @generated
		 */
		EClass CRUD_REST_PLUGIN = eINSTANCE.getCrudRestPlugin();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRUD_REST_PLUGIN__NAME = eINSTANCE.getCrudRestPlugin_Name();

		/**
		 * The meta object literal for the '<em><b>Detail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRUD_REST_PLUGIN__DETAIL = eINSTANCE.getCrudRestPlugin_Detail();

		/**
		 * The meta object literal for the '<em><b>Gui</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRUD_REST_PLUGIN__GUI = eINSTANCE.getCrudRestPlugin_Gui();

		/**
		 * The meta object literal for the '<em><b>Has Access Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRUD_REST_PLUGIN__HAS_ACCESS_CONTROL = eINSTANCE.getCrudRestPlugin_HasAccessControl();

		/**
		 * The meta object literal for the '<em><b>Service Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRUD_REST_PLUGIN__SERVICE_PROVIDER = eINSTANCE.getCrudRestPlugin_ServiceProvider();

		/**
		 * The meta object literal for the '{@link crudrest.impl.PluginDetailImpl <em>Plugin Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.PluginDetailImpl
		 * @see crudrest.impl.crudrestPackageImpl#getPluginDetail()
		 * @generated
		 */
		EClass PLUGIN_DETAIL = eINSTANCE.getPluginDetail();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DETAIL__PREFIX = eINSTANCE.getPluginDetail_Prefix();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DETAIL__DESCRIPTION = eINSTANCE.getPluginDetail_Description();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DETAIL__VERSION = eINSTANCE.getPluginDetail_Version();

		/**
		 * The meta object literal for the '<em><b>Db Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DETAIL__DB_VERSION = eINSTANCE.getPluginDetail_DbVersion();

		/**
		 * The meta object literal for the '<em><b>Plugin URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DETAIL__PLUGIN_URI = eINSTANCE.getPluginDetail_PluginURI();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DETAIL__AUTHOR = eINSTANCE.getPluginDetail_Author();

		/**
		 * The meta object literal for the '<em><b>Author URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DETAIL__AUTHOR_URI = eINSTANCE.getPluginDetail_AuthorURI();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DETAIL__LICENSE = eINSTANCE.getPluginDetail_License();

		/**
		 * The meta object literal for the '<em><b>License URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DETAIL__LICENSE_URI = eINSTANCE.getPluginDetail_LicenseURI();

		/**
		 * The meta object literal for the '<em><b>Text Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DETAIL__TEXT_DOMAIN = eINSTANCE.getPluginDetail_TextDomain();

		/**
		 * The meta object literal for the '<em><b>Domain Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DETAIL__DOMAIN_PATH = eINSTANCE.getPluginDetail_DomainPath();

		/**
		 * The meta object literal for the '<em><b>Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DETAIL__DIRECTORY = eINSTANCE.getPluginDetail_Directory();

		/**
		 * The meta object literal for the '<em><b>Min Version WP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DETAIL__MIN_VERSION_WP = eINSTANCE.getPluginDetail_MinVersionWP();

		/**
		 * The meta object literal for the '<em><b>Min Version PHP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DETAIL__MIN_VERSION_PHP = eINSTANCE.getPluginDetail_MinVersionPHP();

		/**
		 * The meta object literal for the '<em><b>Update URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DETAIL__UPDATE_URI = eINSTANCE.getPluginDetail_UpdateURI();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_DETAIL__NETWORK = eINSTANCE.getPluginDetail_Network();

		/**
		 * The meta object literal for the '{@link crudrest.impl.PluginWebServiceImpl <em>Plugin Web Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.PluginWebServiceImpl
		 * @see crudrest.impl.crudrestPackageImpl#getPluginWebService()
		 * @generated
		 */
		EClass PLUGIN_WEB_SERVICE = eINSTANCE.getPluginWebService();

		/**
		 * The meta object literal for the '<em><b>Extend</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_WEB_SERVICE__EXTEND = eINSTANCE.getPluginWebService_Extend();

		/**
		 * The meta object literal for the '<em><b>Entity Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_WEB_SERVICE__ENTITY_MODEL = eINSTANCE.getPluginWebService_EntityModel();

		/**
		 * The meta object literal for the '{@link crudrest.impl.WebserviceFunctionImpl <em>Webservice Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.WebserviceFunctionImpl
		 * @see crudrest.impl.crudrestPackageImpl#getWebserviceFunction()
		 * @generated
		 */
		EClass WEBSERVICE_FUNCTION = eINSTANCE.getWebserviceFunction();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSERVICE_FUNCTION__METHOD = eINSTANCE.getWebserviceFunction_Method();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSERVICE_FUNCTION__NAME = eINSTANCE.getWebserviceFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Check Access Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBSERVICE_FUNCTION__CHECK_ACCESS_CONTROL = eINSTANCE.getWebserviceFunction_CheckAccessControl();

		/**
		 * The meta object literal for the '{@link crudrest.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.EntityImpl
		 * @see crudrest.impl.crudrestPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__KEY = eINSTANCE.getEntity_Key();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__LABEL = eINSTANCE.getEntity_Label();

		/**
		 * The meta object literal for the '<em><b>Label Plural</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__LABEL_PLURAL = eINSTANCE.getEntity_LabelPlural();

		/**
		 * The meta object literal for the '<em><b>Title Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__TITLE_SCRIPT = eINSTANCE.getEntity_TitleScript();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__FIELDS = eINSTANCE.getEntity_Fields();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__RELATIONS = eINSTANCE.getEntity_Relations();

		/**
		 * The meta object literal for the '{@link crudrest.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.FieldImpl
		 * @see crudrest.impl.crudrestPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '{@link crudrest.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.RelationImpl
		 * @see crudrest.impl.crudrestPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__ENTITY = eINSTANCE.getRelation_Entity();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__MANY = eINSTANCE.getRelation_Many();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__OPPOSITE = eINSTANCE.getRelation_Opposite();

		/**
		 * The meta object literal for the '{@link crudrest.impl.PluginGUIImpl <em>Plugin GUI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.PluginGUIImpl
		 * @see crudrest.impl.crudrestPackageImpl#getPluginGUI()
		 * @generated
		 */
		EClass PLUGIN_GUI = eINSTANCE.getPluginGUI();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_GUI__CLASS = eINSTANCE.getPluginGUI_Class();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN_GUI__STYLE = eINSTANCE.getPluginGUI_Style();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_GUI__MENU = eINSTANCE.getPluginGUI_Menu();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_GUI__PAGE = eINSTANCE.getPluginGUI_Page();

		/**
		 * The meta object literal for the '<em><b>Reusable Layout</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN_GUI__REUSABLE_LAYOUT = eINSTANCE.getPluginGUI_ReusableLayout();

		/**
		 * The meta object literal for the '{@link crudrest.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.LayoutImpl
		 * @see crudrest.impl.crudrestPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__NAME = eINSTANCE.getLayout_Name();

		/**
		 * The meta object literal for the '<em><b>Col xs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__COL_XS = eINSTANCE.getLayout_Col_xs();

		/**
		 * The meta object literal for the '<em><b>Col sm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__COL_SM = eINSTANCE.getLayout_Col_sm();

		/**
		 * The meta object literal for the '<em><b>Col md</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__COL_MD = eINSTANCE.getLayout_Col_md();

		/**
		 * The meta object literal for the '<em><b>Col lg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__COL_LG = eINSTANCE.getLayout_Col_lg();

		/**
		 * The meta object literal for the '<em><b>Col xl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__COL_XL = eINSTANCE.getLayout_Col_xl();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__CLASS = eINSTANCE.getLayout_Class();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__STYLE = eINSTANCE.getLayout_Style();

		/**
		 * The meta object literal for the '{@link crudrest.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.MenuImpl
		 * @see crudrest.impl.crudrestPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__ITEMS = eINSTANCE.getMenu_Items();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__TITLE = eINSTANCE.getMenu_Title();

		/**
		 * The meta object literal for the '<em><b>Slug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__SLUG = eINSTANCE.getMenu_Slug();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__ICON = eINSTANCE.getMenu_Icon();

		/**
		 * The meta object literal for the '{@link crudrest.impl.MenuItemImpl <em>Menu Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.MenuItemImpl
		 * @see crudrest.impl.crudrestPackageImpl#getMenuItem()
		 * @generated
		 */
		EClass MENU_ITEM = eINSTANCE.getMenuItem();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_ITEM__PAGE = eINSTANCE.getMenuItem_Page();

		/**
		 * The meta object literal for the '<em><b>Override Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_ITEM__OVERRIDE_TITLE = eINSTANCE.getMenuItem_OverrideTitle();

		/**
		 * The meta object literal for the '{@link crudrest.impl.UIPageImpl <em>UI Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.UIPageImpl
		 * @see crudrest.impl.crudrestPackageImpl#getUIPage()
		 * @generated
		 */
		EClass UI_PAGE = eINSTANCE.getUIPage();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_PAGE__KEY = eINSTANCE.getUIPage_Key();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_PAGE__ENTITY = eINSTANCE.getUIPage_Entity();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_PAGE__FORM = eINSTANCE.getUIPage_Form();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_PAGE__LIST = eINSTANCE.getUIPage_List();

		/**
		 * The meta object literal for the '<em><b>Override Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_PAGE__OVERRIDE_TITLE = eINSTANCE.getUIPage_OverrideTitle();

		/**
		 * The meta object literal for the '{@link crudrest.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.FormImpl
		 * @see crudrest.impl.crudrestPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Field Layout</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__FIELD_LAYOUT = eINSTANCE.getForm_FieldLayout();

		/**
		 * The meta object literal for the '{@link crudrest.impl.FieldLayoutImpl <em>Field Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.FieldLayoutImpl
		 * @see crudrest.impl.crudrestPackageImpl#getFieldLayout()
		 * @generated
		 */
		EClass FIELD_LAYOUT = eINSTANCE.getFieldLayout();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_LAYOUT__FIELD = eINSTANCE.getFieldLayout_Field();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_LAYOUT__LAYOUT = eINSTANCE.getFieldLayout_Layout();

		/**
		 * The meta object literal for the '{@link crudrest.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.ListImpl
		 * @see crudrest.impl.crudrestPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Show Create Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__SHOW_CREATE_BUTTON = eINSTANCE.getList_ShowCreateButton();

		/**
		 * The meta object literal for the '<em><b>Show Edit Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__SHOW_EDIT_BUTTON = eINSTANCE.getList_ShowEditButton();

		/**
		 * The meta object literal for the '<em><b>Show Search Box</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__SHOW_SEARCH_BOX = eINSTANCE.getList_ShowSearchBox();

		/**
		 * The meta object literal for the '<em><b>Show View Detail Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__SHOW_VIEW_DETAIL_BUTTON = eINSTANCE.getList_ShowViewDetailButton();

		/**
		 * The meta object literal for the '<em><b>Show Delete Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__SHOW_DELETE_BUTTON = eINSTANCE.getList_ShowDeleteButton();

		/**
		 * The meta object literal for the '<em><b>Show Id Col</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__SHOW_ID_COL = eINSTANCE.getList_ShowIdCol();

		/**
		 * The meta object literal for the '<em><b>Items Per Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__ITEMS_PER_PAGE = eINSTANCE.getList_ItemsPerPage();

		/**
		 * The meta object literal for the '<em><b>List Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__LIST_COLUMNS = eINSTANCE.getList_ListColumns();

		/**
		 * The meta object literal for the '<em><b>Sortable Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__SORTABLE_COLUMNS = eINSTANCE.getList_SortableColumns();

		/**
		 * The meta object literal for the '<em><b>Searchable Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__SEARCHABLE_COLUMNS = eINSTANCE.getList_SearchableColumns();

		/**
		 * The meta object literal for the '<em><b>Extend Where Clause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__EXTEND_WHERE_CLAUSE = eINSTANCE.getList_ExtendWhereClause();

		/**
		 * The meta object literal for the '<em><b>Bulk Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__BULK_ACTION = eINSTANCE.getList_BulkAction();

		/**
		 * The meta object literal for the '{@link crudrest.impl.BulkActionImpl <em>Bulk Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.BulkActionImpl
		 * @see crudrest.impl.crudrestPackageImpl#getBulkAction()
		 * @generated
		 */
		EClass BULK_ACTION = eINSTANCE.getBulkAction();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BULK_ACTION__KEY = eINSTANCE.getBulkAction_Key();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BULK_ACTION__TITLE = eINSTANCE.getBulkAction_Title();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BULK_ACTION__ICON = eINSTANCE.getBulkAction_Icon();

		/**
		 * The meta object literal for the '{@link crudrest.impl.FieldBaseImpl <em>Field Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.FieldBaseImpl
		 * @see crudrest.impl.crudrestPackageImpl#getFieldBase()
		 * @generated
		 */
		EClass FIELD_BASE = eINSTANCE.getFieldBase();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_BASE__KEY = eINSTANCE.getFieldBase_Key();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_BASE__LABEL = eINSTANCE.getFieldBase_Label();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_BASE__INDEX = eINSTANCE.getFieldBase_Index();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_BASE__UNIQUE = eINSTANCE.getFieldBase_Unique();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_BASE__REQUIRED = eINSTANCE.getFieldBase_Required();

		/**
		 * The meta object literal for the '{@link crudrest.impl.FieldTypeRepositoryImpl <em>Field Type Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.FieldTypeRepositoryImpl
		 * @see crudrest.impl.crudrestPackageImpl#getFieldTypeRepository()
		 * @generated
		 */
		EClass FIELD_TYPE_REPOSITORY = eINSTANCE.getFieldTypeRepository();

		/**
		 * The meta object literal for the '<em><b>Field Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE_REPOSITORY__FIELD_TYPE = eINSTANCE.getFieldTypeRepository_FieldType();

		/**
		 * The meta object literal for the '{@link crudrest.impl.FieldTypeImpl <em>Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.FieldTypeImpl
		 * @see crudrest.impl.crudrestPackageImpl#getFieldType()
		 * @generated
		 */
		EClass FIELD_TYPE = eINSTANCE.getFieldType();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_TYPE__KEY = eINSTANCE.getFieldType_Key();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__CONFIG = eINSTANCE.getFieldType_Config();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__INPUT = eINSTANCE.getFieldType_Input();

		/**
		 * The meta object literal for the '<em><b>Adapter From DB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_TYPE__ADAPTER_FROM_DB = eINSTANCE.getFieldType_AdapterFromDB();

		/**
		 * The meta object literal for the '<em><b>Adapter To DB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_TYPE__ADAPTER_TO_DB = eINSTANCE.getFieldType_AdapterToDB();

		/**
		 * The meta object literal for the '{@link crudrest.impl.DBFieldConfigImpl <em>DB Field Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.DBFieldConfigImpl
		 * @see crudrest.impl.crudrestPackageImpl#getDBFieldConfig()
		 * @generated
		 */
		EClass DB_FIELD_CONFIG = eINSTANCE.getDBFieldConfig();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_FIELD_CONFIG__TYPE = eINSTANCE.getDBFieldConfig_Type();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_FIELD_CONFIG__EXPRESSION = eINSTANCE.getDBFieldConfig_Expression();

		/**
		 * The meta object literal for the '<em><b>Search Adapter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_FIELD_CONFIG__SEARCH_ADAPTER = eINSTANCE.getDBFieldConfig_SearchAdapter();

		/**
		 * The meta object literal for the '{@link crudrest.impl.VueElementImpl <em>Vue Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.impl.VueElementImpl
		 * @see crudrest.impl.crudrestPackageImpl#getVueElement()
		 * @generated
		 */
		EClass VUE_ELEMENT = eINSTANCE.getVueElement();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUE_ELEMENT__TAG = eINSTANCE.getVueElement_Tag();

		/**
		 * The meta object literal for the '<em><b>Url Js</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUE_ELEMENT__URL_JS = eINSTANCE.getVueElement_UrlJs();

		/**
		 * The meta object literal for the '<em><b>Url Css</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUE_ELEMENT__URL_CSS = eINSTANCE.getVueElement_UrlCss();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUE_ELEMENT__PARAMS = eINSTANCE.getVueElement_Params();

		/**
		 * The meta object literal for the '<em><b>Validation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUE_ELEMENT__VALIDATION = eINSTANCE.getVueElement_Validation();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUE_ELEMENT__COMPONENT = eINSTANCE.getVueElement_Component();

		/**
		 * The meta object literal for the '{@link crudrest.HttpMethod <em>Http Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see crudrest.HttpMethod
		 * @see crudrest.impl.crudrestPackageImpl#getHttpMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHttpMethod();

	}

} //crudrestPackage
