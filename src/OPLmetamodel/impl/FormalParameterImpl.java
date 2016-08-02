/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.BindingRef;
import OPLmetamodel.Expression;
import OPLmetamodel.FormalParameter;
import OPLmetamodel.OPLmetamodelPackage;
import OPLmetamodel.ParameterDomain;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.FormalParameterImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link OPLmetamodel.impl.FormalParameterImpl#getBoundVars <em>Bound Vars</em>}</li>
 *   <li>{@link OPLmetamodel.impl.FormalParameterImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link OPLmetamodel.impl.FormalParameterImpl#getRequire <em>Require</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormalParameterImpl extends MinimalEObjectImpl.Container implements FormalParameter {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected ParameterDomain domain;

	/**
	 * The cached value of the '{@link #getBoundVars() <em>Bound Vars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundVars()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingRef> boundVars;

	/**
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequire() <em>Require</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequire()
	 * @generated
	 * @ordered
	 */
	protected Expression require;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.FORMAL_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDomain getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(ParameterDomain newDomain, NotificationChain msgs) {
		ParameterDomain oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.FORMAL_PARAMETER__DOMAIN, oldDomain, newDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(ParameterDomain newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.FORMAL_PARAMETER__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.FORMAL_PARAMETER__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.FORMAL_PARAMETER__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingRef> getBoundVars() {
		if (boundVars == null) {
			boundVars = new EObjectContainmentEList<BindingRef>(BindingRef.class, this, OPLmetamodelPackage.FORMAL_PARAMETER__BOUND_VARS);
		}
		return boundVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.FORMAL_PARAMETER__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRequire() {
		return require;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequire(Expression newRequire, NotificationChain msgs) {
		Expression oldRequire = require;
		require = newRequire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.FORMAL_PARAMETER__REQUIRE, oldRequire, newRequire);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequire(Expression newRequire) {
		if (newRequire != require) {
			NotificationChain msgs = null;
			if (require != null)
				msgs = ((InternalEObject)require).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.FORMAL_PARAMETER__REQUIRE, null, msgs);
			if (newRequire != null)
				msgs = ((InternalEObject)newRequire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.FORMAL_PARAMETER__REQUIRE, null, msgs);
			msgs = basicSetRequire(newRequire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.FORMAL_PARAMETER__REQUIRE, newRequire, newRequire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.FORMAL_PARAMETER__DOMAIN:
				return basicSetDomain(null, msgs);
			case OPLmetamodelPackage.FORMAL_PARAMETER__BOUND_VARS:
				return ((InternalEList<?>)getBoundVars()).basicRemove(otherEnd, msgs);
			case OPLmetamodelPackage.FORMAL_PARAMETER__REQUIRE:
				return basicSetRequire(null, msgs);
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
			case OPLmetamodelPackage.FORMAL_PARAMETER__DOMAIN:
				return getDomain();
			case OPLmetamodelPackage.FORMAL_PARAMETER__BOUND_VARS:
				return getBoundVars();
			case OPLmetamodelPackage.FORMAL_PARAMETER__IS_ORDERED:
				return isIsOrdered();
			case OPLmetamodelPackage.FORMAL_PARAMETER__REQUIRE:
				return getRequire();
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
			case OPLmetamodelPackage.FORMAL_PARAMETER__DOMAIN:
				setDomain((ParameterDomain)newValue);
				return;
			case OPLmetamodelPackage.FORMAL_PARAMETER__BOUND_VARS:
				getBoundVars().clear();
				getBoundVars().addAll((Collection<? extends BindingRef>)newValue);
				return;
			case OPLmetamodelPackage.FORMAL_PARAMETER__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case OPLmetamodelPackage.FORMAL_PARAMETER__REQUIRE:
				setRequire((Expression)newValue);
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
			case OPLmetamodelPackage.FORMAL_PARAMETER__DOMAIN:
				setDomain((ParameterDomain)null);
				return;
			case OPLmetamodelPackage.FORMAL_PARAMETER__BOUND_VARS:
				getBoundVars().clear();
				return;
			case OPLmetamodelPackage.FORMAL_PARAMETER__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case OPLmetamodelPackage.FORMAL_PARAMETER__REQUIRE:
				setRequire((Expression)null);
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
			case OPLmetamodelPackage.FORMAL_PARAMETER__DOMAIN:
				return domain != null;
			case OPLmetamodelPackage.FORMAL_PARAMETER__BOUND_VARS:
				return boundVars != null && !boundVars.isEmpty();
			case OPLmetamodelPackage.FORMAL_PARAMETER__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case OPLmetamodelPackage.FORMAL_PARAMETER__REQUIRE:
				return require != null;
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
		result.append(" (isOrdered: ");
		result.append(isOrdered);
		result.append(')');
		return result.toString();
	}

} //FormalParameterImpl
