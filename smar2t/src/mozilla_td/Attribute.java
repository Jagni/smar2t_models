/**
 */
package mozilla_td;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mozilla_td.Attribute#getUnit <em>Unit</em>}</li>
 *   <li>{@link mozilla_td.Attribute#getEnum <em>Enum</em>}</li>
 *   <li>{@link mozilla_td.Attribute#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link mozilla_td.Attribute#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link mozilla_td.Attribute#getMultipleOf <em>Multiple Of</em>}</li>
 *   <li>{@link mozilla_td.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link mozilla_td.Attribute#getProperties <em>Properties</em>}</li>
 *   <li>{@link mozilla_td.Attribute#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see mozilla_td.Mozilla_tdPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see mozilla_td.Mozilla_tdPackage#getAttribute_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link mozilla_td.Attribute#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute list.
	 * The list contents are of type {@link mozilla_td.PrimitiveType}.
	 * The literals are from the enumeration {@link mozilla_td.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' attribute list.
	 * @see mozilla_td.PrimitiveType
	 * @see mozilla_td.Mozilla_tdPackage#getAttribute_Enum()
	 * @model
	 * @generated
	 */
	EList<PrimitiveType> getEnum();

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(double)
	 * @see mozilla_td.Mozilla_tdPackage#getAttribute_Minimum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getMinimum();

	/**
	 * Sets the value of the '{@link mozilla_td.Attribute#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(double value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(double)
	 * @see mozilla_td.Mozilla_tdPackage#getAttribute_Maximum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getMaximum();

	/**
	 * Sets the value of the '{@link mozilla_td.Attribute#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(double value);

	/**
	 * Returns the value of the '<em><b>Multiple Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Of</em>' attribute.
	 * @see #setMultipleOf(double)
	 * @see mozilla_td.Mozilla_tdPackage#getAttribute_MultipleOf()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getMultipleOf();

	/**
	 * Sets the value of the '{@link mozilla_td.Attribute#getMultipleOf <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Of</em>' attribute.
	 * @see #getMultipleOf()
	 * @generated
	 */
	void setMultipleOf(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mozilla_td.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mozilla_td.PrimitiveType
	 * @see #setType(PrimitiveType)
	 * @see mozilla_td.Mozilla_tdPackage#getAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveType getType();

	/**
	 * Sets the value of the '{@link mozilla_td.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mozilla_td.PrimitiveType
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link mozilla_td.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see mozilla_td.Mozilla_tdPackage#getAttribute_Properties()
	 * @model
	 * @generated
	 */
	EList<Attribute> getProperties();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see mozilla_td.Mozilla_tdPackage#getAttribute_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mozilla_td.Attribute#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Attribute
