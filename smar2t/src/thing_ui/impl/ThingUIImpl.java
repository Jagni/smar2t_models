/**
 */
package thing_ui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import thing_ui.Location;
import thing_ui.Resource;
import thing_ui.ThingUI;
import thing_ui.Thing_uiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thing_ui.impl.ThingUIImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link thing_ui.impl.ThingUIImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link thing_ui.impl.ThingUIImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link thing_ui.impl.ThingUIImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link thing_ui.impl.ThingUIImpl#getName <em>Name</em>}</li>
 *   <li>{@link thing_ui.impl.ThingUIImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link thing_ui.impl.ThingUIImpl#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThingUIImpl extends MinimalEObjectImpl.Container implements ThingUI {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Resource> properties;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Resource> actions;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Resource> events;

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
	protected ThingUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Thing_uiPackage.Literals.THING_UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Thing_uiPackage.THING_UI__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Thing_uiPackage.THING_UI__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Thing_uiPackage.THING_UI__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Thing_uiPackage.THING_UI__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Resource> getProperties() {
		if (properties == null) {
			properties = new EcoreEMap<String,Resource>(Thing_uiPackage.Literals.STRING_TO_RESOURCE_MAP, StringToResourceMapImpl.class, this, Thing_uiPackage.THING_UI__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Resource> getActions() {
		if (actions == null) {
			actions = new EcoreEMap<String,Resource>(Thing_uiPackage.Literals.STRING_TO_RESOURCE_MAP, StringToResourceMapImpl.class, this, Thing_uiPackage.THING_UI__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Resource> getEvents() {
		if (events == null) {
			events = new EcoreEMap<String,Resource>(Thing_uiPackage.Literals.STRING_TO_RESOURCE_MAP, StringToResourceMapImpl.class, this, Thing_uiPackage.THING_UI__EVENTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Thing_uiPackage.THING_UI__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Thing_uiPackage.THING_UI__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Thing_uiPackage.THING_UI__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Thing_uiPackage.THING_UI__LOCATION:
				return basicSetLocation(null, msgs);
			case Thing_uiPackage.THING_UI__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case Thing_uiPackage.THING_UI__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case Thing_uiPackage.THING_UI__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
			case Thing_uiPackage.THING_UI__LOCATION:
				return getLocation();
			case Thing_uiPackage.THING_UI__PROPERTIES:
				if (coreType) return getProperties();
				else return getProperties().map();
			case Thing_uiPackage.THING_UI__ACTIONS:
				if (coreType) return getActions();
				else return getActions().map();
			case Thing_uiPackage.THING_UI__EVENTS:
				if (coreType) return getEvents();
				else return getEvents().map();
			case Thing_uiPackage.THING_UI__NAME:
				return getName();
			case Thing_uiPackage.THING_UI__DESCRIPTION:
				return getDescription();
			case Thing_uiPackage.THING_UI__ICON:
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
			case Thing_uiPackage.THING_UI__LOCATION:
				setLocation((Location)newValue);
				return;
			case Thing_uiPackage.THING_UI__PROPERTIES:
				((EStructuralFeature.Setting)getProperties()).set(newValue);
				return;
			case Thing_uiPackage.THING_UI__ACTIONS:
				((EStructuralFeature.Setting)getActions()).set(newValue);
				return;
			case Thing_uiPackage.THING_UI__EVENTS:
				((EStructuralFeature.Setting)getEvents()).set(newValue);
				return;
			case Thing_uiPackage.THING_UI__NAME:
				setName((String)newValue);
				return;
			case Thing_uiPackage.THING_UI__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Thing_uiPackage.THING_UI__ICON:
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
			case Thing_uiPackage.THING_UI__LOCATION:
				setLocation((Location)null);
				return;
			case Thing_uiPackage.THING_UI__PROPERTIES:
				getProperties().clear();
				return;
			case Thing_uiPackage.THING_UI__ACTIONS:
				getActions().clear();
				return;
			case Thing_uiPackage.THING_UI__EVENTS:
				getEvents().clear();
				return;
			case Thing_uiPackage.THING_UI__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Thing_uiPackage.THING_UI__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Thing_uiPackage.THING_UI__ICON:
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
			case Thing_uiPackage.THING_UI__LOCATION:
				return location != null;
			case Thing_uiPackage.THING_UI__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case Thing_uiPackage.THING_UI__ACTIONS:
				return actions != null && !actions.isEmpty();
			case Thing_uiPackage.THING_UI__EVENTS:
				return events != null && !events.isEmpty();
			case Thing_uiPackage.THING_UI__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Thing_uiPackage.THING_UI__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Thing_uiPackage.THING_UI__ICON:
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

} //ThingUIImpl
