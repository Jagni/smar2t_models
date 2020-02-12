/**
 */
package smar2t.td.w3c.security;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smar2t.td.w3c.security.BasicSecurityScheme#getIn <em>In</em>}</li>
 *   <li>{@link smar2t.td.w3c.security.BasicSecurityScheme#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see smar2t.td.w3c.security.SecurityPackage#getBasicSecurityScheme()
 * @model
 * @generated
 */
public interface BasicSecurityScheme extends SecurityScheme {
	/**
	 * Returns the value of the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' attribute.
	 * @see #setIn(String)
	 * @see smar2t.td.w3c.security.SecurityPackage#getBasicSecurityScheme_In()
	 * @model required="true"
	 * @generated
	 */
	String getIn();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.security.BasicSecurityScheme#getIn <em>In</em>}' attribute.
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
	 * @see smar2t.td.w3c.security.SecurityPackage#getBasicSecurityScheme_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.security.BasicSecurityScheme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BasicSecurityScheme
