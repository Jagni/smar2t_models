/**
 */
package w3c_td;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link w3c_td.Form#getOp <em>Op</em>}</li>
 *   <li>{@link w3c_td.Form#getHref <em>Href</em>}</li>
 *   <li>{@link w3c_td.Form#getContentType <em>Content Type</em>}</li>
 *   <li>{@link w3c_td.Form#getContentCoding <em>Content Coding</em>}</li>
 *   <li>{@link w3c_td.Form#getSubprotocol <em>Subprotocol</em>}</li>
 *   <li>{@link w3c_td.Form#getSecurity <em>Security</em>}</li>
 *   <li>{@link w3c_td.Form#getScopes <em>Scopes</em>}</li>
 *   <li>{@link w3c_td.Form#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see w3c_td.W3c_tdPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends EObject {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute list.
	 * @see w3c_td.W3c_tdPackage#getForm_Op()
	 * @model default="[\"readProperty\", \"writeProperty\"]" required="true"
	 * @generated
	 */
	EList<String> getOp();

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see w3c_td.W3c_tdPackage#getForm_Href()
	 * @model required="true"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link w3c_td.Form#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * The default value is <code>"application/json"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see w3c_td.W3c_tdPackage#getForm_ContentType()
	 * @model default="application/json" required="true"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link w3c_td.Form#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Content Coding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Coding</em>' attribute.
	 * @see #setContentCoding(String)
	 * @see w3c_td.W3c_tdPackage#getForm_ContentCoding()
	 * @model
	 * @generated
	 */
	String getContentCoding();

	/**
	 * Sets the value of the '{@link w3c_td.Form#getContentCoding <em>Content Coding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Coding</em>' attribute.
	 * @see #getContentCoding()
	 * @generated
	 */
	void setContentCoding(String value);

	/**
	 * Returns the value of the '<em><b>Subprotocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subprotocol</em>' attribute.
	 * @see #setSubprotocol(String)
	 * @see w3c_td.W3c_tdPackage#getForm_Subprotocol()
	 * @model
	 * @generated
	 */
	String getSubprotocol();

	/**
	 * Sets the value of the '{@link w3c_td.Form#getSubprotocol <em>Subprotocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subprotocol</em>' attribute.
	 * @see #getSubprotocol()
	 * @generated
	 */
	void setSubprotocol(String value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see #setSecurity(String)
	 * @see w3c_td.W3c_tdPackage#getForm_Security()
	 * @model
	 * @generated
	 */
	String getSecurity();

	/**
	 * Sets the value of the '{@link w3c_td.Form#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' attribute.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(String value);

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' attribute.
	 * @see #setScopes(String)
	 * @see w3c_td.W3c_tdPackage#getForm_Scopes()
	 * @model
	 * @generated
	 */
	String getScopes();

	/**
	 * Sets the value of the '{@link w3c_td.Form#getScopes <em>Scopes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scopes</em>' attribute.
	 * @see #getScopes()
	 * @generated
	 */
	void setScopes(String value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' reference.
	 * @see #setResponse(ExpectedResponse)
	 * @see w3c_td.W3c_tdPackage#getForm_Response()
	 * @model
	 * @generated
	 */
	ExpectedResponse getResponse();

	/**
	 * Sets the value of the '{@link w3c_td.Form#getResponse <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(ExpectedResponse value);

} // Form
