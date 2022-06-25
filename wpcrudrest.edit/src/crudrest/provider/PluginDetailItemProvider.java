/**
 */
package crudrest.provider;


import crudrest.PluginDetail;
import crudrest.crudrestPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link crudrest.PluginDetail} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PluginDetailItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginDetailItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPrefixPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addDbVersionPropertyDescriptor(object);
			addPluginURIPropertyDescriptor(object);
			addAuthorPropertyDescriptor(object);
			addAuthorURIPropertyDescriptor(object);
			addLicensePropertyDescriptor(object);
			addLicenseURIPropertyDescriptor(object);
			addTextDomainPropertyDescriptor(object);
			addDomainPathPropertyDescriptor(object);
			addDirectoryPropertyDescriptor(object);
			addMinVersionWPPropertyDescriptor(object);
			addMinVersionPHPPropertyDescriptor(object);
			addUpdateURIPropertyDescriptor(object);
			addNetworkPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDetail_prefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginDetail_prefix_feature", "_UI_PluginDetail_type"),
				 crudrestPackage.Literals.PLUGIN_DETAIL__PREFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDetail_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginDetail_description_feature", "_UI_PluginDetail_type"),
				 crudrestPackage.Literals.PLUGIN_DETAIL__DESCRIPTION,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDetail_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginDetail_version_feature", "_UI_PluginDetail_type"),
				 crudrestPackage.Literals.PLUGIN_DETAIL__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Db Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDbVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDetail_dbVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginDetail_dbVersion_feature", "_UI_PluginDetail_type"),
				 crudrestPackage.Literals.PLUGIN_DETAIL__DB_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plugin URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPluginURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDetail_pluginURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginDetail_pluginURI_feature", "_UI_PluginDetail_type"),
				 crudrestPackage.Literals.PLUGIN_DETAIL__PLUGIN_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDetail_author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginDetail_author_feature", "_UI_PluginDetail_type"),
				 crudrestPackage.Literals.PLUGIN_DETAIL__AUTHOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Author URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDetail_authorURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginDetail_authorURI_feature", "_UI_PluginDetail_type"),
				 crudrestPackage.Literals.PLUGIN_DETAIL__AUTHOR_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the License feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLicensePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDetail_license_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginDetail_license_feature", "_UI_PluginDetail_type"),
				 crudrestPackage.Literals.PLUGIN_DETAIL__LICENSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the License URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLicenseURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDetail_licenseURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginDetail_licenseURI_feature", "_UI_PluginDetail_type"),
				 crudrestPackage.Literals.PLUGIN_DETAIL__LICENSE_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Domain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextDomainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDetail_textDomain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginDetail_textDomain_feature", "_UI_PluginDetail_type"),
				 crudrestPackage.Literals.PLUGIN_DETAIL__TEXT_DOMAIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDetail_domainPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginDetail_domainPath_feature", "_UI_PluginDetail_type"),
				 crudrestPackage.Literals.PLUGIN_DETAIL__DOMAIN_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDetail_directory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginDetail_directory_feature", "_UI_PluginDetail_type"),
				 crudrestPackage.Literals.PLUGIN_DETAIL__DIRECTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Version WP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinVersionWPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDetail_minVersionWP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginDetail_minVersionWP_feature", "_UI_PluginDetail_type"),
				 crudrestPackage.Literals.PLUGIN_DETAIL__MIN_VERSION_WP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Version PHP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinVersionPHPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDetail_minVersionPHP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginDetail_minVersionPHP_feature", "_UI_PluginDetail_type"),
				 crudrestPackage.Literals.PLUGIN_DETAIL__MIN_VERSION_PHP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Update URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdateURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDetail_updateURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginDetail_updateURI_feature", "_UI_PluginDetail_type"),
				 crudrestPackage.Literals.PLUGIN_DETAIL__UPDATE_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Network feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PluginDetail_network_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PluginDetail_network_feature", "_UI_PluginDetail_type"),
				 crudrestPackage.Literals.PLUGIN_DETAIL__NETWORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PluginDetail.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PluginDetail.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PluginDetail)object).getPrefix();
		return label == null || label.length() == 0 ?
			getString("_UI_PluginDetail_type") :
			getString("_UI_PluginDetail_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PluginDetail.class)) {
			case crudrestPackage.PLUGIN_DETAIL__PREFIX:
			case crudrestPackage.PLUGIN_DETAIL__DESCRIPTION:
			case crudrestPackage.PLUGIN_DETAIL__VERSION:
			case crudrestPackage.PLUGIN_DETAIL__DB_VERSION:
			case crudrestPackage.PLUGIN_DETAIL__PLUGIN_URI:
			case crudrestPackage.PLUGIN_DETAIL__AUTHOR:
			case crudrestPackage.PLUGIN_DETAIL__AUTHOR_URI:
			case crudrestPackage.PLUGIN_DETAIL__LICENSE:
			case crudrestPackage.PLUGIN_DETAIL__LICENSE_URI:
			case crudrestPackage.PLUGIN_DETAIL__TEXT_DOMAIN:
			case crudrestPackage.PLUGIN_DETAIL__DOMAIN_PATH:
			case crudrestPackage.PLUGIN_DETAIL__DIRECTORY:
			case crudrestPackage.PLUGIN_DETAIL__MIN_VERSION_WP:
			case crudrestPackage.PLUGIN_DETAIL__MIN_VERSION_PHP:
			case crudrestPackage.PLUGIN_DETAIL__UPDATE_URI:
			case crudrestPackage.PLUGIN_DETAIL__NETWORK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return crudrestEditPlugin.INSTANCE;
	}

}
