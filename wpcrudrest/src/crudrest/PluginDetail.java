/**
 */
package crudrest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link crudrest.PluginDetail#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link crudrest.PluginDetail#getDescription <em>Description</em>}</li>
 *   <li>{@link crudrest.PluginDetail#getVersion <em>Version</em>}</li>
 *   <li>{@link crudrest.PluginDetail#getDbVersion <em>Db Version</em>}</li>
 *   <li>{@link crudrest.PluginDetail#getPluginURI <em>Plugin URI</em>}</li>
 *   <li>{@link crudrest.PluginDetail#getAuthor <em>Author</em>}</li>
 *   <li>{@link crudrest.PluginDetail#getAuthorURI <em>Author URI</em>}</li>
 *   <li>{@link crudrest.PluginDetail#getLicense <em>License</em>}</li>
 *   <li>{@link crudrest.PluginDetail#getLicenseURI <em>License URI</em>}</li>
 *   <li>{@link crudrest.PluginDetail#getTextDomain <em>Text Domain</em>}</li>
 *   <li>{@link crudrest.PluginDetail#getDomainPath <em>Domain Path</em>}</li>
 *   <li>{@link crudrest.PluginDetail#getDirectory <em>Directory</em>}</li>
 *   <li>{@link crudrest.PluginDetail#getMinVersionWP <em>Min Version WP</em>}</li>
 *   <li>{@link crudrest.PluginDetail#getMinVersionPHP <em>Min Version PHP</em>}</li>
 *   <li>{@link crudrest.PluginDetail#getUpdateURI <em>Update URI</em>}</li>
 *   <li>{@link crudrest.PluginDetail#isNetwork <em>Network</em>}</li>
 * </ul>
 *
 * @see crudrest.crudrestPackage#getPluginDetail()
 * @model
 * @generated
 */
public interface PluginDetail extends EObject {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * The default value is <code>"crwp"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see crudrest.crudrestPackage#getPluginDetail_Prefix()
	 * @model default="crwp" required="true"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link crudrest.PluginDetail#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see crudrest.crudrestPackage#getPluginDetail_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link crudrest.PluginDetail#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see crudrest.crudrestPackage#getPluginDetail_Version()
	 * @model default="1.0.0" required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link crudrest.PluginDetail#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Db Version</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Version</em>' attribute.
	 * @see #setDbVersion(int)
	 * @see crudrest.crudrestPackage#getPluginDetail_DbVersion()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getDbVersion();

	/**
	 * Sets the value of the '{@link crudrest.PluginDetail#getDbVersion <em>Db Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Version</em>' attribute.
	 * @see #getDbVersion()
	 * @generated
	 */
	void setDbVersion(int value);

	/**
	 * Returns the value of the '<em><b>Plugin URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin URI</em>' attribute.
	 * @see #setPluginURI(String)
	 * @see crudrest.crudrestPackage#getPluginDetail_PluginURI()
	 * @model
	 * @generated
	 */
	String getPluginURI();

	/**
	 * Sets the value of the '{@link crudrest.PluginDetail#getPluginURI <em>Plugin URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin URI</em>' attribute.
	 * @see #getPluginURI()
	 * @generated
	 */
	void setPluginURI(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see crudrest.crudrestPackage#getPluginDetail_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link crudrest.PluginDetail#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Author URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author URI</em>' attribute.
	 * @see #setAuthorURI(String)
	 * @see crudrest.crudrestPackage#getPluginDetail_AuthorURI()
	 * @model
	 * @generated
	 */
	String getAuthorURI();

	/**
	 * Sets the value of the '{@link crudrest.PluginDetail#getAuthorURI <em>Author URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author URI</em>' attribute.
	 * @see #getAuthorURI()
	 * @generated
	 */
	void setAuthorURI(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see crudrest.crudrestPackage#getPluginDetail_License()
	 * @model
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link crudrest.PluginDetail#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>License URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License URI</em>' attribute.
	 * @see #setLicenseURI(String)
	 * @see crudrest.crudrestPackage#getPluginDetail_LicenseURI()
	 * @model
	 * @generated
	 */
	String getLicenseURI();

	/**
	 * Sets the value of the '{@link crudrest.PluginDetail#getLicenseURI <em>License URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License URI</em>' attribute.
	 * @see #getLicenseURI()
	 * @generated
	 */
	void setLicenseURI(String value);

	/**
	 * Returns the value of the '<em><b>Text Domain</b></em>' attribute.
	 * The default value is <code>"crwp"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Domain</em>' attribute.
	 * @see #setTextDomain(String)
	 * @see crudrest.crudrestPackage#getPluginDetail_TextDomain()
	 * @model default="crwp"
	 * @generated
	 */
	String getTextDomain();

	/**
	 * Sets the value of the '{@link crudrest.PluginDetail#getTextDomain <em>Text Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Domain</em>' attribute.
	 * @see #getTextDomain()
	 * @generated
	 */
	void setTextDomain(String value);

	/**
	 * Returns the value of the '<em><b>Domain Path</b></em>' attribute.
	 * The default value is <code>"languages"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Path</em>' attribute.
	 * @see #setDomainPath(String)
	 * @see crudrest.crudrestPackage#getPluginDetail_DomainPath()
	 * @model default="languages"
	 * @generated
	 */
	String getDomainPath();

	/**
	 * Sets the value of the '{@link crudrest.PluginDetail#getDomainPath <em>Domain Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Path</em>' attribute.
	 * @see #getDomainPath()
	 * @generated
	 */
	void setDomainPath(String value);

	/**
	 * Returns the value of the '<em><b>Directory</b></em>' attribute.
	 * The default value is <code>"crwp"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory</em>' attribute.
	 * @see #setDirectory(String)
	 * @see crudrest.crudrestPackage#getPluginDetail_Directory()
	 * @model default="crwp" required="true"
	 * @generated
	 */
	String getDirectory();

	/**
	 * Sets the value of the '{@link crudrest.PluginDetail#getDirectory <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory</em>' attribute.
	 * @see #getDirectory()
	 * @generated
	 */
	void setDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Min Version WP</b></em>' attribute.
	 * The default value is <code>"4.7"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Version WP</em>' attribute.
	 * @see #setMinVersionWP(String)
	 * @see crudrest.crudrestPackage#getPluginDetail_MinVersionWP()
	 * @model default="4.7"
	 * @generated
	 */
	String getMinVersionWP();

	/**
	 * Sets the value of the '{@link crudrest.PluginDetail#getMinVersionWP <em>Min Version WP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Version WP</em>' attribute.
	 * @see #getMinVersionWP()
	 * @generated
	 */
	void setMinVersionWP(String value);

	/**
	 * Returns the value of the '<em><b>Min Version PHP</b></em>' attribute.
	 * The default value is <code>"5.6.20"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Version PHP</em>' attribute.
	 * @see #setMinVersionPHP(String)
	 * @see crudrest.crudrestPackage#getPluginDetail_MinVersionPHP()
	 * @model default="5.6.20"
	 * @generated
	 */
	String getMinVersionPHP();

	/**
	 * Sets the value of the '{@link crudrest.PluginDetail#getMinVersionPHP <em>Min Version PHP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Version PHP</em>' attribute.
	 * @see #getMinVersionPHP()
	 * @generated
	 */
	void setMinVersionPHP(String value);

	/**
	 * Returns the value of the '<em><b>Update URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update URI</em>' attribute.
	 * @see #setUpdateURI(String)
	 * @see crudrest.crudrestPackage#getPluginDetail_UpdateURI()
	 * @model
	 * @generated
	 */
	String getUpdateURI();

	/**
	 * Sets the value of the '{@link crudrest.PluginDetail#getUpdateURI <em>Update URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update URI</em>' attribute.
	 * @see #getUpdateURI()
	 * @generated
	 */
	void setUpdateURI(String value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' attribute.
	 * @see #setNetwork(boolean)
	 * @see crudrest.crudrestPackage#getPluginDetail_Network()
	 * @model
	 * @generated
	 */
	boolean isNetwork();

	/**
	 * Sets the value of the '{@link crudrest.PluginDetail#isNetwork <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' attribute.
	 * @see #isNetwork()
	 * @generated
	 */
	void setNetwork(boolean value);

} // PluginDetail
