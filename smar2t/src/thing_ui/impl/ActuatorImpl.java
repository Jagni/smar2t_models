/**
 */
package thing_ui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import thing_ui.Actuator;
import thing_ui.Thing_uiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thing_ui.impl.ActuatorImpl#getHref <em>Href</em>}</li>
 *   <li>{@link thing_ui.impl.ActuatorImpl#getCommunicationProtocol <em>Communication Protocol</em>}</li>
 *   <li>{@link thing_ui.impl.ActuatorImpl#getSecurityScheme <em>Security Scheme</em>}</li>
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
	protected static final String COMMUNICATION_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunicationProtocol() <em>Communication Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationProtocol()
	 * @generated
	 * @ordered
	 */
	protected String communicationProtocol = COMMUNICATION_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityScheme() <em>Security Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityScheme() <em>Security Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityScheme()
	 * @generated
	 * @ordered
	 */
	protected String securityScheme = SECURITY_SCHEME_EDEFAULT;

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
		return Thing_uiPackage.Literals.ACTUATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Thing_uiPackage.ACTUATOR__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommunicationProtocol() {
		return communicationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationProtocol(String newCommunicationProtocol) {
		String oldCommunicationProtocol = communicationProtocol;
		communicationProtocol = newCommunicationProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Thing_uiPackage.ACTUATOR__COMMUNICATION_PROTOCOL, oldCommunicationProtocol, communicationProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityScheme() {
		return securityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityScheme(String newSecurityScheme) {
		String oldSecurityScheme = securityScheme;
		securityScheme = newSecurityScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Thing_uiPackage.ACTUATOR__SECURITY_SCHEME, oldSecurityScheme, securityScheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Thing_uiPackage.ACTUATOR__HREF:
				return getHref();
			case Thing_uiPackage.ACTUATOR__COMMUNICATION_PROTOCOL:
				return getCommunicationProtocol();
			case Thing_uiPackage.ACTUATOR__SECURITY_SCHEME:
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
			case Thing_uiPackage.ACTUATOR__HREF:
				setHref((String)newValue);
				return;
			case Thing_uiPackage.ACTUATOR__COMMUNICATION_PROTOCOL:
				setCommunicationProtocol((String)newValue);
				return;
			case Thing_uiPackage.ACTUATOR__SECURITY_SCHEME:
				setSecurityScheme((String)newValue);
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
			case Thing_uiPackage.ACTUATOR__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case Thing_uiPackage.ACTUATOR__COMMUNICATION_PROTOCOL:
				setCommunicationProtocol(COMMUNICATION_PROTOCOL_EDEFAULT);
				return;
			case Thing_uiPackage.ACTUATOR__SECURITY_SCHEME:
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
			case Thing_uiPackage.ACTUATOR__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case Thing_uiPackage.ACTUATOR__COMMUNICATION_PROTOCOL:
				return COMMUNICATION_PROTOCOL_EDEFAULT == null ? communicationProtocol != null : !COMMUNICATION_PROTOCOL_EDEFAULT.equals(communicationProtocol);
			case Thing_uiPackage.ACTUATOR__SECURITY_SCHEME:
				return SECURITY_SCHEME_EDEFAULT == null ? securityScheme != null : !SECURITY_SCHEME_EDEFAULT.equals(securityScheme);
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
