/**
 */
package thing_ui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thing_ui.Actuator#getHref <em>Href</em>}</li>
 *   <li>{@link thing_ui.Actuator#getCommunicationProtocol <em>Communication Protocol</em>}</li>
 *   <li>{@link thing_ui.Actuator#getSecurityScheme <em>Security Scheme</em>}</li>
 * </ul>
 *
 * @see thing_ui.Thing_uiPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends EObject {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see thing_ui.Thing_uiPackage#getActuator_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link thing_ui.Actuator#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Communication Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Protocol</em>' attribute.
	 * @see #setCommunicationProtocol(String)
	 * @see thing_ui.Thing_uiPackage#getActuator_CommunicationProtocol()
	 * @model required="true"
	 * @generated
	 */
	String getCommunicationProtocol();

	/**
	 * Sets the value of the '{@link thing_ui.Actuator#getCommunicationProtocol <em>Communication Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Protocol</em>' attribute.
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	void setCommunicationProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Security Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Scheme</em>' attribute.
	 * @see #setSecurityScheme(String)
	 * @see thing_ui.Thing_uiPackage#getActuator_SecurityScheme()
	 * @model required="true"
	 * @generated
	 */
	String getSecurityScheme();

	/**
	 * Sets the value of the '{@link thing_ui.Actuator#getSecurityScheme <em>Security Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Scheme</em>' attribute.
	 * @see #getSecurityScheme()
	 * @generated
	 */
	void setSecurityScheme(String value);

} // Actuator
