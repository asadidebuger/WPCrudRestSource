/**
 */
package crudrest.impl;

import crudrest.MenuItem;
import crudrest.UIPage;
import crudrest.crudrestPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crudrest.impl.MenuItemImpl#getPage <em>Page</em>}</li>
 *   <li>{@link crudrest.impl.MenuItemImpl#getOverrideTitle <em>Override Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MenuItemImpl extends MinimalEObjectImpl.Container implements MenuItem {
	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected UIPage page;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crudrestPackage.Literals.MENU_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIPage getPage() {
		if (page != null && page.eIsProxy()) {
			InternalEObject oldPage = (InternalEObject)page;
			page = (UIPage)eResolveProxy(oldPage);
			if (page != oldPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, crudrestPackage.MENU_ITEM__PAGE, oldPage, page));
			}
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIPage basicGetPage() {
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage(UIPage newPage) {
		UIPage oldPage = page;
		page = newPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.MENU_ITEM__PAGE, oldPage, page));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.MENU_ITEM__OVERRIDE_TITLE, oldOverrideTitle, overrideTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case crudrestPackage.MENU_ITEM__PAGE:
				if (resolve) return getPage();
				return basicGetPage();
			case crudrestPackage.MENU_ITEM__OVERRIDE_TITLE:
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
			case crudrestPackage.MENU_ITEM__PAGE:
				setPage((UIPage)newValue);
				return;
			case crudrestPackage.MENU_ITEM__OVERRIDE_TITLE:
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
			case crudrestPackage.MENU_ITEM__PAGE:
				setPage((UIPage)null);
				return;
			case crudrestPackage.MENU_ITEM__OVERRIDE_TITLE:
				setOverrideTitle(OVERRIDE_TITLE_EDEFAULT);
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
			case crudrestPackage.MENU_ITEM__PAGE:
				return page != null;
			case crudrestPackage.MENU_ITEM__OVERRIDE_TITLE:
				return OVERRIDE_TITLE_EDEFAULT == null ? overrideTitle != null : !OVERRIDE_TITLE_EDEFAULT.equals(overrideTitle);
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
		result.append(" (overrideTitle: ");
		result.append(overrideTitle);
		result.append(')');
		return result.toString();
	}

} //MenuItemImpl
