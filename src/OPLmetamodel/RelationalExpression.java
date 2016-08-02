/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.RelationalExpression#getRedefinedOp <em>Redefined Op</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getRelationalExpression()
 * @model
 * @generated
 */
public interface RelationalExpression extends BinaryExpression, BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Redefined Op</b></em>' attribute.
	 * The literals are from the enumeration {@link OPLmetamodel.RelationalOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Op</em>' attribute.
	 * @see OPLmetamodel.RelationalOp
	 * @see #setRedefinedOp(RelationalOp)
	 * @see OPLmetamodel.OPLmetamodelPackage#getRelationalExpression_RedefinedOp()
	 * @model required="true" ordered="false"
	 *        annotation="https://oplmetamodel.com/notes body='The attribute redefinedOp is used instead of op because EMF doesn\'t allow the redefining of inherited attributes.'"
	 * @generated
	 */
	RelationalOp getRedefinedOp();

	/**
	 * Sets the value of the '{@link OPLmetamodel.RelationalExpression#getRedefinedOp <em>Redefined Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Op</em>' attribute.
	 * @see OPLmetamodel.RelationalOp
	 * @see #getRedefinedOp()
	 * @generated
	 */
	void setRedefinedOp(RelationalOp value);

} // RelationalExpression
