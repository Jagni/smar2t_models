/**
 */
package w3c_td;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link w3c_td.Thing#getId <em>Id</em>}</li>
 *   <li>{@link w3c_td.Thing#getTitle <em>Title</em>}</li>
 *   <li>{@link w3c_td.Thing#getDescription <em>Description</em>}</li>
 *   <li>{@link w3c_td.Thing#getSemanticContext <em>Semantic Context</em>}</li>
 *   <li>{@link w3c_td.Thing#getSemanticType <em>Semantic Type</em>}</li>
 *   <li>{@link w3c_td.Thing#getCreated <em>Created</em>}</li>
 *   <li>{@link w3c_td.Thing#getModified <em>Modified</em>}</li>
 *   <li>{@link w3c_td.Thing#getSupport <em>Support</em>}</li>
 *   <li>{@link w3c_td.Thing#getBase <em>Base</em>}</li>
 *   <li>{@link w3c_td.Thing#getSecurity <em>Security</em>}</li>
 *   <li>{@link w3c_td.Thing#getLinks <em>Links</em>}</li>
 *   <li>{@link w3c_td.Thing#getForms <em>Forms</em>}</li>
 *   <li>{@link w3c_td.Thing#getVersion <em>Version</em>}</li>
 *   <li>{@link w3c_td.Thing#getTitles <em>Titles</em>}</li>
 *   <li>{@link w3c_td.Thing#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link w3c_td.Thing#getEvents <em>Events</em>}</li>
 *   <li>{@link w3c_td.Thing#getActions <em>Actions</em>}</li>
 *   <li>{@link w3c_td.Thing#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see w3c_td.W3c_tdPackage#getThing()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Role'"
 * @generated
 */
public interface Thing extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see w3c_td.W3c_tdPackage#getThing_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link w3c_td.Thing#getId <em>Id</em>}' attribute.
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
	 * @see w3c_td.W3c_tdPackage#getThing_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link w3c_td.Thing#getTitle <em>Title</em>}' attribute.
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
	 * @see w3c_td.W3c_tdPackage#getThing_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link w3c_td.Thing#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Semantic Context</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Context</em>' attribute list.
	 * @see w3c_td.W3c_tdPackage#getThing_SemanticContext()
	 * @model
	 * @generated
	 */
	EList<String> getSemanticContext();

	/**
	 * Returns the value of the '<em><b>Semantic Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Type</em>' attribute list.
	 * @see w3c_td.W3c_tdPackage#getThing_SemanticType()
	 * @model
	 * @generated
	 */
	EList<String> getSemanticType();

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see w3c_td.W3c_tdPackage#getThing_Created()
	 * @model
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link w3c_td.Thing#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(Date)
	 * @see w3c_td.W3c_tdPackage#getThing_Modified()
	 * @model
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link w3c_td.Thing#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

	/**
	 * Returns the value of the '<em><b>Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support</em>' attribute.
	 * @see #setSupport(String)
	 * @see w3c_td.W3c_tdPackage#getThing_Support()
	 * @model
	 * @generated
	 */
	String getSupport();

	/**
	 * Sets the value of the '{@link w3c_td.Thing#getSupport <em>Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support</em>' attribute.
	 * @see #getSupport()
	 * @generated
	 */
	void setSupport(String value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(String)
	 * @see w3c_td.W3c_tdPackage#getThing_Base()
	 * @model
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link w3c_td.Thing#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute list.
	 * @see w3c_td.W3c_tdPackage#getThing_Security()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getSecurity();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link w3c_td.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see w3c_td.W3c_tdPackage#getThing_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' reference list.
	 * The list contents are of type {@link w3c_td.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' reference list.
	 * @see w3c_td.W3c_tdPackage#getThing_Forms()
	 * @model
	 * @generated
	 */
	EList<Form> getForms();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' reference.
	 * @see #setVersion(VersionInfo)
	 * @see w3c_td.W3c_tdPackage#getThing_Version()
	 * @model
	 * @generated
	 */
	VersionInfo getVersion();

	/**
	 * Sets the value of the '{@link w3c_td.Thing#getVersion <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(VersionInfo value);

	/**
	 * Returns the value of the '<em><b>Titles</b></em>' reference list.
	 * The list contents are of type {@link w3c_td.MultiLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titles</em>' reference list.
	 * @see w3c_td.W3c_tdPackage#getThing_Titles()
	 * @model
	 * @generated
	 */
	EList<MultiLanguage> getTitles();

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link w3c_td.MultiLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' containment reference list.
	 * @see w3c_td.W3c_tdPackage#getThing_Descriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MultiLanguage> getDescriptions();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link w3c_td.EventAffordance},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' map.
	 * @see w3c_td.W3c_tdPackage#getThing_Events()
	 * @model mapType="w3c_td.StringToEventMap&lt;org.eclipse.emf.ecore.EString, w3c_td.EventAffordance&gt;"
	 * @generated
	 */
	EMap<String, EventAffordance> getEvents();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link w3c_td.ActionAffordance},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' map.
	 * @see w3c_td.W3c_tdPackage#getThing_Actions()
	 * @model mapType="w3c_td.StringToActionMap&lt;org.eclipse.emf.ecore.EString, w3c_td.ActionAffordance&gt;"
	 * @generated
	 */
	EMap<String, ActionAffordance> getActions();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link w3c_td.PropertyAffordance},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' map.
	 * @see w3c_td.W3c_tdPackage#getThing_Properties()
	 * @model mapType="w3c_td.StringToPropertyMap&lt;org.eclipse.emf.ecore.EString, w3c_td.PropertyAffordance&gt;"
	 * @generated
	 */
	EMap<String, PropertyAffordance> getProperties();

} // Thing
