/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.ArrayDereference;
import OPLmetamodel.Expression;
import OPLmetamodel.OPLmetamodelPackage;
import OPLmetamodel.PathExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Dereference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.ArrayDereferenceImpl#getArray <em>Array</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ArrayDereferenceImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayDereferenceImpl extends PathExpressionImpl implements ArrayDereference {
	/**
	 * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArray()
	 * @generated
	 * @ordered
	 */
	protected PathExpression array;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> index;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayDereferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.ARRAY_DEREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathExpression getArray() {
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArray(PathExpression newArray, NotificationChain msgs) {
		PathExpression oldArray = array;
		array = newArray;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.ARRAY_DEREFERENCE__ARRAY, oldArray, newArray);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArray(PathExpression newArray) {
		if (newArray != array) {
			NotificationChain msgs = null;
			if (array != null)
				msgs = ((InternalEObject)array).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.ARRAY_DEREFERENCE__ARRAY, null, msgs);
			if (newArray != null)
				msgs = ((InternalEObject)newArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.ARRAY_DEREFERENCE__ARRAY, null, msgs);
			msgs = basicSetArray(newArray, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.ARRAY_DEREFERENCE__ARRAY, newArray, newArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getIndex() {
		if (index == null) {
			index = new EObjectContainmentEList<Expression>(Expression.class, this, OPLmetamodelPackage.ARRAY_DEREFERENCE__INDEX);
		}
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.ARRAY_DEREFERENCE__ARRAY:
				return basicSetArray(null, msgs);
			case OPLmetamodelPackage.ARRAY_DEREFERENCE__INDEX:
				return ((InternalEList<?>)getIndex()).basicRemove(otherEnd, msgs);
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
			case OPLmetamodelPackage.ARRAY_DEREFERENCE__ARRAY:
				return getArray();
			case OPLmetamodelPackage.ARRAY_DEREFERENCE__INDEX:
				return getIndex();
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
			case OPLmetamodelPackage.ARRAY_DEREFERENCE__ARRAY:
				setArray((PathExpression)newValue);
				return;
			case OPLmetamodelPackage.ARRAY_DEREFERENCE__INDEX:
				getIndex().clear();
				getIndex().addAll((Collection<? extends Expression>)newValue);
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
			case OPLmetamodelPackage.ARRAY_DEREFERENCE__ARRAY:
				setArray((PathExpression)null);
				return;
			case OPLmetamodelPackage.ARRAY_DEREFERENCE__INDEX:
				getIndex().clear();
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
			case OPLmetamodelPackage.ARRAY_DEREFERENCE__ARRAY:
				return array != null;
			case OPLmetamodelPackage.ARRAY_DEREFERENCE__INDEX:
				return index != null && !index.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArrayDereferenceImpl
