/**
 */
package crudrest.impl;

import crudrest.DBFieldConfig;
import crudrest.FieldType;
import crudrest.VueElement;
import crudrest.crudrestPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crudrest.impl.FieldTypeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link crudrest.impl.FieldTypeImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link crudrest.impl.FieldTypeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link crudrest.impl.FieldTypeImpl#getAdapterFromDB <em>Adapter From DB</em>}</li>
 *   <li>{@link crudrest.impl.FieldTypeImpl#getAdapterToDB <em>Adapter To DB</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldTypeImpl extends MinimalEObjectImpl.Container implements FieldType {
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
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected DBFieldConfig config;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected VueElement input;

	/**
	 * The default value of the '{@link #getAdapterFromDB() <em>Adapter From DB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterFromDB()
	 * @generated
	 * @ordered
	 */
	protected static final String ADAPTER_FROM_DB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdapterFromDB() <em>Adapter From DB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterFromDB()
	 * @generated
	 * @ordered
	 */
	protected String adapterFromDB = ADAPTER_FROM_DB_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdapterToDB() <em>Adapter To DB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterToDB()
	 * @generated
	 * @ordered
	 */
	protected static final String ADAPTER_TO_DB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdapterToDB() <em>Adapter To DB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterToDB()
	 * @generated
	 * @ordered
	 */
	protected String adapterToDB = ADAPTER_TO_DB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crudrestPackage.Literals.FIELD_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.FIELD_TYPE__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBFieldConfig getConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfig(DBFieldConfig newConfig, NotificationChain msgs) {
		DBFieldConfig oldConfig = config;
		config = newConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, crudrestPackage.FIELD_TYPE__CONFIG, oldConfig, newConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfig(DBFieldConfig newConfig) {
		if (newConfig != config) {
			NotificationChain msgs = null;
			if (config != null)
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.FIELD_TYPE__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.FIELD_TYPE__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.FIELD_TYPE__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VueElement getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(VueElement newInput, NotificationChain msgs) {
		VueElement oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, crudrestPackage.FIELD_TYPE__INPUT, oldInput, newInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(VueElement newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.FIELD_TYPE__INPUT, null, msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - crudrestPackage.FIELD_TYPE__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.FIELD_TYPE__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdapterFromDB() {
		return adapterFromDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdapterFromDB(String newAdapterFromDB) {
		String oldAdapterFromDB = adapterFromDB;
		adapterFromDB = newAdapterFromDB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.FIELD_TYPE__ADAPTER_FROM_DB, oldAdapterFromDB, adapterFromDB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdapterToDB() {
		return adapterToDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdapterToDB(String newAdapterToDB) {
		String oldAdapterToDB = adapterToDB;
		adapterToDB = newAdapterToDB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.FIELD_TYPE__ADAPTER_TO_DB, oldAdapterToDB, adapterToDB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case crudrestPackage.FIELD_TYPE__CONFIG:
				return basicSetConfig(null, msgs);
			case crudrestPackage.FIELD_TYPE__INPUT:
				return basicSetInput(null, msgs);
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
			case crudrestPackage.FIELD_TYPE__KEY:
				return getKey();
			case crudrestPackage.FIELD_TYPE__CONFIG:
				return getConfig();
			case crudrestPackage.FIELD_TYPE__INPUT:
				return getInput();
			case crudrestPackage.FIELD_TYPE__ADAPTER_FROM_DB:
				return getAdapterFromDB();
			case crudrestPackage.FIELD_TYPE__ADAPTER_TO_DB:
				return getAdapterToDB();
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
			case crudrestPackage.FIELD_TYPE__KEY:
				setKey((String)newValue);
				return;
			case crudrestPackage.FIELD_TYPE__CONFIG:
				setConfig((DBFieldConfig)newValue);
				return;
			case crudrestPackage.FIELD_TYPE__INPUT:
				setInput((VueElement)newValue);
				return;
			case crudrestPackage.FIELD_TYPE__ADAPTER_FROM_DB:
				setAdapterFromDB((String)newValue);
				return;
			case crudrestPackage.FIELD_TYPE__ADAPTER_TO_DB:
				setAdapterToDB((String)newValue);
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
			case crudrestPackage.FIELD_TYPE__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case crudrestPackage.FIELD_TYPE__CONFIG:
				setConfig((DBFieldConfig)null);
				return;
			case crudrestPackage.FIELD_TYPE__INPUT:
				setInput((VueElement)null);
				return;
			case crudrestPackage.FIELD_TYPE__ADAPTER_FROM_DB:
				setAdapterFromDB(ADAPTER_FROM_DB_EDEFAULT);
				return;
			case crudrestPackage.FIELD_TYPE__ADAPTER_TO_DB:
				setAdapterToDB(ADAPTER_TO_DB_EDEFAULT);
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
			case crudrestPackage.FIELD_TYPE__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case crudrestPackage.FIELD_TYPE__CONFIG:
				return config != null;
			case crudrestPackage.FIELD_TYPE__INPUT:
				return input != null;
			case crudrestPackage.FIELD_TYPE__ADAPTER_FROM_DB:
				return ADAPTER_FROM_DB_EDEFAULT == null ? adapterFromDB != null : !ADAPTER_FROM_DB_EDEFAULT.equals(adapterFromDB);
			case crudrestPackage.FIELD_TYPE__ADAPTER_TO_DB:
				return ADAPTER_TO_DB_EDEFAULT == null ? adapterToDB != null : !ADAPTER_TO_DB_EDEFAULT.equals(adapterToDB);
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
		result.append(", adapterFromDB: ");
		result.append(adapterFromDB);
		result.append(", adapterToDB: ");
		result.append(adapterToDB);
		result.append(')');
		return result.toString();
	}

} //FieldTypeImpl
