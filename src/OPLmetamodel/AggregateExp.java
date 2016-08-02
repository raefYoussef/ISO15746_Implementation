/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.AggregateExp#getOp <em>Op</em>}</li>
 *   <li>{@link OPLmetamodel.AggregateExp#getParameters <em>Parameters</em>}</li>
 *   <li>{@link OPLmetamodel.AggregateExp#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getAggregateExp()
 * @model
 * @generated
 */
public interface AggregateExp extends Expression {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link OPLmetamodel.AggOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see OPLmetamodel.AggOp
	 * @see #setOp(AggOp)
	 * @see OPLmetamodel.OPLmetamodelPackage#getAggregateExp_Op()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AggOp getOp();

	/**
	 * Sets the value of the '{@link OPLmetamodel.AggregateExp#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see OPLmetamodel.AggOp
	 * @see #getOp()
	 * @generated
	 */
	void setOp(AggOp value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.FormalParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getAggregateExp_Parameters()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<FormalParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Expression)
	 * @see OPLmetamodel.OPLmetamodelPackage#getAggregateExp_Body()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link OPLmetamodel.AggregateExp#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

} // AggregateExp
