/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.OPLmetamodelPackage;
import OPLmetamodel.PathDereference;
import OPLmetamodel.PathExpression;
import OPLmetamodel.Reference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Dereference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.PathDereferenceImpl#getDeref <em>Deref</em>}</li>
 *   <li>{@link OPLmetamodel.impl.PathDereferenceImpl#getBase <em>Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PathDereferenceImpl extends PathExpressionImpl implements PathDereference {
	/**
	 * The cached value of the '{@link #getDeref() <em>Deref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeref()
	 * @generated
	 * @ordered
	 */
	protected Reference deref;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected PathExpression base;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathDereferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.PATH_DEREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDeref() {
		return deref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeref(Reference newDeref, NotificationChain msgs) {
		Reference oldDeref = deref;
		deref = newDeref;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.PATH_DEREFERENCE__DEREF, oldDeref, newDeref);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeref(Reference newDeref) {
		if (newDeref != deref) {
			NotificationChain msgs = null;
			if (deref != null)
				msgs = ((InternalEObject)deref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.PATH_DEREFERENCE__DEREF, null, msgs);
			if (newDeref != null)
				msgs = ((InternalEObject)newDeref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.PATH_DEREFERENCE__DEREF, null, msgs);
			msgs = basicSetDeref(newDeref, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.PATH_DEREFERENCE__DEREF, newDeref, newDeref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathExpression getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(PathExpression newBase, NotificationChain msgs) {
		PathExpression oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.PATH_DEREFERENCE__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(PathExpression newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.PATH_DEREFERENCE__BASE, null, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.PATH_DEREFERENCE__BASE, null, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.PATH_DEREFERENCE__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.PATH_DEREFERENCE__DEREF:
				return basicSetDeref(null, msgs);
			case OPLmetamodelPackage.PATH_DEREFERENCE__BASE:
				return basicSetBase(null, msgs);
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
			case OPLmetamodelPackage.PATH_DEREFERENCE__DEREF:
				return getDeref();
			case OPLmetamodelPackage.PATH_DEREFERENCE__BASE:
				return getBase();
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
			case OPLmetamodelPackage.PATH_DEREFERENCE__DEREF:
				setDeref((Reference)newValue);
				return;
			case OPLmetamodelPackage.PATH_DEREFERENCE__BASE:
				setBase((PathExpression)newValue);
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
			case OPLmetamodelPackage.PATH_DEREFERENCE__DEREF:
				setDeref((Reference)null);
				return;
			case OPLmetamodelPackage.PATH_DEREFERENCE__BASE:
				setBase((PathExpression)null);
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
			case OPLmetamodelPackage.PATH_DEREFERENCE__DEREF:
				return deref != null;
			case OPLmetamodelPackage.PATH_DEREFERENCE__BASE:
				return base != null;
		}
		return super.eIsSet(featureID);
	}

} //PathDereferenceImpl
