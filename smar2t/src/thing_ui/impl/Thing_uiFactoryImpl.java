/**
 */
package thing_ui.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import thing_ui.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Thing_uiFactoryImpl extends EFactoryImpl implements Thing_uiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Thing_uiFactory init() {
		try {
			Thing_uiFactory theThing_uiFactory = (Thing_uiFactory)EPackage.Registry.INSTANCE.getEFactory(Thing_uiPackage.eNS_URI);
			if (theThing_uiFactory != null) {
				return theThing_uiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Thing_uiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing_uiFactoryImpl() {
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
			case Thing_uiPackage.ACTUATOR: return createActuator();
			case Thing_uiPackage.FORM: return createForm();
			case Thing_uiPackage.TEXT_INPUT: return createTextInput();
			case Thing_uiPackage.NUMBER_INPUT: return createNumberInput();
			case Thing_uiPackage.OBJECT_INPUT: return createObjectInput();
			case Thing_uiPackage.BOOL_INPUT: return createboolInput();
			case Thing_uiPackage.THING_UI: return createThingUI();
			case Thing_uiPackage.LOCATION: return createLocation();
			case Thing_uiPackage.RESOURCE: return createResource();
			case Thing_uiPackage.STRING_TO_RESOURCE_MAP: return (EObject)createStringToResourceMap();
			case Thing_uiPackage.STRING_TO_INPUT_MAP: return (EObject)createStringToInputMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Thing_uiPackage.COMMUNICATION_PROTOCOL:
				return createCommunicationProtocolFromString(eDataType, initialValue);
			case Thing_uiPackage.SECURITY_SCHEME:
				return createSecuritySchemeFromString(eDataType, initialValue);
			case Thing_uiPackage.INPUT_TYPE:
				return createInputTypeFromString(eDataType, initialValue);
			case Thing_uiPackage.TEXT_INPUT_TYPE:
				return createTextInputTypeFromString(eDataType, initialValue);
			case Thing_uiPackage.NUMBER_INPUT_TYPE:
				return createNumberInputTypeFromString(eDataType, initialValue);
			case Thing_uiPackage.BOOL_INPUT_TYPE:
				return createBoolInputTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Thing_uiPackage.COMMUNICATION_PROTOCOL:
				return convertCommunicationProtocolToString(eDataType, instanceValue);
			case Thing_uiPackage.SECURITY_SCHEME:
				return convertSecuritySchemeToString(eDataType, instanceValue);
			case Thing_uiPackage.INPUT_TYPE:
				return convertInputTypeToString(eDataType, instanceValue);
			case Thing_uiPackage.TEXT_INPUT_TYPE:
				return convertTextInputTypeToString(eDataType, instanceValue);
			case Thing_uiPackage.NUMBER_INPUT_TYPE:
				return convertNumberInputTypeToString(eDataType, instanceValue);
			case Thing_uiPackage.BOOL_INPUT_TYPE:
				return convertBoolInputTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInput createTextInput() {
		TextInputImpl textInput = new TextInputImpl();
		return textInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberInput createNumberInput() {
		NumberInputImpl numberInput = new NumberInputImpl();
		return numberInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectInput createObjectInput() {
		ObjectInputImpl objectInput = new ObjectInputImpl();
		return objectInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolInput createboolInput() {
		boolInputImpl boolInput = new boolInputImpl();
		return boolInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingUI createThingUI() {
		ThingUIImpl thingUI = new ThingUIImpl();
		return thingUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Resource> createStringToResourceMap() {
		StringToResourceMapImpl stringToResourceMap = new StringToResourceMapImpl();
		return stringToResourceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Input> createStringToInputMap() {
		StringToInputMapImpl stringToInputMap = new StringToInputMapImpl();
		return stringToInputMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationProtocol createCommunicationProtocolFromString(EDataType eDataType, String initialValue) {
		CommunicationProtocol result = CommunicationProtocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityScheme createSecuritySchemeFromString(EDataType eDataType, String initialValue) {
		SecurityScheme result = SecurityScheme.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecuritySchemeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType createInputTypeFromString(EDataType eDataType, String initialValue) {
		InputType result = InputType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputType createTextInputTypeFromString(EDataType eDataType, String initialValue) {
		TextInputType result = TextInputType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextInputTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberInputType createNumberInputTypeFromString(EDataType eDataType, String initialValue) {
		NumberInputType result = NumberInputType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberInputTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolInputType createBoolInputTypeFromString(EDataType eDataType, String initialValue) {
		BoolInputType result = BoolInputType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBoolInputTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing_uiPackage getThing_uiPackage() {
		return (Thing_uiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Thing_uiPackage getPackage() {
		return Thing_uiPackage.eINSTANCE;
	}

} //Thing_uiFactoryImpl
