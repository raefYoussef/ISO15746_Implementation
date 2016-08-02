/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.QueryUser#getAsk <em>Ask</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getQueryUser()
 * @model
 * @generated
 */
public interface QueryUser extends DataInitMethods {
	/**
	 * Returns the value of the '<em><b>Ask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ask</em>' attribute.
	 * @see #setAsk(String)
	 * @see OPLmetamodel.OPLmetamodelPackage#getQueryUser_Ask()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getAsk();

	/**
	 * Sets the value of the '{@link OPLmetamodel.QueryUser#getAsk <em>Ask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ask</em>' attribute.
	 * @see #getAsk()
	 * @generated
	 */
	void setAsk(String value);

} // QueryUser
