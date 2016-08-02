/**
 */
package OPLmetamodel.impl;

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
import OPLmetamodel.DataObject;
import OPLmetamodel.DataRef;
import OPLmetamodel.DeferredInit;
import OPLmetamodel.DisplayInstruction;
import OPLmetamodel.Entity;
import OPLmetamodel.EnumLiteral;
import OPLmetamodel.EnumerationType;
import OPLmetamodel.Extension;
import OPLmetamodel.FloatExpression;
import OPLmetamodel.FloatRangeType;
import OPLmetamodel.FloatType;
import OPLmetamodel.ForAllConstraint;
import OPLmetamodel.FormalParameter;
import OPLmetamodel.FunctionCall;
import OPLmetamodel.FunctionRef;
import OPLmetamodel.IfConstraint;
import OPLmetamodel.IfExpression;
import OPLmetamodel.In;
import OPLmetamodel.IndexValuePair;
import OPLmetamodel.IntegerExpression;
import OPLmetamodel.IntegerRangeType;
import OPLmetamodel.IntegerType;
import OPLmetamodel.Interval;
import OPLmetamodel.LogicalOp;
import OPLmetamodel.MembershipOp;
import OPLmetamodel.Model;
import OPLmetamodel.NumericType;
import OPLmetamodel.OPLmetamodelFactory;
import OPLmetamodel.OPLmetamodelPackage;
import OPLmetamodel.Objective;
import OPLmetamodel.Operator;
import OPLmetamodel.OptimizationMode;
import OPLmetamodel.ParameterDeclaration;
import OPLmetamodel.ParameterRef;
import OPLmetamodel.PiecewiseExpression;
import OPLmetamodel.PiecewiseLinearFunction;
import OPLmetamodel.PositiveFloatType;
import OPLmetamodel.PositiveIntegerType;
import OPLmetamodel.Quantifier;
import OPLmetamodel.QueryUser;
import OPLmetamodel.RangeExpression;
import OPLmetamodel.ReadFile;
import OPLmetamodel.Record;
import OPLmetamodel.RecordField;
import OPLmetamodel.RecordValue;
import OPLmetamodel.ReflectiveFunction;
import OPLmetamodel.RelationalExpression;
import OPLmetamodel.RelationalInit;
import OPLmetamodel.RelationalOp;
import OPLmetamodel.RelationalOperator;
import OPLmetamodel.ResourceDeclaration;
import OPLmetamodel.ScheduleInitialization;
import OPLmetamodel.Script;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OPLmetamodelFactoryImpl extends EFactoryImpl implements OPLmetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OPLmetamodelFactory init() {
		try {
			OPLmetamodelFactory theOPLmetamodelFactory = (OPLmetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(OPLmetamodelPackage.eNS_URI);
			if (theOPLmetamodelFactory != null) {
				return theOPLmetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OPLmetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPLmetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OPLmetamodelPackage.ACTIVITY_DECLARATION: return createActivityDeclaration();
			case OPLmetamodelPackage.AGGREGATE_EXP: return createAggregateExp();
			case OPLmetamodelPackage.ALL_EXPRESSION: return createAllExpression();
			case OPLmetamodelPackage.ARRAY_DEREFERENCE: return createArrayDereference();
			case OPLmetamodelPackage.ARRAY_SLOT_CONSTRAINT: return createArraySlotConstraint();
			case OPLmetamodelPackage.ARRAY_TYPE: return createArrayType();
			case OPLmetamodelPackage.ARRAY_VALUE: return createArrayValue();
			case OPLmetamodelPackage.ASSERTION: return createAssertion();
			case OPLmetamodelPackage.BINARY_EXPRESSION: return createBinaryExpression();
			case OPLmetamodelPackage.BINARY_OPERATOR: return createBinaryOperator();
			case OPLmetamodelPackage.BINDING_REF: return createBindingRef();
			case OPLmetamodelPackage.BLOCK_EXPRESSION: return createBlockExpression();
			case OPLmetamodelPackage.BOOLEAN_BLOCK: return createBooleanBlock();
			case OPLmetamodelPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
			case OPLmetamodelPackage.BOOLEAN_TYPE: return createBooleanType();
			case OPLmetamodelPackage.BUILT_IN_FUNCTION: return createBuiltInFunction();
			case OPLmetamodelPackage.COLLECTION_EXPRESSION: return createCollectionExpression();
			case OPLmetamodelPackage.CONSTRAINT: return createConstraint();
			case OPLmetamodelPackage.COMPREHENSION: return createComprehension();
			case OPLmetamodelPackage.CUMULATIVE_FUNCTION: return createCumulativeFunction();
			case OPLmetamodelPackage.DATA_DECLARATION: return createDataDeclaration();
			case OPLmetamodelPackage.DATA_OBJECT: return createDataObject();
			case OPLmetamodelPackage.DATA_REF: return createDataRef();
			case OPLmetamodelPackage.DEFERRED_INIT: return createDeferredInit();
			case OPLmetamodelPackage.DISPLAY_INSTRUCTION: return createDisplayInstruction();
			case OPLmetamodelPackage.ENUMERATION_TYPE: return createEnumerationType();
			case OPLmetamodelPackage.ENUM_LITERAL: return createEnumLiteral();
			case OPLmetamodelPackage.ENTITY: return createEntity();
			case OPLmetamodelPackage.ERROR: return createError();
			case OPLmetamodelPackage.FLOAT_RANGE_TYPE: return createFloatRangeType();
			case OPLmetamodelPackage.FLOAT_TYPE: return createFloatType();
			case OPLmetamodelPackage.FORMAL_PARAMETER: return createFormalParameter();
			case OPLmetamodelPackage.EXTENSION: return createExtension();
			case OPLmetamodelPackage.FLOAT_EXPRESSION: return createFloatExpression();
			case OPLmetamodelPackage.FOR_ALL_CONSTRAINT: return createForAllConstraint();
			case OPLmetamodelPackage.FUNCTION_CALL: return createFunctionCall();
			case OPLmetamodelPackage.FUNCTION_REF: return createFunctionRef();
			case OPLmetamodelPackage.IF_CONSTRAINT: return createIfConstraint();
			case OPLmetamodelPackage.IF_EXPRESSION: return createIfExpression();
			case OPLmetamodelPackage.IN: return createIn();
			case OPLmetamodelPackage.INTEGER_TYPE: return createIntegerType();
			case OPLmetamodelPackage.INTERVAL: return createInterval();
			case OPLmetamodelPackage.INTEGER_EXPRESSION: return createIntegerExpression();
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE: return createIntegerRangeType();
			case OPLmetamodelPackage.INDEX_VALUE_PAIR: return createIndexValuePair();
			case OPLmetamodelPackage.MODEL: return createModel();
			case OPLmetamodelPackage.NUMBER: return createNumber();
			case OPLmetamodelPackage.NUMERIC_TYPE: return createNumericType();
			case OPLmetamodelPackage.OBJECTIVE: return createObjective();
			case OPLmetamodelPackage.OPERATOR: return createOperator();
			case OPLmetamodelPackage.PARAMETER_DECLARATION: return createParameterDeclaration();
			case OPLmetamodelPackage.PARAMETER_REF: return createParameterRef();
			case OPLmetamodelPackage.PIECEWISE_EXPRESSION: return createPiecewiseExpression();
			case OPLmetamodelPackage.PIECEWISE_LINEAR_FUNCTION: return createPiecewiseLinearFunction();
			case OPLmetamodelPackage.POSITIVE_FLOAT_TYPE: return createPositiveFloatType();
			case OPLmetamodelPackage.POSITIVE_INTEGER_TYPE: return createPositiveIntegerType();
			case OPLmetamodelPackage.QUERY_USER: return createQueryUser();
			case OPLmetamodelPackage.RANGE_EXPRESSION: return createRangeExpression();
			case OPLmetamodelPackage.READ_FILE: return createReadFile();
			case OPLmetamodelPackage.RECORD: return createRecord();
			case OPLmetamodelPackage.RECORD_FIELD: return createRecordField();
			case OPLmetamodelPackage.RECORD_VALUE: return createRecordValue();
			case OPLmetamodelPackage.REFLECTIVE_FUNCTION: return createReflectiveFunction();
			case OPLmetamodelPackage.RELATIONAL_EXPRESSION: return createRelationalExpression();
			case OPLmetamodelPackage.RELATIONAL_INIT: return createRelationalInit();
			case OPLmetamodelPackage.RELATIONAL_OPERATOR: return createRelationalOperator();
			case OPLmetamodelPackage.RESOURCE_DECLARATION: return createResourceDeclaration();
			case OPLmetamodelPackage.SCHEDULE_INITIALIZATION: return createScheduleInitialization();
			case OPLmetamodelPackage.SCRIPT: return createScript();
			case OPLmetamodelPackage.SEARCH_PROCEDURE: return createSearchProcedure();
			case OPLmetamodelPackage.SEQUENCE: return createSequence();
			case OPLmetamodelPackage.SETTING: return createSetting();
			case OPLmetamodelPackage.SET_TYPE: return createSetType();
			case OPLmetamodelPackage.SET_VALUE: return createSetValue();
			case OPLmetamodelPackage.STATE_FUNCTION: return createStateFunction();
			case OPLmetamodelPackage.STEP_FUNCTION: return createStepFunction();
			case OPLmetamodelPackage.STRING_EXPRESSION: return createStringExpression();
			case OPLmetamodelPackage.STRING_TYPE: return createStringType();
			case OPLmetamodelPackage.TUPLE_BINDING: return createTupleBinding();
			case OPLmetamodelPackage.UNARY_EXPRESSION: return createUnaryExpression();
			case OPLmetamodelPackage.VARIABLE_BINDING: return createVariableBinding();
			case OPLmetamodelPackage.WRITELN: return createWriteln();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OPLmetamodelPackage.AGG_OP:
				return createAggOpFromString(eDataType, initialValue);
			case OPLmetamodelPackage.BINARY_OP:
				return createBinaryOpFromString(eDataType, initialValue);
			case OPLmetamodelPackage.LOGICAL_OP:
				return createLogicalOpFromString(eDataType, initialValue);
			case OPLmetamodelPackage.MEMBERSHIP_OP:
				return createMembershipOpFromString(eDataType, initialValue);
			case OPLmetamodelPackage.OPTIMIZATION_MODE:
				return createOptimizationModeFromString(eDataType, initialValue);
			case OPLmetamodelPackage.QUANTIFIER:
				return createQuantifierFromString(eDataType, initialValue);
			case OPLmetamodelPackage.RELATIONAL_OP:
				return createRelationalOpFromString(eDataType, initialValue);
			case OPLmetamodelPackage.SET_OP:
				return createSetOpFromString(eDataType, initialValue);
			case OPLmetamodelPackage.UNARY_OP:
				return createUnaryOpFromString(eDataType, initialValue);
			case OPLmetamodelPackage.IDENTIFIER:
				return createIdentifierFromString(eDataType, initialValue);
			case OPLmetamodelPackage.TIMEPOINT:
				return createTimepointFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OPLmetamodelPackage.AGG_OP:
				return convertAggOpToString(eDataType, instanceValue);
			case OPLmetamodelPackage.BINARY_OP:
				return convertBinaryOpToString(eDataType, instanceValue);
			case OPLmetamodelPackage.LOGICAL_OP:
				return convertLogicalOpToString(eDataType, instanceValue);
			case OPLmetamodelPackage.MEMBERSHIP_OP:
				return convertMembershipOpToString(eDataType, instanceValue);
			case OPLmetamodelPackage.OPTIMIZATION_MODE:
				return convertOptimizationModeToString(eDataType, instanceValue);
			case OPLmetamodelPackage.QUANTIFIER:
				return convertQuantifierToString(eDataType, instanceValue);
			case OPLmetamodelPackage.RELATIONAL_OP:
				return convertRelationalOpToString(eDataType, instanceValue);
			case OPLmetamodelPackage.SET_OP:
				return convertSetOpToString(eDataType, instanceValue);
			case OPLmetamodelPackage.UNARY_OP:
				return convertUnaryOpToString(eDataType, instanceValue);
			case OPLmetamodelPackage.IDENTIFIER:
				return convertIdentifierToString(eDataType, instanceValue);
			case OPLmetamodelPackage.TIMEPOINT:
				return convertTimepointToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDeclaration createActivityDeclaration() {
		ActivityDeclarationImpl activityDeclaration = new ActivityDeclarationImpl();
		return activityDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateExp createAggregateExp() {
		AggregateExpImpl aggregateExp = new AggregateExpImpl();
		return aggregateExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllExpression createAllExpression() {
		AllExpressionImpl allExpression = new AllExpressionImpl();
		return allExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDereference createArrayDereference() {
		ArrayDereferenceImpl arrayDereference = new ArrayDereferenceImpl();
		return arrayDereference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArraySlotConstraint createArraySlotConstraint() {
		ArraySlotConstraintImpl arraySlotConstraint = new ArraySlotConstraintImpl();
		return arraySlotConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType createArrayType() {
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayValue createArrayValue() {
		ArrayValueImpl arrayValue = new ArrayValueImpl();
		return arrayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assertion createAssertion() {
		AssertionImpl assertion = new AssertionImpl();
		return assertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator createBinaryOperator() {
		BinaryOperatorImpl binaryOperator = new BinaryOperatorImpl();
		return binaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingRef createBindingRef() {
		BindingRefImpl bindingRef = new BindingRefImpl();
		return bindingRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockExpression createBlockExpression() {
		BlockExpressionImpl blockExpression = new BlockExpressionImpl();
		return blockExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBlock createBooleanBlock() {
		BooleanBlockImpl booleanBlock = new BooleanBlockImpl();
		return booleanBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression createBooleanExpression() {
		BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
		return booleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInFunction createBuiltInFunction() {
		BuiltInFunctionImpl builtInFunction = new BuiltInFunctionImpl();
		return builtInFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionExpression createCollectionExpression() {
		CollectionExpressionImpl collectionExpression = new CollectionExpressionImpl();
		return collectionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comprehension createComprehension() {
		ComprehensionImpl comprehension = new ComprehensionImpl();
		return comprehension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CumulativeFunction createCumulativeFunction() {
		CumulativeFunctionImpl cumulativeFunction = new CumulativeFunctionImpl();
		return cumulativeFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDeclaration createDataDeclaration() {
		DataDeclarationImpl dataDeclaration = new DataDeclarationImpl();
		return dataDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject createDataObject() {
		DataObjectImpl dataObject = new DataObjectImpl();
		return dataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRef createDataRef() {
		DataRefImpl dataRef = new DataRefImpl();
		return dataRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeferredInit createDeferredInit() {
		DeferredInitImpl deferredInit = new DeferredInitImpl();
		return deferredInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayInstruction createDisplayInstruction() {
		DisplayInstructionImpl displayInstruction = new DisplayInstructionImpl();
		return displayInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationType createEnumerationType() {
		EnumerationTypeImpl enumerationType = new EnumerationTypeImpl();
		return enumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteral createEnumLiteral() {
		EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPLmetamodel.Error createError() {
		ErrorImpl error = new ErrorImpl();
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatRangeType createFloatRangeType() {
		FloatRangeTypeImpl floatRangeType = new FloatRangeTypeImpl();
		return floatRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatType createFloatType() {
		FloatTypeImpl floatType = new FloatTypeImpl();
		return floatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalParameter createFormalParameter() {
		FormalParameterImpl formalParameter = new FormalParameterImpl();
		return formalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatExpression createFloatExpression() {
		FloatExpressionImpl floatExpression = new FloatExpressionImpl();
		return floatExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForAllConstraint createForAllConstraint() {
		ForAllConstraintImpl forAllConstraint = new ForAllConstraintImpl();
		return forAllConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionRef createFunctionRef() {
		FunctionRefImpl functionRef = new FunctionRefImpl();
		return functionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfConstraint createIfConstraint() {
		IfConstraintImpl ifConstraint = new IfConstraintImpl();
		return ifConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExpression createIfExpression() {
		IfExpressionImpl ifExpression = new IfExpressionImpl();
		return ifExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public In createIn() {
		InImpl in = new InImpl();
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType createIntegerType() {
		IntegerTypeImpl integerType = new IntegerTypeImpl();
		return integerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression createIntegerExpression() {
		IntegerExpressionImpl integerExpression = new IntegerExpressionImpl();
		return integerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerRangeType createIntegerRangeType() {
		IntegerRangeTypeImpl integerRangeType = new IntegerRangeTypeImpl();
		return integerRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexValuePair createIndexValuePair() {
		IndexValuePairImpl indexValuePair = new IndexValuePairImpl();
		return indexValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPLmetamodel.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType createNumericType() {
		NumericTypeImpl numericType = new NumericTypeImpl();
		return numericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective createObjective() {
		ObjectiveImpl objective = new ObjectiveImpl();
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperator() {
		OperatorImpl operator = new OperatorImpl();
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDeclaration createParameterDeclaration() {
		ParameterDeclarationImpl parameterDeclaration = new ParameterDeclarationImpl();
		return parameterDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterRef createParameterRef() {
		ParameterRefImpl parameterRef = new ParameterRefImpl();
		return parameterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiecewiseExpression createPiecewiseExpression() {
		PiecewiseExpressionImpl piecewiseExpression = new PiecewiseExpressionImpl();
		return piecewiseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiecewiseLinearFunction createPiecewiseLinearFunction() {
		PiecewiseLinearFunctionImpl piecewiseLinearFunction = new PiecewiseLinearFunctionImpl();
		return piecewiseLinearFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveFloatType createPositiveFloatType() {
		PositiveFloatTypeImpl positiveFloatType = new PositiveFloatTypeImpl();
		return positiveFloatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveIntegerType createPositiveIntegerType() {
		PositiveIntegerTypeImpl positiveIntegerType = new PositiveIntegerTypeImpl();
		return positiveIntegerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryUser createQueryUser() {
		QueryUserImpl queryUser = new QueryUserImpl();
		return queryUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeExpression createRangeExpression() {
		RangeExpressionImpl rangeExpression = new RangeExpressionImpl();
		return rangeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadFile createReadFile() {
		ReadFileImpl readFile = new ReadFileImpl();
		return readFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Record createRecord() {
		RecordImpl record = new RecordImpl();
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordField createRecordField() {
		RecordFieldImpl recordField = new RecordFieldImpl();
		return recordField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordValue createRecordValue() {
		RecordValueImpl recordValue = new RecordValueImpl();
		return recordValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectiveFunction createReflectiveFunction() {
		ReflectiveFunctionImpl reflectiveFunction = new ReflectiveFunctionImpl();
		return reflectiveFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalExpression createRelationalExpression() {
		RelationalExpressionImpl relationalExpression = new RelationalExpressionImpl();
		return relationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalInit createRelationalInit() {
		RelationalInitImpl relationalInit = new RelationalInitImpl();
		return relationalInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperator createRelationalOperator() {
		RelationalOperatorImpl relationalOperator = new RelationalOperatorImpl();
		return relationalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDeclaration createResourceDeclaration() {
		ResourceDeclarationImpl resourceDeclaration = new ResourceDeclarationImpl();
		return resourceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleInitialization createScheduleInitialization() {
		ScheduleInitializationImpl scheduleInitialization = new ScheduleInitializationImpl();
		return scheduleInitialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script createScript() {
		ScriptImpl script = new ScriptImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchProcedure createSearchProcedure() {
		SearchProcedureImpl searchProcedure = new SearchProcedureImpl();
		return searchProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Setting createSetting() {
		SettingImpl setting = new SettingImpl();
		return setting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetType createSetType() {
		SetTypeImpl setType = new SetTypeImpl();
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetValue createSetValue() {
		SetValueImpl setValue = new SetValueImpl();
		return setValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateFunction createStateFunction() {
		StateFunctionImpl stateFunction = new StateFunctionImpl();
		return stateFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepFunction createStepFunction() {
		StepFunctionImpl stepFunction = new StepFunctionImpl();
		return stepFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression createStringExpression() {
		StringExpressionImpl stringExpression = new StringExpressionImpl();
		return stringExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleBinding createTupleBinding() {
		TupleBindingImpl tupleBinding = new TupleBindingImpl();
		return tupleBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableBinding createVariableBinding() {
		VariableBindingImpl variableBinding = new VariableBindingImpl();
		return variableBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Writeln createWriteln() {
		WritelnImpl writeln = new WritelnImpl();
		return writeln;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggOp createAggOpFromString(EDataType eDataType, String initialValue) {
		AggOp result = AggOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOp createBinaryOpFromString(EDataType eDataType, String initialValue) {
		BinaryOp result = BinaryOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOp createLogicalOpFromString(EDataType eDataType, String initialValue) {
		LogicalOp result = LogicalOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembershipOp createMembershipOpFromString(EDataType eDataType, String initialValue) {
		MembershipOp result = MembershipOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMembershipOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizationMode createOptimizationModeFromString(EDataType eDataType, String initialValue) {
		OptimizationMode result = OptimizationMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptimizationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantifier createQuantifierFromString(EDataType eDataType, String initialValue) {
		Quantifier result = Quantifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOp createRelationalOpFromString(EDataType eDataType, String initialValue) {
		RelationalOp result = RelationalOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetOp createSetOpFromString(EDataType eDataType, String initialValue) {
		SetOp result = SetOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSetOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOp createUnaryOpFromString(EDataType eDataType, String initialValue) {
		UnaryOp result = UnaryOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdentifierFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDateFormat createTimepointFromString(EDataType eDataType, String initialValue) {
		return (SimpleDateFormat)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimepointToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPLmetamodelPackage getOPLmetamodelPackage() {
		return (OPLmetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OPLmetamodelPackage getPackage() {
		return OPLmetamodelPackage.eINSTANCE;
	}

} //OPLmetamodelFactoryImpl
