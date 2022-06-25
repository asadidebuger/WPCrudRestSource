/**
 */
package crudrest.impl;

import crudrest.Entity;
import crudrest.Form;
import crudrest.List;
import crudrest.UIPage;
import crudrest.crudrestPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crudrest.impl.UIPageImpl#getKey <em>Key</em>}</li>
 *   <li>{@link crudrest.impl.UIPageImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link crudrest.impl.UIPageImpl#getForm <em>Form</em>}</li>
 *   <li>{@link crudrest.impl.UIPageImpl#getList <em>List</em>}</li>
 *   <li>{@link crudrest.impl.UIPageImpl#getOverrideTitle <em>Override Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIPageImpl extends MinimalEObjectImpl.Container implements UIPage {
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
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected Form form;

	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected List list;

	/**
	 * The default value of the '{@link #getOverrideTitle() <em>Override Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERRIDE_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverrideTitle() <em>Override Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideTitle()
	 * @generated
	 * @ordered
	 */
	protected String overrideTitle = OVERRIDE_TITLE_EDEFAULT;

	/**
	 * This is true if the Override Title attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overrideTitleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crudrestPackage.Literals.UI_PAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.UI_PAGE__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (Entity)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, crudrestPackage.UI_PAGE__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.UI_PAGE__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForm(Form newForm, NotificationChain msgs) {
		Form oldForm = form;
		form = newForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, crudrestPackage.UI_PAGE__FORM, oldForm, newForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(Form newForm) {
		if (newForm != form) {
			NotificationChain msgs = null;
			if (form != null)
				msgs = ((InternalEObject)form).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.UI_PAGE__FORM, null, msgs);
			if (newForm != null)
				msgs = ((InternalEObject)newForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.UI_PAGE__FORM, null, msgs);
			msgs = basicSetForm(newForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.UI_PAGE__FORM, newForm, newForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getList() {
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(List newList, NotificationChain msgs) {
		List oldList = list;
		list = newList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, crudrestPackage.UI_PAGE__LIST, oldList, newList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(List newList) {
		if (newList != list) {
			NotificationChain msgs = null;
			if (list != null)
				msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.UI_PAGE__LIST, null, msgs);
			if (newList != null)
				msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.UI_PAGE__LIST, null, msgs);
			msgs = basicSetList(newList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.UI_PAGE__LIST, newList, newList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverrideTitle() {
		return overrideTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverrideTitle(String newOverrideTitle) {
		String oldOverrideTitle = overrideTitle;
		overrideTitle = newOverrideTitle;
		boolean oldOverrideTitleESet = overrideTitleESet;
		overrideTitleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.UI_PAGE__OVERRIDE_TITLE, oldOverrideTitle, overrideTitle, !oldOverrideTitleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverrideTitle() {
		String oldOverrideTitle = overrideTitle;
		boolean oldOverrideTitleESet = overrideTitleESet;
		overrideTitle = OVERRIDE_TITLE_EDEFAULT;
		overrideTitleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, crudrestPackage.UI_PAGE__OVERRIDE_TITLE, oldOverrideTitle, OVERRIDE_TITLE_EDEFAULT, oldOverrideTitleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverrideTitle() {
		return overrideTitleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case crudrestPackage.UI_PAGE__FORM:
				return basicSetForm(null, msgs);
			case crudrestPackage.UI_PAGE__LIST:
				return basicSetList(null, msgs);
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
			case crudrestPackage.UI_PAGE__KEY:
				return getKey();
			case crudrestPackage.UI_PAGE__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case crudrestPackage.UI_PAGE__FORM:
				return getForm();
			case crudrestPackage.UI_PAGE__LIST:
				return getList();
			case crudrestPackage.UI_PAGE__OVERRIDE_TITLE:
				return getOverrideTitle();
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
			case crudrestPackage.UI_PAGE__KEY:
				setKey((String)newValue);
				return;
			case crudrestPackage.UI_PAGE__ENTITY:
				setEntity((Entity)newValue);
				return;
			case crudrestPackage.UI_PAGE__FORM:
				setForm((Form)newValue);
				return;
			case crudrestPackage.UI_PAGE__LIST:
				setList((List)newValue);
				return;
			case crudrestPackage.UI_PAGE__OVERRIDE_TITLE:
				setOverrideTitle((String)newValue);
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
			case crudrestPackage.UI_PAGE__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case crudrestPackage.UI_PAGE__ENTITY:
				setEntity((Entity)null);
				return;
			case crudrestPackage.UI_PAGE__FORM:
				setForm((Form)null);
				return;
			case crudrestPackage.UI_PAGE__LIST:
				setList((List)null);
				return;
			case crudrestPackage.UI_PAGE__OVERRIDE_TITLE:
				unsetOverrideTitle();
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
			case crudrestPackage.UI_PAGE__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case crudrestPackage.UI_PAGE__ENTITY:
				return entity != null;
			case crudrestPackage.UI_PAGE__FORM:
				return form != null;
			case crudrestPackage.UI_PAGE__LIST:
				return list != null;
			case crudrestPackage.UI_PAGE__OVERRIDE_TITLE:
				return isSetOverrideTitle();
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
		result.append(", overrideTitle: ");
		if (overrideTitleESet) result.append(overrideTitle); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UIPageImpl
