/**
 */
package mozilla_td.impl;

import java.util.Collection;

import mozilla_td.Event;
import mozilla_td.Link;
import mozilla_td.Linkable;
import mozilla_td.Mozilla_tdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mozilla_td.impl.EventImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link mozilla_td.impl.EventImpl#getSemanticType <em>Semantic Type</em>}</li>
 *   <li>{@link mozilla_td.impl.EventImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends AttributeImpl implements Event {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mozilla_tdPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectResolvingEList<Link>(Link.class, this, Mozilla_tdPackage.EVENT__LINKS);
		}
		return links;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.EVENT__SEMANTIC_TYPE, oldSemanticType, semanticType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.EVENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mozilla_tdPackage.EVENT__LINKS:
				return getLinks();
			case Mozilla_tdPackage.EVENT__SEMANTIC_TYPE:
				return getSemanticType();
			case Mozilla_tdPackage.EVENT__DESCRIPTION:
				return getDescription();
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
			case Mozilla_tdPackage.EVENT__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case Mozilla_tdPackage.EVENT__SEMANTIC_TYPE:
				setSemanticType((String)newValue);
				return;
			case Mozilla_tdPackage.EVENT__DESCRIPTION:
				setDescription((String)newValue);
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
			case Mozilla_tdPackage.EVENT__LINKS:
				getLinks().clear();
				return;
			case Mozilla_tdPackage.EVENT__SEMANTIC_TYPE:
				setSemanticType(SEMANTIC_TYPE_EDEFAULT);
				return;
			case Mozilla_tdPackage.EVENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case Mozilla_tdPackage.EVENT__LINKS:
				return links != null && !links.isEmpty();
			case Mozilla_tdPackage.EVENT__SEMANTIC_TYPE:
				return SEMANTIC_TYPE_EDEFAULT == null ? semanticType != null : !SEMANTIC_TYPE_EDEFAULT.equals(semanticType);
			case Mozilla_tdPackage.EVENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
				case Mozilla_tdPackage.EVENT__LINKS: return Mozilla_tdPackage.LINKABLE__LINKS;
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
				case Mozilla_tdPackage.LINKABLE__LINKS: return Mozilla_tdPackage.EVENT__LINKS;
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
		result.append(" (semanticType: ");
		result.append(semanticType);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EventImpl
