/**
 */
package thing_ui.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import thing_ui.core.CorePackage;
import thing_ui.core.Location;
import thing_ui.core.Resource;
import thing_ui.core.ThingUserInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing User Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thing_ui.core.impl.ThingUserInterfaceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link thing_ui.core.impl.ThingUserInterfaceImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link thing_ui.core.impl.ThingUserInterfaceImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link thing_ui.core.impl.ThingUserInterfaceImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link thing_ui.core.impl.ThingUserInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link thing_ui.core.impl.ThingUserInterfaceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link thing_ui.core.impl.ThingUserInterfaceImpl#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThingUserInterfaceImpl extends MinimalEObjectImpl.Container implements ThingUserInterface {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> properties;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> actions;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> events;

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
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingUserInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.THING_USER_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.THING_USER_INTERFACE__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THING_USER_INTERFACE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getProperties() {
		if (properties == null) {
			properties = new EObjectResolvingEList<Resource>(Resource.class, this, CorePackage.THING_USER_INTERFACE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList<Resource>(Resource.class, this, CorePackage.THING_USER_INTERFACE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getEvents() {
		if (events == null) {
			events = new EObjectResolvingEList<Resource>(Resource.class, this, CorePackage.THING_USER_INTERFACE__EVENTS);
		}
		return events;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THING_USER_INTERFACE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THING_USER_INTERFACE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THING_USER_INTERFACE__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.THING_USER_INTERFACE__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case CorePackage.THING_USER_INTERFACE__PROPERTIES:
				return getProperties();
			case CorePackage.THING_USER_INTERFACE__ACTIONS:
				return getActions();
			case CorePackage.THING_USER_INTERFACE__EVENTS:
				return getEvents();
			case CorePackage.THING_USER_INTERFACE__NAME:
				return getName();
			case CorePackage.THING_USER_INTERFACE__DESCRIPTION:
				return getDescription();
			case CorePackage.THING_USER_INTERFACE__ICON:
				return getIcon();
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
			case CorePackage.THING_USER_INTERFACE__LOCATION:
				setLocation((Location)newValue);
				return;
			case CorePackage.THING_USER_INTERFACE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Resource>)newValue);
				return;
			case CorePackage.THING_USER_INTERFACE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Resource>)newValue);
				return;
			case CorePackage.THING_USER_INTERFACE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Resource>)newValue);
				return;
			case CorePackage.THING_USER_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case CorePackage.THING_USER_INTERFACE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CorePackage.THING_USER_INTERFACE__ICON:
				setIcon((String)newValue);
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
			case CorePackage.THING_USER_INTERFACE__LOCATION:
				setLocation((Location)null);
				return;
			case CorePackage.THING_USER_INTERFACE__PROPERTIES:
				getProperties().clear();
				return;
			case CorePackage.THING_USER_INTERFACE__ACTIONS:
				getActions().clear();
				return;
			case CorePackage.THING_USER_INTERFACE__EVENTS:
				getEvents().clear();
				return;
			case CorePackage.THING_USER_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.THING_USER_INTERFACE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CorePackage.THING_USER_INTERFACE__ICON:
				setIcon(ICON_EDEFAULT);
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
			case CorePackage.THING_USER_INTERFACE__LOCATION:
				return location != null;
			case CorePackage.THING_USER_INTERFACE__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case CorePackage.THING_USER_INTERFACE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case CorePackage.THING_USER_INTERFACE__EVENTS:
				return events != null && !events.isEmpty();
			case CorePackage.THING_USER_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.THING_USER_INTERFACE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CorePackage.THING_USER_INTERFACE__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
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
		result.append(", description: ");
		result.append(description);
		result.append(", icon: ");
		result.append(icon);
		result.append(')');
		return result.toString();
	}

} //ThingUserInterfaceImpl
