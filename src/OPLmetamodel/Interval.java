/**
 */
package OPLmetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.Interval#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link OPLmetamodel.Interval#getBounds <em>Bounds</em>}</li>
 *   <li>{@link OPLmetamodel.Interval#getSize <em>Size</em>}</li>
 *   <li>{@link OPLmetamodel.Interval#getIntensity <em>Intensity</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getInterval()
 * @model
 * @generated
 */
public interface Interval extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Optional</em>' attribute.
	 * @see #setIsOptional(boolean)
	 * @see OPLmetamodel.OPLmetamodelPackage#getInterval_IsOptional()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsOptional();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Interval#isIsOptional <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Optional</em>' attribute.
	 * @see #isIsOptional()
	 * @generated
	 */
	void setIsOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(RangeType)
	 * @see OPLmetamodel.OPLmetamodelPackage#getInterval_Bounds()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RangeType getBounds();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Interval#getBounds <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(RangeType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(NumericType)
	 * @see OPLmetamodel.OPLmetamodelPackage#getInterval_Size()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	NumericType getSize();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Interval#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(NumericType value);

	/**
	 * Returns the value of the '<em><b>Intensity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intensity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intensity</em>' containment reference.
	 * @see #setIntensity(StepFunction)
	 * @see OPLmetamodel.OPLmetamodelPackage#getInterval_Intensity()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StepFunction getIntensity();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Interval#getIntensity <em>Intensity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intensity</em>' containment reference.
	 * @see #getIntensity()
	 * @generated
	 */
	void setIntensity(StepFunction value);

} // Interval
