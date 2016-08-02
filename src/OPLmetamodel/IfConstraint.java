/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.IfConstraint#getTest <em>Test</em>}</li>
 *   <li>{@link OPLmetamodel.IfConstraint#getThen <em>Then</em>}</li>
 *   <li>{@link OPLmetamodel.IfConstraint#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getIfConstraint()
 * @model
 * @generated
 */
public interface IfConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference.
	 * @see #setTest(BooleanExpression)
	 * @see OPLmetamodel.OPLmetamodelPackage#getIfConstraint_Test()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BooleanExpression getTest();

	/**
	 * Sets the value of the '{@link OPLmetamodel.IfConstraint#getTest <em>Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' containment reference.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(Constraint)
	 * @see OPLmetamodel.OPLmetamodelPackage#getIfConstraint_Then()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Constraint getThen();

	/**
	 * Sets the value of the '{@link OPLmetamodel.IfConstraint#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(Constraint value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(Constraint)
	 * @see OPLmetamodel.OPLmetamodelPackage#getIfConstraint_Else()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Constraint getElse();

	/**
	 * Sets the value of the '{@link OPLmetamodel.IfConstraint#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Constraint value);

} // IfConstraint
