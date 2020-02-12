/**
 */
package w3c_td.security.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import w3c_td.core.CorePackage;

import w3c_td.core.impl.CorePackageImpl;

import w3c_td.dataschema.DataschemaPackage;

import w3c_td.dataschema.impl.DataschemaPackageImpl;

import w3c_td.hypermediacontrols.HypermediacontrolsPackage;

import w3c_td.hypermediacontrols.impl.HypermediacontrolsPackageImpl;

import w3c_td.security.APIKeySecurityScheme;
import w3c_td.security.BasicSecurityScheme;
import w3c_td.security.BearerSecurityScheme;
import w3c_td.security.CertSecurityScheme;
import w3c_td.security.DigestSecurityScheme;
import w3c_td.security.NoSecurityScheme;
import w3c_td.security.OAuth2SecurityScheme;
import w3c_td.security.PSKSecurityScheme;
import w3c_td.security.PoPSecurityScheme;
import w3c_td.security.PublicSecurityScheme;
import w3c_td.security.SecurityFactory;
import w3c_td.security.SecurityPackage;
import w3c_td.security.SecurityScheme;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityPackageImpl extends EPackageImpl implements SecurityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securitySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digestSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiKeySecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bearerSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pskSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poPSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oAuth2SecuritySchemeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see w3c_td.security.SecurityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecurityPackageImpl() {
		super(eNS_URI, SecurityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SecurityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecurityPackage init() {
		if (isInited) return (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSecurityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SecurityPackageImpl theSecurityPackage = registeredSecurityPackage instanceof SecurityPackageImpl ? (SecurityPackageImpl)registeredSecurityPackage : new SecurityPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HypermediacontrolsPackage.eNS_URI);
		HypermediacontrolsPackageImpl theHypermediacontrolsPackage = (HypermediacontrolsPackageImpl)(registeredPackage instanceof HypermediacontrolsPackageImpl ? registeredPackage : HypermediacontrolsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataschemaPackage.eNS_URI);
		DataschemaPackageImpl theDataschemaPackage = (DataschemaPackageImpl)(registeredPackage instanceof DataschemaPackageImpl ? registeredPackage : DataschemaPackage.eINSTANCE);

		// Create package meta-data objects
		theSecurityPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theHypermediacontrolsPackage.createPackageContents();
		theDataschemaPackage.createPackageContents();

		// Initialize created meta-data
		theSecurityPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theHypermediacontrolsPackage.initializePackageContents();
		theDataschemaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecurityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecurityPackage.eNS_URI, theSecurityPackage);
		return theSecurityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityScheme() {
		return securitySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityScheme_SemanticType() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityScheme_Description() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityScheme_Proxy() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityScheme_Scheme() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityScheme_Descriptions() {
		return (EReference)securitySchemeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoSecurityScheme() {
		return noSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicSecurityScheme() {
		return basicSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicSecurityScheme_In() {
		return (EAttribute)basicSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicSecurityScheme_Name() {
		return (EAttribute)basicSecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigestSecurityScheme() {
		return digestSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigestSecurityScheme_Qop() {
		return (EAttribute)digestSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigestSecurityScheme_In() {
		return (EAttribute)digestSecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigestSecurityScheme_Name() {
		return (EAttribute)digestSecuritySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPIKeySecurityScheme() {
		return apiKeySecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIKeySecurityScheme_In() {
		return (EAttribute)apiKeySecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIKeySecurityScheme_Name() {
		return (EAttribute)apiKeySecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBearerSecurityScheme() {
		return bearerSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBearerSecurityScheme_Authorization() {
		return (EAttribute)bearerSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBearerSecurityScheme_Alg() {
		return (EAttribute)bearerSecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBearerSecurityScheme_Format() {
		return (EAttribute)bearerSecuritySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBearerSecurityScheme_In() {
		return (EAttribute)bearerSecuritySchemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBearerSecurityScheme_Name() {
		return (EAttribute)bearerSecuritySchemeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCertSecurityScheme() {
		return certSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertSecurityScheme_Identity() {
		return (EAttribute)certSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSKSecurityScheme() {
		return pskSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSKSecurityScheme_Identity() {
		return (EAttribute)pskSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicSecurityScheme() {
		return publicSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicSecurityScheme_Identity() {
		return (EAttribute)publicSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoPSecurityScheme() {
		return poPSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoPSecurityScheme_Authorization() {
		return (EAttribute)poPSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoPSecurityScheme_Alg() {
		return (EAttribute)poPSecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoPSecurityScheme_Format() {
		return (EAttribute)poPSecuritySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoPSecurityScheme_In() {
		return (EAttribute)poPSecuritySchemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoPSecurityScheme_Name() {
		return (EAttribute)poPSecuritySchemeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOAuth2SecurityScheme() {
		return oAuth2SecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuth2SecurityScheme_Authorization() {
		return (EAttribute)oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuth2SecurityScheme_Token() {
		return (EAttribute)oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuth2SecurityScheme_Refresh() {
		return (EAttribute)oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuth2SecurityScheme_Scopes() {
		return (EAttribute)oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuth2SecurityScheme_Flow() {
		return (EAttribute)oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityFactory getSecurityFactory() {
		return (SecurityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		securitySchemeEClass = createEClass(SECURITY_SCHEME);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__SEMANTIC_TYPE);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__DESCRIPTION);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__PROXY);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__SCHEME);
		createEReference(securitySchemeEClass, SECURITY_SCHEME__DESCRIPTIONS);

		noSecuritySchemeEClass = createEClass(NO_SECURITY_SCHEME);

		basicSecuritySchemeEClass = createEClass(BASIC_SECURITY_SCHEME);
		createEAttribute(basicSecuritySchemeEClass, BASIC_SECURITY_SCHEME__IN);
		createEAttribute(basicSecuritySchemeEClass, BASIC_SECURITY_SCHEME__NAME);

		digestSecuritySchemeEClass = createEClass(DIGEST_SECURITY_SCHEME);
		createEAttribute(digestSecuritySchemeEClass, DIGEST_SECURITY_SCHEME__QOP);
		createEAttribute(digestSecuritySchemeEClass, DIGEST_SECURITY_SCHEME__IN);
		createEAttribute(digestSecuritySchemeEClass, DIGEST_SECURITY_SCHEME__NAME);

		apiKeySecuritySchemeEClass = createEClass(API_KEY_SECURITY_SCHEME);
		createEAttribute(apiKeySecuritySchemeEClass, API_KEY_SECURITY_SCHEME__IN);
		createEAttribute(apiKeySecuritySchemeEClass, API_KEY_SECURITY_SCHEME__NAME);

		bearerSecuritySchemeEClass = createEClass(BEARER_SECURITY_SCHEME);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__AUTHORIZATION);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__ALG);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__FORMAT);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__IN);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__NAME);

		certSecuritySchemeEClass = createEClass(CERT_SECURITY_SCHEME);
		createEAttribute(certSecuritySchemeEClass, CERT_SECURITY_SCHEME__IDENTITY);

		pskSecuritySchemeEClass = createEClass(PSK_SECURITY_SCHEME);
		createEAttribute(pskSecuritySchemeEClass, PSK_SECURITY_SCHEME__IDENTITY);

		publicSecuritySchemeEClass = createEClass(PUBLIC_SECURITY_SCHEME);
		createEAttribute(publicSecuritySchemeEClass, PUBLIC_SECURITY_SCHEME__IDENTITY);

		poPSecuritySchemeEClass = createEClass(PO_PSECURITY_SCHEME);
		createEAttribute(poPSecuritySchemeEClass, PO_PSECURITY_SCHEME__AUTHORIZATION);
		createEAttribute(poPSecuritySchemeEClass, PO_PSECURITY_SCHEME__ALG);
		createEAttribute(poPSecuritySchemeEClass, PO_PSECURITY_SCHEME__FORMAT);
		createEAttribute(poPSecuritySchemeEClass, PO_PSECURITY_SCHEME__IN);
		createEAttribute(poPSecuritySchemeEClass, PO_PSECURITY_SCHEME__NAME);

		oAuth2SecuritySchemeEClass = createEClass(OAUTH2_SECURITY_SCHEME);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__AUTHORIZATION);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__TOKEN);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__REFRESH);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__SCOPES);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__FLOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		noSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		basicSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		digestSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		apiKeySecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		bearerSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		certSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		pskSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		publicSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		poPSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		oAuth2SecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());

		// Initialize classes, features, and operations; add parameters
		initEClass(securitySchemeEClass, SecurityScheme.class, "SecurityScheme", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityScheme_SemanticType(), ecorePackage.getEString(), "semanticType", null, 0, -1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScheme_Description(), ecorePackage.getEString(), "description", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScheme_Proxy(), theXMLTypePackage.getAnyURI(), "proxy", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScheme_Scheme(), ecorePackage.getEString(), "scheme", null, 1, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityScheme_Descriptions(), theCorePackage.getMultiLanguage(), null, "descriptions", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noSecuritySchemeEClass, NoSecurityScheme.class, "NoSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicSecuritySchemeEClass, BasicSecurityScheme.class, "BasicSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicSecurityScheme_In(), ecorePackage.getEString(), "in", null, 1, 1, BasicSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicSecurityScheme_Name(), ecorePackage.getEString(), "name", null, 1, 1, BasicSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digestSecuritySchemeEClass, DigestSecurityScheme.class, "DigestSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigestSecurityScheme_Qop(), ecorePackage.getEString(), "qop", null, 1, 1, DigestSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigestSecurityScheme_In(), ecorePackage.getEString(), "in", null, 1, 1, DigestSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigestSecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1, DigestSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiKeySecuritySchemeEClass, APIKeySecurityScheme.class, "APIKeySecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPIKeySecurityScheme_In(), ecorePackage.getEString(), "in", null, 1, 1, APIKeySecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPIKeySecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1, APIKeySecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bearerSecuritySchemeEClass, BearerSecurityScheme.class, "BearerSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBearerSecurityScheme_Authorization(), theXMLTypePackage.getAnyURI(), "authorization", null, 0, 1, BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearerSecurityScheme_Alg(), ecorePackage.getEString(), "alg", null, 1, 1, BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearerSecurityScheme_Format(), ecorePackage.getEString(), "format", null, 1, 1, BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearerSecurityScheme_In(), ecorePackage.getEString(), "in", null, 1, 1, BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearerSecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1, BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certSecuritySchemeEClass, CertSecurityScheme.class, "CertSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertSecurityScheme_Identity(), ecorePackage.getEString(), "identity", null, 0, 1, CertSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pskSecuritySchemeEClass, PSKSecurityScheme.class, "PSKSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPSKSecurityScheme_Identity(), ecorePackage.getEString(), "identity", null, 0, 1, PSKSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicSecuritySchemeEClass, PublicSecurityScheme.class, "PublicSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicSecurityScheme_Identity(), ecorePackage.getEString(), "identity", null, 0, 1, PublicSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poPSecuritySchemeEClass, PoPSecurityScheme.class, "PoPSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoPSecurityScheme_Authorization(), theXMLTypePackage.getAnyURI(), "authorization", null, 0, 1, PoPSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoPSecurityScheme_Alg(), ecorePackage.getEString(), "alg", null, 1, 1, PoPSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoPSecurityScheme_Format(), ecorePackage.getEString(), "format", null, 1, 1, PoPSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoPSecurityScheme_In(), theXMLTypePackage.getAnyURI(), "in", null, 1, 1, PoPSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoPSecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1, PoPSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oAuth2SecuritySchemeEClass, OAuth2SecurityScheme.class, "OAuth2SecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOAuth2SecurityScheme_Authorization(), theXMLTypePackage.getAnyURI(), "authorization", null, 0, 1, OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuth2SecurityScheme_Token(), theXMLTypePackage.getAnyURI(), "token", null, 0, 1, OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuth2SecurityScheme_Refresh(), theXMLTypePackage.getAnyURI(), "refresh", null, 0, 1, OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuth2SecurityScheme_Scopes(), theXMLTypePackage.getAnyURI(), "scopes", null, 0, 1, OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuth2SecurityScheme_Flow(), ecorePackage.getEString(), "flow", null, 1, 1, OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SecurityPackageImpl
