/**
 */
package OPLmetamodel.util;

import OPLmetamodel.AbstractBinaryOperator;
import OPLmetamodel.AbstractType;
import OPLmetamodel.ActivityDeclaration;
import OPLmetamodel.AggregateExp;
import OPLmetamodel.AllExpression;
import OPLmetamodel.ArrayDereference;
import OPLmetamodel.ArraySlotConstraint;
import OPLmetamodel.ArrayType;
import OPLmetamodel.ArrayValue;
import OPLmetamodel.Assertion;
import OPLmetamodel.BinaryExpression;
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
import OPLmetamodel.Model;
import OPLmetamodel.NumericExpression;
import OPLmetamodel.NumericType;
import OPLmetamodel.OPLmetamodelPackage;
import OPLmetamodel.Objective;
import OPLmetamodel.Operator;
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
import OPLmetamodel.RelationalOperator;
import OPLmetamodel.ResourceDeclaration;
import OPLmetamodel.ScheduleInitialization;
import OPLmetamodel.Script;
import OPLmetamodel.ScriptStatement;
import OPLmetamodel.SearchProcedure;
import OPLmetamodel.Sequence;
import OPLmetamodel.SetType;
import OPLmetamodel.SetValue;
import OPLmetamodel.Setting;
import OPLmetamodel.StateFunction;
import OPLmetamodel.StepFunction;
import OPLmetamodel.StringExpression;
import OPLmetamodel.StringType;
import OPLmetamodel.TupleBinding;
import OPLmetamodel.UnaryExpression;
import OPLmetamodel.VariableBinding;
import OPLmetamodel.Writeln;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see OPLmetamodel.OPLmetamodelPackage
 * @generated
 */
