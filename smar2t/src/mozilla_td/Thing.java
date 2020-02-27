/**
 */
package mozilla_td;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mozilla_td.Thing#getContext <em>Context</em>}</li>
 *   <li>{@link mozilla_td.Thing#getSemanticType <em>Semantic Type</em>}</li>
 *   <li>{@link mozilla_td.Thing#getId <em>Id</em>}</li>
 *   <li>{@link mozilla_td.Thing#getTitle <em>Title</em>}</li>
 *   <li>{@link mozilla_td.Thing#getDescription <em>Description</em>}</li>
 *   <li>{@link mozilla_td.Thing#getActions <em>Actions</em>}</li>
 *   <li>{@link mozilla_td.Thing#getEvents <em>Events</em>}</li>
 *   <li>{@link mozilla_td.Thing#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see mozilla_td.Mozilla_tdPackage#getThing()
 * @model
 * @generated
 */
public interface Thing extends Linkable {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see mozilla_td.Mozilla_tdPackage#getThing_Context()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link mozilla_td.Thing#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Type</em>' attribute list.
	 * @see mozilla_td.Mozilla_tdPackage#getThing_SemanticType()
	 * @model
	 * @generated
	 */
	EList<String> getSemanticType();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see mozilla_td.Mozilla_tdPackage#getThing_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mozilla_td.Thing#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see mozilla_td.Mozilla_tdPackage#getThing_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link mozilla_td.Thing#getTitle <em>Title</em>}' attribute.
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
	 * @see mozilla_td.Mozilla_tdPackage#getThing_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mozilla_td.Thing#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link mozilla_td.Property},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' map.
	 * @see mozilla_td.Mozilla_tdPackage#getThing_Properties()
	 * @model mapType="mozilla_td.StringToPropertyMap&lt;org.eclipse.emf.ecore.EString, mozilla_td.Property&gt;"
	 * @generated
	 */
	EMap<String, Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link mozilla_td.Action},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' map.
	 * @see mozilla_td.Mozilla_tdPackage#getThing_Actions()
	 * @model mapType="mozilla_td.StringToActionMap&lt;org.eclipse.emf.ecore.EString, mozilla_td.Action&gt;"
	 * @generated
	 */
	EMap<String, Action> getActions();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link mozilla_td.Event},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' map.
	 * @see mozilla_td.Mozilla_tdPackage#getThing_Events()
	 * @model mapType="mozilla_td.StringToEventMap&lt;org.eclipse.emf.ecore.EString, mozilla_td.Event&gt;"
	 * @generated
	 */
	EMap<String, Event> getEvents();

} // Thing
