/**
 */
package smar2t.td.w3c.dataschema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smar2t.td.w3c.dataschema.IntegerSchema#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.IntegerSchema#getMaximum <em>Maximum</em>}</li>
 * </ul>
 *
 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getIntegerSchema()
 * @model
 * @generated
 */
public interface IntegerSchema extends DataSchema {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(int)
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getIntegerSchema_Minimum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getMinimum();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.dataschema.IntegerSchema#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(int value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(int)
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getIntegerSchema_Maximum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getMaximum();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.dataschema.IntegerSchema#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(int value);

} // IntegerSchema
