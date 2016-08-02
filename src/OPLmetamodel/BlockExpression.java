/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.BlockExpression#getBlocks <em>Blocks</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getBlockExpression()
 * @model
 * @generated
 */
public interface BlockExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference.
	 * @see #setBlocks(BooleanBlock)
	 * @see OPLmetamodel.OPLmetamodelPackage#getBlockExpression_Blocks()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BooleanBlock getBlocks();

	/**
	 * Sets the value of the '{@link OPLmetamodel.BlockExpression#getBlocks <em>Blocks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocks</em>' containment reference.
	 * @see #getBlocks()
	 * @generated
	 */
	void setBlocks(BooleanBlock value);

} // BlockExpression
