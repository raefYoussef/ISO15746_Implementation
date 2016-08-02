/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.AllExpression#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link OPLmetamodel.AllExpression#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getAllExpression()
 * @model
 * @generated
 */
public interface AllExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualifiers</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.FormalParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifiers</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getAllExpression_Qualifiers()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<FormalParameter> getQualifiers();

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
	 * @see OPLmetamodel.OPLmetamodelPackage#getAllExpression_Body()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link OPLmetamodel.AllExpression#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

} // AllExpression
