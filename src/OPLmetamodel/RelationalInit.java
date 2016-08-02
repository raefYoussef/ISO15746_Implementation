/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.RelationalInit#getBindingVar <em>Binding Var</em>}</li>
 *   <li>{@link OPLmetamodel.RelationalInit#getSources <em>Sources</em>}</li>
 *   <li>{@link OPLmetamodel.RelationalInit#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getRelationalInit()
 * @model
 * @generated
 */
public interface RelationalInit extends Initialization {
	/**
	 * Returns the value of the '<em><b>Binding Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Var</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Var</em>' containment reference.
	 * @see #setBindingVar(BindingRef)
	 * @see OPLmetamodel.OPLmetamodelPackage#getRelationalInit_BindingVar()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BindingRef getBindingVar();

	/**
	 * Sets the value of the '{@link OPLmetamodel.RelationalInit#getBindingVar <em>Binding Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Var</em>' containment reference.
	 * @see #getBindingVar()
	 * @generated
	 */
	void setBindingVar(BindingRef value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference.
	 * @see #setSources(VariableBinding)
	 * @see OPLmetamodel.OPLmetamodelPackage#getRelationalInit_Sources()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	VariableBinding getSources();

	/**
	 * Sets the value of the '{@link OPLmetamodel.RelationalInit#getSources <em>Sources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sources</em>' containment reference.
	 * @see #getSources()
	 * @generated
	 */
	void setSources(VariableBinding value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference.
	 * @see #setRelation(RelationalExpression)
	 * @see OPLmetamodel.OPLmetamodelPackage#getRelationalInit_Relation()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RelationalExpression getRelation();

	/**
	 * Sets the value of the '{@link OPLmetamodel.RelationalInit#getRelation <em>Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' containment reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(RelationalExpression value);

} // RelationalInit
