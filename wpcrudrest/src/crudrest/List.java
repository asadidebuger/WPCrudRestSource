/**
 */
package crudrest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.List#isShowCreateButton <em>Show Create Button</em>}</li>
 *   <li>{@link crudrest.List#isShowEditButton <em>Show Edit Button</em>}</li>
 *   <li>{@link crudrest.List#isShowSearchBox <em>Show Search Box</em>}</li>
 *   <li>{@link crudrest.List#isShowViewDetailButton <em>Show View Detail Button</em>}</li>
 *   <li>{@link crudrest.List#isShowDeleteButton <em>Show Delete Button</em>}</li>
 *   <li>{@link crudrest.List#isShowIdCol <em>Show Id Col</em>}</li>
 *   <li>{@link crudrest.List#getItemsPerPage <em>Items Per Page</em>}</li>
 *   <li>{@link crudrest.List#getListColumns <em>List Columns</em>}</li>
 *   <li>{@link crudrest.List#getSortableColumns <em>Sortable Columns</em>}</li>
 *   <li>{@link crudrest.List#getSearchableColumns <em>Searchable Columns</em>}</li>
 *   <li>{@link crudrest.List#getExtendWhereClause <em>Extend Where Clause</em>}</li>
 *   <li>{@link crudrest.List#getBulkAction <em>Bulk Action</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getList()
 * @model
 * @generated
 */
public interface List extends EObject {
	/**
	 * Returns the value of the '<em><b>Show Create Button</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Create Button</em>' attribute.
	 * @see #setShowCreateButton(boolean)
	 * @see crudrest.crudrestPackage#getList_ShowCreateButton()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowCreateButton();

	/**
	 * Sets the value of the '{@link crudrest.List#isShowCreateButton <em>Show Create Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Create Button</em>' attribute.
	 * @see #isShowCreateButton()
	 * @generated
	 */
	void setShowCreateButton(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Edit Button</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Edit Button</em>' attribute.
	 * @see #setShowEditButton(boolean)
	 * @see crudrest.crudrestPackage#getList_ShowEditButton()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowEditButton();

	/**
	 * Sets the value of the '{@link crudrest.List#isShowEditButton <em>Show Edit Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Edit Button</em>' attribute.
	 * @see #isShowEditButton()
	 * @generated
	 */
	void setShowEditButton(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Search Box</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Search Box</em>' attribute.
	 * @see #setShowSearchBox(boolean)
	 * @see crudrest.crudrestPackage#getList_ShowSearchBox()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowSearchBox();

	/**
	 * Sets the value of the '{@link crudrest.List#isShowSearchBox <em>Show Search Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Search Box</em>' attribute.
	 * @see #isShowSearchBox()
	 * @generated
	 */
	void setShowSearchBox(boolean value);

	/**
	 * Returns the value of the '<em><b>Show View Detail Button</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show View Detail Button</em>' attribute.
	 * @see #setShowViewDetailButton(boolean)
	 * @see crudrest.crudrestPackage#getList_ShowViewDetailButton()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowViewDetailButton();

	/**
	 * Sets the value of the '{@link crudrest.List#isShowViewDetailButton <em>Show View Detail Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show View Detail Button</em>' attribute.
	 * @see #isShowViewDetailButton()
	 * @generated
	 */
	void setShowViewDetailButton(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Delete Button</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Delete Button</em>' attribute.
	 * @see #setShowDeleteButton(boolean)
	 * @see crudrest.crudrestPackage#getList_ShowDeleteButton()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowDeleteButton();

	/**
	 * Sets the value of the '{@link crudrest.List#isShowDeleteButton <em>Show Delete Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Delete Button</em>' attribute.
	 * @see #isShowDeleteButton()
	 * @generated
	 */
	void setShowDeleteButton(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Id Col</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Id Col</em>' attribute.
	 * @see #setShowIdCol(boolean)
	 * @see crudrest.crudrestPackage#getList_ShowIdCol()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowIdCol();

	/**
	 * Sets the value of the '{@link crudrest.List#isShowIdCol <em>Show Id Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Id Col</em>' attribute.
	 * @see #isShowIdCol()
	 * @generated
	 */
	void setShowIdCol(boolean value);

	/**
	 * Returns the value of the '<em><b>Items Per Page</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items Per Page</em>' attribute.
	 * @see #setItemsPerPage(int)
	 * @see crudrest.crudrestPackage#getList_ItemsPerPage()
	 * @model default="10"
	 * @generated
	 */
	int getItemsPerPage();

	/**
	 * Sets the value of the '{@link crudrest.List#getItemsPerPage <em>Items Per Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items Per Page</em>' attribute.
	 * @see #getItemsPerPage()
	 * @generated
	 */
	void setItemsPerPage(int value);

	/**
	 * Returns the value of the '<em><b>List Columns</b></em>' reference list.
	 * The list contents are of type {@link crudrest.FieldBase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Columns</em>' reference list.
	 * @see #isSetListColumns()
	 * @see #unsetListColumns()
	 * @see crudrest.crudrestPackage#getList_ListColumns()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<FieldBase> getListColumns();

	/**
	 * Unsets the value of the '{@link crudrest.List#getListColumns <em>List Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetListColumns()
	 * @see #getListColumns()
	 * @generated
	 */
	void unsetListColumns();

	/**
	 * Returns whether the value of the '{@link crudrest.List#getListColumns <em>List Columns</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>List Columns</em>' reference list is set.
	 * @see #unsetListColumns()
	 * @see #getListColumns()
	 * @generated
	 */
	boolean isSetListColumns();

	/**
	 * Returns the value of the '<em><b>Sortable Columns</b></em>' reference list.
	 * The list contents are of type {@link crudrest.FieldBase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortable Columns</em>' reference list.
	 * @see crudrest.crudrestPackage#getList_SortableColumns()
	 * @model
	 * @generated
	 */
	EList<FieldBase> getSortableColumns();

	/**
	 * Returns the value of the '<em><b>Searchable Columns</b></em>' reference list.
	 * The list contents are of type {@link crudrest.FieldBase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Searchable Columns</em>' reference list.
	 * @see crudrest.crudrestPackage#getList_SearchableColumns()
	 * @model
	 * @generated
	 */
	EList<FieldBase> getSearchableColumns();

	/**
	 * Returns the value of the '<em><b>Extend Where Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend Where Clause</em>' attribute.
	 * @see #setExtendWhereClause(String)
	 * @see crudrest.crudrestPackage#getList_ExtendWhereClause()
	 * @model
	 * @generated
	 */
	String getExtendWhereClause();

	/**
	 * Sets the value of the '{@link crudrest.List#getExtendWhereClause <em>Extend Where Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extend Where Clause</em>' attribute.
	 * @see #getExtendWhereClause()
	 * @generated
	 */
	void setExtendWhereClause(String value);

	/**
	 * Returns the value of the '<em><b>Bulk Action</b></em>' containment reference list.
	 * The list contents are of type {@link crudrest.BulkAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bulk Action</em>' containment reference list.
	 * @see crudrest.crudrestPackage#getList_BulkAction()
	 * @model containment="true"
	 * @generated
	 */
	EList<BulkAction> getBulkAction();

} // List
