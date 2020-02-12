/**
 */
package thing_ui.interaction.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import thing_ui.actuation.ActuationPackage;

import thing_ui.actuation.impl.ActuationPackageImpl;

import thing_ui.core.CorePackage;

import thing_ui.core.impl.CorePackageImpl;

import thing_ui.interaction.BoolInputType;
import thing_ui.interaction.Form;
import thing_ui.interaction.Input;
import thing_ui.interaction.InputType;
import thing_ui.interaction.InteractionFactory;
import thing_ui.interaction.InteractionPackage;
import thing_ui.interaction.NumberInput;
import thing_ui.interaction.NumberInputType;
import thing_ui.interaction.ObjectInput;
import thing_ui.interaction.TextInput;
import thing_ui.interaction.TextInputType;
import thing_ui.interaction.boolInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionPackageImpl extends EPackageImpl implements InteractionPackage {
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
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inputTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textInputTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numberInputTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum boolInputTypeEEnum = null;

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
	 * @see thing_ui.interaction.InteractionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InteractionPackageImpl() {
		super(eNS_URI, InteractionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InteractionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InteractionPackage init() {
		if (isInited) return (InteractionPackage)EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInteractionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InteractionPackageImpl theInteractionPackage = registeredInteractionPackage instanceof InteractionPackageImpl ? (InteractionPackageImpl)registeredInteractionPackage : new InteractionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ActuationPackage.eNS_URI);
		ActuationPackageImpl theActuationPackage = (ActuationPackageImpl)(registeredPackage instanceof ActuationPackageImpl ? registeredPackage : ActuationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);

		// Create package meta-data objects
		theInteractionPackage.createPackageContents();
		theActuationPackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theInteractionPackage.initializePackageContents();
		theActuationPackage.initializePackageContents();
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInteractionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InteractionPackage.eNS_URI, theInteractionPackage);
		return theInteractionPackage;
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
	public EAttribute getForm_ReadOnly() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForm_ShowsSubmitButton() {
		return (EAttribute)formEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Inputs() {
		return (EReference)formEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForm_Actuator() {
		return (EReference)formEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Label() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Id() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_EditingValue() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_ThingValue() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Type() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_InteractionEnabled() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextInput() {
		return textInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInput_InputType() {
		return (EAttribute)textInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberInput() {
		return numberInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberInput_Minimum() {
		return (EAttribute)numberInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberInput_MinimumLabel() {
		return (EAttribute)numberInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberInput_Maximum() {
		return (EAttribute)numberInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberInput_MaximumLabel() {
		return (EAttribute)numberInputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberInput_InputType() {
		return (EAttribute)numberInputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectInput() {
		return objectInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectInput_Form() {
		return (EReference)objectInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getboolInput() {
		return boolInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getboolInput_InputType() {
		return (EAttribute)boolInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInputType() {
		return inputTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextInputType() {
		return textInputTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumberInputType() {
		return numberInputTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBoolInputType() {
		return boolInputTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFactory getInteractionFactory() {
		return (InteractionFactory)getEFactoryInstance();
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
		formEClass = createEClass(FORM);
		createEAttribute(formEClass, FORM__READ_ONLY);
		createEAttribute(formEClass, FORM__SHOWS_SUBMIT_BUTTON);
		createEReference(formEClass, FORM__INPUTS);
		createEReference(formEClass, FORM__ACTUATOR);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__LABEL);
		createEAttribute(inputEClass, INPUT__ID);
		createEAttribute(inputEClass, INPUT__EDITING_VALUE);
		createEAttribute(inputEClass, INPUT__THING_VALUE);
		createEAttribute(inputEClass, INPUT__TYPE);
		createEAttribute(inputEClass, INPUT__INTERACTION_ENABLED);

		textInputEClass = createEClass(TEXT_INPUT);
		createEAttribute(textInputEClass, TEXT_INPUT__INPUT_TYPE);

		numberInputEClass = createEClass(NUMBER_INPUT);
		createEAttribute(numberInputEClass, NUMBER_INPUT__MINIMUM);
		createEAttribute(numberInputEClass, NUMBER_INPUT__MINIMUM_LABEL);
		createEAttribute(numberInputEClass, NUMBER_INPUT__MAXIMUM);
		createEAttribute(numberInputEClass, NUMBER_INPUT__MAXIMUM_LABEL);
		createEAttribute(numberInputEClass, NUMBER_INPUT__INPUT_TYPE);

		objectInputEClass = createEClass(OBJECT_INPUT);
		createEReference(objectInputEClass, OBJECT_INPUT__FORM);

		boolInputEClass = createEClass(BOOL_INPUT);
		createEAttribute(boolInputEClass, BOOL_INPUT__INPUT_TYPE);

		// Create enums
		inputTypeEEnum = createEEnum(INPUT_TYPE);
		textInputTypeEEnum = createEEnum(TEXT_INPUT_TYPE);
		numberInputTypeEEnum = createEEnum(NUMBER_INPUT_TYPE);
		boolInputTypeEEnum = createEEnum(BOOL_INPUT_TYPE);
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
		ActuationPackage theActuationPackage = (ActuationPackage)EPackage.Registry.INSTANCE.getEPackage(ActuationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		textInputEClass.getESuperTypes().add(this.getInput());
		numberInputEClass.getESuperTypes().add(this.getInput());
		objectInputEClass.getESuperTypes().add(this.getInput());
		boolInputEClass.getESuperTypes().add(this.getInput());

		// Initialize classes, features, and operations; add parameters
		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForm_ReadOnly(), theXMLTypePackage.getBoolean(), "readOnly", null, 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForm_ShowsSubmitButton(), theXMLTypePackage.getBoolean(), "showsSubmitButton", "true", 0, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_Inputs(), this.getInput(), null, "inputs", null, 1, -1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForm_Actuator(), theActuationPackage.getActuator(), null, "actuator", null, 1, 1, Form.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_Label(), ecorePackage.getEString(), "label", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Id(), ecorePackage.getEString(), "id", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_EditingValue(), theXMLTypePackage.getAnySimpleType(), "editingValue", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_ThingValue(), theXMLTypePackage.getAnySimpleType(), "thingValue", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Type(), this.getInputType(), "type", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_InteractionEnabled(), theXMLTypePackage.getBoolean(), "interactionEnabled", "true", 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textInputEClass, TextInput.class, "TextInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextInput_InputType(), this.getTextInputType(), "inputType", null, 1, 1, TextInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberInputEClass, NumberInput.class, "NumberInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberInput_Minimum(), theXMLTypePackage.getDouble(), "minimum", null, 0, 1, NumberInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberInput_MinimumLabel(), ecorePackage.getEString(), "minimumLabel", "min", 0, 1, NumberInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberInput_Maximum(), theXMLTypePackage.getDouble(), "maximum", null, 0, 1, NumberInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberInput_MaximumLabel(), ecorePackage.getEString(), "maximumLabel", "max", 0, 1, NumberInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberInput_InputType(), this.getNumberInputType(), "inputType", "keyboard", 1, 1, NumberInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectInputEClass, ObjectInput.class, "ObjectInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectInput_Form(), this.getForm(), null, "form", null, 1, 1, ObjectInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolInputEClass, boolInput.class, "boolInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getboolInput_InputType(), this.getBoolInputType(), "inputType", null, 1, 1, boolInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(inputTypeEEnum, InputType.class, "InputType");
		addEEnumLiteral(inputTypeEEnum, InputType.TEXT);
		addEEnumLiteral(inputTypeEEnum, InputType.NUMBER);
		addEEnumLiteral(inputTypeEEnum, InputType.BOOL);
		addEEnumLiteral(inputTypeEEnum, InputType.OBJECT);

		initEEnum(textInputTypeEEnum, TextInputType.class, "TextInputType");
		addEEnumLiteral(textInputTypeEEnum, TextInputType.PLAIN);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.EMAIL);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.MULTILINE);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.PHONE);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.DATETIME);

		initEEnum(numberInputTypeEEnum, NumberInputType.class, "NumberInputType");
		addEEnumLiteral(numberInputTypeEEnum, NumberInputType.DIAL);
		addEEnumLiteral(numberInputTypeEEnum, NumberInputType.SLIDER);
		addEEnumLiteral(numberInputTypeEEnum, NumberInputType.KEYBOARD);
		addEEnumLiteral(numberInputTypeEEnum, NumberInputType.STEPPER);

		initEEnum(boolInputTypeEEnum, BoolInputType.class, "BoolInputType");
		addEEnumLiteral(boolInputTypeEEnum, BoolInputType.SWITCH);
		addEEnumLiteral(boolInputTypeEEnum, BoolInputType.CHECKBOX);
		addEEnumLiteral(boolInputTypeEEnum, BoolInputType.BUTTON);

		// Create resource
		createResource(eNS_URI);
	}

} //InteractionPackageImpl
