/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.VariableBinding#getVars <em>Vars</em>}</li>
 *   <li>{@link OPLmetamodel.VariableBinding#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getVariableBinding()
 * @model
 * @generated
 */
public interface VariableBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.BindingRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vars</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getVariableBinding_Vars()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<BindingRef> getVars();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(Expression)
	 * @see OPLmetamodel.OPLmetamodelPackage#getVariableBinding_Domain()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getDomain();

	/**
	 * Sets the value of the '{@link OPLmetamodel.VariableBinding#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Expression value);

} // VariableBinding
