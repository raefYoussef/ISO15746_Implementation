/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.NumericExpression;
import OPLmetamodel.NumericType;
import OPLmetamodel.OPLmetamodelPackage;
import OPLmetamodel.RangeExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.RangeExpressionImpl#getLowerLimit <em>Lower Limit</em>}</li>
 *   <li>{@link OPLmetamodel.impl.RangeExpressionImpl#getUpperLimit <em>Upper Limit</em>}</li>
 *   <li>{@link OPLmetamodel.impl.RangeExpressionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeExpressionImpl extends NumericExpressionImpl implements RangeExpression {
	/**
	 * The cached value of the '{@link #getLowerLimit() <em>Lower Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected NumericExpression lowerLimit;

	/**
	 * The cached value of the '{@link #getUpperLimit() <em>Upper Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected NumericExpression upperLimit;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NumericType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.RANGE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericExpression getLowerLimit() {
		return lowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerLimit(NumericExpression newLowerLimit, NotificationChain msgs) {
		NumericExpression oldLowerLimit = lowerLimit;
		lowerLimit = newLowerLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.RANGE_EXPRESSION__LOWER_LIMIT, oldLowerLimit, newLowerLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerLimit(NumericExpression newLowerLimit) {
		if (newLowerLimit != lowerLimit) {
			NotificationChain msgs = null;
			if (lowerLimit != null)
				msgs = ((InternalEObject)lowerLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.RANGE_EXPRESSION__LOWER_LIMIT, null, msgs);
			if (newLowerLimit != null)
				msgs = ((InternalEObject)newLowerLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.RANGE_EXPRESSION__LOWER_LIMIT, null, msgs);
			msgs = basicSetLowerLimit(newLowerLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.RANGE_EXPRESSION__LOWER_LIMIT, newLowerLimit, newLowerLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericExpression getUpperLimit() {
		return upperLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperLimit(NumericExpression newUpperLimit, NotificationChain msgs) {
		NumericExpression oldUpperLimit = upperLimit;
		upperLimit = newUpperLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.RANGE_EXPRESSION__UPPER_LIMIT, oldUpperLimit, newUpperLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperLimit(NumericExpression newUpperLimit) {
		if (newUpperLimit != upperLimit) {
			NotificationChain msgs = null;
			if (upperLimit != null)
				msgs = ((InternalEObject)upperLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.RANGE_EXPRESSION__UPPER_LIMIT, null, msgs);
			if (newUpperLimit != null)
				msgs = ((InternalEObject)newUpperLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.RANGE_EXPRESSION__UPPER_LIMIT, null, msgs);
			msgs = basicSetUpperLimit(newUpperLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.RANGE_EXPRESSION__UPPER_LIMIT, newUpperLimit, newUpperLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(NumericType newType, NotificationChain msgs) {
		NumericType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.RANGE_EXPRESSION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(NumericType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.RANGE_EXPRESSION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.RANGE_EXPRESSION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.RANGE_EXPRESSION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.RANGE_EXPRESSION__LOWER_LIMIT:
				return basicSetLowerLimit(null, msgs);
			case OPLmetamodelPackage.RANGE_EXPRESSION__UPPER_LIMIT:
				return basicSetUpperLimit(null, msgs);
			case OPLmetamodelPackage.RANGE_EXPRESSION__TYPE:
				return basicSetType(null, msgs);
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
			case OPLmetamodelPackage.RANGE_EXPRESSION__LOWER_LIMIT:
				return getLowerLimit();
			case OPLmetamodelPackage.RANGE_EXPRESSION__UPPER_LIMIT:
				return getUpperLimit();
			case OPLmetamodelPackage.RANGE_EXPRESSION__TYPE:
				return getType();
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
			case OPLmetamodelPackage.RANGE_EXPRESSION__LOWER_LIMIT:
				setLowerLimit((NumericExpression)newValue);
				return;
			case OPLmetamodelPackage.RANGE_EXPRESSION__UPPER_LIMIT:
				setUpperLimit((NumericExpression)newValue);
				return;
			case OPLmetamodelPackage.RANGE_EXPRESSION__TYPE:
				setType((NumericType)newValue);
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
			case OPLmetamodelPackage.RANGE_EXPRESSION__LOWER_LIMIT:
				setLowerLimit((NumericExpression)null);
				return;
			case OPLmetamodelPackage.RANGE_EXPRESSION__UPPER_LIMIT:
				setUpperLimit((NumericExpression)null);
				return;
			case OPLmetamodelPackage.RANGE_EXPRESSION__TYPE:
				setType((NumericType)null);
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
			case OPLmetamodelPackage.RANGE_EXPRESSION__LOWER_LIMIT:
				return lowerLimit != null;
			case OPLmetamodelPackage.RANGE_EXPRESSION__UPPER_LIMIT:
				return upperLimit != null;
			case OPLmetamodelPackage.RANGE_EXPRESSION__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //RangeExpressionImpl
