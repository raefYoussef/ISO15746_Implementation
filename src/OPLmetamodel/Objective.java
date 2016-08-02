/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.Objective#getAction <em>Action</em>}</li>
 *   <li>{@link OPLmetamodel.Objective#getExpression <em>Expression</em>}</li>
 *   <li>{@link OPLmetamodel.Objective#isIsLinearRelaxation <em>Is Linear Relaxation</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getObjective()
 * @model annotation="https://oplmetamodel.com/documentation body='an expression to be satisfied or optimized by performing the analysis described by the Model'"
 * @generated
 */
public interface Objective extends Declaration {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link OPLmetamodel.OptimizationMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see OPLmetamodel.OptimizationMode
	 * @see #setAction(OptimizationMode)
	 * @see OPLmetamodel.OPLmetamodelPackage#getObjective_Action()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OptimizationMode getAction();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Objective#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see OPLmetamodel.OptimizationMode
	 * @see #getAction()
	 * @generated
	 */
	void setAction(OptimizationMode value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see OPLmetamodel.OPLmetamodelPackage#getObjective_Expression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Objective#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Is Linear Relaxation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Linear Relaxation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Linear Relaxation</em>' attribute.
	 * @see #setIsLinearRelaxation(boolean)
	 * @see OPLmetamodel.OPLmetamodelPackage#getObjective_IsLinearRelaxation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsLinearRelaxation();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Objective#isIsLinearRelaxation <em>Is Linear Relaxation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Linear Relaxation</em>' attribute.
	 * @see #isIsLinearRelaxation()
	 * @generated
	 */
	void setIsLinearRelaxation(boolean value);

} // Objective
