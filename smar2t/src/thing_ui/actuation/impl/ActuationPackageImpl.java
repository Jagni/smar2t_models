/**
 */
package thing_ui.actuation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import thing_ui.actuation.ActuationFactory;
import thing_ui.actuation.ActuationPackage;
import thing_ui.actuation.Actuator;
import thing_ui.actuation.CommunicationProtocol;
import thing_ui.actuation.SecurityScheme;

import thing_ui.core.CorePackage;

import thing_ui.core.impl.CorePackageImpl;

import thing_ui.interaction.InteractionPackage;

import thing_ui.interaction.impl.InteractionPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActuationPackageImpl extends EPackageImpl implements ActuationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationProtocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securitySchemeEEnum = null;

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
	 * @see thing_ui.actuation.ActuationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActuationPackageImpl() {
		super(eNS_URI, ActuationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActuationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActuationPackage init() {
		if (isInited) return (ActuationPackage)EPackage.Registry.INSTANCE.getEPackage(ActuationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredActuationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ActuationPackageImpl theActuationPackage = registeredActuationPackage instanceof ActuationPackageImpl ? (ActuationPackageImpl)registeredActuationPackage : new ActuationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(registeredPackage instanceof InteractionPackageImpl ? registeredPackage : InteractionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);

		// Create package meta-data objects
		theActuationPackage.createPackageContents();
		theInteractionPackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theActuationPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActuationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActuationPackage.eNS_URI, theActuationPackage);
		return theActuationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_Href() {
		return (EAttribute)actuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_CommunicationProtocol() {
		return (EAttribute)actuatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_SecurityScheme() {
		return (EAttribute)actuatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommunicationProtocol() {
		return communicationProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSecurityScheme() {
		return securitySchemeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuationFactory getActuationFactory() {
		return (ActuationFactory)getEFactoryInstance();
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
		actuatorEClass = createEClass(ACTUATOR);
		createEAttribute(actuatorEClass, ACTUATOR__HREF);
		createEAttribute(actuatorEClass, ACTUATOR__COMMUNICATION_PROTOCOL);
		createEAttribute(actuatorEClass, ACTUATOR__SECURITY_SCHEME);

		// Create enums
		communicationProtocolEEnum = createEEnum(COMMUNICATION_PROTOCOL);
		securitySchemeEEnum = createEEnum(SECURITY_SCHEME);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuator_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActuator_CommunicationProtocol(), this.getCommunicationProtocol(), "communicationProtocol", null, 1, 1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActuator_SecurityScheme(), this.getSecurityScheme(), "securityScheme", null, 1, 1, Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(communicationProtocolEEnum, CommunicationProtocol.class, "CommunicationProtocol");
		addEEnumLiteral(communicationProtocolEEnum, CommunicationProtocol.HTTP);
		addEEnumLiteral(communicationProtocolEEnum, CommunicationProtocol.MQTT);
		addEEnumLiteral(communicationProtocolEEnum, CommunicationProtocol.COAP);

		initEEnum(securitySchemeEEnum, SecurityScheme.class, "SecurityScheme");
		addEEnumLiteral(securitySchemeEEnum, SecurityScheme.NONE);
		addEEnumLiteral(securitySchemeEEnum, SecurityScheme.OAUTH2);

		// Create resource
		createResource(eNS_URI);
	}

} //ActuationPackageImpl
