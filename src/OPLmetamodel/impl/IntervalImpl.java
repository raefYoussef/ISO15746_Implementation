/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.Interval;
import OPLmetamodel.NumericType;
import OPLmetamodel.OPLmetamodelPackage;
import OPLmetamodel.RangeType;
import OPLmetamodel.StepFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.IntervalImpl#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link OPLmetamodel.impl.IntervalImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link OPLmetamodel.impl.IntervalImpl#getSize <em>Size</em>}</li>
 *   <li>{@link OPLmetamodel.impl.IntervalImpl#getIntensity <em>Intensity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervalImpl extends MinimalEObjectImpl.Container implements Interval {
	/**
	 * The default value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean isOptional = IS_OPTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected RangeType bounds;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected NumericType size;

	/**
	 * The cached value of the '{@link #getIntensity() <em>Intensity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntensity()
	 * @generated
	 * @ordered
	 */
	protected StepFunction intensity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOptional() {
		return isOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOptional(boolean newIsOptional) {
		boolean oldIsOptional = isOptional;
		isOptional = newIsOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.INTERVAL__IS_OPTIONAL, oldIsOptional, isOptional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType getBounds() {
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBounds(RangeType newBounds, NotificationChain msgs) {
		RangeType oldBounds = bounds;
		bounds = newBounds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.INTERVAL__BOUNDS, oldBounds, newBounds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBounds(RangeType newBounds) {
		if (newBounds != bounds) {
			NotificationChain msgs = null;
			if (bounds != null)
				msgs = ((InternalEObject)bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.INTERVAL__BOUNDS, null, msgs);
			if (newBounds != null)
				msgs = ((InternalEObject)newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.INTERVAL__BOUNDS, null, msgs);
			msgs = basicSetBounds(newBounds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.INTERVAL__BOUNDS, newBounds, newBounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(NumericType newSize, NotificationChain msgs) {
		NumericType oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.INTERVAL__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(NumericType newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.INTERVAL__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.INTERVAL__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.INTERVAL__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepFunction getIntensity() {
		return intensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntensity(StepFunction newIntensity, NotificationChain msgs) {
		StepFunction oldIntensity = intensity;
		intensity = newIntensity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.INTERVAL__INTENSITY, oldIntensity, newIntensity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntensity(StepFunction newIntensity) {
		if (newIntensity != intensity) {
			NotificationChain msgs = null;
			if (intensity != null)
				msgs = ((InternalEObject)intensity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.INTERVAL__INTENSITY, null, msgs);
			if (newIntensity != null)
				msgs = ((InternalEObject)newIntensity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.INTERVAL__INTENSITY, null, msgs);
			msgs = basicSetIntensity(newIntensity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.INTERVAL__INTENSITY, newIntensity, newIntensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.INTERVAL__BOUNDS:
				return basicSetBounds(null, msgs);
			case OPLmetamodelPackage.INTERVAL__SIZE:
				return basicSetSize(null, msgs);
			case OPLmetamodelPackage.INTERVAL__INTENSITY:
				return basicSetIntensity(null, msgs);
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
			case OPLmetamodelPackage.INTERVAL__IS_OPTIONAL:
				return isIsOptional();
			case OPLmetamodelPackage.INTERVAL__BOUNDS:
				return getBounds();
			case OPLmetamodelPackage.INTERVAL__SIZE:
				return getSize();
			case OPLmetamodelPackage.INTERVAL__INTENSITY:
				return getIntensity();
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
			case OPLmetamodelPackage.INTERVAL__IS_OPTIONAL:
				setIsOptional((Boolean)newValue);
				return;
			case OPLmetamodelPackage.INTERVAL__BOUNDS:
				setBounds((RangeType)newValue);
				return;
			case OPLmetamodelPackage.INTERVAL__SIZE:
				setSize((NumericType)newValue);
				return;
			case OPLmetamodelPackage.INTERVAL__INTENSITY:
				setIntensity((StepFunction)newValue);
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
			case OPLmetamodelPackage.INTERVAL__IS_OPTIONAL:
				setIsOptional(IS_OPTIONAL_EDEFAULT);
				return;
			case OPLmetamodelPackage.INTERVAL__BOUNDS:
				setBounds((RangeType)null);
				return;
			case OPLmetamodelPackage.INTERVAL__SIZE:
				setSize((NumericType)null);
				return;
			case OPLmetamodelPackage.INTERVAL__INTENSITY:
				setIntensity((StepFunction)null);
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
			case OPLmetamodelPackage.INTERVAL__IS_OPTIONAL:
				return isOptional != IS_OPTIONAL_EDEFAULT;
			case OPLmetamodelPackage.INTERVAL__BOUNDS:
				return bounds != null;
			case OPLmetamodelPackage.INTERVAL__SIZE:
				return size != null;
			case OPLmetamodelPackage.INTERVAL__INTENSITY:
				return intensity != null;
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
		result.append(" (isOptional: ");
		result.append(isOptional);
		result.append(')');
		return result.toString();
	}

} //IntervalImpl
