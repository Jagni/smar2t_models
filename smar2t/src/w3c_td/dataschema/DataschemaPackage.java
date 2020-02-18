/**
 */
package w3c_td.dataschema;

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
 * @see w3c_td.dataschema.DataschemaFactory
 * @model kind="package"
 * @generated
 */
public interface DataschemaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataschema";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://smar2t.org/models/w3c_td/dataschema";

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
	DataschemaPackage eINSTANCE = w3c_td.dataschema.impl.DataschemaPackageImpl.init();

	/**
	 * The meta object id for the '{@link w3c_td.dataschema.impl.DataSchemaImpl <em>Data Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.dataschema.impl.DataSchemaImpl
	 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getDataSchema()
	 * @generated
	 */
	int DATA_SCHEMA = 0;

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
	 * The meta object id for the '{@link w3c_td.dataschema.impl.ArraySchemaImpl <em>Array Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.dataschema.impl.ArraySchemaImpl
	 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getArraySchema()
	 * @generated
	 */
	int ARRAY_SCHEMA = 1;

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
	 * The meta object id for the '{@link w3c_td.dataschema.impl.ObjectSchemaImpl <em>Object Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.dataschema.impl.ObjectSchemaImpl
	 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getObjectSchema()
	 * @generated
	 */
	int OBJECT_SCHEMA = 2;

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
	 * The meta object id for the '{@link w3c_td.dataschema.impl.StringSchemaImpl <em>String Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.dataschema.impl.StringSchemaImpl
	 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getStringSchema()
	 * @generated
	 */
	int STRING_SCHEMA = 3;

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
	 * The meta object id for the '{@link w3c_td.dataschema.impl.BooleanSchemaImpl <em>Boolean Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.dataschema.impl.BooleanSchemaImpl
	 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getBooleanSchema()
	 * @generated
	 */
	int BOOLEAN_SCHEMA = 4;

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
	 * The meta object id for the '{@link w3c_td.dataschema.impl.NumberSchemaImpl <em>Number Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.dataschema.impl.NumberSchemaImpl
	 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getNumberSchema()
	 * @generated
	 */
	int NUMBER_SCHEMA = 5;

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
	 * The meta object id for the '{@link w3c_td.dataschema.impl.IntegerSchemaImpl <em>Integer Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.dataschema.impl.IntegerSchemaImpl
	 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getIntegerSchema()
	 * @generated
	 */
	int INTEGER_SCHEMA = 6;

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
	 * The meta object id for the '{@link w3c_td.dataschema.impl.NullSchemaImpl <em>Null Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.dataschema.impl.NullSchemaImpl
	 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getNullSchema()
	 * @generated
	 */
	int NULL_SCHEMA = 7;

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
	 * The meta object id for the '{@link w3c_td.dataschema.NewEnum1 <em>New Enum1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see w3c_td.dataschema.NewEnum1
	 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getNewEnum1()
	 * @generated
	 */
	int NEW_ENUM1 = 8;


	/**
	 * Returns the meta object for class '{@link w3c_td.dataschema.DataSchema <em>Data Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Schema</em>'.
	 * @see w3c_td.dataschema.DataSchema
	 * @generated
	 */
	EClass getDataSchema();

	/**
	 * Returns the meta object for the attribute list '{@link w3c_td.dataschema.DataSchema#getSemanticType <em>Semantic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Semantic Type</em>'.
	 * @see w3c_td.dataschema.DataSchema#getSemanticType()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_SemanticType();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.dataschema.DataSchema#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see w3c_td.dataschema.DataSchema#getTitle()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Title();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.dataschema.DataSchema#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see w3c_td.dataschema.DataSchema#getDescription()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Description();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.dataschema.DataSchema#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see w3c_td.dataschema.DataSchema#getType()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Type();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.dataschema.DataSchema#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see w3c_td.dataschema.DataSchema#getUnit()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Unit();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.dataschema.DataSchema#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum</em>'.
	 * @see w3c_td.dataschema.DataSchema#getEnum()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Enum();

	/**
	 * Returns the meta object for the reference list '{@link w3c_td.dataschema.DataSchema#getOneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>One Of</em>'.
	 * @see w3c_td.dataschema.DataSchema#getOneOf()
	 * @see #getDataSchema()
	 * @generated
	 */
	EReference getDataSchema_OneOf();

	/**
	 * Returns the meta object for the reference list '{@link w3c_td.dataschema.DataSchema#getTitles <em>Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Titles</em>'.
	 * @see w3c_td.dataschema.DataSchema#getTitles()
	 * @see #getDataSchema()
	 * @generated
	 */
	EReference getDataSchema_Titles();

	/**
	 * Returns the meta object for the reference list '{@link w3c_td.dataschema.DataSchema#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Descriptions</em>'.
	 * @see w3c_td.dataschema.DataSchema#getDescriptions()
	 * @see #getDataSchema()
	 * @generated
	 */
	EReference getDataSchema_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.dataschema.DataSchema#getConst <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Const</em>'.
	 * @see w3c_td.dataschema.DataSchema#getConst()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Const();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.dataschema.DataSchema#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see w3c_td.dataschema.DataSchema#isReadOnly()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.dataschema.DataSchema#isWriteOnly <em>Write Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Only</em>'.
	 * @see w3c_td.dataschema.DataSchema#isWriteOnly()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_WriteOnly();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.dataschema.DataSchema#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see w3c_td.dataschema.DataSchema#getFormat()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Format();

	/**
	 * Returns the meta object for class '{@link w3c_td.dataschema.ArraySchema <em>Array Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Schema</em>'.
	 * @see w3c_td.dataschema.ArraySchema
	 * @generated
	 */
	EClass getArraySchema();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.dataschema.ArraySchema#getMinItems <em>Min Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Items</em>'.
	 * @see w3c_td.dataschema.ArraySchema#getMinItems()
	 * @see #getArraySchema()
	 * @generated
	 */
	EAttribute getArraySchema_MinItems();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.dataschema.ArraySchema#getMaxItems <em>Max Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Items</em>'.
	 * @see w3c_td.dataschema.ArraySchema#getMaxItems()
	 * @see #getArraySchema()
	 * @generated
	 */
	EAttribute getArraySchema_MaxItems();

	/**
	 * Returns the meta object for the containment reference list '{@link w3c_td.dataschema.ArraySchema#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see w3c_td.dataschema.ArraySchema#getItems()
	 * @see #getArraySchema()
	 * @generated
	 */
	EReference getArraySchema_Items();

	/**
	 * Returns the meta object for class '{@link w3c_td.dataschema.ObjectSchema <em>Object Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Schema</em>'.
	 * @see w3c_td.dataschema.ObjectSchema
	 * @generated
	 */
	EClass getObjectSchema();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.dataschema.ObjectSchema#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see w3c_td.dataschema.ObjectSchema#getRequired()
	 * @see #getObjectSchema()
	 * @generated
	 */
	EAttribute getObjectSchema_Required();

	/**
	 * Returns the meta object for the containment reference list '{@link w3c_td.dataschema.ObjectSchema#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see w3c_td.dataschema.ObjectSchema#getProperties()
	 * @see #getObjectSchema()
	 * @generated
	 */
	EReference getObjectSchema_Properties();

	/**
	 * Returns the meta object for class '{@link w3c_td.dataschema.StringSchema <em>String Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Schema</em>'.
	 * @see w3c_td.dataschema.StringSchema
	 * @generated
	 */
	EClass getStringSchema();

	/**
	 * Returns the meta object for class '{@link w3c_td.dataschema.BooleanSchema <em>Boolean Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Schema</em>'.
	 * @see w3c_td.dataschema.BooleanSchema
	 * @generated
	 */
	EClass getBooleanSchema();

	/**
	 * Returns the meta object for class '{@link w3c_td.dataschema.NumberSchema <em>Number Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Schema</em>'.
	 * @see w3c_td.dataschema.NumberSchema
	 * @generated
	 */
	EClass getNumberSchema();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.dataschema.NumberSchema#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see w3c_td.dataschema.NumberSchema#getMinimum()
	 * @see #getNumberSchema()
	 * @generated
	 */
	EAttribute getNumberSchema_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.dataschema.NumberSchema#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see w3c_td.dataschema.NumberSchema#getMaximum()
	 * @see #getNumberSchema()
	 * @generated
	 */
	EAttribute getNumberSchema_Maximum();

	/**
	 * Returns the meta object for class '{@link w3c_td.dataschema.IntegerSchema <em>Integer Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Schema</em>'.
	 * @see w3c_td.dataschema.IntegerSchema
	 * @generated
	 */
	EClass getIntegerSchema();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.dataschema.IntegerSchema#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see w3c_td.dataschema.IntegerSchema#getMinimum()
	 * @see #getIntegerSchema()
	 * @generated
	 */
	EAttribute getIntegerSchema_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link w3c_td.dataschema.IntegerSchema#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see w3c_td.dataschema.IntegerSchema#getMaximum()
	 * @see #getIntegerSchema()
	 * @generated
	 */
	EAttribute getIntegerSchema_Maximum();

	/**
	 * Returns the meta object for class '{@link w3c_td.dataschema.NullSchema <em>Null Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Schema</em>'.
	 * @see w3c_td.dataschema.NullSchema
	 * @generated
	 */
	EClass getNullSchema();

	/**
	 * Returns the meta object for enum '{@link w3c_td.dataschema.NewEnum1 <em>New Enum1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>New Enum1</em>'.
	 * @see w3c_td.dataschema.NewEnum1
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
	DataschemaFactory getDataschemaFactory();

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
		 * The meta object literal for the '{@link w3c_td.dataschema.impl.DataSchemaImpl <em>Data Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.dataschema.impl.DataSchemaImpl
		 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getDataSchema()
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
		 * The meta object literal for the '{@link w3c_td.dataschema.impl.ArraySchemaImpl <em>Array Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.dataschema.impl.ArraySchemaImpl
		 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getArraySchema()
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
		 * The meta object literal for the '{@link w3c_td.dataschema.impl.ObjectSchemaImpl <em>Object Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.dataschema.impl.ObjectSchemaImpl
		 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getObjectSchema()
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
		 * The meta object literal for the '{@link w3c_td.dataschema.impl.StringSchemaImpl <em>String Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.dataschema.impl.StringSchemaImpl
		 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getStringSchema()
		 * @generated
		 */
		EClass STRING_SCHEMA = eINSTANCE.getStringSchema();

		/**
		 * The meta object literal for the '{@link w3c_td.dataschema.impl.BooleanSchemaImpl <em>Boolean Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.dataschema.impl.BooleanSchemaImpl
		 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getBooleanSchema()
		 * @generated
		 */
		EClass BOOLEAN_SCHEMA = eINSTANCE.getBooleanSchema();

		/**
		 * The meta object literal for the '{@link w3c_td.dataschema.impl.NumberSchemaImpl <em>Number Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.dataschema.impl.NumberSchemaImpl
		 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getNumberSchema()
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
		 * The meta object literal for the '{@link w3c_td.dataschema.impl.IntegerSchemaImpl <em>Integer Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.dataschema.impl.IntegerSchemaImpl
		 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getIntegerSchema()
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
		 * The meta object literal for the '{@link w3c_td.dataschema.impl.NullSchemaImpl <em>Null Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.dataschema.impl.NullSchemaImpl
		 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getNullSchema()
		 * @generated
		 */
		EClass NULL_SCHEMA = eINSTANCE.getNullSchema();

		/**
		 * The meta object literal for the '{@link w3c_td.dataschema.NewEnum1 <em>New Enum1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see w3c_td.dataschema.NewEnum1
		 * @see w3c_td.dataschema.impl.DataschemaPackageImpl#getNewEnum1()
		 * @generated
		 */
		EEnum NEW_ENUM1 = eINSTANCE.getNewEnum1();

	}

} //DataschemaPackage
