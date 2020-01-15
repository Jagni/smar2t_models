/**
 */
package smar2t.td.mozilla.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smar2t.td.mozilla.core.Property#getSemanticType <em>Semantic Type</em>}</li>
 *   <li>{@link smar2t.td.mozilla.core.Property#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link smar2t.td.mozilla.core.Property#getDescription <em>Description</em>}</li>
 *   <li>{@link smar2t.td.mozilla.core.Property#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see smar2t.td.mozilla.core.CorePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Attribute, Linkable {
	/**
	 * Returns the value of the '<em><b>Semantic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Type</em>' attribute.
	 * @see #setSemanticType(String)
	 * @see smar2t.td.mozilla.core.CorePackage#getProperty_SemanticType()
	 * @model
	 * @generated
	 */
	String getSemanticType();

	/**
	 * Sets the value of the '{@link smar2t.td.mozilla.core.Property#getSemanticType <em>Semantic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantic Type</em>' attribute.
	 * @see #getSemanticType()
	 * @generated
	 */
	void setSemanticType(String value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see smar2t.td.mozilla.core.CorePackage#getProperty_ReadOnly()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link smar2t.td.mozilla.core.Property#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see smar2t.td.mozilla.core.CorePackage#getProperty_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link smar2t.td.mozilla.core.Property#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see smar2t.td.mozilla.core.CorePackage#getProperty_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link smar2t.td.mozilla.core.Property#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Property
