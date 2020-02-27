/**
 */
package thing_ui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import thing_ui.Actuator;
import thing_ui.Form;
import thing_ui.Input;
import thing_ui.Thing_uiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thing_ui.impl.FormImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link thing_ui.impl.FormImpl#isShowsSubmitButton <em>Shows Submit Button</em>}</li>
 *   <li>{@link thing_ui.impl.FormImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link thing_ui.impl.FormImpl#getActuator <em>Actuator</em>}</li>
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
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputs;

	/**
	 * The cached value of the '{@link #getActuator() <em>Actuator</em>}' containment reference.
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
		return Thing_uiPackage.Literals.FORM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Thing_uiPackage.FORM__READ_ONLY, oldReadOnly, readOnly));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Thing_uiPackage.FORM__SHOWS_SUBMIT_BUTTON, oldShowsSubmitButton, showsSubmitButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Input>(Input.class, this, Thing_uiPackage.FORM__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator getActuator() {
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuator(Actuator newActuator, NotificationChain msgs) {
		Actuator oldActuator = actuator;
		actuator = newActuator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Thing_uiPackage.FORM__ACTUATOR, oldActuator, newActuator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuator(Actuator newActuator) {
		if (newActuator != actuator) {
			NotificationChain msgs = null;
			if (actuator != null)
				msgs = ((InternalEObject)actuator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Thing_uiPackage.FORM__ACTUATOR, null, msgs);
			if (newActuator != null)
				msgs = ((InternalEObject)newActuator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Thing_uiPackage.FORM__ACTUATOR, null, msgs);
			msgs = basicSetActuator(newActuator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Thing_uiPackage.FORM__ACTUATOR, newActuator, newActuator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Thing_uiPackage.FORM__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case Thing_uiPackage.FORM__ACTUATOR:
				return basicSetActuator(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Thing_uiPackage.FORM__READ_ONLY:
				return isReadOnly();
			case Thing_uiPackage.FORM__SHOWS_SUBMIT_BUTTON:
				return isShowsSubmitButton();
			case Thing_uiPackage.FORM__INPUTS:
				return getInputs();
			case Thing_uiPackage.FORM__ACTUATOR:
				return getActuator();
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
			case Thing_uiPackage.FORM__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case Thing_uiPackage.FORM__SHOWS_SUBMIT_BUTTON:
				setShowsSubmitButton((Boolean)newValue);
				return;
			case Thing_uiPackage.FORM__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Input>)newValue);
				return;
			case Thing_uiPackage.FORM__ACTUATOR:
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
			case Thing_uiPackage.FORM__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case Thing_uiPackage.FORM__SHOWS_SUBMIT_BUTTON:
				setShowsSubmitButton(SHOWS_SUBMIT_BUTTON_EDEFAULT);
				return;
			case Thing_uiPackage.FORM__INPUTS:
				getInputs().clear();
				return;
			case Thing_uiPackage.FORM__ACTUATOR:
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
			case Thing_uiPackage.FORM__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case Thing_uiPackage.FORM__SHOWS_SUBMIT_BUTTON:
				return showsSubmitButton != SHOWS_SUBMIT_BUTTON_EDEFAULT;
			case Thing_uiPackage.FORM__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case Thing_uiPackage.FORM__ACTUATOR:
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
