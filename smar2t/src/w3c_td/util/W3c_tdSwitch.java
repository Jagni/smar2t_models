/**
 */
package w3c_td.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import w3c_td.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see w3c_td.W3c_tdPackage
 * @generated
 */
public class W3c_tdSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static W3c_tdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W3c_tdSwitch() {
		if (modelPackage == null) {
			modelPackage = W3c_tdPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case W3c_tdPackage.THING: {
				Thing thing = (Thing)theEObject;
				T result = caseThing(thing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.VERSION_INFO: {
				VersionInfo versionInfo = (VersionInfo)theEObject;
				T result = caseVersionInfo(versionInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.PROPERTY_AFFORDANCE: {
				PropertyAffordance propertyAffordance = (PropertyAffordance)theEObject;
				T result = casePropertyAffordance(propertyAffordance);
				if (result == null) result = caseInteractionAffordance(propertyAffordance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.INTERACTION_AFFORDANCE: {
				InteractionAffordance interactionAffordance = (InteractionAffordance)theEObject;
				T result = caseInteractionAffordance(interactionAffordance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.EVENT_AFFORDANCE: {
				EventAffordance eventAffordance = (EventAffordance)theEObject;
				T result = caseEventAffordance(eventAffordance);
				if (result == null) result = caseInteractionAffordance(eventAffordance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.ACTION_AFFORDANCE: {
				ActionAffordance actionAffordance = (ActionAffordance)theEObject;
				T result = caseActionAffordance(actionAffordance);
				if (result == null) result = caseInteractionAffordance(actionAffordance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.MULTI_LANGUAGE: {
				MultiLanguage multiLanguage = (MultiLanguage)theEObject;
				T result = caseMultiLanguage(multiLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.STRING_TO_EVENT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, EventAffordance> stringToEventMap = (Map.Entry<String, EventAffordance>)theEObject;
				T result = caseStringToEventMap(stringToEventMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.STRING_TO_ACTION_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, ActionAffordance> stringToActionMap = (Map.Entry<String, ActionAffordance>)theEObject;
				T result = caseStringToActionMap(stringToActionMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.STRING_TO_PROPERTY_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, PropertyAffordance> stringToPropertyMap = (Map.Entry<String, PropertyAffordance>)theEObject;
				T result = caseStringToPropertyMap(stringToPropertyMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.FORM: {
				Form form = (Form)theEObject;
				T result = caseForm(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.EXPECTED_RESPONSE: {
				ExpectedResponse expectedResponse = (ExpectedResponse)theEObject;
				T result = caseExpectedResponse(expectedResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.DATA_SCHEMA: {
				DataSchema dataSchema = (DataSchema)theEObject;
				T result = caseDataSchema(dataSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.ARRAY_SCHEMA: {
				ArraySchema arraySchema = (ArraySchema)theEObject;
				T result = caseArraySchema(arraySchema);
				if (result == null) result = caseDataSchema(arraySchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.OBJECT_SCHEMA: {
				ObjectSchema objectSchema = (ObjectSchema)theEObject;
				T result = caseObjectSchema(objectSchema);
				if (result == null) result = caseDataSchema(objectSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.STRING_SCHEMA: {
				StringSchema stringSchema = (StringSchema)theEObject;
				T result = caseStringSchema(stringSchema);
				if (result == null) result = caseDataSchema(stringSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.BOOLEAN_SCHEMA: {
				BooleanSchema booleanSchema = (BooleanSchema)theEObject;
				T result = caseBooleanSchema(booleanSchema);
				if (result == null) result = caseDataSchema(booleanSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.NUMBER_SCHEMA: {
				NumberSchema numberSchema = (NumberSchema)theEObject;
				T result = caseNumberSchema(numberSchema);
				if (result == null) result = caseDataSchema(numberSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.INTEGER_SCHEMA: {
				IntegerSchema integerSchema = (IntegerSchema)theEObject;
				T result = caseIntegerSchema(integerSchema);
				if (result == null) result = caseDataSchema(integerSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.NULL_SCHEMA: {
				NullSchema nullSchema = (NullSchema)theEObject;
				T result = caseNullSchema(nullSchema);
				if (result == null) result = caseDataSchema(nullSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.SECURITY_SCHEME: {
				SecurityScheme securityScheme = (SecurityScheme)theEObject;
				T result = caseSecurityScheme(securityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.NO_SECURITY_SCHEME: {
				NoSecurityScheme noSecurityScheme = (NoSecurityScheme)theEObject;
				T result = caseNoSecurityScheme(noSecurityScheme);
				if (result == null) result = caseSecurityScheme(noSecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.BASIC_SECURITY_SCHEME: {
				BasicSecurityScheme basicSecurityScheme = (BasicSecurityScheme)theEObject;
				T result = caseBasicSecurityScheme(basicSecurityScheme);
				if (result == null) result = caseSecurityScheme(basicSecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.DIGEST_SECURITY_SCHEME: {
				DigestSecurityScheme digestSecurityScheme = (DigestSecurityScheme)theEObject;
				T result = caseDigestSecurityScheme(digestSecurityScheme);
				if (result == null) result = caseSecurityScheme(digestSecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.API_KEY_SECURITY_SCHEME: {
				APIKeySecurityScheme apiKeySecurityScheme = (APIKeySecurityScheme)theEObject;
				T result = caseAPIKeySecurityScheme(apiKeySecurityScheme);
				if (result == null) result = caseSecurityScheme(apiKeySecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.BEARER_SECURITY_SCHEME: {
				BearerSecurityScheme bearerSecurityScheme = (BearerSecurityScheme)theEObject;
				T result = caseBearerSecurityScheme(bearerSecurityScheme);
				if (result == null) result = caseSecurityScheme(bearerSecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.CERT_SECURITY_SCHEME: {
				CertSecurityScheme certSecurityScheme = (CertSecurityScheme)theEObject;
				T result = caseCertSecurityScheme(certSecurityScheme);
				if (result == null) result = caseSecurityScheme(certSecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.PSK_SECURITY_SCHEME: {
				PSKSecurityScheme pskSecurityScheme = (PSKSecurityScheme)theEObject;
				T result = casePSKSecurityScheme(pskSecurityScheme);
				if (result == null) result = caseSecurityScheme(pskSecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.PUBLIC_SECURITY_SCHEME: {
				PublicSecurityScheme publicSecurityScheme = (PublicSecurityScheme)theEObject;
				T result = casePublicSecurityScheme(publicSecurityScheme);
				if (result == null) result = caseSecurityScheme(publicSecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.PO_PSECURITY_SCHEME: {
				PoPSecurityScheme poPSecurityScheme = (PoPSecurityScheme)theEObject;
				T result = casePoPSecurityScheme(poPSecurityScheme);
				if (result == null) result = caseSecurityScheme(poPSecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3c_tdPackage.OAUTH2_SECURITY_SCHEME: {
				OAuth2SecurityScheme oAuth2SecurityScheme = (OAuth2SecurityScheme)theEObject;
				T result = caseOAuth2SecurityScheme(oAuth2SecurityScheme);
				if (result == null) result = caseSecurityScheme(oAuth2SecurityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThing(Thing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionInfo(VersionInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Affordance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Affordance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyAffordance(PropertyAffordance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Affordance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Affordance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionAffordance(InteractionAffordance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Affordance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Affordance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventAffordance(EventAffordance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Affordance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Affordance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionAffordance(ActionAffordance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiLanguage(MultiLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Event Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Event Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToEventMap(Map.Entry<String, EventAffordance> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Action Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Action Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToActionMap(Map.Entry<String, ActionAffordance> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Property Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Property Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToPropertyMap(Map.Entry<String, PropertyAffordance> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expected Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expected Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpectedResponse(ExpectedResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSchema(DataSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArraySchema(ArraySchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectSchema(ObjectSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringSchema(StringSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanSchema(BooleanSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberSchema(NumberSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerSchema(IntegerSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullSchema(NullSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityScheme(SecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoSecurityScheme(NoSecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicSecurityScheme(BasicSecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digest Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digest Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigestSecurityScheme(DigestSecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Key Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Key Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPIKeySecurityScheme(APIKeySecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bearer Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bearer Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBearerSecurityScheme(BearerSecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cert Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cert Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertSecurityScheme(CertSecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PSK Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PSK Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSKSecurityScheme(PSKSecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicSecurityScheme(PublicSecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Po PSecurity Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Po PSecurity Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoPSecurityScheme(PoPSecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OAuth2 Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OAuth2 Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOAuth2SecurityScheme(OAuth2SecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //W3c_tdSwitch
