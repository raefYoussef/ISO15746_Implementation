/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.FunctionCall#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link OPLmetamodel.FunctionCall#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends PathExpression {
	/**
	 * Returns the value of the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Name</em>' attribute.
	 * @see #setFunctionName(String)
	 * @see OPLmetamodel.OPLmetamodelPackage#getFunctionCall_FunctionName()
	 * @model dataType="OPLmetamodel.Identifier" required="true" ordered="false"
	 * @generated
	 */
	String getFunctionName();

	/**
	 * Sets the value of the '{@link OPLmetamodel.FunctionCall#getFunctionName <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Name</em>' attribute.
	 * @see #getFunctionName()
	 * @generated
	 */
	void setFunctionName(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getFunctionCall_Args()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getArgs();

} // FunctionCall
