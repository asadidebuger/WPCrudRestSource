/**
 */
package crudrest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Creator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.PluginCreator#getPlugin <em>Plugin</em>}</li>
 *   <li>{@link crudrest.PluginCreator#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getPluginCreator()
 * @model
 * @generated
 */
public interface PluginCreator extends EObject {
	/**
	 * Returns the value of the '<em><b>Plugin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin</em>' containment reference.
	 * @see #setPlugin(CrudRestPlugin)
	 * @see crudrest.crudrestPackage#getPluginCreator_Plugin()
	 * @model containment="true"
	 * @generated
	 */
	CrudRestPlugin getPlugin();

	/**
	 * Sets the value of the '{@link crudrest.PluginCreator#getPlugin <em>Plugin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin</em>' containment reference.
	 * @see #getPlugin()
	 * @generated
	 */
	void setPlugin(CrudRestPlugin value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(FieldTypeRepository)
	 * @see crudrest.crudrestPackage#getPluginCreator_Repository()
	 * @model required="true"
	 * @generated
	 */
	FieldTypeRepository getRepository();

	/**
	 * Sets the value of the '{@link crudrest.PluginCreator#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(FieldTypeRepository value);

} // PluginCreator
