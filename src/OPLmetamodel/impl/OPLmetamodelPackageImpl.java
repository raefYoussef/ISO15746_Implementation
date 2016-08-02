/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.AbstractBinaryOperator;
import OPLmetamodel.AbstractType;
import OPLmetamodel.ActivityDeclaration;
import OPLmetamodel.AggOp;
import OPLmetamodel.AggregateExp;
import OPLmetamodel.AllExpression;
import OPLmetamodel.ArrayDereference;
import OPLmetamodel.ArraySlotConstraint;
import OPLmetamodel.ArrayType;
import OPLmetamodel.ArrayValue;
import OPLmetamodel.Assertion;
import OPLmetamodel.BinaryExpression;
import OPLmetamodel.BinaryOp;
import OPLmetamodel.BinaryOperator;
import OPLmetamodel.BindingRef;
import OPLmetamodel.BlockExpression;
import OPLmetamodel.BooleanBlock;
import OPLmetamodel.BooleanExpression;
import OPLmetamodel.BooleanType;
import OPLmetamodel.BuiltInFunction;
import OPLmetamodel.CollectionExpression;
import OPLmetamodel.Comprehension;
import OPLmetamodel.Constraint;
import OPLmetamodel.CumulativeFunction;
import OPLmetamodel.DataDeclaration;
import OPLmetamodel.DataInitMethods;
import OPLmetamodel.DataObject;
import OPLmetamodel.DataRef;
import OPLmetamodel.Declaration;
import OPLmetamodel.DeferredInit;
import OPLmetamodel.DefinedType;
import OPLmetamodel.DisplayInstruction;
import OPLmetamodel.Entity;
import OPLmetamodel.EnumLiteral;
import OPLmetamodel.EnumerationType;
import OPLmetamodel.Expression;
import OPLmetamodel.Extension;
import OPLmetamodel.FloatExpression;
import OPLmetamodel.FloatRangeType;
import OPLmetamodel.FloatType;
import OPLmetamodel.ForAllConstraint;
import OPLmetamodel.FormalParameter;
import OPLmetamodel.Function;
import OPLmetamodel.FunctionCall;
import OPLmetamodel.FunctionRef;
import OPLmetamodel.IfConstraint;
import OPLmetamodel.IfExpression;
import OPLmetamodel.In;
import OPLmetamodel.IndexValuePair;
import OPLmetamodel.Initialization;
import OPLmetamodel.IntegerExpression;
import OPLmetamodel.IntegerRangeType;
import OPLmetamodel.IntegerType;
import OPLmetamodel.Interval;
import OPLmetamodel.LogicalOp;
import OPLmetamodel.MembershipOp;
import OPLmetamodel.Model;
import OPLmetamodel.NumericExpression;
import OPLmetamodel.NumericType;
import OPLmetamodel.OPLmetamodelFactory;
import OPLmetamodel.OPLmetamodelPackage;
import OPLmetamodel.Objective;
import OPLmetamodel.Operator;
import OPLmetamodel.OptimizationMode;
import OPLmetamodel.ParameterDeclaration;
import OPLmetamodel.ParameterDomain;
import OPLmetamodel.ParameterRef;
import OPLmetamodel.PathDereference;
import OPLmetamodel.PathExpression;
import OPLmetamodel.PiecewiseExpression;
import OPLmetamodel.PiecewiseLinearFunction;
import OPLmetamodel.PositiveFloatType;
import OPLmetamodel.PositiveIntegerType;
import OPLmetamodel.PrimitiveExpression;
import OPLmetamodel.PrimitiveType;
import OPLmetamodel.Quantifier;
import OPLmetamodel.QueryUser;
import OPLmetamodel.RangeExpression;
import OPLmetamodel.RangeType;
import OPLmetamodel.ReadFile;
import OPLmetamodel.Record;
import OPLmetamodel.RecordField;
import OPLmetamodel.RecordValue;
import OPLmetamodel.Reference;
import OPLmetamodel.ReflectiveFunction;
import OPLmetamodel.RelationalExpression;
import OPLmetamodel.RelationalInit;
import OPLmetamodel.RelationalOp;
import OPLmetamodel.RelationalOperator;
import OPLmetamodel.ResourceDeclaration;
import OPLmetamodel.ScheduleInitialization;
import OPLmetamodel.Script;
import OPLmetamodel.ScriptStatement;
import OPLmetamodel.SearchProcedure;
import OPLmetamodel.Sequence;
import OPLmetamodel.SetOp;
import OPLmetamodel.SetType;
import OPLmetamodel.SetValue;
import OPLmetamodel.Setting;
import OPLmetamodel.StateFunction;
import OPLmetamodel.StepFunction;
import OPLmetamodel.StringExpression;
import OPLmetamodel.StringType;
import OPLmetamodel.TupleBinding;
import OPLmetamodel.UnaryExpression;
import OPLmetamodel.UnaryOp;
import OPLmetamodel.VariableBinding;
import OPLmetamodel.Writeln;

