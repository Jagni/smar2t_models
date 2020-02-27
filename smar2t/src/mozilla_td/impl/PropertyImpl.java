/**
 */
package mozilla_td.impl;

import java.util.Collection;

import mozilla_td.Link;
import mozilla_td.Linkable;
import mozilla_td.Mozilla_tdPackage;
import mozilla_td.Property;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mozilla_td.impl.PropertyImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link mozilla_td.impl.PropertyImpl#getHref <em>Href</em>}</li>
 *   <li>{@link mozilla_td.impl.PropertyImpl#getSemanticType <em>Semantic Type</em>}</li>
 *   <li>{@link mozilla_td.impl.PropertyImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link mozilla_td.impl.PropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mozilla_td.impl.PropertyImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends AttributeImpl implements Property {
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
	 * The default value of the '{@link #getSemanticType() <em>Semantic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticType()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticType() <em>Semantic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticType()
	 * @generated
	 * @ordered
	 */
	protected String semanticType = SEMANTIC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mozilla_tdPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, Mozilla_tdPackage.PROPERTY__LINKS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.PROPERTY__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemanticType() {
		return semanticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticType(String newSemanticType) {
		String oldSemanticType = semanticType;
		semanticType = newSemanticType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.PROPERTY__SEMANTIC_TYPE, oldSemanticType, semanticType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.PROPERTY__READ_ONLY, oldReadOnly, readOnly));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.PROPERTY__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.PROPERTY__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mozilla_tdPackage.PROPERTY__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case Mozilla_tdPackage.PROPERTY__LINKS:
				return getLinks();
			case Mozilla_tdPackage.PROPERTY__HREF:
				return getHref();
			case Mozilla_tdPackage.PROPERTY__SEMANTIC_TYPE:
				return getSemanticType();
			case Mozilla_tdPackage.PROPERTY__READ_ONLY:
				return isReadOnly();
			case Mozilla_tdPackage.PROPERTY__DESCRIPTION:
				return getDescription();
			case Mozilla_tdPackage.PROPERTY__TITLE:
				return getTitle();
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
			case Mozilla_tdPackage.PROPERTY__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case Mozilla_tdPackage.PROPERTY__HREF:
				setHref((String)newValue);
				return;
			case Mozilla_tdPackage.PROPERTY__SEMANTIC_TYPE:
				setSemanticType((String)newValue);
				return;
			case Mozilla_tdPackage.PROPERTY__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case Mozilla_tdPackage.PROPERTY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Mozilla_tdPackage.PROPERTY__TITLE:
				setTitle((String)newValue);
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
			case Mozilla_tdPackage.PROPERTY__LINKS:
				getLinks().clear();
				return;
			case Mozilla_tdPackage.PROPERTY__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case Mozilla_tdPackage.PROPERTY__SEMANTIC_TYPE:
				setSemanticType(SEMANTIC_TYPE_EDEFAULT);
				return;
			case Mozilla_tdPackage.PROPERTY__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case Mozilla_tdPackage.PROPERTY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Mozilla_tdPackage.PROPERTY__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case Mozilla_tdPackage.PROPERTY__LINKS:
				return links != null && !links.isEmpty();
			case Mozilla_tdPackage.PROPERTY__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case Mozilla_tdPackage.PROPERTY__SEMANTIC_TYPE:
				return SEMANTIC_TYPE_EDEFAULT == null ? semanticType != null : !SEMANTIC_TYPE_EDEFAULT.equals(semanticType);
			case Mozilla_tdPackage.PROPERTY__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case Mozilla_tdPackage.PROPERTY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Mozilla_tdPackage.PROPERTY__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Linkable.class) {
			switch (derivedFeatureID) {
				case Mozilla_tdPackage.PROPERTY__LINKS: return Mozilla_tdPackage.LINKABLE__LINKS;
				case Mozilla_tdPackage.PROPERTY__HREF: return Mozilla_tdPackage.LINKABLE__HREF;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Linkable.class) {
			switch (baseFeatureID) {
				case Mozilla_tdPackage.LINKABLE__LINKS: return Mozilla_tdPackage.PROPERTY__LINKS;
				case Mozilla_tdPackage.LINKABLE__HREF: return Mozilla_tdPackage.PROPERTY__HREF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", semanticType: ");
		result.append(semanticType);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", description: ");
		result.append(description);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
