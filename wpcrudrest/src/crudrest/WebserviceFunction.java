/**
 */
package crudrest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Webservice Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.WebserviceFunction#getMethod <em>Method</em>}</li>
 *   <li>{@link crudrest.WebserviceFunction#getName <em>Name</em>}</li>
 *   <li>{@link crudrest.WebserviceFunction#isCheckAccessControl <em>Check Access Control</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getWebserviceFunction()
 * @model
 * @generated
 */
public interface WebserviceFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link crudrest.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see crudrest.HttpMethod
	 * @see #setMethod(HttpMethod)
	 * @see crudrest.crudrestPackage#getWebserviceFunction_Method()
	 * @model required="true"
	 * @generated
	 */
	HttpMethod getMethod();

	/**
	 * Sets the value of the '{@link crudrest.WebserviceFunction#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see crudrest.HttpMethod
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(HttpMethod value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see crudrest.crudrestPackage#getWebserviceFunction_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link crudrest.WebserviceFunction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Check Access Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Access Control</em>' attribute.
	 * @see #setCheckAccessControl(boolean)
	 * @see crudrest.crudrestPackage#getWebserviceFunction_CheckAccessControl()
	 * @model
	 * @generated
	 */
	boolean isCheckAccessControl();

	/**
	 * Sets the value of the '{@link crudrest.WebserviceFunction#isCheckAccessControl <em>Check Access Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Access Control</em>' attribute.
	 * @see #isCheckAccessControl()
	 * @generated
	 */
	void setCheckAccessControl(boolean value);

} // WebserviceFunction
