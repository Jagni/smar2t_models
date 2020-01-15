/**
 */
package smar2t.td.w3c.hypermediacontrols.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import smar2t.td.w3c.dataschema.DataschemaPackage;

import smar2t.td.w3c.dataschema.impl.DataschemaPackageImpl;

import smar2t.td.w3c.hypermediacontrols.ExpectedResponse;
import smar2t.td.w3c.hypermediacontrols.Form;
import smar2t.td.w3c.hypermediacontrols.HypermediacontrolsFactory;
import smar2t.td.w3c.hypermediacontrols.HypermediacontrolsPackage;
import smar2t.td.w3c.hypermediacontrols.Link;

import smar2t.td.w3c.security.SecurityPackage;

import smar2t.td.w3c.security.impl.SecurityPackageImpl;

import smar2t.ui.actuation.ActuationPackage;

import smar2t.ui.actuation.impl.ActuationPackageImpl;

import smar2t.ui.core.CorePackage;

import smar2t.ui.core.impl.CorePackageImpl;

import smar2t.ui.interaction.InteractionPackage;

import smar2t.ui.interaction.impl.InteractionPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HypermediacontrolsPackageImpl extends EPackageImpl implements HypermediacontrolsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedResponseEClass = null;

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
	 * @see smar2t.td.w3c.hypermediacontrols.HypermediacontrolsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HypermediacontrolsPackageImpl() {
		super(eNS_URI, HypermediacontrolsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HypermediacontrolsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HypermediacontrolsPackage init() {
		if (isInited) return (HypermediacontrolsPackage)EPackage.Registry.INSTANCE.getEPackage(HypermediacontrolsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHypermediacontrolsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HypermediacontrolsPackageImpl theHypermediacontrolsPackage = registeredHypermediacontrolsPackage instanceof HypermediacontrolsPackageImpl ? (HypermediacontrolsPackageImpl)registeredHypermediacontrolsPackage : new HypermediacontrolsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ActuationPackage.eNS_URI);
		ActuationPackageImpl theActuationPackage = (ActuationPackageImpl)(registeredPackage instanceof ActuationPackageImpl ? registeredPackage : ActuationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(registeredPackage instanceof InteractionPackageImpl ? registeredPackage : InteractionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(smar2t.td.mozilla.core.CorePackage.eNS_URI);
		smar2t.td.mozilla.core.impl.CorePackageImpl theCorePackage_1 = (smar2t.td.mozilla.core.impl.CorePackageImpl)(registeredPackage instanceof smar2t.td.mozilla.core.impl.CorePackageImpl ? registeredPackage : smar2t.td.mozilla.core.CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(smar2t.td.w3c.core.CorePackage.eNS_URI);
		smar2t.td.w3c.core.impl.CorePackageImpl theCorePackage_2 = (smar2t.td.w3c.core.impl.CorePackageImpl)(registeredPackage instanceof smar2t.td.w3c.core.impl.CorePackageImpl ? registeredPackage : smar2t.td.w3c.core.CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataschemaPackage.eNS_URI);
		DataschemaPackageImpl theDataschemaPackage = (DataschemaPackageImpl)(registeredPackage instanceof DataschemaPackageImpl ? registeredPackage : DataschemaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(registeredPackage instanceof SecurityPackageImpl ? registeredPackage : SecurityPackage.eINSTANCE);

		// Create package meta-data objects
		theHypermediacontrolsPackage.createPackageContents();
		theActuationPackage.createPackageContents();
		theInteractionPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theCorePackage_1.createPackageContents();
		theCorePackage_2.createPackageContents();
		theDataschemaPackage.createPackageContents();
		theSecurityPackage.createPackageContents();

		// Initialize created meta-data
		theHypermediacontrolsPackage.initializePackageContents();
		theActuationPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theCorePackage_1.initializePackageContents();
		theCorePackage_2.initializePackageContents();
		theDataschemaPackage.initializePackageContents();
		theSecurityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHypermediacontrolsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HypermediacontrolsPackage.eNS_URI, theHypermediacontrolsPackage);
		return theHypermediacontrolsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Href() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Type() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Rel() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Anchor() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Op() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Href() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_ContentType() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_ContentCoding() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Subprotocol() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Security() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_Scopes() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Response() {
		return (EReference)formEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpectedResponse() {
		return expectedResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpectedResponse_ContentType() {
		return (EAttribute)expectedResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypermediacontrolsFactory getHypermediacontrolsFactory() {
		return (HypermediacontrolsFactory)getEFactoryInstance();
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
		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__HREF);
		createEAttribute(linkEClass, LINK__TYPE);
		createEAttribute(linkEClass, LINK__REL);
		createEAttribute(linkEClass, LINK__ANCHOR);

		formEClass = createEClass(FORM);
		createEAttribute(formEClass, FORM__OP);
		createEAttribute(formEClass, FORM__HREF);
		createEAttribute(formEClass, FORM__CONTENT_TYPE);
		createEAttribute(formEClass, FORM__CONTENT_CODING);
		createEAttribute(formEClass, FORM__SUBPROTOCOL);
		createEAttribute(formEClass, FORM__SECURITY);
		createEAttribute(formEClass, FORM__SCOPES);
		createEReference(formEClass, FORM__RESPONSE);

		expectedResponseEClass = createEClass(EXPECTED_RESPONSE);
		createEAttribute(expectedResponseEClass, EXPECTED_RESPONSE__CONTENT_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Href(), ecorePackage.getEString(), "href", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Type(), ecorePackage.getEString(), "type", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Rel(), ecorePackage.getEString(), "rel", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Anchor(), ecorePackage.getEString(), "anchor", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForm_Op(), ecorePackage.getEString(), "op", "[\"readProperty\", \"writeProperty\"]", 1, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Href(), ecorePackage.getEString(), "href", null, 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_ContentType(), ecorePackage.getEString(), "contentType", "application/json", 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_ContentCoding(), ecorePackage.getEString(), "contentCoding", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Subprotocol(), ecorePackage.getEString(), "subprotocol", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Security(), ecorePackage.getEString(), "security", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_Scopes(), ecorePackage.getEString(), "scopes", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_Response(), this.getExpectedResponse(), null, "response", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expectedResponseEClass, ExpectedResponse.class, "ExpectedResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpectedResponse_ContentType(), ecorePackage.getEString(), "contentType", null, 0, 1, ExpectedResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HypermediacontrolsPackageImpl
