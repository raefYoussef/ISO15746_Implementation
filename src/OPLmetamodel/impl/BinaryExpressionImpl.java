/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.AbstractBinaryOperator;
import OPLmetamodel.BinaryExpression;
import OPLmetamodel.Expression;
import OPLmetamodel.OPLmetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.BinaryExpressionImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link OPLmetamodel.impl.BinaryExpressionImpl#getRhs <em>Rhs</em>}</li>
 *   <li>{@link OPLmetamodel.impl.BinaryExpressionImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryExpressionImpl extends ExpressionImpl implements BinaryExpression {
	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected Expression lhs;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected Expression rhs;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected AbstractBinaryOperator op;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(Expression newLhs, NotificationChain msgs) {
		Expression oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.BINARY_EXPRESSION__LHS, oldLhs, newLhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(Expression newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.BINARY_EXPRESSION__LHS, null, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.BINARY_EXPRESSION__LHS, null, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.BINARY_EXPRESSION__LHS, newLhs, newLhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(Expression newRhs, NotificationChain msgs) {
		Expression oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.BINARY_EXPRESSION__RHS, oldRhs, newRhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(Expression newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.BINARY_EXPRESSION__RHS, null, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.BINARY_EXPRESSION__RHS, null, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.BINARY_EXPRESSION__RHS, newRhs, newRhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBinaryOperator getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp(AbstractBinaryOperator newOp, NotificationChain msgs) {
		AbstractBinaryOperator oldOp = op;
		op = newOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.BINARY_EXPRESSION__OP, oldOp, newOp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(AbstractBinaryOperator newOp) {
		if (newOp != op) {
			NotificationChain msgs = null;
			if (op != null)
				msgs = ((InternalEObject)op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.BINARY_EXPRESSION__OP, null, msgs);
			if (newOp != null)
				msgs = ((InternalEObject)newOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.BINARY_EXPRESSION__OP, null, msgs);
			msgs = basicSetOp(newOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.BINARY_EXPRESSION__OP, newOp, newOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.BINARY_EXPRESSION__LHS:
				return basicSetLhs(null, msgs);
			case OPLmetamodelPackage.BINARY_EXPRESSION__RHS:
				return basicSetRhs(null, msgs);
			case OPLmetamodelPackage.BINARY_EXPRESSION__OP:
				return basicSetOp(null, msgs);
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
			case OPLmetamodelPackage.BINARY_EXPRESSION__LHS:
				return getLhs();
			case OPLmetamodelPackage.BINARY_EXPRESSION__RHS:
				return getRhs();
			case OPLmetamodelPackage.BINARY_EXPRESSION__OP:
				return getOp();
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
			case OPLmetamodelPackage.BINARY_EXPRESSION__LHS:
				setLhs((Expression)newValue);
				return;
			case OPLmetamodelPackage.BINARY_EXPRESSION__RHS:
				setRhs((Expression)newValue);
				return;
			case OPLmetamodelPackage.BINARY_EXPRESSION__OP:
				setOp((AbstractBinaryOperator)newValue);
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
			case OPLmetamodelPackage.BINARY_EXPRESSION__LHS:
				setLhs((Expression)null);
				return;
			case OPLmetamodelPackage.BINARY_EXPRESSION__RHS:
				setRhs((Expression)null);
				return;
			case OPLmetamodelPackage.BINARY_EXPRESSION__OP:
				setOp((AbstractBinaryOperator)null);
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
			case OPLmetamodelPackage.BINARY_EXPRESSION__LHS:
				return lhs != null;
			case OPLmetamodelPackage.BINARY_EXPRESSION__RHS:
				return rhs != null;
			case OPLmetamodelPackage.BINARY_EXPRESSION__OP:
				return op != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryExpressionImpl
