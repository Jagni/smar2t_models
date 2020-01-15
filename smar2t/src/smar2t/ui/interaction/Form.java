/**
 */
package smar2t.ui.interaction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import smar2t.ui.actuation.Actuator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smar2t.ui.interaction.Form#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link smar2t.ui.interaction.Form#isShowsSubmitButton <em>Shows Submit Button</em>}</li>
 *   <li>{@link smar2t.ui.interaction.Form#getInputs <em>Inputs</em>}</li>
 *   <li>{@link smar2t.ui.interaction.Form#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @see smar2t.ui.interaction.InteractionPackage#getForm()
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
	 * @see smar2t.ui.interaction.InteractionPackage#getForm_ReadOnly()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link smar2t.ui.interaction.Form#isReadOnly <em>Read Only</em>}' attribute.
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
	 * @see smar2t.ui.interaction.InteractionPackage#getForm_ShowsSubmitButton()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isShowsSubmitButton();

	/**
	 * Sets the value of the '{@link smar2t.ui.interaction.Form#isShowsSubmitButton <em>Shows Submit Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shows Submit Button</em>' attribute.
	 * @see #isShowsSubmitButton()
	 * @generated
	 */
	void setShowsSubmitButton(boolean value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link smar2t.ui.interaction.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see smar2t.ui.interaction.InteractionPackage#getForm_Inputs()
	 * @model required="true"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' reference.
	 * @see #setActuator(Actuator)
	 * @see smar2t.ui.interaction.InteractionPackage#getForm_Actuator()
	 * @model required="true"
	 * @generated
	 */
	Actuator getActuator();

	/**
	 * Sets the value of the '{@link smar2t.ui.interaction.Form#getActuator <em>Actuator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator</em>' reference.
	 * @see #getActuator()
	 * @generated
	 */
	void setActuator(Actuator value);

} // Form
