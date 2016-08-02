/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.BinaryOperator#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getBinaryOperator()
 * @model
 * @generated
 */
public interface BinaryOperator extends AbstractBinaryOperator {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link OPLmetamodel.BinaryOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see OPLmetamodel.BinaryOp
	 * @see #setOp(BinaryOp)
	 * @see OPLmetamodel.OPLmetamodelPackage#getBinaryOperator_Op()
	 * @model required="true"
	 * @generated
	 */
	BinaryOp getOp();

	/**
	 * Sets the value of the '{@link OPLmetamodel.BinaryOperator#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see OPLmetamodel.BinaryOp
	 * @see #getOp()
	 * @generated
	 */
	void setOp(BinaryOp value);

} // BinaryOperator
