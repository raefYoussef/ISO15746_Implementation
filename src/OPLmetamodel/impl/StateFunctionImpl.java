/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.OPLmetamodelPackage;
import OPLmetamodel.SetType;
import OPLmetamodel.StateFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.StateFunctionImpl#getTransitionMatrix <em>Transition Matrix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateFunctionImpl extends FunctionImpl implements StateFunction {
	/**
	 * The cached value of the '{@link #getTransitionMatrix() <em>Transition Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionMatrix()
	 * @generated
	 * @ordered
	 */
	protected SetType transitionMatrix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.STATE_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetType getTransitionMatrix() {
		return transitionMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitionMatrix(SetType newTransitionMatrix, NotificationChain msgs) {
		SetType oldTransitionMatrix = transitionMatrix;
		transitionMatrix = newTransitionMatrix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.STATE_FUNCTION__TRANSITION_MATRIX, oldTransitionMatrix, newTransitionMatrix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionMatrix(SetType newTransitionMatrix) {
		if (newTransitionMatrix != transitionMatrix) {
			NotificationChain msgs = null;
			if (transitionMatrix != null)
				msgs = ((InternalEObject)transitionMatrix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.STATE_FUNCTION__TRANSITION_MATRIX, null, msgs);
			if (newTransitionMatrix != null)
				msgs = ((InternalEObject)newTransitionMatrix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.STATE_FUNCTION__TRANSITION_MATRIX, null, msgs);
			msgs = basicSetTransitionMatrix(newTransitionMatrix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.STATE_FUNCTION__TRANSITION_MATRIX, newTransitionMatrix, newTransitionMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.STATE_FUNCTION__TRANSITION_MATRIX:
				return basicSetTransitionMatrix(null, msgs);
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
			case OPLmetamodelPackage.STATE_FUNCTION__TRANSITION_MATRIX:
				return getTransitionMatrix();
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
			case OPLmetamodelPackage.STATE_FUNCTION__TRANSITION_MATRIX:
				setTransitionMatrix((SetType)newValue);
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
			case OPLmetamodelPackage.STATE_FUNCTION__TRANSITION_MATRIX:
				setTransitionMatrix((SetType)null);
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
			case OPLmetamodelPackage.STATE_FUNCTION__TRANSITION_MATRIX:
				return transitionMatrix != null;
		}
		return super.eIsSet(featureID);
	}

} //StateFunctionImpl
