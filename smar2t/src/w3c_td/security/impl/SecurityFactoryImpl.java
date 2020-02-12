/**
 */
package w3c_td.security.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import w3c_td.security.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityFactoryImpl extends EFactoryImpl implements SecurityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SecurityFactory init() {
		try {
			SecurityFactory theSecurityFactory = (SecurityFactory)EPackage.Registry.INSTANCE.getEFactory(SecurityPackage.eNS_URI);
			if (theSecurityFactory != null) {
				return theSecurityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SecurityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SecurityPackage.NO_SECURITY_SCHEME: return createNoSecurityScheme();
			case SecurityPackage.BASIC_SECURITY_SCHEME: return createBasicSecurityScheme();
			case SecurityPackage.DIGEST_SECURITY_SCHEME: return createDigestSecurityScheme();
			case SecurityPackage.API_KEY_SECURITY_SCHEME: return createAPIKeySecurityScheme();
			case SecurityPackage.BEARER_SECURITY_SCHEME: return createBearerSecurityScheme();
			case SecurityPackage.CERT_SECURITY_SCHEME: return createCertSecurityScheme();
			case SecurityPackage.PSK_SECURITY_SCHEME: return createPSKSecurityScheme();
			case SecurityPackage.PUBLIC_SECURITY_SCHEME: return createPublicSecurityScheme();
			case SecurityPackage.PO_PSECURITY_SCHEME: return createPoPSecurityScheme();
			case SecurityPackage.OAUTH2_SECURITY_SCHEME: return createOAuth2SecurityScheme();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoSecurityScheme createNoSecurityScheme() {
		NoSecuritySchemeImpl noSecurityScheme = new NoSecuritySchemeImpl();
		return noSecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicSecurityScheme createBasicSecurityScheme() {
		BasicSecuritySchemeImpl basicSecurityScheme = new BasicSecuritySchemeImpl();
		return basicSecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigestSecurityScheme createDigestSecurityScheme() {
		DigestSecuritySchemeImpl digestSecurityScheme = new DigestSecuritySchemeImpl();
		return digestSecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIKeySecurityScheme createAPIKeySecurityScheme() {
		APIKeySecuritySchemeImpl apiKeySecurityScheme = new APIKeySecuritySchemeImpl();
		return apiKeySecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BearerSecurityScheme createBearerSecurityScheme() {
		BearerSecuritySchemeImpl bearerSecurityScheme = new BearerSecuritySchemeImpl();
		return bearerSecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertSecurityScheme createCertSecurityScheme() {
		CertSecuritySchemeImpl certSecurityScheme = new CertSecuritySchemeImpl();
		return certSecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSKSecurityScheme createPSKSecurityScheme() {
		PSKSecuritySchemeImpl pskSecurityScheme = new PSKSecuritySchemeImpl();
		return pskSecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicSecurityScheme createPublicSecurityScheme() {
		PublicSecuritySchemeImpl publicSecurityScheme = new PublicSecuritySchemeImpl();
		return publicSecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoPSecurityScheme createPoPSecurityScheme() {
		PoPSecuritySchemeImpl poPSecurityScheme = new PoPSecuritySchemeImpl();
		return poPSecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuth2SecurityScheme createOAuth2SecurityScheme() {
		OAuth2SecuritySchemeImpl oAuth2SecurityScheme = new OAuth2SecuritySchemeImpl();
		return oAuth2SecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPackage getSecurityPackage() {
		return (SecurityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SecurityPackage getPackage() {
		return SecurityPackage.eINSTANCE;
	}

} //SecurityFactoryImpl
