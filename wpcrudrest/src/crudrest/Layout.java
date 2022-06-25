/**
 */
package crudrest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.Layout#getName <em>Name</em>}</li>
 *   <li>{@link crudrest.Layout#getCol_xs <em>Col xs</em>}</li>
 *   <li>{@link crudrest.Layout#getCol_sm <em>Col sm</em>}</li>
 *   <li>{@link crudrest.Layout#getCol_md <em>Col md</em>}</li>
 *   <li>{@link crudrest.Layout#getCol_lg <em>Col lg</em>}</li>
 *   <li>{@link crudrest.Layout#getCol_xl <em>Col xl</em>}</li>
 *   <li>{@link crudrest.Layout#getClass_ <em>Class</em>}</li>
 *   <li>{@link crudrest.Layout#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see crudrest.crudrestPackage#getLayout_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link crudrest.Layout#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Col xs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col xs</em>' attribute.
	 * @see #isSetCol_xs()
	 * @see #unsetCol_xs()
	 * @see #setCol_xs(int)
	 * @see crudrest.crudrestPackage#getLayout_Col_xs()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	int getCol_xs();

	/**
	 * Sets the value of the '{@link crudrest.Layout#getCol_xs <em>Col xs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col xs</em>' attribute.
	 * @see #isSetCol_xs()
	 * @see #unsetCol_xs()
	 * @see #getCol_xs()
	 * @generated
	 */
	void setCol_xs(int value);

	/**
	 * Unsets the value of the '{@link crudrest.Layout#getCol_xs <em>Col xs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCol_xs()
	 * @see #getCol_xs()
	 * @see #setCol_xs(int)
	 * @generated
	 */
	void unsetCol_xs();

	/**
	 * Returns whether the value of the '{@link crudrest.Layout#getCol_xs <em>Col xs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Col xs</em>' attribute is set.
	 * @see #unsetCol_xs()
	 * @see #getCol_xs()
	 * @see #setCol_xs(int)
	 * @generated
	 */
	boolean isSetCol_xs();

	/**
	 * Returns the value of the '<em><b>Col sm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col sm</em>' attribute.
	 * @see #setCol_sm(int)
	 * @see crudrest.crudrestPackage#getLayout_Col_sm()
	 * @model unique="false"
	 * @generated
	 */
	int getCol_sm();

	/**
	 * Sets the value of the '{@link crudrest.Layout#getCol_sm <em>Col sm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col sm</em>' attribute.
	 * @see #getCol_sm()
	 * @generated
	 */
	void setCol_sm(int value);

	/**
	 * Returns the value of the '<em><b>Col md</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col md</em>' attribute.
	 * @see #setCol_md(int)
	 * @see crudrest.crudrestPackage#getLayout_Col_md()
	 * @model unique="false"
	 * @generated
	 */
	int getCol_md();

	/**
	 * Sets the value of the '{@link crudrest.Layout#getCol_md <em>Col md</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col md</em>' attribute.
	 * @see #getCol_md()
	 * @generated
	 */
	void setCol_md(int value);

	/**
	 * Returns the value of the '<em><b>Col lg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col lg</em>' attribute.
	 * @see #setCol_lg(int)
	 * @see crudrest.crudrestPackage#getLayout_Col_lg()
	 * @model unique="false"
	 * @generated
	 */
	int getCol_lg();

	/**
	 * Sets the value of the '{@link crudrest.Layout#getCol_lg <em>Col lg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col lg</em>' attribute.
	 * @see #getCol_lg()
	 * @generated
	 */
	void setCol_lg(int value);

	/**
	 * Returns the value of the '<em><b>Col xl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col xl</em>' attribute.
	 * @see #setCol_xl(int)
	 * @see crudrest.crudrestPackage#getLayout_Col_xl()
	 * @model unique="false"
	 * @generated
	 */
	int getCol_xl();

	/**
	 * Sets the value of the '{@link crudrest.Layout#getCol_xl <em>Col xl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col xl</em>' attribute.
	 * @see #getCol_xl()
	 * @generated
	 */
	void setCol_xl(int value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see crudrest.crudrestPackage#getLayout_Class()
	 * @model unique="false"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link crudrest.Layout#getClass_ <em>Class</em>}' attribute.
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
	 * @see crudrest.crudrestPackage#getLayout_Style()
	 * @model unique="false"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link crudrest.Layout#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

} // Layout
