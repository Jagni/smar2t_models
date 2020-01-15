/**
 */
package smar2t.td.w3c.dataschema.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import smar2t.td.w3c.dataschema.ArraySchema;
import smar2t.td.w3c.dataschema.BooleanSchema;
import smar2t.td.w3c.dataschema.DataSchema;
import smar2t.td.w3c.dataschema.DataschemaFactory;
import smar2t.td.w3c.dataschema.DataschemaPackage;
import smar2t.td.w3c.dataschema.IntegerSchema;
import smar2t.td.w3c.dataschema.NewEnum1;
import smar2t.td.w3c.dataschema.NullSchema;
import smar2t.td.w3c.dataschema.NumberSchema;
import smar2t.td.w3c.dataschema.ObjectSchema;
import smar2t.td.w3c.dataschema.StringSchema;

import smar2t.td.w3c.hypermediacontrols.HypermediacontrolsPackage;

import smar2t.td.w3c.hypermediacontrols.impl.HypermediacontrolsPackageImpl;

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
public class DataschemaPackageImpl extends EPackageImpl implements DataschemaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arraySchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum newEnum1EEnum = null;

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
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataschemaPackageImpl() {
		super(eNS_URI, DataschemaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataschemaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataschemaPackage init() {
		if (isInited) return (DataschemaPackage)EPackage.Registry.INSTANCE.getEPackage(DataschemaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataschemaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataschemaPackageImpl theDataschemaPackage = registeredDataschemaPackage instanceof DataschemaPackageImpl ? (DataschemaPackageImpl)registeredDataschemaPackage : new DataschemaPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HypermediacontrolsPackage.eNS_URI);
		HypermediacontrolsPackageImpl theHypermediacontrolsPackage = (HypermediacontrolsPackageImpl)(registeredPackage instanceof HypermediacontrolsPackageImpl ? registeredPackage : HypermediacontrolsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(registeredPackage instanceof SecurityPackageImpl ? registeredPackage : SecurityPackage.eINSTANCE);

		// Create package meta-data objects
		theDataschemaPackage.createPackageContents();
		theActuationPackage.createPackageContents();
		theInteractionPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theCorePackage_1.createPackageContents();
		theCorePackage_2.createPackageContents();
		theHypermediacontrolsPackage.createPackageContents();
		theSecurityPackage.createPackageContents();

		// Initialize created meta-data
		theDataschemaPackage.initializePackageContents();
		theActuationPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theCorePackage_1.initializePackageContents();
		theCorePackage_2.initializePackageContents();
		theHypermediacontrolsPackage.initializePackageContents();
		theSecurityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataschemaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataschemaPackage.eNS_URI, theDataschemaPackage);
		return theDataschemaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSchema() {
		return dataSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSchema_SemanticType() {
		return (EAttribute)dataSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSchema_Title() {
		return (EAttribute)dataSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSchema_Description() {
		return (EAttribute)dataSchemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSchema_Type() {
		return (EAttribute)dataSchemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSchema_Unit() {
		return (EAttribute)dataSchemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSchema_Enum() {
		return (EAttribute)dataSchemaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSchema_OneOf() {
		return (EReference)dataSchemaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSchema_Titles() {
		return (EReference)dataSchemaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSchema_Descriptions() {
		return (EReference)dataSchemaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSchema_Const() {
		return (EAttribute)dataSchemaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSchema_ReadOnly() {
		return (EAttribute)dataSchemaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSchema_WriteOnly() {
		return (EAttribute)dataSchemaEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSchema_Format() {
		return (EAttribute)dataSchemaEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArraySchema() {
		return arraySchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArraySchema_MinItems() {
		return (EAttribute)arraySchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArraySchema_MaxItems() {
		return (EAttribute)arraySchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArraySchema_Items() {
		return (EReference)arraySchemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectSchema() {
		return objectSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectSchema_Required() {
		return (EAttribute)objectSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectSchema_Properties() {
		return (EReference)objectSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringSchema() {
		return stringSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanSchema() {
		return booleanSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberSchema() {
		return numberSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberSchema_Minimum() {
		return (EAttribute)numberSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberSchema_Maximum() {
		return (EAttribute)numberSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerSchema() {
		return integerSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerSchema_Minimum() {
		return (EAttribute)integerSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerSchema_Maximum() {
		return (EAttribute)integerSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullSchema() {
		return nullSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNewEnum1() {
		return newEnum1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataschemaFactory getDataschemaFactory() {
		return (DataschemaFactory)getEFactoryInstance();
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
		dataSchemaEClass = createEClass(DATA_SCHEMA);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__SEMANTIC_TYPE);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__TITLE);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__DESCRIPTION);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__TYPE);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__UNIT);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__ENUM);
		createEReference(dataSchemaEClass, DATA_SCHEMA__ONE_OF);
		createEReference(dataSchemaEClass, DATA_SCHEMA__TITLES);
		createEReference(dataSchemaEClass, DATA_SCHEMA__DESCRIPTIONS);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__CONST);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__READ_ONLY);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__WRITE_ONLY);
		createEAttribute(dataSchemaEClass, DATA_SCHEMA__FORMAT);

		arraySchemaEClass = createEClass(ARRAY_SCHEMA);
		createEAttribute(arraySchemaEClass, ARRAY_SCHEMA__MIN_ITEMS);
		createEAttribute(arraySchemaEClass, ARRAY_SCHEMA__MAX_ITEMS);
		createEReference(arraySchemaEClass, ARRAY_SCHEMA__ITEMS);

		objectSchemaEClass = createEClass(OBJECT_SCHEMA);
		createEAttribute(objectSchemaEClass, OBJECT_SCHEMA__REQUIRED);
		createEReference(objectSchemaEClass, OBJECT_SCHEMA__PROPERTIES);

		stringSchemaEClass = createEClass(STRING_SCHEMA);

		booleanSchemaEClass = createEClass(BOOLEAN_SCHEMA);

		numberSchemaEClass = createEClass(NUMBER_SCHEMA);
		createEAttribute(numberSchemaEClass, NUMBER_SCHEMA__MINIMUM);
		createEAttribute(numberSchemaEClass, NUMBER_SCHEMA__MAXIMUM);

		integerSchemaEClass = createEClass(INTEGER_SCHEMA);
		createEAttribute(integerSchemaEClass, INTEGER_SCHEMA__MINIMUM);
		createEAttribute(integerSchemaEClass, INTEGER_SCHEMA__MAXIMUM);

		nullSchemaEClass = createEClass(NULL_SCHEMA);

		// Create enums
		newEnum1EEnum = createEEnum(NEW_ENUM1);
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
		smar2t.td.w3c.core.CorePackage theCorePackage_2 = (smar2t.td.w3c.core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(smar2t.td.w3c.core.CorePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		arraySchemaEClass.getESuperTypes().add(this.getDataSchema());
		objectSchemaEClass.getESuperTypes().add(this.getDataSchema());
		stringSchemaEClass.getESuperTypes().add(this.getDataSchema());
		booleanSchemaEClass.getESuperTypes().add(this.getDataSchema());
		numberSchemaEClass.getESuperTypes().add(this.getDataSchema());
		integerSchemaEClass.getESuperTypes().add(this.getDataSchema());
		nullSchemaEClass.getESuperTypes().add(this.getDataSchema());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataSchemaEClass, DataSchema.class, "DataSchema", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSchema_SemanticType(), ecorePackage.getEString(), "semanticType", null, 0, -1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Title(), ecorePackage.getEString(), "title", null, 0, 1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Description(), ecorePackage.getEString(), "description", null, 0, 1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Type(), ecorePackage.getEString(), "type", null, 1, 1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Enum(), ecorePackage.getEString(), "enum", null, 0, 1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSchema_OneOf(), this.getDataSchema(), null, "oneOf", null, 0, -1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSchema_Titles(), theCorePackage_2.getMultiLanguage(), null, "titles", null, 0, -1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSchema_Descriptions(), theCorePackage_2.getMultiLanguage(), null, "descriptions", null, 0, -1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Const(), theXMLTypePackage.getAnySimpleType(), "const", null, 0, 1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", "false", 1, 1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_WriteOnly(), ecorePackage.getEBoolean(), "writeOnly", "false", 1, 1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Format(), ecorePackage.getEString(), "format", null, 0, 1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arraySchemaEClass, ArraySchema.class, "ArraySchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArraySchema_MinItems(), theXMLTypePackage.getUnsignedInt(), "minItems", null, 0, 1, ArraySchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArraySchema_MaxItems(), theXMLTypePackage.getUnsignedInt(), "maxItems", null, 0, 1, ArraySchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArraySchema_Items(), this.getDataSchema(), null, "items", null, 0, -1, ArraySchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectSchemaEClass, ObjectSchema.class, "ObjectSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectSchema_Required(), ecorePackage.getEString(), "required", null, 0, 1, ObjectSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectSchema_Properties(), this.getDataSchema(), null, "properties", null, 0, -1, ObjectSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringSchemaEClass, StringSchema.class, "StringSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanSchemaEClass, BooleanSchema.class, "BooleanSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberSchemaEClass, NumberSchema.class, "NumberSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberSchema_Minimum(), theXMLTypePackage.getDouble(), "minimum", null, 0, 1, NumberSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberSchema_Maximum(), theXMLTypePackage.getDouble(), "maximum", null, 0, 1, NumberSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerSchemaEClass, IntegerSchema.class, "IntegerSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerSchema_Minimum(), theXMLTypePackage.getInt(), "minimum", null, 0, 1, IntegerSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerSchema_Maximum(), theXMLTypePackage.getInt(), "maximum", null, 0, 1, IntegerSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullSchemaEClass, NullSchema.class, "NullSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(newEnum1EEnum, NewEnum1.class, "NewEnum1");

		// Create resource
		createResource(eNS_URI);
	}

} //DataschemaPackageImpl
