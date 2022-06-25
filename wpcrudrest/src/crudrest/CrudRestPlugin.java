/**
 */
package crudrest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crud Rest Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.CrudRestPlugin#getName <em>Name</em>}</li>
 *   <li>{@link crudrest.CrudRestPlugin#getDetail <em>Detail</em>}</li>
 *   <li>{@link crudrest.CrudRestPlugin#getGui <em>Gui</em>}</li>
 *   <li>{@link crudrest.CrudRestPlugin#isHasAccessControl <em>Has Access Control</em>}</li>
 *   <li>{@link crudrest.CrudRestPlugin#getServiceProvider <em>Service Provider</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getCrudRestPlugin()
 * @model
 * @generated
 */
public interface CrudRestPlugin extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"SamplePlugin"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see crudrest.crudrestPackage#getCrudRestPlugin_Name()
	 * @model default="SamplePlugin" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link crudrest.CrudRestPlugin#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference.
	 * @see #setDetail(PluginDetail)
	 * @see crudrest.crudrestPackage#getCrudRestPlugin_Detail()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PluginDetail getDetail();

	/**
	 * Sets the value of the '{@link crudrest.CrudRestPlugin#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(PluginDetail value);

	/**
	 * Returns the value of the '<em><b>Gui</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gui</em>' containment reference.
	 * @see #setGui(PluginGUI)
	 * @see crudrest.crudrestPackage#getCrudRestPlugin_Gui()
	 * @model containment="true"
	 * @generated
	 */
	PluginGUI getGui();

	/**
	 * Sets the value of the '{@link crudrest.CrudRestPlugin#getGui <em>Gui</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gui</em>' containment reference.
	 * @see #getGui()
	 * @generated
	 */
	void setGui(PluginGUI value);

	/**
	 * Returns the value of the '<em><b>Has Access Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Access Control</em>' attribute.
	 * @see #setHasAccessControl(boolean)
	 * @see crudrest.crudrestPackage#getCrudRestPlugin_HasAccessControl()
	 * @model
	 * @generated
	 */
	boolean isHasAccessControl();

	/**
	 * Sets the value of the '{@link crudrest.CrudRestPlugin#isHasAccessControl <em>Has Access Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Access Control</em>' attribute.
	 * @see #isHasAccessControl()
	 * @generated
	 */
	void setHasAccessControl(boolean value);

	/**
	 * Returns the value of the '<em><b>Service Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Provider</em>' containment reference.
	 * @see #setServiceProvider(PluginWebService)
	 * @see crudrest.crudrestPackage#getCrudRestPlugin_ServiceProvider()
	 * @model containment="true"
	 * @generated
	 */
	PluginWebService getServiceProvider();

	/**
	 * Sets the value of the '{@link crudrest.CrudRestPlugin#getServiceProvider <em>Service Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Provider</em>' containment reference.
	 * @see #getServiceProvider()
	 * @generated
	 */
	void setServiceProvider(PluginWebService value);

} // CrudRestPlugin
