/**
 */
package mozilla_td.impl;

import java.util.Collection;

import mozilla_td.Action;
import mozilla_td.Event;
import mozilla_td.Link;
import mozilla_td.Mozilla_tdPackage;
import mozilla_td.Property;
import mozilla_td.Thing;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mozilla_td.impl.ThingImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link mozilla_td.impl.ThingImpl#getHref <em>Href</em>}</li>
 *   <li>{@link mozilla_td.impl.ThingImpl#getContext <em>Context</em>}</li>
 *   <li>{@link mozilla_td.impl.ThingImpl#getSemanticType <em>Semantic Type</em>}</li>
 *   <li>{@link mozilla_td.impl.ThingImpl#getId <em>Id</em>}</li>
 *   <li>{@link mozilla_td.impl.ThingImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link mozilla_td.impl.ThingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mozilla_td.impl.ThingImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link mozilla_td.impl.ThingImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link mozilla_td.impl.ThingImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThingImpl extends MinimalEObjectImpl.Container implements Thing {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemanticType() <em>Semantic Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticType()
	 * @generated
	 * @ordered
	 */
	protected EList<String> semanticType;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

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
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Action> actions;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Event> events;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Property> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mozilla_tdPackage.Literals.THING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, Mozilla_tdPackage.THING__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.THING__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.THING__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSemanticType() {
		if (semanticType == null) {
			semanticType = new EDataTypeUniqueEList<String>(String.class, this, Mozilla_tdPackage.THING__SEMANTIC_TYPE);
		}
		return semanticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.THING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.THING__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.THING__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Property> getProperties() {
		if (properties == null) {
			properties = new EcoreEMap<String,Property>(Mozilla_tdPackage.Literals.STRING_TO_PROPERTY_MAP, StringToPropertyMapImpl.class, this, Mozilla_tdPackage.THING__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mozilla_tdPackage.THING__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case Mozilla_tdPackage.THING__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case Mozilla_tdPackage.THING__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case Mozilla_tdPackage.THING__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Action> getActions() {
		if (actions == null) {
			actions = new EcoreEMap<String,Action>(Mozilla_tdPackage.Literals.STRING_TO_ACTION_MAP, StringToActionMapImpl.class, this, Mozilla_tdPackage.THING__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Event> getEvents() {
		if (events == null) {
			events = new EcoreEMap<String,Event>(Mozilla_tdPackage.Literals.STRING_TO_EVENT_MAP, StringToEventMapImpl.class, this, Mozilla_tdPackage.THING__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mozilla_tdPackage.THING__LINKS:
				return getLinks();
			case Mozilla_tdPackage.THING__HREF:
				return getHref();
			case Mozilla_tdPackage.THING__CONTEXT:
				return getContext();
			case Mozilla_tdPackage.THING__SEMANTIC_TYPE:
				return getSemanticType();
			case Mozilla_tdPackage.THING__ID:
				return getId();
			case Mozilla_tdPackage.THING__TITLE:
				return getTitle();
			case Mozilla_tdPackage.THING__DESCRIPTION:
				return getDescription();
			case Mozilla_tdPackage.THING__ACTIONS:
				if (coreType) return getActions();
				else return getActions().map();
			case Mozilla_tdPackage.THING__EVENTS:
				if (coreType) return getEvents();
				else return getEvents().map();
			case Mozilla_tdPackage.THING__PROPERTIES:
				if (coreType) return getProperties();
				else return getProperties().map();
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
			case Mozilla_tdPackage.THING__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case Mozilla_tdPackage.THING__HREF:
				setHref((String)newValue);
				return;
			case Mozilla_tdPackage.THING__CONTEXT:
				setContext((String)newValue);
				return;
			case Mozilla_tdPackage.THING__SEMANTIC_TYPE:
				getSemanticType().clear();
				getSemanticType().addAll((Collection<? extends String>)newValue);
				return;
			case Mozilla_tdPackage.THING__ID:
				setId((String)newValue);
				return;
			case Mozilla_tdPackage.THING__TITLE:
				setTitle((String)newValue);
				return;
			case Mozilla_tdPackage.THING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Mozilla_tdPackage.THING__ACTIONS:
				((EStructuralFeature.Setting)getActions()).set(newValue);
				return;
			case Mozilla_tdPackage.THING__EVENTS:
				((EStructuralFeature.Setting)getEvents()).set(newValue);
				return;
			case Mozilla_tdPackage.THING__PROPERTIES:
				((EStructuralFeature.Setting)getProperties()).set(newValue);
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
			case Mozilla_tdPackage.THING__LINKS:
				getLinks().clear();
				return;
			case Mozilla_tdPackage.THING__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case Mozilla_tdPackage.THING__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case Mozilla_tdPackage.THING__SEMANTIC_TYPE:
				getSemanticType().clear();
				return;
			case Mozilla_tdPackage.THING__ID:
				setId(ID_EDEFAULT);
				return;
			case Mozilla_tdPackage.THING__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Mozilla_tdPackage.THING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Mozilla_tdPackage.THING__ACTIONS:
				getActions().clear();
				return;
			case Mozilla_tdPackage.THING__EVENTS:
				getEvents().clear();
				return;
			case Mozilla_tdPackage.THING__PROPERTIES:
				getProperties().clear();
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
			case Mozilla_tdPackage.THING__LINKS:
				return links != null && !links.isEmpty();
			case Mozilla_tdPackage.THING__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case Mozilla_tdPackage.THING__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case Mozilla_tdPackage.THING__SEMANTIC_TYPE:
				return semanticType != null && !semanticType.isEmpty();
			case Mozilla_tdPackage.THING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Mozilla_tdPackage.THING__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Mozilla_tdPackage.THING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Mozilla_tdPackage.THING__ACTIONS:
				return actions != null && !actions.isEmpty();
			case Mozilla_tdPackage.THING__EVENTS:
				return events != null && !events.isEmpty();
			case Mozilla_tdPackage.THING__PROPERTIES:
				return properties != null && !properties.isEmpty();
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
		result.append(" (href: ");
		result.append(href);
		result.append(", context: ");
		result.append(context);
		result.append(", semanticType: ");
		result.append(semanticType);
		result.append(", id: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ThingImpl
