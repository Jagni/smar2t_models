/**
 */
package thing_ui;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link thing_ui.ThingUI#getLocation <em>Location</em>}</li>
 *   <li>{@link thing_ui.ThingUI#getProperties <em>Properties</em>}</li>
 *   <li>{@link thing_ui.ThingUI#getActions <em>Actions</em>}</li>
 *   <li>{@link thing_ui.ThingUI#getEvents <em>Events</em>}</li>
 *   <li>{@link thing_ui.ThingUI#getName <em>Name</em>}</li>
 *   <li>{@link thing_ui.ThingUI#getDescription <em>Description</em>}</li>
 *   <li>{@link thing_ui.ThingUI#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @see thing_ui.Thing_uiPackage#getThingUI()
 * @model
 * @generated
 */
public interface ThingUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see thing_ui.Thing_uiPackage#getThingUI_Location()
	 * @model containment="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link thing_ui.ThingUI#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link thing_ui.Resource},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' map.
	 * @see thing_ui.Thing_uiPackage#getThingUI_Properties()
	 * @model mapType="thing_ui.StringToResourceMap&lt;org.eclipse.emf.ecore.EString, thing_ui.Resource&gt;"
	 * @generated
	 */
	EMap<String, Resource> getProperties();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link thing_ui.Resource},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' map.
	 * @see thing_ui.Thing_uiPackage#getThingUI_Actions()
	 * @model mapType="thing_ui.StringToResourceMap&lt;org.eclipse.emf.ecore.EString, thing_ui.Resource&gt;"
	 * @generated
	 */
	EMap<String, Resource> getActions();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link thing_ui.Resource},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' map.
	 * @see thing_ui.Thing_uiPackage#getThingUI_Events()
	 * @model mapType="thing_ui.StringToResourceMap&lt;org.eclipse.emf.ecore.EString, thing_ui.Resource&gt;"
	 * @generated
	 */
	EMap<String, Resource> getEvents();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see thing_ui.Thing_uiPackage#getThingUI_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link thing_ui.ThingUI#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see thing_ui.Thing_uiPackage#getThingUI_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link thing_ui.ThingUI#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see thing_ui.Thing_uiPackage#getThingUI_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link thing_ui.ThingUI#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

} // ThingUI
