/**
 */
package smar2t.ui.interaction.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import smar2t.ui.actuation.Actuator;

import smar2t.ui.interaction.Form;
import smar2t.ui.interaction.Input;
import smar2t.ui.interaction.InteractionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smar2t.ui.interaction.impl.FormImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link smar2t.ui.interaction.impl.FormImpl#isShowsSubmitButton <em>Shows Submit Button</em>}</li>
 *   <li>{@link smar2t.ui.interaction.impl.FormImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link smar2t.ui.interaction.impl.FormImpl#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormImpl extends MinimalEObjectImpl.Container implements Form {
	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowsSubmitButton() <em>Shows Submit Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowsSubmitButton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOWS_SUBMIT_BUTTON_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowsSubmitButton() <em>Shows Submit Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowsSubmitButton()
	 * @generated
	 * @ordered
	 */
	protected boolean showsSubmitButton = SHOWS_SUBMIT_BUTTON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputs;

	/**
	 * The cached value of the '{@link #getActuator() <em>Actuator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuator()
	 * @generated
	 * @ordered
	 */
	protected Actuator actuator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.FORM__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowsSubmitButton() {
		return showsSubmitButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowsSubmitButton(boolean newShowsSubmitButton) {
		boolean oldShowsSubmitButton = showsSubmitButton;
		showsSubmitButton = newShowsSubmitButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.FORM__SHOWS_SUBMIT_BUTTON, oldShowsSubmitButton, showsSubmitButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<Input>(Input.class, this, InteractionPackage.FORM__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator getActuator() {
		if (actuator != null && actuator.eIsProxy()) {
			InternalEObject oldActuator = (InternalEObject)actuator;
			actuator = (Actuator)eResolveProxy(oldActuator);
			if (actuator != oldActuator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.FORM__ACTUATOR, oldActuator, actuator));
			}
		}
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator basicGetActuator() {
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuator(Actuator newActuator) {
		Actuator oldActuator = actuator;
		actuator = newActuator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.FORM__ACTUATOR, oldActuator, actuator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.FORM__READ_ONLY:
				return isReadOnly();
			case InteractionPackage.FORM__SHOWS_SUBMIT_BUTTON:
				return isShowsSubmitButton();
			case InteractionPackage.FORM__INPUTS:
				return getInputs();
			case InteractionPackage.FORM__ACTUATOR:
				if (resolve) return getActuator();
				return basicGetActuator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InteractionPackage.FORM__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case InteractionPackage.FORM__SHOWS_SUBMIT_BUTTON:
				setShowsSubmitButton((Boolean)newValue);
				return;
			case InteractionPackage.FORM__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Input>)newValue);
				return;
			case InteractionPackage.FORM__ACTUATOR:
				setActuator((Actuator)newValue);
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
			case InteractionPackage.FORM__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case InteractionPackage.FORM__SHOWS_SUBMIT_BUTTON:
				setShowsSubmitButton(SHOWS_SUBMIT_BUTTON_EDEFAULT);
				return;
			case InteractionPackage.FORM__INPUTS:
				getInputs().clear();
				return;
			case InteractionPackage.FORM__ACTUATOR:
				setActuator((Actuator)null);
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
			case InteractionPackage.FORM__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case InteractionPackage.FORM__SHOWS_SUBMIT_BUTTON:
				return showsSubmitButton != SHOWS_SUBMIT_BUTTON_EDEFAULT;
			case InteractionPackage.FORM__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case InteractionPackage.FORM__ACTUATOR:
				return actuator != null;
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
		result.append(" (readOnly: ");
		result.append(readOnly);
		result.append(", showsSubmitButton: ");
		result.append(showsSubmitButton);
		result.append(')');
		return result.toString();
	}

} //FormImpl
