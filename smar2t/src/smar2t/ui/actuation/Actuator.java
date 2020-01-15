/**
 */
package smar2t.ui.actuation;

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
 *   <li>{@link smar2t.ui.actuation.Actuator#getHref <em>Href</em>}</li>
 *   <li>{@link smar2t.ui.actuation.Actuator#getCommunicationProtocol <em>Communication Protocol</em>}</li>
 *   <li>{@link smar2t.ui.actuation.Actuator#getSecurityScheme <em>Security Scheme</em>}</li>
 * </ul>
 *
 * @see smar2t.ui.actuation.ActuationPackage#getActuator()
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
	 * @see smar2t.ui.actuation.ActuationPackage#getActuator_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link smar2t.ui.actuation.Actuator#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Communication Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link smar2t.ui.actuation.CommunicationProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Protocol</em>' attribute.
	 * @see smar2t.ui.actuation.CommunicationProtocol
	 * @see #setCommunicationProtocol(CommunicationProtocol)
	 * @see smar2t.ui.actuation.ActuationPackage#getActuator_CommunicationProtocol()
	 * @model required="true"
	 * @generated
	 */
	CommunicationProtocol getCommunicationProtocol();

	/**
	 * Sets the value of the '{@link smar2t.ui.actuation.Actuator#getCommunicationProtocol <em>Communication Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Protocol</em>' attribute.
	 * @see smar2t.ui.actuation.CommunicationProtocol
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	void setCommunicationProtocol(CommunicationProtocol value);

	/**
	 * Returns the value of the '<em><b>Security Scheme</b></em>' attribute.
	 * The literals are from the enumeration {@link smar2t.ui.actuation.SecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Scheme</em>' attribute.
	 * @see smar2t.ui.actuation.SecurityScheme
	 * @see #setSecurityScheme(SecurityScheme)
	 * @see smar2t.ui.actuation.ActuationPackage#getActuator_SecurityScheme()
	 * @model required="true"
	 * @generated
	 */
	SecurityScheme getSecurityScheme();

	/**
	 * Sets the value of the '{@link smar2t.ui.actuation.Actuator#getSecurityScheme <em>Security Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Scheme</em>' attribute.
	 * @see smar2t.ui.actuation.SecurityScheme
	 * @see #getSecurityScheme()
	 * @generated
	 */
	void setSecurityScheme(SecurityScheme value);

} // Actuator
