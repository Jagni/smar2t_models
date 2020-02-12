/**
 */
package w3c_td.security.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import w3c_td.security.OAuth2SecurityScheme;
import w3c_td.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OAuth2 Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link w3c_td.security.impl.OAuth2SecuritySchemeImpl#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link w3c_td.security.impl.OAuth2SecuritySchemeImpl#getToken <em>Token</em>}</li>
 *   <li>{@link w3c_td.security.impl.OAuth2SecuritySchemeImpl#getRefresh <em>Refresh</em>}</li>
 *   <li>{@link w3c_td.security.impl.OAuth2SecuritySchemeImpl#getScopes <em>Scopes</em>}</li>
 *   <li>{@link w3c_td.security.impl.OAuth2SecuritySchemeImpl#getFlow <em>Flow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OAuth2SecuritySchemeImpl extends SecuritySchemeImpl implements OAuth2SecurityScheme {
	/**
	 * The default value of the '{@link #getAuthorization() <em>Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorization()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorization() <em>Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorization()
	 * @generated
	 * @ordered
	 */
	protected String authorization = AUTHORIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected String token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefresh() <em>Refresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefresh()
	 * @generated
	 * @ordered
	 */
	protected static final String REFRESH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefresh() <em>Refresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefresh()
	 * @generated
	 * @ordered
	 */
	protected String refresh = REFRESH_EDEFAULT;

	/**
	 * The default value of the '{@link #getScopes() <em>Scopes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScopes() <em>Scopes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes()
	 * @generated
	 * @ordered
	 */
	protected String scopes = SCOPES_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlow() <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlow() <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected String flow = FLOW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OAuth2SecuritySchemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.OAUTH2_SECURITY_SCHEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorization() {
		return authorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorization(String newAuthorization) {
		String oldAuthorization = authorization;
		authorization = newAuthorization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.OAUTH2_SECURITY_SCHEME__AUTHORIZATION, oldAuthorization, authorization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(String newToken) {
		String oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.OAUTH2_SECURITY_SCHEME__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefresh() {
		return refresh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefresh(String newRefresh) {
		String oldRefresh = refresh;
		refresh = newRefresh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.OAUTH2_SECURITY_SCHEME__REFRESH, oldRefresh, refresh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScopes() {
		return scopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopes(String newScopes) {
		String oldScopes = scopes;
		scopes = newScopes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.OAUTH2_SECURITY_SCHEME__SCOPES, oldScopes, scopes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlow() {
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlow(String newFlow) {
		String oldFlow = flow;
		flow = newFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.OAUTH2_SECURITY_SCHEME__FLOW, oldFlow, flow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__AUTHORIZATION:
				return getAuthorization();
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__TOKEN:
				return getToken();
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__REFRESH:
				return getRefresh();
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__SCOPES:
				return getScopes();
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__FLOW:
				return getFlow();
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
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__AUTHORIZATION:
				setAuthorization((String)newValue);
				return;
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__TOKEN:
				setToken((String)newValue);
				return;
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__REFRESH:
				setRefresh((String)newValue);
				return;
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__SCOPES:
				setScopes((String)newValue);
				return;
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__FLOW:
				setFlow((String)newValue);
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
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__AUTHORIZATION:
				setAuthorization(AUTHORIZATION_EDEFAULT);
				return;
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__REFRESH:
				setRefresh(REFRESH_EDEFAULT);
				return;
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__SCOPES:
				setScopes(SCOPES_EDEFAULT);
				return;
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__FLOW:
				setFlow(FLOW_EDEFAULT);
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
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__AUTHORIZATION:
				return AUTHORIZATION_EDEFAULT == null ? authorization != null : !AUTHORIZATION_EDEFAULT.equals(authorization);
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__TOKEN:
				return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__REFRESH:
				return REFRESH_EDEFAULT == null ? refresh != null : !REFRESH_EDEFAULT.equals(refresh);
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__SCOPES:
				return SCOPES_EDEFAULT == null ? scopes != null : !SCOPES_EDEFAULT.equals(scopes);
			case SecurityPackage.OAUTH2_SECURITY_SCHEME__FLOW:
				return FLOW_EDEFAULT == null ? flow != null : !FLOW_EDEFAULT.equals(flow);
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
		result.append(" (authorization: ");
		result.append(authorization);
		result.append(", token: ");
		result.append(token);
		result.append(", refresh: ");
		result.append(refresh);
		result.append(", scopes: ");
		result.append(scopes);
		result.append(", flow: ");
		result.append(flow);
		result.append(')');
		return result.toString();
	}

} //OAuth2SecuritySchemeImpl
