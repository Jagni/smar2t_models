/**
 */
package smar2t.ui.interaction;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see smar2t.ui.interaction.InteractionPackage
 * @generated
 */
public interface InteractionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractionFactory eINSTANCE = smar2t.ui.interaction.impl.InteractionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form</em>'.
	 * @generated
	 */
	Form createForm();

	/**
	 * Returns a new object of class '<em>Text Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Input</em>'.
	 * @generated
	 */
	TextInput createTextInput();

	/**
	 * Returns a new object of class '<em>Number Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Input</em>'.
	 * @generated
	 */
	NumberInput createNumberInput();

	/**
	 * Returns a new object of class '<em>Object Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Input</em>'.
	 * @generated
	 */
	ObjectInput createObjectInput();

	/**
	 * Returns a new object of class '<em>bool Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>bool Input</em>'.
	 * @generated
	 */
	boolInput createboolInput();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InteractionPackage getInteractionPackage();

} //InteractionFactory
