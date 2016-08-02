/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.Constraint;
import OPLmetamodel.ForAllConstraint;
import OPLmetamodel.FormalParameter;
import OPLmetamodel.OPLmetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For All Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.ForAllConstraintImpl#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ForAllConstraintImpl#getExps <em>Exps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForAllConstraintImpl extends ConstraintImpl implements ForAllConstraint {
	/**
	 * The cached value of the '{@link #getQualifiers() <em>Qualifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<FormalParameter> qualifiers;

	/**
	 * The cached value of the '{@link #getExps() <em>Exps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExps()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> exps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForAllConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.FOR_ALL_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormalParameter> getQualifiers() {
		if (qualifiers == null) {
			qualifiers = new EObjectContainmentEList<FormalParameter>(FormalParameter.class, this, OPLmetamodelPackage.FOR_ALL_CONSTRAINT__QUALIFIERS);
		}
		return qualifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getExps() {
		if (exps == null) {
			exps = new EObjectContainmentEList<Constraint>(Constraint.class, this, OPLmetamodelPackage.FOR_ALL_CONSTRAINT__EXPS);
		}
		return exps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.FOR_ALL_CONSTRAINT__QUALIFIERS:
				return ((InternalEList<?>)getQualifiers()).basicRemove(otherEnd, msgs);
			case OPLmetamodelPackage.FOR_ALL_CONSTRAINT__EXPS:
				return ((InternalEList<?>)getExps()).basicRemove(otherEnd, msgs);
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
			case OPLmetamodelPackage.FOR_ALL_CONSTRAINT__QUALIFIERS:
				return getQualifiers();
			case OPLmetamodelPackage.FOR_ALL_CONSTRAINT__EXPS:
				return getExps();
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
			case OPLmetamodelPackage.FOR_ALL_CONSTRAINT__QUALIFIERS:
				getQualifiers().clear();
				getQualifiers().addAll((Collection<? extends FormalParameter>)newValue);
				return;
			case OPLmetamodelPackage.FOR_ALL_CONSTRAINT__EXPS:
				getExps().clear();
				getExps().addAll((Collection<? extends Constraint>)newValue);
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
			case OPLmetamodelPackage.FOR_ALL_CONSTRAINT__QUALIFIERS:
				getQualifiers().clear();
				return;
			case OPLmetamodelPackage.FOR_ALL_CONSTRAINT__EXPS:
				getExps().clear();
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
			case OPLmetamodelPackage.FOR_ALL_CONSTRAINT__QUALIFIERS:
				return qualifiers != null && !qualifiers.isEmpty();
			case OPLmetamodelPackage.FOR_ALL_CONSTRAINT__EXPS:
				return exps != null && !exps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForAllConstraintImpl
