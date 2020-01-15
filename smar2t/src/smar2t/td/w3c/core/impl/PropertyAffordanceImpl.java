/**
 */
package smar2t.td.w3c.core.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smar2t.td.w3c.core.CorePackage;
import smar2t.td.w3c.core.PropertyAffordance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Affordance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smar2t.td.w3c.core.impl.PropertyAffordanceImpl#isObservable <em>Observable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyAffordanceImpl extends InteractionAffordanceImpl implements PropertyAffordance {
	/**
	 * The default value of the '{@link #isObservable() <em>Observable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObservable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBSERVABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObservable() <em>Observable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObservable()
	 * @generated
	 * @ordered
	 */
	protected boolean observable = OBSERVABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyAffordanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.PROPERTY_AFFORDANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObservable() {
		return observable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservable(boolean newObservable) {
		boolean oldObservable = observable;
		observable = newObservable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PROPERTY_AFFORDANCE__OBSERVABLE, oldObservable, observable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.PROPERTY_AFFORDANCE__OBSERVABLE:
				return isObservable();
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
			case CorePackage.PROPERTY_AFFORDANCE__OBSERVABLE:
				setObservable((Boolean)newValue);
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
			case CorePackage.PROPERTY_AFFORDANCE__OBSERVABLE:
				setObservable(OBSERVABLE_EDEFAULT);
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
			case CorePackage.PROPERTY_AFFORDANCE__OBSERVABLE:
				return observable != OBSERVABLE_EDEFAULT;
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
		result.append(" (observable: ");
		result.append(observable);
		result.append(')');
		return result.toString();
	}

} //PropertyAffordanceImpl
