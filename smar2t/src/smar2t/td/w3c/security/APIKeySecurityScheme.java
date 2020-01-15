/**
 */
package smar2t.td.w3c.security;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Key Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smar2t.td.w3c.security.APIKeySecurityScheme#getIn <em>In</em>}</li>
 *   <li>{@link smar2t.td.w3c.security.APIKeySecurityScheme#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see smar2t.td.w3c.security.SecurityPackage#getAPIKeySecurityScheme()
 * @model
 * @generated
 */
public interface APIKeySecurityScheme extends SecurityScheme {
	/**
	 * Returns the value of the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' attribute.
	 * @see #setIn(String)
	 * @see smar2t.td.w3c.security.SecurityPackage#getAPIKeySecurityScheme_In()
	 * @model required="true"
	 * @generated
	 */
	String getIn();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.security.APIKeySecurityScheme#getIn <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' attribute.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see smar2t.td.w3c.security.SecurityPackage#getAPIKeySecurityScheme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.security.APIKeySecurityScheme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // APIKeySecurityScheme
