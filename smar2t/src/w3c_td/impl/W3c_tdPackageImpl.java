/**
 */
package w3c_td.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import w3c_td.APIKeySecurityScheme;
import w3c_td.ActionAffordance;
import w3c_td.ArraySchema;
import w3c_td.BasicSecurityScheme;
import w3c_td.BearerSecurityScheme;
import w3c_td.BooleanSchema;
import w3c_td.CertSecurityScheme;
import w3c_td.DataSchema;
import w3c_td.DigestSecurityScheme;
import w3c_td.EventAffordance;
import w3c_td.ExpectedResponse;
import w3c_td.Form;
import w3c_td.IntegerSchema;
import w3c_td.InteractionAffordance;
import w3c_td.Link;
import w3c_td.MultiLanguage;
import w3c_td.NewEnum1;
import w3c_td.NoSecurityScheme;
import w3c_td.NullSchema;
import w3c_td.NumberSchema;
import w3c_td.OAuth2SecurityScheme;
import w3c_td.ObjectSchema;
import w3c_td.PSKSecurityScheme;
import w3c_td.PoPSecurityScheme;
import w3c_td.PropertyAffordance;
import w3c_td.PublicSecurityScheme;
import w3c_td.SecurityScheme;
import w3c_td.StringSchema;
import w3c_td.Thing;
import w3c_td.VersionInfo;
import w3c_td.W3c_tdFactory;
import w3c_td.W3c_tdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class W3c_tdPackageImpl extends EPackageImpl implements W3c_tdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyAffordanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionAffordanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventAffordanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionAffordanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToEventMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToActionMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToPropertyMapEClass = null;

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
	private EClass securitySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digestSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiKeySecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bearerSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pskSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poPSecuritySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oAuth2SecuritySchemeEClass = null;

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
	 * @see w3c_td.W3c_tdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private W3c_tdPackageImpl() {
		super(eNS_URI, W3c_tdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link W3c_tdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static W3c_tdPackage init() {
		if (isInited) return (W3c_tdPackage)EPackage.Registry.INSTANCE.getEPackage(W3c_tdPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredW3c_tdPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		W3c_tdPackageImpl theW3c_tdPackage = registeredW3c_tdPackage instanceof W3c_tdPackageImpl ? (W3c_tdPackageImpl)registeredW3c_tdPackage : new W3c_tdPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theW3c_tdPackage.createPackageContents();

		// Initialize created meta-data
		theW3c_tdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theW3c_tdPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(W3c_tdPackage.eNS_URI, theW3c_tdPackage);
		return theW3c_tdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThing() {
		return thingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_Id() {
		return (EAttribute)thingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_Title() {
		return (EAttribute)thingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_Description() {
		return (EAttribute)thingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_SemanticContext() {
		return (EAttribute)thingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_SemanticType() {
		return (EAttribute)thingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_Created() {
		return (EAttribute)thingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_Modified() {
		return (EAttribute)thingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_Support() {
		return (EAttribute)thingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_Base() {
		return (EAttribute)thingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_Security() {
		return (EAttribute)thingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThing_Links() {
		return (EReference)thingEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThing_Forms() {
		return (EReference)thingEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThing_Version() {
		return (EReference)thingEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThing_Titles() {
		return (EReference)thingEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThing_Descriptions() {
		return (EReference)thingEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThing_Events() {
		return (EReference)thingEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThing_Actions() {
		return (EReference)thingEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThing_Properties() {
		return (EReference)thingEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionInfo() {
		return versionInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionInfo_Instance() {
		return (EAttribute)versionInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyAffordance() {
		return propertyAffordanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyAffordance_Observable() {
		return (EAttribute)propertyAffordanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionAffordance() {
		return interactionAffordanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionAffordance_Forms() {
		return (EReference)interactionAffordanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionAffordance_Titles() {
		return (EReference)interactionAffordanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionAffordance_Descriptions() {
		return (EReference)interactionAffordanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionAffordance_Type() {
		return (EAttribute)interactionAffordanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionAffordance_Title() {
		return (EAttribute)interactionAffordanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionAffordance_Description() {
		return (EAttribute)interactionAffordanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventAffordance() {
		return eventAffordanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionAffordance() {
		return actionAffordanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionAffordance_Safe() {
		return (EAttribute)actionAffordanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionAffordance_Idempotent() {
		return (EAttribute)actionAffordanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiLanguage() {
		return multiLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToEventMap() {
		return stringToEventMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToEventMap_Key() {
		return (EAttribute)stringToEventMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToEventMap_Value() {
		return (EReference)stringToEventMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToActionMap() {
		return stringToActionMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToActionMap_Key() {
		return (EAttribute)stringToActionMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToActionMap_Value() {
		return (EReference)stringToActionMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToPropertyMap() {
		return stringToPropertyMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToPropertyMap_Value() {
		return (EReference)stringToPropertyMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToPropertyMap_Key() {
		return (EAttribute)stringToPropertyMapEClass.getEStructuralFeatures().get(1);
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
	public EClass getSecurityScheme() {
		return securitySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityScheme_SemanticType() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityScheme_Description() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityScheme_Proxy() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityScheme_Scheme() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityScheme_Descriptions() {
		return (EReference)securitySchemeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoSecurityScheme() {
		return noSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicSecurityScheme() {
		return basicSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicSecurityScheme_In() {
		return (EAttribute)basicSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicSecurityScheme_Name() {
		return (EAttribute)basicSecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigestSecurityScheme() {
		return digestSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigestSecurityScheme_Qop() {
		return (EAttribute)digestSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigestSecurityScheme_In() {
		return (EAttribute)digestSecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigestSecurityScheme_Name() {
		return (EAttribute)digestSecuritySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPIKeySecurityScheme() {
		return apiKeySecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIKeySecurityScheme_In() {
		return (EAttribute)apiKeySecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIKeySecurityScheme_Name() {
		return (EAttribute)apiKeySecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBearerSecurityScheme() {
		return bearerSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBearerSecurityScheme_Authorization() {
		return (EAttribute)bearerSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBearerSecurityScheme_Alg() {
		return (EAttribute)bearerSecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBearerSecurityScheme_Format() {
		return (EAttribute)bearerSecuritySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBearerSecurityScheme_In() {
		return (EAttribute)bearerSecuritySchemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBearerSecurityScheme_Name() {
		return (EAttribute)bearerSecuritySchemeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCertSecurityScheme() {
		return certSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertSecurityScheme_Identity() {
		return (EAttribute)certSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSKSecurityScheme() {
		return pskSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSKSecurityScheme_Identity() {
		return (EAttribute)pskSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicSecurityScheme() {
		return publicSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicSecurityScheme_Identity() {
		return (EAttribute)publicSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoPSecurityScheme() {
		return poPSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoPSecurityScheme_Authorization() {
		return (EAttribute)poPSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoPSecurityScheme_Alg() {
		return (EAttribute)poPSecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoPSecurityScheme_Format() {
		return (EAttribute)poPSecuritySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoPSecurityScheme_In() {
		return (EAttribute)poPSecuritySchemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoPSecurityScheme_Name() {
		return (EAttribute)poPSecuritySchemeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOAuth2SecurityScheme() {
		return oAuth2SecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuth2SecurityScheme_Authorization() {
		return (EAttribute)oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuth2SecurityScheme_Token() {
		return (EAttribute)oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuth2SecurityScheme_Refresh() {
		return (EAttribute)oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuth2SecurityScheme_Scopes() {
		return (EAttribute)oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuth2SecurityScheme_Flow() {
		return (EAttribute)oAuth2SecuritySchemeEClass.getEStructuralFeatures().get(4);
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
	public W3c_tdFactory getW3c_tdFactory() {
		return (W3c_tdFactory)getEFactoryInstance();
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
		thingEClass = createEClass(THING);
		createEAttribute(thingEClass, THING__ID);
		createEAttribute(thingEClass, THING__TITLE);
		createEAttribute(thingEClass, THING__DESCRIPTION);
		createEAttribute(thingEClass, THING__SEMANTIC_CONTEXT);
		createEAttribute(thingEClass, THING__SEMANTIC_TYPE);
		createEAttribute(thingEClass, THING__CREATED);
		createEAttribute(thingEClass, THING__MODIFIED);
		createEAttribute(thingEClass, THING__SUPPORT);
		createEAttribute(thingEClass, THING__BASE);
		createEAttribute(thingEClass, THING__SECURITY);
		createEReference(thingEClass, THING__LINKS);
		createEReference(thingEClass, THING__FORMS);
		createEReference(thingEClass, THING__VERSION);
		createEReference(thingEClass, THING__TITLES);
		createEReference(thingEClass, THING__DESCRIPTIONS);
		createEReference(thingEClass, THING__EVENTS);
		createEReference(thingEClass, THING__ACTIONS);
		createEReference(thingEClass, THING__PROPERTIES);

		versionInfoEClass = createEClass(VERSION_INFO);
		createEAttribute(versionInfoEClass, VERSION_INFO__INSTANCE);

		propertyAffordanceEClass = createEClass(PROPERTY_AFFORDANCE);
		createEAttribute(propertyAffordanceEClass, PROPERTY_AFFORDANCE__OBSERVABLE);

		interactionAffordanceEClass = createEClass(INTERACTION_AFFORDANCE);
		createEReference(interactionAffordanceEClass, INTERACTION_AFFORDANCE__FORMS);
		createEReference(interactionAffordanceEClass, INTERACTION_AFFORDANCE__TITLES);
		createEReference(interactionAffordanceEClass, INTERACTION_AFFORDANCE__DESCRIPTIONS);
		createEAttribute(interactionAffordanceEClass, INTERACTION_AFFORDANCE__TYPE);
		createEAttribute(interactionAffordanceEClass, INTERACTION_AFFORDANCE__TITLE);
		createEAttribute(interactionAffordanceEClass, INTERACTION_AFFORDANCE__DESCRIPTION);

		eventAffordanceEClass = createEClass(EVENT_AFFORDANCE);

		actionAffordanceEClass = createEClass(ACTION_AFFORDANCE);
		createEAttribute(actionAffordanceEClass, ACTION_AFFORDANCE__SAFE);
		createEAttribute(actionAffordanceEClass, ACTION_AFFORDANCE__IDEMPOTENT);

		multiLanguageEClass = createEClass(MULTI_LANGUAGE);

		stringToEventMapEClass = createEClass(STRING_TO_EVENT_MAP);
		createEAttribute(stringToEventMapEClass, STRING_TO_EVENT_MAP__KEY);
		createEReference(stringToEventMapEClass, STRING_TO_EVENT_MAP__VALUE);

		stringToActionMapEClass = createEClass(STRING_TO_ACTION_MAP);
		createEAttribute(stringToActionMapEClass, STRING_TO_ACTION_MAP__KEY);
		createEReference(stringToActionMapEClass, STRING_TO_ACTION_MAP__VALUE);

		stringToPropertyMapEClass = createEClass(STRING_TO_PROPERTY_MAP);
		createEReference(stringToPropertyMapEClass, STRING_TO_PROPERTY_MAP__VALUE);
		createEAttribute(stringToPropertyMapEClass, STRING_TO_PROPERTY_MAP__KEY);

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

		securitySchemeEClass = createEClass(SECURITY_SCHEME);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__SEMANTIC_TYPE);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__DESCRIPTION);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__PROXY);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__SCHEME);
		createEReference(securitySchemeEClass, SECURITY_SCHEME__DESCRIPTIONS);

		noSecuritySchemeEClass = createEClass(NO_SECURITY_SCHEME);

		basicSecuritySchemeEClass = createEClass(BASIC_SECURITY_SCHEME);
		createEAttribute(basicSecuritySchemeEClass, BASIC_SECURITY_SCHEME__IN);
		createEAttribute(basicSecuritySchemeEClass, BASIC_SECURITY_SCHEME__NAME);

		digestSecuritySchemeEClass = createEClass(DIGEST_SECURITY_SCHEME);
		createEAttribute(digestSecuritySchemeEClass, DIGEST_SECURITY_SCHEME__QOP);
		createEAttribute(digestSecuritySchemeEClass, DIGEST_SECURITY_SCHEME__IN);
		createEAttribute(digestSecuritySchemeEClass, DIGEST_SECURITY_SCHEME__NAME);

		apiKeySecuritySchemeEClass = createEClass(API_KEY_SECURITY_SCHEME);
		createEAttribute(apiKeySecuritySchemeEClass, API_KEY_SECURITY_SCHEME__IN);
		createEAttribute(apiKeySecuritySchemeEClass, API_KEY_SECURITY_SCHEME__NAME);

		bearerSecuritySchemeEClass = createEClass(BEARER_SECURITY_SCHEME);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__AUTHORIZATION);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__ALG);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__FORMAT);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__IN);
		createEAttribute(bearerSecuritySchemeEClass, BEARER_SECURITY_SCHEME__NAME);

		certSecuritySchemeEClass = createEClass(CERT_SECURITY_SCHEME);
		createEAttribute(certSecuritySchemeEClass, CERT_SECURITY_SCHEME__IDENTITY);

		pskSecuritySchemeEClass = createEClass(PSK_SECURITY_SCHEME);
		createEAttribute(pskSecuritySchemeEClass, PSK_SECURITY_SCHEME__IDENTITY);

		publicSecuritySchemeEClass = createEClass(PUBLIC_SECURITY_SCHEME);
		createEAttribute(publicSecuritySchemeEClass, PUBLIC_SECURITY_SCHEME__IDENTITY);

		poPSecuritySchemeEClass = createEClass(PO_PSECURITY_SCHEME);
		createEAttribute(poPSecuritySchemeEClass, PO_PSECURITY_SCHEME__AUTHORIZATION);
		createEAttribute(poPSecuritySchemeEClass, PO_PSECURITY_SCHEME__ALG);
		createEAttribute(poPSecuritySchemeEClass, PO_PSECURITY_SCHEME__FORMAT);
		createEAttribute(poPSecuritySchemeEClass, PO_PSECURITY_SCHEME__IN);
		createEAttribute(poPSecuritySchemeEClass, PO_PSECURITY_SCHEME__NAME);

		oAuth2SecuritySchemeEClass = createEClass(OAUTH2_SECURITY_SCHEME);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__AUTHORIZATION);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__TOKEN);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__REFRESH);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__SCOPES);
		createEAttribute(oAuth2SecuritySchemeEClass, OAUTH2_SECURITY_SCHEME__FLOW);

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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		propertyAffordanceEClass.getESuperTypes().add(this.getInteractionAffordance());
		eventAffordanceEClass.getESuperTypes().add(this.getInteractionAffordance());
		actionAffordanceEClass.getESuperTypes().add(this.getInteractionAffordance());
		arraySchemaEClass.getESuperTypes().add(this.getDataSchema());
		objectSchemaEClass.getESuperTypes().add(this.getDataSchema());
		stringSchemaEClass.getESuperTypes().add(this.getDataSchema());
		booleanSchemaEClass.getESuperTypes().add(this.getDataSchema());
		numberSchemaEClass.getESuperTypes().add(this.getDataSchema());
		integerSchemaEClass.getESuperTypes().add(this.getDataSchema());
		nullSchemaEClass.getESuperTypes().add(this.getDataSchema());
		noSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		basicSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		digestSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		apiKeySecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		bearerSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		certSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		pskSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		publicSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		poPSecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());
		oAuth2SecuritySchemeEClass.getESuperTypes().add(this.getSecurityScheme());

		// Initialize classes, features, and operations; add parameters
		initEClass(thingEClass, Thing.class, "Thing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThing_Id(), ecorePackage.getEString(), "id", null, 0, 1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Title(), ecorePackage.getEString(), "title", null, 1, 1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Description(), ecorePackage.getEString(), "description", null, 0, 1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_SemanticContext(), ecorePackage.getEString(), "semanticContext", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_SemanticType(), ecorePackage.getEString(), "semanticType", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Created(), ecorePackage.getEDate(), "created", null, 0, 1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Modified(), ecorePackage.getEDate(), "modified", null, 0, 1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Support(), ecorePackage.getEString(), "support", null, 0, 1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Base(), ecorePackage.getEString(), "base", null, 0, 1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Security(), ecorePackage.getEString(), "security", null, 1, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Links(), this.getLink(), null, "links", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Forms(), this.getForm(), null, "forms", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Version(), this.getVersionInfo(), null, "version", null, 0, 1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Titles(), this.getMultiLanguage(), null, "titles", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Descriptions(), this.getMultiLanguage(), null, "descriptions", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Events(), this.getStringToEventMap(), null, "events", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Actions(), this.getStringToActionMap(), null, "actions", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Properties(), this.getStringToPropertyMap(), null, "properties", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionInfoEClass, VersionInfo.class, "VersionInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionInfo_Instance(), ecorePackage.getEString(), "instance", null, 0, 1, VersionInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyAffordanceEClass, PropertyAffordance.class, "PropertyAffordance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyAffordance_Observable(), ecorePackage.getEBoolean(), "observable", null, 0, 1, PropertyAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionAffordanceEClass, InteractionAffordance.class, "InteractionAffordance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionAffordance_Forms(), this.getForm(), null, "forms", null, 1, -1, InteractionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionAffordance_Titles(), this.getMultiLanguage(), null, "titles", null, 0, 1, InteractionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionAffordance_Descriptions(), this.getMultiLanguage(), null, "descriptions", null, 0, 1, InteractionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteractionAffordance_Type(), ecorePackage.getEString(), "type", null, 0, 1, InteractionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteractionAffordance_Title(), ecorePackage.getEString(), "title", null, 0, 1, InteractionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteractionAffordance_Description(), ecorePackage.getEString(), "description", null, 0, 1, InteractionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventAffordanceEClass, EventAffordance.class, "EventAffordance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionAffordanceEClass, ActionAffordance.class, "ActionAffordance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionAffordance_Safe(), ecorePackage.getEBoolean(), "safe", "false", 1, 1, ActionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionAffordance_Idempotent(), ecorePackage.getEBoolean(), "idempotent", "false", 1, 1, ActionAffordance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiLanguageEClass, MultiLanguage.class, "MultiLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringToEventMapEClass, Map.Entry.class, "StringToEventMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToEventMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToEventMap_Value(), this.getEventAffordance(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToActionMapEClass, Map.Entry.class, "StringToActionMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToActionMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToActionMap_Value(), this.getActionAffordance(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToPropertyMapEClass, Map.Entry.class, "StringToPropertyMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringToPropertyMap_Value(), this.getPropertyAffordance(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToPropertyMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(dataSchemaEClass, DataSchema.class, "DataSchema", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSchema_SemanticType(), ecorePackage.getEString(), "semanticType", null, 0, -1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Title(), ecorePackage.getEString(), "title", null, 0, 1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Description(), ecorePackage.getEString(), "description", null, 0, 1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Type(), ecorePackage.getEString(), "type", null, 1, 1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSchema_Enum(), ecorePackage.getEString(), "enum", null, 0, 1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSchema_OneOf(), this.getDataSchema(), null, "oneOf", null, 0, -1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSchema_Titles(), this.getMultiLanguage(), null, "titles", null, 0, -1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSchema_Descriptions(), this.getMultiLanguage(), null, "descriptions", null, 0, -1, DataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(securitySchemeEClass, SecurityScheme.class, "SecurityScheme", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityScheme_SemanticType(), ecorePackage.getEString(), "semanticType", null, 0, -1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScheme_Description(), ecorePackage.getEString(), "description", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScheme_Proxy(), theXMLTypePackage.getAnyURI(), "proxy", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScheme_Scheme(), ecorePackage.getEString(), "scheme", null, 1, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityScheme_Descriptions(), this.getMultiLanguage(), null, "descriptions", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noSecuritySchemeEClass, NoSecurityScheme.class, "NoSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicSecuritySchemeEClass, BasicSecurityScheme.class, "BasicSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicSecurityScheme_In(), ecorePackage.getEString(), "in", null, 1, 1, BasicSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicSecurityScheme_Name(), ecorePackage.getEString(), "name", null, 1, 1, BasicSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digestSecuritySchemeEClass, DigestSecurityScheme.class, "DigestSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigestSecurityScheme_Qop(), ecorePackage.getEString(), "qop", null, 1, 1, DigestSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigestSecurityScheme_In(), ecorePackage.getEString(), "in", null, 1, 1, DigestSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigestSecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1, DigestSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiKeySecuritySchemeEClass, APIKeySecurityScheme.class, "APIKeySecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPIKeySecurityScheme_In(), ecorePackage.getEString(), "in", null, 1, 1, APIKeySecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPIKeySecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1, APIKeySecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bearerSecuritySchemeEClass, BearerSecurityScheme.class, "BearerSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBearerSecurityScheme_Authorization(), theXMLTypePackage.getAnyURI(), "authorization", null, 0, 1, BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearerSecurityScheme_Alg(), ecorePackage.getEString(), "alg", null, 1, 1, BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearerSecurityScheme_Format(), ecorePackage.getEString(), "format", null, 1, 1, BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearerSecurityScheme_In(), ecorePackage.getEString(), "in", null, 1, 1, BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBearerSecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1, BearerSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certSecuritySchemeEClass, CertSecurityScheme.class, "CertSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertSecurityScheme_Identity(), ecorePackage.getEString(), "identity", null, 0, 1, CertSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pskSecuritySchemeEClass, PSKSecurityScheme.class, "PSKSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPSKSecurityScheme_Identity(), ecorePackage.getEString(), "identity", null, 0, 1, PSKSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicSecuritySchemeEClass, PublicSecurityScheme.class, "PublicSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicSecurityScheme_Identity(), ecorePackage.getEString(), "identity", null, 0, 1, PublicSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poPSecuritySchemeEClass, PoPSecurityScheme.class, "PoPSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoPSecurityScheme_Authorization(), theXMLTypePackage.getAnyURI(), "authorization", null, 0, 1, PoPSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoPSecurityScheme_Alg(), ecorePackage.getEString(), "alg", null, 1, 1, PoPSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoPSecurityScheme_Format(), ecorePackage.getEString(), "format", null, 1, 1, PoPSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoPSecurityScheme_In(), theXMLTypePackage.getAnyURI(), "in", null, 1, 1, PoPSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoPSecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1, PoPSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oAuth2SecuritySchemeEClass, OAuth2SecurityScheme.class, "OAuth2SecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOAuth2SecurityScheme_Authorization(), theXMLTypePackage.getAnyURI(), "authorization", null, 0, 1, OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuth2SecurityScheme_Token(), theXMLTypePackage.getAnyURI(), "token", null, 0, 1, OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuth2SecurityScheme_Refresh(), theXMLTypePackage.getAnyURI(), "refresh", null, 0, 1, OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuth2SecurityScheme_Scopes(), theXMLTypePackage.getAnyURI(), "scopes", null, 0, 1, OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuth2SecurityScheme_Flow(), ecorePackage.getEString(), "flow", null, 1, 1, OAuth2SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(newEnum1EEnum, NewEnum1.class, "NewEnum1");

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";
		addAnnotation
		  (thingEClass,
		   source,
		   new String[] {
			   "archetype", "Role"
		   });
	}

} //W3c_tdPackageImpl
