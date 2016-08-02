/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.DataObject#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getDataObject()
 * @model annotation="https://oplmetamodel.com/documentation body='A DataObject is data a metalevel below the OPL metamodel. It is an instance of an AbstractType. The value of the DataObject must conform to the type declared in the DataDeclaration. '"
 * @generated
 */
public interface DataObject extends Initialization {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see OPLmetamodel.OPLmetamodelPackage#getDataObject_Body()
	 * @model required="true"
	 *        annotation="https://oplmetamodel.com/notes body='Added to metamodel to provide body to the data object'"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link OPLmetamodel.DataObject#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // DataObject
