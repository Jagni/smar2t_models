/**
 */
package thing_ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>bool Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thing_ui.boolInput#getInputType <em>Input Type</em>}</li>
 * </ul>
 *
 * @see thing_ui.Thing_uiPackage#getboolInput()
 * @model
 * @generated
 */
public interface boolInput extends Input {
	/**
	 * Returns the value of the '<em><b>Input Type</b></em>' attribute.
	 * The literals are from the enumeration {@link thing_ui.BoolInputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Type</em>' attribute.
	 * @see thing_ui.BoolInputType
	 * @see #setInputType(BoolInputType)
	 * @see thing_ui.Thing_uiPackage#getboolInput_InputType()
	 * @model required="true"
	 * @generated
	 */
	BoolInputType getInputType();

	/**
	 * Sets the value of the '{@link thing_ui.boolInput#getInputType <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Type</em>' attribute.
	 * @see thing_ui.BoolInputType
	 * @see #getInputType()
	 * @generated
	 */
	void setInputType(BoolInputType value);

} // boolInput
