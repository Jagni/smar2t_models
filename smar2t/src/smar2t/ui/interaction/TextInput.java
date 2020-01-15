/**
 */
package smar2t.ui.interaction;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smar2t.ui.interaction.TextInput#getInputType <em>Input Type</em>}</li>
 * </ul>
 *
 * @see smar2t.ui.interaction.InteractionPackage#getTextInput()
 * @model
 * @generated
 */
public interface TextInput extends Input {
	/**
	 * Returns the value of the '<em><b>Input Type</b></em>' attribute.
	 * The literals are from the enumeration {@link smar2t.ui.interaction.TextInputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Type</em>' attribute.
	 * @see smar2t.ui.interaction.TextInputType
	 * @see #setInputType(TextInputType)
	 * @see smar2t.ui.interaction.InteractionPackage#getTextInput_InputType()
	 * @model required="true"
	 * @generated
	 */
	TextInputType getInputType();

	/**
	 * Sets the value of the '{@link smar2t.ui.interaction.TextInput#getInputType <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Type</em>' attribute.
	 * @see smar2t.ui.interaction.TextInputType
	 * @see #getInputType()
	 * @generated
	 */
	void setInputType(TextInputType value);

} // TextInput
