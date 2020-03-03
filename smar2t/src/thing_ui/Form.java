/**
 */
package thing_ui;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thing_ui.Form#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link thing_ui.Form#isShowsSubmitButton <em>Shows Submit Button</em>}</li>
 *   <li>{@link thing_ui.Form#getInputs <em>Inputs</em>}</li>
 *   <li>{@link thing_ui.Form#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @see thing_ui.Thing_uiPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends EObject {
	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see thing_ui.Thing_uiPackage#getForm_ReadOnly()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link thing_ui.Form#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Shows Submit Button</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shows Submit Button</em>' attribute.
	 * @see #setShowsSubmitButton(boolean)
	 * @see thing_ui.Thing_uiPackage#getForm_ShowsSubmitButton()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isShowsSubmitButton();

	/**
	 * Sets the value of the '{@link thing_ui.Form#isShowsSubmitButton <em>Shows Submit Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shows Submit Button</em>' attribute.
	 * @see #isShowsSubmitButton()
	 * @generated
	 */
	void setShowsSubmitButton(boolean value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link thing_ui.Input},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' map.
	 * @see thing_ui.Thing_uiPackage#getForm_Inputs()
	 * @model mapType="thing_ui.StringToInputMap&lt;org.eclipse.emf.ecore.EString, thing_ui.Input&gt;"
	 * @generated
	 */
	EMap<String, Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' containment reference.
	 * @see #setActuator(Actuator)
	 * @see thing_ui.Thing_uiPackage#getForm_Actuator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Actuator getActuator();

	/**
	 * Sets the value of the '{@link thing_ui.Form#getActuator <em>Actuator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator</em>' containment reference.
	 * @see #getActuator()
	 * @generated
	 */
	void setActuator(Actuator value);

} // Form
