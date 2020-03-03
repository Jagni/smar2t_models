/**
 */
package thing_ui;

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
 * @see thing_ui.Thing_uiFactory
 * @model kind="package"
 * @generated
 */
public interface Thing_uiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "thing_ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://smar2t.org/models/thing_ui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ThingUI";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Thing_uiPackage eINSTANCE = thing_ui.impl.Thing_uiPackageImpl.init();

	/**
	 * The meta object id for the '{@link thing_ui.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.impl.ActuatorImpl
	 * @see thing_ui.impl.Thing_uiPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__HREF = 0;

	/**
	 * The feature id for the '<em><b>Communication Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__COMMUNICATION_PROTOCOL = 1;

	/**
	 * The feature id for the '<em><b>Security Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__SECURITY_SCHEME = 2;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thing_ui.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.impl.FormImpl
	 * @see thing_ui.impl.Thing_uiPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 1;

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
	 * The feature id for the '<em><b>Inputs</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__INPUTS = 2;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' containment reference.
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
	 * The meta object id for the '{@link thing_ui.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.impl.InputImpl
	 * @see thing_ui.impl.Thing_uiPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 2;

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
	 * The meta object id for the '{@link thing_ui.impl.TextInputImpl <em>Text Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.impl.TextInputImpl
	 * @see thing_ui.impl.Thing_uiPackageImpl#getTextInput()
	 * @generated
	 */
	int TEXT_INPUT = 3;

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
	 * The meta object id for the '{@link thing_ui.impl.NumberInputImpl <em>Number Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.impl.NumberInputImpl
	 * @see thing_ui.impl.Thing_uiPackageImpl#getNumberInput()
	 * @generated
	 */
	int NUMBER_INPUT = 4;

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
	 * The meta object id for the '{@link thing_ui.impl.ObjectInputImpl <em>Object Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.impl.ObjectInputImpl
	 * @see thing_ui.impl.Thing_uiPackageImpl#getObjectInput()
	 * @generated
	 */
	int OBJECT_INPUT = 5;

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
	 * The feature id for the '<em><b>Form</b></em>' containment reference.
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
	 * The meta object id for the '{@link thing_ui.impl.boolInputImpl <em>bool Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.impl.boolInputImpl
	 * @see thing_ui.impl.Thing_uiPackageImpl#getboolInput()
	 * @generated
	 */
	int BOOL_INPUT = 6;

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
	 * The meta object id for the '{@link thing_ui.impl.ThingUIImpl <em>Thing UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.impl.ThingUIImpl
	 * @see thing_ui.impl.Thing_uiPackageImpl#getThingUI()
	 * @generated
	 */
	int THING_UI = 7;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_UI__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_UI__PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_UI__ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_UI__EVENTS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_UI__NAME = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_UI__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_UI__ICON = 6;

	/**
	 * The number of structural features of the '<em>Thing UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_UI_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Thing UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_UI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thing_ui.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.impl.LocationImpl
	 * @see thing_ui.impl.Thing_uiPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 8;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LATITUDE = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ALTITUDE = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thing_ui.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.impl.ResourceImpl
	 * @see thing_ui.impl.Thing_uiPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ICON = 2;

	/**
	 * The feature id for the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__FORM = 3;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thing_ui.impl.StringToResourceMapImpl <em>String To Resource Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.impl.StringToResourceMapImpl
	 * @see thing_ui.impl.Thing_uiPackageImpl#getStringToResourceMap()
	 * @generated
	 */
	int STRING_TO_RESOURCE_MAP = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_RESOURCE_MAP__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_RESOURCE_MAP__KEY = 1;

	/**
	 * The number of structural features of the '<em>String To Resource Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_RESOURCE_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Resource Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_RESOURCE_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thing_ui.impl.StringToInputMapImpl <em>String To Input Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.impl.StringToInputMapImpl
	 * @see thing_ui.impl.Thing_uiPackageImpl#getStringToInputMap()
	 * @generated
	 */
	int STRING_TO_INPUT_MAP = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_INPUT_MAP__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_INPUT_MAP__KEY = 1;

	/**
	 * The number of structural features of the '<em>String To Input Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_INPUT_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Input Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_INPUT_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thing_ui.CommunicationProtocol <em>Communication Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.CommunicationProtocol
	 * @see thing_ui.impl.Thing_uiPackageImpl#getCommunicationProtocol()
	 * @generated
	 */
	int COMMUNICATION_PROTOCOL = 12;

	/**
	 * The meta object id for the '{@link thing_ui.SecurityScheme <em>Security Scheme</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.SecurityScheme
	 * @see thing_ui.impl.Thing_uiPackageImpl#getSecurityScheme()
	 * @generated
	 */
	int SECURITY_SCHEME = 13;

	/**
	 * The meta object id for the '{@link thing_ui.InputType <em>Input Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.InputType
	 * @see thing_ui.impl.Thing_uiPackageImpl#getInputType()
	 * @generated
	 */
	int INPUT_TYPE = 14;

	/**
	 * The meta object id for the '{@link thing_ui.TextInputType <em>Text Input Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.TextInputType
	 * @see thing_ui.impl.Thing_uiPackageImpl#getTextInputType()
	 * @generated
	 */
	int TEXT_INPUT_TYPE = 15;

	/**
	 * The meta object id for the '{@link thing_ui.NumberInputType <em>Number Input Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.NumberInputType
	 * @see thing_ui.impl.Thing_uiPackageImpl#getNumberInputType()
	 * @generated
	 */
	int NUMBER_INPUT_TYPE = 16;

	/**
	 * The meta object id for the '{@link thing_ui.BoolInputType <em>Bool Input Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.BoolInputType
	 * @see thing_ui.impl.Thing_uiPackageImpl#getBoolInputType()
	 * @generated
	 */
	int BOOL_INPUT_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link thing_ui.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see thing_ui.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.Actuator#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see thing_ui.Actuator#getHref()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Href();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.Actuator#getCommunicationProtocol <em>Communication Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Protocol</em>'.
	 * @see thing_ui.Actuator#getCommunicationProtocol()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_CommunicationProtocol();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.Actuator#getSecurityScheme <em>Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Scheme</em>'.
	 * @see thing_ui.Actuator#getSecurityScheme()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_SecurityScheme();

	/**
	 * Returns the meta object for class '{@link thing_ui.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see thing_ui.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.Form#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see thing_ui.Form#isReadOnly()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.Form#isShowsSubmitButton <em>Shows Submit Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shows Submit Button</em>'.
	 * @see thing_ui.Form#isShowsSubmitButton()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_ShowsSubmitButton();

	/**
	 * Returns the meta object for the map '{@link thing_ui.Form#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Inputs</em>'.
	 * @see thing_ui.Form#getInputs()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link thing_ui.Form#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actuator</em>'.
	 * @see thing_ui.Form#getActuator()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Actuator();

	/**
	 * Returns the meta object for class '{@link thing_ui.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see thing_ui.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.Input#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see thing_ui.Input#getLabel()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Label();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.Input#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see thing_ui.Input#getId()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Id();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.Input#getEditingValue <em>Editing Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editing Value</em>'.
	 * @see thing_ui.Input#getEditingValue()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_EditingValue();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.Input#getThingValue <em>Thing Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thing Value</em>'.
	 * @see thing_ui.Input#getThingValue()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_ThingValue();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see thing_ui.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Type();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.Input#isInteractionEnabled <em>Interaction Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interaction Enabled</em>'.
	 * @see thing_ui.Input#isInteractionEnabled()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_InteractionEnabled();

	/**
	 * Returns the meta object for class '{@link thing_ui.TextInput <em>Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input</em>'.
	 * @see thing_ui.TextInput
	 * @generated
	 */
	EClass getTextInput();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.TextInput#getInputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Type</em>'.
	 * @see thing_ui.TextInput#getInputType()
	 * @see #getTextInput()
	 * @generated
	 */
	EAttribute getTextInput_InputType();

	/**
	 * Returns the meta object for class '{@link thing_ui.NumberInput <em>Number Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Input</em>'.
	 * @see thing_ui.NumberInput
	 * @generated
	 */
	EClass getNumberInput();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.NumberInput#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see thing_ui.NumberInput#getMinimum()
	 * @see #getNumberInput()
	 * @generated
	 */
	EAttribute getNumberInput_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.NumberInput#getMinimumLabel <em>Minimum Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Label</em>'.
	 * @see thing_ui.NumberInput#getMinimumLabel()
	 * @see #getNumberInput()
	 * @generated
	 */
	EAttribute getNumberInput_MinimumLabel();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.NumberInput#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see thing_ui.NumberInput#getMaximum()
	 * @see #getNumberInput()
	 * @generated
	 */
	EAttribute getNumberInput_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.NumberInput#getMaximumLabel <em>Maximum Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Label</em>'.
	 * @see thing_ui.NumberInput#getMaximumLabel()
	 * @see #getNumberInput()
	 * @generated
	 */
	EAttribute getNumberInput_MaximumLabel();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.NumberInput#getInputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Type</em>'.
	 * @see thing_ui.NumberInput#getInputType()
	 * @see #getNumberInput()
	 * @generated
	 */
	EAttribute getNumberInput_InputType();

	/**
	 * Returns the meta object for class '{@link thing_ui.ObjectInput <em>Object Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Input</em>'.
	 * @see thing_ui.ObjectInput
	 * @generated
	 */
	EClass getObjectInput();

	/**
	 * Returns the meta object for the containment reference '{@link thing_ui.ObjectInput#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form</em>'.
	 * @see thing_ui.ObjectInput#getForm()
	 * @see #getObjectInput()
	 * @generated
	 */
	EReference getObjectInput_Form();

	/**
	 * Returns the meta object for class '{@link thing_ui.boolInput <em>bool Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>bool Input</em>'.
	 * @see thing_ui.boolInput
	 * @generated
	 */
	EClass getboolInput();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.boolInput#getInputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Type</em>'.
	 * @see thing_ui.boolInput#getInputType()
	 * @see #getboolInput()
	 * @generated
	 */
	EAttribute getboolInput_InputType();

	/**
	 * Returns the meta object for class '{@link thing_ui.ThingUI <em>Thing UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing UI</em>'.
	 * @see thing_ui.ThingUI
	 * @generated
	 */
	EClass getThingUI();

	/**
	 * Returns the meta object for the containment reference '{@link thing_ui.ThingUI#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see thing_ui.ThingUI#getLocation()
	 * @see #getThingUI()
	 * @generated
	 */
	EReference getThingUI_Location();

	/**
	 * Returns the meta object for the map '{@link thing_ui.ThingUI#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Properties</em>'.
	 * @see thing_ui.ThingUI#getProperties()
	 * @see #getThingUI()
	 * @generated
	 */
	EReference getThingUI_Properties();

	/**
	 * Returns the meta object for the map '{@link thing_ui.ThingUI#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Actions</em>'.
	 * @see thing_ui.ThingUI#getActions()
	 * @see #getThingUI()
	 * @generated
	 */
	EReference getThingUI_Actions();

	/**
	 * Returns the meta object for the map '{@link thing_ui.ThingUI#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Events</em>'.
	 * @see thing_ui.ThingUI#getEvents()
	 * @see #getThingUI()
	 * @generated
	 */
	EReference getThingUI_Events();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.ThingUI#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see thing_ui.ThingUI#getName()
	 * @see #getThingUI()
	 * @generated
	 */
	EAttribute getThingUI_Name();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.ThingUI#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see thing_ui.ThingUI#getDescription()
	 * @see #getThingUI()
	 * @generated
	 */
	EAttribute getThingUI_Description();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.ThingUI#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see thing_ui.ThingUI#getIcon()
	 * @see #getThingUI()
	 * @generated
	 */
	EAttribute getThingUI_Icon();

	/**
	 * Returns the meta object for class '{@link thing_ui.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see thing_ui.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.Location#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see thing_ui.Location#getLatitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.Location#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see thing_ui.Location#getLongitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.Location#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see thing_ui.Location#getAltitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Altitude();

	/**
	 * Returns the meta object for class '{@link thing_ui.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see thing_ui.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see thing_ui.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.Resource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see thing_ui.Resource#getDescription()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Description();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.Resource#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see thing_ui.Resource#getIcon()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link thing_ui.Resource#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Form</em>'.
	 * @see thing_ui.Resource#getForm()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Form();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Resource Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Resource Map</em>'.
	 * @see java.util.Map.Entry
	 * @model features="value key" 
	 *        valueType="thing_ui.Resource" valueContainment="true" valueRequired="true"
	 *        keyDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getStringToResourceMap();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToResourceMap()
	 * @generated
	 */
	EReference getStringToResourceMap_Value();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToResourceMap()
	 * @generated
	 */
	EAttribute getStringToResourceMap_Key();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Input Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Input Map</em>'.
	 * @see java.util.Map.Entry
	 * @model features="value key" 
	 *        valueType="thing_ui.Input" valueContainment="true" valueRequired="true"
	 *        keyDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getStringToInputMap();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToInputMap()
	 * @generated
	 */
	EReference getStringToInputMap_Value();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToInputMap()
	 * @generated
	 */
	EAttribute getStringToInputMap_Key();

	/**
	 * Returns the meta object for enum '{@link thing_ui.CommunicationProtocol <em>Communication Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Protocol</em>'.
	 * @see thing_ui.CommunicationProtocol
	 * @generated
	 */
	EEnum getCommunicationProtocol();

	/**
	 * Returns the meta object for enum '{@link thing_ui.SecurityScheme <em>Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Scheme</em>'.
	 * @see thing_ui.SecurityScheme
	 * @generated
	 */
	EEnum getSecurityScheme();

	/**
	 * Returns the meta object for enum '{@link thing_ui.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Input Type</em>'.
	 * @see thing_ui.InputType
	 * @generated
	 */
	EEnum getInputType();

	/**
	 * Returns the meta object for enum '{@link thing_ui.TextInputType <em>Text Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Input Type</em>'.
	 * @see thing_ui.TextInputType
	 * @generated
	 */
	EEnum getTextInputType();

	/**
	 * Returns the meta object for enum '{@link thing_ui.NumberInputType <em>Number Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Input Type</em>'.
	 * @see thing_ui.NumberInputType
	 * @generated
	 */
	EEnum getNumberInputType();

	/**
	 * Returns the meta object for enum '{@link thing_ui.BoolInputType <em>Bool Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bool Input Type</em>'.
	 * @see thing_ui.BoolInputType
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
	Thing_uiFactory getThing_uiFactory();

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
		 * The meta object literal for the '{@link thing_ui.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.impl.ActuatorImpl
		 * @see thing_ui.impl.Thing_uiPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__HREF = eINSTANCE.getActuator_Href();

		/**
		 * The meta object literal for the '<em><b>Communication Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__COMMUNICATION_PROTOCOL = eINSTANCE.getActuator_CommunicationProtocol();

		/**
		 * The meta object literal for the '<em><b>Security Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__SECURITY_SCHEME = eINSTANCE.getActuator_SecurityScheme();

		/**
		 * The meta object literal for the '{@link thing_ui.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.impl.FormImpl
		 * @see thing_ui.impl.Thing_uiPackageImpl#getForm()
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
		 * The meta object literal for the '<em><b>Inputs</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__INPUTS = eINSTANCE.getForm_Inputs();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__ACTUATOR = eINSTANCE.getForm_Actuator();

		/**
		 * The meta object literal for the '{@link thing_ui.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.impl.InputImpl
		 * @see thing_ui.impl.Thing_uiPackageImpl#getInput()
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
		 * The meta object literal for the '{@link thing_ui.impl.TextInputImpl <em>Text Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.impl.TextInputImpl
		 * @see thing_ui.impl.Thing_uiPackageImpl#getTextInput()
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
		 * The meta object literal for the '{@link thing_ui.impl.NumberInputImpl <em>Number Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.impl.NumberInputImpl
		 * @see thing_ui.impl.Thing_uiPackageImpl#getNumberInput()
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
		 * The meta object literal for the '{@link thing_ui.impl.ObjectInputImpl <em>Object Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.impl.ObjectInputImpl
		 * @see thing_ui.impl.Thing_uiPackageImpl#getObjectInput()
		 * @generated
		 */
		EClass OBJECT_INPUT = eINSTANCE.getObjectInput();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_INPUT__FORM = eINSTANCE.getObjectInput_Form();

		/**
		 * The meta object literal for the '{@link thing_ui.impl.boolInputImpl <em>bool Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.impl.boolInputImpl
		 * @see thing_ui.impl.Thing_uiPackageImpl#getboolInput()
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
		 * The meta object literal for the '{@link thing_ui.impl.ThingUIImpl <em>Thing UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.impl.ThingUIImpl
		 * @see thing_ui.impl.Thing_uiPackageImpl#getThingUI()
		 * @generated
		 */
		EClass THING_UI = eINSTANCE.getThingUI();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_UI__LOCATION = eINSTANCE.getThingUI_Location();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_UI__PROPERTIES = eINSTANCE.getThingUI_Properties();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_UI__ACTIONS = eINSTANCE.getThingUI_Actions();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_UI__EVENTS = eINSTANCE.getThingUI_Events();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING_UI__NAME = eINSTANCE.getThingUI_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING_UI__DESCRIPTION = eINSTANCE.getThingUI_Description();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING_UI__ICON = eINSTANCE.getThingUI_Icon();

		/**
		 * The meta object literal for the '{@link thing_ui.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.impl.LocationImpl
		 * @see thing_ui.impl.Thing_uiPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LATITUDE = eINSTANCE.getLocation_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LONGITUDE = eINSTANCE.getLocation_Longitude();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ALTITUDE = eINSTANCE.getLocation_Altitude();

		/**
		 * The meta object literal for the '{@link thing_ui.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.impl.ResourceImpl
		 * @see thing_ui.impl.Thing_uiPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__DESCRIPTION = eINSTANCE.getResource_Description();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__ICON = eINSTANCE.getResource_Icon();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__FORM = eINSTANCE.getResource_Form();

		/**
		 * The meta object literal for the '{@link thing_ui.impl.StringToResourceMapImpl <em>String To Resource Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.impl.StringToResourceMapImpl
		 * @see thing_ui.impl.Thing_uiPackageImpl#getStringToResourceMap()
		 * @generated
		 */
		EClass STRING_TO_RESOURCE_MAP = eINSTANCE.getStringToResourceMap();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_RESOURCE_MAP__VALUE = eINSTANCE.getStringToResourceMap_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_RESOURCE_MAP__KEY = eINSTANCE.getStringToResourceMap_Key();

		/**
		 * The meta object literal for the '{@link thing_ui.impl.StringToInputMapImpl <em>String To Input Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.impl.StringToInputMapImpl
		 * @see thing_ui.impl.Thing_uiPackageImpl#getStringToInputMap()
		 * @generated
		 */
		EClass STRING_TO_INPUT_MAP = eINSTANCE.getStringToInputMap();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_INPUT_MAP__VALUE = eINSTANCE.getStringToInputMap_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_INPUT_MAP__KEY = eINSTANCE.getStringToInputMap_Key();

		/**
		 * The meta object literal for the '{@link thing_ui.CommunicationProtocol <em>Communication Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.CommunicationProtocol
		 * @see thing_ui.impl.Thing_uiPackageImpl#getCommunicationProtocol()
		 * @generated
		 */
		EEnum COMMUNICATION_PROTOCOL = eINSTANCE.getCommunicationProtocol();

		/**
		 * The meta object literal for the '{@link thing_ui.SecurityScheme <em>Security Scheme</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.SecurityScheme
		 * @see thing_ui.impl.Thing_uiPackageImpl#getSecurityScheme()
		 * @generated
		 */
		EEnum SECURITY_SCHEME = eINSTANCE.getSecurityScheme();

		/**
		 * The meta object literal for the '{@link thing_ui.InputType <em>Input Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.InputType
		 * @see thing_ui.impl.Thing_uiPackageImpl#getInputType()
		 * @generated
		 */
		EEnum INPUT_TYPE = eINSTANCE.getInputType();

		/**
		 * The meta object literal for the '{@link thing_ui.TextInputType <em>Text Input Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.TextInputType
		 * @see thing_ui.impl.Thing_uiPackageImpl#getTextInputType()
		 * @generated
		 */
		EEnum TEXT_INPUT_TYPE = eINSTANCE.getTextInputType();

		/**
		 * The meta object literal for the '{@link thing_ui.NumberInputType <em>Number Input Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.NumberInputType
		 * @see thing_ui.impl.Thing_uiPackageImpl#getNumberInputType()
		 * @generated
		 */
		EEnum NUMBER_INPUT_TYPE = eINSTANCE.getNumberInputType();

		/**
		 * The meta object literal for the '{@link thing_ui.BoolInputType <em>Bool Input Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.BoolInputType
		 * @see thing_ui.impl.Thing_uiPackageImpl#getBoolInputType()
		 * @generated
		 */
		EEnum BOOL_INPUT_TYPE = eINSTANCE.getBoolInputType();

	}

} //Thing_uiPackage
