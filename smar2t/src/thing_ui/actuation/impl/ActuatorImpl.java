/**
 */
package thing_ui.actuation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import thing_ui.actuation.ActuationPackage;
import thing_ui.actuation.Actuator;
import thing_ui.actuation.CommunicationProtocol;
import thing_ui.actuation.SecurityScheme;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thing_ui.actuation.impl.ActuatorImpl#getHref <em>Href</em>}</li>
 *   <li>{@link thing_ui.actuation.impl.ActuatorImpl#getCommunicationProtocol <em>Communication Protocol</em>}</li>
 *   <li>{@link thing_ui.actuation.impl.ActuatorImpl#getSecurityScheme <em>Security Scheme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorImpl extends MinimalEObjectImpl.Container implements Actuator {
	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunicationProtocol() <em>Communication Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final CommunicationProtocol COMMUNICATION_PROTOCOL_EDEFAULT = CommunicationProtocol.HTTP;

	/**
	 * The cached value of the '{@link #getCommunicationProtocol() <em>Communication Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationProtocol()
	 * @generated
	 * @ordered
	 */
	protected CommunicationProtocol communicationProtocol = COMMUNICATION_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityScheme() <em>Security Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityScheme()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityScheme SECURITY_SCHEME_EDEFAULT = SecurityScheme.NONE;

	/**
	 * The cached value of the '{@link #getSecurityScheme() <em>Security Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityScheme()
	 * @generated
	 * @ordered
	 */
	protected SecurityScheme securityScheme = SECURITY_SCHEME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActuationPackage.Literals.ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActuationPackage.ACTUATOR__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationProtocol getCommunicationProtocol() {
		return communicationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationProtocol(CommunicationProtocol newCommunicationProtocol) {
		CommunicationProtocol oldCommunicationProtocol = communicationProtocol;
		communicationProtocol = newCommunicationProtocol == null ? COMMUNICATION_PROTOCOL_EDEFAULT : newCommunicationProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActuationPackage.ACTUATOR__COMMUNICATION_PROTOCOL, oldCommunicationProtocol, communicationProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityScheme getSecurityScheme() {
		return securityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityScheme(SecurityScheme newSecurityScheme) {
		SecurityScheme oldSecurityScheme = securityScheme;
		securityScheme = newSecurityScheme == null ? SECURITY_SCHEME_EDEFAULT : newSecurityScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActuationPackage.ACTUATOR__SECURITY_SCHEME, oldSecurityScheme, securityScheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActuationPackage.ACTUATOR__HREF:
				return getHref();
			case ActuationPackage.ACTUATOR__COMMUNICATION_PROTOCOL:
				return getCommunicationProtocol();
			case ActuationPackage.ACTUATOR__SECURITY_SCHEME:
				return getSecurityScheme();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActuationPackage.ACTUATOR__HREF:
				setHref((String)newValue);
				return;
			case ActuationPackage.ACTUATOR__COMMUNICATION_PROTOCOL:
				setCommunicationProtocol((CommunicationProtocol)newValue);
				return;
			case ActuationPackage.ACTUATOR__SECURITY_SCHEME:
				setSecurityScheme((SecurityScheme)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActuationPackage.ACTUATOR__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case ActuationPackage.ACTUATOR__COMMUNICATION_PROTOCOL:
				setCommunicationProtocol(COMMUNICATION_PROTOCOL_EDEFAULT);
				return;
			case ActuationPackage.ACTUATOR__SECURITY_SCHEME:
				setSecurityScheme(SECURITY_SCHEME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActuationPackage.ACTUATOR__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case ActuationPackage.ACTUATOR__COMMUNICATION_PROTOCOL:
				return communicationProtocol != COMMUNICATION_PROTOCOL_EDEFAULT;
			case ActuationPackage.ACTUATOR__SECURITY_SCHEME:
				return securityScheme != SECURITY_SCHEME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (href: ");
		result.append(href);
		result.append(", communicationProtocol: ");
		result.append(communicationProtocol);
		result.append(", securityScheme: ");
		result.append(securityScheme);
		result.append(')');
		return result.toString();
	}

} //ActuatorImpl
