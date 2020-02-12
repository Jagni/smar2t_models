/**
 */
package w3c_td.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Affordance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link w3c_td.core.PropertyAffordance#isObservable <em>Observable</em>}</li>
 * </ul>
 *
 * @see w3c_td.core.CorePackage#getPropertyAffordance()
 * @model
 * @generated
 */
public interface PropertyAffordance extends InteractionAffordance {
	/**
	 * Returns the value of the '<em><b>Observable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observable</em>' attribute.
	 * @see #setObservable(boolean)
	 * @see w3c_td.core.CorePackage#getPropertyAffordance_Observable()
	 * @model
	 * @generated
	 */
	boolean isObservable();

	/**
	 * Sets the value of the '{@link w3c_td.core.PropertyAffordance#isObservable <em>Observable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observable</em>' attribute.
	 * @see #isObservable()
	 * @generated
	 */
	void setObservable(boolean value);

} // PropertyAffordance
