/**
 */
package crudrest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.Menu#getItems <em>Items</em>}</li>
 *   <li>{@link crudrest.Menu#getTitle <em>Title</em>}</li>
 *   <li>{@link crudrest.Menu#getSlug <em>Slug</em>}</li>
 *   <li>{@link crudrest.Menu#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link crudrest.MenuItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see crudrest.crudrestPackage#getMenu_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<MenuItem> getItems();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see crudrest.crudrestPackage#getMenu_Title()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link crudrest.Menu#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Slug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slug</em>' attribute.
	 * @see #setSlug(String)
	 * @see crudrest.crudrestPackage#getMenu_Slug()
	 * @model required="true"
	 * @generated
	 */
	String getSlug();

	/**
	 * Sets the value of the '{@link crudrest.Menu#getSlug <em>Slug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slug</em>' attribute.
	 * @see #getSlug()
	 * @generated
	 */
	void setSlug(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see crudrest.crudrestPackage#getMenu_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link crudrest.Menu#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

} // Menu
