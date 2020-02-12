/**
 */
package smar2t.td.w3c.dataschema.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import smar2t.td.w3c.dataschema.*;

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
 * @see smar2t.td.w3c.dataschema.DataschemaPackage
 * @generated
 */
public class DataschemaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataschemaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataschemaSwitch() {
		if (modelPackage == null) {
			modelPackage = DataschemaPackage.eINSTANCE;
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
			case DataschemaPackage.DATA_SCHEMA: {
				DataSchema dataSchema = (DataSchema)theEObject;
				T result = caseDataSchema(dataSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataschemaPackage.ARRAY_SCHEMA: {
				ArraySchema arraySchema = (ArraySchema)theEObject;
				T result = caseArraySchema(arraySchema);
				if (result == null) result = caseDataSchema(arraySchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataschemaPackage.OBJECT_SCHEMA: {
				ObjectSchema objectSchema = (ObjectSchema)theEObject;
				T result = caseObjectSchema(objectSchema);
				if (result == null) result = caseDataSchema(objectSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataschemaPackage.STRING_SCHEMA: {
				StringSchema stringSchema = (StringSchema)theEObject;
				T result = caseStringSchema(stringSchema);
				if (result == null) result = caseDataSchema(stringSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataschemaPackage.BOOLEAN_SCHEMA: {
				BooleanSchema booleanSchema = (BooleanSchema)theEObject;
				T result = caseBooleanSchema(booleanSchema);
				if (result == null) result = caseDataSchema(booleanSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataschemaPackage.NUMBER_SCHEMA: {
				NumberSchema numberSchema = (NumberSchema)theEObject;
				T result = caseNumberSchema(numberSchema);
				if (result == null) result = caseDataSchema(numberSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataschemaPackage.INTEGER_SCHEMA: {
				IntegerSchema integerSchema = (IntegerSchema)theEObject;
				T result = caseIntegerSchema(integerSchema);
				if (result == null) result = caseDataSchema(integerSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataschemaPackage.NULL_SCHEMA: {
				NullSchema nullSchema = (NullSchema)theEObject;
				T result = caseNullSchema(nullSchema);
				if (result == null) result = caseDataSchema(nullSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSchema(DataSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArraySchema(ArraySchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectSchema(ObjectSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringSchema(StringSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanSchema(BooleanSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberSchema(NumberSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerSchema(IntegerSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullSchema(NullSchema object) {
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

} //DataschemaSwitch
