/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.Record#getName <em>Name</em>}</li>
 *   <li>{@link OPLmetamodel.Record#getFields <em>Fields</em>}</li>
 *   <li>{@link OPLmetamodel.Record#isIsTuple <em>Is Tuple</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getRecord()
 * @model
 * @generated
 */
public interface Record extends ParameterDomain, DefinedType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see OPLmetamodel.OPLmetamodelPackage#getRecord_Name()
	 * @model dataType="OPLmetamodel.Identifier" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Record#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.RecordField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getRecord_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<RecordField> getFields();

	/**
	 * Returns the value of the '<em><b>Is Tuple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tuple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tuple</em>' attribute.
	 * @see #setIsTuple(boolean)
	 * @see OPLmetamodel.OPLmetamodelPackage#getRecord_IsTuple()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsTuple();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Record#isIsTuple <em>Is Tuple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tuple</em>' attribute.
	 * @see #isIsTuple()
	 * @generated
	 */
	void setIsTuple(boolean value);

} // Record
