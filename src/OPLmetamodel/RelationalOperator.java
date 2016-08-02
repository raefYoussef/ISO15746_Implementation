/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.RelationalOperator#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getRelationalOperator()
 * @model
 * @generated
 */
public interface RelationalOperator extends AbstractBinaryOperator {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link OPLmetamodel.RelationalOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see OPLmetamodel.RelationalOp
	 * @see #setOp(RelationalOp)
	 * @see OPLmetamodel.OPLmetamodelPackage#getRelationalOperator_Op()
	 * @model required="true"
	 * @generated
	 */
	RelationalOp getOp();

	/**
	 * Sets the value of the '{@link OPLmetamodel.RelationalOperator#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see OPLmetamodel.RelationalOp
	 * @see #getOp()
	 * @generated
	 */
	void setOp(RelationalOp value);

} // RelationalOperator
