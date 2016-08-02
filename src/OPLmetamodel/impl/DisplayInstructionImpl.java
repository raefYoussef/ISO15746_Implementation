/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.DisplayInstruction;
import OPLmetamodel.Expression;
import OPLmetamodel.OPLmetamodelPackage;
import OPLmetamodel.ParameterDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Display Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.DisplayInstructionImpl#getExps <em>Exps</em>}</li>
 *   <li>{@link OPLmetamodel.impl.DisplayInstructionImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisplayInstructionImpl extends MinimalEObjectImpl.Container implements DisplayInstruction {
	/**
	 * The cached value of the '{@link #getExps() <em>Exps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExps()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> exps;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDeclaration> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.DISPLAY_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getExps() {
		if (exps == null) {
			exps = new EObjectContainmentEList<Expression>(Expression.class, this, OPLmetamodelPackage.DISPLAY_INSTRUCTION__EXPS);
		}
		return exps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDeclaration> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ParameterDeclaration>(ParameterDeclaration.class, this, OPLmetamodelPackage.DISPLAY_INSTRUCTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.DISPLAY_INSTRUCTION__EXPS:
				return ((InternalEList<?>)getExps()).basicRemove(otherEnd, msgs);
			case OPLmetamodelPackage.DISPLAY_INSTRUCTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case OPLmetamodelPackage.DISPLAY_INSTRUCTION__EXPS:
				return getExps();
			case OPLmetamodelPackage.DISPLAY_INSTRUCTION__PARAMETERS:
				return getParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OPLmetamodelPackage.DISPLAY_INSTRUCTION__EXPS:
				getExps().clear();
				getExps().addAll((Collection<? extends Expression>)newValue);
				return;
			case OPLmetamodelPackage.DISPLAY_INSTRUCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ParameterDeclaration>)newValue);
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
			case OPLmetamodelPackage.DISPLAY_INSTRUCTION__EXPS:
				getExps().clear();
				return;
			case OPLmetamodelPackage.DISPLAY_INSTRUCTION__PARAMETERS:
				getParameters().clear();
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
			case OPLmetamodelPackage.DISPLAY_INSTRUCTION__EXPS:
				return exps != null && !exps.isEmpty();
			case OPLmetamodelPackage.DISPLAY_INSTRUCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DisplayInstructionImpl
