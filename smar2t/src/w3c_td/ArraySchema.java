/**
 */
package w3c_td;

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
 *   <li>{@link w3c_td.ArraySchema#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link w3c_td.ArraySchema#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link w3c_td.ArraySchema#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see w3c_td.W3c_tdPackage#getArraySchema()
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
	 * @see w3c_td.W3c_tdPackage#getArraySchema_MinItems()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 * @generated
	 */
	long getMinItems();

	/**
	 * Sets the value of the '{@link w3c_td.ArraySchema#getMinItems <em>Min Items</em>}' attribute.
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
	 * @see w3c_td.W3c_tdPackage#getArraySchema_MaxItems()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 * @generated
	 */
	long getMaxItems();

	/**
	 * Sets the value of the '{@link w3c_td.ArraySchema#getMaxItems <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Items</em>' attribute.
	 * @see #getMaxItems()
	 * @generated
	 */
	void setMaxItems(long value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link w3c_td.DataSchema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see w3c_td.W3c_tdPackage#getArraySchema_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataSchema> getItems();

} // ArraySchema
