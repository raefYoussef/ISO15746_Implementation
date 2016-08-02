/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.TupleBinding#getVars <em>Vars</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getTupleBinding()
 * @model
 * @generated
 */
public interface TupleBinding extends EObject {
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
	 * @see OPLmetamodel.OPLmetamodelPackage#getTupleBinding_Vars()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BindingRef> getVars();

} // TupleBinding
