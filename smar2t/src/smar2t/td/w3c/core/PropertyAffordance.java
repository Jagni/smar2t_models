/**
 */
package smar2t.td.w3c.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Affordance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smar2t.td.w3c.core.PropertyAffordance#isObservable <em>Observable</em>}</li>
 * </ul>
 *
 * @see smar2t.td.w3c.core.CorePackage#getPropertyAffordance()
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
	 * @see smar2t.td.w3c.core.CorePackage#getPropertyAffordance_Observable()
	 * @model
	 * @generated
	 */
	boolean isObservable();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.core.PropertyAffordance#isObservable <em>Observable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observable</em>' attribute.
	 * @see #isObservable()
	 * @generated
	 */
	void setObservable(boolean value);

} // PropertyAffordance
