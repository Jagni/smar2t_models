/**
 */
package mozilla_td.impl;

import java.util.Collection;

import mozilla_td.Attribute;
import mozilla_td.Mozilla_tdPackage;
import mozilla_td.PrimitiveType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mozilla_td.impl.AttributeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link mozilla_td.impl.AttributeImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link mozilla_td.impl.AttributeImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link mozilla_td.impl.AttributeImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link mozilla_td.impl.AttributeImpl#getMultipleOf <em>Multiple Of</em>}</li>
 *   <li>{@link mozilla_td.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link mozilla_td.impl.AttributeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link mozilla_td.impl.AttributeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimitiveType> enum_;

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
	 * The default value of the '{@link #getMultipleOf() <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOf()
	 * @generated
	 * @ordered
	 */
	protected static final double MULTIPLE_OF_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMultipleOf() <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOf()
	 * @generated
	 * @ordered
	 */
	protected double multipleOf = MULTIPLE_OF_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveType TYPE_EDEFAULT = PrimitiveType.NULL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Attribute> properties;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mozilla_tdPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.ATTRIBUTE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimitiveType> getEnum() {
		if (enum_ == null) {
			enum_ = new EDataTypeUniqueEList<PrimitiveType>(PrimitiveType.class, this, Mozilla_tdPackage.ATTRIBUTE__ENUM);
		}
		return enum_;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.ATTRIBUTE__MINIMUM, oldMinimum, minimum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.ATTRIBUTE__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMultipleOf() {
		return multipleOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleOf(double newMultipleOf) {
		double oldMultipleOf = multipleOf;
		multipleOf = newMultipleOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.ATTRIBUTE__MULTIPLE_OF, oldMultipleOf, multipleOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PrimitiveType newType) {
		PrimitiveType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, Attribute> getProperties() {
		if (properties == null) {
			properties = new EcoreEMap<String,Attribute>(Mozilla_tdPackage.Literals.STRING_TO_ATTRIBUTE_MAP, StringToAttributeMapImpl.class, this, Mozilla_tdPackage.ATTRIBUTE__PROPERTIES);
		}
		return properties;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mozilla_tdPackage.ATTRIBUTE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mozilla_tdPackage.ATTRIBUTE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case Mozilla_tdPackage.ATTRIBUTE__UNIT:
				return getUnit();
			case Mozilla_tdPackage.ATTRIBUTE__ENUM:
				return getEnum();
			case Mozilla_tdPackage.ATTRIBUTE__MINIMUM:
				return getMinimum();
			case Mozilla_tdPackage.ATTRIBUTE__MAXIMUM:
				return getMaximum();
			case Mozilla_tdPackage.ATTRIBUTE__MULTIPLE_OF:
				return getMultipleOf();
			case Mozilla_tdPackage.ATTRIBUTE__TYPE:
				return getType();
			case Mozilla_tdPackage.ATTRIBUTE__PROPERTIES:
				if (coreType) return getProperties();
				else return getProperties().map();
			case Mozilla_tdPackage.ATTRIBUTE__ID:
				return getId();
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
			case Mozilla_tdPackage.ATTRIBUTE__UNIT:
				setUnit((String)newValue);
				return;
			case Mozilla_tdPackage.ATTRIBUTE__ENUM:
				getEnum().clear();
				getEnum().addAll((Collection<? extends PrimitiveType>)newValue);
				return;
			case Mozilla_tdPackage.ATTRIBUTE__MINIMUM:
				setMinimum((Double)newValue);
				return;
			case Mozilla_tdPackage.ATTRIBUTE__MAXIMUM:
				setMaximum((Double)newValue);
				return;
			case Mozilla_tdPackage.ATTRIBUTE__MULTIPLE_OF:
				setMultipleOf((Double)newValue);
				return;
			case Mozilla_tdPackage.ATTRIBUTE__TYPE:
				setType((PrimitiveType)newValue);
				return;
			case Mozilla_tdPackage.ATTRIBUTE__PROPERTIES:
				((EStructuralFeature.Setting)getProperties()).set(newValue);
				return;
			case Mozilla_tdPackage.ATTRIBUTE__ID:
				setId((String)newValue);
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
			case Mozilla_tdPackage.ATTRIBUTE__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case Mozilla_tdPackage.ATTRIBUTE__ENUM:
				getEnum().clear();
				return;
			case Mozilla_tdPackage.ATTRIBUTE__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case Mozilla_tdPackage.ATTRIBUTE__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case Mozilla_tdPackage.ATTRIBUTE__MULTIPLE_OF:
				setMultipleOf(MULTIPLE_OF_EDEFAULT);
				return;
			case Mozilla_tdPackage.ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Mozilla_tdPackage.ATTRIBUTE__PROPERTIES:
				getProperties().clear();
				return;
			case Mozilla_tdPackage.ATTRIBUTE__ID:
				setId(ID_EDEFAULT);
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
			case Mozilla_tdPackage.ATTRIBUTE__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case Mozilla_tdPackage.ATTRIBUTE__ENUM:
				return enum_ != null && !enum_.isEmpty();
			case Mozilla_tdPackage.ATTRIBUTE__MINIMUM:
				return minimum != MINIMUM_EDEFAULT;
			case Mozilla_tdPackage.ATTRIBUTE__MAXIMUM:
				return maximum != MAXIMUM_EDEFAULT;
			case Mozilla_tdPackage.ATTRIBUTE__MULTIPLE_OF:
				return multipleOf != MULTIPLE_OF_EDEFAULT;
			case Mozilla_tdPackage.ATTRIBUTE__TYPE:
				return type != TYPE_EDEFAULT;
			case Mozilla_tdPackage.ATTRIBUTE__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case Mozilla_tdPackage.ATTRIBUTE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (unit: ");
		result.append(unit);
		result.append(", enum: ");
		result.append(enum_);
		result.append(", minimum: ");
		result.append(minimum);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", multipleOf: ");
		result.append(multipleOf);
		result.append(", type: ");
		result.append(type);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
