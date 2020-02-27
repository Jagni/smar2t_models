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

import w3c_td.ExpectedResponse;
import w3c_td.Form;
import w3c_td.W3c_tdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link w3c_td.impl.FormImpl#getOp <em>Op</em>}</li>
 *   <li>{@link w3c_td.impl.FormImpl#getHref <em>Href</em>}</li>
 *   <li>{@link w3c_td.impl.FormImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link w3c_td.impl.FormImpl#getContentCoding <em>Content Coding</em>}</li>
 *   <li>{@link w3c_td.impl.FormImpl#getSubprotocol <em>Subprotocol</em>}</li>
 *   <li>{@link w3c_td.impl.FormImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link w3c_td.impl.FormImpl#getScopes <em>Scopes</em>}</li>
 *   <li>{@link w3c_td.impl.FormImpl#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormImpl extends MinimalEObjectImpl.Container implements Form {
	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected EList<String> op;

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
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = "application/json";

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentCoding() <em>Content Coding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentCoding()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_CODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentCoding() <em>Content Coding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentCoding()
	 * @generated
	 * @ordered
	 */
	protected String contentCoding = CONTENT_CODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubprotocol() <em>Subprotocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubprotocol()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBPROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubprotocol() <em>Subprotocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubprotocol()
	 * @generated
	 * @ordered
	 */
	protected String subprotocol = SUBPROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected String security = SECURITY_EDEFAULT;

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
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected ExpectedResponse response;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return W3c_tdPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOp() {
		if (op == null) {
			op = new EDataTypeUniqueEList<String>(String.class, this, W3c_tdPackage.FORM__OP);
		}
		return op;
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
			eNotify(new ENotificationImpl(this, Notification.SET, W3c_tdPackage.FORM__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3c_tdPackage.FORM__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentCoding() {
		return contentCoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentCoding(String newContentCoding) {
		String oldContentCoding = contentCoding;
		contentCoding = newContentCoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3c_tdPackage.FORM__CONTENT_CODING, oldContentCoding, contentCoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubprotocol() {
		return subprotocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubprotocol(String newSubprotocol) {
		String oldSubprotocol = subprotocol;
		subprotocol = newSubprotocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3c_tdPackage.FORM__SUBPROTOCOL, oldSubprotocol, subprotocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity(String newSecurity) {
		String oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3c_tdPackage.FORM__SECURITY, oldSecurity, security));
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
			eNotify(new ENotificationImpl(this, Notification.SET, W3c_tdPackage.FORM__SCOPES, oldScopes, scopes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedResponse getResponse() {
		if (response != null && response.eIsProxy()) {
			InternalEObject oldResponse = (InternalEObject)response;
			response = (ExpectedResponse)eResolveProxy(oldResponse);
			if (response != oldResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, W3c_tdPackage.FORM__RESPONSE, oldResponse, response));
			}
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedResponse basicGetResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(ExpectedResponse newResponse) {
		ExpectedResponse oldResponse = response;
		response = newResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3c_tdPackage.FORM__RESPONSE, oldResponse, response));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case W3c_tdPackage.FORM__OP:
				return getOp();
			case W3c_tdPackage.FORM__HREF:
				return getHref();
			case W3c_tdPackage.FORM__CONTENT_TYPE:
				return getContentType();
			case W3c_tdPackage.FORM__CONTENT_CODING:
				return getContentCoding();
			case W3c_tdPackage.FORM__SUBPROTOCOL:
				return getSubprotocol();
			case W3c_tdPackage.FORM__SECURITY:
				return getSecurity();
			case W3c_tdPackage.FORM__SCOPES:
				return getScopes();
			case W3c_tdPackage.FORM__RESPONSE:
				if (resolve) return getResponse();
				return basicGetResponse();
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
			case W3c_tdPackage.FORM__OP:
				getOp().clear();
				getOp().addAll((Collection<? extends String>)newValue);
				return;
			case W3c_tdPackage.FORM__HREF:
				setHref((String)newValue);
				return;
			case W3c_tdPackage.FORM__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case W3c_tdPackage.FORM__CONTENT_CODING:
				setContentCoding((String)newValue);
				return;
			case W3c_tdPackage.FORM__SUBPROTOCOL:
				setSubprotocol((String)newValue);
				return;
			case W3c_tdPackage.FORM__SECURITY:
				setSecurity((String)newValue);
				return;
			case W3c_tdPackage.FORM__SCOPES:
				setScopes((String)newValue);
				return;
			case W3c_tdPackage.FORM__RESPONSE:
				setResponse((ExpectedResponse)newValue);
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
			case W3c_tdPackage.FORM__OP:
				getOp().clear();
				return;
			case W3c_tdPackage.FORM__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case W3c_tdPackage.FORM__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case W3c_tdPackage.FORM__CONTENT_CODING:
				setContentCoding(CONTENT_CODING_EDEFAULT);
				return;
			case W3c_tdPackage.FORM__SUBPROTOCOL:
				setSubprotocol(SUBPROTOCOL_EDEFAULT);
				return;
			case W3c_tdPackage.FORM__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case W3c_tdPackage.FORM__SCOPES:
				setScopes(SCOPES_EDEFAULT);
				return;
			case W3c_tdPackage.FORM__RESPONSE:
				setResponse((ExpectedResponse)null);
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
			case W3c_tdPackage.FORM__OP:
				return op != null && !op.isEmpty();
			case W3c_tdPackage.FORM__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case W3c_tdPackage.FORM__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case W3c_tdPackage.FORM__CONTENT_CODING:
				return CONTENT_CODING_EDEFAULT == null ? contentCoding != null : !CONTENT_CODING_EDEFAULT.equals(contentCoding);
			case W3c_tdPackage.FORM__SUBPROTOCOL:
				return SUBPROTOCOL_EDEFAULT == null ? subprotocol != null : !SUBPROTOCOL_EDEFAULT.equals(subprotocol);
			case W3c_tdPackage.FORM__SECURITY:
				return SECURITY_EDEFAULT == null ? security != null : !SECURITY_EDEFAULT.equals(security);
			case W3c_tdPackage.FORM__SCOPES:
				return SCOPES_EDEFAULT == null ? scopes != null : !SCOPES_EDEFAULT.equals(scopes);
			case W3c_tdPackage.FORM__RESPONSE:
				return response != null;
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
		result.append(" (op: ");
		result.append(op);
		result.append(", href: ");
		result.append(href);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", contentCoding: ");
		result.append(contentCoding);
		result.append(", subprotocol: ");
		result.append(subprotocol);
		result.append(", security: ");
		result.append(security);
		result.append(", scopes: ");
		result.append(scopes);
		result.append(')');
		return result.toString();
	}

} //FormImpl
