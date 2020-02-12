/**
 */
package smar2t.td.w3c.dataschema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smar2t.td.w3c.dataschema.NumberSchema#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.NumberSchema#getMaximum <em>Maximum</em>}</li>
 * </ul>
 *
 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getNumberSchema()
 * @model
 * @generated
 */
public interface NumberSchema extends DataSchema {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(double)
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getNumberSchema_Minimum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getMinimum();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.dataschema.NumberSchema#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(double value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(double)
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getNumberSchema_Maximum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getMaximum();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.dataschema.NumberSchema#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(double value);

} // NumberSchema
