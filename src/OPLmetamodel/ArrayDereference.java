/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Dereference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.ArrayDereference#getArray <em>Array</em>}</li>
 *   <li>{@link OPLmetamodel.ArrayDereference#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getArrayDereference()
 * @model
 * @generated
 */
public interface ArrayDereference extends PathExpression {
	/**
	 * Returns the value of the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' containment reference.
	 * @see #setArray(PathExpression)
	 * @see OPLmetamodel.OPLmetamodelPackage#getArrayDereference_Array()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PathExpression getArray();

	/**
	 * Sets the value of the '{@link OPLmetamodel.ArrayDereference#getArray <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' containment reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(PathExpression value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getArrayDereference_Index()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getIndex();

} // ArrayDereference
