/**
 */
package crudrest.impl;

import crudrest.VueElement;
import crudrest.crudrestPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vue Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crudrest.impl.VueElementImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link crudrest.impl.VueElementImpl#getUrlJs <em>Url Js</em>}</li>
 *   <li>{@link crudrest.impl.VueElementImpl#getUrlCss <em>Url Css</em>}</li>
 *   <li>{@link crudrest.impl.VueElementImpl#getParams <em>Params</em>}</li>
 *   <li>{@link crudrest.impl.VueElementImpl#getValidation <em>Validation</em>}</li>
 *   <li>{@link crudrest.impl.VueElementImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VueElementImpl extends MinimalEObjectImpl.Container implements VueElement {
	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrlJs() <em>Url Js</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlJs()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_JS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrlJs() <em>Url Js</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlJs()
	 * @generated
	 * @ordered
	 */
	protected String urlJs = URL_JS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrlCss() <em>Url Css</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlCss()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_CSS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrlCss() <em>Url Css</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlCss()
	 * @generated
	 * @ordered
	 */
	protected String urlCss = URL_CSS_EDEFAULT;

	/**
	 * The default value of the '{@link #getParams() <em>Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected String params = PARAMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidation() <em>Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidation()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidation() <em>Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidation()
	 * @generated
	 * @ordered
	 */
	protected String validation = VALIDATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponent() <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected String component = COMPONENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VueElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crudrestPackage.Literals.VUE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.VUE_ELEMENT__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrlJs() {
		return urlJs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlJs(String newUrlJs) {
		String oldUrlJs = urlJs;
		urlJs = newUrlJs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.VUE_ELEMENT__URL_JS, oldUrlJs, urlJs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrlCss() {
		return urlCss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlCss(String newUrlCss) {
		String oldUrlCss = urlCss;
		urlCss = newUrlCss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.VUE_ELEMENT__URL_CSS, oldUrlCss, urlCss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParams() {
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParams(String newParams) {
		String oldParams = params;
		params = newParams;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.VUE_ELEMENT__PARAMS, oldParams, params));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValidation() {
		return validation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidation(String newValidation) {
		String oldValidation = validation;
		validation = newValidation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.VUE_ELEMENT__VALIDATION, oldValidation, validation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(String newComponent) {
		String oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.VUE_ELEMENT__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case crudrestPackage.VUE_ELEMENT__TAG:
				return getTag();
			case crudrestPackage.VUE_ELEMENT__URL_JS:
				return getUrlJs();
			case crudrestPackage.VUE_ELEMENT__URL_CSS:
				return getUrlCss();
			case crudrestPackage.VUE_ELEMENT__PARAMS:
				return getParams();
			case crudrestPackage.VUE_ELEMENT__VALIDATION:
				return getValidation();
			case crudrestPackage.VUE_ELEMENT__COMPONENT:
				return getComponent();
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
			case crudrestPackage.VUE_ELEMENT__TAG:
				setTag((String)newValue);
				return;
			case crudrestPackage.VUE_ELEMENT__URL_JS:
				setUrlJs((String)newValue);
				return;
			case crudrestPackage.VUE_ELEMENT__URL_CSS:
				setUrlCss((String)newValue);
				return;
			case crudrestPackage.VUE_ELEMENT__PARAMS:
				setParams((String)newValue);
				return;
			case crudrestPackage.VUE_ELEMENT__VALIDATION:
				setValidation((String)newValue);
				return;
			case crudrestPackage.VUE_ELEMENT__COMPONENT:
				setComponent((String)newValue);
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
			case crudrestPackage.VUE_ELEMENT__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case crudrestPackage.VUE_ELEMENT__URL_JS:
				setUrlJs(URL_JS_EDEFAULT);
				return;
			case crudrestPackage.VUE_ELEMENT__URL_CSS:
				setUrlCss(URL_CSS_EDEFAULT);
				return;
			case crudrestPackage.VUE_ELEMENT__PARAMS:
				setParams(PARAMS_EDEFAULT);
				return;
			case crudrestPackage.VUE_ELEMENT__VALIDATION:
				setValidation(VALIDATION_EDEFAULT);
				return;
			case crudrestPackage.VUE_ELEMENT__COMPONENT:
				setComponent(COMPONENT_EDEFAULT);
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
			case crudrestPackage.VUE_ELEMENT__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case crudrestPackage.VUE_ELEMENT__URL_JS:
				return URL_JS_EDEFAULT == null ? urlJs != null : !URL_JS_EDEFAULT.equals(urlJs);
			case crudrestPackage.VUE_ELEMENT__URL_CSS:
				return URL_CSS_EDEFAULT == null ? urlCss != null : !URL_CSS_EDEFAULT.equals(urlCss);
			case crudrestPackage.VUE_ELEMENT__PARAMS:
				return PARAMS_EDEFAULT == null ? params != null : !PARAMS_EDEFAULT.equals(params);
			case crudrestPackage.VUE_ELEMENT__VALIDATION:
				return VALIDATION_EDEFAULT == null ? validation != null : !VALIDATION_EDEFAULT.equals(validation);
			case crudrestPackage.VUE_ELEMENT__COMPONENT:
				return COMPONENT_EDEFAULT == null ? component != null : !COMPONENT_EDEFAULT.equals(component);
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
		result.append(" (tag: ");
		result.append(tag);
		result.append(", urlJs: ");
		result.append(urlJs);
		result.append(", urlCss: ");
		result.append(urlCss);
		result.append(", params: ");
		result.append(params);
		result.append(", validation: ");
		result.append(validation);
		result.append(", component: ");
		result.append(component);
		result.append(')');
		return result.toString();
	}

} //VueElementImpl
