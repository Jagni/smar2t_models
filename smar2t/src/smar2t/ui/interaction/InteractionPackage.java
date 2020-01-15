/**
 */
package smar2t.ui.interaction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see smar2t.ui.interaction.InteractionFactory
 * @model kind="package"
 * @generated
 */
public interface InteractionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interaction";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.smar2t.ui.interaction";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UIInteraction";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractionPackage eINSTANCE = smar2t.ui.interaction.impl.InteractionPackageImpl.init();

	/**
	 * The meta object id for the '{@link smar2t.ui.interaction.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smar2t.ui.interaction.impl.FormImpl
	 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__READ_ONLY = 0;

	/**
	 * The feature id for the '<em><b>Shows Submit Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SHOWS_SUBMIT_BUTTON = 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__INPUTS = 2;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ACTUATOR = 3;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smar2t.ui.interaction.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smar2t.ui.interaction.impl.InputImpl
	 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = 1;

	/**
	 * The feature id for the '<em><b>Editing Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__EDITING_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Thing Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__THING_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Interaction Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INTERACTION_ENABLED = 5;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smar2t.ui.interaction.impl.TextInputImpl <em>Text Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smar2t.ui.interaction.impl.TextInputImpl
	 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getTextInput()
	 * @generated
	 */
	int TEXT_INPUT = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__LABEL = INPUT__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__ID = INPUT__ID;

	/**
	 * The feature id for the '<em><b>Editing Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__EDITING_VALUE = INPUT__EDITING_VALUE;

	/**
	 * The feature id for the '<em><b>Thing Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__THING_VALUE = INPUT__THING_VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__TYPE = INPUT__TYPE;

	/**
	 * The feature id for the '<em><b>Interaction Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__INTERACTION_ENABLED = INPUT__INTERACTION_ENABLED;

	/**
	 * The feature id for the '<em><b>Input Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__INPUT_TYPE = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smar2t.ui.interaction.impl.NumberInputImpl <em>Number Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smar2t.ui.interaction.impl.NumberInputImpl
	 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getNumberInput()
	 * @generated
	 */
	int NUMBER_INPUT = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INPUT__LABEL = INPUT__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INPUT__ID = INPUT__ID;

	/**
	 * The feature id for the '<em><b>Editing Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INPUT__EDITING_VALUE = INPUT__EDITING_VALUE;

	/**
	 * The feature id for the '<em><b>Thing Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INPUT__THING_VALUE = INPUT__THING_VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INPUT__TYPE = INPUT__TYPE;

	/**
	 * The feature id for the '<em><b>Interaction Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INPUT__INTERACTION_ENABLED = INPUT__INTERACTION_ENABLED;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INPUT__MINIMUM = INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minimum Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INPUT__MINIMUM_LABEL = INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INPUT__MAXIMUM = INPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maximum Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INPUT__MAXIMUM_LABEL = INPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INPUT__INPUT_TYPE = INPUT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Number Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INPUT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Number Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_INPUT_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smar2t.ui.interaction.impl.ObjectInputImpl <em>Object Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smar2t.ui.interaction.impl.ObjectInputImpl
	 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getObjectInput()
	 * @generated
	 */
	int OBJECT_INPUT = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INPUT__LABEL = INPUT__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INPUT__ID = INPUT__ID;

	/**
	 * The feature id for the '<em><b>Editing Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INPUT__EDITING_VALUE = INPUT__EDITING_VALUE;

	/**
	 * The feature id for the '<em><b>Thing Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INPUT__THING_VALUE = INPUT__THING_VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INPUT__TYPE = INPUT__TYPE;

	/**
	 * The feature id for the '<em><b>Interaction Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INPUT__INTERACTION_ENABLED = INPUT__INTERACTION_ENABLED;

	/**
	 * The feature id for the '<em><b>Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INPUT__FORM = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INPUT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_INPUT_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smar2t.ui.interaction.impl.boolInputImpl <em>bool Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smar2t.ui.interaction.impl.boolInputImpl
	 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getboolInput()
	 * @generated
	 */
	int BOOL_INPUT = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_INPUT__LABEL = INPUT__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_INPUT__ID = INPUT__ID;

	/**
	 * The feature id for the '<em><b>Editing Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_INPUT__EDITING_VALUE = INPUT__EDITING_VALUE;

	/**
	 * The feature id for the '<em><b>Thing Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_INPUT__THING_VALUE = INPUT__THING_VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_INPUT__TYPE = INPUT__TYPE;

	/**
	 * The feature id for the '<em><b>Interaction Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_INPUT__INTERACTION_ENABLED = INPUT__INTERACTION_ENABLED;

	/**
	 * The feature id for the '<em><b>Input Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_INPUT__INPUT_TYPE = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>bool Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_INPUT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>bool Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_INPUT_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smar2t.ui.interaction.InputType <em>Input Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smar2t.ui.interaction.InputType
	 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getInputType()
	 * @generated
	 */
	int INPUT_TYPE = 6;

	/**
	 * The meta object id for the '{@link smar2t.ui.interaction.TextInputType <em>Text Input Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smar2t.ui.interaction.TextInputType
	 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getTextInputType()
	 * @generated
	 */
	int TEXT_INPUT_TYPE = 7;

	/**
	 * The meta object id for the '{@link smar2t.ui.interaction.NumberInputType <em>Number Input Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smar2t.ui.interaction.NumberInputType
	 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getNumberInputType()
	 * @generated
	 */
	int NUMBER_INPUT_TYPE = 8;

	/**
	 * The meta object id for the '{@link smar2t.ui.interaction.BoolInputType <em>Bool Input Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smar2t.ui.interaction.BoolInputType
	 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getBoolInputType()
	 * @generated
	 */
	int BOOL_INPUT_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link smar2t.ui.interaction.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see smar2t.ui.interaction.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.ui.interaction.Form#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see smar2t.ui.interaction.Form#isReadOnly()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.ui.interaction.Form#isShowsSubmitButton <em>Shows Submit Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shows Submit Button</em>'.
	 * @see smar2t.ui.interaction.Form#isShowsSubmitButton()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_ShowsSubmitButton();

	/**
	 * Returns the meta object for the reference list '{@link smar2t.ui.interaction.Form#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see smar2t.ui.interaction.Form#getInputs()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Inputs();

	/**
	 * Returns the meta object for the reference '{@link smar2t.ui.interaction.Form#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator</em>'.
	 * @see smar2t.ui.interaction.Form#getActuator()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Actuator();

	/**
	 * Returns the meta object for class '{@link smar2t.ui.interaction.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see smar2t.ui.interaction.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.ui.interaction.Input#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see smar2t.ui.interaction.Input#getLabel()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Label();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.ui.interaction.Input#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see smar2t.ui.interaction.Input#getId()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Id();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.ui.interaction.Input#getEditingValue <em>Editing Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editing Value</em>'.
	 * @see smar2t.ui.interaction.Input#getEditingValue()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_EditingValue();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.ui.interaction.Input#getThingValue <em>Thing Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thing Value</em>'.
	 * @see smar2t.ui.interaction.Input#getThingValue()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_ThingValue();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.ui.interaction.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see smar2t.ui.interaction.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Type();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.ui.interaction.Input#isInteractionEnabled <em>Interaction Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interaction Enabled</em>'.
	 * @see smar2t.ui.interaction.Input#isInteractionEnabled()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_InteractionEnabled();

	/**
	 * Returns the meta object for class '{@link smar2t.ui.interaction.TextInput <em>Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input</em>'.
	 * @see smar2t.ui.interaction.TextInput
	 * @generated
	 */
	EClass getTextInput();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.ui.interaction.TextInput#getInputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Type</em>'.
	 * @see smar2t.ui.interaction.TextInput#getInputType()
	 * @see #getTextInput()
	 * @generated
	 */
	EAttribute getTextInput_InputType();

	/**
	 * Returns the meta object for class '{@link smar2t.ui.interaction.NumberInput <em>Number Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Input</em>'.
	 * @see smar2t.ui.interaction.NumberInput
	 * @generated
	 */
	EClass getNumberInput();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.ui.interaction.NumberInput#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see smar2t.ui.interaction.NumberInput#getMinimum()
	 * @see #getNumberInput()
	 * @generated
	 */
	EAttribute getNumberInput_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.ui.interaction.NumberInput#getMinimumLabel <em>Minimum Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Label</em>'.
	 * @see smar2t.ui.interaction.NumberInput#getMinimumLabel()
	 * @see #getNumberInput()
	 * @generated
	 */
	EAttribute getNumberInput_MinimumLabel();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.ui.interaction.NumberInput#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see smar2t.ui.interaction.NumberInput#getMaximum()
	 * @see #getNumberInput()
	 * @generated
	 */
	EAttribute getNumberInput_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.ui.interaction.NumberInput#getMaximumLabel <em>Maximum Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Label</em>'.
	 * @see smar2t.ui.interaction.NumberInput#getMaximumLabel()
	 * @see #getNumberInput()
	 * @generated
	 */
	EAttribute getNumberInput_MaximumLabel();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.ui.interaction.NumberInput#getInputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Type</em>'.
	 * @see smar2t.ui.interaction.NumberInput#getInputType()
	 * @see #getNumberInput()
	 * @generated
	 */
	EAttribute getNumberInput_InputType();

	/**
	 * Returns the meta object for class '{@link smar2t.ui.interaction.ObjectInput <em>Object Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Input</em>'.
	 * @see smar2t.ui.interaction.ObjectInput
	 * @generated
	 */
	EClass getObjectInput();

	/**
	 * Returns the meta object for the reference '{@link smar2t.ui.interaction.ObjectInput#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Form</em>'.
	 * @see smar2t.ui.interaction.ObjectInput#getForm()
	 * @see #getObjectInput()
	 * @generated
	 */
	EReference getObjectInput_Form();

	/**
	 * Returns the meta object for class '{@link smar2t.ui.interaction.boolInput <em>bool Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>bool Input</em>'.
	 * @see smar2t.ui.interaction.boolInput
	 * @generated
	 */
	EClass getboolInput();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.ui.interaction.boolInput#getInputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Type</em>'.
	 * @see smar2t.ui.interaction.boolInput#getInputType()
	 * @see #getboolInput()
	 * @generated
	 */
	EAttribute getboolInput_InputType();

	/**
	 * Returns the meta object for enum '{@link smar2t.ui.interaction.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Input Type</em>'.
	 * @see smar2t.ui.interaction.InputType
	 * @generated
	 */
	EEnum getInputType();

	/**
	 * Returns the meta object for enum '{@link smar2t.ui.interaction.TextInputType <em>Text Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Input Type</em>'.
	 * @see smar2t.ui.interaction.TextInputType
	 * @generated
	 */
	EEnum getTextInputType();

	/**
	 * Returns the meta object for enum '{@link smar2t.ui.interaction.NumberInputType <em>Number Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Input Type</em>'.
	 * @see smar2t.ui.interaction.NumberInputType
	 * @generated
	 */
	EEnum getNumberInputType();

	/**
	 * Returns the meta object for enum '{@link smar2t.ui.interaction.BoolInputType <em>Bool Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bool Input Type</em>'.
	 * @see smar2t.ui.interaction.BoolInputType
	 * @generated
	 */
	EEnum getBoolInputType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InteractionFactory getInteractionFactory();

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
		 * The meta object literal for the '{@link smar2t.ui.interaction.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smar2t.ui.interaction.impl.FormImpl
		 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__READ_ONLY = eINSTANCE.getForm_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Shows Submit Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__SHOWS_SUBMIT_BUTTON = eINSTANCE.getForm_ShowsSubmitButton();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__INPUTS = eINSTANCE.getForm_Inputs();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__ACTUATOR = eINSTANCE.getForm_Actuator();

		/**
		 * The meta object literal for the '{@link smar2t.ui.interaction.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smar2t.ui.interaction.impl.InputImpl
		 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__LABEL = eINSTANCE.getInput_Label();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__ID = eINSTANCE.getInput_Id();

		/**
		 * The meta object literal for the '<em><b>Editing Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__EDITING_VALUE = eINSTANCE.getInput_EditingValue();

		/**
		 * The meta object literal for the '<em><b>Thing Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__THING_VALUE = eINSTANCE.getInput_ThingValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__TYPE = eINSTANCE.getInput_Type();

		/**
		 * The meta object literal for the '<em><b>Interaction Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__INTERACTION_ENABLED = eINSTANCE.getInput_InteractionEnabled();

		/**
		 * The meta object literal for the '{@link smar2t.ui.interaction.impl.TextInputImpl <em>Text Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smar2t.ui.interaction.impl.TextInputImpl
		 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getTextInput()
		 * @generated
		 */
		EClass TEXT_INPUT = eINSTANCE.getTextInput();

		/**
		 * The meta object literal for the '<em><b>Input Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT__INPUT_TYPE = eINSTANCE.getTextInput_InputType();

		/**
		 * The meta object literal for the '{@link smar2t.ui.interaction.impl.NumberInputImpl <em>Number Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smar2t.ui.interaction.impl.NumberInputImpl
		 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getNumberInput()
		 * @generated
		 */
		EClass NUMBER_INPUT = eINSTANCE.getNumberInput();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_INPUT__MINIMUM = eINSTANCE.getNumberInput_Minimum();

		/**
		 * The meta object literal for the '<em><b>Minimum Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_INPUT__MINIMUM_LABEL = eINSTANCE.getNumberInput_MinimumLabel();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_INPUT__MAXIMUM = eINSTANCE.getNumberInput_Maximum();

		/**
		 * The meta object literal for the '<em><b>Maximum Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_INPUT__MAXIMUM_LABEL = eINSTANCE.getNumberInput_MaximumLabel();

		/**
		 * The meta object literal for the '<em><b>Input Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_INPUT__INPUT_TYPE = eINSTANCE.getNumberInput_InputType();

		/**
		 * The meta object literal for the '{@link smar2t.ui.interaction.impl.ObjectInputImpl <em>Object Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smar2t.ui.interaction.impl.ObjectInputImpl
		 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getObjectInput()
		 * @generated
		 */
		EClass OBJECT_INPUT = eINSTANCE.getObjectInput();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INPUT__FORM = eINSTANCE.getObjectInput_Form();

		/**
		 * The meta object literal for the '{@link smar2t.ui.interaction.impl.boolInputImpl <em>bool Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smar2t.ui.interaction.impl.boolInputImpl
		 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getboolInput()
		 * @generated
		 */
		EClass BOOL_INPUT = eINSTANCE.getboolInput();

		/**
		 * The meta object literal for the '<em><b>Input Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_INPUT__INPUT_TYPE = eINSTANCE.getboolInput_InputType();

		/**
		 * The meta object literal for the '{@link smar2t.ui.interaction.InputType <em>Input Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smar2t.ui.interaction.InputType
		 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getInputType()
		 * @generated
		 */
		EEnum INPUT_TYPE = eINSTANCE.getInputType();

		/**
		 * The meta object literal for the '{@link smar2t.ui.interaction.TextInputType <em>Text Input Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smar2t.ui.interaction.TextInputType
		 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getTextInputType()
		 * @generated
		 */
		EEnum TEXT_INPUT_TYPE = eINSTANCE.getTextInputType();

		/**
		 * The meta object literal for the '{@link smar2t.ui.interaction.NumberInputType <em>Number Input Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smar2t.ui.interaction.NumberInputType
		 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getNumberInputType()
		 * @generated
		 */
		EEnum NUMBER_INPUT_TYPE = eINSTANCE.getNumberInputType();

		/**
		 * The meta object literal for the '{@link smar2t.ui.interaction.BoolInputType <em>Bool Input Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smar2t.ui.interaction.BoolInputType
		 * @see smar2t.ui.interaction.impl.InteractionPackageImpl#getBoolInputType()
		 * @generated
		 */
		EEnum BOOL_INPUT_TYPE = eINSTANCE.getBoolInputType();

	}

} //InteractionPackage
