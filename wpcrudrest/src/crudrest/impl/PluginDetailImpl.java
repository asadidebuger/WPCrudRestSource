/**
 */
package crudrest.impl;

import crudrest.PluginDetail;
import crudrest.crudrestPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link crudrest.impl.PluginDetailImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link crudrest.impl.PluginDetailImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link crudrest.impl.PluginDetailImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link crudrest.impl.PluginDetailImpl#getDbVersion <em>Db Version</em>}</li>
 *   <li>{@link crudrest.impl.PluginDetailImpl#getPluginURI <em>Plugin URI</em>}</li>
 *   <li>{@link crudrest.impl.PluginDetailImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link crudrest.impl.PluginDetailImpl#getAuthorURI <em>Author URI</em>}</li>
 *   <li>{@link crudrest.impl.PluginDetailImpl#getLicense <em>License</em>}</li>
 *   <li>{@link crudrest.impl.PluginDetailImpl#getLicenseURI <em>License URI</em>}</li>
 *   <li>{@link crudrest.impl.PluginDetailImpl#getTextDomain <em>Text Domain</em>}</li>
 *   <li>{@link crudrest.impl.PluginDetailImpl#getDomainPath <em>Domain Path</em>}</li>
 *   <li>{@link crudrest.impl.PluginDetailImpl#getDirectory <em>Directory</em>}</li>
 *   <li>{@link crudrest.impl.PluginDetailImpl#getMinVersionWP <em>Min Version WP</em>}</li>
 *   <li>{@link crudrest.impl.PluginDetailImpl#getMinVersionPHP <em>Min Version PHP</em>}</li>
 *   <li>{@link crudrest.impl.PluginDetailImpl#getUpdateURI <em>Update URI</em>}</li>
 *   <li>{@link crudrest.impl.PluginDetailImpl#isNetwork <em>Network</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginDetailImpl extends MinimalEObjectImpl.Container implements PluginDetail {
	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = "crwp";

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "1.0.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbVersion() <em>Db Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int DB_VERSION_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getDbVersion() <em>Db Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbVersion()
	 * @generated
	 * @ordered
	 */
	protected int dbVersion = DB_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPluginURI() <em>Plugin URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginURI()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGIN_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluginURI() <em>Plugin URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginURI()
	 * @generated
	 * @ordered
	 */
	protected String pluginURI = PLUGIN_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorURI() <em>Author URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorURI()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorURI() <em>Author URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorURI()
	 * @generated
	 * @ordered
	 */
	protected String authorURI = AUTHOR_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicenseURI() <em>License URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseURI()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicenseURI() <em>License URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseURI()
	 * @generated
	 * @ordered
	 */
	protected String licenseURI = LICENSE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextDomain() <em>Text Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_DOMAIN_EDEFAULT = "crwp";

	/**
	 * The cached value of the '{@link #getTextDomain() <em>Text Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextDomain()
	 * @generated
	 * @ordered
	 */
	protected String textDomain = TEXT_DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainPath() <em>Domain Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_PATH_EDEFAULT = "languages";

	/**
	 * The cached value of the '{@link #getDomainPath() <em>Domain Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainPath()
	 * @generated
	 * @ordered
	 */
	protected String domainPath = DOMAIN_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectory() <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTORY_EDEFAULT = "crwp";

	/**
	 * The cached value of the '{@link #getDirectory() <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectory()
	 * @generated
	 * @ordered
	 */
	protected String directory = DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinVersionWP() <em>Min Version WP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVersionWP()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_VERSION_WP_EDEFAULT = "4.7";

	/**
	 * The cached value of the '{@link #getMinVersionWP() <em>Min Version WP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVersionWP()
	 * @generated
	 * @ordered
	 */
	protected String minVersionWP = MIN_VERSION_WP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinVersionPHP() <em>Min Version PHP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVersionPHP()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_VERSION_PHP_EDEFAULT = "5.6.20";

	/**
	 * The cached value of the '{@link #getMinVersionPHP() <em>Min Version PHP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVersionPHP()
	 * @generated
	 * @ordered
	 */
	protected String minVersionPHP = MIN_VERSION_PHP_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateURI() <em>Update URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateURI()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateURI() <em>Update URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateURI()
	 * @generated
	 * @ordered
	 */
	protected String updateURI = UPDATE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #isNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NETWORK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNetwork()
	 * @generated
	 * @ordered
	 */
	protected boolean network = NETWORK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return crudrestPackage.Literals.PLUGIN_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_DETAIL__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_DETAIL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_DETAIL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDbVersion() {
		return dbVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbVersion(int newDbVersion) {
		int oldDbVersion = dbVersion;
		dbVersion = newDbVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_DETAIL__DB_VERSION, oldDbVersion, dbVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluginURI() {
		return pluginURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginURI(String newPluginURI) {
		String oldPluginURI = pluginURI;
		pluginURI = newPluginURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_DETAIL__PLUGIN_URI, oldPluginURI, pluginURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_DETAIL__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorURI() {
		return authorURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorURI(String newAuthorURI) {
		String oldAuthorURI = authorURI;
		authorURI = newAuthorURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_DETAIL__AUTHOR_URI, oldAuthorURI, authorURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_DETAIL__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicenseURI() {
		return licenseURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicenseURI(String newLicenseURI) {
		String oldLicenseURI = licenseURI;
		licenseURI = newLicenseURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_DETAIL__LICENSE_URI, oldLicenseURI, licenseURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextDomain() {
		return textDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextDomain(String newTextDomain) {
		String oldTextDomain = textDomain;
		textDomain = newTextDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_DETAIL__TEXT_DOMAIN, oldTextDomain, textDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainPath() {
		return domainPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainPath(String newDomainPath) {
		String oldDomainPath = domainPath;
		domainPath = newDomainPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_DETAIL__DOMAIN_PATH, oldDomainPath, domainPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirectory() {
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectory(String newDirectory) {
		String oldDirectory = directory;
		directory = newDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_DETAIL__DIRECTORY, oldDirectory, directory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinVersionWP() {
		return minVersionWP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVersionWP(String newMinVersionWP) {
		String oldMinVersionWP = minVersionWP;
		minVersionWP = newMinVersionWP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_DETAIL__MIN_VERSION_WP, oldMinVersionWP, minVersionWP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinVersionPHP() {
		return minVersionPHP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVersionPHP(String newMinVersionPHP) {
		String oldMinVersionPHP = minVersionPHP;
		minVersionPHP = newMinVersionPHP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_DETAIL__MIN_VERSION_PHP, oldMinVersionPHP, minVersionPHP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdateURI() {
		return updateURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateURI(String newUpdateURI) {
		String oldUpdateURI = updateURI;
		updateURI = newUpdateURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_DETAIL__UPDATE_URI, oldUpdateURI, updateURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(boolean newNetwork) {
		boolean oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, crudrestPackage.PLUGIN_DETAIL__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case crudrestPackage.PLUGIN_DETAIL__PREFIX:
				return getPrefix();
			case crudrestPackage.PLUGIN_DETAIL__DESCRIPTION:
				return getDescription();
			case crudrestPackage.PLUGIN_DETAIL__VERSION:
				return getVersion();
			case crudrestPackage.PLUGIN_DETAIL__DB_VERSION:
				return getDbVersion();
			case crudrestPackage.PLUGIN_DETAIL__PLUGIN_URI:
				return getPluginURI();
			case crudrestPackage.PLUGIN_DETAIL__AUTHOR:
				return getAuthor();
			case crudrestPackage.PLUGIN_DETAIL__AUTHOR_URI:
				return getAuthorURI();
			case crudrestPackage.PLUGIN_DETAIL__LICENSE:
				return getLicense();
			case crudrestPackage.PLUGIN_DETAIL__LICENSE_URI:
				return getLicenseURI();
			case crudrestPackage.PLUGIN_DETAIL__TEXT_DOMAIN:
				return getTextDomain();
			case crudrestPackage.PLUGIN_DETAIL__DOMAIN_PATH:
				return getDomainPath();
			case crudrestPackage.PLUGIN_DETAIL__DIRECTORY:
				return getDirectory();
			case crudrestPackage.PLUGIN_DETAIL__MIN_VERSION_WP:
				return getMinVersionWP();
			case crudrestPackage.PLUGIN_DETAIL__MIN_VERSION_PHP:
				return getMinVersionPHP();
			case crudrestPackage.PLUGIN_DETAIL__UPDATE_URI:
				return getUpdateURI();
			case crudrestPackage.PLUGIN_DETAIL__NETWORK:
				return isNetwork();
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
			case crudrestPackage.PLUGIN_DETAIL__PREFIX:
				setPrefix((String)newValue);
				return;
			case crudrestPackage.PLUGIN_DETAIL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case crudrestPackage.PLUGIN_DETAIL__VERSION:
				setVersion((String)newValue);
				return;
			case crudrestPackage.PLUGIN_DETAIL__DB_VERSION:
				setDbVersion((Integer)newValue);
				return;
			case crudrestPackage.PLUGIN_DETAIL__PLUGIN_URI:
				setPluginURI((String)newValue);
				return;
			case crudrestPackage.PLUGIN_DETAIL__AUTHOR:
				setAuthor((String)newValue);
				return;
			case crudrestPackage.PLUGIN_DETAIL__AUTHOR_URI:
				setAuthorURI((String)newValue);
				return;
			case crudrestPackage.PLUGIN_DETAIL__LICENSE:
				setLicense((String)newValue);
				return;
			case crudrestPackage.PLUGIN_DETAIL__LICENSE_URI:
				setLicenseURI((String)newValue);
				return;
			case crudrestPackage.PLUGIN_DETAIL__TEXT_DOMAIN:
				setTextDomain((String)newValue);
				return;
			case crudrestPackage.PLUGIN_DETAIL__DOMAIN_PATH:
				setDomainPath((String)newValue);
				return;
			case crudrestPackage.PLUGIN_DETAIL__DIRECTORY:
				setDirectory((String)newValue);
				return;
			case crudrestPackage.PLUGIN_DETAIL__MIN_VERSION_WP:
				setMinVersionWP((String)newValue);
				return;
			case crudrestPackage.PLUGIN_DETAIL__MIN_VERSION_PHP:
				setMinVersionPHP((String)newValue);
				return;
			case crudrestPackage.PLUGIN_DETAIL__UPDATE_URI:
				setUpdateURI((String)newValue);
				return;
			case crudrestPackage.PLUGIN_DETAIL__NETWORK:
				setNetwork((Boolean)newValue);
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
			case crudrestPackage.PLUGIN_DETAIL__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case crudrestPackage.PLUGIN_DETAIL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case crudrestPackage.PLUGIN_DETAIL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case crudrestPackage.PLUGIN_DETAIL__DB_VERSION:
				setDbVersion(DB_VERSION_EDEFAULT);
				return;
			case crudrestPackage.PLUGIN_DETAIL__PLUGIN_URI:
				setPluginURI(PLUGIN_URI_EDEFAULT);
				return;
			case crudrestPackage.PLUGIN_DETAIL__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case crudrestPackage.PLUGIN_DETAIL__AUTHOR_URI:
				setAuthorURI(AUTHOR_URI_EDEFAULT);
				return;
			case crudrestPackage.PLUGIN_DETAIL__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case crudrestPackage.PLUGIN_DETAIL__LICENSE_URI:
				setLicenseURI(LICENSE_URI_EDEFAULT);
				return;
			case crudrestPackage.PLUGIN_DETAIL__TEXT_DOMAIN:
				setTextDomain(TEXT_DOMAIN_EDEFAULT);
				return;
			case crudrestPackage.PLUGIN_DETAIL__DOMAIN_PATH:
				setDomainPath(DOMAIN_PATH_EDEFAULT);
				return;
			case crudrestPackage.PLUGIN_DETAIL__DIRECTORY:
				setDirectory(DIRECTORY_EDEFAULT);
				return;
			case crudrestPackage.PLUGIN_DETAIL__MIN_VERSION_WP:
				setMinVersionWP(MIN_VERSION_WP_EDEFAULT);
				return;
			case crudrestPackage.PLUGIN_DETAIL__MIN_VERSION_PHP:
				setMinVersionPHP(MIN_VERSION_PHP_EDEFAULT);
				return;
			case crudrestPackage.PLUGIN_DETAIL__UPDATE_URI:
				setUpdateURI(UPDATE_URI_EDEFAULT);
				return;
			case crudrestPackage.PLUGIN_DETAIL__NETWORK:
				setNetwork(NETWORK_EDEFAULT);
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
			case crudrestPackage.PLUGIN_DETAIL__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case crudrestPackage.PLUGIN_DETAIL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case crudrestPackage.PLUGIN_DETAIL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case crudrestPackage.PLUGIN_DETAIL__DB_VERSION:
				return dbVersion != DB_VERSION_EDEFAULT;
			case crudrestPackage.PLUGIN_DETAIL__PLUGIN_URI:
				return PLUGIN_URI_EDEFAULT == null ? pluginURI != null : !PLUGIN_URI_EDEFAULT.equals(pluginURI);
			case crudrestPackage.PLUGIN_DETAIL__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case crudrestPackage.PLUGIN_DETAIL__AUTHOR_URI:
				return AUTHOR_URI_EDEFAULT == null ? authorURI != null : !AUTHOR_URI_EDEFAULT.equals(authorURI);
			case crudrestPackage.PLUGIN_DETAIL__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
			case crudrestPackage.PLUGIN_DETAIL__LICENSE_URI:
				return LICENSE_URI_EDEFAULT == null ? licenseURI != null : !LICENSE_URI_EDEFAULT.equals(licenseURI);
			case crudrestPackage.PLUGIN_DETAIL__TEXT_DOMAIN:
				return TEXT_DOMAIN_EDEFAULT == null ? textDomain != null : !TEXT_DOMAIN_EDEFAULT.equals(textDomain);
			case crudrestPackage.PLUGIN_DETAIL__DOMAIN_PATH:
				return DOMAIN_PATH_EDEFAULT == null ? domainPath != null : !DOMAIN_PATH_EDEFAULT.equals(domainPath);
			case crudrestPackage.PLUGIN_DETAIL__DIRECTORY:
				return DIRECTORY_EDEFAULT == null ? directory != null : !DIRECTORY_EDEFAULT.equals(directory);
			case crudrestPackage.PLUGIN_DETAIL__MIN_VERSION_WP:
				return MIN_VERSION_WP_EDEFAULT == null ? minVersionWP != null : !MIN_VERSION_WP_EDEFAULT.equals(minVersionWP);
			case crudrestPackage.PLUGIN_DETAIL__MIN_VERSION_PHP:
				return MIN_VERSION_PHP_EDEFAULT == null ? minVersionPHP != null : !MIN_VERSION_PHP_EDEFAULT.equals(minVersionPHP);
			case crudrestPackage.PLUGIN_DETAIL__UPDATE_URI:
				return UPDATE_URI_EDEFAULT == null ? updateURI != null : !UPDATE_URI_EDEFAULT.equals(updateURI);
			case crudrestPackage.PLUGIN_DETAIL__NETWORK:
				return network != NETWORK_EDEFAULT;
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
		result.append(" (prefix: ");
		result.append(prefix);
		result.append(", description: ");
		result.append(description);
		result.append(", version: ");
		result.append(version);
		result.append(", dbVersion: ");
		result.append(dbVersion);
		result.append(", pluginURI: ");
		result.append(pluginURI);
		result.append(", author: ");
		result.append(author);
		result.append(", authorURI: ");
		result.append(authorURI);
		result.append(", license: ");
		result.append(license);
		result.append(", licenseURI: ");
		result.append(licenseURI);
		result.append(", textDomain: ");
		result.append(textDomain);
		result.append(", domainPath: ");
		result.append(domainPath);
		result.append(", directory: ");
		result.append(directory);
		result.append(", minVersionWP: ");
		result.append(minVersionWP);
		result.append(", minVersionPHP: ");
		result.append(minVersionPHP);
		result.append(", updateURI: ");
		result.append(updateURI);
		result.append(", network: ");
		result.append(network);
		result.append(')');
		return result.toString();
	}

} //PluginDetailImpl
