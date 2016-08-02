/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.RecordValue#getFieldPairs <em>Field Pairs</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getRecordValue()
 * @model
 * @generated
 */
public interface RecordValue extends Expression {
	/**
	 * Returns the value of the '<em><b>Field Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.IndexValuePair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Pairs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Pairs</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getRecordValue_FieldPairs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<IndexValuePair> getFieldPairs();

} // RecordValue
