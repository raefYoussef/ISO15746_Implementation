/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.UnaryExpression#getExp <em>Exp</em>}</li>
 *   <li>{@link OPLmetamodel.UnaryExpression#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(Expression)
	 * @see OPLmetamodel.OPLmetamodelPackage#getUnaryExpression_Exp()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getExp();

	/**
	 * Sets the value of the '{@link OPLmetamodel.UnaryExpression#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(Expression value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link OPLmetamodel.UnaryOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see OPLmetamodel.UnaryOp
	 * @see #setOp(UnaryOp)
	 * @see OPLmetamodel.OPLmetamodelPackage#getUnaryExpression_Op()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UnaryOp getOp();

	/**
	 * Sets the value of the '{@link OPLmetamodel.UnaryExpression#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see OPLmetamodel.UnaryOp
	 * @see #getOp()
	 * @generated
	 */
	void setOp(UnaryOp value);

} // UnaryExpression
