/**
 */
package smar2t.td.w3c.hypermediacontrols;

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
 *   <li>{@link smar2t.td.w3c.hypermediacontrols.Link#getHref <em>Href</em>}</li>
 *   <li>{@link smar2t.td.w3c.hypermediacontrols.Link#getType <em>Type</em>}</li>
 *   <li>{@link smar2t.td.w3c.hypermediacontrols.Link#getRel <em>Rel</em>}</li>
 *   <li>{@link smar2t.td.w3c.hypermediacontrols.Link#getAnchor <em>Anchor</em>}</li>
 * </ul>
 *
 * @see smar2t.td.w3c.hypermediacontrols.HypermediacontrolsPackage#getLink()
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
	 * @see smar2t.td.w3c.hypermediacontrols.HypermediacontrolsPackage#getLink_Href()
	 * @model required="true"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.hypermediacontrols.Link#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see smar2t.td.w3c.hypermediacontrols.HypermediacontrolsPackage#getLink_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.hypermediacontrols.Link#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel</em>' attribute.
	 * @see #setRel(String)
	 * @see smar2t.td.w3c.hypermediacontrols.HypermediacontrolsPackage#getLink_Rel()
	 * @model
	 * @generated
	 */
	String getRel();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.hypermediacontrols.Link#getRel <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel</em>' attribute.
	 * @see #getRel()
	 * @generated
	 */
	void setRel(String value);

	/**
	 * Returns the value of the '<em><b>Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor</em>' attribute.
	 * @see #setAnchor(String)
	 * @see smar2t.td.w3c.hypermediacontrols.HypermediacontrolsPackage#getLink_Anchor()
	 * @model
	 * @generated
	 */
	String getAnchor();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.hypermediacontrols.Link#getAnchor <em>Anchor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor</em>' attribute.
	 * @see #getAnchor()
	 * @generated
	 */
	void setAnchor(String value);

} // Link
