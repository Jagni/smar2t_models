/**
 */
package smar2t.td.w3c.hypermediacontrols.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import smar2t.td.w3c.hypermediacontrols.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HypermediacontrolsFactoryImpl extends EFactoryImpl implements HypermediacontrolsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HypermediacontrolsFactory init() {
		try {
			HypermediacontrolsFactory theHypermediacontrolsFactory = (HypermediacontrolsFactory)EPackage.Registry.INSTANCE.getEFactory(HypermediacontrolsPackage.eNS_URI);
			if (theHypermediacontrolsFactory != null) {
				return theHypermediacontrolsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HypermediacontrolsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypermediacontrolsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HypermediacontrolsPackage.LINK: return createLink();
			case HypermediacontrolsPackage.FORM: return createForm();
			case HypermediacontrolsPackage.EXPECTED_RESPONSE: return createExpectedResponse();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedResponse createExpectedResponse() {
		ExpectedResponseImpl expectedResponse = new ExpectedResponseImpl();
		return expectedResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypermediacontrolsPackage getHypermediacontrolsPackage() {
		return (HypermediacontrolsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HypermediacontrolsPackage getPackage() {
		return HypermediacontrolsPackage.eINSTANCE;
	}

} //HypermediacontrolsFactoryImpl
