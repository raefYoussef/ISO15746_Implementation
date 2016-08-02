/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.Function#getName <em>Name</em>}</li>
 *   <li>{@link OPLmetamodel.Function#getBody <em>Body</em>}</li>
 *   <li>{@link OPLmetamodel.Function#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getFunction()
 * @model abstract="true"
 *        annotation="https://oplmetamodel.com/documentation body='A Function binds a set of parameters (.parameters) in the scope of an expression (.body) and evaluates the Expression producing a value.'"
 * @generated
 */
public interface Function extends Declaration {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(FunctionRef)
	 * @see OPLmetamodel.OPLmetamodelPackage#getFunction_Name()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="https://oplmetamodel.com/documentation body='Function.name is a Reference associated with a Function used in making calls to the function.'"
	 * @generated
	 */
	FunctionRef getName();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Function#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(FunctionRef value);

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
	 * @see OPLmetamodel.OPLmetamodelPackage#getFunction_Body()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Function#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getFunction_Parameters()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Reference> getParameters();

} // Function
