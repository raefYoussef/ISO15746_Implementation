/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.DataDeclaration#getVariable <em>Variable</em>}</li>
 *   <li>{@link OPLmetamodel.DataDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link OPLmetamodel.DataDeclaration#isIsDecisionVar <em>Is Decision Var</em>}</li>
 *   <li>{@link OPLmetamodel.DataDeclaration#isIsDecisionExpr <em>Is Decision Expr</em>}</li>
 *   <li>{@link OPLmetamodel.DataDeclaration#getValue <em>Value</em>}</li>
 *   <li>{@link OPLmetamodel.DataDeclaration#getValueConstraint <em>Value Constraint</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getDataDeclaration()
 * @model
 * @generated
 */
public interface DataDeclaration extends Declaration {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(DataRef)
	 * @see OPLmetamodel.OPLmetamodelPackage#getDataDeclaration_Variable()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	DataRef getVariable();

	/**
	 * Sets the value of the '{@link OPLmetamodel.DataDeclaration#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(DataRef value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(AbstractType)
	 * @see OPLmetamodel.OPLmetamodelPackage#getDataDeclaration_Type()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	AbstractType getType();

	/**
	 * Sets the value of the '{@link OPLmetamodel.DataDeclaration#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AbstractType value);

	/**
	 * Returns the value of the '<em><b>Is Decision Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Decision Var</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Decision Var</em>' attribute.
	 * @see #setIsDecisionVar(boolean)
	 * @see OPLmetamodel.OPLmetamodelPackage#getDataDeclaration_IsDecisionVar()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDecisionVar();

	/**
	 * Sets the value of the '{@link OPLmetamodel.DataDeclaration#isIsDecisionVar <em>Is Decision Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Decision Var</em>' attribute.
	 * @see #isIsDecisionVar()
	 * @generated
	 */
	void setIsDecisionVar(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Decision Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Decision Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Decision Expr</em>' attribute.
	 * @see #setIsDecisionExpr(boolean)
	 * @see OPLmetamodel.OPLmetamodelPackage#getDataDeclaration_IsDecisionExpr()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDecisionExpr();

	/**
	 * Sets the value of the '{@link OPLmetamodel.DataDeclaration#isIsDecisionExpr <em>Is Decision Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Decision Expr</em>' attribute.
	 * @see #isIsDecisionExpr()
	 * @generated
	 */
	void setIsDecisionExpr(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Initialization)
	 * @see OPLmetamodel.OPLmetamodelPackage#getDataDeclaration_Value()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Initialization getValue();

	/**
	 * Sets the value of the '{@link OPLmetamodel.DataDeclaration#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Initialization value);

	/**
	 * Returns the value of the '<em><b>Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Constraint</em>' containment reference.
	 * @see #setValueConstraint(Expression)
	 * @see OPLmetamodel.OPLmetamodelPackage#getDataDeclaration_ValueConstraint()
	 * @model containment="true" ordered="false"
	 *        annotation="https://oplmetamodel.com/documentation body='An Expression (including a RangeExpression) that further constrains the value space described by .type. This is introduced by the keyword \"in.\" Example: \"dvar float Store[Months][Products] in 0..1000;\"  this property expresses the \"in 0..1000\"\r\n'"
	 * @generated
	 */
	Expression getValueConstraint();

	/**
	 * Sets the value of the '{@link OPLmetamodel.DataDeclaration#getValueConstraint <em>Value Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Constraint</em>' containment reference.
	 * @see #getValueConstraint()
	 * @generated
	 */
	void setValueConstraint(Expression value);

} // DataDeclaration
