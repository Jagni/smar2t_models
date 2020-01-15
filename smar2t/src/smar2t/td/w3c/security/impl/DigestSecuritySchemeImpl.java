/**
 */
package smar2t.td.w3c.security.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smar2t.td.w3c.security.DigestSecurityScheme;
import smar2t.td.w3c.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digest Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smar2t.td.w3c.security.impl.DigestSecuritySchemeImpl#getQop <em>Qop</em>}</li>
 *   <li>{@link smar2t.td.w3c.security.impl.DigestSecuritySchemeImpl#getIn <em>In</em>}</li>
 *   <li>{@link smar2t.td.w3c.security.impl.DigestSecuritySchemeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DigestSecuritySchemeImpl extends SecuritySchemeImpl implements DigestSecurityScheme {
	/**
	 * The default value of the '{@link #getQop() <em>Qop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQop()
	 * @generated
	 * @ordered
	 */
	protected static final String QOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQop() <em>Qop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQop()
	 * @generated
	 * @ordered
	 */
	protected String qop = QOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected String in = IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigestSecuritySchemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.DIGEST_SECURITY_SCHEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQop() {
		return qop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQop(String newQop) {
		String oldQop = qop;
		qop = newQop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.DIGEST_SECURITY_SCHEME__QOP, oldQop, qop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(String newIn) {
		String oldIn = in;
		in = newIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.DIGEST_SECURITY_SCHEME__IN, oldIn, in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.DIGEST_SECURITY_SCHEME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPackage.DIGEST_SECURITY_SCHEME__QOP:
				return getQop();
			case SecurityPackage.DIGEST_SECURITY_SCHEME__IN:
				return getIn();
			case SecurityPackage.DIGEST_SECURITY_SCHEME__NAME:
				return getName();
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
			case SecurityPackage.DIGEST_SECURITY_SCHEME__QOP:
				setQop((String)newValue);
				return;
			case SecurityPackage.DIGEST_SECURITY_SCHEME__IN:
				setIn((String)newValue);
				return;
			case SecurityPackage.DIGEST_SECURITY_SCHEME__NAME:
				setName((String)newValue);
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
			case SecurityPackage.DIGEST_SECURITY_SCHEME__QOP:
				setQop(QOP_EDEFAULT);
				return;
			case SecurityPackage.DIGEST_SECURITY_SCHEME__IN:
				setIn(IN_EDEFAULT);
				return;
			case SecurityPackage.DIGEST_SECURITY_SCHEME__NAME:
				setName(NAME_EDEFAULT);
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
			case SecurityPackage.DIGEST_SECURITY_SCHEME__QOP:
				return QOP_EDEFAULT == null ? qop != null : !QOP_EDEFAULT.equals(qop);
			case SecurityPackage.DIGEST_SECURITY_SCHEME__IN:
				return IN_EDEFAULT == null ? in != null : !IN_EDEFAULT.equals(in);
			case SecurityPackage.DIGEST_SECURITY_SCHEME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (qop: ");
		result.append(qop);
		result.append(", in: ");
		result.append(in);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DigestSecuritySchemeImpl
