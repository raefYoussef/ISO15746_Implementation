/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.RangeExpression#getLowerLimit <em>Lower Limit</em>}</li>
 *   <li>{@link OPLmetamodel.RangeExpression#getUpperLimit <em>Upper Limit</em>}</li>
 *   <li>{@link OPLmetamodel.RangeExpression#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getRangeExpression()
 * @model annotation="https://oplmetamodel.com/documentation body='A RangeExpression is a AllRange defining the lower and upper bounds on the range.'"
 * @generated
 */
public interface RangeExpression extends NumericExpression {
	/**
	 * Returns the value of the '<em><b>Lower Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Limit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Limit</em>' containment reference.
	 * @see #setLowerLimit(NumericExpression)
	 * @see OPLmetamodel.OPLmetamodelPackage#getRangeExpression_LowerLimit()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NumericExpression getLowerLimit();

	/**
	 * Sets the value of the '{@link OPLmetamodel.RangeExpression#getLowerLimit <em>Lower Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Limit</em>' containment reference.
	 * @see #getLowerLimit()
	 * @generated
	 */
	void setLowerLimit(NumericExpression value);

	/**
	 * Returns the value of the '<em><b>Upper Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Limit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Limit</em>' containment reference.
	 * @see #setUpperLimit(NumericExpression)
	 * @see OPLmetamodel.OPLmetamodelPackage#getRangeExpression_UpperLimit()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NumericExpression getUpperLimit();

	/**
	 * Sets the value of the '{@link OPLmetamodel.RangeExpression#getUpperLimit <em>Upper Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Limit</em>' containment reference.
	 * @see #getUpperLimit()
	 * @generated
	 */
	void setUpperLimit(NumericExpression value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(NumericType)
	 * @see OPLmetamodel.OPLmetamodelPackage#getRangeExpression_Type()
	 * @model containment="true" ordered="false"
	 *        annotation="https://oplmetamodel.com/documentation body='FloatType for IntegerType. Used when a variable declaration explicitly '"
	 * @generated
	 */
	NumericType getType();

	/**
	 * Sets the value of the '{@link OPLmetamodel.RangeExpression#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(NumericType value);

} // RangeExpression
