/**
 */
package smar2t.ui.interaction;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>bool Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smar2t.ui.interaction.boolInput#getInputType <em>Input Type</em>}</li>
 * </ul>
 *
 * @see smar2t.ui.interaction.InteractionPackage#getboolInput()
 * @model
 * @generated
 */
public interface boolInput extends Input {
	/**
	 * Returns the value of the '<em><b>Input Type</b></em>' attribute.
	 * The literals are from the enumeration {@link smar2t.ui.interaction.BoolInputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Type</em>' attribute.
	 * @see smar2t.ui.interaction.BoolInputType
	 * @see #setInputType(BoolInputType)
	 * @see smar2t.ui.interaction.InteractionPackage#getboolInput_InputType()
	 * @model required="true"
	 * @generated
	 */
	BoolInputType getInputType();

	/**
	 * Sets the value of the '{@link smar2t.ui.interaction.boolInput#getInputType <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Type</em>' attribute.
	 * @see smar2t.ui.interaction.BoolInputType
	 * @see #getInputType()
	 * @generated
	 */
	void setInputType(BoolInputType value);

} // boolInput
