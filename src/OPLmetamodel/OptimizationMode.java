/**
 */
package OPLmetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Optimization Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see OPLmetamodel.OPLmetamodelPackage#getOptimizationMode()
 * @model
 * @generated
 */
public enum OptimizationMode implements Enumerator {
	/**
	 * The '<em><b>Minimize</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMIZE_VALUE
	 * @generated
	 * @ordered
	 */
	MINIMIZE(0, "minimize", "minimize"),

	/**
	 * The '<em><b>Maximize</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMIZE_VALUE
	 * @generated
	 * @ordered
	 */
	MAXIMIZE(0, "maximize", "maximize"),

	/**
	 * The '<em><b>Solve</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLVE_VALUE
	 * @generated
	 * @ordered
	 */
	SOLVE(0, "solve", "solve");

	/**
	 * The '<em><b>Minimize</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minimize</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINIMIZE
	 * @model name="minimize"
	 * @generated
	 * @ordered
	 */
	public static final int MINIMIZE_VALUE = 0;

	/**
	 * The '<em><b>Maximize</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maximize</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAXIMIZE
	 * @model name="maximize"
	 * @generated
	 * @ordered
	 */
	public static final int MAXIMIZE_VALUE = 0;

	/**
	 * The '<em><b>Solve</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solve</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLVE
	 * @model name="solve"
	 * @generated
	 * @ordered
	 */
	public static final int SOLVE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Optimization Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OptimizationMode[] VALUES_ARRAY =
		new OptimizationMode[] {
			MINIMIZE,
			MAXIMIZE,
			SOLVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Optimization Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OptimizationMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Optimization Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OptimizationMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OptimizationMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Optimization Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OptimizationMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OptimizationMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Optimization Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OptimizationMode get(int value) {
		switch (value) {
			case MINIMIZE_VALUE: return MINIMIZE;
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
	private OptimizationMode(int value, String name, String literal) {
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
	
} //OptimizationMode
