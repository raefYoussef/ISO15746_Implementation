/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.BooleanExpression#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getBooleanExpression()
 * @model annotation="https://oplmetamodel.com/documentation body='an Expression that evaluates to a Boolean'"
 * @generated
 */
public interface BooleanExpression extends PrimitiveExpression {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see OPLmetamodel.OPLmetamodelPackage#getBooleanExpression_Body()
	 * @model required="true"
	 *        annotation="https://oplmetamodel.com/notes body='Added to metamodel to provide body to the expression'"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link OPLmetamodel.BooleanExpression#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // BooleanExpression
