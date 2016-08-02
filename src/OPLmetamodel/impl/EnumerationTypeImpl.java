/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.EnumLiteral;
import OPLmetamodel.EnumerationType;
import OPLmetamodel.OPLmetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.EnumerationTypeImpl#getRedefinedBaseType <em>Redefined Base Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationTypeImpl extends SetTypeImpl implements EnumerationType {
	/**
	 * The cached value of the '{@link #getRedefinedBaseType() <em>Redefined Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedBaseType()
	 * @generated
	 * @ordered
	 */
	protected EnumLiteral redefinedBaseType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.ENUMERATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteral getRedefinedBaseType() {
		return redefinedBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedefinedBaseType(EnumLiteral newRedefinedBaseType, NotificationChain msgs) {
		EnumLiteral oldRedefinedBaseType = redefinedBaseType;
		redefinedBaseType = newRedefinedBaseType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.ENUMERATION_TYPE__REDEFINED_BASE_TYPE, oldRedefinedBaseType, newRedefinedBaseType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedBaseType(EnumLiteral newRedefinedBaseType) {
		if (newRedefinedBaseType != redefinedBaseType) {
			NotificationChain msgs = null;
			if (redefinedBaseType != null)
				msgs = ((InternalEObject)redefinedBaseType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.ENUMERATION_TYPE__REDEFINED_BASE_TYPE, null, msgs);
			if (newRedefinedBaseType != null)
				msgs = ((InternalEObject)newRedefinedBaseType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.ENUMERATION_TYPE__REDEFINED_BASE_TYPE, null, msgs);
			msgs = basicSetRedefinedBaseType(newRedefinedBaseType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.ENUMERATION_TYPE__REDEFINED_BASE_TYPE, newRedefinedBaseType, newRedefinedBaseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.ENUMERATION_TYPE__REDEFINED_BASE_TYPE:
				return basicSetRedefinedBaseType(null, msgs);
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
			case OPLmetamodelPackage.ENUMERATION_TYPE__REDEFINED_BASE_TYPE:
				return getRedefinedBaseType();
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
			case OPLmetamodelPackage.ENUMERATION_TYPE__REDEFINED_BASE_TYPE:
				setRedefinedBaseType((EnumLiteral)newValue);
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
			case OPLmetamodelPackage.ENUMERATION_TYPE__REDEFINED_BASE_TYPE:
				setRedefinedBaseType((EnumLiteral)null);
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
			case OPLmetamodelPackage.ENUMERATION_TYPE__REDEFINED_BASE_TYPE:
				return redefinedBaseType != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumerationTypeImpl
