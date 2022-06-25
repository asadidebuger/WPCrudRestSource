/**
 */
package crudrest.impl;

import crudrest.Entity;
import crudrest.PluginWebService;
import crudrest.WebserviceFunction;
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
 * An implementation of the model object '<em><b>Plugin Web Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crudrest.impl.PluginWebServiceImpl#getExtend <em>Extend</em>}</li>
 *   <li>{@link crudrest.impl.PluginWebServiceImpl#getEntityModel <em>Entity Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginWebServiceImpl extends MinimalEObjectImpl.Container implements PluginWebService {
	/**
	 * The cached value of the '{@link #getExtend() <em>Extend</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtend()
	 * @generated
	 * @ordered
	 */
	protected EList<WebserviceFunction> extend;

	/**
	 * The cached value of the '{@link #getEntityModel() <em>Entity Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityModel()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entityModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginWebServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crudrestPackage.Literals.PLUGIN_WEB_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WebserviceFunction> getExtend() {
		if (extend == null) {
			extend = new EObjectContainmentEList<WebserviceFunction>(WebserviceFunction.class, this, crudrestPackage.PLUGIN_WEB_SERVICE__EXTEND);
		}
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntityModel() {
		if (entityModel == null) {
			entityModel = new EObjectContainmentEList<Entity>(Entity.class, this, crudrestPackage.PLUGIN_WEB_SERVICE__ENTITY_MODEL);
		}
		return entityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case crudrestPackage.PLUGIN_WEB_SERVICE__EXTEND:
				return ((InternalEList<?>)getExtend()).basicRemove(otherEnd, msgs);
			case crudrestPackage.PLUGIN_WEB_SERVICE__ENTITY_MODEL:
				return ((InternalEList<?>)getEntityModel()).basicRemove(otherEnd, msgs);
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
			case crudrestPackage.PLUGIN_WEB_SERVICE__EXTEND:
				return getExtend();
			case crudrestPackage.PLUGIN_WEB_SERVICE__ENTITY_MODEL:
				return getEntityModel();
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
			case crudrestPackage.PLUGIN_WEB_SERVICE__EXTEND:
				getExtend().clear();
				getExtend().addAll((Collection<? extends WebserviceFunction>)newValue);
				return;
			case crudrestPackage.PLUGIN_WEB_SERVICE__ENTITY_MODEL:
				getEntityModel().clear();
				getEntityModel().addAll((Collection<? extends Entity>)newValue);
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
			case crudrestPackage.PLUGIN_WEB_SERVICE__EXTEND:
				getExtend().clear();
				return;
			case crudrestPackage.PLUGIN_WEB_SERVICE__ENTITY_MODEL:
				getEntityModel().clear();
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
			case crudrestPackage.PLUGIN_WEB_SERVICE__EXTEND:
				return extend != null && !extend.isEmpty();
			case crudrestPackage.PLUGIN_WEB_SERVICE__ENTITY_MODEL:
				return entityModel != null && !entityModel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PluginWebServiceImpl
