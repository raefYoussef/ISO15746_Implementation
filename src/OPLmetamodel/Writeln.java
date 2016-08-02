/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Writeln</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.Writeln#getString <em>String</em>}</li>
 *   <li>{@link OPLmetamodel.Writeln#getArg <em>Arg</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getWriteln()
 * @model
 * @generated
 */
public interface Writeln extends ScriptStatement {
	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(String)
	 * @see OPLmetamodel.OPLmetamodelPackage#getWriteln_String()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getString();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Writeln#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
	void setString(String value);

	/**
	 * Returns the value of the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' attribute.
	 * @see #setArg(String)
	 * @see OPLmetamodel.OPLmetamodelPackage#getWriteln_Arg()
	 * @model dataType="OPLmetamodel.Identifier" required="true" ordered="false"
	 * @generated
	 */
	String getArg();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Writeln#getArg <em>Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arg</em>' attribute.
	 * @see #getArg()
	 * @generated
	 */
	void setArg(String value);

} // Writeln
