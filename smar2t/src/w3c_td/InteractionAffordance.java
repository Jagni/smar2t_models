/**
 */
package w3c_td;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Affordance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link w3c_td.InteractionAffordance#getForms <em>Forms</em>}</li>
 *   <li>{@link w3c_td.InteractionAffordance#getTitles <em>Titles</em>}</li>
 *   <li>{@link w3c_td.InteractionAffordance#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link w3c_td.InteractionAffordance#getType <em>Type</em>}</li>
 *   <li>{@link w3c_td.InteractionAffordance#getTitle <em>Title</em>}</li>
 *   <li>{@link w3c_td.InteractionAffordance#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see w3c_td.W3c_tdPackage#getInteractionAffordance()
 * @model abstract="true"
 * @generated
 */
public interface InteractionAffordance extends EObject {
	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link w3c_td.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see w3c_td.W3c_tdPackage#getInteractionAffordance_Forms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Form> getForms();

	/**
	 * Returns the value of the '<em><b>Titles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titles</em>' reference.
	 * @see #setTitles(MultiLanguage)
	 * @see w3c_td.W3c_tdPackage#getInteractionAffordance_Titles()
	 * @model
	 * @generated
	 */
	MultiLanguage getTitles();

	/**
	 * Sets the value of the '{@link w3c_td.InteractionAffordance#getTitles <em>Titles</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titles</em>' reference.
	 * @see #getTitles()
	 * @generated
	 */
	void setTitles(MultiLanguage value);

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' reference.
	 * @see #setDescriptions(MultiLanguage)
	 * @see w3c_td.W3c_tdPackage#getInteractionAffordance_Descriptions()
	 * @model
	 * @generated
	 */
	MultiLanguage getDescriptions();

	/**
	 * Sets the value of the '{@link w3c_td.InteractionAffordance#getDescriptions <em>Descriptions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptions</em>' reference.
	 * @see #getDescriptions()
	 * @generated
	 */
	void setDescriptions(MultiLanguage value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see w3c_td.W3c_tdPackage#getInteractionAffordance_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link w3c_td.InteractionAffordance#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see w3c_td.W3c_tdPackage#getInteractionAffordance_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link w3c_td.InteractionAffordance#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see w3c_td.W3c_tdPackage#getInteractionAffordance_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link w3c_td.InteractionAffordance#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // InteractionAffordance