import java.text.SimpleDateFormat;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OPLmetamodelPackageImpl extends EPackageImpl implements OPLmetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractBinaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDereferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arraySlotConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comprehensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cumulativeFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataInitMethodsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deferredInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forAllConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexValuePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathDereferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass piecewiseExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass piecewiseLinearFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveFloatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveIntegerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflectiveFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleInitializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchProcedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writelnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum membershipOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum optimizationModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationalOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum setOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timepointEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see OPLmetamodel.OPLmetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OPLmetamodelPackageImpl() {
		super(eNS_URI, OPLmetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OPLmetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OPLmetamodelPackage init() {
		if (isInited) return (OPLmetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(OPLmetamodelPackage.eNS_URI);

		// Obtain or create and register package
		OPLmetamodelPackageImpl theOPLmetamodelPackage = (OPLmetamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OPLmetamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OPLmetamodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOPLmetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theOPLmetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOPLmetamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OPLmetamodelPackage.eNS_URI, theOPLmetamodelPackage);
		return theOPLmetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractBinaryOperator() {
		return abstractBinaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractType() {
		return abstractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityDeclaration() {
		return activityDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDeclaration_Duration() {
		return (EReference)activityDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDeclaration_EarliestStartTime() {
		return (EAttribute)activityDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDeclaration_LatestEndTime() {
		return (EAttribute)activityDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateExp() {
		return aggregateExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregateExp_Op() {
		return (EAttribute)aggregateExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateExp_Parameters() {
		return (EReference)aggregateExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateExp_Body() {
		return (EReference)aggregateExpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllExpression() {
		return allExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllExpression_Qualifiers() {
		return (EReference)allExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllExpression_Body() {
		return (EReference)allExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayDereference() {
		return arrayDereferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayDereference_Array() {
		return (EReference)arrayDereferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayDereference_Index() {
		return (EReference)arrayDereferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArraySlotConstraint() {
		return arraySlotConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArraySlotConstraint_Target() {
		return (EReference)arraySlotConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayType() {
		return arrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayType_BaseType() {
		return (EReference)arrayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayType_Subscripts() {
		return (EReference)arrayTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayValue() {
		return arrayValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayValue_Items() {
		return (EReference)arrayValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertion() {
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertion_Exp() {
		return (EReference)assertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Lhs() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Rhs() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Op() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryOperator() {
		return binaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryOperator_Op() {
		return (EAttribute)binaryOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingRef() {
		return bindingRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockExpression() {
		return blockExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockExpression_Blocks() {
		return (EReference)blockExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanBlock() {
		return booleanBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanExpression_Body() {
		return (EAttribute)booleanExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanType() {
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuiltInFunction() {
		return builtInFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionExpression() {
		return collectionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionExpression_IsUnique() {
		return (EAttribute)collectionExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Name() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Exp() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComprehension() {
		return comprehensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCumulativeFunction() {
		return cumulativeFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDeclaration() {
		return dataDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDeclaration_Variable() {
		return (EReference)dataDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDeclaration_Type() {
		return (EReference)dataDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDeclaration_IsDecisionVar() {
		return (EAttribute)dataDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDeclaration_IsDecisionExpr() {
		return (EAttribute)dataDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDeclaration_Value() {
		return (EReference)dataDeclarationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDeclaration_ValueConstraint() {
		return (EReference)dataDeclarationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataInitMethods() {
		return dataInitMethodsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataObject() {
		return dataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataObject_Body() {
		return (EAttribute)dataObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRef() {
		return dataRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaration() {
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclaration_Order() {
		return (EAttribute)declarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeferredInit() {
		return deferredInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinedType() {
		return definedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayInstruction() {
		return displayInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisplayInstruction_Exps() {
		return (EReference)displayInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisplayInstruction_Parameters() {
		return (EReference)displayInstructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationType() {
		return enumerationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationType_RedefinedBaseType() {
		return (EReference)enumerationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumLiteral() {
		return enumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getError() {
		return errorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatRangeType() {
		return floatRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatType() {
		return floatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalParameter() {
		return formalParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalParameter_Domain() {
		return (EReference)formalParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalParameter_BoundVars() {
		return (EReference)formalParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormalParameter_IsOrdered() {
		return (EAttribute)formalParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalParameter_Require() {
		return (EReference)formalParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_Exps() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatExpression() {
		return floatExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatExpression_Body() {
		return (EAttribute)floatExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForAllConstraint() {
		return forAllConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForAllConstraint_Qualifiers() {
		return (EReference)forAllConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForAllConstraint_Exps() {
		return (EReference)forAllConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Name() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Body() {
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Parameters() {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionCall() {
		return functionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionCall_FunctionName() {
		return (EAttribute)functionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionCall_Args() {
		return (EReference)functionCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionRef() {
		return functionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionRef_Name() {
		return (EAttribute)functionRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfConstraint() {
		return ifConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfConstraint_Test() {
		return (EReference)ifConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfConstraint_Then() {
		return (EReference)ifConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfConstraint_Else() {
		return (EReference)ifConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfExpression() {
		return ifExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExpression_Test() {
		return (EReference)ifExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExpression_Then() {
		return (EReference)ifExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfExpression_Else() {
		return (EReference)ifExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIn() {
		return inEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerType() {
		return integerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialization() {
		return initializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterval() {
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterval_IsOptional() {
		return (EAttribute)intervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Bounds() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Size() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Intensity() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerExpression() {
		return integerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerExpression_Body() {
		return (EAttribute)integerExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerRangeType() {
		return integerRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexValuePair() {
		return indexValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexValuePair_Index() {
		return (EReference)indexValuePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexValuePair_Value() {
		return (EReference)indexValuePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Id() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_IsConstraintProblem() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Types() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Data() {
		return (EReference)modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Constraints() {
		return (EReference)modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Instruction() {
		return (EReference)modelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Functions() {
		return (EReference)modelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Activities() {
		return (EReference)modelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Resources() {
		return (EReference)modelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Assertions() {
		return (EReference)modelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_ScheduleInit() {
		return (EReference)modelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Scripts() {
		return (EReference)modelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Settings() {
		return (EReference)modelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Declarations() {
		return (EReference)modelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Search() {
		return (EReference)modelEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumber() {
		return numberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericExpression() {
		return numericExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericType() {
		return numericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjective() {
		return objectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjective_Action() {
		return (EAttribute)objectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjective_Expression() {
		return (EReference)objectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjective_IsLinearRelaxation() {
		return (EAttribute)objectiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterDeclaration() {
		return parameterDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterDomain() {
		return parameterDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterRef() {
		return parameterRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathDereference() {
		return pathDereferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathDereference_Deref() {
		return (EReference)pathDereferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathDereference_Base() {
		return (EReference)pathDereferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathExpression() {
		return pathExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPiecewiseExpression() {
		return piecewiseExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPiecewiseLinearFunction() {
		return piecewiseLinearFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositiveFloatType() {
		return positiveFloatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveExpression() {
		return primitiveExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositiveIntegerType() {
		return positiveIntegerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryUser() {
		return queryUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryUser_Ask() {
		return (EAttribute)queryUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeExpression() {
		return rangeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeExpression_LowerLimit() {
		return (EReference)rangeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeExpression_UpperLimit() {
		return (EReference)rangeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeExpression_Type() {
		return (EReference)rangeExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeType() {
		return rangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeType_UpperBound() {
		return (EReference)rangeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeType_LowerBound() {
		return (EReference)rangeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadFile() {
		return readFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadFile_Path() {
		return (EAttribute)readFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecord() {
		return recordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecord_Name() {
		return (EAttribute)recordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecord_Fields() {
		return (EReference)recordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecord_IsTuple() {
		return (EAttribute)recordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordField() {
		return recordFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecordField_Name() {
		return (EAttribute)recordFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecordField_Type() {
		return (EReference)recordFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordValue() {
		return recordValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecordValue_FieldPairs() {
		return (EReference)recordValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_Name() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReflectiveFunction() {
		return reflectiveFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalExpression() {
		return relationalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationalExpression_RedefinedOp() {
		return (EAttribute)relationalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalInit() {
		return relationalInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalInit_BindingVar() {
		return (EReference)relationalInitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalInit_Sources() {
		return (EReference)relationalInitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalInit_Relation() {
		return (EReference)relationalInitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalOperator() {
		return relationalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationalOperator_Op() {
		return (EAttribute)relationalOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceDeclaration() {
		return resourceDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduleInitialization() {
		return scheduleInitializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScript_Id() {
		return (EReference)scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_IsMain() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScript_Statements() {
		return (EReference)scriptEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScriptStatement() {
		return scriptStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchProcedure() {
		return searchProcedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Intervals() {
		return (EReference)sequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Types() {
		return (EReference)sequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetting() {
		return settingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetType() {
		return setTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_Name() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetType_BaseType() {
		return (EReference)setTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetType_Elements() {
		return (EReference)setTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetValue() {
		return setValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_Items() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateFunction() {
		return stateFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateFunction_TransitionMatrix() {
		return (EReference)stateFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepFunction() {
		return stepFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringExpression() {
		return stringExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringExpression_Body() {
		return (EAttribute)stringExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringType() {
		return stringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleBinding() {
		return tupleBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleBinding_Vars() {
		return (EReference)tupleBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Exp() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryExpression_Op() {
		return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableBinding() {
		return variableBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableBinding_Vars() {
		return (EReference)variableBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableBinding_Domain() {
		return (EReference)variableBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteln() {
		return writelnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriteln_String() {
		return (EAttribute)writelnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriteln_Arg() {
		return (EAttribute)writelnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggOp() {
		return aggOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryOp() {
		return binaryOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalOp() {
		return logicalOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMembershipOp() {
		return membershipOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOptimizationMode() {
		return optimizationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuantifier() {
		return quantifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationalOp() {
		return relationalOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSetOp() {
		return setOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnaryOp() {
		return unaryOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdentifier() {
		return identifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimepoint() {
		return timepointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPLmetamodelFactory getOPLmetamodelFactory() {
		return (OPLmetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractBinaryOperatorEClass = createEClass(ABSTRACT_BINARY_OPERATOR);

		abstractTypeEClass = createEClass(ABSTRACT_TYPE);

		activityDeclarationEClass = createEClass(ACTIVITY_DECLARATION);
		createEReference(activityDeclarationEClass, ACTIVITY_DECLARATION__DURATION);
		createEAttribute(activityDeclarationEClass, ACTIVITY_DECLARATION__EARLIEST_START_TIME);
		createEAttribute(activityDeclarationEClass, ACTIVITY_DECLARATION__LATEST_END_TIME);

		aggregateExpEClass = createEClass(AGGREGATE_EXP);
		createEAttribute(aggregateExpEClass, AGGREGATE_EXP__OP);
		createEReference(aggregateExpEClass, AGGREGATE_EXP__PARAMETERS);
		createEReference(aggregateExpEClass, AGGREGATE_EXP__BODY);

		allExpressionEClass = createEClass(ALL_EXPRESSION);
		createEReference(allExpressionEClass, ALL_EXPRESSION__QUALIFIERS);
		createEReference(allExpressionEClass, ALL_EXPRESSION__BODY);

		arrayDereferenceEClass = createEClass(ARRAY_DEREFERENCE);
		createEReference(arrayDereferenceEClass, ARRAY_DEREFERENCE__ARRAY);
		createEReference(arrayDereferenceEClass, ARRAY_DEREFERENCE__INDEX);

		arraySlotConstraintEClass = createEClass(ARRAY_SLOT_CONSTRAINT);
		createEReference(arraySlotConstraintEClass, ARRAY_SLOT_CONSTRAINT__TARGET);

		arrayTypeEClass = createEClass(ARRAY_TYPE);
		createEReference(arrayTypeEClass, ARRAY_TYPE__BASE_TYPE);
		createEReference(arrayTypeEClass, ARRAY_TYPE__SUBSCRIPTS);

		arrayValueEClass = createEClass(ARRAY_VALUE);
		createEReference(arrayValueEClass, ARRAY_VALUE__ITEMS);

		assertionEClass = createEClass(ASSERTION);
		createEReference(assertionEClass, ASSERTION__EXP);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LHS);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RHS);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__OP);

		binaryOperatorEClass = createEClass(BINARY_OPERATOR);
		createEAttribute(binaryOperatorEClass, BINARY_OPERATOR__OP);

		bindingRefEClass = createEClass(BINDING_REF);

		blockExpressionEClass = createEClass(BLOCK_EXPRESSION);
		createEReference(blockExpressionEClass, BLOCK_EXPRESSION__BLOCKS);

		booleanBlockEClass = createEClass(BOOLEAN_BLOCK);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);
		createEAttribute(booleanExpressionEClass, BOOLEAN_EXPRESSION__BODY);

		booleanTypeEClass = createEClass(BOOLEAN_TYPE);

		builtInFunctionEClass = createEClass(BUILT_IN_FUNCTION);

		collectionExpressionEClass = createEClass(COLLECTION_EXPRESSION);
		createEAttribute(collectionExpressionEClass, COLLECTION_EXPRESSION__IS_UNIQUE);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__NAME);
		createEReference(constraintEClass, CONSTRAINT__EXP);

		comprehensionEClass = createEClass(COMPREHENSION);

		cumulativeFunctionEClass = createEClass(CUMULATIVE_FUNCTION);

		dataDeclarationEClass = createEClass(DATA_DECLARATION);
		createEReference(dataDeclarationEClass, DATA_DECLARATION__VARIABLE);
		createEReference(dataDeclarationEClass, DATA_DECLARATION__TYPE);
		createEAttribute(dataDeclarationEClass, DATA_DECLARATION__IS_DECISION_VAR);
		createEAttribute(dataDeclarationEClass, DATA_DECLARATION__IS_DECISION_EXPR);
		createEReference(dataDeclarationEClass, DATA_DECLARATION__VALUE);
		createEReference(dataDeclarationEClass, DATA_DECLARATION__VALUE_CONSTRAINT);

		dataInitMethodsEClass = createEClass(DATA_INIT_METHODS);

		dataObjectEClass = createEClass(DATA_OBJECT);
		createEAttribute(dataObjectEClass, DATA_OBJECT__BODY);

		dataRefEClass = createEClass(DATA_REF);

		declarationEClass = createEClass(DECLARATION);
		createEAttribute(declarationEClass, DECLARATION__ORDER);

		deferredInitEClass = createEClass(DEFERRED_INIT);

		definedTypeEClass = createEClass(DEFINED_TYPE);

		displayInstructionEClass = createEClass(DISPLAY_INSTRUCTION);
		createEReference(displayInstructionEClass, DISPLAY_INSTRUCTION__EXPS);
		createEReference(displayInstructionEClass, DISPLAY_INSTRUCTION__PARAMETERS);

		enumerationTypeEClass = createEClass(ENUMERATION_TYPE);
		createEReference(enumerationTypeEClass, ENUMERATION_TYPE__REDEFINED_BASE_TYPE);

		enumLiteralEClass = createEClass(ENUM_LITERAL);

		entityEClass = createEClass(ENTITY);

		errorEClass = createEClass(ERROR);

		expressionEClass = createEClass(EXPRESSION);

		floatRangeTypeEClass = createEClass(FLOAT_RANGE_TYPE);

		floatTypeEClass = createEClass(FLOAT_TYPE);

		formalParameterEClass = createEClass(FORMAL_PARAMETER);
		createEReference(formalParameterEClass, FORMAL_PARAMETER__DOMAIN);
		createEReference(formalParameterEClass, FORMAL_PARAMETER__BOUND_VARS);
		createEAttribute(formalParameterEClass, FORMAL_PARAMETER__IS_ORDERED);
		createEReference(formalParameterEClass, FORMAL_PARAMETER__REQUIRE);

		extensionEClass = createEClass(EXTENSION);
		createEReference(extensionEClass, EXTENSION__EXPS);

		floatExpressionEClass = createEClass(FLOAT_EXPRESSION);
		createEAttribute(floatExpressionEClass, FLOAT_EXPRESSION__BODY);

		forAllConstraintEClass = createEClass(FOR_ALL_CONSTRAINT);
		createEReference(forAllConstraintEClass, FOR_ALL_CONSTRAINT__QUALIFIERS);
		createEReference(forAllConstraintEClass, FOR_ALL_CONSTRAINT__EXPS);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__NAME);
		createEReference(functionEClass, FUNCTION__BODY);
		createEReference(functionEClass, FUNCTION__PARAMETERS);

		functionCallEClass = createEClass(FUNCTION_CALL);
		createEAttribute(functionCallEClass, FUNCTION_CALL__FUNCTION_NAME);
		createEReference(functionCallEClass, FUNCTION_CALL__ARGS);

		functionRefEClass = createEClass(FUNCTION_REF);
		createEAttribute(functionRefEClass, FUNCTION_REF__NAME);

		ifConstraintEClass = createEClass(IF_CONSTRAINT);
		createEReference(ifConstraintEClass, IF_CONSTRAINT__TEST);
		createEReference(ifConstraintEClass, IF_CONSTRAINT__THEN);
		createEReference(ifConstraintEClass, IF_CONSTRAINT__ELSE);

		ifExpressionEClass = createEClass(IF_EXPRESSION);
		createEReference(ifExpressionEClass, IF_EXPRESSION__TEST);
		createEReference(ifExpressionEClass, IF_EXPRESSION__THEN);
		createEReference(ifExpressionEClass, IF_EXPRESSION__ELSE);

		inEClass = createEClass(IN);

		integerTypeEClass = createEClass(INTEGER_TYPE);

		initializationEClass = createEClass(INITIALIZATION);

		intervalEClass = createEClass(INTERVAL);
		createEAttribute(intervalEClass, INTERVAL__IS_OPTIONAL);
		createEReference(intervalEClass, INTERVAL__BOUNDS);
		createEReference(intervalEClass, INTERVAL__SIZE);
		createEReference(intervalEClass, INTERVAL__INTENSITY);

		integerExpressionEClass = createEClass(INTEGER_EXPRESSION);
		createEAttribute(integerExpressionEClass, INTEGER_EXPRESSION__BODY);

		integerRangeTypeEClass = createEClass(INTEGER_RANGE_TYPE);

		indexValuePairEClass = createEClass(INDEX_VALUE_PAIR);
		createEReference(indexValuePairEClass, INDEX_VALUE_PAIR__INDEX);
		createEReference(indexValuePairEClass, INDEX_VALUE_PAIR__VALUE);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__ID);
		createEAttribute(modelEClass, MODEL__IS_CONSTRAINT_PROBLEM);
		createEReference(modelEClass, MODEL__TYPES);
		createEReference(modelEClass, MODEL__DATA);
		createEReference(modelEClass, MODEL__CONSTRAINTS);
		createEReference(modelEClass, MODEL__INSTRUCTION);
		createEReference(modelEClass, MODEL__FUNCTIONS);
		createEReference(modelEClass, MODEL__ACTIVITIES);
		createEReference(modelEClass, MODEL__RESOURCES);
		createEReference(modelEClass, MODEL__ASSERTIONS);
		createEReference(modelEClass, MODEL__SCHEDULE_INIT);
		createEReference(modelEClass, MODEL__SCRIPTS);
		createEReference(modelEClass, MODEL__SETTINGS);
		createEReference(modelEClass, MODEL__DECLARATIONS);
		createEReference(modelEClass, MODEL__SEARCH);

		numberEClass = createEClass(NUMBER);

		numericExpressionEClass = createEClass(NUMERIC_EXPRESSION);

		numericTypeEClass = createEClass(NUMERIC_TYPE);

		objectiveEClass = createEClass(OBJECTIVE);
		createEAttribute(objectiveEClass, OBJECTIVE__ACTION);
		createEReference(objectiveEClass, OBJECTIVE__EXPRESSION);
		createEAttribute(objectiveEClass, OBJECTIVE__IS_LINEAR_RELAXATION);

		operatorEClass = createEClass(OPERATOR);

		parameterDeclarationEClass = createEClass(PARAMETER_DECLARATION);

		parameterDomainEClass = createEClass(PARAMETER_DOMAIN);

		parameterRefEClass = createEClass(PARAMETER_REF);

		pathDereferenceEClass = createEClass(PATH_DEREFERENCE);
		createEReference(pathDereferenceEClass, PATH_DEREFERENCE__DEREF);
		createEReference(pathDereferenceEClass, PATH_DEREFERENCE__BASE);

		pathExpressionEClass = createEClass(PATH_EXPRESSION);

		piecewiseExpressionEClass = createEClass(PIECEWISE_EXPRESSION);

		piecewiseLinearFunctionEClass = createEClass(PIECEWISE_LINEAR_FUNCTION);

		positiveFloatTypeEClass = createEClass(POSITIVE_FLOAT_TYPE);

		primitiveExpressionEClass = createEClass(PRIMITIVE_EXPRESSION);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		positiveIntegerTypeEClass = createEClass(POSITIVE_INTEGER_TYPE);

		queryUserEClass = createEClass(QUERY_USER);
		createEAttribute(queryUserEClass, QUERY_USER__ASK);

		rangeExpressionEClass = createEClass(RANGE_EXPRESSION);
		createEReference(rangeExpressionEClass, RANGE_EXPRESSION__LOWER_LIMIT);
		createEReference(rangeExpressionEClass, RANGE_EXPRESSION__UPPER_LIMIT);
		createEReference(rangeExpressionEClass, RANGE_EXPRESSION__TYPE);

		rangeTypeEClass = createEClass(RANGE_TYPE);
		createEReference(rangeTypeEClass, RANGE_TYPE__UPPER_BOUND);
		createEReference(rangeTypeEClass, RANGE_TYPE__LOWER_BOUND);

		readFileEClass = createEClass(READ_FILE);
		createEAttribute(readFileEClass, READ_FILE__PATH);

		recordEClass = createEClass(RECORD);
		createEAttribute(recordEClass, RECORD__NAME);
		createEReference(recordEClass, RECORD__FIELDS);
		createEAttribute(recordEClass, RECORD__IS_TUPLE);

		recordFieldEClass = createEClass(RECORD_FIELD);
		createEAttribute(recordFieldEClass, RECORD_FIELD__NAME);
		createEReference(recordFieldEClass, RECORD_FIELD__TYPE);

		recordValueEClass = createEClass(RECORD_VALUE);
		createEReference(recordValueEClass, RECORD_VALUE__FIELD_PAIRS);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__NAME);

		reflectiveFunctionEClass = createEClass(REFLECTIVE_FUNCTION);

		relationalExpressionEClass = createEClass(RELATIONAL_EXPRESSION);
		createEAttribute(relationalExpressionEClass, RELATIONAL_EXPRESSION__REDEFINED_OP);

		relationalInitEClass = createEClass(RELATIONAL_INIT);
		createEReference(relationalInitEClass, RELATIONAL_INIT__BINDING_VAR);
		createEReference(relationalInitEClass, RELATIONAL_INIT__SOURCES);
		createEReference(relationalInitEClass, RELATIONAL_INIT__RELATION);

		relationalOperatorEClass = createEClass(RELATIONAL_OPERATOR);
		createEAttribute(relationalOperatorEClass, RELATIONAL_OPERATOR__OP);

		resourceDeclarationEClass = createEClass(RESOURCE_DECLARATION);

		scheduleInitializationEClass = createEClass(SCHEDULE_INITIALIZATION);

		scriptEClass = createEClass(SCRIPT);
		createEReference(scriptEClass, SCRIPT__ID);
		createEAttribute(scriptEClass, SCRIPT__IS_MAIN);
		createEReference(scriptEClass, SCRIPT__STATEMENTS);

		scriptStatementEClass = createEClass(SCRIPT_STATEMENT);

		searchProcedureEClass = createEClass(SEARCH_PROCEDURE);

		sequenceEClass = createEClass(SEQUENCE);
		createEReference(sequenceEClass, SEQUENCE__INTERVALS);
		createEReference(sequenceEClass, SEQUENCE__TYPES);

		settingEClass = createEClass(SETTING);

		setTypeEClass = createEClass(SET_TYPE);
		createEAttribute(setTypeEClass, SET_TYPE__NAME);
		createEReference(setTypeEClass, SET_TYPE__BASE_TYPE);
		createEReference(setTypeEClass, SET_TYPE__ELEMENTS);

		setValueEClass = createEClass(SET_VALUE);
		createEReference(setValueEClass, SET_VALUE__ITEMS);

		stateFunctionEClass = createEClass(STATE_FUNCTION);
		createEReference(stateFunctionEClass, STATE_FUNCTION__TRANSITION_MATRIX);

		stepFunctionEClass = createEClass(STEP_FUNCTION);

		stringExpressionEClass = createEClass(STRING_EXPRESSION);
		createEAttribute(stringExpressionEClass, STRING_EXPRESSION__BODY);

		stringTypeEClass = createEClass(STRING_TYPE);

		tupleBindingEClass = createEClass(TUPLE_BINDING);
		createEReference(tupleBindingEClass, TUPLE_BINDING__VARS);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__EXP);
		createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__OP);

		variableBindingEClass = createEClass(VARIABLE_BINDING);
		createEReference(variableBindingEClass, VARIABLE_BINDING__VARS);
		createEReference(variableBindingEClass, VARIABLE_BINDING__DOMAIN);

		writelnEClass = createEClass(WRITELN);
		createEAttribute(writelnEClass, WRITELN__STRING);
		createEAttribute(writelnEClass, WRITELN__ARG);

		// Create enums
		aggOpEEnum = createEEnum(AGG_OP);
		binaryOpEEnum = createEEnum(BINARY_OP);
		logicalOpEEnum = createEEnum(LOGICAL_OP);
		membershipOpEEnum = createEEnum(MEMBERSHIP_OP);
		optimizationModeEEnum = createEEnum(OPTIMIZATION_MODE);
		quantifierEEnum = createEEnum(QUANTIFIER);
		relationalOpEEnum = createEEnum(RELATIONAL_OP);
		setOpEEnum = createEEnum(SET_OP);
		unaryOpEEnum = createEEnum(UNARY_OP);

		// Create data types
		identifierEDataType = createEDataType(IDENTIFIER);
		timepointEDataType = createEDataType(TIMEPOINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		aggregateExpEClass.getESuperTypes().add(this.getExpression());
		arrayDereferenceEClass.getESuperTypes().add(this.getPathExpression());
		arraySlotConstraintEClass.getESuperTypes().add(this.getExpression());
		arrayTypeEClass.getESuperTypes().add(this.getDefinedType());
		arrayValueEClass.getESuperTypes().add(this.getExpression());
		assertionEClass.getESuperTypes().add(this.getDeclaration());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		binaryOperatorEClass.getESuperTypes().add(this.getAbstractBinaryOperator());
		bindingRefEClass.getESuperTypes().add(this.getReference());
		blockExpressionEClass.getESuperTypes().add(this.getExpression());
		booleanExpressionEClass.getESuperTypes().add(this.getPrimitiveExpression());
		booleanTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		builtInFunctionEClass.getESuperTypes().add(this.getFunction());
		collectionExpressionEClass.getESuperTypes().add(this.getExpression());
		constraintEClass.getESuperTypes().add(this.getDeclaration());
		comprehensionEClass.getESuperTypes().add(this.getCollectionExpression());
		cumulativeFunctionEClass.getESuperTypes().add(this.getFunction());
		dataDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		dataObjectEClass.getESuperTypes().add(this.getInitialization());
		dataRefEClass.getESuperTypes().add(this.getReference());
		definedTypeEClass.getESuperTypes().add(this.getAbstractType());
		definedTypeEClass.getESuperTypes().add(this.getDeclaration());
		enumerationTypeEClass.getESuperTypes().add(this.getSetType());
		enumLiteralEClass.getESuperTypes().add(this.getPrimitiveType());
		enumLiteralEClass.getESuperTypes().add(this.getPrimitiveExpression());
		floatRangeTypeEClass.getESuperTypes().add(this.getFloatType());
		floatRangeTypeEClass.getESuperTypes().add(this.getRangeType());
		floatTypeEClass.getESuperTypes().add(this.getNumericType());
		extensionEClass.getESuperTypes().add(this.getCollectionExpression());
		floatExpressionEClass.getESuperTypes().add(this.getNumericExpression());
		forAllConstraintEClass.getESuperTypes().add(this.getConstraint());
		functionEClass.getESuperTypes().add(this.getDeclaration());
		functionCallEClass.getESuperTypes().add(this.getPathExpression());
		ifConstraintEClass.getESuperTypes().add(this.getConstraint());
		ifExpressionEClass.getESuperTypes().add(this.getExpression());
		integerTypeEClass.getESuperTypes().add(this.getNumericType());
		integerExpressionEClass.getESuperTypes().add(this.getNumericExpression());
		integerRangeTypeEClass.getESuperTypes().add(this.getIntegerType());
		integerRangeTypeEClass.getESuperTypes().add(this.getRangeType());
		indexValuePairEClass.getESuperTypes().add(this.getExpression());
		numericExpressionEClass.getESuperTypes().add(this.getPrimitiveExpression());
		numericTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		objectiveEClass.getESuperTypes().add(this.getDeclaration());
		parameterRefEClass.getESuperTypes().add(this.getReference());
		pathDereferenceEClass.getESuperTypes().add(this.getPathExpression());
		pathExpressionEClass.getESuperTypes().add(this.getExpression());
		piecewiseLinearFunctionEClass.getESuperTypes().add(this.getFunction());
		positiveFloatTypeEClass.getESuperTypes().add(this.getFloatType());
		primitiveExpressionEClass.getESuperTypes().add(this.getExpression());
		primitiveTypeEClass.getESuperTypes().add(this.getAbstractType());
		positiveIntegerTypeEClass.getESuperTypes().add(this.getIntegerType());
		queryUserEClass.getESuperTypes().add(this.getDataInitMethods());
		rangeExpressionEClass.getESuperTypes().add(this.getNumericExpression());
		rangeTypeEClass.getESuperTypes().add(this.getSetType());
		readFileEClass.getESuperTypes().add(this.getDataInitMethods());
		recordEClass.getESuperTypes().add(this.getParameterDomain());
		recordEClass.getESuperTypes().add(this.getDefinedType());
		recordValueEClass.getESuperTypes().add(this.getExpression());
		referenceEClass.getESuperTypes().add(this.getExpression());
		reflectiveFunctionEClass.getESuperTypes().add(this.getBuiltInFunction());
		relationalExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		relationalExpressionEClass.getESuperTypes().add(this.getBooleanExpression());
		relationalInitEClass.getESuperTypes().add(this.getInitialization());
		relationalOperatorEClass.getESuperTypes().add(this.getAbstractBinaryOperator());
		resourceDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		scheduleInitializationEClass.getESuperTypes().add(this.getDeclaration());
		scriptEClass.getESuperTypes().add(this.getDeclaration());
		settingEClass.getESuperTypes().add(this.getDeclaration());
		setTypeEClass.getESuperTypes().add(this.getDefinedType());
		setTypeEClass.getESuperTypes().add(this.getParameterDomain());
		setValueEClass.getESuperTypes().add(this.getExpression());
		stateFunctionEClass.getESuperTypes().add(this.getFunction());
		stepFunctionEClass.getESuperTypes().add(this.getPiecewiseLinearFunction());
		stringExpressionEClass.getESuperTypes().add(this.getPrimitiveExpression());
		stringTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		writelnEClass.getESuperTypes().add(this.getScriptStatement());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractBinaryOperatorEClass, AbstractBinaryOperator.class, "AbstractBinaryOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractTypeEClass, AbstractType.class, "AbstractType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityDeclarationEClass, ActivityDeclaration.class, "ActivityDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityDeclaration_Duration(), this.getNumber(), null, "duration", null, 1, 1, ActivityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActivityDeclaration_EarliestStartTime(), this.getTimepoint(), "earliestStartTime", null, 0, 1, ActivityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDeclaration_LatestEndTime(), this.getTimepoint(), "latestEndTime", null, 0, 1, ActivityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregateExpEClass, AggregateExp.class, "AggregateExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAggregateExp_Op(), this.getAggOp(), "op", null, 1, 1, AggregateExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAggregateExp_Parameters(), this.getFormalParameter(), null, "parameters", null, 1, -1, AggregateExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAggregateExp_Body(), this.getExpression(), null, "body", null, 1, 1, AggregateExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(allExpressionEClass, AllExpression.class, "AllExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllExpression_Qualifiers(), this.getFormalParameter(), null, "qualifiers", null, 1, -1, AllExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAllExpression_Body(), this.getExpression(), null, "body", null, 1, 1, AllExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arrayDereferenceEClass, ArrayDereference.class, "ArrayDereference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayDereference_Array(), this.getPathExpression(), null, "array", null, 1, 1, ArrayDereference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArrayDereference_Index(), this.getExpression(), null, "index", null, 1, -1, ArrayDereference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arraySlotConstraintEClass, ArraySlotConstraint.class, "ArraySlotConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArraySlotConstraint_Target(), this.getArrayDereference(), null, "target", null, 1, 1, ArraySlotConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayType_BaseType(), this.getAbstractType(), null, "baseType", null, 1, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArrayType_Subscripts(), this.getDataRef(), null, "subscripts", null, 1, -1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arrayValueEClass, ArrayValue.class, "ArrayValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayValue_Items(), this.getExpression(), null, "items", null, 0, -1, ArrayValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assertionEClass, Assertion.class, "Assertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssertion_Exp(), this.getConstraint(), null, "exp", null, 1, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_Lhs(), this.getExpression(), null, "lhs", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBinaryExpression_Rhs(), this.getExpression(), null, "rhs", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBinaryExpression_Op(), this.getAbstractBinaryOperator(), null, "op", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryOperatorEClass, BinaryOperator.class, "BinaryOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryOperator_Op(), this.getBinaryOp(), "op", null, 1, 1, BinaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingRefEClass, BindingRef.class, "BindingRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockExpressionEClass, BlockExpression.class, "BlockExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockExpression_Blocks(), this.getBooleanBlock(), null, "blocks", null, 1, 1, BlockExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(booleanBlockEClass, BooleanBlock.class, "BooleanBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanExpression_Body(), ecorePackage.getEString(), "body", null, 1, 1, BooleanExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(builtInFunctionEClass, BuiltInFunction.class, "BuiltInFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionExpressionEClass, CollectionExpression.class, "CollectionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectionExpression_IsUnique(), ecorePackage.getEBoolean(), "isUnique", "false", 1, 1, CollectionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraint_Exp(), this.getExpression(), null, "exp", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(comprehensionEClass, Comprehension.class, "Comprehension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cumulativeFunctionEClass, CumulativeFunction.class, "CumulativeFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataDeclarationEClass, DataDeclaration.class, "DataDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataDeclaration_Variable(), this.getDataRef(), null, "variable", null, 1, 1, DataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataDeclaration_Type(), this.getAbstractType(), null, "type", null, 1, 1, DataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataDeclaration_IsDecisionVar(), ecorePackage.getEBoolean(), "isDecisionVar", null, 1, 1, DataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataDeclaration_IsDecisionExpr(), ecorePackage.getEBoolean(), "isDecisionExpr", null, 1, 1, DataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataDeclaration_Value(), this.getInitialization(), null, "value", null, 0, 1, DataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataDeclaration_ValueConstraint(), this.getExpression(), null, "valueConstraint", null, 0, 1, DataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataInitMethodsEClass, DataInitMethods.class, "DataInitMethods", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataObjectEClass, DataObject.class, "DataObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataObject_Body(), ecorePackage.getEString(), "body", null, 1, 1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRefEClass, DataRef.class, "DataRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeclaration_Order(), ecorePackage.getEInt(), "order", null, 1, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deferredInitEClass, DeferredInit.class, "DeferredInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(definedTypeEClass, DefinedType.class, "DefinedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(displayInstructionEClass, DisplayInstruction.class, "DisplayInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisplayInstruction_Exps(), this.getExpression(), null, "exps", null, 0, -1, DisplayInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDisplayInstruction_Parameters(), this.getParameterDeclaration(), null, "parameters", null, 0, -1, DisplayInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(enumerationTypeEClass, EnumerationType.class, "EnumerationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationType_RedefinedBaseType(), this.getEnumLiteral(), null, "redefinedBaseType", null, 1, 1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(enumLiteralEClass, EnumLiteral.class, "EnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorEClass, OPLmetamodel.Error.class, "Error", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floatRangeTypeEClass, FloatRangeType.class, "FloatRangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floatTypeEClass, FloatType.class, "FloatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formalParameterEClass, FormalParameter.class, "FormalParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormalParameter_Domain(), this.getParameterDomain(), null, "domain", null, 1, 1, FormalParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFormalParameter_BoundVars(), this.getBindingRef(), null, "boundVars", null, 0, -1, FormalParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFormalParameter_IsOrdered(), ecorePackage.getEBoolean(), "isOrdered", null, 1, 1, FormalParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFormalParameter_Require(), this.getExpression(), null, "require", null, 0, 1, FormalParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtension_Exps(), this.getExpression(), null, "exps", null, 0, -1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(floatExpressionEClass, FloatExpression.class, "FloatExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatExpression_Body(), ecorePackage.getEString(), "body", null, 1, 1, FloatExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forAllConstraintEClass, ForAllConstraint.class, "ForAllConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForAllConstraint_Qualifiers(), this.getFormalParameter(), null, "qualifiers", null, 1, -1, ForAllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getForAllConstraint_Exps(), this.getConstraint(), null, "exps", null, 1, -1, ForAllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Name(), this.getFunctionRef(), null, "name", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFunction_Body(), this.getExpression(), null, "body", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFunction_Parameters(), this.getReference(), null, "parameters", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(functionCallEClass, FunctionCall.class, "FunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionCall_FunctionName(), this.getIdentifier(), "functionName", null, 1, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFunctionCall_Args(), this.getExpression(), null, "args", null, 0, -1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(functionRefEClass, FunctionRef.class, "FunctionRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionRef_Name(), ecorePackage.getEString(), "name", null, 1, 1, FunctionRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ifConstraintEClass, IfConstraint.class, "IfConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfConstraint_Test(), this.getBooleanExpression(), null, "test", null, 1, 1, IfConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIfConstraint_Then(), this.getConstraint(), null, "then", null, 1, 1, IfConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIfConstraint_Else(), this.getConstraint(), null, "else", null, 0, 1, IfConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ifExpressionEClass, IfExpression.class, "IfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfExpression_Test(), this.getBooleanExpression(), null, "test", null, 1, 1, IfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIfExpression_Then(), this.getExpression(), null, "then", null, 1, 1, IfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIfExpression_Else(), this.getExpression(), null, "else", null, 0, 1, IfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inEClass, In.class, "In", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerTypeEClass, IntegerType.class, "IntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initializationEClass, Initialization.class, "Initialization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intervalEClass, Interval.class, "Interval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterval_IsOptional(), ecorePackage.getEBoolean(), "isOptional", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterval_Bounds(), this.getRangeType(), null, "bounds", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterval_Size(), this.getNumericType(), null, "size", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterval_Intensity(), this.getStepFunction(), null, "intensity", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(integerExpressionEClass, IntegerExpression.class, "IntegerExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerExpression_Body(), ecorePackage.getEString(), "body", null, 1, 1, IntegerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerRangeTypeEClass, IntegerRangeType.class, "IntegerRangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(indexValuePairEClass, IndexValuePair.class, "IndexValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndexValuePair_Index(), this.getExpression(), null, "index", null, 1, 1, IndexValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIndexValuePair_Value(), this.getExpression(), null, "value", null, 1, 1, IndexValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Id(), this.getIdentifier(), "id", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModel_IsConstraintProblem(), ecorePackage.getEBoolean(), "isConstraintProblem", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModel_Types(), this.getDefinedType(), null, "types", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModel_Data(), this.getDataDeclaration(), null, "data", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModel_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModel_Instruction(), this.getObjective(), null, "instruction", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModel_Functions(), this.getFunction(), null, "functions", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModel_Activities(), this.getActivityDeclaration(), null, "activities", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModel_Resources(), this.getResourceDeclaration(), null, "resources", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModel_Assertions(), this.getConstraint(), null, "assertions", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModel_ScheduleInit(), this.getScheduleInitialization(), null, "scheduleInit", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModel_Scripts(), this.getScript(), null, "scripts", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModel_Settings(), this.getSetting(), null, "settings", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModel_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Search(), this.getSearchProcedure(), null, "search", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(numberEClass, OPLmetamodel.Number.class, "Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericExpressionEClass, NumericExpression.class, "NumericExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericTypeEClass, NumericType.class, "NumericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectiveEClass, Objective.class, "Objective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjective_Action(), this.getOptimizationMode(), "action", null, 1, 1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjective_Expression(), this.getExpression(), null, "expression", null, 1, 1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getObjective_IsLinearRelaxation(), ecorePackage.getEBoolean(), "isLinearRelaxation", null, 1, 1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterDeclarationEClass, ParameterDeclaration.class, "ParameterDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterDomainEClass, ParameterDomain.class, "ParameterDomain", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterRefEClass, ParameterRef.class, "ParameterRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pathDereferenceEClass, PathDereference.class, "PathDereference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathDereference_Deref(), this.getReference(), null, "deref", null, 1, 1, PathDereference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPathDereference_Base(), this.getPathExpression(), null, "base", null, 0, 1, PathDereference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pathExpressionEClass, PathExpression.class, "PathExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(piecewiseExpressionEClass, PiecewiseExpression.class, "PiecewiseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(piecewiseLinearFunctionEClass, PiecewiseLinearFunction.class, "PiecewiseLinearFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveFloatTypeEClass, PositiveFloatType.class, "PositiveFloatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveExpressionEClass, PrimitiveExpression.class, "PrimitiveExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveIntegerTypeEClass, PositiveIntegerType.class, "PositiveIntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryUserEClass, QueryUser.class, "QueryUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryUser_Ask(), ecorePackage.getEString(), "ask", null, 1, 1, QueryUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rangeExpressionEClass, RangeExpression.class, "RangeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRangeExpression_LowerLimit(), this.getNumericExpression(), null, "lowerLimit", null, 1, 1, RangeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRangeExpression_UpperLimit(), this.getNumericExpression(), null, "upperLimit", null, 1, 1, RangeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRangeExpression_Type(), this.getNumericType(), null, "type", null, 0, 1, RangeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rangeTypeEClass, RangeType.class, "RangeType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRangeType_UpperBound(), this.getNumericType(), null, "upperBound", null, 1, 1, RangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRangeType_LowerBound(), this.getNumericType(), null, "lowerBound", null, 1, 1, RangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(readFileEClass, ReadFile.class, "ReadFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReadFile_Path(), ecorePackage.getEString(), "path", null, 1, 1, ReadFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(recordEClass, Record.class, "Record", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecord_Name(), this.getIdentifier(), "name", null, 1, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRecord_Fields(), this.getRecordField(), null, "fields", null, 0, -1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecord_IsTuple(), ecorePackage.getEBoolean(), "isTuple", null, 1, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(recordFieldEClass, RecordField.class, "RecordField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecordField_Name(), this.getIdentifier(), "name", null, 1, 1, RecordField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRecordField_Type(), this.getAbstractType(), null, "type", null, 1, 1, RecordField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(recordValueEClass, RecordValue.class, "RecordValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordValue_FieldPairs(), this.getIndexValuePair(), null, "fieldPairs", null, 0, -1, RecordValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_Name(), this.getIdentifier(), "name", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reflectiveFunctionEClass, ReflectiveFunction.class, "ReflectiveFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationalExpressionEClass, RelationalExpression.class, "RelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalExpression_RedefinedOp(), this.getRelationalOp(), "redefinedOp", null, 1, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationalInitEClass, RelationalInit.class, "RelationalInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalInit_BindingVar(), this.getBindingRef(), null, "bindingVar", null, 1, 1, RelationalInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationalInit_Sources(), this.getVariableBinding(), null, "sources", null, 1, 1, RelationalInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationalInit_Relation(), this.getRelationalExpression(), null, "relation", null, 1, 1, RelationalInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationalOperatorEClass, RelationalOperator.class, "RelationalOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalOperator_Op(), this.getRelationalOp(), "op", null, 1, 1, RelationalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceDeclarationEClass, ResourceDeclaration.class, "ResourceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scheduleInitializationEClass, ScheduleInitialization.class, "ScheduleInitialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScript_Id(), this.getReference(), null, "id", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getScript_IsMain(), ecorePackage.getEBoolean(), "isMain", null, 1, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScript_Statements(), this.getScriptStatement(), null, "statements", null, 1, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(scriptStatementEClass, ScriptStatement.class, "ScriptStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(searchProcedureEClass, SearchProcedure.class, "SearchProcedure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequence_Intervals(), this.getInterval(), null, "intervals", null, 2, -1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSequence_Types(), this.getDefinedType(), null, "types", null, 1, 1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(settingEClass, Setting.class, "Setting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setTypeEClass, SetType.class, "SetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetType_Name(), this.getIdentifier(), "name", null, 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSetType_BaseType(), this.getAbstractType(), null, "baseType", null, 1, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSetType_Elements(), this.getEntity(), null, "elements", null, 0, -1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(setValueEClass, SetValue.class, "SetValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetValue_Items(), this.getExpression(), null, "items", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stateFunctionEClass, StateFunction.class, "StateFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateFunction_TransitionMatrix(), this.getSetType(), null, "transitionMatrix", null, 0, 1, StateFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepFunctionEClass, StepFunction.class, "StepFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringExpressionEClass, StringExpression.class, "StringExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringExpression_Body(), ecorePackage.getEString(), "body", null, 1, 1, StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tupleBindingEClass, TupleBinding.class, "TupleBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTupleBinding_Vars(), this.getBindingRef(), null, "vars", null, 1, -1, TupleBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryExpression_Exp(), this.getExpression(), null, "exp", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnaryExpression_Op(), this.getUnaryOp(), "op", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(variableBindingEClass, VariableBinding.class, "VariableBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableBinding_Vars(), this.getBindingRef(), null, "vars", null, 1, -1, VariableBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVariableBinding_Domain(), this.getExpression(), null, "domain", null, 1, 1, VariableBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(writelnEClass, Writeln.class, "Writeln", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWriteln_String(), ecorePackage.getEString(), "string", null, 1, 1, Writeln.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWriteln_Arg(), this.getIdentifier(), "arg", null, 1, 1, Writeln.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(aggOpEEnum, AggOp.class, "AggOp");
		addEEnumLiteral(aggOpEEnum, AggOp.SUM);
		addEEnumLiteral(aggOpEEnum, AggOp.MIN);
		addEEnumLiteral(aggOpEEnum, AggOp.MAX);
		addEEnumLiteral(aggOpEEnum, AggOp.PROD);
		addEEnumLiteral(aggOpEEnum, AggOp.INTER);
		addEEnumLiteral(aggOpEEnum, AggOp.UNION);
		addEEnumLiteral(aggOpEEnum, AggOp.OR);
		addEEnumLiteral(aggOpEEnum, AggOp.AND);

		initEEnum(binaryOpEEnum, BinaryOp.class, "BinaryOp");
		addEEnumLiteral(binaryOpEEnum, BinaryOp.ADD);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.SUBTRACT);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.MULTIPLY);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.DIVIDE);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.PERCENT);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.MOD);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.INTER);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.UNION);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.DIFF);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.SYMDIFF);
		addEEnumLiteral(binaryOpEEnum, BinaryOp.POWER);

		initEEnum(logicalOpEEnum, LogicalOp.class, "LogicalOp");
		addEEnumLiteral(logicalOpEEnum, LogicalOp.NEGATION);
		addEEnumLiteral(logicalOpEEnum, LogicalOp.DISJUNCTION);
		addEEnumLiteral(logicalOpEEnum, LogicalOp.OR);
		addEEnumLiteral(logicalOpEEnum, LogicalOp.AND);
		addEEnumLiteral(logicalOpEEnum, LogicalOp.CONJUNCTION);

		initEEnum(membershipOpEEnum, MembershipOp.class, "MembershipOp");
		addEEnumLiteral(membershipOpEEnum, MembershipOp.IN);
		addEEnumLiteral(membershipOpEEnum, MembershipOp.NOT_IN);
		addEEnumLiteral(membershipOpEEnum, MembershipOp.OR);
		addEEnumLiteral(membershipOpEEnum, MembershipOp.AND);
		addEEnumLiteral(membershipOpEEnum, MembershipOp.CONJUNCTION);

		initEEnum(optimizationModeEEnum, OptimizationMode.class, "OptimizationMode");
		addEEnumLiteral(optimizationModeEEnum, OptimizationMode.MINIMIZE);
		addEEnumLiteral(optimizationModeEEnum, OptimizationMode.MAXIMIZE);
		addEEnumLiteral(optimizationModeEEnum, OptimizationMode.SOLVE);

		initEEnum(quantifierEEnum, Quantifier.class, "Quantifier");
		addEEnumLiteral(quantifierEEnum, Quantifier.FOR_ALL);

		initEEnum(relationalOpEEnum, RelationalOp.class, "RelationalOp");
		addEEnumLiteral(relationalOpEEnum, RelationalOp.GREATER_THAN);
		addEEnumLiteral(relationalOpEEnum, RelationalOp.GREATER_THAN_OR_EQUAL_TO);
		addEEnumLiteral(relationalOpEEnum, RelationalOp.LESS_THAN);
		addEEnumLiteral(relationalOpEEnum, RelationalOp.LESS_THAN_OR_EQUAL_TO);
		addEEnumLiteral(relationalOpEEnum, RelationalOp.EQUAL_TO);
		addEEnumLiteral(relationalOpEEnum, RelationalOp.NOT_EQUAL_TO);

		initEEnum(setOpEEnum, SetOp.class, "SetOp");
		addEEnumLiteral(setOpEEnum, SetOp.SYMDIFF);
		addEEnumLiteral(setOpEEnum, SetOp.DIFF);
		addEEnumLiteral(setOpEEnum, SetOp.UNION);
		addEEnumLiteral(setOpEEnum, SetOp.INTER);

		initEEnum(unaryOpEEnum, UnaryOp.class, "UnaryOp");
		addEEnumLiteral(unaryOpEEnum, UnaryOp.UNARY_MINUS);
		addEEnumLiteral(unaryOpEEnum, UnaryOp.NEGATE);

		// Initialize data types
		initEDataType(identifierEDataType, String.class, "Identifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timepointEDataType, SimpleDateFormat.class, "Timepoint", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// https://oplmetamodel.com/documentation
		createDocumentationAnnotations();
		// https://oplmetamodel.com/notes
		createNotesAnnotations();
		// https://metmodel.com/documentation
		createDocumentation_1Annotations();
		// https://metamodel.com/documentation
		createDocumentation_2Annotations();
	}

	/**
	 * Initializes the annotations for <b>https://oplmetamodel.com/documentation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocumentationAnnotations() {
		String source = "https://oplmetamodel.com/documentation";	
		addAnnotation
		  (aggOpEEnum, 
		   source, 
		   new String[] {
			 "body", "Due to the similarities of all constraints and all arithmetic terms in constraints and objective functions, aggregate operators are used in OPL to factorize these commonalities"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RelationalOp")
		   });	
		addAnnotation
		  (relationalOpEEnum, 
		   source, 
		   new String[] {
			 "body", "Due to the similarities of all constraints and all arithmetic terms in constraints and objective functions, aggregate operators are used in OPL to factorize these commonalities"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RelationalOp")
		   });	
		addAnnotation
		  (activityDeclarationEClass, 
		   source, 
		   new String[] {
			 "body", "a unit of work that is constrained to occur within the bounds defined"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActivityDeclaration")
		   });	
		addAnnotation
		  (getActivityDeclaration_Duration(), 
		   source, 
		   new String[] {
			 "body", "a quantity of time required to perform the activity associated with this declaration"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActivityDeclaration/duration")
		   });	
		addAnnotation
		  (booleanExpressionEClass, 
		   source, 
		   new String[] {
			 "body", "an Expression that evaluates to a Boolean"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//BooleanExpression")
		   });	
		addAnnotation
		  (getCollectionExpression_IsUnique(), 
		   source, 
		   new String[] {
			 "body", "isUnique determines whether the collection is a Set (isUnique = true) or an Array (isUnique = false)."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//CollectionExpression/isUnique")
		   });	
		addAnnotation
		  (getDataDeclaration_ValueConstraint(), 
		   source, 
		   new String[] {
			 "body", "An Expression (including a RangeExpression) that further constrains the value space described by .type. This is introduced by the keyword \"in.\" Example: \"dvar float Store[Months][Products] in 0..1000;\"  this property expresses the \"in 0..1000\"\r\n"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DataDeclaration/valueConstraint")
		   });	
		addAnnotation
		  (dataObjectEClass, 
		   source, 
		   new String[] {
			 "body", "A DataObject is data a metalevel below the OPL metamodel. It is an instance of an AbstractType. The value of the DataObject must conform to the type declared in the DataDeclaration. "
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DataObject")
		   });	
		addAnnotation
		  (dataRefEClass, 
		   source, 
		   new String[] {
			 "body", "a reference to a DataObject"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DataRef")
		   });	
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
			 "body", "an object of any type. "
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Entity")
		   });	
		addAnnotation
		  (expressionEClass, 
		   source, 
		   new String[] {
			 "body", "A lexical structure that may be evaluated to produce a value conforming to AbstractType."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Expression")
		   });	
		addAnnotation
		  (formalParameterEClass, 
		   source, 
		   new String[] {
			 "body", "A FormalParameter binds a set of parameters provided by .boundVars to a Domain."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FormalParameter")
		   });	
		addAnnotation
		  (functionEClass, 
		   source, 
		   new String[] {
			 "body", "A Function binds a set of parameters (.parameters) in the scope of an expression (.body) and evaluates the Expression producing a value."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Function")
		   });	
		addAnnotation
		  (getFunction_Name(), 
		   source, 
		   new String[] {
			 "body", "Function.name is a Reference associated with a Function used in making calls to the function."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Function/name")
		   });	
		addAnnotation
		  (integerExpressionEClass, 
		   source, 
		   new String[] {
			 "body", "an Expression that evalutates to an Integer."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//IntegerExpression")
		   });	
		addAnnotation
		  (getModel_Data(), 
		   source, 
		   new String[] {
			 "body", "Model.data is a property providing the DataDeclarations of the Model."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Model/data")
		   });	
		addAnnotation
		  (getModel_Declarations(), 
		   source, 
		   new String[] {
			 "body", "an ordered collection of the subtypes of Declaration that subset this property (e.g. types, data, constraints, etc.)"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Model/declarations")
		   });	
		addAnnotation
		  (numericExpressionEClass, 
		   source, 
		   new String[] {
			 "body", "an Expression that evaluates to a NumericType."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NumericExpression")
		   });	
		addAnnotation
		  (objectiveEClass, 
		   source, 
		   new String[] {
			 "body", "an expression to be satisfied or optimized by performing the analysis described by the Model"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Objective")
		   });	
		addAnnotation
		  (pathExpressionEClass, 
		   source, 
		   new String[] {
			 "body", "an Expression defining the path to a value "
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PathExpression")
		   });	
		addAnnotation
		  (primitiveExpressionEClass, 
		   source, 
		   new String[] {
			 "body", "an expression that evaluates to a Primitive"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PrimitiveExpression")
		   });	
		addAnnotation
		  (primitiveTypeEClass, 
		   source, 
		   new String[] {
			 "body", "a type descriptor for any type where the value provides identity.  "
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PrimitiveType")
		   });	
		addAnnotation
		  (rangeExpressionEClass, 
		   source, 
		   new String[] {
			 "body", "A RangeExpression is a AllRange defining the lower and upper bounds on the range."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RangeExpression")
		   });	
		addAnnotation
		  (getRangeExpression_Type(), 
		   source, 
		   new String[] {
			 "body", "FloatType for IntegerType. Used when a variable declaration explicitly "
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RangeExpression/type")
		   });	
		addAnnotation
		  (scriptStatementEClass, 
		   source, 
		   new String[] {
			 "body", "This is"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ScriptStatement")
		   });	
		addAnnotation
		  (stringExpressionEClass, 
		   source, 
		   new String[] {
			 "body", "an Expression that evaluates to a String."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//StringExpression")
		   });
	}

	/**
	 * Initializes the annotations for <b>https://oplmetamodel.com/notes</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNotesAnnotations() {
		String source = "https://oplmetamodel.com/notes";	
		addAnnotation
		  (abstractBinaryOperatorEClass, 
		   source, 
		   new String[] {
			 "body", "The Enum type cannot be abstract nor have generalization/specialization in EMF. This class serves as a substitue for the AbstractBinaryOp Enum. It allows for the enum to be abstract and for the generalization of the RelationalOp and BinaryOp Enums."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//AbstractBinaryOperator")
		   });	
		addAnnotation
		  (getBooleanExpression_Body(), 
		   source, 
		   new String[] {
			 "body", "Added to metamodel to provide body to the expression"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//BooleanExpression/body")
		   });	
		addAnnotation
		  (getDataObject_Body(), 
		   source, 
		   new String[] {
			 "body", "Added to metamodel to provide body to the data object"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DataObject/body")
		   });	
		addAnnotation
		  (getEnumerationType_RedefinedBaseType(), 
		   source, 
		   new String[] {
			 "body", "The attribut redefinedBaseType is used instead of baseType because EMF doesn\'t allow the redefining of inherited attributes."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//EnumerationType/redefinedBaseType")
		   });	
		addAnnotation
		  (getFloatExpression_Body(), 
		   source, 
		   new String[] {
			 "body", "Added to metamodel to provide body to the expression."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FloatExpression/body")
		   });	
		addAnnotation
		  (getIntegerExpression_Body(), 
		   source, 
		   new String[] {
			 "body", "Added to metamodel to provide body to the expression"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//IntegerExpression/body")
		   });	
		addAnnotation
		  (getModel_Id(), 
		   source, 
		   new String[] {
			 "body", "POD This might be a CPLEX-only thing. Or it might be wrong!"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Model/id")
		   });	
		addAnnotation
		  (getModel_Constraints(), 
		   source, 
		   new String[] {
			 "body", "POD Note: There are also constraints in the Instruction. What is this one about?"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Model/constraints")
		   });	
		addAnnotation
		  (getRelationalExpression_RedefinedOp(), 
		   source, 
		   new String[] {
			 "body", "The attribute redefinedOp is used instead of op because EMF doesn\'t allow the redefining of inherited attributes."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RelationalExpression/redefinedOp")
		   });	
		addAnnotation
		  (getSetType_Name(), 
		   source, 
		   new String[] {
			 "body", "So as to enable definition of anonymous types, .name is optional in all cases but EnumerationType (OCL or redefinition?)"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//SetType/name")
		   });	
		addAnnotation
		  (getStringExpression_Body(), 
		   source, 
		   new String[] {
			 "body", "Added to metamodel to provide body of the expression"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//StringExpression/body")
		   });
	}

	/**
	 * Initializes the annotations for <b>https://metmodel.com/documentation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocumentation_1Annotations() {
		String source = "https://metmodel.com/documentation";	
		addAnnotation
		  (abstractTypeEClass, 
		   source, 
		   new String[] {
			 "body", "The most general class of type descriptor."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//AbstractType")
		   });
	}

	/**
	 * Initializes the annotations for <b>https://metamodel.com/documentation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocumentation_2Annotations() {
		String source = "https://metamodel.com/documentation";	
		addAnnotation
		  (getDeclaration_Order(), 
		   source, 
		   new String[] {
			 "body", "the sequence number (starting at 1) in which the declaration is found in the "
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Declaration/order")
		   });
	}

	@Override
	protected Resource createResource(String uri) 
	{
		return super.createResource("..//OPL_Metamodel//OPLmetamodel.ecore");	
	}
} //OPLmetamodelPackageImpl
