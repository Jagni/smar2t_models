/**
 */
package smar2t.td.w3c.dataschema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import smar2t.td.w3c.core.MultiLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smar2t.td.w3c.dataschema.DataSchema#getSemanticType <em>Semantic Type</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.DataSchema#getTitle <em>Title</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.DataSchema#getDescription <em>Description</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.DataSchema#getType <em>Type</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.DataSchema#getUnit <em>Unit</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.DataSchema#getEnum <em>Enum</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.DataSchema#getOneOf <em>One Of</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.DataSchema#getTitles <em>Titles</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.DataSchema#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.DataSchema#getConst <em>Const</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.DataSchema#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.DataSchema#isWriteOnly <em>Write Only</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.DataSchema#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getDataSchema()
 * @model abstract="true"
 * @generated
 */
public interface DataSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Semantic Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Type</em>' attribute list.
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getDataSchema_SemanticType()
	 * @model
	 * @generated
	 */
	EList<String> getSemanticType();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getDataSchema_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.dataschema.DataSchema#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getDataSchema_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.dataschema.DataSchema#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getDataSchema_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.dataschema.DataSchema#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getDataSchema_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.dataschema.DataSchema#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' attribute.
	 * @see #setEnum(String)
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getDataSchema_Enum()
	 * @model
	 * @generated
	 */
	String getEnum();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.dataschema.DataSchema#getEnum <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' attribute.
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(String value);

	/**
	 * Returns the value of the '<em><b>One Of</b></em>' reference list.
	 * The list contents are of type {@link smar2t.td.w3c.dataschema.DataSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Of</em>' reference list.
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getDataSchema_OneOf()
	 * @model
	 * @generated
	 */
	EList<DataSchema> getOneOf();

	/**
	 * Returns the value of the '<em><b>Titles</b></em>' reference list.
	 * The list contents are of type {@link smar2t.td.w3c.core.MultiLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titles</em>' reference list.
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getDataSchema_Titles()
	 * @model
	 * @generated
	 */
	EList<MultiLanguage> getTitles();

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' reference list.
	 * The list contents are of type {@link smar2t.td.w3c.core.MultiLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' reference list.
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getDataSchema_Descriptions()
	 * @model
	 * @generated
	 */
	EList<MultiLanguage> getDescriptions();

	/**
	 * Returns the value of the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const</em>' attribute.
	 * @see #setConst(Object)
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getDataSchema_Const()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 * @generated
	 */
	Object getConst();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.dataschema.DataSchema#getConst <em>Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const</em>' attribute.
	 * @see #getConst()
	 * @generated
	 */
	void setConst(Object value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getDataSchema_ReadOnly()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.dataschema.DataSchema#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Write Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Only</em>' attribute.
	 * @see #setWriteOnly(boolean)
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getDataSchema_WriteOnly()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isWriteOnly();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.dataschema.DataSchema#isWriteOnly <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Only</em>' attribute.
	 * @see #isWriteOnly()
	 * @generated
	 */
	void setWriteOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getDataSchema_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.dataschema.DataSchema#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

} // DataSchema
