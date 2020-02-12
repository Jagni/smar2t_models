/**
 */
package mozilla_td;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mozilla_td.Event#getSemanticType <em>Semantic Type</em>}</li>
 *   <li>{@link mozilla_td.Event#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see mozilla_td.Mozilla_tdPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Attribute, Linkable {
	/**
	 * Returns the value of the '<em><b>Semantic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Type</em>' attribute.
	 * @see #setSemanticType(String)
	 * @see mozilla_td.Mozilla_tdPackage#getEvent_SemanticType()
	 * @model
	 * @generated
	 */
	String getSemanticType();

	/**
	 * Sets the value of the '{@link mozilla_td.Event#getSemanticType <em>Semantic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Type</em>' attribute.
	 * @see #getSemanticType()
	 * @generated
	 */
	void setSemanticType(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mozilla_td.Mozilla_tdPackage#getEvent_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mozilla_td.Event#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Event
