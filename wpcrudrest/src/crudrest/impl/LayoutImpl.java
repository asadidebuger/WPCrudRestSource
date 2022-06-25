/**
 */
package crudrest.impl;

import crudrest.Layout;
import crudrest.crudrestPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crudrest.impl.LayoutImpl#getName <em>Name</em>}</li>
 *   <li>{@link crudrest.impl.LayoutImpl#getCol_xs <em>Col xs</em>}</li>
 *   <li>{@link crudrest.impl.LayoutImpl#getCol_sm <em>Col sm</em>}</li>
 *   <li>{@link crudrest.impl.LayoutImpl#getCol_md <em>Col md</em>}</li>
 *   <li>{@link crudrest.impl.LayoutImpl#getCol_lg <em>Col lg</em>}</li>
 *   <li>{@link crudrest.impl.LayoutImpl#getCol_xl <em>Col xl</em>}</li>
 *   <li>{@link crudrest.impl.LayoutImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link crudrest.impl.LayoutImpl#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayoutImpl extends MinimalEObjectImpl.Container implements Layout {
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
	 * The default value of the '{@link #getCol_xs() <em>Col xs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol_xs()
	 * @generated
	 * @ordered
	 */
	protected static final int COL_XS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCol_xs() <em>Col xs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol_xs()
	 * @generated
	 * @ordered
	 */
	protected int col_xs = COL_XS_EDEFAULT;

	/**
	 * This is true if the Col xs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean col_xsESet;

	/**
	 * The default value of the '{@link #getCol_sm() <em>Col sm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol_sm()
	 * @generated
	 * @ordered
	 */
	protected static final int COL_SM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCol_sm() <em>Col sm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol_sm()
	 * @generated
	 * @ordered
	 */
	protected int col_sm = COL_SM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCol_md() <em>Col md</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol_md()
	 * @generated
	 * @ordered
	 */
	protected static final int COL_MD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCol_md() <em>Col md</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol_md()
	 * @generated
	 * @ordered
	 */
	protected int col_md = COL_MD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCol_lg() <em>Col lg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol_lg()
	 * @generated
	 * @ordered
	 */
	protected static final int COL_LG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCol_lg() <em>Col lg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol_lg()
	 * @generated
	 * @ordered
	 */
	protected int col_lg = COL_LG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCol_xl() <em>Col xl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol_xl()
	 * @generated
	 * @ordered
	 */
	protected static final int COL_XL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCol_xl() <em>Col xl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol_xl()
	 * @generated
	 * @ordered
	 */
	protected int col_xl = COL_XL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crudrestPackage.Literals.LAYOUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.LAYOUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCol_xs() {
		return col_xs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCol_xs(int newCol_xs) {
		int oldCol_xs = col_xs;
		col_xs = newCol_xs;
		boolean oldCol_xsESet = col_xsESet;
		col_xsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.LAYOUT__COL_XS, oldCol_xs, col_xs, !oldCol_xsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCol_xs() {
		int oldCol_xs = col_xs;
		boolean oldCol_xsESet = col_xsESet;
		col_xs = COL_XS_EDEFAULT;
		col_xsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, crudrestPackage.LAYOUT__COL_XS, oldCol_xs, COL_XS_EDEFAULT, oldCol_xsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCol_xs() {
		return col_xsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCol_sm() {
		return col_sm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCol_sm(int newCol_sm) {
		int oldCol_sm = col_sm;
		col_sm = newCol_sm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.LAYOUT__COL_SM, oldCol_sm, col_sm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCol_md() {
		return col_md;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCol_md(int newCol_md) {
		int oldCol_md = col_md;
		col_md = newCol_md;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.LAYOUT__COL_MD, oldCol_md, col_md));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCol_lg() {
		return col_lg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCol_lg(int newCol_lg) {
		int oldCol_lg = col_lg;
		col_lg = newCol_lg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.LAYOUT__COL_LG, oldCol_lg, col_lg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCol_xl() {
		return col_xl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCol_xl(int newCol_xl) {
		int oldCol_xl = col_xl;
		col_xl = newCol_xl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.LAYOUT__COL_XL, oldCol_xl, col_xl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.LAYOUT__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.LAYOUT__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case crudrestPackage.LAYOUT__NAME:
				return getName();
			case crudrestPackage.LAYOUT__COL_XS:
				return getCol_xs();
			case crudrestPackage.LAYOUT__COL_SM:
				return getCol_sm();
			case crudrestPackage.LAYOUT__COL_MD:
				return getCol_md();
			case crudrestPackage.LAYOUT__COL_LG:
				return getCol_lg();
			case crudrestPackage.LAYOUT__COL_XL:
				return getCol_xl();
			case crudrestPackage.LAYOUT__CLASS:
				return getClass_();
			case crudrestPackage.LAYOUT__STYLE:
				return getStyle();
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
			case crudrestPackage.LAYOUT__NAME:
				setName((String)newValue);
				return;
			case crudrestPackage.LAYOUT__COL_XS:
				setCol_xs((Integer)newValue);
				return;
			case crudrestPackage.LAYOUT__COL_SM:
				setCol_sm((Integer)newValue);
				return;
			case crudrestPackage.LAYOUT__COL_MD:
				setCol_md((Integer)newValue);
				return;
			case crudrestPackage.LAYOUT__COL_LG:
				setCol_lg((Integer)newValue);
				return;
			case crudrestPackage.LAYOUT__COL_XL:
				setCol_xl((Integer)newValue);
				return;
			case crudrestPackage.LAYOUT__CLASS:
				setClass((String)newValue);
				return;
			case crudrestPackage.LAYOUT__STYLE:
				setStyle((String)newValue);
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
			case crudrestPackage.LAYOUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case crudrestPackage.LAYOUT__COL_XS:
				unsetCol_xs();
				return;
			case crudrestPackage.LAYOUT__COL_SM:
				setCol_sm(COL_SM_EDEFAULT);
				return;
			case crudrestPackage.LAYOUT__COL_MD:
				setCol_md(COL_MD_EDEFAULT);
				return;
			case crudrestPackage.LAYOUT__COL_LG:
				setCol_lg(COL_LG_EDEFAULT);
				return;
			case crudrestPackage.LAYOUT__COL_XL:
				setCol_xl(COL_XL_EDEFAULT);
				return;
			case crudrestPackage.LAYOUT__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case crudrestPackage.LAYOUT__STYLE:
				setStyle(STYLE_EDEFAULT);
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
			case crudrestPackage.LAYOUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case crudrestPackage.LAYOUT__COL_XS:
				return isSetCol_xs();
			case crudrestPackage.LAYOUT__COL_SM:
				return col_sm != COL_SM_EDEFAULT;
			case crudrestPackage.LAYOUT__COL_MD:
				return col_md != COL_MD_EDEFAULT;
			case crudrestPackage.LAYOUT__COL_LG:
				return col_lg != COL_LG_EDEFAULT;
			case crudrestPackage.LAYOUT__COL_XL:
				return col_xl != COL_XL_EDEFAULT;
			case crudrestPackage.LAYOUT__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case crudrestPackage.LAYOUT__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
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
		result.append(", col_xs: ");
		if (col_xsESet) result.append(col_xs); else result.append("<unset>");
		result.append(", col_sm: ");
		result.append(col_sm);
		result.append(", col_md: ");
		result.append(col_md);
		result.append(", col_lg: ");
		result.append(col_lg);
		result.append(", col_xl: ");
		result.append(col_xl);
		result.append(", class: ");
		result.append(class_);
		result.append(", style: ");
		result.append(style);
		result.append(')');
		return result.toString();
	}

} //LayoutImpl
