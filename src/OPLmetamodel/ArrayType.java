/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.ArrayType#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link OPLmetamodel.ArrayType#getSubscripts <em>Subscripts</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends DefinedType {
	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' containment reference.
	 * @see #setBaseType(AbstractType)
	 * @see OPLmetamodel.OPLmetamodelPackage#getArrayType_BaseType()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	AbstractType getBaseType();

	/**
	 * Sets the value of the '{@link OPLmetamodel.ArrayType#getBaseType <em>Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' containment reference.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(AbstractType value);

	/**
	 * Returns the value of the '<em><b>Subscripts</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.DataRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscripts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscripts</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getArrayType_Subscripts()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<DataRef> getSubscripts();

} // ArrayType
