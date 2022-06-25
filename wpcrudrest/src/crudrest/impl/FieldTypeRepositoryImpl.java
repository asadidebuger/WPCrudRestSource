/**
 */
package crudrest.impl;

import crudrest.FieldType;
import crudrest.FieldTypeRepository;
import crudrest.crudrestPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Type Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crudrest.impl.FieldTypeRepositoryImpl#getFieldType <em>Field Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldTypeRepositoryImpl extends MinimalEObjectImpl.Container implements FieldTypeRepository {
	/**
	 * The cached value of the '{@link #getFieldType() <em>Field Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldType()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldType> fieldType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldTypeRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crudrestPackage.Literals.FIELD_TYPE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldType> getFieldType() {
		if (fieldType == null) {
			fieldType = new EObjectContainmentEList<FieldType>(FieldType.class, this, crudrestPackage.FIELD_TYPE_REPOSITORY__FIELD_TYPE);
		}
		return fieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case crudrestPackage.FIELD_TYPE_REPOSITORY__FIELD_TYPE:
				return ((InternalEList<?>)getFieldType()).basicRemove(otherEnd, msgs);
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
			case crudrestPackage.FIELD_TYPE_REPOSITORY__FIELD_TYPE:
				return getFieldType();
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
			case crudrestPackage.FIELD_TYPE_REPOSITORY__FIELD_TYPE:
				getFieldType().clear();
				getFieldType().addAll((Collection<? extends FieldType>)newValue);
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
			case crudrestPackage.FIELD_TYPE_REPOSITORY__FIELD_TYPE:
				getFieldType().clear();
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
			case crudrestPackage.FIELD_TYPE_REPOSITORY__FIELD_TYPE:
				return fieldType != null && !fieldType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FieldTypeRepositoryImpl
