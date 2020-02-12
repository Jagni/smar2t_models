/**
 */
package w3c_td.security;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see w3c_td.security.SecurityPackage
 * @generated
 */
public interface SecurityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityFactory eINSTANCE = w3c_td.security.impl.SecurityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>No Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Security Scheme</em>'.
	 * @generated
	 */
	NoSecurityScheme createNoSecurityScheme();

	/**
	 * Returns a new object of class '<em>Basic Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Security Scheme</em>'.
	 * @generated
	 */
	BasicSecurityScheme createBasicSecurityScheme();

	/**
	 * Returns a new object of class '<em>Digest Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digest Security Scheme</em>'.
	 * @generated
	 */
	DigestSecurityScheme createDigestSecurityScheme();

	/**
	 * Returns a new object of class '<em>API Key Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Key Security Scheme</em>'.
	 * @generated
	 */
	APIKeySecurityScheme createAPIKeySecurityScheme();

	/**
	 * Returns a new object of class '<em>Bearer Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bearer Security Scheme</em>'.
	 * @generated
	 */
	BearerSecurityScheme createBearerSecurityScheme();

	/**
	 * Returns a new object of class '<em>Cert Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cert Security Scheme</em>'.
	 * @generated
	 */
	CertSecurityScheme createCertSecurityScheme();

	/**
	 * Returns a new object of class '<em>PSK Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PSK Security Scheme</em>'.
	 * @generated
	 */
	PSKSecurityScheme createPSKSecurityScheme();

	/**
	 * Returns a new object of class '<em>Public Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Security Scheme</em>'.
	 * @generated
	 */
	PublicSecurityScheme createPublicSecurityScheme();

	/**
	 * Returns a new object of class '<em>Po PSecurity Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Po PSecurity Scheme</em>'.
	 * @generated
	 */
	PoPSecurityScheme createPoPSecurityScheme();

	/**
	 * Returns a new object of class '<em>OAuth2 Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OAuth2 Security Scheme</em>'.
	 * @generated
	 */
	OAuth2SecurityScheme createOAuth2SecurityScheme();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SecurityPackage getSecurityPackage();

} //SecurityFactory
