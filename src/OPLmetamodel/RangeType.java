/**
 */
package OPLmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.RangeType#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link OPLmetamodel.RangeType#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getRangeType()
 * @model abstract="true"
 * @generated
 */
public interface RangeType extends SetType {
	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(NumericType)
	 * @see OPLmetamodel.OPLmetamodelPackage#getRangeType_UpperBound()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NumericType getUpperBound();

	/**
	 * Sets the value of the '{@link OPLmetamodel.RangeType#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(NumericType value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(NumericType)
	 * @see OPLmetamodel.OPLmetamodelPackage#getRangeType_LowerBound()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NumericType getLowerBound();

	/**
	 * Sets the value of the '{@link OPLmetamodel.RangeType#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(NumericType value);

} // RangeType
