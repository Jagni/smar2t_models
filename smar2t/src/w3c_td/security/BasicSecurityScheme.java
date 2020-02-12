/**
 */
package w3c_td.security;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link w3c_td.security.BasicSecurityScheme#getIn <em>In</em>}</li>
 *   <li>{@link w3c_td.security.BasicSecurityScheme#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see w3c_td.security.SecurityPackage#getBasicSecurityScheme()
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
	 * @see w3c_td.security.SecurityPackage#getBasicSecurityScheme_In()
	 * @model required="true"
	 * @generated
	 */
	String getIn();

	/**
	 * Sets the value of the '{@link w3c_td.security.BasicSecurityScheme#getIn <em>In</em>}' attribute.
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
	 * @see w3c_td.security.SecurityPackage#getBasicSecurityScheme_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link w3c_td.security.BasicSecurityScheme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BasicSecurityScheme
