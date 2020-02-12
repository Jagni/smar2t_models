/**
 */
package thing_ui.interaction;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thing_ui.interaction.NumberInput#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link thing_ui.interaction.NumberInput#getMinimumLabel <em>Minimum Label</em>}</li>
 *   <li>{@link thing_ui.interaction.NumberInput#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link thing_ui.interaction.NumberInput#getMaximumLabel <em>Maximum Label</em>}</li>
 *   <li>{@link thing_ui.interaction.NumberInput#getInputType <em>Input Type</em>}</li>
 * </ul>
 *
 * @see thing_ui.interaction.InteractionPackage#getNumberInput()
 * @model
 * @generated
 */
public interface NumberInput extends Input {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(double)
	 * @see thing_ui.interaction.InteractionPackage#getNumberInput_Minimum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getMinimum();

	/**
	 * Sets the value of the '{@link thing_ui.interaction.NumberInput#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(double value);

	/**
	 * Returns the value of the '<em><b>Minimum Label</b></em>' attribute.
	 * The default value is <code>"min"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Label</em>' attribute.
	 * @see #setMinimumLabel(String)
	 * @see thing_ui.interaction.InteractionPackage#getNumberInput_MinimumLabel()
	 * @model default="min"
	 * @generated
	 */
	String getMinimumLabel();

	/**
	 * Sets the value of the '{@link thing_ui.interaction.NumberInput#getMinimumLabel <em>Minimum Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Label</em>' attribute.
	 * @see #getMinimumLabel()
	 * @generated
	 */
	void setMinimumLabel(String value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(double)
	 * @see thing_ui.interaction.InteractionPackage#getNumberInput_Maximum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getMaximum();

	/**
	 * Sets the value of the '{@link thing_ui.interaction.NumberInput#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Label</b></em>' attribute.
	 * The default value is <code>"max"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Label</em>' attribute.
	 * @see #setMaximumLabel(String)
	 * @see thing_ui.interaction.InteractionPackage#getNumberInput_MaximumLabel()
	 * @model default="max"
	 * @generated
	 */
	String getMaximumLabel();

	/**
	 * Sets the value of the '{@link thing_ui.interaction.NumberInput#getMaximumLabel <em>Maximum Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Label</em>' attribute.
	 * @see #getMaximumLabel()
	 * @generated
	 */
	void setMaximumLabel(String value);

	/**
	 * Returns the value of the '<em><b>Input Type</b></em>' attribute.
	 * The default value is <code>"keyboard"</code>.
	 * The literals are from the enumeration {@link thing_ui.interaction.NumberInputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Type</em>' attribute.
	 * @see thing_ui.interaction.NumberInputType
	 * @see #setInputType(NumberInputType)
	 * @see thing_ui.interaction.InteractionPackage#getNumberInput_InputType()
	 * @model default="keyboard" required="true"
	 * @generated
	 */
	NumberInputType getInputType();

	/**
	 * Sets the value of the '{@link thing_ui.interaction.NumberInput#getInputType <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Type</em>' attribute.
	 * @see thing_ui.interaction.NumberInputType
	 * @see #getInputType()
	 * @generated
	 */
	void setInputType(NumberInputType value);

} // NumberInput
