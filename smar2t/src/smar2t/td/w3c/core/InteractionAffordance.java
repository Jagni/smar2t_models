/**
 */
package smar2t.td.w3c.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import smar2t.td.w3c.hypermediacontrols.Form;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Affordance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smar2t.td.w3c.core.InteractionAffordance#getForms <em>Forms</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.InteractionAffordance#getTitles <em>Titles</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.InteractionAffordance#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.InteractionAffordance#getType <em>Type</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.InteractionAffordance#getTitle <em>Title</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.InteractionAffordance#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see smar2t.td.w3c.core.CorePackage#getInteractionAffordance()
 * @model abstract="true"
 * @generated
 */
public interface InteractionAffordance extends EObject {
	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link smar2t.td.w3c.hypermediacontrols.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see smar2t.td.w3c.core.CorePackage#getInteractionAffordance_Forms()
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
	 * @see smar2t.td.w3c.core.CorePackage#getInteractionAffordance_Titles()
	 * @model
	 * @generated
	 */
	MultiLanguage getTitles();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.core.InteractionAffordance#getTitles <em>Titles</em>}' reference.
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
	 * @see smar2t.td.w3c.core.CorePackage#getInteractionAffordance_Descriptions()
	 * @model
	 * @generated
	 */
	MultiLanguage getDescriptions();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.core.InteractionAffordance#getDescriptions <em>Descriptions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptions</em>' reference.
	 * @see #getDescriptions()
	 * @generated
	 */
	void setDescriptions(MultiLanguage value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute list.
	 * @see smar2t.td.w3c.core.CorePackage#getInteractionAffordance_Type()
	 * @model
	 * @generated
	 */
	EList<String> getType();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see smar2t.td.w3c.core.CorePackage#getInteractionAffordance_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.core.InteractionAffordance#getTitle <em>Title</em>}' attribute.
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
	 * @see smar2t.td.w3c.core.CorePackage#getInteractionAffordance_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.core.InteractionAffordance#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // InteractionAffordance
