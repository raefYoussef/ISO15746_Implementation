/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.ReadFile#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getReadFile()
 * @model
 * @generated
 */
public interface ReadFile extends DataInitMethods {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see OPLmetamodel.OPLmetamodelPackage#getReadFile_Path()
	 * @model required="true" derived="true" ordered="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link OPLmetamodel.ReadFile#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // ReadFile
