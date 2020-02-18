/**
 */
package thing_ui.actuation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see thing_ui.actuation.ActuationFactory
 * @model kind="package"
 * @generated
 */
public interface ActuationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "actuation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://smar2t.org/models/thing_ui/actuation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UIActuation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActuationPackage eINSTANCE = thing_ui.actuation.impl.ActuationPackageImpl.init();

	/**
	 * The meta object id for the '{@link thing_ui.actuation.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.actuation.impl.ActuatorImpl
	 * @see thing_ui.actuation.impl.ActuationPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__HREF = 0;

	/**
	 * The feature id for the '<em><b>Communication Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__COMMUNICATION_PROTOCOL = 1;

	/**
	 * The feature id for the '<em><b>Security Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__SECURITY_SCHEME = 2;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link thing_ui.actuation.CommunicationProtocol <em>Communication Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.actuation.CommunicationProtocol
	 * @see thing_ui.actuation.impl.ActuationPackageImpl#getCommunicationProtocol()
	 * @generated
	 */
	int COMMUNICATION_PROTOCOL = 1;

	/**
	 * The meta object id for the '{@link thing_ui.actuation.SecurityScheme <em>Security Scheme</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see thing_ui.actuation.SecurityScheme
	 * @see thing_ui.actuation.impl.ActuationPackageImpl#getSecurityScheme()
	 * @generated
	 */
	int SECURITY_SCHEME = 2;


	/**
	 * Returns the meta object for class '{@link thing_ui.actuation.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see thing_ui.actuation.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.actuation.Actuator#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see thing_ui.actuation.Actuator#getHref()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Href();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.actuation.Actuator#getCommunicationProtocol <em>Communication Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Protocol</em>'.
	 * @see thing_ui.actuation.Actuator#getCommunicationProtocol()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_CommunicationProtocol();

	/**
	 * Returns the meta object for the attribute '{@link thing_ui.actuation.Actuator#getSecurityScheme <em>Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Scheme</em>'.
	 * @see thing_ui.actuation.Actuator#getSecurityScheme()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_SecurityScheme();

	/**
	 * Returns the meta object for enum '{@link thing_ui.actuation.CommunicationProtocol <em>Communication Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Protocol</em>'.
	 * @see thing_ui.actuation.CommunicationProtocol
	 * @generated
	 */
	EEnum getCommunicationProtocol();

	/**
	 * Returns the meta object for enum '{@link thing_ui.actuation.SecurityScheme <em>Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Scheme</em>'.
	 * @see thing_ui.actuation.SecurityScheme
	 * @generated
	 */
	EEnum getSecurityScheme();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActuationFactory getActuationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link thing_ui.actuation.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.actuation.impl.ActuatorImpl
		 * @see thing_ui.actuation.impl.ActuationPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__HREF = eINSTANCE.getActuator_Href();

		/**
		 * The meta object literal for the '<em><b>Communication Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__COMMUNICATION_PROTOCOL = eINSTANCE.getActuator_CommunicationProtocol();

		/**
		 * The meta object literal for the '<em><b>Security Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__SECURITY_SCHEME = eINSTANCE.getActuator_SecurityScheme();

		/**
		 * The meta object literal for the '{@link thing_ui.actuation.CommunicationProtocol <em>Communication Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.actuation.CommunicationProtocol
		 * @see thing_ui.actuation.impl.ActuationPackageImpl#getCommunicationProtocol()
		 * @generated
		 */
		EEnum COMMUNICATION_PROTOCOL = eINSTANCE.getCommunicationProtocol();

		/**
		 * The meta object literal for the '{@link thing_ui.actuation.SecurityScheme <em>Security Scheme</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see thing_ui.actuation.SecurityScheme
		 * @see thing_ui.actuation.impl.ActuationPackageImpl#getSecurityScheme()
		 * @generated
		 */
		EEnum SECURITY_SCHEME = eINSTANCE.getSecurityScheme();

	}

} //ActuationPackage
