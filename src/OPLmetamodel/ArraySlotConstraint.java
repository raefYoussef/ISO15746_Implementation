/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Slot Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.ArraySlotConstraint#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getArraySlotConstraint()
 * @model
 * @generated
 */
public interface ArraySlotConstraint extends Expression {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(ArrayDereference)
	 * @see OPLmetamodel.OPLmetamodelPackage#getArraySlotConstraint_Target()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ArrayDereference getTarget();

	/**
	 * Sets the value of the '{@link OPLmetamodel.ArraySlotConstraint#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ArrayDereference value);

} // ArraySlotConstraint
