/**
 */
package thing_ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thing_ui.TextInput#getInputType <em>Input Type</em>}</li>
 * </ul>
 *
 * @see thing_ui.Thing_uiPackage#getTextInput()
 * @model
 * @generated
 */
public interface TextInput extends Input {
	/**
	 * Returns the value of the '<em><b>Input Type</b></em>' attribute.
	 * The literals are from the enumeration {@link thing_ui.TextInputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Type</em>' attribute.
	 * @see thing_ui.TextInputType
	 * @see #setInputType(TextInputType)
	 * @see thing_ui.Thing_uiPackage#getTextInput_InputType()
	 * @model required="true"
	 * @generated
	 */
	TextInputType getInputType();

	/**
	 * Sets the value of the '{@link thing_ui.TextInput#getInputType <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Type</em>' attribute.
	 * @see thing_ui.TextInputType
	 * @see #getInputType()
	 * @generated
	 */
	void setInputType(TextInputType value);

} // TextInput
