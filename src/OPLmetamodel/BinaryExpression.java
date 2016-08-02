/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.BinaryExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link OPLmetamodel.BinaryExpression#getRhs <em>Rhs</em>}</li>
 *   <li>{@link OPLmetamodel.BinaryExpression#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(Expression)
	 * @see OPLmetamodel.OPLmetamodelPackage#getBinaryExpression_Lhs()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getLhs();

	/**
	 * Sets the value of the '{@link OPLmetamodel.BinaryExpression#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Expression value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(Expression)
	 * @see OPLmetamodel.OPLmetamodelPackage#getBinaryExpression_Rhs()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getRhs();

	/**
	 * Sets the value of the '{@link OPLmetamodel.BinaryExpression#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Expression value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(AbstractBinaryOperator)
	 * @see OPLmetamodel.OPLmetamodelPackage#getBinaryExpression_Op()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractBinaryOperator getOp();

	/**
	 * Sets the value of the '{@link OPLmetamodel.BinaryExpression#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(AbstractBinaryOperator value);

} // BinaryExpression
