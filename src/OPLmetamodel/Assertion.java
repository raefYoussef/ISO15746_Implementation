/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.Assertion#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getAssertion()
 * @model
 * @generated
 */
public interface Assertion extends Declaration {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(Constraint)
	 * @see OPLmetamodel.OPLmetamodelPackage#getAssertion_Exp()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Constraint getExp();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Assertion#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(Constraint value);

} // Assertion
