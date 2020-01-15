/**
 */
package smar2t.td.w3c.security.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import smar2t.td.w3c.security.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see smar2t.td.w3c.security.SecurityPackage
 * @generated
 */
public class SecurityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecurityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SecurityPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuritySwitch<Adapter> modelSwitch =
		new SecuritySwitch<Adapter>() {
			@Override
			public Adapter caseSecurityScheme(SecurityScheme object) {
				return createSecuritySchemeAdapter();
			}
			@Override
			public Adapter caseNoSecurityScheme(NoSecurityScheme object) {
				return createNoSecuritySchemeAdapter();
			}
			@Override
			public Adapter caseBasicSecurityScheme(BasicSecurityScheme object) {
				return createBasicSecuritySchemeAdapter();
			}
			@Override
			public Adapter caseDigestSecurityScheme(DigestSecurityScheme object) {
				return createDigestSecuritySchemeAdapter();
			}
			@Override
			public Adapter caseAPIKeySecurityScheme(APIKeySecurityScheme object) {
				return createAPIKeySecuritySchemeAdapter();
			}
			@Override
			public Adapter caseBearerSecurityScheme(BearerSecurityScheme object) {
				return createBearerSecuritySchemeAdapter();
			}
			@Override
			public Adapter caseCertSecurityScheme(CertSecurityScheme object) {
				return createCertSecuritySchemeAdapter();
			}
			@Override
			public Adapter casePSKSecurityScheme(PSKSecurityScheme object) {
				return createPSKSecuritySchemeAdapter();
			}
			@Override
			public Adapter casePublicSecurityScheme(PublicSecurityScheme object) {
				return createPublicSecuritySchemeAdapter();
			}
			@Override
			public Adapter casePoPSecurityScheme(PoPSecurityScheme object) {
				return createPoPSecuritySchemeAdapter();
			}
			@Override
			public Adapter caseOAuth2SecurityScheme(OAuth2SecurityScheme object) {
				return createOAuth2SecuritySchemeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.security.SecurityScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.security.SecurityScheme
	 * @generated
	 */
	public Adapter createSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.security.NoSecurityScheme <em>No Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.security.NoSecurityScheme
	 * @generated
	 */
	public Adapter createNoSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.security.BasicSecurityScheme <em>Basic Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.security.BasicSecurityScheme
	 * @generated
	 */
	public Adapter createBasicSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.security.DigestSecurityScheme <em>Digest Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.security.DigestSecurityScheme
	 * @generated
	 */
	public Adapter createDigestSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.security.APIKeySecurityScheme <em>API Key Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.security.APIKeySecurityScheme
	 * @generated
	 */
	public Adapter createAPIKeySecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.security.BearerSecurityScheme <em>Bearer Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.security.BearerSecurityScheme
	 * @generated
	 */
	public Adapter createBearerSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.security.CertSecurityScheme <em>Cert Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.security.CertSecurityScheme
	 * @generated
	 */
	public Adapter createCertSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.security.PSKSecurityScheme <em>PSK Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.security.PSKSecurityScheme
	 * @generated
	 */
	public Adapter createPSKSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.security.PublicSecurityScheme <em>Public Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.security.PublicSecurityScheme
	 * @generated
	 */
	public Adapter createPublicSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.security.PoPSecurityScheme <em>Po PSecurity Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.security.PoPSecurityScheme
	 * @generated
	 */
	public Adapter createPoPSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.security.OAuth2SecurityScheme <em>OAuth2 Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.security.OAuth2SecurityScheme
	 * @generated
	 */
	public Adapter createOAuth2SecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SecurityAdapterFactory
