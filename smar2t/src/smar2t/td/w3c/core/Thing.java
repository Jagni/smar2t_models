/**
 */
package smar2t.td.w3c.core;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

import smar2t.td.w3c.hypermediacontrols.Form;
import smar2t.td.w3c.hypermediacontrols.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smar2t.td.w3c.core.Thing#getId <em>Id</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.Thing#getTitle <em>Title</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.Thing#getDescription <em>Description</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.Thing#getSemanticContext <em>Semantic Context</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.Thing#getSemanticType <em>Semantic Type</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.Thing#getCreated <em>Created</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.Thing#getModified <em>Modified</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.Thing#getSupport <em>Support</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.Thing#getBase <em>Base</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.Thing#getSecurity <em>Security</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.Thing#getLinks <em>Links</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.Thing#getForms <em>Forms</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.Thing#getVersion <em>Version</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.Thing#getTitles <em>Titles</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.Thing#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.Thing#getEvents <em>Events</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.Thing#getActions <em>Actions</em>}</li>
 *   <li>{@link smar2t.td.w3c.core.Thing#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see smar2t.td.w3c.core.CorePackage#getThing()
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
	 * @see smar2t.td.w3c.core.CorePackage#getThing_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.core.Thing#getId <em>Id</em>}' attribute.
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
	 * @see smar2t.td.w3c.core.CorePackage#getThing_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.core.Thing#getTitle <em>Title</em>}' attribute.
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
	 * @see smar2t.td.w3c.core.CorePackage#getThing_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.core.Thing#getDescription <em>Description</em>}' attribute.
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
	 * @see smar2t.td.w3c.core.CorePackage#getThing_SemanticContext()
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
	 * @see smar2t.td.w3c.core.CorePackage#getThing_SemanticType()
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
	 * @see smar2t.td.w3c.core.CorePackage#getThing_Created()
	 * @model
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.core.Thing#getCreated <em>Created</em>}' attribute.
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
	 * @see smar2t.td.w3c.core.CorePackage#getThing_Modified()
	 * @model
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.core.Thing#getModified <em>Modified</em>}' attribute.
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
	 * @see smar2t.td.w3c.core.CorePackage#getThing_Support()
	 * @model
	 * @generated
	 */
	String getSupport();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.core.Thing#getSupport <em>Support</em>}' attribute.
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
	 * @see smar2t.td.w3c.core.CorePackage#getThing_Base()
	 * @model
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.core.Thing#getBase <em>Base</em>}' attribute.
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
	 * @see smar2t.td.w3c.core.CorePackage#getThing_Security()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getSecurity();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link smar2t.td.w3c.hypermediacontrols.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see smar2t.td.w3c.core.CorePackage#getThing_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' reference list.
	 * The list contents are of type {@link smar2t.td.w3c.hypermediacontrols.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' reference list.
	 * @see smar2t.td.w3c.core.CorePackage#getThing_Forms()
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
	 * @see smar2t.td.w3c.core.CorePackage#getThing_Version()
	 * @model
	 * @generated
	 */
	VersionInfo getVersion();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.core.Thing#getVersion <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(VersionInfo value);

	/**
	 * Returns the value of the '<em><b>Titles</b></em>' reference list.
	 * The list contents are of type {@link smar2t.td.w3c.core.MultiLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titles</em>' reference list.
	 * @see smar2t.td.w3c.core.CorePackage#getThing_Titles()
	 * @model
	 * @generated
	 */
	EList<MultiLanguage> getTitles();

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link smar2t.td.w3c.core.MultiLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' containment reference list.
	 * @see smar2t.td.w3c.core.CorePackage#getThing_Descriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MultiLanguage> getDescriptions();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link smar2t.td.w3c.core.EventAffordance},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' map.
	 * @see smar2t.td.w3c.core.CorePackage#getThing_Events()
	 * @model mapType="smar2t.td.w3c.core.StringToEventMap&lt;org.eclipse.emf.ecore.EString, smar2t.td.w3c.core.EventAffordance&gt;"
	 * @generated
	 */
	EMap<String, EventAffordance> getEvents();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link smar2t.td.w3c.core.ActionAffordance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see smar2t.td.w3c.core.CorePackage#getThing_Actions()
	 * @model
	 * @generated
	 */
	EList<ActionAffordance> getActions();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link smar2t.td.w3c.core.PropertyAffordance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see smar2t.td.w3c.core.CorePackage#getThing_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyAffordance> getProperties();

} // Thing
