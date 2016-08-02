/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.Sequence#getIntervals <em>Intervals</em>}</li>
 *   <li>{@link OPLmetamodel.Sequence#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Intervals</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.Interval}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervals</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getSequence_Intervals()
	 * @model containment="true" lower="2" ordered="false"
	 * @generated
	 */
	EList<Interval> getIntervals();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference.
	 * @see #setTypes(DefinedType)
	 * @see OPLmetamodel.OPLmetamodelPackage#getSequence_Types()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	DefinedType getTypes();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Sequence#getTypes <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' containment reference.
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(DefinedType value);

} // Sequence
