/**
 */
package smar2t.td.w3c.security;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smar2t.td.w3c.security.PublicSecurityScheme#getIdentity <em>Identity</em>}</li>
 * </ul>
 *
 * @see smar2t.td.w3c.security.SecurityPackage#getPublicSecurityScheme()
 * @model
 * @generated
 */
public interface PublicSecurityScheme extends SecurityScheme {
	/**
	 * Returns the value of the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' attribute.
	 * @see #setIdentity(String)
	 * @see smar2t.td.w3c.security.SecurityPackage#getPublicSecurityScheme_Identity()
	 * @model
	 * @generated
	 */
	String getIdentity();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.security.PublicSecurityScheme#getIdentity <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' attribute.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(String value);

} // PublicSecurityScheme
