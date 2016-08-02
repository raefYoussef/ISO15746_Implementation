/**
 */
package OPLmetamodel;

import java.text.SimpleDateFormat;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.ActivityDeclaration#getDuration <em>Duration</em>}</li>
 *   <li>{@link OPLmetamodel.ActivityDeclaration#getEarliestStartTime <em>Earliest Start Time</em>}</li>
 *   <li>{@link OPLmetamodel.ActivityDeclaration#getLatestEndTime <em>Latest End Time</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getActivityDeclaration()
 * @model annotation="https://oplmetamodel.com/documentation body='a unit of work that is constrained to occur within the bounds defined'"
 * @generated
 */
public interface ActivityDeclaration extends Declaration {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(OPLmetamodel.Number)
	 * @see OPLmetamodel.OPLmetamodelPackage#getActivityDeclaration_Duration()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="https://oplmetamodel.com/documentation body='a quantity of time required to perform the activity associated with this declaration'"
	 * @generated
	 */
	OPLmetamodel.Number getDuration();

	/**
	 * Sets the value of the '{@link OPLmetamodel.ActivityDeclaration#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(OPLmetamodel.Number value);

	/**
	 * Returns the value of the '<em><b>Earliest Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Earliest Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Earliest Start Time</em>' attribute.
	 * @see #setEarliestStartTime(SimpleDateFormat)
	 * @see OPLmetamodel.OPLmetamodelPackage#getActivityDeclaration_EarliestStartTime()
	 * @model dataType="OPLmetamodel.Timepoint"
	 * @generated
	 */
	SimpleDateFormat getEarliestStartTime();

	/**
	 * Sets the value of the '{@link OPLmetamodel.ActivityDeclaration#getEarliestStartTime <em>Earliest Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earliest Start Time</em>' attribute.
	 * @see #getEarliestStartTime()
	 * @generated
	 */
	void setEarliestStartTime(SimpleDateFormat value);

	/**
	 * Returns the value of the '<em><b>Latest End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latest End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest End Time</em>' attribute.
	 * @see #setLatestEndTime(SimpleDateFormat)
	 * @see OPLmetamodel.OPLmetamodelPackage#getActivityDeclaration_LatestEndTime()
	 * @model dataType="OPLmetamodel.Timepoint"
	 * @generated
	 */
	SimpleDateFormat getLatestEndTime();

	/**
	 * Sets the value of the '{@link OPLmetamodel.ActivityDeclaration#getLatestEndTime <em>Latest End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest End Time</em>' attribute.
	 * @see #getLatestEndTime()
	 * @generated
	 */
	void setLatestEndTime(SimpleDateFormat value);

} // ActivityDeclaration
