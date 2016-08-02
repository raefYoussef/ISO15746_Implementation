/**
 */
package OPLmetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Set Op</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see OPLmetamodel.OPLmetamodelPackage#getSetOp()
 * @model
 * @generated
 */
public enum SetOp implements Enumerator {
	/**
	 * The '<em><b>Symdiff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYMDIFF_VALUE
	 * @generated
	 * @ordered
	 */
	SYMDIFF(0, "symdiff", "symdiff"),

	/**
	 * The '<em><b>Diff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFF_VALUE
	 * @generated
	 * @ordered
	 */
	DIFF(0, "diff", "diff"),

	/**
	 * The '<em><b>Union</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNION_VALUE
	 * @generated
	 * @ordered
	 */
	UNION(0, "union", "union"),

	/**
	 * The '<em><b>Inter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTER_VALUE
	 * @generated
	 * @ordered
	 */
	INTER(0, "inter", "inter");

	/**
	 * The '<em><b>Symdiff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Symdiff</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYMDIFF
	 * @model name="symdiff"
	 * @generated
	 * @ordered
	 */
	public static final int SYMDIFF_VALUE = 0;

	/**
	 * The '<em><b>Diff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diff</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIFF
	 * @model name="diff"
	 * @generated
	 * @ordered
	 */
	public static final int DIFF_VALUE = 0;

	/**
	 * The '<em><b>Union</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Union</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNION
	 * @model name="union"
	 * @generated
	 * @ordered
	 */
	public static final int UNION_VALUE = 0;

	/**
	 * The '<em><b>Inter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTER
	 * @model name="inter"
	 * @generated
	 * @ordered
	 */
	public static final int INTER_VALUE = 0;

	/**
	 * An array of all the '<em><b>Set Op</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SetOp[] VALUES_ARRAY =
		new SetOp[] {
			SYMDIFF,
			DIFF,
			UNION,
			INTER,
		};

	/**
	 * A public read-only list of all the '<em><b>Set Op</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SetOp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Set Op</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SetOp get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SetOp result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Set Op</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SetOp getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SetOp result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Set Op</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SetOp get(int value) {
		switch (value) {
			case SYMDIFF_VALUE: return SYMDIFF;
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
	private SetOp(int value, String name, String literal) {
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
	
} //SetOp
