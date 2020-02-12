/**
 */
package w3c_td.dataschema;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see w3c_td.dataschema.DataschemaPackage
 * @generated
 */
public interface DataschemaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataschemaFactory eINSTANCE = w3c_td.dataschema.impl.DataschemaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Array Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Schema</em>'.
	 * @generated
	 */
	ArraySchema createArraySchema();

	/**
	 * Returns a new object of class '<em>Object Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Schema</em>'.
	 * @generated
	 */
	ObjectSchema createObjectSchema();

	/**
	 * Returns a new object of class '<em>String Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Schema</em>'.
	 * @generated
	 */
	StringSchema createStringSchema();

	/**
	 * Returns a new object of class '<em>Boolean Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Schema</em>'.
	 * @generated
	 */
	BooleanSchema createBooleanSchema();

	/**
	 * Returns a new object of class '<em>Number Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Schema</em>'.
	 * @generated
	 */
	NumberSchema createNumberSchema();

	/**
	 * Returns a new object of class '<em>Integer Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Schema</em>'.
	 * @generated
	 */
	IntegerSchema createIntegerSchema();

	/**
	 * Returns a new object of class '<em>Null Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Schema</em>'.
	 * @generated
	 */
	NullSchema createNullSchema();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataschemaPackage getDataschemaPackage();

} //DataschemaFactory
