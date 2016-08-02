/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.DisplayInstruction#getExps <em>Exps</em>}</li>
 *   <li>{@link OPLmetamodel.DisplayInstruction#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getDisplayInstruction()
 * @model
 * @generated
 */
public interface DisplayInstruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Exps</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exps</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getDisplayInstruction_Exps()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getExps();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.ParameterDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getDisplayInstruction_Parameters()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ParameterDeclaration> getParameters();

} // DisplayInstruction
