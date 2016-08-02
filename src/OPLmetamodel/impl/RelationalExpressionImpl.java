/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.BooleanExpression;
import OPLmetamodel.OPLmetamodelPackage;
import OPLmetamodel.PrimitiveExpression;
import OPLmetamodel.RelationalExpression;
import OPLmetamodel.RelationalOp;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.RelationalExpressionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link OPLmetamodel.impl.RelationalExpressionImpl#getRedefinedOp <em>Redefined Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationalExpressionImpl extends BinaryExpressionImpl implements RelationalExpression {
	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedefinedOp() <em>Redefined Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedOp()
	 * @generated
	 * @ordered
	 */
	protected static final RelationalOp REDEFINED_OP_EDEFAULT = RelationalOp.GREATER_THAN;

	/**
	 * The cached value of the '{@link #getRedefinedOp() <em>Redefined Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedOp()
	 * @generated
	 * @ordered
	 */
	protected RelationalOp redefinedOp = REDEFINED_OP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.RELATIONAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.RELATIONAL_EXPRESSION__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOp getRedefinedOp() {
		return redefinedOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedOp(RelationalOp newRedefinedOp) {
		RelationalOp oldRedefinedOp = redefinedOp;
		redefinedOp = newRedefinedOp == null ? REDEFINED_OP_EDEFAULT : newRedefinedOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.RELATIONAL_EXPRESSION__REDEFINED_OP, oldRedefinedOp, redefinedOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OPLmetamodelPackage.RELATIONAL_EXPRESSION__BODY:
				return getBody();
			case OPLmetamodelPackage.RELATIONAL_EXPRESSION__REDEFINED_OP:
				return getRedefinedOp();
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
			case OPLmetamodelPackage.RELATIONAL_EXPRESSION__BODY:
				setBody((String)newValue);
				return;
			case OPLmetamodelPackage.RELATIONAL_EXPRESSION__REDEFINED_OP:
				setRedefinedOp((RelationalOp)newValue);
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
			case OPLmetamodelPackage.RELATIONAL_EXPRESSION__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case OPLmetamodelPackage.RELATIONAL_EXPRESSION__REDEFINED_OP:
				setRedefinedOp(REDEFINED_OP_EDEFAULT);
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
			case OPLmetamodelPackage.RELATIONAL_EXPRESSION__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case OPLmetamodelPackage.RELATIONAL_EXPRESSION__REDEFINED_OP:
				return redefinedOp != REDEFINED_OP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PrimitiveExpression.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == BooleanExpression.class) {
			switch (derivedFeatureID) {
				case OPLmetamodelPackage.RELATIONAL_EXPRESSION__BODY: return OPLmetamodelPackage.BOOLEAN_EXPRESSION__BODY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PrimitiveExpression.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == BooleanExpression.class) {
			switch (baseFeatureID) {
				case OPLmetamodelPackage.BOOLEAN_EXPRESSION__BODY: return OPLmetamodelPackage.RELATIONAL_EXPRESSION__BODY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (body: ");
		result.append(body);
		result.append(", redefinedOp: ");
		result.append(redefinedOp);
		result.append(')');
		return result.toString();
	}

} //RelationalExpressionImpl
