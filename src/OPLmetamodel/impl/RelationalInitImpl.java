/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.BindingRef;
import OPLmetamodel.OPLmetamodelPackage;
import OPLmetamodel.RelationalExpression;
import OPLmetamodel.RelationalInit;
import OPLmetamodel.VariableBinding;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relational Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.RelationalInitImpl#getBindingVar <em>Binding Var</em>}</li>
 *   <li>{@link OPLmetamodel.impl.RelationalInitImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link OPLmetamodel.impl.RelationalInitImpl#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationalInitImpl extends InitializationImpl implements RelationalInit {
	/**
	 * The cached value of the '{@link #getBindingVar() <em>Binding Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingVar()
	 * @generated
	 * @ordered
	 */
	protected BindingRef bindingVar;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected VariableBinding sources;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected RelationalExpression relation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalInitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.RELATIONAL_INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingRef getBindingVar() {
		return bindingVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingVar(BindingRef newBindingVar, NotificationChain msgs) {
		BindingRef oldBindingVar = bindingVar;
		bindingVar = newBindingVar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.RELATIONAL_INIT__BINDING_VAR, oldBindingVar, newBindingVar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingVar(BindingRef newBindingVar) {
		if (newBindingVar != bindingVar) {
			NotificationChain msgs = null;
			if (bindingVar != null)
				msgs = ((InternalEObject)bindingVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.RELATIONAL_INIT__BINDING_VAR, null, msgs);
			if (newBindingVar != null)
				msgs = ((InternalEObject)newBindingVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.RELATIONAL_INIT__BINDING_VAR, null, msgs);
			msgs = basicSetBindingVar(newBindingVar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.RELATIONAL_INIT__BINDING_VAR, newBindingVar, newBindingVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableBinding getSources() {
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSources(VariableBinding newSources, NotificationChain msgs) {
		VariableBinding oldSources = sources;
		sources = newSources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.RELATIONAL_INIT__SOURCES, oldSources, newSources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSources(VariableBinding newSources) {
		if (newSources != sources) {
			NotificationChain msgs = null;
			if (sources != null)
				msgs = ((InternalEObject)sources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.RELATIONAL_INIT__SOURCES, null, msgs);
			if (newSources != null)
				msgs = ((InternalEObject)newSources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.RELATIONAL_INIT__SOURCES, null, msgs);
			msgs = basicSetSources(newSources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.RELATIONAL_INIT__SOURCES, newSources, newSources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalExpression getRelation() {
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelation(RelationalExpression newRelation, NotificationChain msgs) {
		RelationalExpression oldRelation = relation;
		relation = newRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.RELATIONAL_INIT__RELATION, oldRelation, newRelation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelation(RelationalExpression newRelation) {
		if (newRelation != relation) {
			NotificationChain msgs = null;
			if (relation != null)
				msgs = ((InternalEObject)relation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.RELATIONAL_INIT__RELATION, null, msgs);
			if (newRelation != null)
				msgs = ((InternalEObject)newRelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.RELATIONAL_INIT__RELATION, null, msgs);
			msgs = basicSetRelation(newRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.RELATIONAL_INIT__RELATION, newRelation, newRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.RELATIONAL_INIT__BINDING_VAR:
				return basicSetBindingVar(null, msgs);
			case OPLmetamodelPackage.RELATIONAL_INIT__SOURCES:
				return basicSetSources(null, msgs);
			case OPLmetamodelPackage.RELATIONAL_INIT__RELATION:
				return basicSetRelation(null, msgs);
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
			case OPLmetamodelPackage.RELATIONAL_INIT__BINDING_VAR:
				return getBindingVar();
			case OPLmetamodelPackage.RELATIONAL_INIT__SOURCES:
				return getSources();
			case OPLmetamodelPackage.RELATIONAL_INIT__RELATION:
				return getRelation();
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
			case OPLmetamodelPackage.RELATIONAL_INIT__BINDING_VAR:
				setBindingVar((BindingRef)newValue);
				return;
			case OPLmetamodelPackage.RELATIONAL_INIT__SOURCES:
				setSources((VariableBinding)newValue);
				return;
			case OPLmetamodelPackage.RELATIONAL_INIT__RELATION:
				setRelation((RelationalExpression)newValue);
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
			case OPLmetamodelPackage.RELATIONAL_INIT__BINDING_VAR:
				setBindingVar((BindingRef)null);
				return;
			case OPLmetamodelPackage.RELATIONAL_INIT__SOURCES:
				setSources((VariableBinding)null);
				return;
			case OPLmetamodelPackage.RELATIONAL_INIT__RELATION:
				setRelation((RelationalExpression)null);
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
			case OPLmetamodelPackage.RELATIONAL_INIT__BINDING_VAR:
				return bindingVar != null;
			case OPLmetamodelPackage.RELATIONAL_INIT__SOURCES:
				return sources != null;
			case OPLmetamodelPackage.RELATIONAL_INIT__RELATION:
				return relation != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationalInitImpl
