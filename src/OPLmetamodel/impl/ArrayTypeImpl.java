/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.AbstractType;
import OPLmetamodel.ArrayType;
import OPLmetamodel.DataRef;
import OPLmetamodel.OPLmetamodelPackage;

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
 * An implementation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.ArrayTypeImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ArrayTypeImpl#getSubscripts <em>Subscripts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayTypeImpl extends DefinedTypeImpl implements ArrayType {
	/**
	 * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected AbstractType baseType;

	/**
	 * The cached value of the '{@link #getSubscripts() <em>Subscripts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscripts()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRef> subscripts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.ARRAY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType getBaseType() {
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseType(AbstractType newBaseType, NotificationChain msgs) {
		AbstractType oldBaseType = baseType;
		baseType = newBaseType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.ARRAY_TYPE__BASE_TYPE, oldBaseType, newBaseType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseType(AbstractType newBaseType) {
		if (newBaseType != baseType) {
			NotificationChain msgs = null;
			if (baseType != null)
				msgs = ((InternalEObject)baseType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.ARRAY_TYPE__BASE_TYPE, null, msgs);
			if (newBaseType != null)
				msgs = ((InternalEObject)newBaseType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.ARRAY_TYPE__BASE_TYPE, null, msgs);
			msgs = basicSetBaseType(newBaseType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.ARRAY_TYPE__BASE_TYPE, newBaseType, newBaseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRef> getSubscripts() {
		if (subscripts == null) {
			subscripts = new EObjectContainmentEList<DataRef>(DataRef.class, this, OPLmetamodelPackage.ARRAY_TYPE__SUBSCRIPTS);
		}
		return subscripts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.ARRAY_TYPE__BASE_TYPE:
				return basicSetBaseType(null, msgs);
			case OPLmetamodelPackage.ARRAY_TYPE__SUBSCRIPTS:
				return ((InternalEList<?>)getSubscripts()).basicRemove(otherEnd, msgs);
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
			case OPLmetamodelPackage.ARRAY_TYPE__BASE_TYPE:
				return getBaseType();
			case OPLmetamodelPackage.ARRAY_TYPE__SUBSCRIPTS:
				return getSubscripts();
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
			case OPLmetamodelPackage.ARRAY_TYPE__BASE_TYPE:
				setBaseType((AbstractType)newValue);
				return;
			case OPLmetamodelPackage.ARRAY_TYPE__SUBSCRIPTS:
				getSubscripts().clear();
				getSubscripts().addAll((Collection<? extends DataRef>)newValue);
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
			case OPLmetamodelPackage.ARRAY_TYPE__BASE_TYPE:
				setBaseType((AbstractType)null);
				return;
			case OPLmetamodelPackage.ARRAY_TYPE__SUBSCRIPTS:
				getSubscripts().clear();
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
			case OPLmetamodelPackage.ARRAY_TYPE__BASE_TYPE:
				return baseType != null;
			case OPLmetamodelPackage.ARRAY_TYPE__SUBSCRIPTS:
				return subscripts != null && !subscripts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArrayTypeImpl
