/**
 */
package w3c_td.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import w3c_td.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class W3c_tdFactoryImpl extends EFactoryImpl implements W3c_tdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static W3c_tdFactory init() {
		try {
			W3c_tdFactory theW3c_tdFactory = (W3c_tdFactory)EPackage.Registry.INSTANCE.getEFactory(W3c_tdPackage.eNS_URI);
			if (theW3c_tdFactory != null) {
				return theW3c_tdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new W3c_tdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W3c_tdFactoryImpl() {
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
			case W3c_tdPackage.THING: return createThing();
			case W3c_tdPackage.VERSION_INFO: return createVersionInfo();
			case W3c_tdPackage.PROPERTY_AFFORDANCE: return createPropertyAffordance();
			case W3c_tdPackage.EVENT_AFFORDANCE: return createEventAffordance();
			case W3c_tdPackage.ACTION_AFFORDANCE: return createActionAffordance();
			case W3c_tdPackage.MULTI_LANGUAGE: return createMultiLanguage();
			case W3c_tdPackage.STRING_TO_EVENT_MAP: return (EObject)createStringToEventMap();
			case W3c_tdPackage.STRING_TO_ACTION_MAP: return (EObject)createStringToActionMap();
			case W3c_tdPackage.STRING_TO_PROPERTY_MAP: return (EObject)createStringToPropertyMap();
			case W3c_tdPackage.LINK: return createLink();
			case W3c_tdPackage.FORM: return createForm();
			case W3c_tdPackage.EXPECTED_RESPONSE: return createExpectedResponse();
			case W3c_tdPackage.ARRAY_SCHEMA: return createArraySchema();
			case W3c_tdPackage.OBJECT_SCHEMA: return createObjectSchema();
			case W3c_tdPackage.STRING_SCHEMA: return createStringSchema();
			case W3c_tdPackage.BOOLEAN_SCHEMA: return createBooleanSchema();
			case W3c_tdPackage.NUMBER_SCHEMA: return createNumberSchema();
			case W3c_tdPackage.INTEGER_SCHEMA: return createIntegerSchema();
			case W3c_tdPackage.NULL_SCHEMA: return createNullSchema();
			case W3c_tdPackage.NO_SECURITY_SCHEME: return createNoSecurityScheme();
			case W3c_tdPackage.BASIC_SECURITY_SCHEME: return createBasicSecurityScheme();
			case W3c_tdPackage.DIGEST_SECURITY_SCHEME: return createDigestSecurityScheme();
			case W3c_tdPackage.API_KEY_SECURITY_SCHEME: return createAPIKeySecurityScheme();
			case W3c_tdPackage.BEARER_SECURITY_SCHEME: return createBearerSecurityScheme();
			case W3c_tdPackage.CERT_SECURITY_SCHEME: return createCertSecurityScheme();
			case W3c_tdPackage.PSK_SECURITY_SCHEME: return createPSKSecurityScheme();
			case W3c_tdPackage.PUBLIC_SECURITY_SCHEME: return createPublicSecurityScheme();
			case W3c_tdPackage.PO_PSECURITY_SCHEME: return createPoPSecurityScheme();
			case W3c_tdPackage.OAUTH2_SECURITY_SCHEME: return createOAuth2SecurityScheme();
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
			case W3c_tdPackage.NEW_ENUM1:
				return createNewEnum1FromString(eDataType, initialValue);
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
			case W3c_tdPackage.NEW_ENUM1:
				return convertNewEnum1ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing createThing() {
		ThingImpl thing = new ThingImpl();
		return thing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionInfo createVersionInfo() {
		VersionInfoImpl versionInfo = new VersionInfoImpl();
		return versionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAffordance createPropertyAffordance() {
		PropertyAffordanceImpl propertyAffordance = new PropertyAffordanceImpl();
		return propertyAffordance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventAffordance createEventAffordance() {
		EventAffordanceImpl eventAffordance = new EventAffordanceImpl();
		return eventAffordance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionAffordance createActionAffordance() {
		ActionAffordanceImpl actionAffordance = new ActionAffordanceImpl();
		return actionAffordance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLanguage createMultiLanguage() {
		MultiLanguageImpl multiLanguage = new MultiLanguageImpl();
		return multiLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EventAffordance> createStringToEventMap() {
		StringToEventMapImpl stringToEventMap = new StringToEventMapImpl();
		return stringToEventMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, ActionAffordance> createStringToActionMap() {
		StringToActionMapImpl stringToActionMap = new StringToActionMapImpl();
		return stringToActionMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, PropertyAffordance> createStringToPropertyMap() {
		StringToPropertyMapImpl stringToPropertyMap = new StringToPropertyMapImpl();
		return stringToPropertyMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
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
	public ExpectedResponse createExpectedResponse() {
		ExpectedResponseImpl expectedResponse = new ExpectedResponseImpl();
		return expectedResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArraySchema createArraySchema() {
		ArraySchemaImpl arraySchema = new ArraySchemaImpl();
		return arraySchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSchema createObjectSchema() {
		ObjectSchemaImpl objectSchema = new ObjectSchemaImpl();
		return objectSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringSchema createStringSchema() {
		StringSchemaImpl stringSchema = new StringSchemaImpl();
		return stringSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanSchema createBooleanSchema() {
		BooleanSchemaImpl booleanSchema = new BooleanSchemaImpl();
		return booleanSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberSchema createNumberSchema() {
		NumberSchemaImpl numberSchema = new NumberSchemaImpl();
		return numberSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerSchema createIntegerSchema() {
		IntegerSchemaImpl integerSchema = new IntegerSchemaImpl();
		return integerSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullSchema createNullSchema() {
		NullSchemaImpl nullSchema = new NullSchemaImpl();
		return nullSchema;
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
	public NewEnum1 createNewEnum1FromString(EDataType eDataType, String initialValue) {
		NewEnum1 result = NewEnum1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNewEnum1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W3c_tdPackage getW3c_tdPackage() {
		return (W3c_tdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static W3c_tdPackage getPackage() {
		return W3c_tdPackage.eINSTANCE;
	}

} //W3c_tdFactoryImpl
