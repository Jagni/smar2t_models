/**
 */
package mozilla_td.impl;

import mozilla_td.Input;
import mozilla_td.Mozilla_tdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mozilla_td.impl.InputImpl#getSemanticType <em>Semantic Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends AttributeImpl implements Input {
	/**
	 * The default value of the '{@link #getSemanticType() <em>Semantic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticType()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticType() <em>Semantic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticType()
	 * @generated
	 * @ordered
	 */
	protected String semanticType = SEMANTIC_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mozilla_tdPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemanticType() {
		return semanticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticType(String newSemanticType) {
		String oldSemanticType = semanticType;
		semanticType = newSemanticType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.INPUT__SEMANTIC_TYPE, oldSemanticType, semanticType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mozilla_tdPackage.INPUT__SEMANTIC_TYPE:
				return getSemanticType();
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
			case Mozilla_tdPackage.INPUT__SEMANTIC_TYPE:
				setSemanticType((String)newValue);
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
			case Mozilla_tdPackage.INPUT__SEMANTIC_TYPE:
				setSemanticType(SEMANTIC_TYPE_EDEFAULT);
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
			case Mozilla_tdPackage.INPUT__SEMANTIC_TYPE:
				return SEMANTIC_TYPE_EDEFAULT == null ? semanticType != null : !SEMANTIC_TYPE_EDEFAULT.equals(semanticType);
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
		result.append(" (semanticType: ");
		result.append(semanticType);
		result.append(')');
		return result.toString();
	}

} //InputImpl
