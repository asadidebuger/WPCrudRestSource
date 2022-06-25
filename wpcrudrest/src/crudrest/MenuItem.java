/**
 */
package crudrest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.MenuItem#getPage <em>Page</em>}</li>
 *   <li>{@link crudrest.MenuItem#getOverrideTitle <em>Override Title</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getMenuItem()
 * @model
 * @generated
 */
public interface MenuItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' reference.
	 * @see #setPage(UIPage)
	 * @see crudrest.crudrestPackage#getMenuItem_Page()
	 * @model required="true"
	 * @generated
	 */
	UIPage getPage();

	/**
	 * Sets the value of the '{@link crudrest.MenuItem#getPage <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(UIPage value);

	/**
	 * Returns the value of the '<em><b>Override Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Title</em>' attribute.
	 * @see #setOverrideTitle(String)
	 * @see crudrest.crudrestPackage#getMenuItem_OverrideTitle()
	 * @model id="true"
	 * @generated
	 */
	String getOverrideTitle();

	/**
	 * Sets the value of the '{@link crudrest.MenuItem#getOverrideTitle <em>Override Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Title</em>' attribute.
	 * @see #getOverrideTitle()
	 * @generated
	 */
	void setOverrideTitle(String value);

} // MenuItem
