/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.FormalParameter#getDomain <em>Domain</em>}</li>
 *   <li>{@link OPLmetamodel.FormalParameter#getBoundVars <em>Bound Vars</em>}</li>
 *   <li>{@link OPLmetamodel.FormalParameter#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link OPLmetamodel.FormalParameter#getRequire <em>Require</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getFormalParameter()
 * @model annotation="https://oplmetamodel.com/documentation body='A FormalParameter binds a set of parameters provided by .boundVars to a Domain.'"
 * @generated
 */
public interface FormalParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(ParameterDomain)
	 * @see OPLmetamodel.OPLmetamodelPackage#getFormalParameter_Domain()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ParameterDomain getDomain();

	/**
	 * Sets the value of the '{@link OPLmetamodel.FormalParameter#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(ParameterDomain value);

	/**
	 * Returns the value of the '<em><b>Bound Vars</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.BindingRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Vars</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getFormalParameter_BoundVars()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BindingRef> getBoundVars();

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see OPLmetamodel.OPLmetamodelPackage#getFormalParameter_IsOrdered()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link OPLmetamodel.FormalParameter#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Require</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require</em>' containment reference.
	 * @see #setRequire(Expression)
	 * @see OPLmetamodel.OPLmetamodelPackage#getFormalParameter_Require()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRequire();

	/**
	 * Sets the value of the '{@link OPLmetamodel.FormalParameter#getRequire <em>Require</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require</em>' containment reference.
	 * @see #getRequire()
	 * @generated
	 */
	void setRequire(Expression value);

} // FormalParameter
