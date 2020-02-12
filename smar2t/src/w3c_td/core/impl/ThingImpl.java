/**
 */
package w3c_td.core.impl;

import java.util.Collection;
import java.util.Date;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import w3c_td.core.ActionAffordance;
import w3c_td.core.CorePackage;
import w3c_td.core.EventAffordance;
import w3c_td.core.MultiLanguage;
import w3c_td.core.PropertyAffordance;
import w3c_td.core.Thing;
import w3c_td.core.VersionInfo;

import w3c_td.hypermediacontrols.Form;
import w3c_td.hypermediacontrols.Link;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getId <em>Id</em>}</li>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getSemanticContext <em>Semantic Context</em>}</li>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getSemanticType <em>Semantic Type</em>}</li>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getSupport <em>Support</em>}</li>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getBase <em>Base</em>}</li>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getTitles <em>Titles</em>}</li>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link w3c_td.core.impl.ThingImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThingImpl extends MinimalEObjectImpl.Container implements Thing {
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
	 * The cached value of the '{@link #getSemanticContext() <em>Semantic Context</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticContext()
	 * @generated
	 * @ordered
	 */
	protected EList<String> semanticContext;

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
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected Date modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupport() <em>Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupport()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupport() <em>Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupport()
	 * @generated
	 * @ordered
	 */
	protected String support = SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected String base = BASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected EList<String> security;

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
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected EList<Form> forms;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected VersionInfo version;

	/**
	 * The cached value of the '{@link #getTitles() <em>Titles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitles()
	 * @generated
	 * @ordered
	 */
	protected EList<MultiLanguage> titles;

	/**
	 * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<MultiLanguage> descriptions;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EventAffordance> events;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, ActionAffordance> actions;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, PropertyAffordance> properties;

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
		return CorePackage.Literals.THING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THING__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THING__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THING__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSemanticContext() {
		if (semanticContext == null) {
			semanticContext = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.THING__SEMANTIC_CONTEXT);
		}
		return semanticContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSemanticType() {
		if (semanticType == null) {
			semanticType = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.THING__SEMANTIC_TYPE);
		}
		return semanticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THING__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(Date newModified) {
		Date oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THING__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupport() {
		return support;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupport(String newSupport) {
		String oldSupport = support;
		support = newSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THING__SUPPORT, oldSupport, support));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(String newBase) {
		String oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THING__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSecurity() {
		if (security == null) {
			security = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.THING__SECURITY);
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, CorePackage.THING__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Form> getForms() {
		if (forms == null) {
			forms = new EObjectResolvingEList<Form>(Form.class, this, CorePackage.THING__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionInfo getVersion() {
		if (version != null && version.eIsProxy()) {
			InternalEObject oldVersion = (InternalEObject)version;
			version = (VersionInfo)eResolveProxy(oldVersion);
			if (version != oldVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.THING__VERSION, oldVersion, version));
			}
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionInfo basicGetVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(VersionInfo newVersion) {
		VersionInfo oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.THING__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiLanguage> getTitles() {
		if (titles == null) {
			titles = new EObjectResolvingEList<MultiLanguage>(MultiLanguage.class, this, CorePackage.THING__TITLES);
		}
		return titles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiLanguage> getDescriptions() {
		if (descriptions == null) {
			descriptions = new EObjectContainmentEList<MultiLanguage>(MultiLanguage.class, this, CorePackage.THING__DESCRIPTIONS);
		}
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, EventAffordance> getEvents() {
		if (events == null) {
			events = new EcoreEMap<String,EventAffordance>(CorePackage.Literals.STRING_TO_EVENT_MAP, StringToEventMapImpl.class, this, CorePackage.THING__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, ActionAffordance> getActions() {
		if (actions == null) {
			actions = new EcoreEMap<String,ActionAffordance>(CorePackage.Literals.STRING_TO_ACTION_MAP, StringToActionMapImpl.class, this, CorePackage.THING__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, PropertyAffordance> getProperties() {
		if (properties == null) {
			properties = new EcoreEMap<String,PropertyAffordance>(CorePackage.Literals.STRING_TO_PROPERTY_MAP, StringToPropertyMapImpl.class, this, CorePackage.THING__PROPERTIES);
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
			case CorePackage.THING__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case CorePackage.THING__DESCRIPTIONS:
				return ((InternalEList<?>)getDescriptions()).basicRemove(otherEnd, msgs);
			case CorePackage.THING__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case CorePackage.THING__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case CorePackage.THING__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case CorePackage.THING__ID:
				return getId();
			case CorePackage.THING__TITLE:
				return getTitle();
			case CorePackage.THING__DESCRIPTION:
				return getDescription();
			case CorePackage.THING__SEMANTIC_CONTEXT:
				return getSemanticContext();
			case CorePackage.THING__SEMANTIC_TYPE:
				return getSemanticType();
			case CorePackage.THING__CREATED:
				return getCreated();
			case CorePackage.THING__MODIFIED:
				return getModified();
			case CorePackage.THING__SUPPORT:
				return getSupport();
			case CorePackage.THING__BASE:
				return getBase();
			case CorePackage.THING__SECURITY:
				return getSecurity();
			case CorePackage.THING__LINKS:
				return getLinks();
			case CorePackage.THING__FORMS:
				return getForms();
			case CorePackage.THING__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case CorePackage.THING__TITLES:
				return getTitles();
			case CorePackage.THING__DESCRIPTIONS:
				return getDescriptions();
			case CorePackage.THING__EVENTS:
				if (coreType) return getEvents();
				else return getEvents().map();
			case CorePackage.THING__ACTIONS:
				if (coreType) return getActions();
				else return getActions().map();
			case CorePackage.THING__PROPERTIES:
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
			case CorePackage.THING__ID:
				setId((String)newValue);
				return;
			case CorePackage.THING__TITLE:
				setTitle((String)newValue);
				return;
			case CorePackage.THING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CorePackage.THING__SEMANTIC_CONTEXT:
				getSemanticContext().clear();
				getSemanticContext().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.THING__SEMANTIC_TYPE:
				getSemanticType().clear();
				getSemanticType().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.THING__CREATED:
				setCreated((Date)newValue);
				return;
			case CorePackage.THING__MODIFIED:
				setModified((Date)newValue);
				return;
			case CorePackage.THING__SUPPORT:
				setSupport((String)newValue);
				return;
			case CorePackage.THING__BASE:
				setBase((String)newValue);
				return;
			case CorePackage.THING__SECURITY:
				getSecurity().clear();
				getSecurity().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.THING__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case CorePackage.THING__FORMS:
				getForms().clear();
				getForms().addAll((Collection<? extends Form>)newValue);
				return;
			case CorePackage.THING__VERSION:
				setVersion((VersionInfo)newValue);
				return;
			case CorePackage.THING__TITLES:
				getTitles().clear();
				getTitles().addAll((Collection<? extends MultiLanguage>)newValue);
				return;
			case CorePackage.THING__DESCRIPTIONS:
				getDescriptions().clear();
				getDescriptions().addAll((Collection<? extends MultiLanguage>)newValue);
				return;
			case CorePackage.THING__EVENTS:
				((EStructuralFeature.Setting)getEvents()).set(newValue);
				return;
			case CorePackage.THING__ACTIONS:
				((EStructuralFeature.Setting)getActions()).set(newValue);
				return;
			case CorePackage.THING__PROPERTIES:
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
			case CorePackage.THING__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.THING__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CorePackage.THING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CorePackage.THING__SEMANTIC_CONTEXT:
				getSemanticContext().clear();
				return;
			case CorePackage.THING__SEMANTIC_TYPE:
				getSemanticType().clear();
				return;
			case CorePackage.THING__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case CorePackage.THING__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case CorePackage.THING__SUPPORT:
				setSupport(SUPPORT_EDEFAULT);
				return;
			case CorePackage.THING__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case CorePackage.THING__SECURITY:
				getSecurity().clear();
				return;
			case CorePackage.THING__LINKS:
				getLinks().clear();
				return;
			case CorePackage.THING__FORMS:
				getForms().clear();
				return;
			case CorePackage.THING__VERSION:
				setVersion((VersionInfo)null);
				return;
			case CorePackage.THING__TITLES:
				getTitles().clear();
				return;
			case CorePackage.THING__DESCRIPTIONS:
				getDescriptions().clear();
				return;
			case CorePackage.THING__EVENTS:
				getEvents().clear();
				return;
			case CorePackage.THING__ACTIONS:
				getActions().clear();
				return;
			case CorePackage.THING__PROPERTIES:
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
			case CorePackage.THING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.THING__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CorePackage.THING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CorePackage.THING__SEMANTIC_CONTEXT:
				return semanticContext != null && !semanticContext.isEmpty();
			case CorePackage.THING__SEMANTIC_TYPE:
				return semanticType != null && !semanticType.isEmpty();
			case CorePackage.THING__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case CorePackage.THING__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case CorePackage.THING__SUPPORT:
				return SUPPORT_EDEFAULT == null ? support != null : !SUPPORT_EDEFAULT.equals(support);
			case CorePackage.THING__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case CorePackage.THING__SECURITY:
				return security != null && !security.isEmpty();
			case CorePackage.THING__LINKS:
				return links != null && !links.isEmpty();
			case CorePackage.THING__FORMS:
				return forms != null && !forms.isEmpty();
			case CorePackage.THING__VERSION:
				return version != null;
			case CorePackage.THING__TITLES:
				return titles != null && !titles.isEmpty();
			case CorePackage.THING__DESCRIPTIONS:
				return descriptions != null && !descriptions.isEmpty();
			case CorePackage.THING__EVENTS:
				return events != null && !events.isEmpty();
			case CorePackage.THING__ACTIONS:
				return actions != null && !actions.isEmpty();
			case CorePackage.THING__PROPERTIES:
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
		result.append(" (id: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", semanticContext: ");
		result.append(semanticContext);
		result.append(", semanticType: ");
		result.append(semanticType);
		result.append(", created: ");
		result.append(created);
		result.append(", modified: ");
		result.append(modified);
		result.append(", support: ");
		result.append(support);
		result.append(", base: ");
		result.append(base);
		result.append(", security: ");
		result.append(security);
		result.append(')');
		return result.toString();
	}

} //ThingImpl
