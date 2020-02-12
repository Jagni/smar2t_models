/**
 */
package smar2t.td.w3c.hypermediacontrols;

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
 *   <li>{@link smar2t.td.w3c.hypermediacontrols.Form#getOp <em>Op</em>}</li>
 *   <li>{@link smar2t.td.w3c.hypermediacontrols.Form#getHref <em>Href</em>}</li>
 *   <li>{@link smar2t.td.w3c.hypermediacontrols.Form#getContentType <em>Content Type</em>}</li>
 *   <li>{@link smar2t.td.w3c.hypermediacontrols.Form#getContentCoding <em>Content Coding</em>}</li>
 *   <li>{@link smar2t.td.w3c.hypermediacontrols.Form#getSubprotocol <em>Subprotocol</em>}</li>
 *   <li>{@link smar2t.td.w3c.hypermediacontrols.Form#getSecurity <em>Security</em>}</li>
 *   <li>{@link smar2t.td.w3c.hypermediacontrols.Form#getScopes <em>Scopes</em>}</li>
 *   <li>{@link smar2t.td.w3c.hypermediacontrols.Form#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see smar2t.td.w3c.hypermediacontrols.HypermediacontrolsPackage#getForm()
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
	 * @see smar2t.td.w3c.hypermediacontrols.HypermediacontrolsPackage#getForm_Op()
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
	 * @see smar2t.td.w3c.hypermediacontrols.HypermediacontrolsPackage#getForm_Href()
	 * @model required="true"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.hypermediacontrols.Form#getHref <em>Href</em>}' attribute.
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
	 * @see smar2t.td.w3c.hypermediacontrols.HypermediacontrolsPackage#getForm_ContentType()
	 * @model default="application/json" required="true"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.hypermediacontrols.Form#getContentType <em>Content Type</em>}' attribute.
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
	 * @see smar2t.td.w3c.hypermediacontrols.HypermediacontrolsPackage#getForm_ContentCoding()
	 * @model
	 * @generated
	 */
	String getContentCoding();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.hypermediacontrols.Form#getContentCoding <em>Content Coding</em>}' attribute.
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
	 * @see smar2t.td.w3c.hypermediacontrols.HypermediacontrolsPackage#getForm_Subprotocol()
	 * @model
	 * @generated
	 */
	String getSubprotocol();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.hypermediacontrols.Form#getSubprotocol <em>Subprotocol</em>}' attribute.
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
	 * @see smar2t.td.w3c.hypermediacontrols.HypermediacontrolsPackage#getForm_Security()
	 * @model
	 * @generated
	 */
	String getSecurity();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.hypermediacontrols.Form#getSecurity <em>Security</em>}' attribute.
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
	 * @see smar2t.td.w3c.hypermediacontrols.HypermediacontrolsPackage#getForm_Scopes()
	 * @model
	 * @generated
	 */
	String getScopes();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.hypermediacontrols.Form#getScopes <em>Scopes</em>}' attribute.
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
	 * @see smar2t.td.w3c.hypermediacontrols.HypermediacontrolsPackage#getForm_Response()
	 * @model
	 * @generated
	 */
	ExpectedResponse getResponse();

	/**
	 * Sets the value of the '{@link smar2t.td.w3c.hypermediacontrols.Form#getResponse <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(ExpectedResponse value);

} // Form
