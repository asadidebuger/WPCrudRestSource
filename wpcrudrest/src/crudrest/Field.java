/**
 */
package crudrest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.Field#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getField()
 * @model
 * @generated
 */
public interface Field extends FieldBase {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(FieldType)
	 * @see crudrest.crudrestPackage#getField_Type()
	 * @model unsettable="true" keys="key" required="true" ordered="false"
	 * @generated
	 */
	FieldType getType();

	/**
	 * Sets the value of the '{@link crudrest.Field#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(FieldType value);

	/**
	 * Unsets the value of the '{@link crudrest.Field#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(FieldType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link crudrest.Field#getType <em>Type</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' reference is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(FieldType)
	 * @generated
	 */
	boolean isSetType();

} // Field
