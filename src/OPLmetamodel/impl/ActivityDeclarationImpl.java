/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.ActivityDeclaration;
import OPLmetamodel.OPLmetamodelPackage;

import java.text.SimpleDateFormat;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.ActivityDeclarationImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ActivityDeclarationImpl#getEarliestStartTime <em>Earliest Start Time</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ActivityDeclarationImpl#getLatestEndTime <em>Latest End Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityDeclarationImpl extends DeclarationImpl implements ActivityDeclaration {
	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected OPLmetamodel.Number duration;

	/**
	 * The default value of the '{@link #getEarliestStartTime() <em>Earliest Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final SimpleDateFormat EARLIEST_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEarliestStartTime() <em>Earliest Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestStartTime()
	 * @generated
	 * @ordered
	 */
	protected SimpleDateFormat earliestStartTime = EARLIEST_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatestEndTime() <em>Latest End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final SimpleDateFormat LATEST_END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatestEndTime() <em>Latest End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestEndTime()
	 * @generated
	 * @ordered
	 */
	protected SimpleDateFormat latestEndTime = LATEST_END_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.ACTIVITY_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPLmetamodel.Number getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(OPLmetamodel.Number newDuration, NotificationChain msgs) {
		OPLmetamodel.Number oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.ACTIVITY_DECLARATION__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(OPLmetamodel.Number newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.ACTIVITY_DECLARATION__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.ACTIVITY_DECLARATION__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.ACTIVITY_DECLARATION__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDateFormat getEarliestStartTime() {
		return earliestStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarliestStartTime(SimpleDateFormat newEarliestStartTime) {
		SimpleDateFormat oldEarliestStartTime = earliestStartTime;
		earliestStartTime = newEarliestStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.ACTIVITY_DECLARATION__EARLIEST_START_TIME, oldEarliestStartTime, earliestStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDateFormat getLatestEndTime() {
		return latestEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatestEndTime(SimpleDateFormat newLatestEndTime) {
		SimpleDateFormat oldLatestEndTime = latestEndTime;
		latestEndTime = newLatestEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.ACTIVITY_DECLARATION__LATEST_END_TIME, oldLatestEndTime, latestEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.ACTIVITY_DECLARATION__DURATION:
				return basicSetDuration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OPLmetamodelPackage.ACTIVITY_DECLARATION__DURATION:
				return getDuration();
			case OPLmetamodelPackage.ACTIVITY_DECLARATION__EARLIEST_START_TIME:
				return getEarliestStartTime();
			case OPLmetamodelPackage.ACTIVITY_DECLARATION__LATEST_END_TIME:
				return getLatestEndTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OPLmetamodelPackage.ACTIVITY_DECLARATION__DURATION:
				setDuration((OPLmetamodel.Number)newValue);
				return;
			case OPLmetamodelPackage.ACTIVITY_DECLARATION__EARLIEST_START_TIME:
				setEarliestStartTime((SimpleDateFormat)newValue);
				return;
			case OPLmetamodelPackage.ACTIVITY_DECLARATION__LATEST_END_TIME:
				setLatestEndTime((SimpleDateFormat)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OPLmetamodelPackage.ACTIVITY_DECLARATION__DURATION:
				setDuration((OPLmetamodel.Number)null);
				return;
			case OPLmetamodelPackage.ACTIVITY_DECLARATION__EARLIEST_START_TIME:
				setEarliestStartTime(EARLIEST_START_TIME_EDEFAULT);
				return;
			case OPLmetamodelPackage.ACTIVITY_DECLARATION__LATEST_END_TIME:
				setLatestEndTime(LATEST_END_TIME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OPLmetamodelPackage.ACTIVITY_DECLARATION__DURATION:
				return duration != null;
			case OPLmetamodelPackage.ACTIVITY_DECLARATION__EARLIEST_START_TIME:
				return EARLIEST_START_TIME_EDEFAULT == null ? earliestStartTime != null : !EARLIEST_START_TIME_EDEFAULT.equals(earliestStartTime);
			case OPLmetamodelPackage.ACTIVITY_DECLARATION__LATEST_END_TIME:
				return LATEST_END_TIME_EDEFAULT == null ? latestEndTime != null : !LATEST_END_TIME_EDEFAULT.equals(latestEndTime);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (earliestStartTime: ");
		result.append(earliestStartTime);
		result.append(", latestEndTime: ");
		result.append(latestEndTime);
		result.append(')');
		return result.toString();
	}

} //ActivityDeclarationImpl
