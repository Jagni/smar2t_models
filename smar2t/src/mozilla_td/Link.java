/**
 */
package mozilla_td;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mozilla_td.Link#getHref <em>Href</em>}</li>
 *   <li>{@link mozilla_td.Link#getRel <em>Rel</em>}</li>
 *   <li>{@link mozilla_td.Link#getMediaType <em>Media Type</em>}</li>
 * </ul>
 *
 * @see mozilla_td.Mozilla_tdPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see mozilla_td.Mozilla_tdPackage#getLink_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link mozilla_td.Link#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Rel</b></em>' attribute.
	 * The literals are from the enumeration {@link mozilla_td.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel</em>' attribute.
	 * @see mozilla_td.Relationship
	 * @see #setRel(Relationship)
	 * @see mozilla_td.Mozilla_tdPackage#getLink_Rel()
	 * @model required="true"
	 * @generated
	 */
	Relationship getRel();

	/**
	 * Sets the value of the '{@link mozilla_td.Link#getRel <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel</em>' attribute.
	 * @see mozilla_td.Relationship
	 * @see #getRel()
	 * @generated
	 */
	void setRel(Relationship value);

	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see #setMediaType(String)
	 * @see mozilla_td.Mozilla_tdPackage#getLink_MediaType()
	 * @model default="" required="true"
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link mozilla_td.Link#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(String value);

} // Link
