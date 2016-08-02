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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see OPLmetamodel.OPLmetamodelPackage
 * @generated
 */
public class OPLmetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OPLmetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPLmetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = OPLmetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OPLmetamodelPackage.ABSTRACT_BINARY_OPERATOR: {
				AbstractBinaryOperator abstractBinaryOperator = (AbstractBinaryOperator)theEObject;
				T result = caseAbstractBinaryOperator(abstractBinaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.ABSTRACT_TYPE: {
				AbstractType abstractType = (AbstractType)theEObject;
				T result = caseAbstractType(abstractType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.ACTIVITY_DECLARATION: {
				ActivityDeclaration activityDeclaration = (ActivityDeclaration)theEObject;
				T result = caseActivityDeclaration(activityDeclaration);
				if (result == null) result = caseDeclaration(activityDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.AGGREGATE_EXP: {
				AggregateExp aggregateExp = (AggregateExp)theEObject;
				T result = caseAggregateExp(aggregateExp);
				if (result == null) result = caseExpression(aggregateExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.ALL_EXPRESSION: {
				AllExpression allExpression = (AllExpression)theEObject;
				T result = caseAllExpression(allExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.ARRAY_DEREFERENCE: {
				ArrayDereference arrayDereference = (ArrayDereference)theEObject;
				T result = caseArrayDereference(arrayDereference);
				if (result == null) result = casePathExpression(arrayDereference);
				if (result == null) result = caseExpression(arrayDereference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.ARRAY_SLOT_CONSTRAINT: {
				ArraySlotConstraint arraySlotConstraint = (ArraySlotConstraint)theEObject;
				T result = caseArraySlotConstraint(arraySlotConstraint);
				if (result == null) result = caseExpression(arraySlotConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.ARRAY_TYPE: {
				ArrayType arrayType = (ArrayType)theEObject;
				T result = caseArrayType(arrayType);
				if (result == null) result = caseDefinedType(arrayType);
				if (result == null) result = caseAbstractType(arrayType);
				if (result == null) result = caseDeclaration(arrayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.ARRAY_VALUE: {
				ArrayValue arrayValue = (ArrayValue)theEObject;
				T result = caseArrayValue(arrayValue);
				if (result == null) result = caseExpression(arrayValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.ASSERTION: {
				Assertion assertion = (Assertion)theEObject;
				T result = caseAssertion(assertion);
				if (result == null) result = caseDeclaration(assertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				T result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseExpression(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.BINARY_OPERATOR: {
				BinaryOperator binaryOperator = (BinaryOperator)theEObject;
				T result = caseBinaryOperator(binaryOperator);
				if (result == null) result = caseAbstractBinaryOperator(binaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.BINDING_REF: {
				BindingRef bindingRef = (BindingRef)theEObject;
				T result = caseBindingRef(bindingRef);
				if (result == null) result = caseReference(bindingRef);
				if (result == null) result = caseExpression(bindingRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.BLOCK_EXPRESSION: {
				BlockExpression blockExpression = (BlockExpression)theEObject;
				T result = caseBlockExpression(blockExpression);
				if (result == null) result = caseExpression(blockExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.BOOLEAN_BLOCK: {
				BooleanBlock booleanBlock = (BooleanBlock)theEObject;
				T result = caseBooleanBlock(booleanBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.BOOLEAN_EXPRESSION: {
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				T result = caseBooleanExpression(booleanExpression);
				if (result == null) result = casePrimitiveExpression(booleanExpression);
				if (result == null) result = caseExpression(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.BOOLEAN_TYPE: {
				BooleanType booleanType = (BooleanType)theEObject;
				T result = caseBooleanType(booleanType);
				if (result == null) result = casePrimitiveType(booleanType);
				if (result == null) result = caseAbstractType(booleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.BUILT_IN_FUNCTION: {
				BuiltInFunction builtInFunction = (BuiltInFunction)theEObject;
				T result = caseBuiltInFunction(builtInFunction);
				if (result == null) result = caseFunction(builtInFunction);
				if (result == null) result = caseDeclaration(builtInFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.COLLECTION_EXPRESSION: {
				CollectionExpression collectionExpression = (CollectionExpression)theEObject;
				T result = caseCollectionExpression(collectionExpression);
				if (result == null) result = caseExpression(collectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = caseDeclaration(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.COMPREHENSION: {
				Comprehension comprehension = (Comprehension)theEObject;
				T result = caseComprehension(comprehension);
				if (result == null) result = caseCollectionExpression(comprehension);
				if (result == null) result = caseExpression(comprehension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.CUMULATIVE_FUNCTION: {
				CumulativeFunction cumulativeFunction = (CumulativeFunction)theEObject;
				T result = caseCumulativeFunction(cumulativeFunction);
				if (result == null) result = caseFunction(cumulativeFunction);
				if (result == null) result = caseDeclaration(cumulativeFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.DATA_DECLARATION: {
				DataDeclaration dataDeclaration = (DataDeclaration)theEObject;
				T result = caseDataDeclaration(dataDeclaration);
				if (result == null) result = caseDeclaration(dataDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.DATA_INIT_METHODS: {
				DataInitMethods dataInitMethods = (DataInitMethods)theEObject;
				T result = caseDataInitMethods(dataInitMethods);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.DATA_OBJECT: {
				DataObject dataObject = (DataObject)theEObject;
				T result = caseDataObject(dataObject);
				if (result == null) result = caseInitialization(dataObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.DATA_REF: {
				DataRef dataRef = (DataRef)theEObject;
				T result = caseDataRef(dataRef);
				if (result == null) result = caseReference(dataRef);
				if (result == null) result = caseExpression(dataRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.DECLARATION: {
				Declaration declaration = (Declaration)theEObject;
				T result = caseDeclaration(declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.DEFERRED_INIT: {
				DeferredInit deferredInit = (DeferredInit)theEObject;
				T result = caseDeferredInit(deferredInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.DEFINED_TYPE: {
				DefinedType definedType = (DefinedType)theEObject;
				T result = caseDefinedType(definedType);
				if (result == null) result = caseAbstractType(definedType);
				if (result == null) result = caseDeclaration(definedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.DISPLAY_INSTRUCTION: {
				DisplayInstruction displayInstruction = (DisplayInstruction)theEObject;
				T result = caseDisplayInstruction(displayInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.ENUMERATION_TYPE: {
				EnumerationType enumerationType = (EnumerationType)theEObject;
				T result = caseEnumerationType(enumerationType);
				if (result == null) result = caseSetType(enumerationType);
				if (result == null) result = caseDefinedType(enumerationType);
				if (result == null) result = caseParameterDomain(enumerationType);
				if (result == null) result = caseAbstractType(enumerationType);
				if (result == null) result = caseDeclaration(enumerationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.ENUM_LITERAL: {
				EnumLiteral enumLiteral = (EnumLiteral)theEObject;
				T result = caseEnumLiteral(enumLiteral);
				if (result == null) result = casePrimitiveType(enumLiteral);
				if (result == null) result = casePrimitiveExpression(enumLiteral);
				if (result == null) result = caseAbstractType(enumLiteral);
				if (result == null) result = caseExpression(enumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.ERROR: {
				OPLmetamodel.Error error = (OPLmetamodel.Error)theEObject;
				T result = caseError(error);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.FLOAT_RANGE_TYPE: {
				FloatRangeType floatRangeType = (FloatRangeType)theEObject;
				T result = caseFloatRangeType(floatRangeType);
				if (result == null) result = caseFloatType(floatRangeType);
				if (result == null) result = caseRangeType(floatRangeType);
				if (result == null) result = caseNumericType(floatRangeType);
				if (result == null) result = caseSetType(floatRangeType);
				if (result == null) result = casePrimitiveType(floatRangeType);
				if (result == null) result = caseDefinedType(floatRangeType);
				if (result == null) result = caseParameterDomain(floatRangeType);
				if (result == null) result = caseAbstractType(floatRangeType);
				if (result == null) result = caseDeclaration(floatRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.FLOAT_TYPE: {
				FloatType floatType = (FloatType)theEObject;
				T result = caseFloatType(floatType);
				if (result == null) result = caseNumericType(floatType);
				if (result == null) result = casePrimitiveType(floatType);
				if (result == null) result = caseAbstractType(floatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.FORMAL_PARAMETER: {
				FormalParameter formalParameter = (FormalParameter)theEObject;
				T result = caseFormalParameter(formalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = caseCollectionExpression(extension);
				if (result == null) result = caseExpression(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.FLOAT_EXPRESSION: {
				FloatExpression floatExpression = (FloatExpression)theEObject;
				T result = caseFloatExpression(floatExpression);
				if (result == null) result = caseNumericExpression(floatExpression);
				if (result == null) result = casePrimitiveExpression(floatExpression);
				if (result == null) result = caseExpression(floatExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.FOR_ALL_CONSTRAINT: {
				ForAllConstraint forAllConstraint = (ForAllConstraint)theEObject;
				T result = caseForAllConstraint(forAllConstraint);
				if (result == null) result = caseConstraint(forAllConstraint);
				if (result == null) result = caseDeclaration(forAllConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseDeclaration(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.FUNCTION_CALL: {
				FunctionCall functionCall = (FunctionCall)theEObject;
				T result = caseFunctionCall(functionCall);
				if (result == null) result = casePathExpression(functionCall);
				if (result == null) result = caseExpression(functionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.FUNCTION_REF: {
				FunctionRef functionRef = (FunctionRef)theEObject;
				T result = caseFunctionRef(functionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.IF_CONSTRAINT: {
				IfConstraint ifConstraint = (IfConstraint)theEObject;
				T result = caseIfConstraint(ifConstraint);
				if (result == null) result = caseConstraint(ifConstraint);
				if (result == null) result = caseDeclaration(ifConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.IF_EXPRESSION: {
				IfExpression ifExpression = (IfExpression)theEObject;
				T result = caseIfExpression(ifExpression);
				if (result == null) result = caseExpression(ifExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.IN: {
				In in = (In)theEObject;
				T result = caseIn(in);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.INTEGER_TYPE: {
				IntegerType integerType = (IntegerType)theEObject;
				T result = caseIntegerType(integerType);
				if (result == null) result = caseNumericType(integerType);
				if (result == null) result = casePrimitiveType(integerType);
				if (result == null) result = caseAbstractType(integerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.INITIALIZATION: {
				Initialization initialization = (Initialization)theEObject;
				T result = caseInitialization(initialization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.INTERVAL: {
				Interval interval = (Interval)theEObject;
				T result = caseInterval(interval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.INTEGER_EXPRESSION: {
				IntegerExpression integerExpression = (IntegerExpression)theEObject;
				T result = caseIntegerExpression(integerExpression);
				if (result == null) result = caseNumericExpression(integerExpression);
				if (result == null) result = casePrimitiveExpression(integerExpression);
				if (result == null) result = caseExpression(integerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE: {
				IntegerRangeType integerRangeType = (IntegerRangeType)theEObject;
				T result = caseIntegerRangeType(integerRangeType);
				if (result == null) result = caseIntegerType(integerRangeType);
				if (result == null) result = caseRangeType(integerRangeType);
				if (result == null) result = caseNumericType(integerRangeType);
				if (result == null) result = caseSetType(integerRangeType);
				if (result == null) result = casePrimitiveType(integerRangeType);
				if (result == null) result = caseDefinedType(integerRangeType);
				if (result == null) result = caseParameterDomain(integerRangeType);
				if (result == null) result = caseAbstractType(integerRangeType);
				if (result == null) result = caseDeclaration(integerRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.INDEX_VALUE_PAIR: {
				IndexValuePair indexValuePair = (IndexValuePair)theEObject;
				T result = caseIndexValuePair(indexValuePair);
				if (result == null) result = caseExpression(indexValuePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.NUMBER: {
				OPLmetamodel.Number number = (OPLmetamodel.Number)theEObject;
				T result = caseNumber(number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.NUMERIC_EXPRESSION: {
				NumericExpression numericExpression = (NumericExpression)theEObject;
				T result = caseNumericExpression(numericExpression);
				if (result == null) result = casePrimitiveExpression(numericExpression);
				if (result == null) result = caseExpression(numericExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.NUMERIC_TYPE: {
				NumericType numericType = (NumericType)theEObject;
				T result = caseNumericType(numericType);
				if (result == null) result = casePrimitiveType(numericType);
				if (result == null) result = caseAbstractType(numericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.OBJECTIVE: {
				Objective objective = (Objective)theEObject;
				T result = caseObjective(objective);
				if (result == null) result = caseDeclaration(objective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.PARAMETER_DECLARATION: {
				ParameterDeclaration parameterDeclaration = (ParameterDeclaration)theEObject;
				T result = caseParameterDeclaration(parameterDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.PARAMETER_DOMAIN: {
				ParameterDomain parameterDomain = (ParameterDomain)theEObject;
				T result = caseParameterDomain(parameterDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.PARAMETER_REF: {
				ParameterRef parameterRef = (ParameterRef)theEObject;
				T result = caseParameterRef(parameterRef);
				if (result == null) result = caseReference(parameterRef);
				if (result == null) result = caseExpression(parameterRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.PATH_DEREFERENCE: {
				PathDereference pathDereference = (PathDereference)theEObject;
				T result = casePathDereference(pathDereference);
				if (result == null) result = casePathExpression(pathDereference);
				if (result == null) result = caseExpression(pathDereference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.PATH_EXPRESSION: {
				PathExpression pathExpression = (PathExpression)theEObject;
				T result = casePathExpression(pathExpression);
				if (result == null) result = caseExpression(pathExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.PIECEWISE_EXPRESSION: {
				PiecewiseExpression piecewiseExpression = (PiecewiseExpression)theEObject;
				T result = casePiecewiseExpression(piecewiseExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.PIECEWISE_LINEAR_FUNCTION: {
				PiecewiseLinearFunction piecewiseLinearFunction = (PiecewiseLinearFunction)theEObject;
				T result = casePiecewiseLinearFunction(piecewiseLinearFunction);
				if (result == null) result = caseFunction(piecewiseLinearFunction);
				if (result == null) result = caseDeclaration(piecewiseLinearFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.POSITIVE_FLOAT_TYPE: {
				PositiveFloatType positiveFloatType = (PositiveFloatType)theEObject;
				T result = casePositiveFloatType(positiveFloatType);
				if (result == null) result = caseFloatType(positiveFloatType);
				if (result == null) result = caseNumericType(positiveFloatType);
				if (result == null) result = casePrimitiveType(positiveFloatType);
				if (result == null) result = caseAbstractType(positiveFloatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.PRIMITIVE_EXPRESSION: {
				PrimitiveExpression primitiveExpression = (PrimitiveExpression)theEObject;
				T result = casePrimitiveExpression(primitiveExpression);
				if (result == null) result = caseExpression(primitiveExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseAbstractType(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.POSITIVE_INTEGER_TYPE: {
				PositiveIntegerType positiveIntegerType = (PositiveIntegerType)theEObject;
				T result = casePositiveIntegerType(positiveIntegerType);
				if (result == null) result = caseIntegerType(positiveIntegerType);
				if (result == null) result = caseNumericType(positiveIntegerType);
				if (result == null) result = casePrimitiveType(positiveIntegerType);
				if (result == null) result = caseAbstractType(positiveIntegerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.QUERY_USER: {
				QueryUser queryUser = (QueryUser)theEObject;
				T result = caseQueryUser(queryUser);
				if (result == null) result = caseDataInitMethods(queryUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.RANGE_EXPRESSION: {
				RangeExpression rangeExpression = (RangeExpression)theEObject;
				T result = caseRangeExpression(rangeExpression);
				if (result == null) result = caseNumericExpression(rangeExpression);
				if (result == null) result = casePrimitiveExpression(rangeExpression);
				if (result == null) result = caseExpression(rangeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.RANGE_TYPE: {
				RangeType rangeType = (RangeType)theEObject;
				T result = caseRangeType(rangeType);
				if (result == null) result = caseSetType(rangeType);
				if (result == null) result = caseDefinedType(rangeType);
				if (result == null) result = caseParameterDomain(rangeType);
				if (result == null) result = caseAbstractType(rangeType);
				if (result == null) result = caseDeclaration(rangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.READ_FILE: {
				ReadFile readFile = (ReadFile)theEObject;
				T result = caseReadFile(readFile);
				if (result == null) result = caseDataInitMethods(readFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.RECORD: {
				Record record = (Record)theEObject;
				T result = caseRecord(record);
				if (result == null) result = caseParameterDomain(record);
				if (result == null) result = caseDefinedType(record);
				if (result == null) result = caseAbstractType(record);
				if (result == null) result = caseDeclaration(record);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.RECORD_FIELD: {
				RecordField recordField = (RecordField)theEObject;
				T result = caseRecordField(recordField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.RECORD_VALUE: {
				RecordValue recordValue = (RecordValue)theEObject;
				T result = caseRecordValue(recordValue);
				if (result == null) result = caseExpression(recordValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseExpression(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.REFLECTIVE_FUNCTION: {
				ReflectiveFunction reflectiveFunction = (ReflectiveFunction)theEObject;
				T result = caseReflectiveFunction(reflectiveFunction);
				if (result == null) result = caseBuiltInFunction(reflectiveFunction);
				if (result == null) result = caseFunction(reflectiveFunction);
				if (result == null) result = caseDeclaration(reflectiveFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.RELATIONAL_EXPRESSION: {
				RelationalExpression relationalExpression = (RelationalExpression)theEObject;
				T result = caseRelationalExpression(relationalExpression);
				if (result == null) result = caseBinaryExpression(relationalExpression);
				if (result == null) result = caseBooleanExpression(relationalExpression);
				if (result == null) result = casePrimitiveExpression(relationalExpression);
				if (result == null) result = caseExpression(relationalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.RELATIONAL_INIT: {
				RelationalInit relationalInit = (RelationalInit)theEObject;
				T result = caseRelationalInit(relationalInit);
				if (result == null) result = caseInitialization(relationalInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.RELATIONAL_OPERATOR: {
				RelationalOperator relationalOperator = (RelationalOperator)theEObject;
				T result = caseRelationalOperator(relationalOperator);
				if (result == null) result = caseAbstractBinaryOperator(relationalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.RESOURCE_DECLARATION: {
				ResourceDeclaration resourceDeclaration = (ResourceDeclaration)theEObject;
				T result = caseResourceDeclaration(resourceDeclaration);
				if (result == null) result = caseDeclaration(resourceDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.SCHEDULE_INITIALIZATION: {
				ScheduleInitialization scheduleInitialization = (ScheduleInitialization)theEObject;
				T result = caseScheduleInitialization(scheduleInitialization);
				if (result == null) result = caseDeclaration(scheduleInitialization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.SCRIPT: {
				Script script = (Script)theEObject;
				T result = caseScript(script);
				if (result == null) result = caseDeclaration(script);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.SCRIPT_STATEMENT: {
				ScriptStatement scriptStatement = (ScriptStatement)theEObject;
				T result = caseScriptStatement(scriptStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.SEARCH_PROCEDURE: {
				SearchProcedure searchProcedure = (SearchProcedure)theEObject;
				T result = caseSearchProcedure(searchProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.SEQUENCE: {
				Sequence sequence = (Sequence)theEObject;
				T result = caseSequence(sequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.SETTING: {
				Setting setting = (Setting)theEObject;
				T result = caseSetting(setting);
				if (result == null) result = caseDeclaration(setting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.SET_TYPE: {
				SetType setType = (SetType)theEObject;
				T result = caseSetType(setType);
				if (result == null) result = caseDefinedType(setType);
				if (result == null) result = caseParameterDomain(setType);
				if (result == null) result = caseAbstractType(setType);
				if (result == null) result = caseDeclaration(setType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.SET_VALUE: {
				SetValue setValue = (SetValue)theEObject;
				T result = caseSetValue(setValue);
				if (result == null) result = caseExpression(setValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.STATE_FUNCTION: {
				StateFunction stateFunction = (StateFunction)theEObject;
				T result = caseStateFunction(stateFunction);
				if (result == null) result = caseFunction(stateFunction);
				if (result == null) result = caseDeclaration(stateFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.STEP_FUNCTION: {
				StepFunction stepFunction = (StepFunction)theEObject;
				T result = caseStepFunction(stepFunction);
				if (result == null) result = casePiecewiseLinearFunction(stepFunction);
				if (result == null) result = caseFunction(stepFunction);
				if (result == null) result = caseDeclaration(stepFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.STRING_EXPRESSION: {
				StringExpression stringExpression = (StringExpression)theEObject;
				T result = caseStringExpression(stringExpression);
				if (result == null) result = casePrimitiveExpression(stringExpression);
				if (result == null) result = caseExpression(stringExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.STRING_TYPE: {
				StringType stringType = (StringType)theEObject;
				T result = caseStringType(stringType);
				if (result == null) result = casePrimitiveType(stringType);
				if (result == null) result = caseAbstractType(stringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.TUPLE_BINDING: {
				TupleBinding tupleBinding = (TupleBinding)theEObject;
				T result = caseTupleBinding(tupleBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.VARIABLE_BINDING: {
				VariableBinding variableBinding = (VariableBinding)theEObject;
				T result = caseVariableBinding(variableBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OPLmetamodelPackage.WRITELN: {
				Writeln writeln = (Writeln)theEObject;
				T result = caseWriteln(writeln);
				if (result == null) result = caseScriptStatement(writeln);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Binary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractBinaryOperator(AbstractBinaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractType(AbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityDeclaration(ActivityDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateExp(AggregateExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllExpression(AllExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Dereference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Dereference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayDereference(ArrayDereference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Slot Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Slot Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArraySlotConstraint(ArraySlotConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayType(ArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayValue(ArrayValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertion(Assertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOperator(BinaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingRef(BindingRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockExpression(BlockExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanBlock(BooleanBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanType(BooleanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInFunction(BuiltInFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionExpression(CollectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comprehension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comprehension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComprehension(Comprehension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cumulative Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cumulative Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCumulativeFunction(CumulativeFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDeclaration(DataDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Init Methods</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Init Methods</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataInitMethods(DataInitMethods object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataObject(DataObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRef(DataRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deferred Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deferred Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeferredInit(DeferredInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defined Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defined Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinedType(DefinedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayInstruction(DisplayInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationType(EnumerationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumLiteral(EnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseError(OPLmetamodel.Error object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatRangeType(FloatRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatType(FloatType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalParameter(FormalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatExpression(FloatExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For All Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For All Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForAllConstraint(ForAllConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionCall(FunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionRef(FunctionRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfConstraint(IfConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfExpression(IfExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIn(In object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerType(IntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialization(Initialization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterval(Interval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerExpression(IntegerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerRangeType(IntegerRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Value Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexValuePair(IndexValuePair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber(OPLmetamodel.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericExpression(NumericExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericType(NumericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjective(Objective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDeclaration(ParameterDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDomain(ParameterDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterRef(ParameterRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Dereference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Dereference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathDereference(PathDereference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathExpression(PathExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Piecewise Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Piecewise Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePiecewiseExpression(PiecewiseExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Piecewise Linear Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Piecewise Linear Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePiecewiseLinearFunction(PiecewiseLinearFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Float Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Float Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveFloatType(PositiveFloatType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveExpression(PrimitiveExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveIntegerType(PositiveIntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryUser(QueryUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeExpression(RangeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeType(RangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadFile(ReadFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecord(Record object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordField(RecordField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordValue(RecordValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflective Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflective Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflectiveFunction(ReflectiveFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalExpression(RelationalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalInit(RelationalInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalOperator(RelationalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceDeclaration(ResourceDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule Initialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule Initialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduleInitialization(ScheduleInitialization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptStatement(ScriptStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchProcedure(SearchProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetting(Setting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetType(SetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetValue(SetValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateFunction(StateFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepFunction(StepFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringExpression(StringExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringType(StringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleBinding(TupleBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableBinding(VariableBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Writeln</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Writeln</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteln(Writeln object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OPLmetamodelSwitch
