/**
 */
package w3c_td;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Po PSecurity Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link w3c_td.PoPSecurityScheme#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link w3c_td.PoPSecurityScheme#getAlg <em>Alg</em>}</li>
 *   <li>{@link w3c_td.PoPSecurityScheme#getFormat <em>Format</em>}</li>
 *   <li>{@link w3c_td.PoPSecurityScheme#getIn <em>In</em>}</li>
 *   <li>{@link w3c_td.PoPSecurityScheme#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see w3c_td.W3c_tdPackage#getPoPSecurityScheme()
 * @model
 * @generated
 */
public interface PoPSecurityScheme extends SecurityScheme {
	/**
	 * Returns the value of the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization</em>' attribute.
	 * @see #setAuthorization(String)
	 * @see w3c_td.W3c_tdPackage#getPoPSecurityScheme_Authorization()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getAuthorization();

	/**
	 * Sets the value of the '{@link w3c_td.PoPSecurityScheme#getAuthorization <em>Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization</em>' attribute.
	 * @see #getAuthorization()
	 * @generated
	 */
	void setAuthorization(String value);

	/**
	 * Returns the value of the '<em><b>Alg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alg</em>' attribute.
	 * @see #setAlg(String)
	 * @see w3c_td.W3c_tdPackage#getPoPSecurityScheme_Alg()
	 * @model required="true"
	 * @generated
	 */
	String getAlg();

	/**
	 * Sets the value of the '{@link w3c_td.PoPSecurityScheme#getAlg <em>Alg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alg</em>' attribute.
	 * @see #getAlg()
	 * @generated
	 */
	void setAlg(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see w3c_td.W3c_tdPackage#getPoPSecurityScheme_Format()
	 * @model required="true"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link w3c_td.PoPSecurityScheme#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' attribute.
	 * @see #setIn(String)
	 * @see w3c_td.W3c_tdPackage#getPoPSecurityScheme_In()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 * @generated
	 */
	String getIn();

	/**
	 * Sets the value of the '{@link w3c_td.PoPSecurityScheme#getIn <em>In</em>}' attribute.
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
	 * @see w3c_td.W3c_tdPackage#getPoPSecurityScheme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link w3c_td.PoPSecurityScheme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PoPSecurityScheme
