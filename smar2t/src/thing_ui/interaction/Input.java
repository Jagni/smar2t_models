/**
 */
package thing_ui.interaction;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thing_ui.interaction.Input#getLabel <em>Label</em>}</li>
 *   <li>{@link thing_ui.interaction.Input#getId <em>Id</em>}</li>
 *   <li>{@link thing_ui.interaction.Input#getEditingValue <em>Editing Value</em>}</li>
 *   <li>{@link thing_ui.interaction.Input#getThingValue <em>Thing Value</em>}</li>
 *   <li>{@link thing_ui.interaction.Input#getType <em>Type</em>}</li>
 *   <li>{@link thing_ui.interaction.Input#isInteractionEnabled <em>Interaction Enabled</em>}</li>
 * </ul>
 *
 * @see thing_ui.interaction.InteractionPackage#getInput()
 * @model abstract="true"
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see thing_ui.interaction.InteractionPackage#getInput_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link thing_ui.interaction.Input#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see thing_ui.interaction.InteractionPackage#getInput_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link thing_ui.interaction.Input#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Editing Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editing Value</em>' attribute.
	 * @see #setEditingValue(Object)
	 * @see thing_ui.interaction.InteractionPackage#getInput_EditingValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 * @generated
	 */
	Object getEditingValue();

	/**
	 * Sets the value of the '{@link thing_ui.interaction.Input#getEditingValue <em>Editing Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editing Value</em>' attribute.
	 * @see #getEditingValue()
	 * @generated
	 */
	void setEditingValue(Object value);

	/**
	 * Returns the value of the '<em><b>Thing Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thing Value</em>' attribute.
	 * @see #setThingValue(Object)
	 * @see thing_ui.interaction.InteractionPackage#getInput_ThingValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 * @generated
	 */
	Object getThingValue();

	/**
	 * Sets the value of the '{@link thing_ui.interaction.Input#getThingValue <em>Thing Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thing Value</em>' attribute.
	 * @see #getThingValue()
	 * @generated
	 */
	void setThingValue(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link thing_ui.interaction.InputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see thing_ui.interaction.InputType
	 * @see #setType(InputType)
	 * @see thing_ui.interaction.InteractionPackage#getInput_Type()
	 * @model required="true"
	 * @generated
	 */
	InputType getType();

	/**
	 * Sets the value of the '{@link thing_ui.interaction.Input#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see thing_ui.interaction.InputType
	 * @see #getType()
	 * @generated
	 */
	void setType(InputType value);

	/**
	 * Returns the value of the '<em><b>Interaction Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Enabled</em>' attribute.
	 * @see #setInteractionEnabled(boolean)
	 * @see thing_ui.interaction.InteractionPackage#getInput_InteractionEnabled()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isInteractionEnabled();

	/**
	 * Sets the value of the '{@link thing_ui.interaction.Input#isInteractionEnabled <em>Interaction Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Enabled</em>' attribute.
	 * @see #isInteractionEnabled()
	 * @generated
	 */
	void setInteractionEnabled(boolean value);

} // Input
