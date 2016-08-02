/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.Script#getId <em>Id</em>}</li>
 *   <li>{@link OPLmetamodel.Script#isIsMain <em>Is Main</em>}</li>
 *   <li>{@link OPLmetamodel.Script#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends Declaration {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(Reference)
	 * @see OPLmetamodel.OPLmetamodelPackage#getScript_Id()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Reference getId();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Script#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(Reference value);

	/**
	 * Returns the value of the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Main</em>' attribute.
	 * @see #setIsMain(boolean)
	 * @see OPLmetamodel.OPLmetamodelPackage#getScript_IsMain()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsMain();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Script#isIsMain <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Main</em>' attribute.
	 * @see #isIsMain()
	 * @generated
	 */
	void setIsMain(boolean value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.ScriptStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getScript_Statements()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ScriptStatement> getStatements();

} // Script
