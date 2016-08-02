/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.SetType#getName <em>Name</em>}</li>
 *   <li>{@link OPLmetamodel.SetType#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link OPLmetamodel.SetType#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getSetType()
 * @model
 * @generated
 */
public interface SetType extends DefinedType, ParameterDomain {
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
	 * @see OPLmetamodel.OPLmetamodelPackage#getSetType_Name()
	 * @model dataType="OPLmetamodel.Identifier" ordered="false"
	 *        annotation="https://oplmetamodel.com/notes body='So as to enable definition of anonymous types, .name is optional in all cases but EnumerationType (OCL or redefinition?)'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link OPLmetamodel.SetType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see OPLmetamodel.OPLmetamodelPackage#getSetType_BaseType()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	AbstractType getBaseType();

	/**
	 * Sets the value of the '{@link OPLmetamodel.SetType#getBaseType <em>Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' containment reference.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(AbstractType value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getSetType_Elements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Entity> getElements();

} // SetType
