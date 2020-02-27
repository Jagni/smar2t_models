/**
 */
package w3c_td.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import w3c_td.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see w3c_td.W3c_tdPackage
 * @generated
 */
public class W3c_tdAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static W3c_tdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W3c_tdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = W3c_tdPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected W3c_tdSwitch<Adapter> modelSwitch =
		new W3c_tdSwitch<Adapter>() {
			@Override
			public Adapter caseThing(Thing object) {
				return createThingAdapter();
			}
			@Override
			public Adapter caseVersionInfo(VersionInfo object) {
				return createVersionInfoAdapter();
			}
			@Override
			public Adapter casePropertyAffordance(PropertyAffordance object) {
				return createPropertyAffordanceAdapter();
			}
			@Override
			public Adapter caseInteractionAffordance(InteractionAffordance object) {
				return createInteractionAffordanceAdapter();
			}
			@Override
			public Adapter caseEventAffordance(EventAffordance object) {
				return createEventAffordanceAdapter();
			}
			@Override
			public Adapter caseActionAffordance(ActionAffordance object) {
				return createActionAffordanceAdapter();
			}
			@Override
			public Adapter caseMultiLanguage(MultiLanguage object) {
				return createMultiLanguageAdapter();
			}
			@Override
			public Adapter caseStringToEventMap(Map.Entry<String, EventAffordance> object) {
				return createStringToEventMapAdapter();
			}
			@Override
			public Adapter caseStringToActionMap(Map.Entry<String, ActionAffordance> object) {
				return createStringToActionMapAdapter();
			}
			@Override
			public Adapter caseStringToPropertyMap(Map.Entry<String, PropertyAffordance> object) {
				return createStringToPropertyMapAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter caseExpectedResponse(ExpectedResponse object) {
				return createExpectedResponseAdapter();
			}
			@Override
			public Adapter caseDataSchema(DataSchema object) {
				return createDataSchemaAdapter();
			}
			@Override
			public Adapter caseArraySchema(ArraySchema object) {
				return createArraySchemaAdapter();
			}
			@Override
			public Adapter caseObjectSchema(ObjectSchema object) {
				return createObjectSchemaAdapter();
			}
			@Override
			public Adapter caseStringSchema(StringSchema object) {
				return createStringSchemaAdapter();
			}
			@Override
			public Adapter caseBooleanSchema(BooleanSchema object) {
				return createBooleanSchemaAdapter();
			}
			@Override
			public Adapter caseNumberSchema(NumberSchema object) {
				return createNumberSchemaAdapter();
			}
			@Override
			public Adapter caseIntegerSchema(IntegerSchema object) {
				return createIntegerSchemaAdapter();
			}
			@Override
			public Adapter caseNullSchema(NullSchema object) {
				return createNullSchemaAdapter();
			}
			@Override
			public Adapter caseSecurityScheme(SecurityScheme object) {
				return createSecuritySchemeAdapter();
			}
			@Override
			public Adapter caseNoSecurityScheme(NoSecurityScheme object) {
				return createNoSecuritySchemeAdapter();
			}
			@Override
			public Adapter caseBasicSecurityScheme(BasicSecurityScheme object) {
				return createBasicSecuritySchemeAdapter();
			}
			@Override
			public Adapter caseDigestSecurityScheme(DigestSecurityScheme object) {
				return createDigestSecuritySchemeAdapter();
			}
			@Override
			public Adapter caseAPIKeySecurityScheme(APIKeySecurityScheme object) {
				return createAPIKeySecuritySchemeAdapter();
			}
			@Override
			public Adapter caseBearerSecurityScheme(BearerSecurityScheme object) {
				return createBearerSecuritySchemeAdapter();
			}
			@Override
			public Adapter caseCertSecurityScheme(CertSecurityScheme object) {
				return createCertSecuritySchemeAdapter();
			}
			@Override
			public Adapter casePSKSecurityScheme(PSKSecurityScheme object) {
				return createPSKSecuritySchemeAdapter();
			}
			@Override
			public Adapter casePublicSecurityScheme(PublicSecurityScheme object) {
				return createPublicSecuritySchemeAdapter();
			}
			@Override
			public Adapter casePoPSecurityScheme(PoPSecurityScheme object) {
				return createPoPSecuritySchemeAdapter();
			}
			@Override
			public Adapter caseOAuth2SecurityScheme(OAuth2SecurityScheme object) {
				return createOAuth2SecuritySchemeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.Thing
	 * @generated
	 */
	public Adapter createThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.VersionInfo <em>Version Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.VersionInfo
	 * @generated
	 */
	public Adapter createVersionInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.PropertyAffordance <em>Property Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.PropertyAffordance
	 * @generated
	 */
	public Adapter createPropertyAffordanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.InteractionAffordance <em>Interaction Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.InteractionAffordance
	 * @generated
	 */
	public Adapter createInteractionAffordanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.EventAffordance <em>Event Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.EventAffordance
	 * @generated
	 */
	public Adapter createEventAffordanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.ActionAffordance <em>Action Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.ActionAffordance
	 * @generated
	 */
	public Adapter createActionAffordanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.MultiLanguage <em>Multi Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.MultiLanguage
	 * @generated
	 */
	public Adapter createMultiLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Event Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToEventMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Action Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToActionMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Property Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToPropertyMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.ExpectedResponse <em>Expected Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.ExpectedResponse
	 * @generated
	 */
	public Adapter createExpectedResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.DataSchema <em>Data Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.DataSchema
	 * @generated
	 */
	public Adapter createDataSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.ArraySchema <em>Array Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.ArraySchema
	 * @generated
	 */
	public Adapter createArraySchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.ObjectSchema <em>Object Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.ObjectSchema
	 * @generated
	 */
	public Adapter createObjectSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.StringSchema <em>String Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.StringSchema
	 * @generated
	 */
	public Adapter createStringSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.BooleanSchema <em>Boolean Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.BooleanSchema
	 * @generated
	 */
	public Adapter createBooleanSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.NumberSchema <em>Number Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.NumberSchema
	 * @generated
	 */
	public Adapter createNumberSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.IntegerSchema <em>Integer Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.IntegerSchema
	 * @generated
	 */
	public Adapter createIntegerSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.NullSchema <em>Null Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.NullSchema
	 * @generated
	 */
	public Adapter createNullSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.SecurityScheme <em>Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.SecurityScheme
	 * @generated
	 */
	public Adapter createSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.NoSecurityScheme <em>No Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.NoSecurityScheme
	 * @generated
	 */
	public Adapter createNoSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.BasicSecurityScheme <em>Basic Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.BasicSecurityScheme
	 * @generated
	 */
	public Adapter createBasicSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.DigestSecurityScheme <em>Digest Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.DigestSecurityScheme
	 * @generated
	 */
	public Adapter createDigestSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.APIKeySecurityScheme <em>API Key Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.APIKeySecurityScheme
	 * @generated
	 */
	public Adapter createAPIKeySecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.BearerSecurityScheme <em>Bearer Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.BearerSecurityScheme
	 * @generated
	 */
	public Adapter createBearerSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.CertSecurityScheme <em>Cert Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.CertSecurityScheme
	 * @generated
	 */
	public Adapter createCertSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.PSKSecurityScheme <em>PSK Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.PSKSecurityScheme
	 * @generated
	 */
	public Adapter createPSKSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.PublicSecurityScheme <em>Public Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.PublicSecurityScheme
	 * @generated
	 */
	public Adapter createPublicSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.PoPSecurityScheme <em>Po PSecurity Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.PoPSecurityScheme
	 * @generated
	 */
	public Adapter createPoPSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link w3c_td.OAuth2SecurityScheme <em>OAuth2 Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see w3c_td.OAuth2SecurityScheme
	 * @generated
	 */
	public Adapter createOAuth2SecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //W3c_tdAdapterFactory
