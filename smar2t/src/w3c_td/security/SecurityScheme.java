/**
 */
package w3c_td.security;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import w3c_td.core.MultiLanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link w3c_td.security.SecurityScheme#getSemanticType <em>Semantic Type</em>}</li>
 *   <li>{@link w3c_td.security.SecurityScheme#getDescription <em>Description</em>}</li>
 *   <li>{@link w3c_td.security.SecurityScheme#getProxy <em>Proxy</em>}</li>
 *   <li>{@link w3c_td.security.SecurityScheme#getScheme <em>Scheme</em>}</li>
 *   <li>{@link w3c_td.security.SecurityScheme#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 *
 * @see w3c_td.security.SecurityPackage#getSecurityScheme()
 * @model abstract="true"
 * @generated
 */
public interface SecurityScheme extends EObject {
	/**
	 * Returns the value of the '<em><b>Semantic Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantic Type</em>' attribute list.
	 * @see w3c_td.security.SecurityPackage#getSecurityScheme_SemanticType()
	 * @model
	 * @generated
	 */
	EList<String> getSemanticType();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see w3c_td.security.SecurityPackage#getSecurityScheme_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link w3c_td.security.SecurityScheme#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy</em>' attribute.
	 * @see #setProxy(String)
	 * @see w3c_td.security.SecurityPackage#getSecurityScheme_Proxy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getProxy();

	/**
	 * Sets the value of the '{@link w3c_td.security.SecurityScheme#getProxy <em>Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy</em>' attribute.
	 * @see #getProxy()
	 * @generated
	 */
	void setProxy(String value);

	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see #setScheme(String)
	 * @see w3c_td.security.SecurityPackage#getSecurityScheme_Scheme()
	 * @model required="true"
	 * @generated
	 */
	String getScheme();

	/**
	 * Sets the value of the '{@link w3c_td.security.SecurityScheme#getScheme <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' attribute.
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(String value);

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' reference.
	 * @see #setDescriptions(MultiLanguage)
	 * @see w3c_td.security.SecurityPackage#getSecurityScheme_Descriptions()
	 * @model
	 * @generated
	 */
	MultiLanguage getDescriptions();

	/**
	 * Sets the value of the '{@link w3c_td.security.SecurityScheme#getDescriptions <em>Descriptions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptions</em>' reference.
	 * @see #getDescriptions()
	 * @generated
	 */
	void setDescriptions(MultiLanguage value);

} // SecurityScheme
