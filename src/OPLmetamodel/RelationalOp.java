/**
 */
package OPLmetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relational Op</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see OPLmetamodel.OPLmetamodelPackage#getRelationalOp()
 * @model annotation="https://oplmetamodel.com/documentation body='Due to the similarities of all constraints and all arithmetic terms in constraints and objective functions, aggregate operators are used in OPL to factorize these commonalities'"
 * @generated
 */
public enum RelationalOp implements Enumerator {
	/**
	 * The '<em><b>Greater Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN(0, "greaterThan", "greaterThan"),

	/**
	 * The '<em><b>Greater Than Or Equal To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_OR_EQUAL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN_OR_EQUAL_TO(0, "greaterThanOrEqualTo", "greaterThanOrEqualTo"),

	/**
	 * The '<em><b>Less Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN(0, "lessThan", "lessThan"),

	/**
	 * The '<em><b>Less Than Or Equal To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_OR_EQUAL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN_OR_EQUAL_TO(0, "lessThanOrEqualTo", "lessThanOrEqualTo"),

	/**
	 * The '<em><b>Equal To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL_TO(0, "equalTo", "equalTo"),

	/**
	 * The '<em><b>Not Equal To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_EQUAL_TO(0, "notEqualTo", "notEqualTo");

	/**
	 * The '<em><b>Greater Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN
	 * @model name="greaterThan"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_VALUE = 0;

	/**
	 * The '<em><b>Greater Than Or Equal To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater Than Or Equal To</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_OR_EQUAL_TO
	 * @model name="greaterThanOrEqualTo"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_OR_EQUAL_TO_VALUE = 0;

	/**
	 * The '<em><b>Less Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Less Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN
	 * @model name="lessThan"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_VALUE = 0;

	/**
	 * The '<em><b>Less Than Or Equal To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Less Than Or Equal To</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_OR_EQUAL_TO
	 * @model name="lessThanOrEqualTo"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_OR_EQUAL_TO_VALUE = 0;

	/**
	 * The '<em><b>Equal To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equal To</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL_TO
	 * @model name="equalTo"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_TO_VALUE = 0;

	/**
	 * The '<em><b>Not Equal To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Equal To</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL_TO
	 * @model name="notEqualTo"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_EQUAL_TO_VALUE = 0;

	/**
	 * An array of all the '<em><b>Relational Op</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationalOp[] VALUES_ARRAY =
		new RelationalOp[] {
			GREATER_THAN,
			GREATER_THAN_OR_EQUAL_TO,
			LESS_THAN,
			LESS_THAN_OR_EQUAL_TO,
			EQUAL_TO,
			NOT_EQUAL_TO,
		};

	/**
	 * A public read-only list of all the '<em><b>Relational Op</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationalOp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relational Op</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationalOp get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationalOp result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relational Op</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationalOp getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationalOp result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relational Op</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationalOp get(int value) {
		switch (value) {
			case GREATER_THAN_VALUE: return GREATER_THAN;
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
	private RelationalOp(int value, String name, String literal) {
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
	
} //RelationalOp
