/**
 */
package crudrest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.FieldLayout#getField <em>Field</em>}</li>
 *   <li>{@link crudrest.FieldLayout#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getFieldLayout()
 * @model
 * @generated
 */
public interface FieldLayout extends EObject {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(FieldBase)
	 * @see crudrest.crudrestPackage#getFieldLayout_Field()
	 * @model required="true"
	 * @generated
	 */
	FieldBase getField();

	/**
	 * Sets the value of the '{@link crudrest.FieldLayout#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(FieldBase value);

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' reference.
	 * @see #setLayout(Layout)
	 * @see crudrest.crudrestPackage#getFieldLayout_Layout()
	 * @model
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link crudrest.FieldLayout#getLayout <em>Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

} // FieldLayout
