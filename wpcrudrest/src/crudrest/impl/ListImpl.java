/**
 */
package crudrest.impl;

import crudrest.BulkAction;
import crudrest.FieldBase;
import crudrest.List;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crudrest.impl.ListImpl#isShowCreateButton <em>Show Create Button</em>}</li>
 *   <li>{@link crudrest.impl.ListImpl#isShowEditButton <em>Show Edit Button</em>}</li>
 *   <li>{@link crudrest.impl.ListImpl#isShowSearchBox <em>Show Search Box</em>}</li>
 *   <li>{@link crudrest.impl.ListImpl#isShowViewDetailButton <em>Show View Detail Button</em>}</li>
 *   <li>{@link crudrest.impl.ListImpl#isShowDeleteButton <em>Show Delete Button</em>}</li>
 *   <li>{@link crudrest.impl.ListImpl#isShowIdCol <em>Show Id Col</em>}</li>
 *   <li>{@link crudrest.impl.ListImpl#getItemsPerPage <em>Items Per Page</em>}</li>
 *   <li>{@link crudrest.impl.ListImpl#getListColumns <em>List Columns</em>}</li>
 *   <li>{@link crudrest.impl.ListImpl#getSortableColumns <em>Sortable Columns</em>}</li>
 *   <li>{@link crudrest.impl.ListImpl#getSearchableColumns <em>Searchable Columns</em>}</li>
 *   <li>{@link crudrest.impl.ListImpl#getExtendWhereClause <em>Extend Where Clause</em>}</li>
 *   <li>{@link crudrest.impl.ListImpl#getBulkAction <em>Bulk Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListImpl extends MinimalEObjectImpl.Container implements List {
	/**
	 * The default value of the '{@link #isShowCreateButton() <em>Show Create Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowCreateButton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_CREATE_BUTTON_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowCreateButton() <em>Show Create Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowCreateButton()
	 * @generated
	 * @ordered
	 */
	protected boolean showCreateButton = SHOW_CREATE_BUTTON_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowEditButton() <em>Show Edit Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowEditButton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_EDIT_BUTTON_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowEditButton() <em>Show Edit Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowEditButton()
	 * @generated
	 * @ordered
	 */
	protected boolean showEditButton = SHOW_EDIT_BUTTON_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowSearchBox() <em>Show Search Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowSearchBox()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_SEARCH_BOX_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowSearchBox() <em>Show Search Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowSearchBox()
	 * @generated
	 * @ordered
	 */
	protected boolean showSearchBox = SHOW_SEARCH_BOX_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowViewDetailButton() <em>Show View Detail Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowViewDetailButton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_VIEW_DETAIL_BUTTON_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowViewDetailButton() <em>Show View Detail Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowViewDetailButton()
	 * @generated
	 * @ordered
	 */
	protected boolean showViewDetailButton = SHOW_VIEW_DETAIL_BUTTON_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowDeleteButton() <em>Show Delete Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowDeleteButton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_DELETE_BUTTON_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowDeleteButton() <em>Show Delete Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowDeleteButton()
	 * @generated
	 * @ordered
	 */
	protected boolean showDeleteButton = SHOW_DELETE_BUTTON_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowIdCol() <em>Show Id Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowIdCol()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_ID_COL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowIdCol() <em>Show Id Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowIdCol()
	 * @generated
	 * @ordered
	 */
	protected boolean showIdCol = SHOW_ID_COL_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemsPerPage() <em>Items Per Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemsPerPage()
	 * @generated
	 * @ordered
	 */
	protected static final int ITEMS_PER_PAGE_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getItemsPerPage() <em>Items Per Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemsPerPage()
	 * @generated
	 * @ordered
	 */
	protected int itemsPerPage = ITEMS_PER_PAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListColumns() <em>List Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldBase> listColumns;

	/**
	 * The cached value of the '{@link #getSortableColumns() <em>Sortable Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortableColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldBase> sortableColumns;

	/**
	 * The cached value of the '{@link #getSearchableColumns() <em>Searchable Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchableColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldBase> searchableColumns;

	/**
	 * The default value of the '{@link #getExtendWhereClause() <em>Extend Where Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendWhereClause()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTEND_WHERE_CLAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendWhereClause() <em>Extend Where Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendWhereClause()
	 * @generated
	 * @ordered
	 */
	protected String extendWhereClause = EXTEND_WHERE_CLAUSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBulkAction() <em>Bulk Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulkAction()
	 * @generated
	 * @ordered
	 */
	protected EList<BulkAction> bulkAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crudrestPackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowCreateButton() {
		return showCreateButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowCreateButton(boolean newShowCreateButton) {
		boolean oldShowCreateButton = showCreateButton;
		showCreateButton = newShowCreateButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.LIST__SHOW_CREATE_BUTTON, oldShowCreateButton, showCreateButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowEditButton() {
		return showEditButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowEditButton(boolean newShowEditButton) {
		boolean oldShowEditButton = showEditButton;
		showEditButton = newShowEditButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.LIST__SHOW_EDIT_BUTTON, oldShowEditButton, showEditButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowSearchBox() {
		return showSearchBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowSearchBox(boolean newShowSearchBox) {
		boolean oldShowSearchBox = showSearchBox;
		showSearchBox = newShowSearchBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.LIST__SHOW_SEARCH_BOX, oldShowSearchBox, showSearchBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowViewDetailButton() {
		return showViewDetailButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowViewDetailButton(boolean newShowViewDetailButton) {
		boolean oldShowViewDetailButton = showViewDetailButton;
		showViewDetailButton = newShowViewDetailButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.LIST__SHOW_VIEW_DETAIL_BUTTON, oldShowViewDetailButton, showViewDetailButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowDeleteButton() {
		return showDeleteButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowDeleteButton(boolean newShowDeleteButton) {
		boolean oldShowDeleteButton = showDeleteButton;
		showDeleteButton = newShowDeleteButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.LIST__SHOW_DELETE_BUTTON, oldShowDeleteButton, showDeleteButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowIdCol() {
		return showIdCol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowIdCol(boolean newShowIdCol) {
		boolean oldShowIdCol = showIdCol;
		showIdCol = newShowIdCol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.LIST__SHOW_ID_COL, oldShowIdCol, showIdCol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getItemsPerPage() {
		return itemsPerPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemsPerPage(int newItemsPerPage) {
		int oldItemsPerPage = itemsPerPage;
		itemsPerPage = newItemsPerPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.LIST__ITEMS_PER_PAGE, oldItemsPerPage, itemsPerPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldBase> getListColumns() {
		if (listColumns == null) {
			listColumns = new EObjectResolvingEList.Unsettable<FieldBase>(FieldBase.class, this, crudrestPackage.LIST__LIST_COLUMNS);
		}
		return listColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetListColumns() {
		if (listColumns != null) ((InternalEList.Unsettable<?>)listColumns).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetListColumns() {
		return listColumns != null && ((InternalEList.Unsettable<?>)listColumns).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldBase> getSortableColumns() {
		if (sortableColumns == null) {
			sortableColumns = new EObjectResolvingEList<FieldBase>(FieldBase.class, this, crudrestPackage.LIST__SORTABLE_COLUMNS);
		}
		return sortableColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldBase> getSearchableColumns() {
		if (searchableColumns == null) {
			searchableColumns = new EObjectResolvingEList<FieldBase>(FieldBase.class, this, crudrestPackage.LIST__SEARCHABLE_COLUMNS);
		}
		return searchableColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtendWhereClause() {
		return extendWhereClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendWhereClause(String newExtendWhereClause) {
		String oldExtendWhereClause = extendWhereClause;
		extendWhereClause = newExtendWhereClause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.LIST__EXTEND_WHERE_CLAUSE, oldExtendWhereClause, extendWhereClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BulkAction> getBulkAction() {
		if (bulkAction == null) {
			bulkAction = new EObjectContainmentEList<BulkAction>(BulkAction.class, this, crudrestPackage.LIST__BULK_ACTION);
		}
		return bulkAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case crudrestPackage.LIST__BULK_ACTION:
				return ((InternalEList<?>)getBulkAction()).basicRemove(otherEnd, msgs);
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
			case crudrestPackage.LIST__SHOW_CREATE_BUTTON:
				return isShowCreateButton();
			case crudrestPackage.LIST__SHOW_EDIT_BUTTON:
				return isShowEditButton();
			case crudrestPackage.LIST__SHOW_SEARCH_BOX:
				return isShowSearchBox();
			case crudrestPackage.LIST__SHOW_VIEW_DETAIL_BUTTON:
				return isShowViewDetailButton();
			case crudrestPackage.LIST__SHOW_DELETE_BUTTON:
				return isShowDeleteButton();
			case crudrestPackage.LIST__SHOW_ID_COL:
				return isShowIdCol();
			case crudrestPackage.LIST__ITEMS_PER_PAGE:
				return getItemsPerPage();
			case crudrestPackage.LIST__LIST_COLUMNS:
				return getListColumns();
			case crudrestPackage.LIST__SORTABLE_COLUMNS:
				return getSortableColumns();
			case crudrestPackage.LIST__SEARCHABLE_COLUMNS:
				return getSearchableColumns();
			case crudrestPackage.LIST__EXTEND_WHERE_CLAUSE:
				return getExtendWhereClause();
			case crudrestPackage.LIST__BULK_ACTION:
				return getBulkAction();
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
			case crudrestPackage.LIST__SHOW_CREATE_BUTTON:
				setShowCreateButton((Boolean)newValue);
				return;
			case crudrestPackage.LIST__SHOW_EDIT_BUTTON:
				setShowEditButton((Boolean)newValue);
				return;
			case crudrestPackage.LIST__SHOW_SEARCH_BOX:
				setShowSearchBox((Boolean)newValue);
				return;
			case crudrestPackage.LIST__SHOW_VIEW_DETAIL_BUTTON:
				setShowViewDetailButton((Boolean)newValue);
				return;
			case crudrestPackage.LIST__SHOW_DELETE_BUTTON:
				setShowDeleteButton((Boolean)newValue);
				return;
			case crudrestPackage.LIST__SHOW_ID_COL:
				setShowIdCol((Boolean)newValue);
				return;
			case crudrestPackage.LIST__ITEMS_PER_PAGE:
				setItemsPerPage((Integer)newValue);
				return;
			case crudrestPackage.LIST__LIST_COLUMNS:
				getListColumns().clear();
				getListColumns().addAll((Collection<? extends FieldBase>)newValue);
				return;
			case crudrestPackage.LIST__SORTABLE_COLUMNS:
				getSortableColumns().clear();
				getSortableColumns().addAll((Collection<? extends FieldBase>)newValue);
				return;
			case crudrestPackage.LIST__SEARCHABLE_COLUMNS:
				getSearchableColumns().clear();
				getSearchableColumns().addAll((Collection<? extends FieldBase>)newValue);
				return;
			case crudrestPackage.LIST__EXTEND_WHERE_CLAUSE:
				setExtendWhereClause((String)newValue);
				return;
			case crudrestPackage.LIST__BULK_ACTION:
				getBulkAction().clear();
				getBulkAction().addAll((Collection<? extends BulkAction>)newValue);
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
			case crudrestPackage.LIST__SHOW_CREATE_BUTTON:
				setShowCreateButton(SHOW_CREATE_BUTTON_EDEFAULT);
				return;
			case crudrestPackage.LIST__SHOW_EDIT_BUTTON:
				setShowEditButton(SHOW_EDIT_BUTTON_EDEFAULT);
				return;
			case crudrestPackage.LIST__SHOW_SEARCH_BOX:
				setShowSearchBox(SHOW_SEARCH_BOX_EDEFAULT);
				return;
			case crudrestPackage.LIST__SHOW_VIEW_DETAIL_BUTTON:
				setShowViewDetailButton(SHOW_VIEW_DETAIL_BUTTON_EDEFAULT);
				return;
			case crudrestPackage.LIST__SHOW_DELETE_BUTTON:
				setShowDeleteButton(SHOW_DELETE_BUTTON_EDEFAULT);
				return;
			case crudrestPackage.LIST__SHOW_ID_COL:
				setShowIdCol(SHOW_ID_COL_EDEFAULT);
				return;
			case crudrestPackage.LIST__ITEMS_PER_PAGE:
				setItemsPerPage(ITEMS_PER_PAGE_EDEFAULT);
				return;
			case crudrestPackage.LIST__LIST_COLUMNS:
				unsetListColumns();
				return;
			case crudrestPackage.LIST__SORTABLE_COLUMNS:
				getSortableColumns().clear();
				return;
			case crudrestPackage.LIST__SEARCHABLE_COLUMNS:
				getSearchableColumns().clear();
				return;
			case crudrestPackage.LIST__EXTEND_WHERE_CLAUSE:
				setExtendWhereClause(EXTEND_WHERE_CLAUSE_EDEFAULT);
				return;
			case crudrestPackage.LIST__BULK_ACTION:
				getBulkAction().clear();
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
			case crudrestPackage.LIST__SHOW_CREATE_BUTTON:
				return showCreateButton != SHOW_CREATE_BUTTON_EDEFAULT;
			case crudrestPackage.LIST__SHOW_EDIT_BUTTON:
				return showEditButton != SHOW_EDIT_BUTTON_EDEFAULT;
			case crudrestPackage.LIST__SHOW_SEARCH_BOX:
				return showSearchBox != SHOW_SEARCH_BOX_EDEFAULT;
			case crudrestPackage.LIST__SHOW_VIEW_DETAIL_BUTTON:
				return showViewDetailButton != SHOW_VIEW_DETAIL_BUTTON_EDEFAULT;
			case crudrestPackage.LIST__SHOW_DELETE_BUTTON:
				return showDeleteButton != SHOW_DELETE_BUTTON_EDEFAULT;
			case crudrestPackage.LIST__SHOW_ID_COL:
				return showIdCol != SHOW_ID_COL_EDEFAULT;
			case crudrestPackage.LIST__ITEMS_PER_PAGE:
				return itemsPerPage != ITEMS_PER_PAGE_EDEFAULT;
			case crudrestPackage.LIST__LIST_COLUMNS:
				return isSetListColumns();
			case crudrestPackage.LIST__SORTABLE_COLUMNS:
				return sortableColumns != null && !sortableColumns.isEmpty();
			case crudrestPackage.LIST__SEARCHABLE_COLUMNS:
				return searchableColumns != null && !searchableColumns.isEmpty();
			case crudrestPackage.LIST__EXTEND_WHERE_CLAUSE:
				return EXTEND_WHERE_CLAUSE_EDEFAULT == null ? extendWhereClause != null : !EXTEND_WHERE_CLAUSE_EDEFAULT.equals(extendWhereClause);
			case crudrestPackage.LIST__BULK_ACTION:
				return bulkAction != null && !bulkAction.isEmpty();
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
		result.append(" (showCreateButton: ");
		result.append(showCreateButton);
		result.append(", showEditButton: ");
		result.append(showEditButton);
		result.append(", showSearchBox: ");
		result.append(showSearchBox);
		result.append(", showViewDetailButton: ");
		result.append(showViewDetailButton);
		result.append(", showDeleteButton: ");
		result.append(showDeleteButton);
		result.append(", showIdCol: ");
		result.append(showIdCol);
		result.append(", itemsPerPage: ");
		result.append(itemsPerPage);
		result.append(", extendWhereClause: ");
		result.append(extendWhereClause);
		result.append(')');
		return result.toString();
	}

} //ListImpl
