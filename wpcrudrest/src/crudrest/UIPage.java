/**
 */
package crudrest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.UIPage#getKey <em>Key</em>}</li>
 *   <li>{@link crudrest.UIPage#getEntity <em>Entity</em>}</li>
 *   <li>{@link crudrest.UIPage#getForm <em>Form</em>}</li>
 *   <li>{@link crudrest.UIPage#getList <em>List</em>}</li>
 *   <li>{@link crudrest.UIPage#getOverrideTitle <em>Override Title</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getUIPage()
 * @model
 * @generated
 */
public interface UIPage extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see crudrest.crudrestPackage#getUIPage_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link crudrest.UIPage#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see crudrest.crudrestPackage#getUIPage_Entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link crudrest.UIPage#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(Form)
	 * @see crudrest.crudrestPackage#getUIPage_Form()
	 * @model containment="true"
	 * @generated
	 */
	Form getForm();

	/**
	 * Sets the value of the '{@link crudrest.UIPage#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Form value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(List)
	 * @see crudrest.crudrestPackage#getUIPage_List()
	 * @model containment="true"
	 * @generated
	 */
	List getList();

	/**
	 * Sets the value of the '{@link crudrest.UIPage#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(List value);

	/**
	 * Returns the value of the '<em><b>Override Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Title</em>' attribute.
	 * @see #isSetOverrideTitle()
	 * @see #unsetOverrideTitle()
	 * @see #setOverrideTitle(String)
	 * @see crudrest.crudrestPackage#getUIPage_OverrideTitle()
	 * @model unsettable="true"
	 * @generated
	 */
	String getOverrideTitle();

	/**
	 * Sets the value of the '{@link crudrest.UIPage#getOverrideTitle <em>Override Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Title</em>' attribute.
	 * @see #isSetOverrideTitle()
	 * @see #unsetOverrideTitle()
	 * @see #getOverrideTitle()
	 * @generated
	 */
	void setOverrideTitle(String value);

	/**
	 * Unsets the value of the '{@link crudrest.UIPage#getOverrideTitle <em>Override Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverrideTitle()
	 * @see #getOverrideTitle()
	 * @see #setOverrideTitle(String)
	 * @generated
	 */
	void unsetOverrideTitle();

	/**
	 * Returns whether the value of the '{@link crudrest.UIPage#getOverrideTitle <em>Override Title</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Override Title</em>' attribute is set.
	 * @see #unsetOverrideTitle()
	 * @see #getOverrideTitle()
	 * @see #setOverrideTitle(String)
	 * @generated
	 */
	boolean isSetOverrideTitle();

} // UIPage
