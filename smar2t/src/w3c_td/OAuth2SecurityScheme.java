/**
 */
package w3c_td;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OAuth2 Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link w3c_td.OAuth2SecurityScheme#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link w3c_td.OAuth2SecurityScheme#getToken <em>Token</em>}</li>
 *   <li>{@link w3c_td.OAuth2SecurityScheme#getRefresh <em>Refresh</em>}</li>
 *   <li>{@link w3c_td.OAuth2SecurityScheme#getScopes <em>Scopes</em>}</li>
 *   <li>{@link w3c_td.OAuth2SecurityScheme#getFlow <em>Flow</em>}</li>
 * </ul>
 *
 * @see w3c_td.W3c_tdPackage#getOAuth2SecurityScheme()
 * @model
 * @generated
 */
public interface OAuth2SecurityScheme extends SecurityScheme {
	/**
	 * Returns the value of the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization</em>' attribute.
	 * @see #setAuthorization(String)
	 * @see w3c_td.W3c_tdPackage#getOAuth2SecurityScheme_Authorization()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getAuthorization();

	/**
	 * Sets the value of the '{@link w3c_td.OAuth2SecurityScheme#getAuthorization <em>Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization</em>' attribute.
	 * @see #getAuthorization()
	 * @generated
	 */
	void setAuthorization(String value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see w3c_td.W3c_tdPackage#getOAuth2SecurityScheme_Token()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link w3c_td.OAuth2SecurityScheme#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

	/**
	 * Returns the value of the '<em><b>Refresh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh</em>' attribute.
	 * @see #setRefresh(String)
	 * @see w3c_td.W3c_tdPackage#getOAuth2SecurityScheme_Refresh()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getRefresh();

	/**
	 * Sets the value of the '{@link w3c_td.OAuth2SecurityScheme#getRefresh <em>Refresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh</em>' attribute.
	 * @see #getRefresh()
	 * @generated
	 */
	void setRefresh(String value);

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' attribute.
	 * @see #setScopes(String)
	 * @see w3c_td.W3c_tdPackage#getOAuth2SecurityScheme_Scopes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getScopes();

	/**
	 * Sets the value of the '{@link w3c_td.OAuth2SecurityScheme#getScopes <em>Scopes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scopes</em>' attribute.
	 * @see #getScopes()
	 * @generated
	 */
	void setScopes(String value);

	/**
	 * Returns the value of the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' attribute.
	 * @see #setFlow(String)
	 * @see w3c_td.W3c_tdPackage#getOAuth2SecurityScheme_Flow()
	 * @model required="true"
	 * @generated
	 */
	String getFlow();

	/**
	 * Sets the value of the '{@link w3c_td.OAuth2SecurityScheme#getFlow <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow</em>' attribute.
	 * @see #getFlow()
	 * @generated
	 */
	void setFlow(String value);

} // OAuth2SecurityScheme