public class OPLmetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OPLmetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPLmetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OPLmetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPLmetamodelSwitch<Adapter> modelSwitch =
		new OPLmetamodelSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractBinaryOperator(AbstractBinaryOperator object) {
				return createAbstractBinaryOperatorAdapter();
			}
			@Override
			public Adapter caseAbstractType(AbstractType object) {
				return createAbstractTypeAdapter();
			}
			@Override
			public Adapter caseActivityDeclaration(ActivityDeclaration object) {
				return createActivityDeclarationAdapter();
			}
			@Override
			public Adapter caseAggregateExp(AggregateExp object) {
				return createAggregateExpAdapter();
			}
			@Override
			public Adapter caseAllExpression(AllExpression object) {
				return createAllExpressionAdapter();
			}
			@Override
			public Adapter caseArrayDereference(ArrayDereference object) {
				return createArrayDereferenceAdapter();
			}
			@Override
			public Adapter caseArraySlotConstraint(ArraySlotConstraint object) {
				return createArraySlotConstraintAdapter();
			}
			@Override
			public Adapter caseArrayType(ArrayType object) {
				return createArrayTypeAdapter();
			}
			@Override
			public Adapter caseArrayValue(ArrayValue object) {
				return createArrayValueAdapter();
			}
			@Override
			public Adapter caseAssertion(Assertion object) {
				return createAssertionAdapter();
			}
			@Override
			public Adapter caseBinaryExpression(BinaryExpression object) {
				return createBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseBinaryOperator(BinaryOperator object) {
				return createBinaryOperatorAdapter();
			}
			@Override
			public Adapter caseBindingRef(BindingRef object) {
				return createBindingRefAdapter();
			}
			@Override
			public Adapter caseBlockExpression(BlockExpression object) {
				return createBlockExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanBlock(BooleanBlock object) {
				return createBooleanBlockAdapter();
			}
			@Override
			public Adapter caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanType(BooleanType object) {
				return createBooleanTypeAdapter();
			}
			@Override
			public Adapter caseBuiltInFunction(BuiltInFunction object) {
				return createBuiltInFunctionAdapter();
			}
			@Override
			public Adapter caseCollectionExpression(CollectionExpression object) {
				return createCollectionExpressionAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseComprehension(Comprehension object) {
				return createComprehensionAdapter();
			}
			@Override
			public Adapter caseCumulativeFunction(CumulativeFunction object) {
				return createCumulativeFunctionAdapter();
			}
			@Override
			public Adapter caseDataDeclaration(DataDeclaration object) {
				return createDataDeclarationAdapter();
			}
			@Override
			public Adapter caseDataInitMethods(DataInitMethods object) {
				return createDataInitMethodsAdapter();
			}
			@Override
			public Adapter caseDataObject(DataObject object) {
				return createDataObjectAdapter();
			}
			@Override
			public Adapter caseDataRef(DataRef object) {
				return createDataRefAdapter();
			}
			@Override
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseDeferredInit(DeferredInit object) {
				return createDeferredInitAdapter();
			}
			@Override
			public Adapter caseDefinedType(DefinedType object) {
				return createDefinedTypeAdapter();
			}
			@Override
			public Adapter caseDisplayInstruction(DisplayInstruction object) {
				return createDisplayInstructionAdapter();
			}
			@Override
			public Adapter caseEnumerationType(EnumerationType object) {
				return createEnumerationTypeAdapter();
			}
			@Override
			public Adapter caseEnumLiteral(EnumLiteral object) {
				return createEnumLiteralAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseError(OPLmetamodel.Error object) {
				return createErrorAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseFloatRangeType(FloatRangeType object) {
				return createFloatRangeTypeAdapter();
			}
			@Override
			public Adapter caseFloatType(FloatType object) {
				return createFloatTypeAdapter();
			}
			@Override
			public Adapter caseFormalParameter(FormalParameter object) {
				return createFormalParameterAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseFloatExpression(FloatExpression object) {
				return createFloatExpressionAdapter();
			}
			@Override
			public Adapter caseForAllConstraint(ForAllConstraint object) {
				return createForAllConstraintAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseFunctionCall(FunctionCall object) {
				return createFunctionCallAdapter();
			}
			@Override
			public Adapter caseFunctionRef(FunctionRef object) {
				return createFunctionRefAdapter();
			}
			@Override
			public Adapter caseIfConstraint(IfConstraint object) {
				return createIfConstraintAdapter();
			}
			@Override
			public Adapter caseIfExpression(IfExpression object) {
				return createIfExpressionAdapter();
			}
			@Override
			public Adapter caseIn(In object) {
				return createInAdapter();
			}
			@Override
			public Adapter caseIntegerType(IntegerType object) {
				return createIntegerTypeAdapter();
			}
			@Override
			public Adapter caseInitialization(Initialization object) {
				return createInitializationAdapter();
			}
			@Override
			public Adapter caseInterval(Interval object) {
				return createIntervalAdapter();
			}
			@Override
			public Adapter caseIntegerExpression(IntegerExpression object) {
				return createIntegerExpressionAdapter();
			}
			@Override
			public Adapter caseIntegerRangeType(IntegerRangeType object) {
				return createIntegerRangeTypeAdapter();
			}
			@Override
			public Adapter caseIndexValuePair(IndexValuePair object) {
				return createIndexValuePairAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseNumber(OPLmetamodel.Number object) {
				return createNumberAdapter();
			}
			@Override
			public Adapter caseNumericExpression(NumericExpression object) {
				return createNumericExpressionAdapter();
			}
			@Override
			public Adapter caseNumericType(NumericType object) {
				return createNumericTypeAdapter();
			}
			@Override
			public Adapter caseObjective(Objective object) {
				return createObjectiveAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseParameterDeclaration(ParameterDeclaration object) {
				return createParameterDeclarationAdapter();
			}
			@Override
			public Adapter caseParameterDomain(ParameterDomain object) {
				return createParameterDomainAdapter();
			}
			@Override
			public Adapter caseParameterRef(ParameterRef object) {
				return createParameterRefAdapter();
			}
			@Override
			public Adapter casePathDereference(PathDereference object) {
				return createPathDereferenceAdapter();
			}
			@Override
			public Adapter casePathExpression(PathExpression object) {
				return createPathExpressionAdapter();
			}
			@Override
			public Adapter casePiecewiseExpression(PiecewiseExpression object) {
				return createPiecewiseExpressionAdapter();
			}
			@Override
			public Adapter casePiecewiseLinearFunction(PiecewiseLinearFunction object) {
				return createPiecewiseLinearFunctionAdapter();
			}
			@Override
			public Adapter casePositiveFloatType(PositiveFloatType object) {
				return createPositiveFloatTypeAdapter();
			}
			@Override
			public Adapter casePrimitiveExpression(PrimitiveExpression object) {
				return createPrimitiveExpressionAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter casePositiveIntegerType(PositiveIntegerType object) {
				return createPositiveIntegerTypeAdapter();
			}
			@Override
			public Adapter caseQueryUser(QueryUser object) {
				return createQueryUserAdapter();
			}
			@Override
			public Adapter caseRangeExpression(RangeExpression object) {
				return createRangeExpressionAdapter();
			}
			@Override
			public Adapter caseRangeType(RangeType object) {
				return createRangeTypeAdapter();
			}
			@Override
			public Adapter caseReadFile(ReadFile object) {
				return createReadFileAdapter();
			}
			@Override
			public Adapter caseRecord(Record object) {
				return createRecordAdapter();
			}
			@Override
			public Adapter caseRecordField(RecordField object) {
				return createRecordFieldAdapter();
			}
			@Override
			public Adapter caseRecordValue(RecordValue object) {
				return createRecordValueAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseReflectiveFunction(ReflectiveFunction object) {
				return createReflectiveFunctionAdapter();
			}
			@Override
			public Adapter caseRelationalExpression(RelationalExpression object) {
				return createRelationalExpressionAdapter();
			}
			@Override
			public Adapter caseRelationalInit(RelationalInit object) {
				return createRelationalInitAdapter();
			}
			@Override
			public Adapter caseRelationalOperator(RelationalOperator object) {
				return createRelationalOperatorAdapter();
			}
			@Override
			public Adapter caseResourceDeclaration(ResourceDeclaration object) {
				return createResourceDeclarationAdapter();
			}
			@Override
			public Adapter caseScheduleInitialization(ScheduleInitialization object) {
				return createScheduleInitializationAdapter();
			}
			@Override
			public Adapter caseScript(Script object) {
				return createScriptAdapter();
			}
			@Override
			public Adapter caseScriptStatement(ScriptStatement object) {
				return createScriptStatementAdapter();
			}
			@Override
			public Adapter caseSearchProcedure(SearchProcedure object) {
				return createSearchProcedureAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseSetting(Setting object) {
				return createSettingAdapter();
			}
			@Override
			public Adapter caseSetType(SetType object) {
				return createSetTypeAdapter();
			}
			@Override
			public Adapter caseSetValue(SetValue object) {
				return createSetValueAdapter();
			}
			@Override
			public Adapter caseStateFunction(StateFunction object) {
				return createStateFunctionAdapter();
			}
			@Override
			public Adapter caseStepFunction(StepFunction object) {
				return createStepFunctionAdapter();
			}
			@Override
			public Adapter caseStringExpression(StringExpression object) {
				return createStringExpressionAdapter();
			}
			@Override
			public Adapter caseStringType(StringType object) {
				return createStringTypeAdapter();
			}
			@Override
			public Adapter caseTupleBinding(TupleBinding object) {
				return createTupleBindingAdapter();
			}
			@Override
			public Adapter caseUnaryExpression(UnaryExpression object) {
				return createUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseVariableBinding(VariableBinding object) {
				return createVariableBindingAdapter();
			}
			@Override
			public Adapter caseWriteln(Writeln object) {
				return createWritelnAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.AbstractBinaryOperator <em>Abstract Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.AbstractBinaryOperator
	 * @generated
	 */
	public Adapter createAbstractBinaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.AbstractType
	 * @generated
	 */
	public Adapter createAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.ActivityDeclaration <em>Activity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.ActivityDeclaration
	 * @generated
	 */
	public Adapter createActivityDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.AggregateExp <em>Aggregate Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.AggregateExp
	 * @generated
	 */
	public Adapter createAggregateExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.AllExpression <em>All Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.AllExpression
	 * @generated
	 */
	public Adapter createAllExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.ArrayDereference <em>Array Dereference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.ArrayDereference
	 * @generated
	 */
	public Adapter createArrayDereferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.ArraySlotConstraint <em>Array Slot Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.ArraySlotConstraint
	 * @generated
	 */
	public Adapter createArraySlotConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.ArrayType
	 * @generated
	 */
	public Adapter createArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.ArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.ArrayValue
	 * @generated
	 */
	public Adapter createArrayValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Assertion
	 * @generated
	 */
	public Adapter createAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.BinaryOperator
	 * @generated
	 */
	public Adapter createBinaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.BindingRef <em>Binding Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.BindingRef
	 * @generated
	 */
	public Adapter createBindingRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.BlockExpression <em>Block Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.BlockExpression
	 * @generated
	 */
	public Adapter createBlockExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.BooleanBlock <em>Boolean Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.BooleanBlock
	 * @generated
	 */
	public Adapter createBooleanBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.BooleanType
	 * @generated
	 */
	public Adapter createBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.BuiltInFunction <em>Built In Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.BuiltInFunction
	 * @generated
	 */
	public Adapter createBuiltInFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.CollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.CollectionExpression
	 * @generated
	 */
	public Adapter createCollectionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Comprehension <em>Comprehension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Comprehension
	 * @generated
	 */
	public Adapter createComprehensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.CumulativeFunction <em>Cumulative Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.CumulativeFunction
	 * @generated
	 */
	public Adapter createCumulativeFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.DataDeclaration <em>Data Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.DataDeclaration
	 * @generated
	 */
	public Adapter createDataDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.DataInitMethods <em>Data Init Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.DataInitMethods
	 * @generated
	 */
	public Adapter createDataInitMethodsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.DataObject
	 * @generated
	 */
	public Adapter createDataObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.DataRef <em>Data Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.DataRef
	 * @generated
	 */
	public Adapter createDataRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.DeferredInit <em>Deferred Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.DeferredInit
	 * @generated
	 */
	public Adapter createDeferredInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.DefinedType <em>Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.DefinedType
	 * @generated
	 */
	public Adapter createDefinedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.DisplayInstruction <em>Display Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.DisplayInstruction
	 * @generated
	 */
	public Adapter createDisplayInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.EnumerationType
	 * @generated
	 */
	public Adapter createEnumerationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.EnumLiteral
	 * @generated
	 */
	public Adapter createEnumLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Error
	 * @generated
	 */
	public Adapter createErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.FloatRangeType <em>Float Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.FloatRangeType
	 * @generated
	 */
	public Adapter createFloatRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.FloatType
	 * @generated
	 */
	public Adapter createFloatTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.FormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.FormalParameter
	 * @generated
	 */
	public Adapter createFormalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.FloatExpression <em>Float Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.FloatExpression
	 * @generated
	 */
	public Adapter createFloatExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.ForAllConstraint <em>For All Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.ForAllConstraint
	 * @generated
	 */
	public Adapter createForAllConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.FunctionCall
	 * @generated
	 */
	public Adapter createFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.FunctionRef <em>Function Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.FunctionRef
	 * @generated
	 */
	public Adapter createFunctionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.IfConstraint <em>If Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.IfConstraint
	 * @generated
	 */
	public Adapter createIfConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.IfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.IfExpression
	 * @generated
	 */
	public Adapter createIfExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.In <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.In
	 * @generated
	 */
	public Adapter createInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.IntegerType
	 * @generated
	 */
	public Adapter createIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Initialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Initialization
	 * @generated
	 */
	public Adapter createInitializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Interval
	 * @generated
	 */
	public Adapter createIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.IntegerExpression
	 * @generated
	 */
	public Adapter createIntegerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.IntegerRangeType <em>Integer Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.IntegerRangeType
	 * @generated
	 */
	public Adapter createIntegerRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.IndexValuePair <em>Index Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.IndexValuePair
	 * @generated
	 */
	public Adapter createIndexValuePairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.NumericExpression <em>Numeric Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.NumericExpression
	 * @generated
	 */
	public Adapter createNumericExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.NumericType
	 * @generated
	 */
	public Adapter createNumericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Objective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Objective
	 * @generated
	 */
	public Adapter createObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.ParameterDeclaration <em>Parameter Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.ParameterDeclaration
	 * @generated
	 */
	public Adapter createParameterDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.ParameterDomain <em>Parameter Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.ParameterDomain
	 * @generated
	 */
	public Adapter createParameterDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.ParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.ParameterRef
	 * @generated
	 */
	public Adapter createParameterRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.PathDereference <em>Path Dereference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.PathDereference
	 * @generated
	 */
	public Adapter createPathDereferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.PathExpression <em>Path Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.PathExpression
	 * @generated
	 */
	public Adapter createPathExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.PiecewiseExpression <em>Piecewise Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.PiecewiseExpression
	 * @generated
	 */
	public Adapter createPiecewiseExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.PiecewiseLinearFunction <em>Piecewise Linear Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.PiecewiseLinearFunction
	 * @generated
	 */
	public Adapter createPiecewiseLinearFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.PositiveFloatType <em>Positive Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.PositiveFloatType
	 * @generated
	 */
	public Adapter createPositiveFloatTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.PrimitiveExpression <em>Primitive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.PrimitiveExpression
	 * @generated
	 */
	public Adapter createPrimitiveExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.PositiveIntegerType <em>Positive Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.PositiveIntegerType
	 * @generated
	 */
	public Adapter createPositiveIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.QueryUser <em>Query User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.QueryUser
	 * @generated
	 */
	public Adapter createQueryUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.RangeExpression <em>Range Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.RangeExpression
	 * @generated
	 */
	public Adapter createRangeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.RangeType
	 * @generated
	 */
	public Adapter createRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.ReadFile <em>Read File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.ReadFile
	 * @generated
	 */
	public Adapter createReadFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Record
	 * @generated
	 */
	public Adapter createRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.RecordField <em>Record Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.RecordField
	 * @generated
	 */
	public Adapter createRecordFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.RecordValue <em>Record Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.RecordValue
	 * @generated
	 */
	public Adapter createRecordValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.ReflectiveFunction <em>Reflective Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.ReflectiveFunction
	 * @generated
	 */
	public Adapter createReflectiveFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.RelationalExpression
	 * @generated
	 */
	public Adapter createRelationalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.RelationalInit <em>Relational Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.RelationalInit
	 * @generated
	 */
	public Adapter createRelationalInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.RelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.RelationalOperator
	 * @generated
	 */
	public Adapter createRelationalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.ResourceDeclaration <em>Resource Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.ResourceDeclaration
	 * @generated
	 */
	public Adapter createResourceDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.ScheduleInitialization <em>Schedule Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.ScheduleInitialization
	 * @generated
	 */
	public Adapter createScheduleInitializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Script
	 * @generated
	 */
	public Adapter createScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.ScriptStatement <em>Script Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.ScriptStatement
	 * @generated
	 */
	public Adapter createScriptStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.SearchProcedure <em>Search Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.SearchProcedure
	 * @generated
	 */
	public Adapter createSearchProcedureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Setting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Setting
	 * @generated
	 */
	public Adapter createSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.SetType
	 * @generated
	 */
	public Adapter createSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.SetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.SetValue
	 * @generated
	 */
	public Adapter createSetValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.StateFunction <em>State Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.StateFunction
	 * @generated
	 */
	public Adapter createStateFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.StepFunction <em>Step Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.StepFunction
	 * @generated
	 */
	public Adapter createStepFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.StringExpression
	 * @generated
	 */
	public Adapter createStringExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.StringType
	 * @generated
	 */
	public Adapter createStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.TupleBinding <em>Tuple Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.TupleBinding
	 * @generated
	 */
	public Adapter createTupleBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.VariableBinding <em>Variable Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.VariableBinding
	 * @generated
	 */
	public Adapter createVariableBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OPLmetamodel.Writeln <em>Writeln</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OPLmetamodel.Writeln
	 * @generated
	 */
	public Adapter createWritelnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OPLmetamodelAdapterFactory
