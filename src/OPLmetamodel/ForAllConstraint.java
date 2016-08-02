/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For All Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.ForAllConstraint#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link OPLmetamodel.ForAllConstraint#getExps <em>Exps</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getForAllConstraint()
 * @model
 * @generated
 */
public interface ForAllConstraint extends Constraint {
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
	 * @see OPLmetamodel.OPLmetamodelPackage#getForAllConstraint_Qualifiers()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<FormalParameter> getQualifiers();

	/**
	 * Returns the value of the '<em><b>Exps</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exps</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getForAllConstraint_Exps()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getExps();

} // ForAllConstraint
