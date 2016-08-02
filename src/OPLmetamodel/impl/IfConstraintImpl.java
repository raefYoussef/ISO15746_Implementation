/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.BooleanExpression;
import OPLmetamodel.Constraint;
import OPLmetamodel.IfConstraint;
import OPLmetamodel.OPLmetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.IfConstraintImpl#getTest <em>Test</em>}</li>
 *   <li>{@link OPLmetamodel.impl.IfConstraintImpl#getThen <em>Then</em>}</li>
 *   <li>{@link OPLmetamodel.impl.IfConstraintImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfConstraintImpl extends ConstraintImpl implements IfConstraint {
	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression test;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected Constraint then;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected Constraint else_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.IF_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression getTest() {
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTest(BooleanExpression newTest, NotificationChain msgs) {
		BooleanExpression oldTest = test;
		test = newTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.IF_CONSTRAINT__TEST, oldTest, newTest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest(BooleanExpression newTest) {
		if (newTest != test) {
			NotificationChain msgs = null;
			if (test != null)
				msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.IF_CONSTRAINT__TEST, null, msgs);
			if (newTest != null)
				msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.IF_CONSTRAINT__TEST, null, msgs);
			msgs = basicSetTest(newTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.IF_CONSTRAINT__TEST, newTest, newTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getThen() {
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThen(Constraint newThen, NotificationChain msgs) {
		Constraint oldThen = then;
		then = newThen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.IF_CONSTRAINT__THEN, oldThen, newThen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThen(Constraint newThen) {
		if (newThen != then) {
			NotificationChain msgs = null;
			if (then != null)
				msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.IF_CONSTRAINT__THEN, null, msgs);
			if (newThen != null)
				msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.IF_CONSTRAINT__THEN, null, msgs);
			msgs = basicSetThen(newThen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.IF_CONSTRAINT__THEN, newThen, newThen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(Constraint newElse, NotificationChain msgs) {
		Constraint oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.IF_CONSTRAINT__ELSE, oldElse, newElse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(Constraint newElse) {
		if (newElse != else_) {
			NotificationChain msgs = null;
			if (else_ != null)
				msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.IF_CONSTRAINT__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.IF_CONSTRAINT__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.IF_CONSTRAINT__ELSE, newElse, newElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.IF_CONSTRAINT__TEST:
				return basicSetTest(null, msgs);
			case OPLmetamodelPackage.IF_CONSTRAINT__THEN:
				return basicSetThen(null, msgs);
			case OPLmetamodelPackage.IF_CONSTRAINT__ELSE:
				return basicSetElse(null, msgs);
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
			case OPLmetamodelPackage.IF_CONSTRAINT__TEST:
				return getTest();
			case OPLmetamodelPackage.IF_CONSTRAINT__THEN:
				return getThen();
			case OPLmetamodelPackage.IF_CONSTRAINT__ELSE:
				return getElse();
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
			case OPLmetamodelPackage.IF_CONSTRAINT__TEST:
				setTest((BooleanExpression)newValue);
				return;
			case OPLmetamodelPackage.IF_CONSTRAINT__THEN:
				setThen((Constraint)newValue);
				return;
			case OPLmetamodelPackage.IF_CONSTRAINT__ELSE:
				setElse((Constraint)newValue);
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
			case OPLmetamodelPackage.IF_CONSTRAINT__TEST:
				setTest((BooleanExpression)null);
				return;
			case OPLmetamodelPackage.IF_CONSTRAINT__THEN:
				setThen((Constraint)null);
				return;
			case OPLmetamodelPackage.IF_CONSTRAINT__ELSE:
				setElse((Constraint)null);
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
			case OPLmetamodelPackage.IF_CONSTRAINT__TEST:
				return test != null;
			case OPLmetamodelPackage.IF_CONSTRAINT__THEN:
				return then != null;
			case OPLmetamodelPackage.IF_CONSTRAINT__ELSE:
				return else_ != null;
		}
		return super.eIsSet(featureID);
	}

} //IfConstraintImpl
