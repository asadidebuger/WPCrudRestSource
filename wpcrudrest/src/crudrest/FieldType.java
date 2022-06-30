/**
 */
package crudrest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.FieldType#getKey <em>Key</em>}</li>
 *   <li>{@link crudrest.FieldType#getConfig <em>Config</em>}</li>
 *   <li>{@link crudrest.FieldType#getInput <em>Input</em>}</li>
 *   <li>{@link crudrest.FieldType#getAdapterFromDB <em>Adapter From DB</em>}</li>
 *   <li>{@link crudrest.FieldType#getAdapterToDB <em>Adapter To DB</em>}</li>
 *   <li>{@link crudrest.FieldType#getAdapterSearch <em>Adapter Search</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getFieldType()
 * @model
 * @generated
 */
public interface FieldType extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see crudrest.crudrestPackage#getFieldType_Key()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link crudrest.FieldType#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(DBFieldConfig)
	 * @see crudrest.crudrestPackage#getFieldType_Config()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DBFieldConfig getConfig();

	/**
	 * Sets the value of the '{@link crudrest.FieldType#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(DBFieldConfig value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(VueElement)
	 * @see crudrest.crudrestPackage#getFieldType_Input()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VueElement getInput();

	/**
	 * Sets the value of the '{@link crudrest.FieldType#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(VueElement value);

	/**
	 * Returns the value of the '<em><b>Adapter From DB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapter From DB</em>' attribute.
	 * @see #setAdapterFromDB(String)
	 * @see crudrest.crudrestPackage#getFieldType_AdapterFromDB()
	 * @model
	 * @generated
	 */
	String getAdapterFromDB();

	/**
	 * Sets the value of the '{@link crudrest.FieldType#getAdapterFromDB <em>Adapter From DB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter From DB</em>' attribute.
	 * @see #getAdapterFromDB()
	 * @generated
	 */
	void setAdapterFromDB(String value);

	/**
	 * Returns the value of the '<em><b>Adapter To DB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapter To DB</em>' attribute.
	 * @see #setAdapterToDB(String)
	 * @see crudrest.crudrestPackage#getFieldType_AdapterToDB()
	 * @model
	 * @generated
	 */
	String getAdapterToDB();

	/**
	 * Sets the value of the '{@link crudrest.FieldType#getAdapterToDB <em>Adapter To DB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter To DB</em>' attribute.
	 * @see #getAdapterToDB()
	 * @generated
	 */
	void setAdapterToDB(String value);

	/**
	 * Returns the value of the '<em><b>Adapter Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapter Search</em>' attribute.
	 * @see #setAdapterSearch(String)
	 * @see crudrest.crudrestPackage#getFieldType_AdapterSearch()
	 * @model
	 * @generated
	 */
	String getAdapterSearch();

	/**
	 * Sets the value of the '{@link crudrest.FieldType#getAdapterSearch <em>Adapter Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter Search</em>' attribute.
	 * @see #getAdapterSearch()
	 * @generated
	 */
	void setAdapterSearch(String value);

} // FieldType
