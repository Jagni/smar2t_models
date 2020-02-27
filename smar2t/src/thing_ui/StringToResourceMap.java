/**
 */
package thing_ui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String To Resource Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thing_ui.StringToResourceMap#getValue <em>Value</em>}</li>
 *   <li>{@link thing_ui.StringToResourceMap#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see thing_ui.Thing_uiPackage#getStringToResourceMap()
 * @model
 * @generated
 */
public interface StringToResourceMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Resource)
	 * @see thing_ui.Thing_uiPackage#getStringToResourceMap_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Resource getValue();

	/**
	 * Sets the value of the '{@link thing_ui.StringToResourceMap#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Resource value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see thing_ui.Thing_uiPackage#getStringToResourceMap_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link thing_ui.StringToResourceMap#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // StringToResourceMap
