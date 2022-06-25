/**
 */
package crudrest.impl;

import crudrest.HttpMethod;
import crudrest.WebserviceFunction;
import crudrest.crudrestPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Webservice Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crudrest.impl.WebserviceFunctionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link crudrest.impl.WebserviceFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link crudrest.impl.WebserviceFunctionImpl#isCheckAccessControl <em>Check Access Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebserviceFunctionImpl extends MinimalEObjectImpl.Container implements WebserviceFunction {
	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final HttpMethod METHOD_EDEFAULT = HttpMethod.GET;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected HttpMethod method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #isCheckAccessControl() <em>Check Access Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckAccessControl()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_ACCESS_CONTROL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckAccessControl() <em>Check Access Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckAccessControl()
	 * @generated
	 * @ordered
	 */
	protected boolean checkAccessControl = CHECK_ACCESS_CONTROL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebserviceFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crudrestPackage.Literals.WEBSERVICE_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(HttpMethod newMethod) {
		HttpMethod oldMethod = method;
		method = newMethod == null ? METHOD_EDEFAULT : newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.WEBSERVICE_FUNCTION__METHOD, oldMethod, method));
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
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.WEBSERVICE_FUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckAccessControl() {
		return checkAccessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckAccessControl(boolean newCheckAccessControl) {
		boolean oldCheckAccessControl = checkAccessControl;
		checkAccessControl = newCheckAccessControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.WEBSERVICE_FUNCTION__CHECK_ACCESS_CONTROL, oldCheckAccessControl, checkAccessControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case crudrestPackage.WEBSERVICE_FUNCTION__METHOD:
				return getMethod();
			case crudrestPackage.WEBSERVICE_FUNCTION__NAME:
				return getName();
			case crudrestPackage.WEBSERVICE_FUNCTION__CHECK_ACCESS_CONTROL:
				return isCheckAccessControl();
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
			case crudrestPackage.WEBSERVICE_FUNCTION__METHOD:
				setMethod((HttpMethod)newValue);
				return;
			case crudrestPackage.WEBSERVICE_FUNCTION__NAME:
				setName((String)newValue);
				return;
			case crudrestPackage.WEBSERVICE_FUNCTION__CHECK_ACCESS_CONTROL:
				setCheckAccessControl((Boolean)newValue);
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
			case crudrestPackage.WEBSERVICE_FUNCTION__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case crudrestPackage.WEBSERVICE_FUNCTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case crudrestPackage.WEBSERVICE_FUNCTION__CHECK_ACCESS_CONTROL:
				setCheckAccessControl(CHECK_ACCESS_CONTROL_EDEFAULT);
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
			case crudrestPackage.WEBSERVICE_FUNCTION__METHOD:
				return method != METHOD_EDEFAULT;
			case crudrestPackage.WEBSERVICE_FUNCTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case crudrestPackage.WEBSERVICE_FUNCTION__CHECK_ACCESS_CONTROL:
				return checkAccessControl != CHECK_ACCESS_CONTROL_EDEFAULT;
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
		result.append(" (method: ");
		result.append(method);
		result.append(", name: ");
		result.append(name);
		result.append(", checkAccessControl: ");
		result.append(checkAccessControl);
		result.append(')');
		return result.toString();
	}

} //WebserviceFunctionImpl
