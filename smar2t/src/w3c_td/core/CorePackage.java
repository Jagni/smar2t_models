/**
 */
package w3c_td.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see w3c_td.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://smar2t.org/models/w3c_td/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "W3cTd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = w3c_td.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link w3c_td.core.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.core.impl.ThingImpl
	 * @see w3c_td.core.impl.CorePackageImpl#getThing()
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
	 * The meta object id for the '{@link w3c_td.core.impl.VersionInfoImpl <em>Version Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.core.impl.VersionInfoImpl
	 * @see w3c_td.core.impl.CorePackageImpl#getVersionInfo()
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
	 * The meta object id for the '{@link w3c_td.core.impl.InteractionAffordanceImpl <em>Interaction Affordance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.core.impl.InteractionAffordanceImpl
	 * @see w3c_td.core.impl.CorePackageImpl#getInteractionAffordance()
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
	 * The meta object id for the '{@link w3c_td.core.impl.PropertyAffordanceImpl <em>Property Affordance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.core.impl.PropertyAffordanceImpl
	 * @see w3c_td.core.impl.CorePackageImpl#getPropertyAffordance()
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
	 * The meta object id for the '{@link w3c_td.core.impl.EventAffordanceImpl <em>Event Affordance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.core.impl.EventAffordanceImpl
	 * @see w3c_td.core.impl.CorePackageImpl#getEventAffordance()
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
	 * The meta object id for the '{@link w3c_td.core.impl.ActionAffordanceImpl <em>Action Affordance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.core.impl.ActionAffordanceImpl
	 * @see w3c_td.core.impl.CorePackageImpl#getActionAffordance()
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
	 * The meta object id for the '{@link w3c_td.core.impl.MultiLanguageImpl <em>Multi Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.core.impl.MultiLanguageImpl
	 * @see w3c_td.core.impl.CorePackageImpl#getMultiLanguage()
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
	 * The meta object id for the '{@link w3c_td.core.impl.StringToEventMapImpl <em>String To Event Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.core.impl.StringToEventMapImpl
	 * @see w3c_td.core.impl.CorePackageImpl#getStringToEventMap()
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
	 * The meta object id for the '{@link w3c_td.core.impl.StringToActionMapImpl <em>String To Action Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.core.impl.StringToActionMapImpl
	 * @see w3c_td.core.impl.CorePackageImpl#getStringToActionMap()
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
	 * The meta object id for the '{@link w3c_td.core.impl.StringToPropertyMapImpl <em>String To Property Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.core.impl.StringToPropertyMapImpl
	 * @see w3c_td.core.impl.CorePackageImpl#getStringToPropertyMap()
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
	 * Returns the meta object for class '{@link w3c_td.core.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see w3c_td.core.Thing
	 * @generated
	 */
	EClass getThing();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.core.Thing#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see w3c_td.core.Thing#getId()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Id();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.core.Thing#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see w3c_td.core.Thing#getTitle()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Title();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.core.Thing#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see w3c_td.core.Thing#getDescription()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Description();

	/**
	 * Returns the meta object for the attribute list '{@link w3c_td.core.Thing#getSemanticContext <em>Semantic Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Semantic Context</em>'.
	 * @see w3c_td.core.Thing#getSemanticContext()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_SemanticContext();

	/**
	 * Returns the meta object for the attribute list '{@link w3c_td.core.Thing#getSemanticType <em>Semantic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Semantic Type</em>'.
	 * @see w3c_td.core.Thing#getSemanticType()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_SemanticType();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.core.Thing#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see w3c_td.core.Thing#getCreated()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Created();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.core.Thing#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see w3c_td.core.Thing#getModified()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Modified();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.core.Thing#getSupport <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Support</em>'.
	 * @see w3c_td.core.Thing#getSupport()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Support();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.core.Thing#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see w3c_td.core.Thing#getBase()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Base();

	/**
	 * Returns the meta object for the attribute list '{@link w3c_td.core.Thing#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Security</em>'.
	 * @see w3c_td.core.Thing#getSecurity()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Security();

	/**
	 * Returns the meta object for the containment reference list '{@link w3c_td.core.Thing#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see w3c_td.core.Thing#getLinks()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Links();

	/**
	 * Returns the meta object for the reference list '{@link w3c_td.core.Thing#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forms</em>'.
	 * @see w3c_td.core.Thing#getForms()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Forms();

	/**
	 * Returns the meta object for the reference '{@link w3c_td.core.Thing#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version</em>'.
	 * @see w3c_td.core.Thing#getVersion()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Version();

	/**
	 * Returns the meta object for the reference list '{@link w3c_td.core.Thing#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Titles</em>'.
	 * @see w3c_td.core.Thing#getTitles()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Titles();

	/**
	 * Returns the meta object for the containment reference list '{@link w3c_td.core.Thing#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see w3c_td.core.Thing#getDescriptions()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Descriptions();

	/**
	 * Returns the meta object for the map '{@link w3c_td.core.Thing#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Events</em>'.
	 * @see w3c_td.core.Thing#getEvents()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Events();

	/**
	 * Returns the meta object for the map '{@link w3c_td.core.Thing#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Actions</em>'.
	 * @see w3c_td.core.Thing#getActions()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Actions();

	/**
	 * Returns the meta object for the map '{@link w3c_td.core.Thing#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Properties</em>'.
	 * @see w3c_td.core.Thing#getProperties()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Properties();

	/**
	 * Returns the meta object for class '{@link w3c_td.core.VersionInfo <em>Version Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Info</em>'.
	 * @see w3c_td.core.VersionInfo
	 * @generated
	 */
	EClass getVersionInfo();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.core.VersionInfo#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see w3c_td.core.VersionInfo#getInstance()
	 * @see #getVersionInfo()
	 * @generated
	 */
	EAttribute getVersionInfo_Instance();

	/**
	 * Returns the meta object for class '{@link w3c_td.core.PropertyAffordance <em>Property Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Affordance</em>'.
	 * @see w3c_td.core.PropertyAffordance
	 * @generated
	 */
	EClass getPropertyAffordance();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.core.PropertyAffordance#isObservable <em>Observable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observable</em>'.
	 * @see w3c_td.core.PropertyAffordance#isObservable()
	 * @see #getPropertyAffordance()
	 * @generated
	 */
	EAttribute getPropertyAffordance_Observable();

	/**
	 * Returns the meta object for class '{@link w3c_td.core.InteractionAffordance <em>Interaction Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Affordance</em>'.
	 * @see w3c_td.core.InteractionAffordance
	 * @generated
	 */
	EClass getInteractionAffordance();

	/**
	 * Returns the meta object for the containment reference list '{@link w3c_td.core.InteractionAffordance#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forms</em>'.
	 * @see w3c_td.core.InteractionAffordance#getForms()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EReference getInteractionAffordance_Forms();

	/**
	 * Returns the meta object for the reference '{@link w3c_td.core.InteractionAffordance#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Titles</em>'.
	 * @see w3c_td.core.InteractionAffordance#getTitles()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EReference getInteractionAffordance_Titles();

	/**
	 * Returns the meta object for the reference '{@link w3c_td.core.InteractionAffordance#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Descriptions</em>'.
	 * @see w3c_td.core.InteractionAffordance#getDescriptions()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EReference getInteractionAffordance_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.core.InteractionAffordance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see w3c_td.core.InteractionAffordance#getType()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EAttribute getInteractionAffordance_Type();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.core.InteractionAffordance#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see w3c_td.core.InteractionAffordance#getTitle()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EAttribute getInteractionAffordance_Title();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.core.InteractionAffordance#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see w3c_td.core.InteractionAffordance#getDescription()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EAttribute getInteractionAffordance_Description();

	/**
	 * Returns the meta object for class '{@link w3c_td.core.EventAffordance <em>Event Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Affordance</em>'.
	 * @see w3c_td.core.EventAffordance
	 * @generated
	 */
	EClass getEventAffordance();

	/**
	 * Returns the meta object for class '{@link w3c_td.core.ActionAffordance <em>Action Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Affordance</em>'.
	 * @see w3c_td.core.ActionAffordance
	 * @generated
	 */
	EClass getActionAffordance();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.core.ActionAffordance#isSafe <em>Safe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safe</em>'.
	 * @see w3c_td.core.ActionAffordance#isSafe()
	 * @see #getActionAffordance()
	 * @generated
	 */
	EAttribute getActionAffordance_Safe();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.core.ActionAffordance#isIdempotent <em>Idempotent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idempotent</em>'.
	 * @see w3c_td.core.ActionAffordance#isIdempotent()
	 * @see #getActionAffordance()
	 * @generated
	 */
	EAttribute getActionAffordance_Idempotent();

	/**
	 * Returns the meta object for class '{@link w3c_td.core.MultiLanguage <em>Multi Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Language</em>'.
	 * @see w3c_td.core.MultiLanguage
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
	 *        valueType="w3c_td.core.EventAffordance" valueContainment="true" valueRequired="true"
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
	 *        valueType="w3c_td.core.ActionAffordance" valueContainment="true" valueRequired="true"
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
	 *        valueType="w3c_td.core.PropertyAffordance" valueContainment="true" valueRequired="true"
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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link w3c_td.core.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.core.impl.ThingImpl
		 * @see w3c_td.core.impl.CorePackageImpl#getThing()
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
		 * The meta object literal for the '{@link w3c_td.core.impl.VersionInfoImpl <em>Version Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.core.impl.VersionInfoImpl
		 * @see w3c_td.core.impl.CorePackageImpl#getVersionInfo()
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
		 * The meta object literal for the '{@link w3c_td.core.impl.PropertyAffordanceImpl <em>Property Affordance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.core.impl.PropertyAffordanceImpl
		 * @see w3c_td.core.impl.CorePackageImpl#getPropertyAffordance()
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
		 * The meta object literal for the '{@link w3c_td.core.impl.InteractionAffordanceImpl <em>Interaction Affordance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.core.impl.InteractionAffordanceImpl
		 * @see w3c_td.core.impl.CorePackageImpl#getInteractionAffordance()
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
		 * The meta object literal for the '{@link w3c_td.core.impl.EventAffordanceImpl <em>Event Affordance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.core.impl.EventAffordanceImpl
		 * @see w3c_td.core.impl.CorePackageImpl#getEventAffordance()
		 * @generated
		 */
		EClass EVENT_AFFORDANCE = eINSTANCE.getEventAffordance();

		/**
		 * The meta object literal for the '{@link w3c_td.core.impl.ActionAffordanceImpl <em>Action Affordance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.core.impl.ActionAffordanceImpl
		 * @see w3c_td.core.impl.CorePackageImpl#getActionAffordance()
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
		 * The meta object literal for the '{@link w3c_td.core.impl.MultiLanguageImpl <em>Multi Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.core.impl.MultiLanguageImpl
		 * @see w3c_td.core.impl.CorePackageImpl#getMultiLanguage()
		 * @generated
		 */
		EClass MULTI_LANGUAGE = eINSTANCE.getMultiLanguage();

		/**
		 * The meta object literal for the '{@link w3c_td.core.impl.StringToEventMapImpl <em>String To Event Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.core.impl.StringToEventMapImpl
		 * @see w3c_td.core.impl.CorePackageImpl#getStringToEventMap()
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
		 * The meta object literal for the '{@link w3c_td.core.impl.StringToActionMapImpl <em>String To Action Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.core.impl.StringToActionMapImpl
		 * @see w3c_td.core.impl.CorePackageImpl#getStringToActionMap()
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
		 * The meta object literal for the '{@link w3c_td.core.impl.StringToPropertyMapImpl <em>String To Property Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.core.impl.StringToPropertyMapImpl
		 * @see w3c_td.core.impl.CorePackageImpl#getStringToPropertyMap()
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

	}

} //CorePackage
