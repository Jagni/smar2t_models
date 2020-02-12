/**
 */
package w3c_td.dataschema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link w3c_td.dataschema.ObjectSchema#getRequired <em>Required</em>}</li>
 *   <li>{@link w3c_td.dataschema.ObjectSchema#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see w3c_td.dataschema.DataschemaPackage#getObjectSchema()
 * @model
 * @generated
 */
public interface ObjectSchema extends DataSchema {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(String)
	 * @see w3c_td.dataschema.DataschemaPackage#getObjectSchema_Required()
	 * @model
	 * @generated
	 */
	String getRequired();

	/**
	 * Sets the value of the '{@link w3c_td.dataschema.ObjectSchema#getRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link w3c_td.dataschema.DataSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see w3c_td.dataschema.DataschemaPackage#getObjectSchema_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSchema> getProperties();

} // ObjectSchema
