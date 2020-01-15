/**
 */
package smar2t.td.w3c.security.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import smar2t.td.w3c.security.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see smar2t.td.w3c.security.SecurityPackage
 * @generated
 */
public class SecuritySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecurityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritySwitch() {
		if (modelPackage == null) {
			modelPackage = SecurityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SecurityPackage.SECURITY_SCHEME: {
				SecurityScheme securityScheme = (SecurityScheme)theEObject;
				T result = caseSecurityScheme(securityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.NO_SECURITY_SCHEME: {
				NoSecurityScheme noSecurityScheme = (NoSecurityScheme)theEObject;
				T result = caseNoSecurityScheme(noSecurityScheme);
				if (result == null) result = caseSecurityScheme(noSecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.BASIC_SECURITY_SCHEME: {
				BasicSecurityScheme basicSecurityScheme = (BasicSecurityScheme)theEObject;
				T result = caseBasicSecurityScheme(basicSecurityScheme);
				if (result == null) result = caseSecurityScheme(basicSecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.DIGEST_SECURITY_SCHEME: {
				DigestSecurityScheme digestSecurityScheme = (DigestSecurityScheme)theEObject;
				T result = caseDigestSecurityScheme(digestSecurityScheme);
				if (result == null) result = caseSecurityScheme(digestSecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.API_KEY_SECURITY_SCHEME: {
				APIKeySecurityScheme apiKeySecurityScheme = (APIKeySecurityScheme)theEObject;
				T result = caseAPIKeySecurityScheme(apiKeySecurityScheme);
				if (result == null) result = caseSecurityScheme(apiKeySecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.BEARER_SECURITY_SCHEME: {
				BearerSecurityScheme bearerSecurityScheme = (BearerSecurityScheme)theEObject;
				T result = caseBearerSecurityScheme(bearerSecurityScheme);
				if (result == null) result = caseSecurityScheme(bearerSecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.CERT_SECURITY_SCHEME: {
				CertSecurityScheme certSecurityScheme = (CertSecurityScheme)theEObject;
				T result = caseCertSecurityScheme(certSecurityScheme);
				if (result == null) result = caseSecurityScheme(certSecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.PSK_SECURITY_SCHEME: {
				PSKSecurityScheme pskSecurityScheme = (PSKSecurityScheme)theEObject;
				T result = casePSKSecurityScheme(pskSecurityScheme);
				if (result == null) result = caseSecurityScheme(pskSecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.PUBLIC_SECURITY_SCHEME: {
				PublicSecurityScheme publicSecurityScheme = (PublicSecurityScheme)theEObject;
				T result = casePublicSecurityScheme(publicSecurityScheme);
				if (result == null) result = caseSecurityScheme(publicSecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.PO_PSECURITY_SCHEME: {
				PoPSecurityScheme poPSecurityScheme = (PoPSecurityScheme)theEObject;
				T result = casePoPSecurityScheme(poPSecurityScheme);
				if (result == null) result = caseSecurityScheme(poPSecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPackage.OAUTH2_SECURITY_SCHEME: {
				OAuth2SecurityScheme oAuth2SecurityScheme = (OAuth2SecurityScheme)theEObject;
				T result = caseOAuth2SecurityScheme(oAuth2SecurityScheme);
				if (result == null) result = caseSecurityScheme(oAuth2SecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityScheme(SecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoSecurityScheme(NoSecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicSecurityScheme(BasicSecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digest Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digest Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigestSecurityScheme(DigestSecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Key Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Key Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPIKeySecurityScheme(APIKeySecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bearer Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bearer Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBearerSecurityScheme(BearerSecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cert Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cert Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertSecurityScheme(CertSecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PSK Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PSK Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSKSecurityScheme(PSKSecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicSecurityScheme(PublicSecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Po PSecurity Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Po PSecurity Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoPSecurityScheme(PoPSecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OAuth2 Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OAuth2 Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOAuth2SecurityScheme(OAuth2SecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SecuritySwitch
