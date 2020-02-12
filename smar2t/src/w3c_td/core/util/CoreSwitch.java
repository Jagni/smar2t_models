/**
 */
package w3c_td.core.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import w3c_td.core.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see w3c_td.core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorePackage.THING: {
				Thing thing = (Thing)theEObject;
				T result = caseThing(thing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VERSION_INFO: {
				VersionInfo versionInfo = (VersionInfo)theEObject;
				T result = caseVersionInfo(versionInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PROPERTY_AFFORDANCE: {
				PropertyAffordance propertyAffordance = (PropertyAffordance)theEObject;
				T result = casePropertyAffordance(propertyAffordance);
				if (result == null) result = caseInteractionAffordance(propertyAffordance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INTERACTION_AFFORDANCE: {
				InteractionAffordance interactionAffordance = (InteractionAffordance)theEObject;
				T result = caseInteractionAffordance(interactionAffordance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EVENT_AFFORDANCE: {
				EventAffordance eventAffordance = (EventAffordance)theEObject;
				T result = caseEventAffordance(eventAffordance);
				if (result == null) result = caseInteractionAffordance(eventAffordance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ACTION_AFFORDANCE: {
				ActionAffordance actionAffordance = (ActionAffordance)theEObject;
				T result = caseActionAffordance(actionAffordance);
				if (result == null) result = caseInteractionAffordance(actionAffordance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MULTI_LANGUAGE: {
				MultiLanguage multiLanguage = (MultiLanguage)theEObject;
				T result = caseMultiLanguage(multiLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_TO_EVENT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, EventAffordance> stringToEventMap = (Map.Entry<String, EventAffordance>)theEObject;
				T result = caseStringToEventMap(stringToEventMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_TO_ACTION_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, ActionAffordance> stringToActionMap = (Map.Entry<String, ActionAffordance>)theEObject;
				T result = caseStringToActionMap(stringToActionMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_TO_PROPERTY_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, PropertyAffordance> stringToPropertyMap = (Map.Entry<String, PropertyAffordance>)theEObject;
				T result = caseStringToPropertyMap(stringToPropertyMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThing(Thing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionInfo(VersionInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Affordance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Affordance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyAffordance(PropertyAffordance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Affordance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Affordance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionAffordance(InteractionAffordance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Affordance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Affordance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventAffordance(EventAffordance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Affordance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Affordance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionAffordance(ActionAffordance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiLanguage(MultiLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Event Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Event Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToEventMap(Map.Entry<String, EventAffordance> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Action Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Action Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToActionMap(Map.Entry<String, ActionAffordance> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Property Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Property Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToPropertyMap(Map.Entry<String, PropertyAffordance> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CoreSwitch
