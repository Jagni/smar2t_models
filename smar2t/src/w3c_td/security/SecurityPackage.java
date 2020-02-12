/**
 */
package w3c_td.security;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see w3c_td.security.SecurityFactory
 * @model kind="package"
 * @generated
 */
public interface SecurityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "security";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.smar2t.w3c_td.security";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "W3cTd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPackage eINSTANCE = w3c_td.security.impl.SecurityPackageImpl.init();

	/**
	 * The meta object id for the '{@link w3c_td.security.impl.SecuritySchemeImpl <em>Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.security.impl.SecuritySchemeImpl
	 * @see w3c_td.security.impl.SecurityPackageImpl#getSecurityScheme()
	 * @generated
	 */
	int SECURITY_SCHEME = 0;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__SEMANTIC_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__PROXY = 2;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__SCHEME = 3;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__DESCRIPTIONS = 4;

	/**
	 * The number of structural features of the '<em>Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link w3c_td.security.impl.NoSecuritySchemeImpl <em>No Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.security.impl.NoSecuritySchemeImpl
	 * @see w3c_td.security.impl.SecurityPackageImpl#getNoSecurityScheme()
	 * @generated
	 */
	int NO_SECURITY_SCHEME = 1;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The number of structural features of the '<em>No Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.security.impl.BasicSecuritySchemeImpl <em>Basic Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.security.impl.BasicSecuritySchemeImpl
	 * @see w3c_td.security.impl.SecurityPackageImpl#getBasicSecurityScheme()
	 * @generated
	 */
	int BASIC_SECURITY_SCHEME = 2;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Basic Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.security.impl.DigestSecuritySchemeImpl <em>Digest Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.security.impl.DigestSecuritySchemeImpl
	 * @see w3c_td.security.impl.SecurityPackageImpl#getDigestSecurityScheme()
	 * @generated
	 */
	int DIGEST_SECURITY_SCHEME = 3;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Qop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__QOP = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Digest Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Digest Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.security.impl.APIKeySecuritySchemeImpl <em>API Key Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.security.impl.APIKeySecuritySchemeImpl
	 * @see w3c_td.security.impl.SecurityPackageImpl#getAPIKeySecurityScheme()
	 * @generated
	 */
	int API_KEY_SECURITY_SCHEME = 4;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>API Key Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>API Key Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.security.impl.BearerSecuritySchemeImpl <em>Bearer Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.security.impl.BearerSecuritySchemeImpl
	 * @see w3c_td.security.impl.SecurityPackageImpl#getBearerSecurityScheme()
	 * @generated
	 */
	int BEARER_SECURITY_SCHEME = 5;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__AUTHORIZATION = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__ALG = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__FORMAT = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Bearer Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Bearer Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.security.impl.CertSecuritySchemeImpl <em>Cert Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.security.impl.CertSecuritySchemeImpl
	 * @see w3c_td.security.impl.SecurityPackageImpl#getCertSecurityScheme()
	 * @generated
	 */
	int CERT_SECURITY_SCHEME = 6;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__IDENTITY = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cert Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cert Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.security.impl.PSKSecuritySchemeImpl <em>PSK Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.security.impl.PSKSecuritySchemeImpl
	 * @see w3c_td.security.impl.SecurityPackageImpl#getPSKSecurityScheme()
	 * @generated
	 */
	int PSK_SECURITY_SCHEME = 7;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__IDENTITY = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PSK Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PSK Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.security.impl.PublicSecuritySchemeImpl <em>Public Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.security.impl.PublicSecuritySchemeImpl
	 * @see w3c_td.security.impl.SecurityPackageImpl#getPublicSecurityScheme()
	 * @generated
	 */
	int PUBLIC_SECURITY_SCHEME = 8;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__IDENTITY = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Public Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Public Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.security.impl.PoPSecuritySchemeImpl <em>Po PSecurity Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.security.impl.PoPSecuritySchemeImpl
	 * @see w3c_td.security.impl.SecurityPackageImpl#getPoPSecurityScheme()
	 * @generated
	 */
	int PO_PSECURITY_SCHEME = 9;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__AUTHORIZATION = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__ALG = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__FORMAT = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Po PSecurity Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Po PSecurity Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.security.impl.OAuth2SecuritySchemeImpl <em>OAuth2 Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.security.impl.OAuth2SecuritySchemeImpl
	 * @see w3c_td.security.impl.SecurityPackageImpl#getOAuth2SecurityScheme()
	 * @generated
	 */
	int OAUTH2_SECURITY_SCHEME = 10;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__AUTHORIZATION = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__TOKEN = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refresh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__REFRESH = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__SCOPES = SECURITY_SCHEME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__FLOW = SECURITY_SCHEME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>OAuth2 Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>OAuth2 Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link w3c_td.security.SecurityScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheme</em>'.
	 * @see w3c_td.security.SecurityScheme
	 * @generated
	 */
	EClass getSecurityScheme();

	/**
	 * Returns the meta object for the attribute list '{@link w3c_td.security.SecurityScheme#getSemanticType <em>Semantic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Semantic Type</em>'.
	 * @see w3c_td.security.SecurityScheme#getSemanticType()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_SemanticType();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.SecurityScheme#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see w3c_td.security.SecurityScheme#getDescription()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Description();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.SecurityScheme#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy</em>'.
	 * @see w3c_td.security.SecurityScheme#getProxy()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Proxy();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.SecurityScheme#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see w3c_td.security.SecurityScheme#getScheme()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Scheme();

	/**
	 * Returns the meta object for the reference '{@link w3c_td.security.SecurityScheme#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Descriptions</em>'.
	 * @see w3c_td.security.SecurityScheme#getDescriptions()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EReference getSecurityScheme_Descriptions();

	/**
	 * Returns the meta object for class '{@link w3c_td.security.NoSecurityScheme <em>No Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Security Scheme</em>'.
	 * @see w3c_td.security.NoSecurityScheme
	 * @generated
	 */
	EClass getNoSecurityScheme();

	/**
	 * Returns the meta object for class '{@link w3c_td.security.BasicSecurityScheme <em>Basic Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Security Scheme</em>'.
	 * @see w3c_td.security.BasicSecurityScheme
	 * @generated
	 */
	EClass getBasicSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.BasicSecurityScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see w3c_td.security.BasicSecurityScheme#getIn()
	 * @see #getBasicSecurityScheme()
	 * @generated
	 */
	EAttribute getBasicSecurityScheme_In();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.BasicSecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see w3c_td.security.BasicSecurityScheme#getName()
	 * @see #getBasicSecurityScheme()
	 * @generated
	 */
	EAttribute getBasicSecurityScheme_Name();

	/**
	 * Returns the meta object for class '{@link w3c_td.security.DigestSecurityScheme <em>Digest Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digest Security Scheme</em>'.
	 * @see w3c_td.security.DigestSecurityScheme
	 * @generated
	 */
	EClass getDigestSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.DigestSecurityScheme#getQop <em>Qop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qop</em>'.
	 * @see w3c_td.security.DigestSecurityScheme#getQop()
	 * @see #getDigestSecurityScheme()
	 * @generated
	 */
	EAttribute getDigestSecurityScheme_Qop();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.DigestSecurityScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see w3c_td.security.DigestSecurityScheme#getIn()
	 * @see #getDigestSecurityScheme()
	 * @generated
	 */
	EAttribute getDigestSecurityScheme_In();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.DigestSecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see w3c_td.security.DigestSecurityScheme#getName()
	 * @see #getDigestSecurityScheme()
	 * @generated
	 */
	EAttribute getDigestSecurityScheme_Name();

	/**
	 * Returns the meta object for class '{@link w3c_td.security.APIKeySecurityScheme <em>API Key Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Key Security Scheme</em>'.
	 * @see w3c_td.security.APIKeySecurityScheme
	 * @generated
	 */
	EClass getAPIKeySecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.APIKeySecurityScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see w3c_td.security.APIKeySecurityScheme#getIn()
	 * @see #getAPIKeySecurityScheme()
	 * @generated
	 */
	EAttribute getAPIKeySecurityScheme_In();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.APIKeySecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see w3c_td.security.APIKeySecurityScheme#getName()
	 * @see #getAPIKeySecurityScheme()
	 * @generated
	 */
	EAttribute getAPIKeySecurityScheme_Name();

	/**
	 * Returns the meta object for class '{@link w3c_td.security.BearerSecurityScheme <em>Bearer Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bearer Security Scheme</em>'.
	 * @see w3c_td.security.BearerSecurityScheme
	 * @generated
	 */
	EClass getBearerSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.BearerSecurityScheme#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization</em>'.
	 * @see w3c_td.security.BearerSecurityScheme#getAuthorization()
	 * @see #getBearerSecurityScheme()
	 * @generated
	 */
	EAttribute getBearerSecurityScheme_Authorization();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.BearerSecurityScheme#getAlg <em>Alg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alg</em>'.
	 * @see w3c_td.security.BearerSecurityScheme#getAlg()
	 * @see #getBearerSecurityScheme()
	 * @generated
	 */
	EAttribute getBearerSecurityScheme_Alg();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.BearerSecurityScheme#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see w3c_td.security.BearerSecurityScheme#getFormat()
	 * @see #getBearerSecurityScheme()
	 * @generated
	 */
	EAttribute getBearerSecurityScheme_Format();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.BearerSecurityScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see w3c_td.security.BearerSecurityScheme#getIn()
	 * @see #getBearerSecurityScheme()
	 * @generated
	 */
	EAttribute getBearerSecurityScheme_In();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.BearerSecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see w3c_td.security.BearerSecurityScheme#getName()
	 * @see #getBearerSecurityScheme()
	 * @generated
	 */
	EAttribute getBearerSecurityScheme_Name();

	/**
	 * Returns the meta object for class '{@link w3c_td.security.CertSecurityScheme <em>Cert Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cert Security Scheme</em>'.
	 * @see w3c_td.security.CertSecurityScheme
	 * @generated
	 */
	EClass getCertSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.CertSecurityScheme#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see w3c_td.security.CertSecurityScheme#getIdentity()
	 * @see #getCertSecurityScheme()
	 * @generated
	 */
	EAttribute getCertSecurityScheme_Identity();

	/**
	 * Returns the meta object for class '{@link w3c_td.security.PSKSecurityScheme <em>PSK Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSK Security Scheme</em>'.
	 * @see w3c_td.security.PSKSecurityScheme
	 * @generated
	 */
	EClass getPSKSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.PSKSecurityScheme#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see w3c_td.security.PSKSecurityScheme#getIdentity()
	 * @see #getPSKSecurityScheme()
	 * @generated
	 */
	EAttribute getPSKSecurityScheme_Identity();

	/**
	 * Returns the meta object for class '{@link w3c_td.security.PublicSecurityScheme <em>Public Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Security Scheme</em>'.
	 * @see w3c_td.security.PublicSecurityScheme
	 * @generated
	 */
	EClass getPublicSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.PublicSecurityScheme#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see w3c_td.security.PublicSecurityScheme#getIdentity()
	 * @see #getPublicSecurityScheme()
	 * @generated
	 */
	EAttribute getPublicSecurityScheme_Identity();

	/**
	 * Returns the meta object for class '{@link w3c_td.security.PoPSecurityScheme <em>Po PSecurity Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Po PSecurity Scheme</em>'.
	 * @see w3c_td.security.PoPSecurityScheme
	 * @generated
	 */
	EClass getPoPSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.PoPSecurityScheme#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization</em>'.
	 * @see w3c_td.security.PoPSecurityScheme#getAuthorization()
	 * @see #getPoPSecurityScheme()
	 * @generated
	 */
	EAttribute getPoPSecurityScheme_Authorization();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.PoPSecurityScheme#getAlg <em>Alg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alg</em>'.
	 * @see w3c_td.security.PoPSecurityScheme#getAlg()
	 * @see #getPoPSecurityScheme()
	 * @generated
	 */
	EAttribute getPoPSecurityScheme_Alg();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.PoPSecurityScheme#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see w3c_td.security.PoPSecurityScheme#getFormat()
	 * @see #getPoPSecurityScheme()
	 * @generated
	 */
	EAttribute getPoPSecurityScheme_Format();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.PoPSecurityScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see w3c_td.security.PoPSecurityScheme#getIn()
	 * @see #getPoPSecurityScheme()
	 * @generated
	 */
	EAttribute getPoPSecurityScheme_In();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.PoPSecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see w3c_td.security.PoPSecurityScheme#getName()
	 * @see #getPoPSecurityScheme()
	 * @generated
	 */
	EAttribute getPoPSecurityScheme_Name();

	/**
	 * Returns the meta object for class '{@link w3c_td.security.OAuth2SecurityScheme <em>OAuth2 Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth2 Security Scheme</em>'.
	 * @see w3c_td.security.OAuth2SecurityScheme
	 * @generated
	 */
	EClass getOAuth2SecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.OAuth2SecurityScheme#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization</em>'.
	 * @see w3c_td.security.OAuth2SecurityScheme#getAuthorization()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_Authorization();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.OAuth2SecurityScheme#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see w3c_td.security.OAuth2SecurityScheme#getToken()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_Token();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.OAuth2SecurityScheme#getRefresh <em>Refresh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh</em>'.
	 * @see w3c_td.security.OAuth2SecurityScheme#getRefresh()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_Refresh();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.OAuth2SecurityScheme#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scopes</em>'.
	 * @see w3c_td.security.OAuth2SecurityScheme#getScopes()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_Scopes();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.security.OAuth2SecurityScheme#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow</em>'.
	 * @see w3c_td.security.OAuth2SecurityScheme#getFlow()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_Flow();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecurityFactory getSecurityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link w3c_td.security.impl.SecuritySchemeImpl <em>Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.security.impl.SecuritySchemeImpl
		 * @see w3c_td.security.impl.SecurityPackageImpl#getSecurityScheme()
		 * @generated
		 */
		EClass SECURITY_SCHEME = eINSTANCE.getSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Semantic Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__SEMANTIC_TYPE = eINSTANCE.getSecurityScheme_SemanticType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__DESCRIPTION = eINSTANCE.getSecurityScheme_Description();

		/**
		 * The meta object literal for the '<em><b>Proxy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__PROXY = eINSTANCE.getSecurityScheme_Proxy();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__SCHEME = eINSTANCE.getSecurityScheme_Scheme();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_SCHEME__DESCRIPTIONS = eINSTANCE.getSecurityScheme_Descriptions();

		/**
		 * The meta object literal for the '{@link w3c_td.security.impl.NoSecuritySchemeImpl <em>No Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.security.impl.NoSecuritySchemeImpl
		 * @see w3c_td.security.impl.SecurityPackageImpl#getNoSecurityScheme()
		 * @generated
		 */
		EClass NO_SECURITY_SCHEME = eINSTANCE.getNoSecurityScheme();

		/**
		 * The meta object literal for the '{@link w3c_td.security.impl.BasicSecuritySchemeImpl <em>Basic Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.security.impl.BasicSecuritySchemeImpl
		 * @see w3c_td.security.impl.SecurityPackageImpl#getBasicSecurityScheme()
		 * @generated
		 */
		EClass BASIC_SECURITY_SCHEME = eINSTANCE.getBasicSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_SECURITY_SCHEME__IN = eINSTANCE.getBasicSecurityScheme_In();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_SECURITY_SCHEME__NAME = eINSTANCE.getBasicSecurityScheme_Name();

		/**
		 * The meta object literal for the '{@link w3c_td.security.impl.DigestSecuritySchemeImpl <em>Digest Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.security.impl.DigestSecuritySchemeImpl
		 * @see w3c_td.security.impl.SecurityPackageImpl#getDigestSecurityScheme()
		 * @generated
		 */
		EClass DIGEST_SECURITY_SCHEME = eINSTANCE.getDigestSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Qop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGEST_SECURITY_SCHEME__QOP = eINSTANCE.getDigestSecurityScheme_Qop();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGEST_SECURITY_SCHEME__IN = eINSTANCE.getDigestSecurityScheme_In();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGEST_SECURITY_SCHEME__NAME = eINSTANCE.getDigestSecurityScheme_Name();

		/**
		 * The meta object literal for the '{@link w3c_td.security.impl.APIKeySecuritySchemeImpl <em>API Key Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.security.impl.APIKeySecuritySchemeImpl
		 * @see w3c_td.security.impl.SecurityPackageImpl#getAPIKeySecurityScheme()
		 * @generated
		 */
		EClass API_KEY_SECURITY_SCHEME = eINSTANCE.getAPIKeySecurityScheme();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_KEY_SECURITY_SCHEME__IN = eINSTANCE.getAPIKeySecurityScheme_In();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_KEY_SECURITY_SCHEME__NAME = eINSTANCE.getAPIKeySecurityScheme_Name();

		/**
		 * The meta object literal for the '{@link w3c_td.security.impl.BearerSecuritySchemeImpl <em>Bearer Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.security.impl.BearerSecuritySchemeImpl
		 * @see w3c_td.security.impl.SecurityPackageImpl#getBearerSecurityScheme()
		 * @generated
		 */
		EClass BEARER_SECURITY_SCHEME = eINSTANCE.getBearerSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__AUTHORIZATION = eINSTANCE.getBearerSecurityScheme_Authorization();

		/**
		 * The meta object literal for the '<em><b>Alg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__ALG = eINSTANCE.getBearerSecurityScheme_Alg();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__FORMAT = eINSTANCE.getBearerSecurityScheme_Format();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__IN = eINSTANCE.getBearerSecurityScheme_In();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__NAME = eINSTANCE.getBearerSecurityScheme_Name();

		/**
		 * The meta object literal for the '{@link w3c_td.security.impl.CertSecuritySchemeImpl <em>Cert Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.security.impl.CertSecuritySchemeImpl
		 * @see w3c_td.security.impl.SecurityPackageImpl#getCertSecurityScheme()
		 * @generated
		 */
		EClass CERT_SECURITY_SCHEME = eINSTANCE.getCertSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERT_SECURITY_SCHEME__IDENTITY = eINSTANCE.getCertSecurityScheme_Identity();

		/**
		 * The meta object literal for the '{@link w3c_td.security.impl.PSKSecuritySchemeImpl <em>PSK Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.security.impl.PSKSecuritySchemeImpl
		 * @see w3c_td.security.impl.SecurityPackageImpl#getPSKSecurityScheme()
		 * @generated
		 */
		EClass PSK_SECURITY_SCHEME = eINSTANCE.getPSKSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSK_SECURITY_SCHEME__IDENTITY = eINSTANCE.getPSKSecurityScheme_Identity();

		/**
		 * The meta object literal for the '{@link w3c_td.security.impl.PublicSecuritySchemeImpl <em>Public Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.security.impl.PublicSecuritySchemeImpl
		 * @see w3c_td.security.impl.SecurityPackageImpl#getPublicSecurityScheme()
		 * @generated
		 */
		EClass PUBLIC_SECURITY_SCHEME = eINSTANCE.getPublicSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SECURITY_SCHEME__IDENTITY = eINSTANCE.getPublicSecurityScheme_Identity();

		/**
		 * The meta object literal for the '{@link w3c_td.security.impl.PoPSecuritySchemeImpl <em>Po PSecurity Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.security.impl.PoPSecuritySchemeImpl
		 * @see w3c_td.security.impl.SecurityPackageImpl#getPoPSecurityScheme()
		 * @generated
		 */
		EClass PO_PSECURITY_SCHEME = eINSTANCE.getPoPSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO_PSECURITY_SCHEME__AUTHORIZATION = eINSTANCE.getPoPSecurityScheme_Authorization();

		/**
		 * The meta object literal for the '<em><b>Alg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO_PSECURITY_SCHEME__ALG = eINSTANCE.getPoPSecurityScheme_Alg();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO_PSECURITY_SCHEME__FORMAT = eINSTANCE.getPoPSecurityScheme_Format();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO_PSECURITY_SCHEME__IN = eINSTANCE.getPoPSecurityScheme_In();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO_PSECURITY_SCHEME__NAME = eINSTANCE.getPoPSecurityScheme_Name();

		/**
		 * The meta object literal for the '{@link w3c_td.security.impl.OAuth2SecuritySchemeImpl <em>OAuth2 Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.security.impl.OAuth2SecuritySchemeImpl
		 * @see w3c_td.security.impl.SecurityPackageImpl#getOAuth2SecurityScheme()
		 * @generated
		 */
		EClass OAUTH2_SECURITY_SCHEME = eINSTANCE.getOAuth2SecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__AUTHORIZATION = eINSTANCE.getOAuth2SecurityScheme_Authorization();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__TOKEN = eINSTANCE.getOAuth2SecurityScheme_Token();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__REFRESH = eINSTANCE.getOAuth2SecurityScheme_Refresh();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__SCOPES = eINSTANCE.getOAuth2SecurityScheme_Scopes();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__FLOW = eINSTANCE.getOAuth2SecurityScheme_Flow();

	}

} //SecurityPackage
