/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.AbstractType;
import OPLmetamodel.DataDeclaration;
import OPLmetamodel.DataRef;
import OPLmetamodel.Expression;
import OPLmetamodel.Initialization;
import OPLmetamodel.OPLmetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.DataDeclarationImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link OPLmetamodel.impl.DataDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link OPLmetamodel.impl.DataDeclarationImpl#isIsDecisionVar <em>Is Decision Var</em>}</li>
 *   <li>{@link OPLmetamodel.impl.DataDeclarationImpl#isIsDecisionExpr <em>Is Decision Expr</em>}</li>
 *   <li>{@link OPLmetamodel.impl.DataDeclarationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link OPLmetamodel.impl.DataDeclarationImpl#getValueConstraint <em>Value Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataDeclarationImpl extends DeclarationImpl implements DataDeclaration {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected DataRef variable;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AbstractType type;

	/**
	 * The default value of the '{@link #isIsDecisionVar() <em>Is Decision Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDecisionVar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DECISION_VAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDecisionVar() <em>Is Decision Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDecisionVar()
	 * @generated
	 * @ordered
	 */
	protected boolean isDecisionVar = IS_DECISION_VAR_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDecisionExpr() <em>Is Decision Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDecisionExpr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DECISION_EXPR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDecisionExpr() <em>Is Decision Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDecisionExpr()
	 * @generated
	 * @ordered
	 */
	protected boolean isDecisionExpr = IS_DECISION_EXPR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Initialization value;

	/**
	 * The cached value of the '{@link #getValueConstraint() <em>Value Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueConstraint()
	 * @generated
	 * @ordered
	 */
	protected Expression valueConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.DATA_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRef getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(DataRef newVariable, NotificationChain msgs) {
		DataRef oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.DATA_DECLARATION__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(DataRef newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.DATA_DECLARATION__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.DATA_DECLARATION__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.DATA_DECLARATION__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(AbstractType newType, NotificationChain msgs) {
		AbstractType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.DATA_DECLARATION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AbstractType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.DATA_DECLARATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.DATA_DECLARATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.DATA_DECLARATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDecisionVar() {
		return isDecisionVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDecisionVar(boolean newIsDecisionVar) {
		boolean oldIsDecisionVar = isDecisionVar;
		isDecisionVar = newIsDecisionVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.DATA_DECLARATION__IS_DECISION_VAR, oldIsDecisionVar, isDecisionVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDecisionExpr() {
		return isDecisionExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDecisionExpr(boolean newIsDecisionExpr) {
		boolean oldIsDecisionExpr = isDecisionExpr;
		isDecisionExpr = newIsDecisionExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.DATA_DECLARATION__IS_DECISION_EXPR, oldIsDecisionExpr, isDecisionExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initialization getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Initialization newValue, NotificationChain msgs) {
		Initialization oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.DATA_DECLARATION__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Initialization newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.DATA_DECLARATION__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.DATA_DECLARATION__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.DATA_DECLARATION__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValueConstraint() {
		return valueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueConstraint(Expression newValueConstraint, NotificationChain msgs) {
		Expression oldValueConstraint = valueConstraint;
		valueConstraint = newValueConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.DATA_DECLARATION__VALUE_CONSTRAINT, oldValueConstraint, newValueConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueConstraint(Expression newValueConstraint) {
		if (newValueConstraint != valueConstraint) {
			NotificationChain msgs = null;
			if (valueConstraint != null)
				msgs = ((InternalEObject)valueConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.DATA_DECLARATION__VALUE_CONSTRAINT, null, msgs);
			if (newValueConstraint != null)
				msgs = ((InternalEObject)newValueConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.DATA_DECLARATION__VALUE_CONSTRAINT, null, msgs);
			msgs = basicSetValueConstraint(newValueConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.DATA_DECLARATION__VALUE_CONSTRAINT, newValueConstraint, newValueConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.DATA_DECLARATION__VARIABLE:
				return basicSetVariable(null, msgs);
			case OPLmetamodelPackage.DATA_DECLARATION__TYPE:
				return basicSetType(null, msgs);
			case OPLmetamodelPackage.DATA_DECLARATION__VALUE:
				return basicSetValue(null, msgs);
			case OPLmetamodelPackage.DATA_DECLARATION__VALUE_CONSTRAINT:
				return basicSetValueConstraint(null, msgs);
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
			case OPLmetamodelPackage.DATA_DECLARATION__VARIABLE:
				return getVariable();
			case OPLmetamodelPackage.DATA_DECLARATION__TYPE:
				return getType();
			case OPLmetamodelPackage.DATA_DECLARATION__IS_DECISION_VAR:
				return isIsDecisionVar();
			case OPLmetamodelPackage.DATA_DECLARATION__IS_DECISION_EXPR:
				return isIsDecisionExpr();
			case OPLmetamodelPackage.DATA_DECLARATION__VALUE:
				return getValue();
			case OPLmetamodelPackage.DATA_DECLARATION__VALUE_CONSTRAINT:
				return getValueConstraint();
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
			case OPLmetamodelPackage.DATA_DECLARATION__VARIABLE:
				setVariable((DataRef)newValue);
				return;
			case OPLmetamodelPackage.DATA_DECLARATION__TYPE:
				setType((AbstractType)newValue);
				return;
			case OPLmetamodelPackage.DATA_DECLARATION__IS_DECISION_VAR:
				setIsDecisionVar((Boolean)newValue);
				return;
			case OPLmetamodelPackage.DATA_DECLARATION__IS_DECISION_EXPR:
				setIsDecisionExpr((Boolean)newValue);
				return;
			case OPLmetamodelPackage.DATA_DECLARATION__VALUE:
				setValue((Initialization)newValue);
				return;
			case OPLmetamodelPackage.DATA_DECLARATION__VALUE_CONSTRAINT:
				setValueConstraint((Expression)newValue);
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
			case OPLmetamodelPackage.DATA_DECLARATION__VARIABLE:
				setVariable((DataRef)null);
				return;
			case OPLmetamodelPackage.DATA_DECLARATION__TYPE:
				setType((AbstractType)null);
				return;
			case OPLmetamodelPackage.DATA_DECLARATION__IS_DECISION_VAR:
				setIsDecisionVar(IS_DECISION_VAR_EDEFAULT);
				return;
			case OPLmetamodelPackage.DATA_DECLARATION__IS_DECISION_EXPR:
				setIsDecisionExpr(IS_DECISION_EXPR_EDEFAULT);
				return;
			case OPLmetamodelPackage.DATA_DECLARATION__VALUE:
				setValue((Initialization)null);
				return;
			case OPLmetamodelPackage.DATA_DECLARATION__VALUE_CONSTRAINT:
				setValueConstraint((Expression)null);
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
			case OPLmetamodelPackage.DATA_DECLARATION__VARIABLE:
				return variable != null;
			case OPLmetamodelPackage.DATA_DECLARATION__TYPE:
				return type != null;
			case OPLmetamodelPackage.DATA_DECLARATION__IS_DECISION_VAR:
				return isDecisionVar != IS_DECISION_VAR_EDEFAULT;
			case OPLmetamodelPackage.DATA_DECLARATION__IS_DECISION_EXPR:
				return isDecisionExpr != IS_DECISION_EXPR_EDEFAULT;
			case OPLmetamodelPackage.DATA_DECLARATION__VALUE:
				return value != null;
			case OPLmetamodelPackage.DATA_DECLARATION__VALUE_CONSTRAINT:
				return valueConstraint != null;
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
		result.append(" (isDecisionVar: ");
		result.append(isDecisionVar);
		result.append(", isDecisionExpr: ");
		result.append(isDecisionExpr);
		result.append(')');
		return result.toString();
	}

} //DataDeclarationImpl
