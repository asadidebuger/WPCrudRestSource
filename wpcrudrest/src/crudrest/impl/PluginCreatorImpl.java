/**
 */
package crudrest.impl;

import crudrest.CrudRestPlugin;
import crudrest.FieldTypeRepository;
import crudrest.PluginCreator;
import crudrest.crudrestPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Creator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crudrest.impl.PluginCreatorImpl#getPlugin <em>Plugin</em>}</li>
 *   <li>{@link crudrest.impl.PluginCreatorImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginCreatorImpl extends MinimalEObjectImpl.Container implements PluginCreator {
	/**
	 * The cached value of the '{@link #getPlugin() <em>Plugin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugin()
	 * @generated
	 * @ordered
	 */
	protected CrudRestPlugin plugin;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected FieldTypeRepository repository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginCreatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crudrestPackage.Literals.PLUGIN_CREATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrudRestPlugin getPlugin() {
		return plugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlugin(CrudRestPlugin newPlugin, NotificationChain msgs) {
		CrudRestPlugin oldPlugin = plugin;
		plugin = newPlugin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_CREATOR__PLUGIN, oldPlugin, newPlugin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugin(CrudRestPlugin newPlugin) {
		if (newPlugin != plugin) {
			NotificationChain msgs = null;
			if (plugin != null)
				msgs = ((InternalEObject)plugin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.PLUGIN_CREATOR__PLUGIN, null, msgs);
			if (newPlugin != null)
				msgs = ((InternalEObject)newPlugin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.PLUGIN_CREATOR__PLUGIN, null, msgs);
			msgs = basicSetPlugin(newPlugin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_CREATOR__PLUGIN, newPlugin, newPlugin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldTypeRepository getRepository() {
		if (repository != null && repository.eIsProxy()) {
			InternalEObject oldRepository = (InternalEObject)repository;
			repository = (FieldTypeRepository)eResolveProxy(oldRepository);
			if (repository != oldRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, crudrestPackage.PLUGIN_CREATOR__REPOSITORY, oldRepository, repository));
			}
		}
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldTypeRepository basicGetRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(FieldTypeRepository newRepository) {
		FieldTypeRepository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_CREATOR__REPOSITORY, oldRepository, repository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case crudrestPackage.PLUGIN_CREATOR__PLUGIN:
				return basicSetPlugin(null, msgs);
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
			case crudrestPackage.PLUGIN_CREATOR__PLUGIN:
				return getPlugin();
			case crudrestPackage.PLUGIN_CREATOR__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case crudrestPackage.PLUGIN_CREATOR__PLUGIN:
				setPlugin((CrudRestPlugin)newValue);
				return;
			case crudrestPackage.PLUGIN_CREATOR__REPOSITORY:
				setRepository((FieldTypeRepository)newValue);
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
			case crudrestPackage.PLUGIN_CREATOR__PLUGIN:
				setPlugin((CrudRestPlugin)null);
				return;
			case crudrestPackage.PLUGIN_CREATOR__REPOSITORY:
				setRepository((FieldTypeRepository)null);
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
			case crudrestPackage.PLUGIN_CREATOR__PLUGIN:
				return plugin != null;
			case crudrestPackage.PLUGIN_CREATOR__REPOSITORY:
				return repository != null;
		}
		return super.eIsSet(featureID);
	}

} //PluginCreatorImpl
