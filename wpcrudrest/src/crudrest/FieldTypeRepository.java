/**
 */
package crudrest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Type Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.FieldTypeRepository#getFieldType <em>Field Type</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getFieldTypeRepository()
 * @model
 * @generated
 */
public interface FieldTypeRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Type</b></em>' containment reference list.
	 * The list contents are of type {@link crudrest.FieldType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Type</em>' containment reference list.
	 * @see crudrest.crudrestPackage#getFieldTypeRepository_FieldType()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldType> getFieldType();

} // FieldTypeRepository
