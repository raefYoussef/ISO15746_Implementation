/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.IndexValuePair;
import OPLmetamodel.OPLmetamodelPackage;
import OPLmetamodel.RecordValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.RecordValueImpl#getFieldPairs <em>Field Pairs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordValueImpl extends ExpressionImpl implements RecordValue {
	/**
	 * The cached value of the '{@link #getFieldPairs() <em>Field Pairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldPairs()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexValuePair> fieldPairs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.RECORD_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexValuePair> getFieldPairs() {
		if (fieldPairs == null) {
			fieldPairs = new EObjectContainmentEList<IndexValuePair>(IndexValuePair.class, this, OPLmetamodelPackage.RECORD_VALUE__FIELD_PAIRS);
		}
		return fieldPairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.RECORD_VALUE__FIELD_PAIRS:
				return ((InternalEList<?>)getFieldPairs()).basicRemove(otherEnd, msgs);
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
			case OPLmetamodelPackage.RECORD_VALUE__FIELD_PAIRS:
				return getFieldPairs();
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
			case OPLmetamodelPackage.RECORD_VALUE__FIELD_PAIRS:
				getFieldPairs().clear();
				getFieldPairs().addAll((Collection<? extends IndexValuePair>)newValue);
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
			case OPLmetamodelPackage.RECORD_VALUE__FIELD_PAIRS:
				getFieldPairs().clear();
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
			case OPLmetamodelPackage.RECORD_VALUE__FIELD_PAIRS:
				return fieldPairs != null && !fieldPairs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecordValueImpl
