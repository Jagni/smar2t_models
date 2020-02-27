/**
 */
package w3c_td.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import w3c_td.ArraySchema;
import w3c_td.DataSchema;
import w3c_td.W3c_tdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link w3c_td.impl.ArraySchemaImpl#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link w3c_td.impl.ArraySchemaImpl#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link w3c_td.impl.ArraySchemaImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArraySchemaImpl extends DataSchemaImpl implements ArraySchema {
	/**
	 * The default value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems()
	 * @generated
	 * @ordered
	 */
	protected static final long MIN_ITEMS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems()
	 * @generated
	 * @ordered
	 */
	protected long minItems = MIN_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_ITEMS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected long maxItems = MAX_ITEMS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSchema> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArraySchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return W3c_tdPackage.Literals.ARRAY_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMinItems() {
		return minItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinItems(long newMinItems) {
		long oldMinItems = minItems;
		minItems = newMinItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3c_tdPackage.ARRAY_SCHEMA__MIN_ITEMS, oldMinItems, minItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxItems() {
		return maxItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxItems(long newMaxItems) {
		long oldMaxItems = maxItems;
		maxItems = newMaxItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3c_tdPackage.ARRAY_SCHEMA__MAX_ITEMS, oldMaxItems, maxItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSchema> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<DataSchema>(DataSchema.class, this, W3c_tdPackage.ARRAY_SCHEMA__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case W3c_tdPackage.ARRAY_SCHEMA__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case W3c_tdPackage.ARRAY_SCHEMA__MIN_ITEMS:
				return getMinItems();
			case W3c_tdPackage.ARRAY_SCHEMA__MAX_ITEMS:
				return getMaxItems();
			case W3c_tdPackage.ARRAY_SCHEMA__ITEMS:
				return getItems();
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
			case W3c_tdPackage.ARRAY_SCHEMA__MIN_ITEMS:
				setMinItems((Long)newValue);
				return;
			case W3c_tdPackage.ARRAY_SCHEMA__MAX_ITEMS:
				setMaxItems((Long)newValue);
				return;
			case W3c_tdPackage.ARRAY_SCHEMA__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends DataSchema>)newValue);
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
			case W3c_tdPackage.ARRAY_SCHEMA__MIN_ITEMS:
				setMinItems(MIN_ITEMS_EDEFAULT);
				return;
			case W3c_tdPackage.ARRAY_SCHEMA__MAX_ITEMS:
				setMaxItems(MAX_ITEMS_EDEFAULT);
				return;
			case W3c_tdPackage.ARRAY_SCHEMA__ITEMS:
				getItems().clear();
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
			case W3c_tdPackage.ARRAY_SCHEMA__MIN_ITEMS:
				return minItems != MIN_ITEMS_EDEFAULT;
			case W3c_tdPackage.ARRAY_SCHEMA__MAX_ITEMS:
				return maxItems != MAX_ITEMS_EDEFAULT;
			case W3c_tdPackage.ARRAY_SCHEMA__ITEMS:
				return items != null && !items.isEmpty();
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
		result.append(" (minItems: ");
		result.append(minItems);
		result.append(", maxItems: ");
		result.append(maxItems);
		result.append(')');
		return result.toString();
	}

} //ArraySchemaImpl
