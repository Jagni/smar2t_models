/**
 */
package smar2t.td.mozilla.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relationship</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see smar2t.td.mozilla.core.CorePackage#getRelationship()
 * @model
 * @generated
 */
public enum Relationship implements Enumerator {
	/**
	 * The '<em><b>Properties</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTIES_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTIES(0, "properties", "properties"),

	/**
	 * The '<em><b>Actions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIONS(1, "actions", "actions"),

	/**
	 * The '<em><b>Events</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENTS_VALUE
	 * @generated
	 * @ordered
	 */
	EVENTS(2, "events", "events"),

	/**
	 * The '<em><b>Alternate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALTERNATE_VALUE
	 * @generated
	 * @ordered
	 */
	ALTERNATE(3, "alternate", "alternate");

	/**
	 * The '<em><b>Properties</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTIES
	 * @model name="properties"
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTIES_VALUE = 0;

	/**
	 * The '<em><b>Actions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIONS
	 * @model name="actions"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIONS_VALUE = 1;

	/**
	 * The '<em><b>Events</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENTS
	 * @model name="events"
	 * @generated
	 * @ordered
	 */
	public static final int EVENTS_VALUE = 2;

	/**
	 * The '<em><b>Alternate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALTERNATE
	 * @model name="alternate"
	 * @generated
	 * @ordered
	 */
	public static final int ALTERNATE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Relationship</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Relationship[] VALUES_ARRAY =
		new Relationship[] {
			PROPERTIES,
			ACTIONS,
			EVENTS,
			ALTERNATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Relationship</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Relationship> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relationship</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Relationship get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Relationship result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Relationship getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Relationship result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Relationship get(int value) {
		switch (value) {
			case PROPERTIES_VALUE: return PROPERTIES;
			case ACTIONS_VALUE: return ACTIONS;
			case EVENTS_VALUE: return EVENTS;
			case ALTERNATE_VALUE: return ALTERNATE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Relationship(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Relationship
