/**
 */
package crudrest.impl;

import crudrest.CrudRestPlugin;
import crudrest.PluginDetail;
import crudrest.PluginGUI;
import crudrest.PluginWebService;
import crudrest.crudrestPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crud Rest Plugin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crudrest.impl.CrudRestPluginImpl#getName <em>Name</em>}</li>
 *   <li>{@link crudrest.impl.CrudRestPluginImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link crudrest.impl.CrudRestPluginImpl#getGui <em>Gui</em>}</li>
 *   <li>{@link crudrest.impl.CrudRestPluginImpl#isHasAccessControl <em>Has Access Control</em>}</li>
 *   <li>{@link crudrest.impl.CrudRestPluginImpl#getServiceProvider <em>Service Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrudRestPluginImpl extends MinimalEObjectImpl.Container implements CrudRestPlugin {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "SamplePlugin";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected PluginDetail detail;

	/**
	 * The cached value of the '{@link #getGui() <em>Gui</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGui()
	 * @generated
	 * @ordered
	 */
	protected PluginGUI gui;

	/**
	 * The default value of the '{@link #isHasAccessControl() <em>Has Access Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasAccessControl()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_ACCESS_CONTROL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasAccessControl() <em>Has Access Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasAccessControl()
	 * @generated
	 * @ordered
	 */
	protected boolean hasAccessControl = HAS_ACCESS_CONTROL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceProvider() <em>Service Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProvider()
	 * @generated
	 * @ordered
	 */
	protected PluginWebService serviceProvider;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrudRestPluginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crudrestPackage.Literals.CRUD_REST_PLUGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.CRUD_REST_PLUGIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginDetail getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetail(PluginDetail newDetail, NotificationChain msgs) {
		PluginDetail oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, crudrestPackage.CRUD_REST_PLUGIN__DETAIL, oldDetail, newDetail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetail(PluginDetail newDetail) {
		if (newDetail != detail) {
			NotificationChain msgs = null;
			if (detail != null)
				msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.CRUD_REST_PLUGIN__DETAIL, null, msgs);
			if (newDetail != null)
				msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.CRUD_REST_PLUGIN__DETAIL, null, msgs);
			msgs = basicSetDetail(newDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.CRUD_REST_PLUGIN__DETAIL, newDetail, newDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginGUI getGui() {
		return gui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGui(PluginGUI newGui, NotificationChain msgs) {
		PluginGUI oldGui = gui;
		gui = newGui;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, crudrestPackage.CRUD_REST_PLUGIN__GUI, oldGui, newGui);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGui(PluginGUI newGui) {
		if (newGui != gui) {
			NotificationChain msgs = null;
			if (gui != null)
				msgs = ((InternalEObject)gui).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.CRUD_REST_PLUGIN__GUI, null, msgs);
			if (newGui != null)
				msgs = ((InternalEObject)newGui).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.CRUD_REST_PLUGIN__GUI, null, msgs);
			msgs = basicSetGui(newGui, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.CRUD_REST_PLUGIN__GUI, newGui, newGui));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasAccessControl() {
		return hasAccessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAccessControl(boolean newHasAccessControl) {
		boolean oldHasAccessControl = hasAccessControl;
		hasAccessControl = newHasAccessControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.CRUD_REST_PLUGIN__HAS_ACCESS_CONTROL, oldHasAccessControl, hasAccessControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginWebService getServiceProvider() {
		return serviceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceProvider(PluginWebService newServiceProvider, NotificationChain msgs) {
		PluginWebService oldServiceProvider = serviceProvider;
		serviceProvider = newServiceProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, crudrestPackage.CRUD_REST_PLUGIN__SERVICE_PROVIDER, oldServiceProvider, newServiceProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceProvider(PluginWebService newServiceProvider) {
		if (newServiceProvider != serviceProvider) {
			NotificationChain msgs = null;
			if (serviceProvider != null)
				msgs = ((InternalEObject)serviceProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.CRUD_REST_PLUGIN__SERVICE_PROVIDER, null, msgs);
			if (newServiceProvider != null)
				msgs = ((InternalEObject)newServiceProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.CRUD_REST_PLUGIN__SERVICE_PROVIDER, null, msgs);
			msgs = basicSetServiceProvider(newServiceProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.CRUD_REST_PLUGIN__SERVICE_PROVIDER, newServiceProvider, newServiceProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case crudrestPackage.CRUD_REST_PLUGIN__DETAIL:
				return basicSetDetail(null, msgs);
			case crudrestPackage.CRUD_REST_PLUGIN__GUI:
				return basicSetGui(null, msgs);
			case crudrestPackage.CRUD_REST_PLUGIN__SERVICE_PROVIDER:
				return basicSetServiceProvider(null, msgs);
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
			case crudrestPackage.CRUD_REST_PLUGIN__NAME:
				return getName();
			case crudrestPackage.CRUD_REST_PLUGIN__DETAIL:
				return getDetail();
			case crudrestPackage.CRUD_REST_PLUGIN__GUI:
				return getGui();
			case crudrestPackage.CRUD_REST_PLUGIN__HAS_ACCESS_CONTROL:
				return isHasAccessControl();
			case crudrestPackage.CRUD_REST_PLUGIN__SERVICE_PROVIDER:
				return getServiceProvider();
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
			case crudrestPackage.CRUD_REST_PLUGIN__NAME:
				setName((String)newValue);
				return;
			case crudrestPackage.CRUD_REST_PLUGIN__DETAIL:
				setDetail((PluginDetail)newValue);
				return;
			case crudrestPackage.CRUD_REST_PLUGIN__GUI:
				setGui((PluginGUI)newValue);
				return;
			case crudrestPackage.CRUD_REST_PLUGIN__HAS_ACCESS_CONTROL:
				setHasAccessControl((Boolean)newValue);
				return;
			case crudrestPackage.CRUD_REST_PLUGIN__SERVICE_PROVIDER:
				setServiceProvider((PluginWebService)newValue);
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
			case crudrestPackage.CRUD_REST_PLUGIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case crudrestPackage.CRUD_REST_PLUGIN__DETAIL:
				setDetail((PluginDetail)null);
				return;
			case crudrestPackage.CRUD_REST_PLUGIN__GUI:
				setGui((PluginGUI)null);
				return;
			case crudrestPackage.CRUD_REST_PLUGIN__HAS_ACCESS_CONTROL:
				setHasAccessControl(HAS_ACCESS_CONTROL_EDEFAULT);
				return;
			case crudrestPackage.CRUD_REST_PLUGIN__SERVICE_PROVIDER:
				setServiceProvider((PluginWebService)null);
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
			case crudrestPackage.CRUD_REST_PLUGIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case crudrestPackage.CRUD_REST_PLUGIN__DETAIL:
				return detail != null;
			case crudrestPackage.CRUD_REST_PLUGIN__GUI:
				return gui != null;
			case crudrestPackage.CRUD_REST_PLUGIN__HAS_ACCESS_CONTROL:
				return hasAccessControl != HAS_ACCESS_CONTROL_EDEFAULT;
			case crudrestPackage.CRUD_REST_PLUGIN__SERVICE_PROVIDER:
				return serviceProvider != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", hasAccessControl: ");
		result.append(hasAccessControl);
		result.append(')');
		return result.toString();
	}

} //CrudRestPluginImpl
