/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Dereference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.PathDereference#getDeref <em>Deref</em>}</li>
 *   <li>{@link OPLmetamodel.PathDereference#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getPathDereference()
 * @model abstract="true"
 * @generated
 */
public interface PathDereference extends PathExpression {
	/**
	 * Returns the value of the '<em><b>Deref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deref</em>' containment reference.
	 * @see #setDeref(Reference)
	 * @see OPLmetamodel.OPLmetamodelPackage#getPathDereference_Deref()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Reference getDeref();

	/**
	 * Sets the value of the '{@link OPLmetamodel.PathDereference#getDeref <em>Deref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deref</em>' containment reference.
	 * @see #getDeref()
	 * @generated
	 */
	void setDeref(Reference value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(PathExpression)
	 * @see OPLmetamodel.OPLmetamodelPackage#getPathDereference_Base()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PathExpression getBase();

	/**
	 * Sets the value of the '{@link OPLmetamodel.PathDereference#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(PathExpression value);

} // PathDereference
