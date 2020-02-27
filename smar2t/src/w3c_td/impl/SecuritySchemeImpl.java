/**
 */
package w3c_td.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import w3c_td.MultiLanguage;
import w3c_td.SecurityScheme;
import w3c_td.W3c_tdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link w3c_td.impl.SecuritySchemeImpl#getSemanticType <em>Semantic Type</em>}</li>
 *   <li>{@link w3c_td.impl.SecuritySchemeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link w3c_td.impl.SecuritySchemeImpl#getProxy <em>Proxy</em>}</li>
 *   <li>{@link w3c_td.impl.SecuritySchemeImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link w3c_td.impl.SecuritySchemeImpl#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SecuritySchemeImpl extends MinimalEObjectImpl.Container implements SecurityScheme {
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
	 * The default value of the '{@link #getProxy() <em>Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxy()
	 * @generated
	 * @ordered
	 */
	protected static final String PROXY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProxy() <em>Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxy()
	 * @generated
	 * @ordered
	 */
	protected String proxy = PROXY_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected String scheme = SCHEME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected MultiLanguage descriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuritySchemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return W3c_tdPackage.Literals.SECURITY_SCHEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSemanticType() {
		if (semanticType == null) {
			semanticType = new EDataTypeUniqueEList<String>(String.class, this, W3c_tdPackage.SECURITY_SCHEME__SEMANTIC_TYPE);
		}
		return semanticType;
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
			eNotify(new ENotificationImpl(this, Notification.SET, W3c_tdPackage.SECURITY_SCHEME__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProxy() {
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxy(String newProxy) {
		String oldProxy = proxy;
		proxy = newProxy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3c_tdPackage.SECURITY_SCHEME__PROXY, oldProxy, proxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheme() {
		return scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheme(String newScheme) {
		String oldScheme = scheme;
		scheme = newScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3c_tdPackage.SECURITY_SCHEME__SCHEME, oldScheme, scheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLanguage getDescriptions() {
		if (descriptions != null && descriptions.eIsProxy()) {
			InternalEObject oldDescriptions = (InternalEObject)descriptions;
			descriptions = (MultiLanguage)eResolveProxy(oldDescriptions);
			if (descriptions != oldDescriptions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, W3c_tdPackage.SECURITY_SCHEME__DESCRIPTIONS, oldDescriptions, descriptions));
			}
		}
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLanguage basicGetDescriptions() {
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptions(MultiLanguage newDescriptions) {
		MultiLanguage oldDescriptions = descriptions;
		descriptions = newDescriptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3c_tdPackage.SECURITY_SCHEME__DESCRIPTIONS, oldDescriptions, descriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case W3c_tdPackage.SECURITY_SCHEME__SEMANTIC_TYPE:
				return getSemanticType();
			case W3c_tdPackage.SECURITY_SCHEME__DESCRIPTION:
				return getDescription();
			case W3c_tdPackage.SECURITY_SCHEME__PROXY:
				return getProxy();
			case W3c_tdPackage.SECURITY_SCHEME__SCHEME:
				return getScheme();
			case W3c_tdPackage.SECURITY_SCHEME__DESCRIPTIONS:
				if (resolve) return getDescriptions();
				return basicGetDescriptions();
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
			case W3c_tdPackage.SECURITY_SCHEME__SEMANTIC_TYPE:
				getSemanticType().clear();
				getSemanticType().addAll((Collection<? extends String>)newValue);
				return;
			case W3c_tdPackage.SECURITY_SCHEME__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case W3c_tdPackage.SECURITY_SCHEME__PROXY:
				setProxy((String)newValue);
				return;
			case W3c_tdPackage.SECURITY_SCHEME__SCHEME:
				setScheme((String)newValue);
				return;
			case W3c_tdPackage.SECURITY_SCHEME__DESCRIPTIONS:
				setDescriptions((MultiLanguage)newValue);
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
			case W3c_tdPackage.SECURITY_SCHEME__SEMANTIC_TYPE:
				getSemanticType().clear();
				return;
			case W3c_tdPackage.SECURITY_SCHEME__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case W3c_tdPackage.SECURITY_SCHEME__PROXY:
				setProxy(PROXY_EDEFAULT);
				return;
			case W3c_tdPackage.SECURITY_SCHEME__SCHEME:
				setScheme(SCHEME_EDEFAULT);
				return;
			case W3c_tdPackage.SECURITY_SCHEME__DESCRIPTIONS:
				setDescriptions((MultiLanguage)null);
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
			case W3c_tdPackage.SECURITY_SCHEME__SEMANTIC_TYPE:
				return semanticType != null && !semanticType.isEmpty();
			case W3c_tdPackage.SECURITY_SCHEME__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case W3c_tdPackage.SECURITY_SCHEME__PROXY:
				return PROXY_EDEFAULT == null ? proxy != null : !PROXY_EDEFAULT.equals(proxy);
			case W3c_tdPackage.SECURITY_SCHEME__SCHEME:
				return SCHEME_EDEFAULT == null ? scheme != null : !SCHEME_EDEFAULT.equals(scheme);
			case W3c_tdPackage.SECURITY_SCHEME__DESCRIPTIONS:
				return descriptions != null;
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
		result.append(" (semanticType: ");
		result.append(semanticType);
		result.append(", description: ");
		result.append(description);
		result.append(", proxy: ");
		result.append(proxy);
		result.append(", scheme: ");
		result.append(scheme);
		result.append(')');
		return result.toString();
	}

} //SecuritySchemeImpl
