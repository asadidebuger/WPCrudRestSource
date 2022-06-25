/**
 */
package crudrest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vue Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.VueElement#getTag <em>Tag</em>}</li>
 *   <li>{@link crudrest.VueElement#getUrlJs <em>Url Js</em>}</li>
 *   <li>{@link crudrest.VueElement#getUrlCss <em>Url Css</em>}</li>
 *   <li>{@link crudrest.VueElement#getParams <em>Params</em>}</li>
 *   <li>{@link crudrest.VueElement#getValidation <em>Validation</em>}</li>
 *   <li>{@link crudrest.VueElement#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getVueElement()
 * @model
 * @generated
 */
public interface VueElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see crudrest.crudrestPackage#getVueElement_Tag()
	 * @model
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link crudrest.VueElement#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Url Js</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Js</em>' attribute.
	 * @see #setUrlJs(String)
	 * @see crudrest.crudrestPackage#getVueElement_UrlJs()
	 * @model
	 * @generated
	 */
	String getUrlJs();

	/**
	 * Sets the value of the '{@link crudrest.VueElement#getUrlJs <em>Url Js</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Js</em>' attribute.
	 * @see #getUrlJs()
	 * @generated
	 */
	void setUrlJs(String value);

	/**
	 * Returns the value of the '<em><b>Url Css</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Css</em>' attribute.
	 * @see #setUrlCss(String)
	 * @see crudrest.crudrestPackage#getVueElement_UrlCss()
	 * @model
	 * @generated
	 */
	String getUrlCss();

	/**
	 * Sets the value of the '{@link crudrest.VueElement#getUrlCss <em>Url Css</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Css</em>' attribute.
	 * @see #getUrlCss()
	 * @generated
	 */
	void setUrlCss(String value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' attribute.
	 * @see #setParams(String)
	 * @see crudrest.crudrestPackage#getVueElement_Params()
	 * @model
	 * @generated
	 */
	String getParams();

	/**
	 * Sets the value of the '{@link crudrest.VueElement#getParams <em>Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' attribute.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(String value);

	/**
	 * Returns the value of the '<em><b>Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation</em>' attribute.
	 * @see #setValidation(String)
	 * @see crudrest.crudrestPackage#getVueElement_Validation()
	 * @model
	 * @generated
	 */
	String getValidation();

	/**
	 * Sets the value of the '{@link crudrest.VueElement#getValidation <em>Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation</em>' attribute.
	 * @see #getValidation()
	 * @generated
	 */
	void setValidation(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' attribute.
	 * @see #setComponent(String)
	 * @see crudrest.crudrestPackage#getVueElement_Component()
	 * @model
	 * @generated
	 */
	String getComponent();

	/**
	 * Sets the value of the '{@link crudrest.VueElement#getComponent <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' attribute.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(String value);

} // VueElement
