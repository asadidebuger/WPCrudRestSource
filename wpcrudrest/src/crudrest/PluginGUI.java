/**
 */
package crudrest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin GUI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.PluginGUI#getClass_ <em>Class</em>}</li>
 *   <li>{@link crudrest.PluginGUI#getStyle <em>Style</em>}</li>
 *   <li>{@link crudrest.PluginGUI#getMenu <em>Menu</em>}</li>
 *   <li>{@link crudrest.PluginGUI#getPage <em>Page</em>}</li>
 *   <li>{@link crudrest.PluginGUI#getReusableLayout <em>Reusable Layout</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getPluginGUI()
 * @model
 * @generated
 */
public interface PluginGUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see crudrest.crudrestPackage#getPluginGUI_Class()
	 * @model
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link crudrest.PluginGUI#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see crudrest.crudrestPackage#getPluginGUI_Style()
	 * @model
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link crudrest.PluginGUI#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Menu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' containment reference.
	 * @see #setMenu(Menu)
	 * @see crudrest.crudrestPackage#getPluginGUI_Menu()
	 * @model containment="true"
	 * @generated
	 */
	Menu getMenu();

	/**
	 * Sets the value of the '{@link crudrest.PluginGUI#getMenu <em>Menu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu</em>' containment reference.
	 * @see #getMenu()
	 * @generated
	 */
	void setMenu(Menu value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference list.
	 * The list contents are of type {@link crudrest.UIPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference list.
	 * @see crudrest.crudrestPackage#getPluginGUI_Page()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIPage> getPage();

	/**
	 * Returns the value of the '<em><b>Reusable Layout</b></em>' containment reference list.
	 * The list contents are of type {@link crudrest.Layout}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reusable Layout</em>' containment reference list.
	 * @see crudrest.crudrestPackage#getPluginGUI_ReusableLayout()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layout> getReusableLayout();

} // PluginGUI
