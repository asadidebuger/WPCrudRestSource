/**
 */
package crudrest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.Entity#getKey <em>Key</em>}</li>
 *   <li>{@link crudrest.Entity#getLabel <em>Label</em>}</li>
 *   <li>{@link crudrest.Entity#getLabelPlural <em>Label Plural</em>}</li>
 *   <li>{@link crudrest.Entity#getTitleScript <em>Title Script</em>}</li>
 *   <li>{@link crudrest.Entity#getFields <em>Fields</em>}</li>
 *   <li>{@link crudrest.Entity#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see crudrest.crudrestPackage#getEntity_Key()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link crudrest.Entity#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see crudrest.crudrestPackage#getEntity_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link crudrest.Entity#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Label Plural</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Plural</em>' attribute.
	 * @see #setLabelPlural(String)
	 * @see crudrest.crudrestPackage#getEntity_LabelPlural()
	 * @model
	 * @generated
	 */
	String getLabelPlural();

	/**
	 * Sets the value of the '{@link crudrest.Entity#getLabelPlural <em>Label Plural</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Plural</em>' attribute.
	 * @see #getLabelPlural()
	 * @generated
	 */
	void setLabelPlural(String value);

	/**
	 * Returns the value of the '<em><b>Title Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Script</em>' attribute.
	 * @see #setTitleScript(String)
	 * @see crudrest.crudrestPackage#getEntity_TitleScript()
	 * @model
	 * @generated
	 */
	String getTitleScript();

	/**
	 * Sets the value of the '{@link crudrest.Entity#getTitleScript <em>Title Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Script</em>' attribute.
	 * @see #getTitleScript()
	 * @generated
	 */
	void setTitleScript(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link crudrest.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see crudrest.crudrestPackage#getEntity_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link crudrest.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see crudrest.crudrestPackage#getEntity_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

} // Entity
