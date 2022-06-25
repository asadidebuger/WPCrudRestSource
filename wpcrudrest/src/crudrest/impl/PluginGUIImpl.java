/**
 */
package crudrest.impl;

import crudrest.Layout;
import crudrest.Menu;
import crudrest.PluginGUI;
import crudrest.UIPage;
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
 * An implementation of the model object '<em><b>Plugin GUI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crudrest.impl.PluginGUIImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link crudrest.impl.PluginGUIImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link crudrest.impl.PluginGUIImpl#getMenu <em>Menu</em>}</li>
 *   <li>{@link crudrest.impl.PluginGUIImpl#getPage <em>Page</em>}</li>
 *   <li>{@link crudrest.impl.PluginGUIImpl#getReusableLayout <em>Reusable Layout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginGUIImpl extends MinimalEObjectImpl.Container implements PluginGUI {
	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMenu() <em>Menu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected Menu menu;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected EList<UIPage> page;

	/**
	 * The cached value of the '{@link #getReusableLayout() <em>Reusable Layout</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReusableLayout()
	 * @generated
	 * @ordered
	 */
	protected EList<Layout> reusableLayout;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginGUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crudrestPackage.Literals.PLUGIN_GUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_GUI__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_GUI__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu getMenu() {
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMenu(Menu newMenu, NotificationChain msgs) {
		Menu oldMenu = menu;
		menu = newMenu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_GUI__MENU, oldMenu, newMenu);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenu(Menu newMenu) {
		if (newMenu != menu) {
			NotificationChain msgs = null;
			if (menu != null)
				msgs = ((InternalEObject)menu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.PLUGIN_GUI__MENU, null, msgs);
			if (newMenu != null)
				msgs = ((InternalEObject)newMenu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.PLUGIN_GUI__MENU, null, msgs);
			msgs = basicSetMenu(newMenu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_GUI__MENU, newMenu, newMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIPage> getPage() {
		if (page == null) {
			page = new EObjectContainmentEList<UIPage>(UIPage.class, this, crudrestPackage.PLUGIN_GUI__PAGE);
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layout> getReusableLayout() {
		if (reusableLayout == null) {
			reusableLayout = new EObjectContainmentEList<Layout>(Layout.class, this, crudrestPackage.PLUGIN_GUI__REUSABLE_LAYOUT);
		}
		return reusableLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case crudrestPackage.PLUGIN_GUI__MENU:
				return basicSetMenu(null, msgs);
			case crudrestPackage.PLUGIN_GUI__PAGE:
				return ((InternalEList<?>)getPage()).basicRemove(otherEnd, msgs);
			case crudrestPackage.PLUGIN_GUI__REUSABLE_LAYOUT:
				return ((InternalEList<?>)getReusableLayout()).basicRemove(otherEnd, msgs);
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
			case crudrestPackage.PLUGIN_GUI__CLASS:
				return getClass_();
			case crudrestPackage.PLUGIN_GUI__STYLE:
				return getStyle();
			case crudrestPackage.PLUGIN_GUI__MENU:
				return getMenu();
			case crudrestPackage.PLUGIN_GUI__PAGE:
				return getPage();
			case crudrestPackage.PLUGIN_GUI__REUSABLE_LAYOUT:
				return getReusableLayout();
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
			case crudrestPackage.PLUGIN_GUI__CLASS:
				setClass((String)newValue);
				return;
			case crudrestPackage.PLUGIN_GUI__STYLE:
				setStyle((String)newValue);
				return;
			case crudrestPackage.PLUGIN_GUI__MENU:
				setMenu((Menu)newValue);
				return;
			case crudrestPackage.PLUGIN_GUI__PAGE:
				getPage().clear();
				getPage().addAll((Collection<? extends UIPage>)newValue);
				return;
			case crudrestPackage.PLUGIN_GUI__REUSABLE_LAYOUT:
				getReusableLayout().clear();
				getReusableLayout().addAll((Collection<? extends Layout>)newValue);
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
			case crudrestPackage.PLUGIN_GUI__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case crudrestPackage.PLUGIN_GUI__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case crudrestPackage.PLUGIN_GUI__MENU:
				setMenu((Menu)null);
				return;
			case crudrestPackage.PLUGIN_GUI__PAGE:
				getPage().clear();
				return;
			case crudrestPackage.PLUGIN_GUI__REUSABLE_LAYOUT:
				getReusableLayout().clear();
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
			case crudrestPackage.PLUGIN_GUI__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case crudrestPackage.PLUGIN_GUI__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case crudrestPackage.PLUGIN_GUI__MENU:
				return menu != null;
			case crudrestPackage.PLUGIN_GUI__PAGE:
				return page != null && !page.isEmpty();
			case crudrestPackage.PLUGIN_GUI__REUSABLE_LAYOUT:
				return reusableLayout != null && !reusableLayout.isEmpty();
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
		result.append(" (class: ");
		result.append(class_);
		result.append(", style: ");
		result.append(style);
		result.append(')');
		return result.toString();
	}

} //PluginGUIImpl
