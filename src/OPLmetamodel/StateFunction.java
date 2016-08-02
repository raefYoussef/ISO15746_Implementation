/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.StateFunction#getTransitionMatrix <em>Transition Matrix</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getStateFunction()
 * @model
 * @generated
 */
public interface StateFunction extends Function {
	/**
	 * Returns the value of the '<em><b>Transition Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Matrix</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Matrix</em>' containment reference.
	 * @see #setTransitionMatrix(SetType)
	 * @see OPLmetamodel.OPLmetamodelPackage#getStateFunction_TransitionMatrix()
	 * @model containment="true"
	 * @generated
	 */
	SetType getTransitionMatrix();

	/**
	 * Sets the value of the '{@link OPLmetamodel.StateFunction#getTransitionMatrix <em>Transition Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Matrix</em>' containment reference.
	 * @see #getTransitionMatrix()
	 * @generated
	 */
	void setTransitionMatrix(SetType value);

} // StateFunction
