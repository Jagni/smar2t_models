/**
 */
package smar2t.ui.interaction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Number Input Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see smar2t.ui.interaction.InteractionPackage#getNumberInputType()
 * @model
 * @generated
 */
public enum NumberInputType implements Enumerator {
	/**
	 * The '<em><b>Dial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAL_VALUE
	 * @generated
	 * @ordered
	 */
	DIAL(0, "dial", "dial"),

	/**
	 * The '<em><b>Slider</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLIDER_VALUE
	 * @generated
	 * @ordered
	 */
	SLIDER(1, "slider", "slider"),

	/**
	 * The '<em><b>Keyboard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYBOARD_VALUE
	 * @generated
	 * @ordered
	 */
	KEYBOARD(2, "keyboard", "keyboard"),

	/**
	 * The '<em><b>Stepper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEPPER_VALUE
	 * @generated
	 * @ordered
	 */
	STEPPER(3, "stepper", "stepper");

	/**
	 * The '<em><b>Dial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAL
	 * @model name="dial"
	 * @generated
	 * @ordered
	 */
	public static final int DIAL_VALUE = 0;

	/**
	 * The '<em><b>Slider</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLIDER
	 * @model name="slider"
	 * @generated
	 * @ordered
	 */
	public static final int SLIDER_VALUE = 1;

	/**
	 * The '<em><b>Keyboard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYBOARD
	 * @model name="keyboard"
	 * @generated
	 * @ordered
	 */
	public static final int KEYBOARD_VALUE = 2;

	/**
	 * The '<em><b>Stepper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEPPER
	 * @model name="stepper"
	 * @generated
	 * @ordered
	 */
	public static final int STEPPER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Number Input Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NumberInputType[] VALUES_ARRAY =
		new NumberInputType[] {
			DIAL,
			SLIDER,
			KEYBOARD,
			STEPPER,
		};

	/**
	 * A public read-only list of all the '<em><b>Number Input Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NumberInputType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Number Input Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NumberInputType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NumberInputType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Number Input Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NumberInputType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NumberInputType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Number Input Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NumberInputType get(int value) {
		switch (value) {
			case DIAL_VALUE: return DIAL;
			case SLIDER_VALUE: return SLIDER;
			case KEYBOARD_VALUE: return KEYBOARD;
			case STEPPER_VALUE: return STEPPER;
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
	private NumberInputType(int value, String name, String literal) {
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
	
} //NumberInputType
