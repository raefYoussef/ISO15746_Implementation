/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.Model#getId <em>Id</em>}</li>
 *   <li>{@link OPLmetamodel.Model#isIsConstraintProblem <em>Is Constraint Problem</em>}</li>
 *   <li>{@link OPLmetamodel.Model#getTypes <em>Types</em>}</li>
 *   <li>{@link OPLmetamodel.Model#getData <em>Data</em>}</li>
 *   <li>{@link OPLmetamodel.Model#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link OPLmetamodel.Model#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link OPLmetamodel.Model#getFunctions <em>Functions</em>}</li>
 *   <li>{@link OPLmetamodel.Model#getActivities <em>Activities</em>}</li>
 *   <li>{@link OPLmetamodel.Model#getResources <em>Resources</em>}</li>
 *   <li>{@link OPLmetamodel.Model#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link OPLmetamodel.Model#getScheduleInit <em>Schedule Init</em>}</li>
 *   <li>{@link OPLmetamodel.Model#getScripts <em>Scripts</em>}</li>
 *   <li>{@link OPLmetamodel.Model#getSettings <em>Settings</em>}</li>
 *   <li>{@link OPLmetamodel.Model#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link OPLmetamodel.Model#getSearch <em>Search</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see OPLmetamodel.OPLmetamodelPackage#getModel_Id()
	 * @model dataType="OPLmetamodel.Identifier" ordered="false"
	 *        annotation="https://oplmetamodel.com/notes body='POD This might be a CPLEX-only thing. Or it might be wrong!'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Model#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Is Constraint Problem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Constraint Problem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Constraint Problem</em>' attribute.
	 * @see #setIsConstraintProblem(boolean)
	 * @see OPLmetamodel.OPLmetamodelPackage#getModel_IsConstraintProblem()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsConstraintProblem();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Model#isIsConstraintProblem <em>Is Constraint Problem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Constraint Problem</em>' attribute.
	 * @see #isIsConstraintProblem()
	 * @generated
	 */
	void setIsConstraintProblem(boolean value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.DefinedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getModel_Types()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DefinedType> getTypes();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.DataDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getModel_Data()
	 * @model containment="true" ordered="false"
	 *        annotation="https://oplmetamodel.com/documentation body='Model.data is a property providing the DataDeclarations of the Model.'"
	 * @generated
	 */
	EList<DataDeclaration> getData();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getModel_Constraints()
	 * @model containment="true" ordered="false"
	 *        annotation="https://oplmetamodel.com/notes body='POD Note: There are also constraints in the Instruction. What is this one about?'"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference.
	 * @see #setInstruction(Objective)
	 * @see OPLmetamodel.OPLmetamodelPackage#getModel_Instruction()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Objective getInstruction();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Model#getInstruction <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' containment reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(Objective value);

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getModel_Functions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Function> getFunctions();

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.ActivityDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getModel_Activities()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityDeclaration> getActivities();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference.
	 * @see #setResources(ResourceDeclaration)
	 * @see OPLmetamodel.OPLmetamodelPackage#getModel_Resources()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ResourceDeclaration getResources();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Model#getResources <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' containment reference.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(ResourceDeclaration value);

	/**
	 * Returns the value of the '<em><b>Assertions</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assertions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assertions</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getModel_Assertions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getAssertions();

	/**
	 * Returns the value of the '<em><b>Schedule Init</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.ScheduleInitialization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Init</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Init</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getModel_ScheduleInit()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ScheduleInitialization> getScheduleInit();

	/**
	 * Returns the value of the '<em><b>Scripts</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.Script}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scripts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripts</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getModel_Scripts()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Script> getScripts();

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.Setting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getModel_Settings()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Setting> getSettings();

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.Declaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getModel_Declarations()
	 * @model containment="true"
	 *        annotation="https://oplmetamodel.com/documentation body='an ordered collection of the subtypes of Declaration that subset this property (e.g. types, data, constraints, etc.)'"
	 * @generated
	 */
	EList<Declaration> getDeclarations();

	/**
	 * Returns the value of the '<em><b>Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search</em>' containment reference.
	 * @see #setSearch(SearchProcedure)
	 * @see OPLmetamodel.OPLmetamodelPackage#getModel_Search()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SearchProcedure getSearch();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Model#getSearch <em>Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search</em>' containment reference.
	 * @see #getSearch()
	 * @generated
	 */
	void setSearch(SearchProcedure value);

} // Model
