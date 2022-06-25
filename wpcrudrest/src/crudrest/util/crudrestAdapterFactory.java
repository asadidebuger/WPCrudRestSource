/**
 */
package crudrest.util;

import crudrest.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see crudrest.crudrestPackage
 * @generated
 */
public class crudrestAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static crudrestPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public crudrestAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = crudrestPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected crudrestSwitch<Adapter> modelSwitch =
		new crudrestSwitch<Adapter>() {
			@Override
			public Adapter casePluginCreator(PluginCreator object) {
				return createPluginCreatorAdapter();
			}
			@Override
			public Adapter caseCrudRestPlugin(CrudRestPlugin object) {
				return createCrudRestPluginAdapter();
			}
			@Override
			public Adapter casePluginDetail(PluginDetail object) {
				return createPluginDetailAdapter();
			}
			@Override
			public Adapter casePluginWebService(PluginWebService object) {
				return createPluginWebServiceAdapter();
			}
			@Override
			public Adapter caseWebserviceFunction(WebserviceFunction object) {
				return createWebserviceFunctionAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter casePluginGUI(PluginGUI object) {
				return createPluginGUIAdapter();
			}
			@Override
			public Adapter caseLayout(Layout object) {
				return createLayoutAdapter();
			}
			@Override
			public Adapter caseMenu(Menu object) {
				return createMenuAdapter();
			}
			@Override
			public Adapter caseMenuItem(MenuItem object) {
				return createMenuItemAdapter();
			}
			@Override
			public Adapter caseUIPage(UIPage object) {
				return createUIPageAdapter();
			}
			@Override
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter caseFieldLayout(FieldLayout object) {
				return createFieldLayoutAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter caseBulkAction(BulkAction object) {
				return createBulkActionAdapter();
			}
			@Override
			public Adapter caseFieldBase(FieldBase object) {
				return createFieldBaseAdapter();
			}
			@Override
			public Adapter caseFieldTypeRepository(FieldTypeRepository object) {
				return createFieldTypeRepositoryAdapter();
			}
			@Override
			public Adapter caseFieldType(FieldType object) {
				return createFieldTypeAdapter();
			}
			@Override
			public Adapter caseDBFieldConfig(DBFieldConfig object) {
				return createDBFieldConfigAdapter();
			}
			@Override
			public Adapter caseVueElement(VueElement object) {
				return createVueElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link crudrest.PluginCreator <em>Plugin Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.PluginCreator
	 * @generated
	 */
	public Adapter createPluginCreatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.CrudRestPlugin <em>Crud Rest Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.CrudRestPlugin
	 * @generated
	 */
	public Adapter createCrudRestPluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.PluginDetail <em>Plugin Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.PluginDetail
	 * @generated
	 */
	public Adapter createPluginDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.PluginWebService <em>Plugin Web Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.PluginWebService
	 * @generated
	 */
	public Adapter createPluginWebServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.WebserviceFunction <em>Webservice Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.WebserviceFunction
	 * @generated
	 */
	public Adapter createWebserviceFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.PluginGUI <em>Plugin GUI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.PluginGUI
	 * @generated
	 */
	public Adapter createPluginGUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.Layout
	 * @generated
	 */
	public Adapter createLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.Menu
	 * @generated
	 */
	public Adapter createMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.MenuItem
	 * @generated
	 */
	public Adapter createMenuItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.UIPage <em>UI Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.UIPage
	 * @generated
	 */
	public Adapter createUIPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.FieldLayout <em>Field Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.FieldLayout
	 * @generated
	 */
	public Adapter createFieldLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.BulkAction <em>Bulk Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.BulkAction
	 * @generated
	 */
	public Adapter createBulkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.FieldBase <em>Field Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.FieldBase
	 * @generated
	 */
	public Adapter createFieldBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.FieldTypeRepository <em>Field Type Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.FieldTypeRepository
	 * @generated
	 */
	public Adapter createFieldTypeRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.FieldType
	 * @generated
	 */
	public Adapter createFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.DBFieldConfig <em>DB Field Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.DBFieldConfig
	 * @generated
	 */
	public Adapter createDBFieldConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link crudrest.VueElement <em>Vue Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see crudrest.VueElement
	 * @generated
	 */
	public Adapter createVueElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //crudrestAdapterFactory
