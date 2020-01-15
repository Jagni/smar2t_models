/**
 */
package smar2t.td.w3c.dataschema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smar2t.td.w3c.dataschema.ArraySchema#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.ArraySchema#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link smar2t.td.w3c.dataschema.ArraySchema#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getArraySchema()
 * @model
 * @generated
 */
public interface ArraySchema extends DataSchema {
	/**
	 * Returns the value of the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Items</em>' attribute.
	 * @see #setMinItems(long)
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getArraySchema_MinItems()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 * @generated
	 */
	long getMinItems();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.dataschema.ArraySchema#getMinItems <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Items</em>' attribute.
	 * @see #getMinItems()
	 * @generated
	 */
	void setMinItems(long value);

	/**
	 * Returns the value of the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Items</em>' attribute.
	 * @see #setMaxItems(long)
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getArraySchema_MaxItems()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 * @generated
	 */
	long getMaxItems();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.dataschema.ArraySchema#getMaxItems <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Items</em>' attribute.
	 * @see #getMaxItems()
	 * @generated
	 */
	void setMaxItems(long value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link smar2t.td.w3c.dataschema.DataSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see smar2t.td.w3c.dataschema.DataschemaPackage#getArraySchema_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSchema> getItems();

} // ArraySchema
