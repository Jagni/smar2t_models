/**
 */
package thing_ui.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import thing_ui.Input;
import thing_ui.Thing_uiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link thing_ui.impl.InputImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link thing_ui.impl.InputImpl#getId <em>Id</em>}</li>
 *   <li>{@link thing_ui.impl.InputImpl#getEditingValue <em>Editing Value</em>}</li>
 *   <li>{@link thing_ui.impl.InputImpl#getThingValue <em>Thing Value</em>}</li>
 *   <li>{@link thing_ui.impl.InputImpl#getType <em>Type</em>}</li>
 *   <li>{@link thing_ui.impl.InputImpl#isInteractionEnabled <em>Interaction Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InputImpl extends MinimalEObjectImpl.Container implements Input {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditingValue() <em>Editing Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditingValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object EDITING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditingValue() <em>Editing Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditingValue()
	 * @generated
	 * @ordered
	 */
	protected Object editingValue = EDITING_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThingValue() <em>Thing Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThingValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object THING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThingValue() <em>Thing Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThingValue()
	 * @generated
	 * @ordered
	 */
	protected Object thingValue = THING_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isInteractionEnabled() <em>Interaction Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInteractionEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERACTION_ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isInteractionEnabled() <em>Interaction Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInteractionEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean interactionEnabled = INTERACTION_ENABLED_EDEFAULT;

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
		return Thing_uiPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Thing_uiPackage.INPUT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Thing_uiPackage.INPUT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEditingValue() {
		return editingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditingValue(Object newEditingValue) {
		Object oldEditingValue = editingValue;
		editingValue = newEditingValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Thing_uiPackage.INPUT__EDITING_VALUE, oldEditingValue, editingValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getThingValue() {
		return thingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThingValue(Object newThingValue) {
		Object oldThingValue = thingValue;
		thingValue = newThingValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Thing_uiPackage.INPUT__THING_VALUE, oldThingValue, thingValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Thing_uiPackage.INPUT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInteractionEnabled() {
		return interactionEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionEnabled(boolean newInteractionEnabled) {
		boolean oldInteractionEnabled = interactionEnabled;
		interactionEnabled = newInteractionEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Thing_uiPackage.INPUT__INTERACTION_ENABLED, oldInteractionEnabled, interactionEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Thing_uiPackage.INPUT__LABEL:
				return getLabel();
			case Thing_uiPackage.INPUT__ID:
				return getId();
			case Thing_uiPackage.INPUT__EDITING_VALUE:
				return getEditingValue();
			case Thing_uiPackage.INPUT__THING_VALUE:
				return getThingValue();
			case Thing_uiPackage.INPUT__TYPE:
				return getType();
			case Thing_uiPackage.INPUT__INTERACTION_ENABLED:
				return isInteractionEnabled();
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
			case Thing_uiPackage.INPUT__LABEL:
				setLabel((String)newValue);
				return;
			case Thing_uiPackage.INPUT__ID:
				setId((String)newValue);
				return;
			case Thing_uiPackage.INPUT__EDITING_VALUE:
				setEditingValue(newValue);
				return;
			case Thing_uiPackage.INPUT__THING_VALUE:
				setThingValue(newValue);
				return;
			case Thing_uiPackage.INPUT__TYPE:
				setType((String)newValue);
				return;
			case Thing_uiPackage.INPUT__INTERACTION_ENABLED:
				setInteractionEnabled((Boolean)newValue);
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
			case Thing_uiPackage.INPUT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case Thing_uiPackage.INPUT__ID:
				setId(ID_EDEFAULT);
				return;
			case Thing_uiPackage.INPUT__EDITING_VALUE:
				setEditingValue(EDITING_VALUE_EDEFAULT);
				return;
			case Thing_uiPackage.INPUT__THING_VALUE:
				setThingValue(THING_VALUE_EDEFAULT);
				return;
			case Thing_uiPackage.INPUT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Thing_uiPackage.INPUT__INTERACTION_ENABLED:
				setInteractionEnabled(INTERACTION_ENABLED_EDEFAULT);
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
			case Thing_uiPackage.INPUT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case Thing_uiPackage.INPUT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Thing_uiPackage.INPUT__EDITING_VALUE:
				return EDITING_VALUE_EDEFAULT == null ? editingValue != null : !EDITING_VALUE_EDEFAULT.equals(editingValue);
			case Thing_uiPackage.INPUT__THING_VALUE:
				return THING_VALUE_EDEFAULT == null ? thingValue != null : !THING_VALUE_EDEFAULT.equals(thingValue);
			case Thing_uiPackage.INPUT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case Thing_uiPackage.INPUT__INTERACTION_ENABLED:
				return interactionEnabled != INTERACTION_ENABLED_EDEFAULT;
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
		result.append(" (label: ");
		result.append(label);
		result.append(", id: ");
		result.append(id);
		result.append(", editingValue: ");
		result.append(editingValue);
		result.append(", thingValue: ");
		result.append(thingValue);
		result.append(", type: ");
		result.append(type);
		result.append(", interactionEnabled: ");
		result.append(interactionEnabled);
		result.append(')');
		return result.toString();
	}

} //InputImpl
