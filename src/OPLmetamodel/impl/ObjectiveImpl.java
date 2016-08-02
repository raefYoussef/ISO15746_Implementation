/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.Expression;
import OPLmetamodel.OPLmetamodelPackage;
import OPLmetamodel.Objective;
import OPLmetamodel.OptimizationMode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.ObjectiveImpl#getAction <em>Action</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ObjectiveImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ObjectiveImpl#isIsLinearRelaxation <em>Is Linear Relaxation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectiveImpl extends DeclarationImpl implements Objective {
	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final OptimizationMode ACTION_EDEFAULT = OptimizationMode.MINIMIZE;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected OptimizationMode action = ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * The default value of the '{@link #isIsLinearRelaxation() <em>Is Linear Relaxation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLinearRelaxation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LINEAR_RELAXATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLinearRelaxation() <em>Is Linear Relaxation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLinearRelaxation()
	 * @generated
	 * @ordered
	 */
	protected boolean isLinearRelaxation = IS_LINEAR_RELAXATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizationMode getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(OptimizationMode newAction) {
		OptimizationMode oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.OBJECTIVE__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.OBJECTIVE__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.OBJECTIVE__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.OBJECTIVE__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.OBJECTIVE__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLinearRelaxation() {
		return isLinearRelaxation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLinearRelaxation(boolean newIsLinearRelaxation) {
		boolean oldIsLinearRelaxation = isLinearRelaxation;
		isLinearRelaxation = newIsLinearRelaxation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.OBJECTIVE__IS_LINEAR_RELAXATION, oldIsLinearRelaxation, isLinearRelaxation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.OBJECTIVE__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case OPLmetamodelPackage.OBJECTIVE__ACTION:
				return getAction();
			case OPLmetamodelPackage.OBJECTIVE__EXPRESSION:
				return getExpression();
			case OPLmetamodelPackage.OBJECTIVE__IS_LINEAR_RELAXATION:
				return isIsLinearRelaxation();
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
			case OPLmetamodelPackage.OBJECTIVE__ACTION:
				setAction((OptimizationMode)newValue);
				return;
			case OPLmetamodelPackage.OBJECTIVE__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case OPLmetamodelPackage.OBJECTIVE__IS_LINEAR_RELAXATION:
				setIsLinearRelaxation((Boolean)newValue);
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
			case OPLmetamodelPackage.OBJECTIVE__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case OPLmetamodelPackage.OBJECTIVE__EXPRESSION:
				setExpression((Expression)null);
				return;
			case OPLmetamodelPackage.OBJECTIVE__IS_LINEAR_RELAXATION:
				setIsLinearRelaxation(IS_LINEAR_RELAXATION_EDEFAULT);
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
			case OPLmetamodelPackage.OBJECTIVE__ACTION:
				return action != ACTION_EDEFAULT;
			case OPLmetamodelPackage.OBJECTIVE__EXPRESSION:
				return expression != null;
			case OPLmetamodelPackage.OBJECTIVE__IS_LINEAR_RELAXATION:
				return isLinearRelaxation != IS_LINEAR_RELAXATION_EDEFAULT;
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
		result.append(" (action: ");
		result.append(action);
		result.append(", isLinearRelaxation: ");
		result.append(isLinearRelaxation);
		result.append(')');
		return result.toString();
	}

} //ObjectiveImpl
