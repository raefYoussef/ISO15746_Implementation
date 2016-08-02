/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.ActivityDeclaration;
import OPLmetamodel.Constraint;
import OPLmetamodel.DataDeclaration;
import OPLmetamodel.Declaration;
import OPLmetamodel.DefinedType;
import OPLmetamodel.Function;
import OPLmetamodel.Model;
import OPLmetamodel.OPLmetamodelPackage;
import OPLmetamodel.Objective;
import OPLmetamodel.ResourceDeclaration;
import OPLmetamodel.ScheduleInitialization;
import OPLmetamodel.Script;
import OPLmetamodel.SearchProcedure;
import OPLmetamodel.Setting;

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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.ModelImpl#getId <em>Id</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ModelImpl#isIsConstraintProblem <em>Is Constraint Problem</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ModelImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ModelImpl#getData <em>Data</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ModelImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ModelImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ModelImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ModelImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ModelImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ModelImpl#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ModelImpl#getScheduleInit <em>Schedule Init</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ModelImpl#getScripts <em>Scripts</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ModelImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ModelImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link OPLmetamodel.impl.ModelImpl#getSearch <em>Search</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsConstraintProblem() <em>Is Constraint Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConstraintProblem()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONSTRAINT_PROBLEM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConstraintProblem() <em>Is Constraint Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConstraintProblem()
	 * @generated
	 * @ordered
	 */
	protected boolean isConstraintProblem = IS_CONSTRAINT_PROBLEM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinedType> types;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<DataDeclaration> data;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected Objective instruction;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> functions;

	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityDeclaration> activities;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected ResourceDeclaration resources;

	/**
	 * The cached value of the '{@link #getAssertions() <em>Assertions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertions()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> assertions;

	/**
	 * The cached value of the '{@link #getScheduleInit() <em>Schedule Init</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleInit()
	 * @generated
	 * @ordered
	 */
	protected EList<ScheduleInitialization> scheduleInit;

	/**
	 * The cached value of the '{@link #getScripts() <em>Scripts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScripts()
	 * @generated
	 * @ordered
	 */
	protected EList<Script> scripts;

	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<Setting> settings;

	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getSearch() <em>Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearch()
	 * @generated
	 * @ordered
	 */
	protected SearchProcedure search;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.MODEL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConstraintProblem() {
		return isConstraintProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConstraintProblem(boolean newIsConstraintProblem) {
		boolean oldIsConstraintProblem = isConstraintProblem;
		isConstraintProblem = newIsConstraintProblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.MODEL__IS_CONSTRAINT_PROBLEM, oldIsConstraintProblem, isConstraintProblem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefinedType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<DefinedType>(DefinedType.class, this, OPLmetamodelPackage.MODEL__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataDeclaration> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<DataDeclaration>(DataDeclaration.class, this, OPLmetamodelPackage.MODEL__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, OPLmetamodelPackage.MODEL__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective getInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstruction(Objective newInstruction, NotificationChain msgs) {
		Objective oldInstruction = instruction;
		instruction = newInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.MODEL__INSTRUCTION, oldInstruction, newInstruction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstruction(Objective newInstruction) {
		if (newInstruction != instruction) {
			NotificationChain msgs = null;
			if (instruction != null)
				msgs = ((InternalEObject)instruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.MODEL__INSTRUCTION, null, msgs);
			if (newInstruction != null)
				msgs = ((InternalEObject)newInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.MODEL__INSTRUCTION, null, msgs);
			msgs = basicSetInstruction(newInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.MODEL__INSTRUCTION, newInstruction, newInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<Function>(Function.class, this, OPLmetamodelPackage.MODEL__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityDeclaration> getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList<ActivityDeclaration>(ActivityDeclaration.class, this, OPLmetamodelPackage.MODEL__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDeclaration getResources() {
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResources(ResourceDeclaration newResources, NotificationChain msgs) {
		ResourceDeclaration oldResources = resources;
		resources = newResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.MODEL__RESOURCES, oldResources, newResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResources(ResourceDeclaration newResources) {
		if (newResources != resources) {
			NotificationChain msgs = null;
			if (resources != null)
				msgs = ((InternalEObject)resources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.MODEL__RESOURCES, null, msgs);
			if (newResources != null)
				msgs = ((InternalEObject)newResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.MODEL__RESOURCES, null, msgs);
			msgs = basicSetResources(newResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.MODEL__RESOURCES, newResources, newResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getAssertions() {
		if (assertions == null) {
			assertions = new EObjectContainmentEList<Constraint>(Constraint.class, this, OPLmetamodelPackage.MODEL__ASSERTIONS);
		}
		return assertions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScheduleInitialization> getScheduleInit() {
		if (scheduleInit == null) {
			scheduleInit = new EObjectContainmentEList<ScheduleInitialization>(ScheduleInitialization.class, this, OPLmetamodelPackage.MODEL__SCHEDULE_INIT);
		}
		return scheduleInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Script> getScripts() {
		if (scripts == null) {
			scripts = new EObjectContainmentEList<Script>(Script.class, this, OPLmetamodelPackage.MODEL__SCRIPTS);
		}
		return scripts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Setting> getSettings() {
		if (settings == null) {
			settings = new EObjectContainmentEList<Setting>(Setting.class, this, OPLmetamodelPackage.MODEL__SETTINGS);
		}
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations() {
		if (declarations == null) {
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, OPLmetamodelPackage.MODEL__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchProcedure getSearch() {
		return search;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearch(SearchProcedure newSearch, NotificationChain msgs) {
		SearchProcedure oldSearch = search;
		search = newSearch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.MODEL__SEARCH, oldSearch, newSearch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearch(SearchProcedure newSearch) {
		if (newSearch != search) {
			NotificationChain msgs = null;
			if (search != null)
				msgs = ((InternalEObject)search).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.MODEL__SEARCH, null, msgs);
			if (newSearch != null)
				msgs = ((InternalEObject)newSearch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.MODEL__SEARCH, null, msgs);
			msgs = basicSetSearch(newSearch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.MODEL__SEARCH, newSearch, newSearch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.MODEL__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case OPLmetamodelPackage.MODEL__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case OPLmetamodelPackage.MODEL__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case OPLmetamodelPackage.MODEL__INSTRUCTION:
				return basicSetInstruction(null, msgs);
			case OPLmetamodelPackage.MODEL__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case OPLmetamodelPackage.MODEL__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
			case OPLmetamodelPackage.MODEL__RESOURCES:
				return basicSetResources(null, msgs);
			case OPLmetamodelPackage.MODEL__ASSERTIONS:
				return ((InternalEList<?>)getAssertions()).basicRemove(otherEnd, msgs);
			case OPLmetamodelPackage.MODEL__SCHEDULE_INIT:
				return ((InternalEList<?>)getScheduleInit()).basicRemove(otherEnd, msgs);
			case OPLmetamodelPackage.MODEL__SCRIPTS:
				return ((InternalEList<?>)getScripts()).basicRemove(otherEnd, msgs);
			case OPLmetamodelPackage.MODEL__SETTINGS:
				return ((InternalEList<?>)getSettings()).basicRemove(otherEnd, msgs);
			case OPLmetamodelPackage.MODEL__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case OPLmetamodelPackage.MODEL__SEARCH:
				return basicSetSearch(null, msgs);
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
			case OPLmetamodelPackage.MODEL__ID:
				return getId();
			case OPLmetamodelPackage.MODEL__IS_CONSTRAINT_PROBLEM:
				return isIsConstraintProblem();
			case OPLmetamodelPackage.MODEL__TYPES:
				return getTypes();
			case OPLmetamodelPackage.MODEL__DATA:
				return getData();
			case OPLmetamodelPackage.MODEL__CONSTRAINTS:
				return getConstraints();
			case OPLmetamodelPackage.MODEL__INSTRUCTION:
				return getInstruction();
			case OPLmetamodelPackage.MODEL__FUNCTIONS:
				return getFunctions();
			case OPLmetamodelPackage.MODEL__ACTIVITIES:
				return getActivities();
			case OPLmetamodelPackage.MODEL__RESOURCES:
				return getResources();
			case OPLmetamodelPackage.MODEL__ASSERTIONS:
				return getAssertions();
			case OPLmetamodelPackage.MODEL__SCHEDULE_INIT:
				return getScheduleInit();
			case OPLmetamodelPackage.MODEL__SCRIPTS:
				return getScripts();
			case OPLmetamodelPackage.MODEL__SETTINGS:
				return getSettings();
			case OPLmetamodelPackage.MODEL__DECLARATIONS:
				return getDeclarations();
			case OPLmetamodelPackage.MODEL__SEARCH:
				return getSearch();
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
			case OPLmetamodelPackage.MODEL__ID:
				setId((String)newValue);
				return;
			case OPLmetamodelPackage.MODEL__IS_CONSTRAINT_PROBLEM:
				setIsConstraintProblem((Boolean)newValue);
				return;
			case OPLmetamodelPackage.MODEL__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends DefinedType>)newValue);
				return;
			case OPLmetamodelPackage.MODEL__DATA:
				getData().clear();
				getData().addAll((Collection<? extends DataDeclaration>)newValue);
				return;
			case OPLmetamodelPackage.MODEL__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case OPLmetamodelPackage.MODEL__INSTRUCTION:
				setInstruction((Objective)newValue);
				return;
			case OPLmetamodelPackage.MODEL__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case OPLmetamodelPackage.MODEL__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends ActivityDeclaration>)newValue);
				return;
			case OPLmetamodelPackage.MODEL__RESOURCES:
				setResources((ResourceDeclaration)newValue);
				return;
			case OPLmetamodelPackage.MODEL__ASSERTIONS:
				getAssertions().clear();
				getAssertions().addAll((Collection<? extends Constraint>)newValue);
				return;
			case OPLmetamodelPackage.MODEL__SCHEDULE_INIT:
				getScheduleInit().clear();
				getScheduleInit().addAll((Collection<? extends ScheduleInitialization>)newValue);
				return;
			case OPLmetamodelPackage.MODEL__SCRIPTS:
				getScripts().clear();
				getScripts().addAll((Collection<? extends Script>)newValue);
				return;
			case OPLmetamodelPackage.MODEL__SETTINGS:
				getSettings().clear();
				getSettings().addAll((Collection<? extends Setting>)newValue);
				return;
			case OPLmetamodelPackage.MODEL__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends Declaration>)newValue);
				return;
			case OPLmetamodelPackage.MODEL__SEARCH:
				setSearch((SearchProcedure)newValue);
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
			case OPLmetamodelPackage.MODEL__ID:
				setId(ID_EDEFAULT);
				return;
			case OPLmetamodelPackage.MODEL__IS_CONSTRAINT_PROBLEM:
				setIsConstraintProblem(IS_CONSTRAINT_PROBLEM_EDEFAULT);
				return;
			case OPLmetamodelPackage.MODEL__TYPES:
				getTypes().clear();
				return;
			case OPLmetamodelPackage.MODEL__DATA:
				getData().clear();
				return;
			case OPLmetamodelPackage.MODEL__CONSTRAINTS:
				getConstraints().clear();
				return;
			case OPLmetamodelPackage.MODEL__INSTRUCTION:
				setInstruction((Objective)null);
				return;
			case OPLmetamodelPackage.MODEL__FUNCTIONS:
				getFunctions().clear();
				return;
			case OPLmetamodelPackage.MODEL__ACTIVITIES:
				getActivities().clear();
				return;
			case OPLmetamodelPackage.MODEL__RESOURCES:
				setResources((ResourceDeclaration)null);
				return;
			case OPLmetamodelPackage.MODEL__ASSERTIONS:
				getAssertions().clear();
				return;
			case OPLmetamodelPackage.MODEL__SCHEDULE_INIT:
				getScheduleInit().clear();
				return;
			case OPLmetamodelPackage.MODEL__SCRIPTS:
				getScripts().clear();
				return;
			case OPLmetamodelPackage.MODEL__SETTINGS:
				getSettings().clear();
				return;
			case OPLmetamodelPackage.MODEL__DECLARATIONS:
				getDeclarations().clear();
				return;
			case OPLmetamodelPackage.MODEL__SEARCH:
				setSearch((SearchProcedure)null);
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
			case OPLmetamodelPackage.MODEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case OPLmetamodelPackage.MODEL__IS_CONSTRAINT_PROBLEM:
				return isConstraintProblem != IS_CONSTRAINT_PROBLEM_EDEFAULT;
			case OPLmetamodelPackage.MODEL__TYPES:
				return types != null && !types.isEmpty();
			case OPLmetamodelPackage.MODEL__DATA:
				return data != null && !data.isEmpty();
			case OPLmetamodelPackage.MODEL__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case OPLmetamodelPackage.MODEL__INSTRUCTION:
				return instruction != null;
			case OPLmetamodelPackage.MODEL__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case OPLmetamodelPackage.MODEL__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case OPLmetamodelPackage.MODEL__RESOURCES:
				return resources != null;
			case OPLmetamodelPackage.MODEL__ASSERTIONS:
				return assertions != null && !assertions.isEmpty();
			case OPLmetamodelPackage.MODEL__SCHEDULE_INIT:
				return scheduleInit != null && !scheduleInit.isEmpty();
			case OPLmetamodelPackage.MODEL__SCRIPTS:
				return scripts != null && !scripts.isEmpty();
			case OPLmetamodelPackage.MODEL__SETTINGS:
				return settings != null && !settings.isEmpty();
			case OPLmetamodelPackage.MODEL__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case OPLmetamodelPackage.MODEL__SEARCH:
				return search != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", isConstraintProblem: ");
		result.append(isConstraintProblem);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
