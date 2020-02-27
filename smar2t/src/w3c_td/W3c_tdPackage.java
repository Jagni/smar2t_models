/**
 */
package w3c_td;

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
 * @see w3c_td.W3c_tdFactory
 * @model kind="package"
 * @generated
 */
public interface W3c_tdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "w3c_td";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://smar2t.org/models/w3c_td";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "W3CTD";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	W3c_tdPackage eINSTANCE = w3c_td.impl.W3c_tdPackageImpl.init();

	/**
	 * The meta object id for the '{@link w3c_td.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.ThingImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getThing()
	 * @generated
	 */
	int THING = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Semantic Context</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__SEMANTIC_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__SEMANTIC_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__CREATED = 5;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__MODIFIED = 6;

	/**
	 * The feature id for the '<em><b>Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__SUPPORT = 7;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__BASE = 8;

	/**
	 * The feature id for the '<em><b>Security</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__SECURITY = 9;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__LINKS = 10;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__FORMS = 11;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__VERSION = 12;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__TITLES = 13;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__DESCRIPTIONS = 14;

	/**
	 * The feature id for the '<em><b>Events</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__EVENTS = 15;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__ACTIONS = 16;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__PROPERTIES = 17;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.VersionInfoImpl <em>Version Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.VersionInfoImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getVersionInfo()
	 * @generated
	 */
	int VERSION_INFO = 1;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO__INSTANCE = 0;

	/**
	 * The number of structural features of the '<em>Version Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Version Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.InteractionAffordanceImpl <em>Interaction Affordance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.InteractionAffordanceImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getInteractionAffordance()
	 * @generated
	 */
	int INTERACTION_AFFORDANCE = 3;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE__FORMS = 0;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE__TITLES = 1;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE__DESCRIPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE__TITLE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Interaction Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Interaction Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.PropertyAffordanceImpl <em>Property Affordance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.PropertyAffordanceImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getPropertyAffordance()
	 * @generated
	 */
	int PROPERTY_AFFORDANCE = 2;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__FORMS = INTERACTION_AFFORDANCE__FORMS;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__TITLES = INTERACTION_AFFORDANCE__TITLES;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__DESCRIPTIONS = INTERACTION_AFFORDANCE__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__TYPE = INTERACTION_AFFORDANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__TITLE = INTERACTION_AFFORDANCE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__DESCRIPTION = INTERACTION_AFFORDANCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Observable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__OBSERVABLE = INTERACTION_AFFORDANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE_FEATURE_COUNT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE_OPERATION_COUNT = INTERACTION_AFFORDANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.EventAffordanceImpl <em>Event Affordance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.EventAffordanceImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getEventAffordance()
	 * @generated
	 */
	int EVENT_AFFORDANCE = 4;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__FORMS = INTERACTION_AFFORDANCE__FORMS;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__TITLES = INTERACTION_AFFORDANCE__TITLES;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__DESCRIPTIONS = INTERACTION_AFFORDANCE__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__TYPE = INTERACTION_AFFORDANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__TITLE = INTERACTION_AFFORDANCE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__DESCRIPTION = INTERACTION_AFFORDANCE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Event Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE_FEATURE_COUNT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE_OPERATION_COUNT = INTERACTION_AFFORDANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.ActionAffordanceImpl <em>Action Affordance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.ActionAffordanceImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getActionAffordance()
	 * @generated
	 */
	int ACTION_AFFORDANCE = 5;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__FORMS = INTERACTION_AFFORDANCE__FORMS;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__TITLES = INTERACTION_AFFORDANCE__TITLES;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__DESCRIPTIONS = INTERACTION_AFFORDANCE__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__TYPE = INTERACTION_AFFORDANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__TITLE = INTERACTION_AFFORDANCE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__DESCRIPTION = INTERACTION_AFFORDANCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__SAFE = INTERACTION_AFFORDANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Idempotent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__IDEMPOTENT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE_FEATURE_COUNT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE_OPERATION_COUNT = INTERACTION_AFFORDANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.MultiLanguageImpl <em>Multi Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.MultiLanguageImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getMultiLanguage()
	 * @generated
	 */
	int MULTI_LANGUAGE = 6;

	/**
	 * The number of structural features of the '<em>Multi Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Multi Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LANGUAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.StringToEventMapImpl <em>String To Event Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.StringToEventMapImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getStringToEventMap()
	 * @generated
	 */
	int STRING_TO_EVENT_MAP = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_EVENT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_EVENT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Event Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_EVENT_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Event Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_EVENT_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.StringToActionMapImpl <em>String To Action Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.StringToActionMapImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getStringToActionMap()
	 * @generated
	 */
	int STRING_TO_ACTION_MAP = 8;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ACTION_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ACTION_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Action Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ACTION_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Action Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ACTION_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.StringToPropertyMapImpl <em>String To Property Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.StringToPropertyMapImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getStringToPropertyMap()
	 * @generated
	 */
	int STRING_TO_PROPERTY_MAP = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PROPERTY_MAP__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PROPERTY_MAP__KEY = 1;

	/**
	 * The number of structural features of the '<em>String To Property Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PROPERTY_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Property Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_PROPERTY_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.LinkImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 10;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HREF = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REL = 2;

	/**
	 * The feature id for the '<em><b>Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ANCHOR = 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.FormImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 11;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__OP = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__HREF = 1;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CONTENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Content Coding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CONTENT_CODING = 3;

	/**
	 * The feature id for the '<em><b>Subprotocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SUBPROTOCOL = 4;

	/**
	 * The feature id for the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SECURITY = 5;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SCOPES = 6;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__RESPONSE = 7;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.ExpectedResponseImpl <em>Expected Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.ExpectedResponseImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getExpectedResponse()
	 * @generated
	 */
	int EXPECTED_RESPONSE = 12;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_RESPONSE__CONTENT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Expected Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expected Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.DataSchemaImpl <em>Data Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.DataSchemaImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getDataSchema()
	 * @generated
	 */
	int DATA_SCHEMA = 13;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__SEMANTIC_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__UNIT = 4;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__ENUM = 5;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__ONE_OF = 6;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__TITLES = 7;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__DESCRIPTIONS = 8;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__CONST = 9;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__READ_ONLY = 10;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__WRITE_ONLY = 11;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__FORMAT = 12;

	/**
	 * The number of structural features of the '<em>Data Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Data Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.ArraySchemaImpl <em>Array Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.ArraySchemaImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getArraySchema()
	 * @generated
	 */
	int ARRAY_SCHEMA = 14;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__SEMANTIC_TYPE = DATA_SCHEMA__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__TITLE = DATA_SCHEMA__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__DESCRIPTION = DATA_SCHEMA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__UNIT = DATA_SCHEMA__UNIT;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__ONE_OF = DATA_SCHEMA__ONE_OF;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__TITLES = DATA_SCHEMA__TITLES;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__DESCRIPTIONS = DATA_SCHEMA__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__READ_ONLY = DATA_SCHEMA__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__WRITE_ONLY = DATA_SCHEMA__WRITE_ONLY;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__FORMAT = DATA_SCHEMA__FORMAT;

	/**
	 * The feature id for the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__MIN_ITEMS = DATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__MAX_ITEMS = DATA_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA__ITEMS = DATA_SCHEMA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Array Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Array Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.ObjectSchemaImpl <em>Object Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.ObjectSchemaImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getObjectSchema()
	 * @generated
	 */
	int OBJECT_SCHEMA = 15;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__SEMANTIC_TYPE = DATA_SCHEMA__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__TITLE = DATA_SCHEMA__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__DESCRIPTION = DATA_SCHEMA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__UNIT = DATA_SCHEMA__UNIT;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__ONE_OF = DATA_SCHEMA__ONE_OF;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__TITLES = DATA_SCHEMA__TITLES;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__DESCRIPTIONS = DATA_SCHEMA__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__READ_ONLY = DATA_SCHEMA__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__WRITE_ONLY = DATA_SCHEMA__WRITE_ONLY;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__FORMAT = DATA_SCHEMA__FORMAT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__REQUIRED = DATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA__PROPERTIES = DATA_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.StringSchemaImpl <em>String Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.StringSchemaImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getStringSchema()
	 * @generated
	 */
	int STRING_SCHEMA = 16;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__SEMANTIC_TYPE = DATA_SCHEMA__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__TITLE = DATA_SCHEMA__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__DESCRIPTION = DATA_SCHEMA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__UNIT = DATA_SCHEMA__UNIT;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__ONE_OF = DATA_SCHEMA__ONE_OF;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__TITLES = DATA_SCHEMA__TITLES;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__DESCRIPTIONS = DATA_SCHEMA__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__READ_ONLY = DATA_SCHEMA__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__WRITE_ONLY = DATA_SCHEMA__WRITE_ONLY;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA__FORMAT = DATA_SCHEMA__FORMAT;

	/**
	 * The number of structural features of the '<em>String Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.BooleanSchemaImpl <em>Boolean Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.BooleanSchemaImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getBooleanSchema()
	 * @generated
	 */
	int BOOLEAN_SCHEMA = 17;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__SEMANTIC_TYPE = DATA_SCHEMA__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__TITLE = DATA_SCHEMA__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__DESCRIPTION = DATA_SCHEMA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__UNIT = DATA_SCHEMA__UNIT;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__ONE_OF = DATA_SCHEMA__ONE_OF;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__TITLES = DATA_SCHEMA__TITLES;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__DESCRIPTIONS = DATA_SCHEMA__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__READ_ONLY = DATA_SCHEMA__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__WRITE_ONLY = DATA_SCHEMA__WRITE_ONLY;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA__FORMAT = DATA_SCHEMA__FORMAT;

	/**
	 * The number of structural features of the '<em>Boolean Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.NumberSchemaImpl <em>Number Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.NumberSchemaImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getNumberSchema()
	 * @generated
	 */
	int NUMBER_SCHEMA = 18;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__SEMANTIC_TYPE = DATA_SCHEMA__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__TITLE = DATA_SCHEMA__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__DESCRIPTION = DATA_SCHEMA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__UNIT = DATA_SCHEMA__UNIT;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__ONE_OF = DATA_SCHEMA__ONE_OF;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__TITLES = DATA_SCHEMA__TITLES;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__DESCRIPTIONS = DATA_SCHEMA__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__READ_ONLY = DATA_SCHEMA__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__WRITE_ONLY = DATA_SCHEMA__WRITE_ONLY;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__FORMAT = DATA_SCHEMA__FORMAT;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__MINIMUM = DATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA__MAXIMUM = DATA_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Number Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.IntegerSchemaImpl <em>Integer Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.IntegerSchemaImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getIntegerSchema()
	 * @generated
	 */
	int INTEGER_SCHEMA = 19;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__SEMANTIC_TYPE = DATA_SCHEMA__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__TITLE = DATA_SCHEMA__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__DESCRIPTION = DATA_SCHEMA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__UNIT = DATA_SCHEMA__UNIT;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__ONE_OF = DATA_SCHEMA__ONE_OF;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__TITLES = DATA_SCHEMA__TITLES;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__DESCRIPTIONS = DATA_SCHEMA__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__READ_ONLY = DATA_SCHEMA__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__WRITE_ONLY = DATA_SCHEMA__WRITE_ONLY;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__FORMAT = DATA_SCHEMA__FORMAT;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__MINIMUM = DATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA__MAXIMUM = DATA_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Integer Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.NullSchemaImpl <em>Null Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.NullSchemaImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getNullSchema()
	 * @generated
	 */
	int NULL_SCHEMA = 20;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__SEMANTIC_TYPE = DATA_SCHEMA__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__TITLE = DATA_SCHEMA__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__DESCRIPTION = DATA_SCHEMA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__TYPE = DATA_SCHEMA__TYPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__UNIT = DATA_SCHEMA__UNIT;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__ENUM = DATA_SCHEMA__ENUM;

	/**
	 * The feature id for the '<em><b>One Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__ONE_OF = DATA_SCHEMA__ONE_OF;

	/**
	 * The feature id for the '<em><b>Titles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__TITLES = DATA_SCHEMA__TITLES;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__DESCRIPTIONS = DATA_SCHEMA__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__CONST = DATA_SCHEMA__CONST;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__READ_ONLY = DATA_SCHEMA__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__WRITE_ONLY = DATA_SCHEMA__WRITE_ONLY;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA__FORMAT = DATA_SCHEMA__FORMAT;

	/**
	 * The number of structural features of the '<em>Null Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA_FEATURE_COUNT = DATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_SCHEMA_OPERATION_COUNT = DATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.SecuritySchemeImpl <em>Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.SecuritySchemeImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getSecurityScheme()
	 * @generated
	 */
	int SECURITY_SCHEME = 21;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__SEMANTIC_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__PROXY = 2;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__SCHEME = 3;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__DESCRIPTIONS = 4;

	/**
	 * The number of structural features of the '<em>Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.NoSecuritySchemeImpl <em>No Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.NoSecuritySchemeImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getNoSecurityScheme()
	 * @generated
	 */
	int NO_SECURITY_SCHEME = 22;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The number of structural features of the '<em>No Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.BasicSecuritySchemeImpl <em>Basic Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.BasicSecuritySchemeImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getBasicSecurityScheme()
	 * @generated
	 */
	int BASIC_SECURITY_SCHEME = 23;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Basic Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.DigestSecuritySchemeImpl <em>Digest Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.DigestSecuritySchemeImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getDigestSecurityScheme()
	 * @generated
	 */
	int DIGEST_SECURITY_SCHEME = 24;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Qop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__QOP = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Digest Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Digest Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.APIKeySecuritySchemeImpl <em>API Key Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.APIKeySecuritySchemeImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getAPIKeySecurityScheme()
	 * @generated
	 */
	int API_KEY_SECURITY_SCHEME = 25;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>API Key Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>API Key Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_KEY_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.BearerSecuritySchemeImpl <em>Bearer Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.BearerSecuritySchemeImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getBearerSecurityScheme()
	 * @generated
	 */
	int BEARER_SECURITY_SCHEME = 26;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__AUTHORIZATION = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__ALG = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__FORMAT = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Bearer Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Bearer Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARER_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.CertSecuritySchemeImpl <em>Cert Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.CertSecuritySchemeImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getCertSecurityScheme()
	 * @generated
	 */
	int CERT_SECURITY_SCHEME = 27;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME__IDENTITY = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cert Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cert Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERT_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.PSKSecuritySchemeImpl <em>PSK Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.PSKSecuritySchemeImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getPSKSecurityScheme()
	 * @generated
	 */
	int PSK_SECURITY_SCHEME = 28;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME__IDENTITY = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PSK Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PSK Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSK_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.PublicSecuritySchemeImpl <em>Public Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.PublicSecuritySchemeImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getPublicSecurityScheme()
	 * @generated
	 */
	int PUBLIC_SECURITY_SCHEME = 29;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME__IDENTITY = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Public Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Public Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.PoPSecuritySchemeImpl <em>Po PSecurity Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.PoPSecuritySchemeImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getPoPSecurityScheme()
	 * @generated
	 */
	int PO_PSECURITY_SCHEME = 30;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__AUTHORIZATION = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__ALG = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__FORMAT = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__IN = SECURITY_SCHEME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME__NAME = SECURITY_SCHEME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Po PSecurity Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Po PSecurity Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_PSECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.impl.OAuth2SecuritySchemeImpl <em>OAuth2 Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.impl.OAuth2SecuritySchemeImpl
	 * @see w3c_td.impl.W3c_tdPackageImpl#getOAuth2SecurityScheme()
	 * @generated
	 */
	int OAUTH2_SECURITY_SCHEME = 31;

	/**
	 * The feature id for the '<em><b>Semantic Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__SEMANTIC_TYPE = SECURITY_SCHEME__SEMANTIC_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__DESCRIPTION = SECURITY_SCHEME__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__PROXY = SECURITY_SCHEME__PROXY;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__SCHEME = SECURITY_SCHEME__SCHEME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__DESCRIPTIONS = SECURITY_SCHEME__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__AUTHORIZATION = SECURITY_SCHEME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__TOKEN = SECURITY_SCHEME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refresh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__REFRESH = SECURITY_SCHEME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__SCOPES = SECURITY_SCHEME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME__FLOW = SECURITY_SCHEME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>OAuth2 Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME_FEATURE_COUNT = SECURITY_SCHEME_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>OAuth2 Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_SECURITY_SCHEME_OPERATION_COUNT = SECURITY_SCHEME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link w3c_td.NewEnum1 <em>New Enum1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.NewEnum1
	 * @see w3c_td.impl.W3c_tdPackageImpl#getNewEnum1()
	 * @generated
	 */
	int NEW_ENUM1 = 32;


	/**
	 * Returns the meta object for class '{@link w3c_td.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see w3c_td.Thing
	 * @generated
	 */
	EClass getThing();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.Thing#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see w3c_td.Thing#getId()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Id();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.Thing#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see w3c_td.Thing#getTitle()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Title();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.Thing#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see w3c_td.Thing#getDescription()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Description();

	/**
	 * Returns the meta object for the attribute list '{@link w3c_td.Thing#getSemanticContext <em>Semantic Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Semantic Context</em>'.
	 * @see w3c_td.Thing#getSemanticContext()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_SemanticContext();

	/**
	 * Returns the meta object for the attribute list '{@link w3c_td.Thing#getSemanticType <em>Semantic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Semantic Type</em>'.
	 * @see w3c_td.Thing#getSemanticType()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_SemanticType();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.Thing#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see w3c_td.Thing#getCreated()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Created();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.Thing#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see w3c_td.Thing#getModified()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Modified();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.Thing#getSupport <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Support</em>'.
	 * @see w3c_td.Thing#getSupport()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Support();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.Thing#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see w3c_td.Thing#getBase()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Base();

	/**
	 * Returns the meta object for the attribute list '{@link w3c_td.Thing#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Security</em>'.
	 * @see w3c_td.Thing#getSecurity()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Security();

	/**
	 * Returns the meta object for the containment reference list '{@link w3c_td.Thing#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see w3c_td.Thing#getLinks()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Links();

	/**
	 * Returns the meta object for the reference list '{@link w3c_td.Thing#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forms</em>'.
	 * @see w3c_td.Thing#getForms()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Forms();

	/**
	 * Returns the meta object for the reference '{@link w3c_td.Thing#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version</em>'.
	 * @see w3c_td.Thing#getVersion()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Version();

	/**
	 * Returns the meta object for the reference list '{@link w3c_td.Thing#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Titles</em>'.
	 * @see w3c_td.Thing#getTitles()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Titles();

	/**
	 * Returns the meta object for the containment reference list '{@link w3c_td.Thing#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see w3c_td.Thing#getDescriptions()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Descriptions();

	/**
	 * Returns the meta object for the map '{@link w3c_td.Thing#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Events</em>'.
	 * @see w3c_td.Thing#getEvents()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Events();

	/**
	 * Returns the meta object for the map '{@link w3c_td.Thing#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Actions</em>'.
	 * @see w3c_td.Thing#getActions()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Actions();

	/**
	 * Returns the meta object for the map '{@link w3c_td.Thing#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Properties</em>'.
	 * @see w3c_td.Thing#getProperties()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Properties();

	/**
	 * Returns the meta object for class '{@link w3c_td.VersionInfo <em>Version Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Info</em>'.
	 * @see w3c_td.VersionInfo
	 * @generated
	 */
	EClass getVersionInfo();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.VersionInfo#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see w3c_td.VersionInfo#getInstance()
	 * @see #getVersionInfo()
	 * @generated
	 */
	EAttribute getVersionInfo_Instance();

	/**
	 * Returns the meta object for class '{@link w3c_td.PropertyAffordance <em>Property Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Affordance</em>'.
	 * @see w3c_td.PropertyAffordance
	 * @generated
	 */
	EClass getPropertyAffordance();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.PropertyAffordance#isObservable <em>Observable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observable</em>'.
	 * @see w3c_td.PropertyAffordance#isObservable()
	 * @see #getPropertyAffordance()
	 * @generated
	 */
	EAttribute getPropertyAffordance_Observable();

	/**
	 * Returns the meta object for class '{@link w3c_td.InteractionAffordance <em>Interaction Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Affordance</em>'.
	 * @see w3c_td.InteractionAffordance
	 * @generated
	 */
	EClass getInteractionAffordance();

	/**
	 * Returns the meta object for the containment reference list '{@link w3c_td.InteractionAffordance#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forms</em>'.
	 * @see w3c_td.InteractionAffordance#getForms()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EReference getInteractionAffordance_Forms();

	/**
	 * Returns the meta object for the reference '{@link w3c_td.InteractionAffordance#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Titles</em>'.
	 * @see w3c_td.InteractionAffordance#getTitles()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EReference getInteractionAffordance_Titles();

	/**
	 * Returns the meta object for the reference '{@link w3c_td.InteractionAffordance#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Descriptions</em>'.
	 * @see w3c_td.InteractionAffordance#getDescriptions()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EReference getInteractionAffordance_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.InteractionAffordance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see w3c_td.InteractionAffordance#getType()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EAttribute getInteractionAffordance_Type();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.InteractionAffordance#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see w3c_td.InteractionAffordance#getTitle()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EAttribute getInteractionAffordance_Title();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.InteractionAffordance#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see w3c_td.InteractionAffordance#getDescription()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EAttribute getInteractionAffordance_Description();

	/**
	 * Returns the meta object for class '{@link w3c_td.EventAffordance <em>Event Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Affordance</em>'.
	 * @see w3c_td.EventAffordance
	 * @generated
	 */
	EClass getEventAffordance();

	/**
	 * Returns the meta object for class '{@link w3c_td.ActionAffordance <em>Action Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Affordance</em>'.
	 * @see w3c_td.ActionAffordance
	 * @generated
	 */
	EClass getActionAffordance();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.ActionAffordance#isSafe <em>Safe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safe</em>'.
	 * @see w3c_td.ActionAffordance#isSafe()
	 * @see #getActionAffordance()
	 * @generated
	 */
	EAttribute getActionAffordance_Safe();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.ActionAffordance#isIdempotent <em>Idempotent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idempotent</em>'.
	 * @see w3c_td.ActionAffordance#isIdempotent()
	 * @see #getActionAffordance()
	 * @generated
	 */
	EAttribute getActionAffordance_Idempotent();

	/**
	 * Returns the meta object for class '{@link w3c_td.MultiLanguage <em>Multi Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Language</em>'.
	 * @see w3c_td.MultiLanguage
	 * @generated
	 */
	EClass getMultiLanguage();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Event Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Event Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="w3c_td.EventAffordance" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	EClass getStringToEventMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToEventMap()
	 * @generated
	 */
	EAttribute getStringToEventMap_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToEventMap()
	 * @generated
	 */
	EReference getStringToEventMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Action Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Action Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="w3c_td.ActionAffordance" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	EClass getStringToActionMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToActionMap()
	 * @generated
	 */
	EAttribute getStringToActionMap_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToActionMap()
	 * @generated
	 */
	EReference getStringToActionMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Property Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Property Map</em>'.
	 * @see java.util.Map.Entry
	 * @model features="value key" 
	 *        valueType="w3c_td.PropertyAffordance" valueContainment="true" valueRequired="true"
	 *        keyDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getStringToPropertyMap();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToPropertyMap()
	 * @generated
	 */
	EReference getStringToPropertyMap_Value();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToPropertyMap()
	 * @generated
	 */
	EAttribute getStringToPropertyMap_Key();

	/**
	 * Returns the meta object for class '{@link w3c_td.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see w3c_td.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.Link#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see w3c_td.Link#getHref()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Href();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.Link#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see w3c_td.Link#getType()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Type();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.Link#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see w3c_td.Link#getRel()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Rel();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.Link#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor</em>'.
	 * @see w3c_td.Link#getAnchor()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Anchor();

	/**
	 * Returns the meta object for class '{@link w3c_td.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see w3c_td.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute list '{@link w3c_td.Form#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Op</em>'.
	 * @see w3c_td.Form#getOp()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Op();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.Form#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see w3c_td.Form#getHref()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Href();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.Form#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see w3c_td.Form#getContentType()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.Form#getContentCoding <em>Content Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Coding</em>'.
	 * @see w3c_td.Form#getContentCoding()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_ContentCoding();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.Form#getSubprotocol <em>Subprotocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subprotocol</em>'.
	 * @see w3c_td.Form#getSubprotocol()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Subprotocol();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.Form#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security</em>'.
	 * @see w3c_td.Form#getSecurity()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Security();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.Form#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scopes</em>'.
	 * @see w3c_td.Form#getScopes()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Scopes();

	/**
	 * Returns the meta object for the reference '{@link w3c_td.Form#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response</em>'.
	 * @see w3c_td.Form#getResponse()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Response();

	/**
	 * Returns the meta object for class '{@link w3c_td.ExpectedResponse <em>Expected Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected Response</em>'.
	 * @see w3c_td.ExpectedResponse
	 * @generated
	 */
	EClass getExpectedResponse();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.ExpectedResponse#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see w3c_td.ExpectedResponse#getContentType()
	 * @see #getExpectedResponse()
	 * @generated
	 */
	EAttribute getExpectedResponse_ContentType();

	/**
	 * Returns the meta object for class '{@link w3c_td.DataSchema <em>Data Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Schema</em>'.
	 * @see w3c_td.DataSchema
	 * @generated
	 */
	EClass getDataSchema();

	/**
	 * Returns the meta object for the attribute list '{@link w3c_td.DataSchema#getSemanticType <em>Semantic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Semantic Type</em>'.
	 * @see w3c_td.DataSchema#getSemanticType()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_SemanticType();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.DataSchema#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see w3c_td.DataSchema#getTitle()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Title();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.DataSchema#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see w3c_td.DataSchema#getDescription()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Description();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.DataSchema#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see w3c_td.DataSchema#getType()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Type();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.DataSchema#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see w3c_td.DataSchema#getUnit()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Unit();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.DataSchema#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum</em>'.
	 * @see w3c_td.DataSchema#getEnum()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Enum();

	/**
	 * Returns the meta object for the reference list '{@link w3c_td.DataSchema#getOneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>One Of</em>'.
	 * @see w3c_td.DataSchema#getOneOf()
	 * @see #getDataSchema()
	 * @generated
	 */
	EReference getDataSchema_OneOf();

	/**
	 * Returns the meta object for the reference list '{@link w3c_td.DataSchema#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Titles</em>'.
	 * @see w3c_td.DataSchema#getTitles()
	 * @see #getDataSchema()
	 * @generated
	 */
	EReference getDataSchema_Titles();

	/**
	 * Returns the meta object for the reference list '{@link w3c_td.DataSchema#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Descriptions</em>'.
	 * @see w3c_td.DataSchema#getDescriptions()
	 * @see #getDataSchema()
	 * @generated
	 */
	EReference getDataSchema_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.DataSchema#getConst <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Const</em>'.
	 * @see w3c_td.DataSchema#getConst()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Const();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.DataSchema#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see w3c_td.DataSchema#isReadOnly()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.DataSchema#isWriteOnly <em>Write Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Only</em>'.
	 * @see w3c_td.DataSchema#isWriteOnly()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_WriteOnly();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.DataSchema#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see w3c_td.DataSchema#getFormat()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Format();

	/**
	 * Returns the meta object for class '{@link w3c_td.ArraySchema <em>Array Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Schema</em>'.
	 * @see w3c_td.ArraySchema
	 * @generated
	 */
	EClass getArraySchema();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.ArraySchema#getMinItems <em>Min Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Items</em>'.
	 * @see w3c_td.ArraySchema#getMinItems()
	 * @see #getArraySchema()
	 * @generated
	 */
	EAttribute getArraySchema_MinItems();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.ArraySchema#getMaxItems <em>Max Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Items</em>'.
	 * @see w3c_td.ArraySchema#getMaxItems()
	 * @see #getArraySchema()
	 * @generated
	 */
	EAttribute getArraySchema_MaxItems();

	/**
	 * Returns the meta object for the containment reference list '{@link w3c_td.ArraySchema#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see w3c_td.ArraySchema#getItems()
	 * @see #getArraySchema()
	 * @generated
	 */
	EReference getArraySchema_Items();

	/**
	 * Returns the meta object for class '{@link w3c_td.ObjectSchema <em>Object Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Schema</em>'.
	 * @see w3c_td.ObjectSchema
	 * @generated
	 */
	EClass getObjectSchema();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.ObjectSchema#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see w3c_td.ObjectSchema#getRequired()
	 * @see #getObjectSchema()
	 * @generated
	 */
	EAttribute getObjectSchema_Required();

	/**
	 * Returns the meta object for the containment reference list '{@link w3c_td.ObjectSchema#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see w3c_td.ObjectSchema#getProperties()
	 * @see #getObjectSchema()
	 * @generated
	 */
	EReference getObjectSchema_Properties();

	/**
	 * Returns the meta object for class '{@link w3c_td.StringSchema <em>String Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Schema</em>'.
	 * @see w3c_td.StringSchema
	 * @generated
	 */
	EClass getStringSchema();

	/**
	 * Returns the meta object for class '{@link w3c_td.BooleanSchema <em>Boolean Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Schema</em>'.
	 * @see w3c_td.BooleanSchema
	 * @generated
	 */
	EClass getBooleanSchema();

	/**
	 * Returns the meta object for class '{@link w3c_td.NumberSchema <em>Number Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Schema</em>'.
	 * @see w3c_td.NumberSchema
	 * @generated
	 */
	EClass getNumberSchema();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.NumberSchema#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see w3c_td.NumberSchema#getMinimum()
	 * @see #getNumberSchema()
	 * @generated
	 */
	EAttribute getNumberSchema_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.NumberSchema#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see w3c_td.NumberSchema#getMaximum()
	 * @see #getNumberSchema()
	 * @generated
	 */
	EAttribute getNumberSchema_Maximum();

	/**
	 * Returns the meta object for class '{@link w3c_td.IntegerSchema <em>Integer Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Schema</em>'.
	 * @see w3c_td.IntegerSchema
	 * @generated
	 */
	EClass getIntegerSchema();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.IntegerSchema#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see w3c_td.IntegerSchema#getMinimum()
	 * @see #getIntegerSchema()
	 * @generated
	 */
	EAttribute getIntegerSchema_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.IntegerSchema#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see w3c_td.IntegerSchema#getMaximum()
	 * @see #getIntegerSchema()
	 * @generated
	 */
	EAttribute getIntegerSchema_Maximum();

	/**
	 * Returns the meta object for class '{@link w3c_td.NullSchema <em>Null Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Schema</em>'.
	 * @see w3c_td.NullSchema
	 * @generated
	 */
	EClass getNullSchema();

	/**
	 * Returns the meta object for class '{@link w3c_td.SecurityScheme <em>Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Scheme</em>'.
	 * @see w3c_td.SecurityScheme
	 * @generated
	 */
	EClass getSecurityScheme();

	/**
	 * Returns the meta object for the attribute list '{@link w3c_td.SecurityScheme#getSemanticType <em>Semantic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Semantic Type</em>'.
	 * @see w3c_td.SecurityScheme#getSemanticType()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_SemanticType();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.SecurityScheme#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see w3c_td.SecurityScheme#getDescription()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Description();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.SecurityScheme#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy</em>'.
	 * @see w3c_td.SecurityScheme#getProxy()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Proxy();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.SecurityScheme#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see w3c_td.SecurityScheme#getScheme()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Scheme();

	/**
	 * Returns the meta object for the reference '{@link w3c_td.SecurityScheme#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Descriptions</em>'.
	 * @see w3c_td.SecurityScheme#getDescriptions()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EReference getSecurityScheme_Descriptions();

	/**
	 * Returns the meta object for class '{@link w3c_td.NoSecurityScheme <em>No Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Security Scheme</em>'.
	 * @see w3c_td.NoSecurityScheme
	 * @generated
	 */
	EClass getNoSecurityScheme();

	/**
	 * Returns the meta object for class '{@link w3c_td.BasicSecurityScheme <em>Basic Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Security Scheme</em>'.
	 * @see w3c_td.BasicSecurityScheme
	 * @generated
	 */
	EClass getBasicSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.BasicSecurityScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see w3c_td.BasicSecurityScheme#getIn()
	 * @see #getBasicSecurityScheme()
	 * @generated
	 */
	EAttribute getBasicSecurityScheme_In();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.BasicSecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see w3c_td.BasicSecurityScheme#getName()
	 * @see #getBasicSecurityScheme()
	 * @generated
	 */
	EAttribute getBasicSecurityScheme_Name();

	/**
	 * Returns the meta object for class '{@link w3c_td.DigestSecurityScheme <em>Digest Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digest Security Scheme</em>'.
	 * @see w3c_td.DigestSecurityScheme
	 * @generated
	 */
	EClass getDigestSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.DigestSecurityScheme#getQop <em>Qop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qop</em>'.
	 * @see w3c_td.DigestSecurityScheme#getQop()
	 * @see #getDigestSecurityScheme()
	 * @generated
	 */
	EAttribute getDigestSecurityScheme_Qop();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.DigestSecurityScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see w3c_td.DigestSecurityScheme#getIn()
	 * @see #getDigestSecurityScheme()
	 * @generated
	 */
	EAttribute getDigestSecurityScheme_In();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.DigestSecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see w3c_td.DigestSecurityScheme#getName()
	 * @see #getDigestSecurityScheme()
	 * @generated
	 */
	EAttribute getDigestSecurityScheme_Name();

	/**
	 * Returns the meta object for class '{@link w3c_td.APIKeySecurityScheme <em>API Key Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Key Security Scheme</em>'.
	 * @see w3c_td.APIKeySecurityScheme
	 * @generated
	 */
	EClass getAPIKeySecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.APIKeySecurityScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see w3c_td.APIKeySecurityScheme#getIn()
	 * @see #getAPIKeySecurityScheme()
	 * @generated
	 */
	EAttribute getAPIKeySecurityScheme_In();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.APIKeySecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see w3c_td.APIKeySecurityScheme#getName()
	 * @see #getAPIKeySecurityScheme()
	 * @generated
	 */
	EAttribute getAPIKeySecurityScheme_Name();

	/**
	 * Returns the meta object for class '{@link w3c_td.BearerSecurityScheme <em>Bearer Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bearer Security Scheme</em>'.
	 * @see w3c_td.BearerSecurityScheme
	 * @generated
	 */
	EClass getBearerSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.BearerSecurityScheme#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization</em>'.
	 * @see w3c_td.BearerSecurityScheme#getAuthorization()
	 * @see #getBearerSecurityScheme()
	 * @generated
	 */
	EAttribute getBearerSecurityScheme_Authorization();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.BearerSecurityScheme#getAlg <em>Alg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alg</em>'.
	 * @see w3c_td.BearerSecurityScheme#getAlg()
	 * @see #getBearerSecurityScheme()
	 * @generated
	 */
	EAttribute getBearerSecurityScheme_Alg();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.BearerSecurityScheme#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see w3c_td.BearerSecurityScheme#getFormat()
	 * @see #getBearerSecurityScheme()
	 * @generated
	 */
	EAttribute getBearerSecurityScheme_Format();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.BearerSecurityScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see w3c_td.BearerSecurityScheme#getIn()
	 * @see #getBearerSecurityScheme()
	 * @generated
	 */
	EAttribute getBearerSecurityScheme_In();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.BearerSecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see w3c_td.BearerSecurityScheme#getName()
	 * @see #getBearerSecurityScheme()
	 * @generated
	 */
	EAttribute getBearerSecurityScheme_Name();

	/**
	 * Returns the meta object for class '{@link w3c_td.CertSecurityScheme <em>Cert Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cert Security Scheme</em>'.
	 * @see w3c_td.CertSecurityScheme
	 * @generated
	 */
	EClass getCertSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.CertSecurityScheme#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see w3c_td.CertSecurityScheme#getIdentity()
	 * @see #getCertSecurityScheme()
	 * @generated
	 */
	EAttribute getCertSecurityScheme_Identity();

	/**
	 * Returns the meta object for class '{@link w3c_td.PSKSecurityScheme <em>PSK Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSK Security Scheme</em>'.
	 * @see w3c_td.PSKSecurityScheme
	 * @generated
	 */
	EClass getPSKSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.PSKSecurityScheme#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see w3c_td.PSKSecurityScheme#getIdentity()
	 * @see #getPSKSecurityScheme()
	 * @generated
	 */
	EAttribute getPSKSecurityScheme_Identity();

	/**
	 * Returns the meta object for class '{@link w3c_td.PublicSecurityScheme <em>Public Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Security Scheme</em>'.
	 * @see w3c_td.PublicSecurityScheme
	 * @generated
	 */
	EClass getPublicSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.PublicSecurityScheme#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see w3c_td.PublicSecurityScheme#getIdentity()
	 * @see #getPublicSecurityScheme()
	 * @generated
	 */
	EAttribute getPublicSecurityScheme_Identity();

	/**
	 * Returns the meta object for class '{@link w3c_td.PoPSecurityScheme <em>Po PSecurity Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Po PSecurity Scheme</em>'.
	 * @see w3c_td.PoPSecurityScheme
	 * @generated
	 */
	EClass getPoPSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.PoPSecurityScheme#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization</em>'.
	 * @see w3c_td.PoPSecurityScheme#getAuthorization()
	 * @see #getPoPSecurityScheme()
	 * @generated
	 */
	EAttribute getPoPSecurityScheme_Authorization();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.PoPSecurityScheme#getAlg <em>Alg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alg</em>'.
	 * @see w3c_td.PoPSecurityScheme#getAlg()
	 * @see #getPoPSecurityScheme()
	 * @generated
	 */
	EAttribute getPoPSecurityScheme_Alg();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.PoPSecurityScheme#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see w3c_td.PoPSecurityScheme#getFormat()
	 * @see #getPoPSecurityScheme()
	 * @generated
	 */
	EAttribute getPoPSecurityScheme_Format();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.PoPSecurityScheme#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see w3c_td.PoPSecurityScheme#getIn()
	 * @see #getPoPSecurityScheme()
	 * @generated
	 */
	EAttribute getPoPSecurityScheme_In();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.PoPSecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see w3c_td.PoPSecurityScheme#getName()
	 * @see #getPoPSecurityScheme()
	 * @generated
	 */
	EAttribute getPoPSecurityScheme_Name();

	/**
	 * Returns the meta object for class '{@link w3c_td.OAuth2SecurityScheme <em>OAuth2 Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth2 Security Scheme</em>'.
	 * @see w3c_td.OAuth2SecurityScheme
	 * @generated
	 */
	EClass getOAuth2SecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.OAuth2SecurityScheme#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization</em>'.
	 * @see w3c_td.OAuth2SecurityScheme#getAuthorization()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_Authorization();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.OAuth2SecurityScheme#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see w3c_td.OAuth2SecurityScheme#getToken()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_Token();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.OAuth2SecurityScheme#getRefresh <em>Refresh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh</em>'.
	 * @see w3c_td.OAuth2SecurityScheme#getRefresh()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_Refresh();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.OAuth2SecurityScheme#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scopes</em>'.
	 * @see w3c_td.OAuth2SecurityScheme#getScopes()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_Scopes();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.OAuth2SecurityScheme#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow</em>'.
	 * @see w3c_td.OAuth2SecurityScheme#getFlow()
	 * @see #getOAuth2SecurityScheme()
	 * @generated
	 */
	EAttribute getOAuth2SecurityScheme_Flow();

	/**
	 * Returns the meta object for enum '{@link w3c_td.NewEnum1 <em>New Enum1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>New Enum1</em>'.
	 * @see w3c_td.NewEnum1
	 * @generated
	 */
	EEnum getNewEnum1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	W3c_tdFactory getW3c_tdFactory();

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
		 * The meta object literal for the '{@link w3c_td.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.ThingImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getThing()
		 * @generated
		 */
		EClass THING = eINSTANCE.getThing();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__ID = eINSTANCE.getThing_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__TITLE = eINSTANCE.getThing_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__DESCRIPTION = eINSTANCE.getThing_Description();

		/**
		 * The meta object literal for the '<em><b>Semantic Context</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__SEMANTIC_CONTEXT = eINSTANCE.getThing_SemanticContext();

		/**
		 * The meta object literal for the '<em><b>Semantic Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__SEMANTIC_TYPE = eINSTANCE.getThing_SemanticType();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__CREATED = eINSTANCE.getThing_Created();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__MODIFIED = eINSTANCE.getThing_Modified();

		/**
		 * The meta object literal for the '<em><b>Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__SUPPORT = eINSTANCE.getThing_Support();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__BASE = eINSTANCE.getThing_Base();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__SECURITY = eINSTANCE.getThing_Security();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__LINKS = eINSTANCE.getThing_Links();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__FORMS = eINSTANCE.getThing_Forms();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__VERSION = eINSTANCE.getThing_Version();

		/**
		 * The meta object literal for the '<em><b>Titles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__TITLES = eINSTANCE.getThing_Titles();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__DESCRIPTIONS = eINSTANCE.getThing_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__EVENTS = eINSTANCE.getThing_Events();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__ACTIONS = eINSTANCE.getThing_Actions();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__PROPERTIES = eINSTANCE.getThing_Properties();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.VersionInfoImpl <em>Version Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.VersionInfoImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getVersionInfo()
		 * @generated
		 */
		EClass VERSION_INFO = eINSTANCE.getVersionInfo();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_INFO__INSTANCE = eINSTANCE.getVersionInfo_Instance();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.PropertyAffordanceImpl <em>Property Affordance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.PropertyAffordanceImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getPropertyAffordance()
		 * @generated
		 */
		EClass PROPERTY_AFFORDANCE = eINSTANCE.getPropertyAffordance();

		/**
		 * The meta object literal for the '<em><b>Observable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_AFFORDANCE__OBSERVABLE = eINSTANCE.getPropertyAffordance_Observable();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.InteractionAffordanceImpl <em>Interaction Affordance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.InteractionAffordanceImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getInteractionAffordance()
		 * @generated
		 */
		EClass INTERACTION_AFFORDANCE = eINSTANCE.getInteractionAffordance();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_AFFORDANCE__FORMS = eINSTANCE.getInteractionAffordance_Forms();

		/**
		 * The meta object literal for the '<em><b>Titles</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_AFFORDANCE__TITLES = eINSTANCE.getInteractionAffordance_Titles();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_AFFORDANCE__DESCRIPTIONS = eINSTANCE.getInteractionAffordance_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_AFFORDANCE__TYPE = eINSTANCE.getInteractionAffordance_Type();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_AFFORDANCE__TITLE = eINSTANCE.getInteractionAffordance_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_AFFORDANCE__DESCRIPTION = eINSTANCE.getInteractionAffordance_Description();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.EventAffordanceImpl <em>Event Affordance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.EventAffordanceImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getEventAffordance()
		 * @generated
		 */
		EClass EVENT_AFFORDANCE = eINSTANCE.getEventAffordance();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.ActionAffordanceImpl <em>Action Affordance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.ActionAffordanceImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getActionAffordance()
		 * @generated
		 */
		EClass ACTION_AFFORDANCE = eINSTANCE.getActionAffordance();

		/**
		 * The meta object literal for the '<em><b>Safe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_AFFORDANCE__SAFE = eINSTANCE.getActionAffordance_Safe();

		/**
		 * The meta object literal for the '<em><b>Idempotent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_AFFORDANCE__IDEMPOTENT = eINSTANCE.getActionAffordance_Idempotent();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.MultiLanguageImpl <em>Multi Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.MultiLanguageImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getMultiLanguage()
		 * @generated
		 */
		EClass MULTI_LANGUAGE = eINSTANCE.getMultiLanguage();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.StringToEventMapImpl <em>String To Event Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.StringToEventMapImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getStringToEventMap()
		 * @generated
		 */
		EClass STRING_TO_EVENT_MAP = eINSTANCE.getStringToEventMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_EVENT_MAP__KEY = eINSTANCE.getStringToEventMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_EVENT_MAP__VALUE = eINSTANCE.getStringToEventMap_Value();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.StringToActionMapImpl <em>String To Action Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.StringToActionMapImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getStringToActionMap()
		 * @generated
		 */
		EClass STRING_TO_ACTION_MAP = eINSTANCE.getStringToActionMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_ACTION_MAP__KEY = eINSTANCE.getStringToActionMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_ACTION_MAP__VALUE = eINSTANCE.getStringToActionMap_Value();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.StringToPropertyMapImpl <em>String To Property Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.StringToPropertyMapImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getStringToPropertyMap()
		 * @generated
		 */
		EClass STRING_TO_PROPERTY_MAP = eINSTANCE.getStringToPropertyMap();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_PROPERTY_MAP__VALUE = eINSTANCE.getStringToPropertyMap_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_PROPERTY_MAP__KEY = eINSTANCE.getStringToPropertyMap_Key();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.LinkImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__HREF = eINSTANCE.getLink_Href();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TYPE = eINSTANCE.getLink_Type();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__REL = eINSTANCE.getLink_Rel();

		/**
		 * The meta object literal for the '<em><b>Anchor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__ANCHOR = eINSTANCE.getLink_Anchor();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.FormImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__OP = eINSTANCE.getForm_Op();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__HREF = eINSTANCE.getForm_Href();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__CONTENT_TYPE = eINSTANCE.getForm_ContentType();

		/**
		 * The meta object literal for the '<em><b>Content Coding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__CONTENT_CODING = eINSTANCE.getForm_ContentCoding();

		/**
		 * The meta object literal for the '<em><b>Subprotocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__SUBPROTOCOL = eINSTANCE.getForm_Subprotocol();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__SECURITY = eINSTANCE.getForm_Security();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__SCOPES = eINSTANCE.getForm_Scopes();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__RESPONSE = eINSTANCE.getForm_Response();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.ExpectedResponseImpl <em>Expected Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.ExpectedResponseImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getExpectedResponse()
		 * @generated
		 */
		EClass EXPECTED_RESPONSE = eINSTANCE.getExpectedResponse();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTED_RESPONSE__CONTENT_TYPE = eINSTANCE.getExpectedResponse_ContentType();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.DataSchemaImpl <em>Data Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.DataSchemaImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getDataSchema()
		 * @generated
		 */
		EClass DATA_SCHEMA = eINSTANCE.getDataSchema();

		/**
		 * The meta object literal for the '<em><b>Semantic Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__SEMANTIC_TYPE = eINSTANCE.getDataSchema_SemanticType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__TITLE = eINSTANCE.getDataSchema_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__DESCRIPTION = eINSTANCE.getDataSchema_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__TYPE = eINSTANCE.getDataSchema_Type();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__UNIT = eINSTANCE.getDataSchema_Unit();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__ENUM = eINSTANCE.getDataSchema_Enum();

		/**
		 * The meta object literal for the '<em><b>One Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SCHEMA__ONE_OF = eINSTANCE.getDataSchema_OneOf();

		/**
		 * The meta object literal for the '<em><b>Titles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SCHEMA__TITLES = eINSTANCE.getDataSchema_Titles();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SCHEMA__DESCRIPTIONS = eINSTANCE.getDataSchema_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__CONST = eINSTANCE.getDataSchema_Const();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__READ_ONLY = eINSTANCE.getDataSchema_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Write Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__WRITE_ONLY = eINSTANCE.getDataSchema_WriteOnly();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__FORMAT = eINSTANCE.getDataSchema_Format();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.ArraySchemaImpl <em>Array Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.ArraySchemaImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getArraySchema()
		 * @generated
		 */
		EClass ARRAY_SCHEMA = eINSTANCE.getArraySchema();

		/**
		 * The meta object literal for the '<em><b>Min Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_SCHEMA__MIN_ITEMS = eINSTANCE.getArraySchema_MinItems();

		/**
		 * The meta object literal for the '<em><b>Max Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_SCHEMA__MAX_ITEMS = eINSTANCE.getArraySchema_MaxItems();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_SCHEMA__ITEMS = eINSTANCE.getArraySchema_Items();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.ObjectSchemaImpl <em>Object Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.ObjectSchemaImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getObjectSchema()
		 * @generated
		 */
		EClass OBJECT_SCHEMA = eINSTANCE.getObjectSchema();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_SCHEMA__REQUIRED = eINSTANCE.getObjectSchema_Required();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_SCHEMA__PROPERTIES = eINSTANCE.getObjectSchema_Properties();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.StringSchemaImpl <em>String Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.StringSchemaImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getStringSchema()
		 * @generated
		 */
		EClass STRING_SCHEMA = eINSTANCE.getStringSchema();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.BooleanSchemaImpl <em>Boolean Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.BooleanSchemaImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getBooleanSchema()
		 * @generated
		 */
		EClass BOOLEAN_SCHEMA = eINSTANCE.getBooleanSchema();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.NumberSchemaImpl <em>Number Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.NumberSchemaImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getNumberSchema()
		 * @generated
		 */
		EClass NUMBER_SCHEMA = eINSTANCE.getNumberSchema();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_SCHEMA__MINIMUM = eINSTANCE.getNumberSchema_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_SCHEMA__MAXIMUM = eINSTANCE.getNumberSchema_Maximum();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.IntegerSchemaImpl <em>Integer Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.IntegerSchemaImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getIntegerSchema()
		 * @generated
		 */
		EClass INTEGER_SCHEMA = eINSTANCE.getIntegerSchema();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_SCHEMA__MINIMUM = eINSTANCE.getIntegerSchema_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_SCHEMA__MAXIMUM = eINSTANCE.getIntegerSchema_Maximum();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.NullSchemaImpl <em>Null Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.NullSchemaImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getNullSchema()
		 * @generated
		 */
		EClass NULL_SCHEMA = eINSTANCE.getNullSchema();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.SecuritySchemeImpl <em>Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.SecuritySchemeImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getSecurityScheme()
		 * @generated
		 */
		EClass SECURITY_SCHEME = eINSTANCE.getSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Semantic Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__SEMANTIC_TYPE = eINSTANCE.getSecurityScheme_SemanticType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__DESCRIPTION = eINSTANCE.getSecurityScheme_Description();

		/**
		 * The meta object literal for the '<em><b>Proxy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__PROXY = eINSTANCE.getSecurityScheme_Proxy();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__SCHEME = eINSTANCE.getSecurityScheme_Scheme();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_SCHEME__DESCRIPTIONS = eINSTANCE.getSecurityScheme_Descriptions();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.NoSecuritySchemeImpl <em>No Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.NoSecuritySchemeImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getNoSecurityScheme()
		 * @generated
		 */
		EClass NO_SECURITY_SCHEME = eINSTANCE.getNoSecurityScheme();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.BasicSecuritySchemeImpl <em>Basic Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.BasicSecuritySchemeImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getBasicSecurityScheme()
		 * @generated
		 */
		EClass BASIC_SECURITY_SCHEME = eINSTANCE.getBasicSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_SECURITY_SCHEME__IN = eINSTANCE.getBasicSecurityScheme_In();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_SECURITY_SCHEME__NAME = eINSTANCE.getBasicSecurityScheme_Name();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.DigestSecuritySchemeImpl <em>Digest Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.DigestSecuritySchemeImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getDigestSecurityScheme()
		 * @generated
		 */
		EClass DIGEST_SECURITY_SCHEME = eINSTANCE.getDigestSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Qop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGEST_SECURITY_SCHEME__QOP = eINSTANCE.getDigestSecurityScheme_Qop();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGEST_SECURITY_SCHEME__IN = eINSTANCE.getDigestSecurityScheme_In();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGEST_SECURITY_SCHEME__NAME = eINSTANCE.getDigestSecurityScheme_Name();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.APIKeySecuritySchemeImpl <em>API Key Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.APIKeySecuritySchemeImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getAPIKeySecurityScheme()
		 * @generated
		 */
		EClass API_KEY_SECURITY_SCHEME = eINSTANCE.getAPIKeySecurityScheme();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_KEY_SECURITY_SCHEME__IN = eINSTANCE.getAPIKeySecurityScheme_In();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_KEY_SECURITY_SCHEME__NAME = eINSTANCE.getAPIKeySecurityScheme_Name();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.BearerSecuritySchemeImpl <em>Bearer Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.BearerSecuritySchemeImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getBearerSecurityScheme()
		 * @generated
		 */
		EClass BEARER_SECURITY_SCHEME = eINSTANCE.getBearerSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__AUTHORIZATION = eINSTANCE.getBearerSecurityScheme_Authorization();

		/**
		 * The meta object literal for the '<em><b>Alg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__ALG = eINSTANCE.getBearerSecurityScheme_Alg();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__FORMAT = eINSTANCE.getBearerSecurityScheme_Format();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__IN = eINSTANCE.getBearerSecurityScheme_In();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARER_SECURITY_SCHEME__NAME = eINSTANCE.getBearerSecurityScheme_Name();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.CertSecuritySchemeImpl <em>Cert Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.CertSecuritySchemeImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getCertSecurityScheme()
		 * @generated
		 */
		EClass CERT_SECURITY_SCHEME = eINSTANCE.getCertSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERT_SECURITY_SCHEME__IDENTITY = eINSTANCE.getCertSecurityScheme_Identity();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.PSKSecuritySchemeImpl <em>PSK Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.PSKSecuritySchemeImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getPSKSecurityScheme()
		 * @generated
		 */
		EClass PSK_SECURITY_SCHEME = eINSTANCE.getPSKSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSK_SECURITY_SCHEME__IDENTITY = eINSTANCE.getPSKSecurityScheme_Identity();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.PublicSecuritySchemeImpl <em>Public Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.PublicSecuritySchemeImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getPublicSecurityScheme()
		 * @generated
		 */
		EClass PUBLIC_SECURITY_SCHEME = eINSTANCE.getPublicSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SECURITY_SCHEME__IDENTITY = eINSTANCE.getPublicSecurityScheme_Identity();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.PoPSecuritySchemeImpl <em>Po PSecurity Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.PoPSecuritySchemeImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getPoPSecurityScheme()
		 * @generated
		 */
		EClass PO_PSECURITY_SCHEME = eINSTANCE.getPoPSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO_PSECURITY_SCHEME__AUTHORIZATION = eINSTANCE.getPoPSecurityScheme_Authorization();

		/**
		 * The meta object literal for the '<em><b>Alg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO_PSECURITY_SCHEME__ALG = eINSTANCE.getPoPSecurityScheme_Alg();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO_PSECURITY_SCHEME__FORMAT = eINSTANCE.getPoPSecurityScheme_Format();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO_PSECURITY_SCHEME__IN = eINSTANCE.getPoPSecurityScheme_In();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO_PSECURITY_SCHEME__NAME = eINSTANCE.getPoPSecurityScheme_Name();

		/**
		 * The meta object literal for the '{@link w3c_td.impl.OAuth2SecuritySchemeImpl <em>OAuth2 Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.impl.OAuth2SecuritySchemeImpl
		 * @see w3c_td.impl.W3c_tdPackageImpl#getOAuth2SecurityScheme()
		 * @generated
		 */
		EClass OAUTH2_SECURITY_SCHEME = eINSTANCE.getOAuth2SecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__AUTHORIZATION = eINSTANCE.getOAuth2SecurityScheme_Authorization();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__TOKEN = eINSTANCE.getOAuth2SecurityScheme_Token();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__REFRESH = eINSTANCE.getOAuth2SecurityScheme_Refresh();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__SCOPES = eINSTANCE.getOAuth2SecurityScheme_Scopes();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_SECURITY_SCHEME__FLOW = eINSTANCE.getOAuth2SecurityScheme_Flow();

		/**
		 * The meta object literal for the '{@link w3c_td.NewEnum1 <em>New Enum1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.NewEnum1
		 * @see w3c_td.impl.W3c_tdPackageImpl#getNewEnum1()
		 * @generated
		 */
		EEnum NEW_ENUM1 = eINSTANCE.getNewEnum1();

	}

} //W3c_tdPackage
