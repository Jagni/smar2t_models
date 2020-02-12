/**
 */
package smar2t.td.w3c.hypermediacontrols;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see smar2t.td.w3c.hypermediacontrols.HypermediacontrolsFactory
 * @model kind="package"
 * @generated
 */
public interface HypermediacontrolsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hypermediacontrols";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "smar2t.td.W3C.hypermediacontrols";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "W3cTd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HypermediacontrolsPackage eINSTANCE = smar2t.td.w3c.hypermediacontrols.impl.HypermediacontrolsPackageImpl.init();

	/**
	 * The meta object id for the '{@link smar2t.td.w3c.hypermediacontrols.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smar2t.td.w3c.hypermediacontrols.impl.LinkImpl
	 * @see smar2t.td.w3c.hypermediacontrols.impl.HypermediacontrolsPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HREF = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REL = 2;

	/**
	 * The feature id for the '<em><b>Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ANCHOR = 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smar2t.td.w3c.hypermediacontrols.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smar2t.td.w3c.hypermediacontrols.impl.FormImpl
	 * @see smar2t.td.w3c.hypermediacontrols.impl.HypermediacontrolsPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__OP = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__HREF = 1;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CONTENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Content Coding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CONTENT_CODING = 3;

	/**
	 * The feature id for the '<em><b>Subprotocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SUBPROTOCOL = 4;

	/**
	 * The feature id for the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SECURITY = 5;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__SCOPES = 6;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__RESPONSE = 7;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link smar2t.td.w3c.hypermediacontrols.impl.ExpectedResponseImpl <em>Expected Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smar2t.td.w3c.hypermediacontrols.impl.ExpectedResponseImpl
	 * @see smar2t.td.w3c.hypermediacontrols.impl.HypermediacontrolsPackageImpl#getExpectedResponse()
	 * @generated
	 */
	int EXPECTED_RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_RESPONSE__CONTENT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Expected Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expected Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTED_RESPONSE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link smar2t.td.w3c.hypermediacontrols.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see smar2t.td.w3c.hypermediacontrols.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.td.w3c.hypermediacontrols.Link#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see smar2t.td.w3c.hypermediacontrols.Link#getHref()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Href();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.td.w3c.hypermediacontrols.Link#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see smar2t.td.w3c.hypermediacontrols.Link#getType()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Type();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.td.w3c.hypermediacontrols.Link#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see smar2t.td.w3c.hypermediacontrols.Link#getRel()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Rel();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.td.w3c.hypermediacontrols.Link#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor</em>'.
	 * @see smar2t.td.w3c.hypermediacontrols.Link#getAnchor()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Anchor();

	/**
	 * Returns the meta object for class '{@link smar2t.td.w3c.hypermediacontrols.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see smar2t.td.w3c.hypermediacontrols.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute list '{@link smar2t.td.w3c.hypermediacontrols.Form#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Op</em>'.
	 * @see smar2t.td.w3c.hypermediacontrols.Form#getOp()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Op();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.td.w3c.hypermediacontrols.Form#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see smar2t.td.w3c.hypermediacontrols.Form#getHref()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Href();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.td.w3c.hypermediacontrols.Form#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see smar2t.td.w3c.hypermediacontrols.Form#getContentType()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.td.w3c.hypermediacontrols.Form#getContentCoding <em>Content Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Coding</em>'.
	 * @see smar2t.td.w3c.hypermediacontrols.Form#getContentCoding()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_ContentCoding();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.td.w3c.hypermediacontrols.Form#getSubprotocol <em>Subprotocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subprotocol</em>'.
	 * @see smar2t.td.w3c.hypermediacontrols.Form#getSubprotocol()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Subprotocol();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.td.w3c.hypermediacontrols.Form#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security</em>'.
	 * @see smar2t.td.w3c.hypermediacontrols.Form#getSecurity()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Security();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.td.w3c.hypermediacontrols.Form#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scopes</em>'.
	 * @see smar2t.td.w3c.hypermediacontrols.Form#getScopes()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Scopes();

	/**
	 * Returns the meta object for the reference '{@link smar2t.td.w3c.hypermediacontrols.Form#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response</em>'.
	 * @see smar2t.td.w3c.hypermediacontrols.Form#getResponse()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Response();

	/**
	 * Returns the meta object for class '{@link smar2t.td.w3c.hypermediacontrols.ExpectedResponse <em>Expected Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expected Response</em>'.
	 * @see smar2t.td.w3c.hypermediacontrols.ExpectedResponse
	 * @generated
	 */
	EClass getExpectedResponse();

	/**
	 * Returns the meta object for the attribute '{@link smar2t.td.w3c.hypermediacontrols.ExpectedResponse#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see smar2t.td.w3c.hypermediacontrols.ExpectedResponse#getContentType()
	 * @see #getExpectedResponse()
	 * @generated
	 */
	EAttribute getExpectedResponse_ContentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HypermediacontrolsFactory getHypermediacontrolsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link smar2t.td.w3c.hypermediacontrols.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smar2t.td.w3c.hypermediacontrols.impl.LinkImpl
		 * @see smar2t.td.w3c.hypermediacontrols.impl.HypermediacontrolsPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__HREF = eINSTANCE.getLink_Href();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TYPE = eINSTANCE.getLink_Type();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__REL = eINSTANCE.getLink_Rel();

		/**
		 * The meta object literal for the '<em><b>Anchor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__ANCHOR = eINSTANCE.getLink_Anchor();

		/**
		 * The meta object literal for the '{@link smar2t.td.w3c.hypermediacontrols.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smar2t.td.w3c.hypermediacontrols.impl.FormImpl
		 * @see smar2t.td.w3c.hypermediacontrols.impl.HypermediacontrolsPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__OP = eINSTANCE.getForm_Op();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__HREF = eINSTANCE.getForm_Href();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__CONTENT_TYPE = eINSTANCE.getForm_ContentType();

		/**
		 * The meta object literal for the '<em><b>Content Coding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__CONTENT_CODING = eINSTANCE.getForm_ContentCoding();

		/**
		 * The meta object literal for the '<em><b>Subprotocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__SUBPROTOCOL = eINSTANCE.getForm_Subprotocol();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__SECURITY = eINSTANCE.getForm_Security();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__SCOPES = eINSTANCE.getForm_Scopes();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__RESPONSE = eINSTANCE.getForm_Response();

		/**
		 * The meta object literal for the '{@link smar2t.td.w3c.hypermediacontrols.impl.ExpectedResponseImpl <em>Expected Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smar2t.td.w3c.hypermediacontrols.impl.ExpectedResponseImpl
		 * @see smar2t.td.w3c.hypermediacontrols.impl.HypermediacontrolsPackageImpl#getExpectedResponse()
		 * @generated
		 */
		EClass EXPECTED_RESPONSE = eINSTANCE.getExpectedResponse();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTED_RESPONSE__CONTENT_TYPE = eINSTANCE.getExpectedResponse_ContentType();

	}

} //HypermediacontrolsPackage
