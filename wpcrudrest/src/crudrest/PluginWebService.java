/**
 */
package crudrest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Web Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.PluginWebService#getExtend <em>Extend</em>}</li>
 *   <li>{@link crudrest.PluginWebService#getEntityModel <em>Entity Model</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getPluginWebService()
 * @model
 * @generated
 */
public interface PluginWebService extends EObject {
	/**
	 * Returns the value of the '<em><b>Extend</b></em>' containment reference list.
	 * The list contents are of type {@link crudrest.WebserviceFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend</em>' containment reference list.
	 * @see crudrest.crudrestPackage#getPluginWebService_Extend()
	 * @model containment="true"
	 * @generated
	 */
	EList<WebserviceFunction> getExtend();

	/**
	 * Returns the value of the '<em><b>Entity Model</b></em>' containment reference list.
	 * The list contents are of type {@link crudrest.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Model</em>' containment reference list.
	 * @see crudrest.crudrestPackage#getPluginWebService_EntityModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntityModel();

} // PluginWebService
