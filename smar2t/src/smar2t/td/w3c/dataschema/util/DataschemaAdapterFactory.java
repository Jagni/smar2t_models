/**
 */
package smar2t.td.w3c.dataschema.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import smar2t.td.w3c.dataschema.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see smar2t.td.w3c.dataschema.DataschemaPackage
 * @generated
 */
public class DataschemaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataschemaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataschemaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DataschemaPackage.eINSTANCE;
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
	protected DataschemaSwitch<Adapter> modelSwitch =
		new DataschemaSwitch<Adapter>() {
			@Override
			public Adapter caseDataSchema(DataSchema object) {
				return createDataSchemaAdapter();
			}
			@Override
			public Adapter caseArraySchema(ArraySchema object) {
				return createArraySchemaAdapter();
			}
			@Override
			public Adapter caseObjectSchema(ObjectSchema object) {
				return createObjectSchemaAdapter();
			}
			@Override
			public Adapter caseStringSchema(StringSchema object) {
				return createStringSchemaAdapter();
			}
			@Override
			public Adapter caseBooleanSchema(BooleanSchema object) {
				return createBooleanSchemaAdapter();
			}
			@Override
			public Adapter caseNumberSchema(NumberSchema object) {
				return createNumberSchemaAdapter();
			}
			@Override
			public Adapter caseIntegerSchema(IntegerSchema object) {
				return createIntegerSchemaAdapter();
			}
			@Override
			public Adapter caseNullSchema(NullSchema object) {
				return createNullSchemaAdapter();
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
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.dataschema.DataSchema <em>Data Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.dataschema.DataSchema
	 * @generated
	 */
	public Adapter createDataSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.dataschema.ArraySchema <em>Array Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.dataschema.ArraySchema
	 * @generated
	 */
	public Adapter createArraySchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.dataschema.ObjectSchema <em>Object Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.dataschema.ObjectSchema
	 * @generated
	 */
	public Adapter createObjectSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.dataschema.StringSchema <em>String Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.dataschema.StringSchema
	 * @generated
	 */
	public Adapter createStringSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.dataschema.BooleanSchema <em>Boolean Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.dataschema.BooleanSchema
	 * @generated
	 */
	public Adapter createBooleanSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.dataschema.NumberSchema <em>Number Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.dataschema.NumberSchema
	 * @generated
	 */
	public Adapter createNumberSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.dataschema.IntegerSchema <em>Integer Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.dataschema.IntegerSchema
	 * @generated
	 */
	public Adapter createIntegerSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link smar2t.td.w3c.dataschema.NullSchema <em>Null Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see smar2t.td.w3c.dataschema.NullSchema
	 * @generated
	 */
	public Adapter createNullSchemaAdapter() {
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

} //DataschemaAdapterFactory
