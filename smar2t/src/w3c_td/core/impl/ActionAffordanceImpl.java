/**
 */
package w3c_td.core.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import w3c_td.core.ActionAffordance;
import w3c_td.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Affordance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link w3c_td.core.impl.ActionAffordanceImpl#isSafe <em>Safe</em>}</li>
 *   <li>{@link w3c_td.core.impl.ActionAffordanceImpl#isIdempotent <em>Idempotent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionAffordanceImpl extends InteractionAffordanceImpl implements ActionAffordance {
	/**
	 * The default value of the '{@link #isSafe() <em>Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAFE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSafe() <em>Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafe()
	 * @generated
	 * @ordered
	 */
	protected boolean safe = SAFE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIdempotent() <em>Idempotent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdempotent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IDEMPOTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIdempotent() <em>Idempotent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdempotent()
	 * @generated
	 * @ordered
	 */
	protected boolean idempotent = IDEMPOTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionAffordanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ACTION_AFFORDANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSafe() {
		return safe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafe(boolean newSafe) {
		boolean oldSafe = safe;
		safe = newSafe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ACTION_AFFORDANCE__SAFE, oldSafe, safe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIdempotent() {
		return idempotent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdempotent(boolean newIdempotent) {
		boolean oldIdempotent = idempotent;
		idempotent = newIdempotent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ACTION_AFFORDANCE__IDEMPOTENT, oldIdempotent, idempotent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ACTION_AFFORDANCE__SAFE:
				return isSafe();
			case CorePackage.ACTION_AFFORDANCE__IDEMPOTENT:
				return isIdempotent();
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
			case CorePackage.ACTION_AFFORDANCE__SAFE:
				setSafe((Boolean)newValue);
				return;
			case CorePackage.ACTION_AFFORDANCE__IDEMPOTENT:
				setIdempotent((Boolean)newValue);
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
			case CorePackage.ACTION_AFFORDANCE__SAFE:
				setSafe(SAFE_EDEFAULT);
				return;
			case CorePackage.ACTION_AFFORDANCE__IDEMPOTENT:
				setIdempotent(IDEMPOTENT_EDEFAULT);
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
			case CorePackage.ACTION_AFFORDANCE__SAFE:
				return safe != SAFE_EDEFAULT;
			case CorePackage.ACTION_AFFORDANCE__IDEMPOTENT:
				return idempotent != IDEMPOTENT_EDEFAULT;
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
		result.append(" (safe: ");
		result.append(safe);
		result.append(", idempotent: ");
		result.append(idempotent);
		result.append(')');
		return result.toString();
	}

} //ActionAffordanceImpl
