/**
 */
package crudrest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.Form#getFieldLayout <em>Field Layout</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Layout</b></em>' containment reference list.
	 * The list contents are of type {@link crudrest.FieldLayout}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Layout</em>' containment reference list.
	 * @see crudrest.crudrestPackage#getForm_FieldLayout()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldLayout> getFieldLayout();

} // Form
