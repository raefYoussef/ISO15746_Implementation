/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.CollectionExpression#isIsUnique <em>Is Unique</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getCollectionExpression()
 * @model
 * @generated
 */
public interface CollectionExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see OPLmetamodel.OPLmetamodelPackage#getCollectionExpression_IsUnique()
	 * @model default="false" required="true" ordered="false"
	 *        annotation="https://oplmetamodel.com/documentation body='isUnique determines whether the collection is a Set (isUnique = true) or an Array (isUnique = false).'"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link OPLmetamodel.CollectionExpression#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

} // CollectionExpression
