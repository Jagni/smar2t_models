/**
 */
package smar2t.ui.interaction.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smar2t.ui.interaction.InteractionPackage;
import smar2t.ui.interaction.NumberInput;
import smar2t.ui.interaction.NumberInputType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smar2t.ui.interaction.impl.NumberInputImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link smar2t.ui.interaction.impl.NumberInputImpl#getMinimumLabel <em>Minimum Label</em>}</li>
 *   <li>{@link smar2t.ui.interaction.impl.NumberInputImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link smar2t.ui.interaction.impl.NumberInputImpl#getMaximumLabel <em>Maximum Label</em>}</li>
 *   <li>{@link smar2t.ui.interaction.impl.NumberInputImpl#getInputType <em>Input Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberInputImpl extends InputImpl implements NumberInput {
	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected double minimum = MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumLabel() <em>Minimum Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_LABEL_EDEFAULT = "min";

	/**
	 * The cached value of the '{@link #getMinimumLabel() <em>Minimum Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumLabel()
	 * @generated
	 * @ordered
	 */
	protected String minimumLabel = MINIMUM_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected double maximum = MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumLabel() <em>Maximum Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_LABEL_EDEFAULT = "max";

	/**
	 * The cached value of the '{@link #getMaximumLabel() <em>Maximum Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumLabel()
	 * @generated
	 * @ordered
	 */
	protected String maximumLabel = MAXIMUM_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputType() <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputType()
	 * @generated
	 * @ordered
	 */
	protected static final NumberInputType INPUT_TYPE_EDEFAULT = NumberInputType.KEYBOARD;

	/**
	 * The cached value of the '{@link #getInputType() <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputType()
	 * @generated
	 * @ordered
	 */
	protected NumberInputType inputType = INPUT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.NUMBER_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(double newMinimum) {
		double oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.NUMBER_INPUT__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimumLabel() {
		return minimumLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumLabel(String newMinimumLabel) {
		String oldMinimumLabel = minimumLabel;
		minimumLabel = newMinimumLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.NUMBER_INPUT__MINIMUM_LABEL, oldMinimumLabel, minimumLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(double newMaximum) {
		double oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.NUMBER_INPUT__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximumLabel() {
		return maximumLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumLabel(String newMaximumLabel) {
		String oldMaximumLabel = maximumLabel;
		maximumLabel = newMaximumLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.NUMBER_INPUT__MAXIMUM_LABEL, oldMaximumLabel, maximumLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberInputType getInputType() {
		return inputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputType(NumberInputType newInputType) {
		NumberInputType oldInputType = inputType;
		inputType = newInputType == null ? INPUT_TYPE_EDEFAULT : newInputType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.NUMBER_INPUT__INPUT_TYPE, oldInputType, inputType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.NUMBER_INPUT__MINIMUM:
				return getMinimum();
			case InteractionPackage.NUMBER_INPUT__MINIMUM_LABEL:
				return getMinimumLabel();
			case InteractionPackage.NUMBER_INPUT__MAXIMUM:
				return getMaximum();
			case InteractionPackage.NUMBER_INPUT__MAXIMUM_LABEL:
				return getMaximumLabel();
			case InteractionPackage.NUMBER_INPUT__INPUT_TYPE:
				return getInputType();
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
			case InteractionPackage.NUMBER_INPUT__MINIMUM:
				setMinimum((Double)newValue);
				return;
			case InteractionPackage.NUMBER_INPUT__MINIMUM_LABEL:
				setMinimumLabel((String)newValue);
				return;
			case InteractionPackage.NUMBER_INPUT__MAXIMUM:
				setMaximum((Double)newValue);
				return;
			case InteractionPackage.NUMBER_INPUT__MAXIMUM_LABEL:
				setMaximumLabel((String)newValue);
				return;
			case InteractionPackage.NUMBER_INPUT__INPUT_TYPE:
				setInputType((NumberInputType)newValue);
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
			case InteractionPackage.NUMBER_INPUT__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case InteractionPackage.NUMBER_INPUT__MINIMUM_LABEL:
				setMinimumLabel(MINIMUM_LABEL_EDEFAULT);
				return;
			case InteractionPackage.NUMBER_INPUT__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case InteractionPackage.NUMBER_INPUT__MAXIMUM_LABEL:
				setMaximumLabel(MAXIMUM_LABEL_EDEFAULT);
				return;
			case InteractionPackage.NUMBER_INPUT__INPUT_TYPE:
				setInputType(INPUT_TYPE_EDEFAULT);
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
			case InteractionPackage.NUMBER_INPUT__MINIMUM:
				return minimum != MINIMUM_EDEFAULT;
			case InteractionPackage.NUMBER_INPUT__MINIMUM_LABEL:
				return MINIMUM_LABEL_EDEFAULT == null ? minimumLabel != null : !MINIMUM_LABEL_EDEFAULT.equals(minimumLabel);
			case InteractionPackage.NUMBER_INPUT__MAXIMUM:
				return maximum != MAXIMUM_EDEFAULT;
			case InteractionPackage.NUMBER_INPUT__MAXIMUM_LABEL:
				return MAXIMUM_LABEL_EDEFAULT == null ? maximumLabel != null : !MAXIMUM_LABEL_EDEFAULT.equals(maximumLabel);
			case InteractionPackage.NUMBER_INPUT__INPUT_TYPE:
				return inputType != INPUT_TYPE_EDEFAULT;
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
		result.append(" (minimum: ");
		result.append(minimum);
		result.append(", minimumLabel: ");
		result.append(minimumLabel);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", maximumLabel: ");
		result.append(maximumLabel);
		result.append(", inputType: ");
		result.append(inputType);
		result.append(')');
		return result.toString();
	}

} //NumberInputImpl
