/**
 */
package thing_ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thing_ui.ObjectInput#getForm <em>Form</em>}</li>
 * </ul>
 *
 * @see thing_ui.Thing_uiPackage#getObjectInput()
 * @model
 * @generated
 */
public interface ObjectInput extends Input {
	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' containment reference.
	 * @see #setForm(Form)
	 * @see thing_ui.Thing_uiPackage#getObjectInput_Form()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Form getForm();

	/**
	 * Sets the value of the '{@link thing_ui.ObjectInput#getForm <em>Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' containment reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Form value);

} // ObjectInput
