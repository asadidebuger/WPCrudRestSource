/**
 */
package crudrest.impl;

import crudrest.Entity;
import crudrest.Field;
import crudrest.Relation;
import crudrest.crudrestPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crudrest.impl.EntityImpl#getKey <em>Key</em>}</li>
 *   <li>{@link crudrest.impl.EntityImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link crudrest.impl.EntityImpl#getLabelPlural <em>Label Plural</em>}</li>
 *   <li>{@link crudrest.impl.EntityImpl#getTitleScript <em>Title Script</em>}</li>
 *   <li>{@link crudrest.impl.EntityImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link crudrest.impl.EntityImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelPlural() <em>Label Plural</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelPlural()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_PLURAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelPlural() <em>Label Plural</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelPlural()
	 * @generated
	 * @ordered
	 */
	protected String labelPlural = LABEL_PLURAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleScript() <em>Title Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleScript()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_SCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitleScript() <em>Title Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleScript()
	 * @generated
	 * @ordered
	 */
	protected String titleScript = TITLE_SCRIPT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crudrestPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.ENTITY__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.ENTITY__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelPlural() {
		return labelPlural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelPlural(String newLabelPlural) {
		String oldLabelPlural = labelPlural;
		labelPlural = newLabelPlural;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.ENTITY__LABEL_PLURAL, oldLabelPlural, labelPlural));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitleScript() {
		return titleScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleScript(String newTitleScript) {
		String oldTitleScript = titleScript;
		titleScript = newTitleScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.ENTITY__TITLE_SCRIPT, oldTitleScript, titleScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<Field>(Field.class, this, crudrestPackage.ENTITY__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, crudrestPackage.ENTITY__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case crudrestPackage.ENTITY__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case crudrestPackage.ENTITY__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case crudrestPackage.ENTITY__KEY:
				return getKey();
			case crudrestPackage.ENTITY__LABEL:
				return getLabel();
			case crudrestPackage.ENTITY__LABEL_PLURAL:
				return getLabelPlural();
			case crudrestPackage.ENTITY__TITLE_SCRIPT:
				return getTitleScript();
			case crudrestPackage.ENTITY__FIELDS:
				return getFields();
			case crudrestPackage.ENTITY__RELATIONS:
				return getRelations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case crudrestPackage.ENTITY__KEY:
				setKey((String)newValue);
				return;
			case crudrestPackage.ENTITY__LABEL:
				setLabel((String)newValue);
				return;
			case crudrestPackage.ENTITY__LABEL_PLURAL:
				setLabelPlural((String)newValue);
				return;
			case crudrestPackage.ENTITY__TITLE_SCRIPT:
				setTitleScript((String)newValue);
				return;
			case crudrestPackage.ENTITY__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case crudrestPackage.ENTITY__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case crudrestPackage.ENTITY__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case crudrestPackage.ENTITY__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case crudrestPackage.ENTITY__LABEL_PLURAL:
				setLabelPlural(LABEL_PLURAL_EDEFAULT);
				return;
			case crudrestPackage.ENTITY__TITLE_SCRIPT:
				setTitleScript(TITLE_SCRIPT_EDEFAULT);
				return;
			case crudrestPackage.ENTITY__FIELDS:
				getFields().clear();
				return;
			case crudrestPackage.ENTITY__RELATIONS:
				getRelations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case crudrestPackage.ENTITY__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case crudrestPackage.ENTITY__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case crudrestPackage.ENTITY__LABEL_PLURAL:
				return LABEL_PLURAL_EDEFAULT == null ? labelPlural != null : !LABEL_PLURAL_EDEFAULT.equals(labelPlural);
			case crudrestPackage.ENTITY__TITLE_SCRIPT:
				return TITLE_SCRIPT_EDEFAULT == null ? titleScript != null : !TITLE_SCRIPT_EDEFAULT.equals(titleScript);
			case crudrestPackage.ENTITY__FIELDS:
				return fields != null && !fields.isEmpty();
			case crudrestPackage.ENTITY__RELATIONS:
				return relations != null && !relations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (key: ");
		result.append(key);
		result.append(", label: ");
		result.append(label);
		result.append(", labelPlural: ");
		result.append(labelPlural);
		result.append(", titleScript: ");
		result.append(titleScript);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
