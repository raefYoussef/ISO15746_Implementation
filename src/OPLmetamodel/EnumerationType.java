/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.EnumerationType#getRedefinedBaseType <em>Redefined Base Type</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getEnumerationType()
 * @model
 * @generated
 */
public interface EnumerationType extends SetType {
	/**
	 * Returns the value of the '<em><b>Redefined Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Base Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Base Type</em>' containment reference.
	 * @see #setRedefinedBaseType(EnumLiteral)
	 * @see OPLmetamodel.OPLmetamodelPackage#getEnumerationType_RedefinedBaseType()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="https://oplmetamodel.com/notes body='The attribut redefinedBaseType is used instead of baseType because EMF doesn\'t allow the redefining of inherited attributes.'"
	 * @generated
	 */
	EnumLiteral getRedefinedBaseType();

	/**
	 * Sets the value of the '{@link OPLmetamodel.EnumerationType#getRedefinedBaseType <em>Redefined Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Base Type</em>' containment reference.
	 * @see #getRedefinedBaseType()
	 * @generated
	 */
	void setRedefinedBaseType(EnumLiteral value);

} // EnumerationType
