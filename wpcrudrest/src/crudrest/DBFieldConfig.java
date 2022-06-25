/**
 */
package crudrest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB Field Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.DBFieldConfig#getType <em>Type</em>}</li>
 *   <li>{@link crudrest.DBFieldConfig#getExpression <em>Expression</em>}</li>
 *   <li>{@link crudrest.DBFieldConfig#getSearchAdapter <em>Search Adapter</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getDBFieldConfig()
 * @model
 * @generated
 */
public interface DBFieldConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"VARCHAR"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see crudrest.crudrestPackage#getDBFieldConfig_Type()
	 * @model default="VARCHAR" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link crudrest.DBFieldConfig#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see crudrest.crudrestPackage#getDBFieldConfig_Expression()
	 * @model default=""
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link crudrest.DBFieldConfig#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Search Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Adapter</em>' attribute.
	 * @see #setSearchAdapter(String)
	 * @see crudrest.crudrestPackage#getDBFieldConfig_SearchAdapter()
	 * @model
	 * @generated
	 */
	String getSearchAdapter();

	/**
	 * Sets the value of the '{@link crudrest.DBFieldConfig#getSearchAdapter <em>Search Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Adapter</em>' attribute.
	 * @see #getSearchAdapter()
	 * @generated
	 */
	void setSearchAdapter(String value);

} // DBFieldConfig
