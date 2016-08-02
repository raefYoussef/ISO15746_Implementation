/**
 */
package OPLmetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see OPLmetamodel.OPLmetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface OPLmetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "OPLmetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://oplmetamodel.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "opl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OPLmetamodelPackage eINSTANCE = OPLmetamodel.impl.OPLmetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.AbstractBinaryOperatorImpl <em>Abstract Binary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.AbstractBinaryOperatorImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getAbstractBinaryOperator()
	 * @generated
	 */
	int ABSTRACT_BINARY_OPERATOR = 0;

	/**
	 * The number of structural features of the '<em>Abstract Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BINARY_OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BINARY_OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.AbstractTypeImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getAbstractType()
	 * @generated
	 */
	int ABSTRACT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.DeclarationImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 26;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ORDER = 0;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ActivityDeclarationImpl <em>Activity Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ActivityDeclarationImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getActivityDeclaration()
	 * @generated
	 */
	int ACTIVITY_DECLARATION = 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DECLARATION__ORDER = DECLARATION__ORDER;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DECLARATION__DURATION = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Earliest Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DECLARATION__EARLIEST_START_TIME = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Latest End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DECLARATION__LATEST_END_TIME = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Activity Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DECLARATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ExpressionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 34;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.AggregateExpImpl <em>Aggregate Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.AggregateExpImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getAggregateExp()
	 * @generated
	 */
	int AGGREGATE_EXP = 3;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXP__OP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXP__PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXP__BODY = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aggregate Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Aggregate Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.AllExpressionImpl <em>All Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.AllExpressionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getAllExpression()
	 * @generated
	 */
	int ALL_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_EXPRESSION__QUALIFIERS = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_EXPRESSION__BODY = 1;

	/**
	 * The number of structural features of the '<em>All Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>All Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.PathExpressionImpl <em>Path Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.PathExpressionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getPathExpression()
	 * @generated
	 */
	int PATH_EXPRESSION = 63;

	/**
	 * The number of structural features of the '<em>Path Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Path Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ArrayDereferenceImpl <em>Array Dereference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ArrayDereferenceImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getArrayDereference()
	 * @generated
	 */
	int ARRAY_DEREFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEREFERENCE__ARRAY = PATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEREFERENCE__INDEX = PATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Dereference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEREFERENCE_FEATURE_COUNT = PATH_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array Dereference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DEREFERENCE_OPERATION_COUNT = PATH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ArraySlotConstraintImpl <em>Array Slot Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ArraySlotConstraintImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getArraySlotConstraint()
	 * @generated
	 */
	int ARRAY_SLOT_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SLOT_CONSTRAINT__TARGET = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Slot Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SLOT_CONSTRAINT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Slot Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_SLOT_CONSTRAINT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.DefinedTypeImpl <em>Defined Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.DefinedTypeImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getDefinedType()
	 * @generated
	 */
	int DEFINED_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE__ORDER = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Defined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Defined Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_TYPE_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ArrayTypeImpl <em>Array Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ArrayTypeImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getArrayType()
	 * @generated
	 */
	int ARRAY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ORDER = DEFINED_TYPE__ORDER;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__BASE_TYPE = DEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__SUBSCRIPTS = DEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = DEFINED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_OPERATION_COUNT = DEFINED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ArrayValueImpl <em>Array Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ArrayValueImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getArrayValue()
	 * @generated
	 */
	int ARRAY_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE__ITEMS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.AssertionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 9;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ORDER = DECLARATION__ORDER;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__EXP = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.BinaryExpressionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.BinaryOperatorImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 11;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR__OP = ABSTRACT_BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_FEATURE_COUNT = ABSTRACT_BINARY_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_OPERATION_COUNT = ABSTRACT_BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ReferenceImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 77;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.BindingRefImpl <em>Binding Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.BindingRefImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBindingRef()
	 * @generated
	 */
	int BINDING_REF = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_REF__NAME = REFERENCE__NAME;

	/**
	 * The number of structural features of the '<em>Binding Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_REF_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Binding Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_REF_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.BlockExpressionImpl <em>Block Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.BlockExpressionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBlockExpression()
	 * @generated
	 */
	int BLOCK_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__BLOCKS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.BooleanBlockImpl <em>Boolean Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.BooleanBlockImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBooleanBlock()
	 * @generated
	 */
	int BOOLEAN_BLOCK = 14;

	/**
	 * The number of structural features of the '<em>Boolean Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BLOCK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Boolean Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.PrimitiveExpressionImpl <em>Primitive Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.PrimitiveExpressionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getPrimitiveExpression()
	 * @generated
	 */
	int PRIMITIVE_EXPRESSION = 67;

	/**
	 * The number of structural features of the '<em>Primitive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.BooleanExpressionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__BODY = PRIMITIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = PRIMITIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = PRIMITIVE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.PrimitiveTypeImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 68;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = ABSTRACT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.BooleanTypeImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 16;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.FunctionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 41;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ORDER = DECLARATION__ORDER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BODY = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.BuiltInFunctionImpl <em>Built In Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.BuiltInFunctionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBuiltInFunction()
	 * @generated
	 */
	int BUILT_IN_FUNCTION = 17;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_FUNCTION__ORDER = FUNCTION__ORDER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_FUNCTION__BODY = FUNCTION__BODY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_FUNCTION__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Built In Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Built In Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.CollectionExpressionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getCollectionExpression()
	 * @generated
	 */
	int COLLECTION_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION__IS_UNIQUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ConstraintImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 19;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ORDER = DECLARATION__ORDER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXP = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ComprehensionImpl <em>Comprehension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ComprehensionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getComprehension()
	 * @generated
	 */
	int COMPREHENSION = 20;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPREHENSION__IS_UNIQUE = COLLECTION_EXPRESSION__IS_UNIQUE;

	/**
	 * The number of structural features of the '<em>Comprehension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPREHENSION_FEATURE_COUNT = COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comprehension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPREHENSION_OPERATION_COUNT = COLLECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.CumulativeFunctionImpl <em>Cumulative Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.CumulativeFunctionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getCumulativeFunction()
	 * @generated
	 */
	int CUMULATIVE_FUNCTION = 21;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUMULATIVE_FUNCTION__ORDER = FUNCTION__ORDER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUMULATIVE_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUMULATIVE_FUNCTION__BODY = FUNCTION__BODY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUMULATIVE_FUNCTION__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Cumulative Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUMULATIVE_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cumulative Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUMULATIVE_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.DataDeclarationImpl <em>Data Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.DataDeclarationImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getDataDeclaration()
	 * @generated
	 */
	int DATA_DECLARATION = 22;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECLARATION__ORDER = DECLARATION__ORDER;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECLARATION__VARIABLE = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECLARATION__TYPE = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Decision Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECLARATION__IS_DECISION_VAR = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Decision Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECLARATION__IS_DECISION_EXPR = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECLARATION__VALUE = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECLARATION__VALUE_CONSTRAINT = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Data Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Data Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECLARATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.DataInitMethodsImpl <em>Data Init Methods</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.DataInitMethodsImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getDataInitMethods()
	 * @generated
	 */
	int DATA_INIT_METHODS = 23;

	/**
	 * The number of structural features of the '<em>Data Init Methods</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INIT_METHODS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Init Methods</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INIT_METHODS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.InitializationImpl <em>Initialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.InitializationImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getInitialization()
	 * @generated
	 */
	int INITIALIZATION = 48;

	/**
	 * The number of structural features of the '<em>Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.DataObjectImpl <em>Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.DataObjectImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getDataObject()
	 * @generated
	 */
	int DATA_OBJECT = 24;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__BODY = INITIALIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_FEATURE_COUNT = INITIALIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_OPERATION_COUNT = INITIALIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.DataRefImpl <em>Data Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.DataRefImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getDataRef()
	 * @generated
	 */
	int DATA_REF = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REF__NAME = REFERENCE__NAME;

	/**
	 * The number of structural features of the '<em>Data Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REF_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_REF_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.DeferredInitImpl <em>Deferred Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.DeferredInitImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getDeferredInit()
	 * @generated
	 */
	int DEFERRED_INIT = 27;

	/**
	 * The number of structural features of the '<em>Deferred Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_INIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Deferred Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFERRED_INIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.DisplayInstructionImpl <em>Display Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.DisplayInstructionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getDisplayInstruction()
	 * @generated
	 */
	int DISPLAY_INSTRUCTION = 29;

	/**
	 * The feature id for the '<em><b>Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_INSTRUCTION__EXPS = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_INSTRUCTION__PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Display Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_INSTRUCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Display Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.SetTypeImpl <em>Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.SetTypeImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getSetType()
	 * @generated
	 */
	int SET_TYPE = 89;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ORDER = DEFINED_TYPE__ORDER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__NAME = DEFINED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__BASE_TYPE = DEFINED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ELEMENTS = DEFINED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE_FEATURE_COUNT = DEFINED_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE_OPERATION_COUNT = DEFINED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.EnumerationTypeImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getEnumerationType()
	 * @generated
	 */
	int ENUMERATION_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__ORDER = SET_TYPE__ORDER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__NAME = SET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__BASE_TYPE = SET_TYPE__BASE_TYPE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__ELEMENTS = SET_TYPE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Redefined Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__REDEFINED_BASE_TYPE = SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_FEATURE_COUNT = SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_OPERATION_COUNT = SET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.EnumLiteralImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getEnumLiteral()
	 * @generated
	 */
	int ENUM_LITERAL = 31;

	/**
	 * The number of structural features of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.EntityImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 32;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ErrorImpl <em>Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ErrorImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getError()
	 * @generated
	 */
	int ERROR = 33;

	/**
	 * The number of structural features of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.NumericTypeImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getNumericType()
	 * @generated
	 */
	int NUMERIC_TYPE = 56;

	/**
	 * The number of structural features of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.FloatTypeImpl <em>Float Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.FloatTypeImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getFloatType()
	 * @generated
	 */
	int FLOAT_TYPE = 36;

	/**
	 * The number of structural features of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE_OPERATION_COUNT = NUMERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.FloatRangeTypeImpl <em>Float Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.FloatRangeTypeImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getFloatRangeType()
	 * @generated
	 */
	int FLOAT_RANGE_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_RANGE_TYPE__ORDER = FLOAT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_RANGE_TYPE__NAME = FLOAT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_RANGE_TYPE__BASE_TYPE = FLOAT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_RANGE_TYPE__ELEMENTS = FLOAT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_RANGE_TYPE__UPPER_BOUND = FLOAT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_RANGE_TYPE__LOWER_BOUND = FLOAT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Float Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_RANGE_TYPE_FEATURE_COUNT = FLOAT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Float Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_RANGE_TYPE_OPERATION_COUNT = FLOAT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.FormalParameterImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getFormalParameter()
	 * @generated
	 */
	int FORMAL_PARAMETER = 37;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Bound Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__BOUND_VARS = 1;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__IS_ORDERED = 2;

	/**
	 * The feature id for the '<em><b>Require</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__REQUIRE = 3;

	/**
	 * The number of structural features of the '<em>Formal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Formal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ExtensionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 38;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__IS_UNIQUE = COLLECTION_EXPRESSION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__EXPS = COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = COLLECTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = COLLECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.NumericExpressionImpl <em>Numeric Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.NumericExpressionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getNumericExpression()
	 * @generated
	 */
	int NUMERIC_EXPRESSION = 55;

	/**
	 * The number of structural features of the '<em>Numeric Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXPRESSION_FEATURE_COUNT = PRIMITIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXPRESSION_OPERATION_COUNT = PRIMITIVE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.FloatExpressionImpl <em>Float Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.FloatExpressionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getFloatExpression()
	 * @generated
	 */
	int FLOAT_EXPRESSION = 39;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_EXPRESSION__BODY = NUMERIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_EXPRESSION_FEATURE_COUNT = NUMERIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Float Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_EXPRESSION_OPERATION_COUNT = NUMERIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ForAllConstraintImpl <em>For All Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ForAllConstraintImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getForAllConstraint()
	 * @generated
	 */
	int FOR_ALL_CONSTRAINT = 40;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_CONSTRAINT__ORDER = CONSTRAINT__ORDER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_CONSTRAINT__EXP = CONSTRAINT__EXP;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_CONSTRAINT__QUALIFIERS = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_CONSTRAINT__EXPS = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>For All Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>For All Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.FunctionCallImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 42;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__FUNCTION_NAME = PATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__ARGS = PATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = PATH_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_OPERATION_COUNT = PATH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.FunctionRefImpl <em>Function Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.FunctionRefImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getFunctionRef()
	 * @generated
	 */
	int FUNCTION_REF = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REF__NAME = 0;

	/**
	 * The number of structural features of the '<em>Function Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Function Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.IfConstraintImpl <em>If Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.IfConstraintImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getIfConstraint()
	 * @generated
	 */
	int IF_CONSTRAINT = 44;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONSTRAINT__ORDER = CONSTRAINT__ORDER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONSTRAINT__EXP = CONSTRAINT__EXP;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONSTRAINT__TEST = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONSTRAINT__THEN = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONSTRAINT__ELSE = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.IfExpressionImpl <em>If Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.IfExpressionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getIfExpression()
	 * @generated
	 */
	int IF_EXPRESSION = 45;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__TEST = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__THEN = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__ELSE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.InImpl <em>In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.InImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getIn()
	 * @generated
	 */
	int IN = 46;

	/**
	 * The number of structural features of the '<em>In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.IntegerTypeImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 47;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_OPERATION_COUNT = NUMERIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.IntervalImpl <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.IntervalImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 49;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__IS_OPTIONAL = 0;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__BOUNDS = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Intensity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__INTENSITY = 3;

	/**
	 * The number of structural features of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.IntegerExpressionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getIntegerExpression()
	 * @generated
	 */
	int INTEGER_EXPRESSION = 50;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION__BODY = NUMERIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_FEATURE_COUNT = NUMERIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_OPERATION_COUNT = NUMERIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.IntegerRangeTypeImpl <em>Integer Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.IntegerRangeTypeImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getIntegerRangeType()
	 * @generated
	 */
	int INTEGER_RANGE_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_TYPE__ORDER = INTEGER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_TYPE__NAME = INTEGER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_TYPE__BASE_TYPE = INTEGER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_TYPE__ELEMENTS = INTEGER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_TYPE__UPPER_BOUND = INTEGER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_TYPE__LOWER_BOUND = INTEGER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Integer Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_TYPE_FEATURE_COUNT = INTEGER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Integer Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_TYPE_OPERATION_COUNT = INTEGER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.IndexValuePairImpl <em>Index Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.IndexValuePairImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getIndexValuePair()
	 * @generated
	 */
	int INDEX_VALUE_PAIR = 52;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VALUE_PAIR__INDEX = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VALUE_PAIR__VALUE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Index Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VALUE_PAIR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Index Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VALUE_PAIR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ModelImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 53;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Is Constraint Problem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IS_CONSTRAINT_PROBLEM = 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TYPES = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DATA = 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONSTRAINTS = 4;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__INSTRUCTION = 5;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__FUNCTIONS = 6;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ACTIVITIES = 7;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__RESOURCES = 8;

	/**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ASSERTIONS = 9;

	/**
	 * The feature id for the '<em><b>Schedule Init</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SCHEDULE_INIT = 10;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SCRIPTS = 11;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SETTINGS = 12;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DECLARATIONS = 13;

	/**
	 * The feature id for the '<em><b>Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SEARCH = 14;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.NumberImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 54;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ObjectiveImpl <em>Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ObjectiveImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getObjective()
	 * @generated
	 */
	int OBJECTIVE = 57;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__ORDER = DECLARATION__ORDER;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__ACTION = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__EXPRESSION = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Linear Relaxation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__IS_LINEAR_RELAXATION = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.OperatorImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 58;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ParameterDeclarationImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getParameterDeclaration()
	 * @generated
	 */
	int PARAMETER_DECLARATION = 59;

	/**
	 * The number of structural features of the '<em>Parameter Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ParameterDomainImpl <em>Parameter Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ParameterDomainImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getParameterDomain()
	 * @generated
	 */
	int PARAMETER_DOMAIN = 60;

	/**
	 * The number of structural features of the '<em>Parameter Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DOMAIN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ParameterRefImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getParameterRef()
	 * @generated
	 */
	int PARAMETER_REF = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF__NAME = REFERENCE__NAME;

	/**
	 * The number of structural features of the '<em>Parameter Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REF_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.PathDereferenceImpl <em>Path Dereference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.PathDereferenceImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getPathDereference()
	 * @generated
	 */
	int PATH_DEREFERENCE = 62;

	/**
	 * The feature id for the '<em><b>Deref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DEREFERENCE__DEREF = PATH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DEREFERENCE__BASE = PATH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Dereference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DEREFERENCE_FEATURE_COUNT = PATH_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Path Dereference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_DEREFERENCE_OPERATION_COUNT = PATH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.PiecewiseExpressionImpl <em>Piecewise Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.PiecewiseExpressionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getPiecewiseExpression()
	 * @generated
	 */
	int PIECEWISE_EXPRESSION = 64;

	/**
	 * The number of structural features of the '<em>Piecewise Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECEWISE_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Piecewise Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECEWISE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.PiecewiseLinearFunctionImpl <em>Piecewise Linear Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.PiecewiseLinearFunctionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getPiecewiseLinearFunction()
	 * @generated
	 */
	int PIECEWISE_LINEAR_FUNCTION = 65;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECEWISE_LINEAR_FUNCTION__ORDER = FUNCTION__ORDER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECEWISE_LINEAR_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECEWISE_LINEAR_FUNCTION__BODY = FUNCTION__BODY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECEWISE_LINEAR_FUNCTION__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Piecewise Linear Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECEWISE_LINEAR_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Piecewise Linear Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECEWISE_LINEAR_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.PositiveFloatTypeImpl <em>Positive Float Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.PositiveFloatTypeImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getPositiveFloatType()
	 * @generated
	 */
	int POSITIVE_FLOAT_TYPE = 66;

	/**
	 * The number of structural features of the '<em>Positive Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_FLOAT_TYPE_FEATURE_COUNT = FLOAT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_FLOAT_TYPE_OPERATION_COUNT = FLOAT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.PositiveIntegerTypeImpl <em>Positive Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.PositiveIntegerTypeImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getPositiveIntegerType()
	 * @generated
	 */
	int POSITIVE_INTEGER_TYPE = 69;

	/**
	 * The number of structural features of the '<em>Positive Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER_TYPE_FEATURE_COUNT = INTEGER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER_TYPE_OPERATION_COUNT = INTEGER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.QueryUserImpl <em>Query User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.QueryUserImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getQueryUser()
	 * @generated
	 */
	int QUERY_USER = 70;

	/**
	 * The feature id for the '<em><b>Ask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_USER__ASK = DATA_INIT_METHODS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_USER_FEATURE_COUNT = DATA_INIT_METHODS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Query User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_USER_OPERATION_COUNT = DATA_INIT_METHODS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.RangeExpressionImpl <em>Range Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.RangeExpressionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRangeExpression()
	 * @generated
	 */
	int RANGE_EXPRESSION = 71;

	/**
	 * The feature id for the '<em><b>Lower Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__LOWER_LIMIT = NUMERIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__UPPER_LIMIT = NUMERIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__TYPE = NUMERIC_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Range Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION_FEATURE_COUNT = NUMERIC_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Range Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION_OPERATION_COUNT = NUMERIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.RangeTypeImpl <em>Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.RangeTypeImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRangeType()
	 * @generated
	 */
	int RANGE_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__ORDER = SET_TYPE__ORDER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__NAME = SET_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__BASE_TYPE = SET_TYPE__BASE_TYPE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__ELEMENTS = SET_TYPE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__UPPER_BOUND = SET_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__LOWER_BOUND = SET_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE_FEATURE_COUNT = SET_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE_OPERATION_COUNT = SET_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ReadFileImpl <em>Read File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ReadFileImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getReadFile()
	 * @generated
	 */
	int READ_FILE = 73;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FILE__PATH = DATA_INIT_METHODS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Read File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FILE_FEATURE_COUNT = DATA_INIT_METHODS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Read File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FILE_OPERATION_COUNT = DATA_INIT_METHODS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.RecordImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 74;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__ORDER = PARAMETER_DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__NAME = PARAMETER_DOMAIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__FIELDS = PARAMETER_DOMAIN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Tuple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__IS_TUPLE = PARAMETER_DOMAIN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = PARAMETER_DOMAIN_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_OPERATION_COUNT = PARAMETER_DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.RecordFieldImpl <em>Record Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.RecordFieldImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRecordField()
	 * @generated
	 */
	int RECORD_FIELD = 75;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FIELD__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Record Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Record Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.RecordValueImpl <em>Record Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.RecordValueImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRecordValue()
	 * @generated
	 */
	int RECORD_VALUE = 76;

	/**
	 * The feature id for the '<em><b>Field Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_VALUE__FIELD_PAIRS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Record Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_VALUE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ReflectiveFunctionImpl <em>Reflective Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ReflectiveFunctionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getReflectiveFunction()
	 * @generated
	 */
	int REFLECTIVE_FUNCTION = 78;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_FUNCTION__ORDER = BUILT_IN_FUNCTION__ORDER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_FUNCTION__NAME = BUILT_IN_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_FUNCTION__BODY = BUILT_IN_FUNCTION__BODY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_FUNCTION__PARAMETERS = BUILT_IN_FUNCTION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Reflective Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_FUNCTION_FEATURE_COUNT = BUILT_IN_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reflective Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_FUNCTION_OPERATION_COUNT = BUILT_IN_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.RelationalExpressionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRelationalExpression()
	 * @generated
	 */
	int RELATIONAL_EXPRESSION = 79;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__LHS = BINARY_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__RHS = BINARY_EXPRESSION__RHS;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__OP = BINARY_EXPRESSION__OP;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__BODY = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Redefined Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__REDEFINED_OP = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.RelationalInitImpl <em>Relational Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.RelationalInitImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRelationalInit()
	 * @generated
	 */
	int RELATIONAL_INIT = 80;

	/**
	 * The feature id for the '<em><b>Binding Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_INIT__BINDING_VAR = INITIALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_INIT__SOURCES = INITIALIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_INIT__RELATION = INITIALIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relational Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_INIT_FEATURE_COUNT = INITIALIZATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relational Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_INIT_OPERATION_COUNT = INITIALIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.RelationalOperatorImpl <em>Relational Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.RelationalOperatorImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRelationalOperator()
	 * @generated
	 */
	int RELATIONAL_OPERATOR = 81;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_OPERATOR__OP = ABSTRACT_BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relational Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_OPERATOR_FEATURE_COUNT = ABSTRACT_BINARY_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relational Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_OPERATOR_OPERATION_COUNT = ABSTRACT_BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ResourceDeclarationImpl <em>Resource Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ResourceDeclarationImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getResourceDeclaration()
	 * @generated
	 */
	int RESOURCE_DECLARATION = 82;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DECLARATION__ORDER = DECLARATION__ORDER;

	/**
	 * The number of structural features of the '<em>Resource Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DECLARATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ScheduleInitializationImpl <em>Schedule Initialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ScheduleInitializationImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getScheduleInitialization()
	 * @generated
	 */
	int SCHEDULE_INITIALIZATION = 83;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_INITIALIZATION__ORDER = DECLARATION__ORDER;

	/**
	 * The number of structural features of the '<em>Schedule Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_INITIALIZATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Schedule Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_INITIALIZATION_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ScriptImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 84;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__ORDER = DECLARATION__ORDER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__ID = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__IS_MAIN = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__STATEMENTS = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.ScriptStatementImpl <em>Script Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.ScriptStatementImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getScriptStatement()
	 * @generated
	 */
	int SCRIPT_STATEMENT = 85;

	/**
	 * The number of structural features of the '<em>Script Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Script Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.SearchProcedureImpl <em>Search Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.SearchProcedureImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getSearchProcedure()
	 * @generated
	 */
	int SEARCH_PROCEDURE = 86;

	/**
	 * The number of structural features of the '<em>Search Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PROCEDURE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Search Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PROCEDURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.SequenceImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 87;

	/**
	 * The feature id for the '<em><b>Intervals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__INTERVALS = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__TYPES = 1;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.SettingImpl <em>Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.SettingImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getSetting()
	 * @generated
	 */
	int SETTING = 88;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING__ORDER = DECLARATION__ORDER;

	/**
	 * The number of structural features of the '<em>Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_OPERATION_COUNT = DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.SetValueImpl <em>Set Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.SetValueImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getSetValue()
	 * @generated
	 */
	int SET_VALUE = 90;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__ITEMS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Set Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.StateFunctionImpl <em>State Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.StateFunctionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getStateFunction()
	 * @generated
	 */
	int STATE_FUNCTION = 91;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FUNCTION__ORDER = FUNCTION__ORDER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FUNCTION__BODY = FUNCTION__BODY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FUNCTION__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Transition Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FUNCTION__TRANSITION_MATRIX = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.StepFunctionImpl <em>Step Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.StepFunctionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getStepFunction()
	 * @generated
	 */
	int STEP_FUNCTION = 92;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FUNCTION__ORDER = PIECEWISE_LINEAR_FUNCTION__ORDER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FUNCTION__NAME = PIECEWISE_LINEAR_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FUNCTION__BODY = PIECEWISE_LINEAR_FUNCTION__BODY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FUNCTION__PARAMETERS = PIECEWISE_LINEAR_FUNCTION__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Step Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FUNCTION_FEATURE_COUNT = PIECEWISE_LINEAR_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Step Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FUNCTION_OPERATION_COUNT = PIECEWISE_LINEAR_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.StringExpressionImpl <em>String Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.StringExpressionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getStringExpression()
	 * @generated
	 */
	int STRING_EXPRESSION = 93;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__BODY = PRIMITIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_FEATURE_COUNT = PRIMITIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_OPERATION_COUNT = PRIMITIVE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.StringTypeImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 94;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.TupleBindingImpl <em>Tuple Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.TupleBindingImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getTupleBinding()
	 * @generated
	 */
	int TUPLE_BINDING = 95;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_BINDING__VARS = 0;

	/**
	 * The number of structural features of the '<em>Tuple Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_BINDING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tuple Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.UnaryExpressionImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 96;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__EXP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.VariableBindingImpl <em>Variable Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.VariableBindingImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getVariableBinding()
	 * @generated
	 */
	int VARIABLE_BINDING = 97;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_BINDING__VARS = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_BINDING__DOMAIN = 1;

	/**
	 * The number of structural features of the '<em>Variable Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.impl.WritelnImpl <em>Writeln</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.impl.WritelnImpl
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getWriteln()
	 * @generated
	 */
	int WRITELN = 98;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITELN__STRING = SCRIPT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITELN__ARG = SCRIPT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Writeln</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITELN_FEATURE_COUNT = SCRIPT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Writeln</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITELN_OPERATION_COUNT = SCRIPT_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link OPLmetamodel.AggOp <em>Agg Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.AggOp
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getAggOp()
	 * @generated
	 */
	int AGG_OP = 99;

	/**
	 * The meta object id for the '{@link OPLmetamodel.BinaryOp <em>Binary Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.BinaryOp
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBinaryOp()
	 * @generated
	 */
	int BINARY_OP = 100;

	/**
	 * The meta object id for the '{@link OPLmetamodel.LogicalOp <em>Logical Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.LogicalOp
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getLogicalOp()
	 * @generated
	 */
	int LOGICAL_OP = 101;

	/**
	 * The meta object id for the '{@link OPLmetamodel.MembershipOp <em>Membership Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.MembershipOp
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getMembershipOp()
	 * @generated
	 */
	int MEMBERSHIP_OP = 102;

	/**
	 * The meta object id for the '{@link OPLmetamodel.OptimizationMode <em>Optimization Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.OptimizationMode
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getOptimizationMode()
	 * @generated
	 */
	int OPTIMIZATION_MODE = 103;

	/**
	 * The meta object id for the '{@link OPLmetamodel.Quantifier <em>Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.Quantifier
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getQuantifier()
	 * @generated
	 */
	int QUANTIFIER = 104;

	/**
	 * The meta object id for the '{@link OPLmetamodel.RelationalOp <em>Relational Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.RelationalOp
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRelationalOp()
	 * @generated
	 */
	int RELATIONAL_OP = 105;

	/**
	 * The meta object id for the '{@link OPLmetamodel.SetOp <em>Set Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.SetOp
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getSetOp()
	 * @generated
	 */
	int SET_OP = 106;

	/**
	 * The meta object id for the '{@link OPLmetamodel.UnaryOp <em>Unary Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OPLmetamodel.UnaryOp
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getUnaryOp()
	 * @generated
	 */
	int UNARY_OP = 107;

	/**
	 * The meta object id for the '<em>Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 108;

	/**
	 * The meta object id for the '<em>Timepoint</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.text.SimpleDateFormat
	 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getTimepoint()
	 * @generated
	 */
	int TIMEPOINT = 109;


	/**
	 * Returns the meta object for class '{@link OPLmetamodel.AbstractBinaryOperator <em>Abstract Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Binary Operator</em>'.
	 * @see OPLmetamodel.AbstractBinaryOperator
	 * @generated
	 */
	EClass getAbstractBinaryOperator();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type</em>'.
	 * @see OPLmetamodel.AbstractType
	 * @generated
	 */
	EClass getAbstractType();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.ActivityDeclaration <em>Activity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Declaration</em>'.
	 * @see OPLmetamodel.ActivityDeclaration
	 * @generated
	 */
	EClass getActivityDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.ActivityDeclaration#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see OPLmetamodel.ActivityDeclaration#getDuration()
	 * @see #getActivityDeclaration()
	 * @generated
	 */
	EReference getActivityDeclaration_Duration();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.ActivityDeclaration#getEarliestStartTime <em>Earliest Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earliest Start Time</em>'.
	 * @see OPLmetamodel.ActivityDeclaration#getEarliestStartTime()
	 * @see #getActivityDeclaration()
	 * @generated
	 */
	EAttribute getActivityDeclaration_EarliestStartTime();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.ActivityDeclaration#getLatestEndTime <em>Latest End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest End Time</em>'.
	 * @see OPLmetamodel.ActivityDeclaration#getLatestEndTime()
	 * @see #getActivityDeclaration()
	 * @generated
	 */
	EAttribute getActivityDeclaration_LatestEndTime();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.AggregateExp <em>Aggregate Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Exp</em>'.
	 * @see OPLmetamodel.AggregateExp
	 * @generated
	 */
	EClass getAggregateExp();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.AggregateExp#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see OPLmetamodel.AggregateExp#getOp()
	 * @see #getAggregateExp()
	 * @generated
	 */
	EAttribute getAggregateExp_Op();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.AggregateExp#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see OPLmetamodel.AggregateExp#getParameters()
	 * @see #getAggregateExp()
	 * @generated
	 */
	EReference getAggregateExp_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.AggregateExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see OPLmetamodel.AggregateExp#getBody()
	 * @see #getAggregateExp()
	 * @generated
	 */
	EReference getAggregateExp_Body();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.AllExpression <em>All Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Expression</em>'.
	 * @see OPLmetamodel.AllExpression
	 * @generated
	 */
	EClass getAllExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.AllExpression#getQualifiers <em>Qualifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualifiers</em>'.
	 * @see OPLmetamodel.AllExpression#getQualifiers()
	 * @see #getAllExpression()
	 * @generated
	 */
	EReference getAllExpression_Qualifiers();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.AllExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see OPLmetamodel.AllExpression#getBody()
	 * @see #getAllExpression()
	 * @generated
	 */
	EReference getAllExpression_Body();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.ArrayDereference <em>Array Dereference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Dereference</em>'.
	 * @see OPLmetamodel.ArrayDereference
	 * @generated
	 */
	EClass getArrayDereference();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.ArrayDereference#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see OPLmetamodel.ArrayDereference#getArray()
	 * @see #getArrayDereference()
	 * @generated
	 */
	EReference getArrayDereference_Array();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.ArrayDereference#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see OPLmetamodel.ArrayDereference#getIndex()
	 * @see #getArrayDereference()
	 * @generated
	 */
	EReference getArrayDereference_Index();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.ArraySlotConstraint <em>Array Slot Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Slot Constraint</em>'.
	 * @see OPLmetamodel.ArraySlotConstraint
	 * @generated
	 */
	EClass getArraySlotConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.ArraySlotConstraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see OPLmetamodel.ArraySlotConstraint#getTarget()
	 * @see #getArraySlotConstraint()
	 * @generated
	 */
	EReference getArraySlotConstraint_Target();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type</em>'.
	 * @see OPLmetamodel.ArrayType
	 * @generated
	 */
	EClass getArrayType();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.ArrayType#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Type</em>'.
	 * @see OPLmetamodel.ArrayType#getBaseType()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_BaseType();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.ArrayType#getSubscripts <em>Subscripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscripts</em>'.
	 * @see OPLmetamodel.ArrayType#getSubscripts()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_Subscripts();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.ArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Value</em>'.
	 * @see OPLmetamodel.ArrayValue
	 * @generated
	 */
	EClass getArrayValue();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.ArrayValue#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see OPLmetamodel.ArrayValue#getItems()
	 * @see #getArrayValue()
	 * @generated
	 */
	EReference getArrayValue_Items();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see OPLmetamodel.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.Assertion#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see OPLmetamodel.Assertion#getExp()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_Exp();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see OPLmetamodel.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.BinaryExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see OPLmetamodel.BinaryExpression#getLhs()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.BinaryExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see OPLmetamodel.BinaryExpression#getRhs()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Rhs();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.BinaryExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see OPLmetamodel.BinaryExpression#getOp()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Op();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operator</em>'.
	 * @see OPLmetamodel.BinaryOperator
	 * @generated
	 */
	EClass getBinaryOperator();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.BinaryOperator#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see OPLmetamodel.BinaryOperator#getOp()
	 * @see #getBinaryOperator()
	 * @generated
	 */
	EAttribute getBinaryOperator_Op();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.BindingRef <em>Binding Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Ref</em>'.
	 * @see OPLmetamodel.BindingRef
	 * @generated
	 */
	EClass getBindingRef();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.BlockExpression <em>Block Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Expression</em>'.
	 * @see OPLmetamodel.BlockExpression
	 * @generated
	 */
	EClass getBlockExpression();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.BlockExpression#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Blocks</em>'.
	 * @see OPLmetamodel.BlockExpression#getBlocks()
	 * @see #getBlockExpression()
	 * @generated
	 */
	EReference getBlockExpression_Blocks();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.BooleanBlock <em>Boolean Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Block</em>'.
	 * @see OPLmetamodel.BooleanBlock
	 * @generated
	 */
	EClass getBooleanBlock();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see OPLmetamodel.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.BooleanExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see OPLmetamodel.BooleanExpression#getBody()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EAttribute getBooleanExpression_Body();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see OPLmetamodel.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.BuiltInFunction <em>Built In Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Function</em>'.
	 * @see OPLmetamodel.BuiltInFunction
	 * @generated
	 */
	EClass getBuiltInFunction();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.CollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Expression</em>'.
	 * @see OPLmetamodel.CollectionExpression
	 * @generated
	 */
	EClass getCollectionExpression();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.CollectionExpression#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see OPLmetamodel.CollectionExpression#isIsUnique()
	 * @see #getCollectionExpression()
	 * @generated
	 */
	EAttribute getCollectionExpression_IsUnique();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see OPLmetamodel.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see OPLmetamodel.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.Constraint#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see OPLmetamodel.Constraint#getExp()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Exp();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Comprehension <em>Comprehension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comprehension</em>'.
	 * @see OPLmetamodel.Comprehension
	 * @generated
	 */
	EClass getComprehension();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.CumulativeFunction <em>Cumulative Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cumulative Function</em>'.
	 * @see OPLmetamodel.CumulativeFunction
	 * @generated
	 */
	EClass getCumulativeFunction();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.DataDeclaration <em>Data Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Declaration</em>'.
	 * @see OPLmetamodel.DataDeclaration
	 * @generated
	 */
	EClass getDataDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.DataDeclaration#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see OPLmetamodel.DataDeclaration#getVariable()
	 * @see #getDataDeclaration()
	 * @generated
	 */
	EReference getDataDeclaration_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.DataDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see OPLmetamodel.DataDeclaration#getType()
	 * @see #getDataDeclaration()
	 * @generated
	 */
	EReference getDataDeclaration_Type();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.DataDeclaration#isIsDecisionVar <em>Is Decision Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Decision Var</em>'.
	 * @see OPLmetamodel.DataDeclaration#isIsDecisionVar()
	 * @see #getDataDeclaration()
	 * @generated
	 */
	EAttribute getDataDeclaration_IsDecisionVar();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.DataDeclaration#isIsDecisionExpr <em>Is Decision Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Decision Expr</em>'.
	 * @see OPLmetamodel.DataDeclaration#isIsDecisionExpr()
	 * @see #getDataDeclaration()
	 * @generated
	 */
	EAttribute getDataDeclaration_IsDecisionExpr();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.DataDeclaration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see OPLmetamodel.DataDeclaration#getValue()
	 * @see #getDataDeclaration()
	 * @generated
	 */
	EReference getDataDeclaration_Value();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.DataDeclaration#getValueConstraint <em>Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Constraint</em>'.
	 * @see OPLmetamodel.DataDeclaration#getValueConstraint()
	 * @see #getDataDeclaration()
	 * @generated
	 */
	EReference getDataDeclaration_ValueConstraint();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.DataInitMethods <em>Data Init Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Init Methods</em>'.
	 * @see OPLmetamodel.DataInitMethods
	 * @generated
	 */
	EClass getDataInitMethods();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object</em>'.
	 * @see OPLmetamodel.DataObject
	 * @generated
	 */
	EClass getDataObject();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.DataObject#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see OPLmetamodel.DataObject#getBody()
	 * @see #getDataObject()
	 * @generated
	 */
	EAttribute getDataObject_Body();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.DataRef <em>Data Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Ref</em>'.
	 * @see OPLmetamodel.DataRef
	 * @generated
	 */
	EClass getDataRef();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see OPLmetamodel.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.Declaration#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see OPLmetamodel.Declaration#getOrder()
	 * @see #getDeclaration()
	 * @generated
	 */
	EAttribute getDeclaration_Order();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.DeferredInit <em>Deferred Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deferred Init</em>'.
	 * @see OPLmetamodel.DeferredInit
	 * @generated
	 */
	EClass getDeferredInit();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.DefinedType <em>Defined Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defined Type</em>'.
	 * @see OPLmetamodel.DefinedType
	 * @generated
	 */
	EClass getDefinedType();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.DisplayInstruction <em>Display Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Instruction</em>'.
	 * @see OPLmetamodel.DisplayInstruction
	 * @generated
	 */
	EClass getDisplayInstruction();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.DisplayInstruction#getExps <em>Exps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exps</em>'.
	 * @see OPLmetamodel.DisplayInstruction#getExps()
	 * @see #getDisplayInstruction()
	 * @generated
	 */
	EReference getDisplayInstruction_Exps();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.DisplayInstruction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see OPLmetamodel.DisplayInstruction#getParameters()
	 * @see #getDisplayInstruction()
	 * @generated
	 */
	EReference getDisplayInstruction_Parameters();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type</em>'.
	 * @see OPLmetamodel.EnumerationType
	 * @generated
	 */
	EClass getEnumerationType();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.EnumerationType#getRedefinedBaseType <em>Redefined Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Redefined Base Type</em>'.
	 * @see OPLmetamodel.EnumerationType#getRedefinedBaseType()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EReference getEnumerationType_RedefinedBaseType();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal</em>'.
	 * @see OPLmetamodel.EnumLiteral
	 * @generated
	 */
	EClass getEnumLiteral();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see OPLmetamodel.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error</em>'.
	 * @see OPLmetamodel.Error
	 * @generated
	 */
	EClass getError();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see OPLmetamodel.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.FloatRangeType <em>Float Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Range Type</em>'.
	 * @see OPLmetamodel.FloatRangeType
	 * @generated
	 */
	EClass getFloatRangeType();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Type</em>'.
	 * @see OPLmetamodel.FloatType
	 * @generated
	 */
	EClass getFloatType();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.FormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Parameter</em>'.
	 * @see OPLmetamodel.FormalParameter
	 * @generated
	 */
	EClass getFormalParameter();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.FormalParameter#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see OPLmetamodel.FormalParameter#getDomain()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EReference getFormalParameter_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.FormalParameter#getBoundVars <em>Bound Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bound Vars</em>'.
	 * @see OPLmetamodel.FormalParameter#getBoundVars()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EReference getFormalParameter_BoundVars();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.FormalParameter#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see OPLmetamodel.FormalParameter#isIsOrdered()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EAttribute getFormalParameter_IsOrdered();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.FormalParameter#getRequire <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Require</em>'.
	 * @see OPLmetamodel.FormalParameter#getRequire()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EReference getFormalParameter_Require();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see OPLmetamodel.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.Extension#getExps <em>Exps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exps</em>'.
	 * @see OPLmetamodel.Extension#getExps()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Exps();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.FloatExpression <em>Float Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Expression</em>'.
	 * @see OPLmetamodel.FloatExpression
	 * @generated
	 */
	EClass getFloatExpression();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.FloatExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see OPLmetamodel.FloatExpression#getBody()
	 * @see #getFloatExpression()
	 * @generated
	 */
	EAttribute getFloatExpression_Body();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.ForAllConstraint <em>For All Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For All Constraint</em>'.
	 * @see OPLmetamodel.ForAllConstraint
	 * @generated
	 */
	EClass getForAllConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.ForAllConstraint#getQualifiers <em>Qualifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualifiers</em>'.
	 * @see OPLmetamodel.ForAllConstraint#getQualifiers()
	 * @see #getForAllConstraint()
	 * @generated
	 */
	EReference getForAllConstraint_Qualifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.ForAllConstraint#getExps <em>Exps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exps</em>'.
	 * @see OPLmetamodel.ForAllConstraint#getExps()
	 * @see #getForAllConstraint()
	 * @generated
	 */
	EReference getForAllConstraint_Exps();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see OPLmetamodel.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see OPLmetamodel.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Name();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.Function#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see OPLmetamodel.Function#getBody()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see OPLmetamodel.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameters();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see OPLmetamodel.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.FunctionCall#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Name</em>'.
	 * @see OPLmetamodel.FunctionCall#getFunctionName()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EAttribute getFunctionCall_FunctionName();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.FunctionCall#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see OPLmetamodel.FunctionCall#getArgs()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Args();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.FunctionRef <em>Function Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Ref</em>'.
	 * @see OPLmetamodel.FunctionRef
	 * @generated
	 */
	EClass getFunctionRef();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.FunctionRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see OPLmetamodel.FunctionRef#getName()
	 * @see #getFunctionRef()
	 * @generated
	 */
	EAttribute getFunctionRef_Name();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.IfConstraint <em>If Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Constraint</em>'.
	 * @see OPLmetamodel.IfConstraint
	 * @generated
	 */
	EClass getIfConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.IfConstraint#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test</em>'.
	 * @see OPLmetamodel.IfConstraint#getTest()
	 * @see #getIfConstraint()
	 * @generated
	 */
	EReference getIfConstraint_Test();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.IfConstraint#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see OPLmetamodel.IfConstraint#getThen()
	 * @see #getIfConstraint()
	 * @generated
	 */
	EReference getIfConstraint_Then();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.IfConstraint#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see OPLmetamodel.IfConstraint#getElse()
	 * @see #getIfConstraint()
	 * @generated
	 */
	EReference getIfConstraint_Else();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.IfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Expression</em>'.
	 * @see OPLmetamodel.IfExpression
	 * @generated
	 */
	EClass getIfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.IfExpression#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test</em>'.
	 * @see OPLmetamodel.IfExpression#getTest()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_Test();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.IfExpression#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see OPLmetamodel.IfExpression#getThen()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_Then();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.IfExpression#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see OPLmetamodel.IfExpression#getElse()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_Else();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.In <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In</em>'.
	 * @see OPLmetamodel.In
	 * @generated
	 */
	EClass getIn();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see OPLmetamodel.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Initialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initialization</em>'.
	 * @see OPLmetamodel.Initialization
	 * @generated
	 */
	EClass getInitialization();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see OPLmetamodel.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.Interval#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see OPLmetamodel.Interval#isIsOptional()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_IsOptional();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.Interval#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see OPLmetamodel.Interval#getBounds()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_Bounds();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.Interval#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see OPLmetamodel.Interval#getSize()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_Size();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.Interval#getIntensity <em>Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intensity</em>'.
	 * @see OPLmetamodel.Interval#getIntensity()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_Intensity();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Expression</em>'.
	 * @see OPLmetamodel.IntegerExpression
	 * @generated
	 */
	EClass getIntegerExpression();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.IntegerExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see OPLmetamodel.IntegerExpression#getBody()
	 * @see #getIntegerExpression()
	 * @generated
	 */
	EAttribute getIntegerExpression_Body();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.IntegerRangeType <em>Integer Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Range Type</em>'.
	 * @see OPLmetamodel.IntegerRangeType
	 * @generated
	 */
	EClass getIntegerRangeType();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.IndexValuePair <em>Index Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Value Pair</em>'.
	 * @see OPLmetamodel.IndexValuePair
	 * @generated
	 */
	EClass getIndexValuePair();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.IndexValuePair#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see OPLmetamodel.IndexValuePair#getIndex()
	 * @see #getIndexValuePair()
	 * @generated
	 */
	EReference getIndexValuePair_Index();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.IndexValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see OPLmetamodel.IndexValuePair#getValue()
	 * @see #getIndexValuePair()
	 * @generated
	 */
	EReference getIndexValuePair_Value();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see OPLmetamodel.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.Model#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see OPLmetamodel.Model#getId()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Id();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.Model#isIsConstraintProblem <em>Is Constraint Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Constraint Problem</em>'.
	 * @see OPLmetamodel.Model#isIsConstraintProblem()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_IsConstraintProblem();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.Model#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see OPLmetamodel.Model#getTypes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.Model#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see OPLmetamodel.Model#getData()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.Model#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see OPLmetamodel.Model#getConstraints()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.Model#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instruction</em>'.
	 * @see OPLmetamodel.Model#getInstruction()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Instruction();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.Model#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see OPLmetamodel.Model#getFunctions()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.Model#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see OPLmetamodel.Model#getActivities()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Activities();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.Model#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see OPLmetamodel.Model#getResources()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.Model#getAssertions <em>Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertions</em>'.
	 * @see OPLmetamodel.Model#getAssertions()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Assertions();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.Model#getScheduleInit <em>Schedule Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schedule Init</em>'.
	 * @see OPLmetamodel.Model#getScheduleInit()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ScheduleInit();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.Model#getScripts <em>Scripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scripts</em>'.
	 * @see OPLmetamodel.Model#getScripts()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Scripts();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.Model#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Settings</em>'.
	 * @see OPLmetamodel.Model#getSettings()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Settings();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.Model#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see OPLmetamodel.Model#getDeclarations()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Declarations();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.Model#getSearch <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search</em>'.
	 * @see OPLmetamodel.Model#getSearch()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Search();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see OPLmetamodel.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.NumericExpression <em>Numeric Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Expression</em>'.
	 * @see OPLmetamodel.NumericExpression
	 * @generated
	 */
	EClass getNumericExpression();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Type</em>'.
	 * @see OPLmetamodel.NumericType
	 * @generated
	 */
	EClass getNumericType();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Objective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective</em>'.
	 * @see OPLmetamodel.Objective
	 * @generated
	 */
	EClass getObjective();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.Objective#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see OPLmetamodel.Objective#getAction()
	 * @see #getObjective()
	 * @generated
	 */
	EAttribute getObjective_Action();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.Objective#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see OPLmetamodel.Objective#getExpression()
	 * @see #getObjective()
	 * @generated
	 */
	EReference getObjective_Expression();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.Objective#isIsLinearRelaxation <em>Is Linear Relaxation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Linear Relaxation</em>'.
	 * @see OPLmetamodel.Objective#isIsLinearRelaxation()
	 * @see #getObjective()
	 * @generated
	 */
	EAttribute getObjective_IsLinearRelaxation();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see OPLmetamodel.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.ParameterDeclaration <em>Parameter Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Declaration</em>'.
	 * @see OPLmetamodel.ParameterDeclaration
	 * @generated
	 */
	EClass getParameterDeclaration();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.ParameterDomain <em>Parameter Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Domain</em>'.
	 * @see OPLmetamodel.ParameterDomain
	 * @generated
	 */
	EClass getParameterDomain();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.ParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Ref</em>'.
	 * @see OPLmetamodel.ParameterRef
	 * @generated
	 */
	EClass getParameterRef();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.PathDereference <em>Path Dereference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Dereference</em>'.
	 * @see OPLmetamodel.PathDereference
	 * @generated
	 */
	EClass getPathDereference();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.PathDereference#getDeref <em>Deref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deref</em>'.
	 * @see OPLmetamodel.PathDereference#getDeref()
	 * @see #getPathDereference()
	 * @generated
	 */
	EReference getPathDereference_Deref();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.PathDereference#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base</em>'.
	 * @see OPLmetamodel.PathDereference#getBase()
	 * @see #getPathDereference()
	 * @generated
	 */
	EReference getPathDereference_Base();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.PathExpression <em>Path Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Expression</em>'.
	 * @see OPLmetamodel.PathExpression
	 * @generated
	 */
	EClass getPathExpression();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.PiecewiseExpression <em>Piecewise Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Piecewise Expression</em>'.
	 * @see OPLmetamodel.PiecewiseExpression
	 * @generated
	 */
	EClass getPiecewiseExpression();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.PiecewiseLinearFunction <em>Piecewise Linear Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Piecewise Linear Function</em>'.
	 * @see OPLmetamodel.PiecewiseLinearFunction
	 * @generated
	 */
	EClass getPiecewiseLinearFunction();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.PositiveFloatType <em>Positive Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Float Type</em>'.
	 * @see OPLmetamodel.PositiveFloatType
	 * @generated
	 */
	EClass getPositiveFloatType();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.PrimitiveExpression <em>Primitive Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Expression</em>'.
	 * @see OPLmetamodel.PrimitiveExpression
	 * @generated
	 */
	EClass getPrimitiveExpression();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see OPLmetamodel.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.PositiveIntegerType <em>Positive Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Integer Type</em>'.
	 * @see OPLmetamodel.PositiveIntegerType
	 * @generated
	 */
	EClass getPositiveIntegerType();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.QueryUser <em>Query User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query User</em>'.
	 * @see OPLmetamodel.QueryUser
	 * @generated
	 */
	EClass getQueryUser();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.QueryUser#getAsk <em>Ask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ask</em>'.
	 * @see OPLmetamodel.QueryUser#getAsk()
	 * @see #getQueryUser()
	 * @generated
	 */
	EAttribute getQueryUser_Ask();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.RangeExpression <em>Range Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Expression</em>'.
	 * @see OPLmetamodel.RangeExpression
	 * @generated
	 */
	EClass getRangeExpression();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.RangeExpression#getLowerLimit <em>Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Limit</em>'.
	 * @see OPLmetamodel.RangeExpression#getLowerLimit()
	 * @see #getRangeExpression()
	 * @generated
	 */
	EReference getRangeExpression_LowerLimit();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.RangeExpression#getUpperLimit <em>Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Limit</em>'.
	 * @see OPLmetamodel.RangeExpression#getUpperLimit()
	 * @see #getRangeExpression()
	 * @generated
	 */
	EReference getRangeExpression_UpperLimit();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.RangeExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see OPLmetamodel.RangeExpression#getType()
	 * @see #getRangeExpression()
	 * @generated
	 */
	EReference getRangeExpression_Type();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Type</em>'.
	 * @see OPLmetamodel.RangeType
	 * @generated
	 */
	EClass getRangeType();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.RangeType#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see OPLmetamodel.RangeType#getUpperBound()
	 * @see #getRangeType()
	 * @generated
	 */
	EReference getRangeType_UpperBound();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.RangeType#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Bound</em>'.
	 * @see OPLmetamodel.RangeType#getLowerBound()
	 * @see #getRangeType()
	 * @generated
	 */
	EReference getRangeType_LowerBound();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.ReadFile <em>Read File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read File</em>'.
	 * @see OPLmetamodel.ReadFile
	 * @generated
	 */
	EClass getReadFile();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.ReadFile#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see OPLmetamodel.ReadFile#getPath()
	 * @see #getReadFile()
	 * @generated
	 */
	EAttribute getReadFile_Path();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see OPLmetamodel.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.Record#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see OPLmetamodel.Record#getName()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.Record#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see OPLmetamodel.Record#getFields()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Fields();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.Record#isIsTuple <em>Is Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Tuple</em>'.
	 * @see OPLmetamodel.Record#isIsTuple()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_IsTuple();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.RecordField <em>Record Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Field</em>'.
	 * @see OPLmetamodel.RecordField
	 * @generated
	 */
	EClass getRecordField();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.RecordField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see OPLmetamodel.RecordField#getName()
	 * @see #getRecordField()
	 * @generated
	 */
	EAttribute getRecordField_Name();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.RecordField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see OPLmetamodel.RecordField#getType()
	 * @see #getRecordField()
	 * @generated
	 */
	EReference getRecordField_Type();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.RecordValue <em>Record Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Value</em>'.
	 * @see OPLmetamodel.RecordValue
	 * @generated
	 */
	EClass getRecordValue();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.RecordValue#getFieldPairs <em>Field Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Pairs</em>'.
	 * @see OPLmetamodel.RecordValue#getFieldPairs()
	 * @see #getRecordValue()
	 * @generated
	 */
	EReference getRecordValue_FieldPairs();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see OPLmetamodel.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.Reference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see OPLmetamodel.Reference#getName()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Name();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.ReflectiveFunction <em>Reflective Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflective Function</em>'.
	 * @see OPLmetamodel.ReflectiveFunction
	 * @generated
	 */
	EClass getReflectiveFunction();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Expression</em>'.
	 * @see OPLmetamodel.RelationalExpression
	 * @generated
	 */
	EClass getRelationalExpression();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.RelationalExpression#getRedefinedOp <em>Redefined Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redefined Op</em>'.
	 * @see OPLmetamodel.RelationalExpression#getRedefinedOp()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EAttribute getRelationalExpression_RedefinedOp();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.RelationalInit <em>Relational Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Init</em>'.
	 * @see OPLmetamodel.RelationalInit
	 * @generated
	 */
	EClass getRelationalInit();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.RelationalInit#getBindingVar <em>Binding Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Var</em>'.
	 * @see OPLmetamodel.RelationalInit#getBindingVar()
	 * @see #getRelationalInit()
	 * @generated
	 */
	EReference getRelationalInit_BindingVar();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.RelationalInit#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sources</em>'.
	 * @see OPLmetamodel.RelationalInit#getSources()
	 * @see #getRelationalInit()
	 * @generated
	 */
	EReference getRelationalInit_Sources();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.RelationalInit#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relation</em>'.
	 * @see OPLmetamodel.RelationalInit#getRelation()
	 * @see #getRelationalInit()
	 * @generated
	 */
	EReference getRelationalInit_Relation();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.RelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Operator</em>'.
	 * @see OPLmetamodel.RelationalOperator
	 * @generated
	 */
	EClass getRelationalOperator();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.RelationalOperator#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see OPLmetamodel.RelationalOperator#getOp()
	 * @see #getRelationalOperator()
	 * @generated
	 */
	EAttribute getRelationalOperator_Op();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.ResourceDeclaration <em>Resource Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Declaration</em>'.
	 * @see OPLmetamodel.ResourceDeclaration
	 * @generated
	 */
	EClass getResourceDeclaration();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.ScheduleInitialization <em>Schedule Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Initialization</em>'.
	 * @see OPLmetamodel.ScheduleInitialization
	 * @generated
	 */
	EClass getScheduleInitialization();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see OPLmetamodel.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.Script#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see OPLmetamodel.Script#getId()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Id();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.Script#isIsMain <em>Is Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Main</em>'.
	 * @see OPLmetamodel.Script#isIsMain()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_IsMain();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.Script#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see OPLmetamodel.Script#getStatements()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Statements();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.ScriptStatement <em>Script Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Statement</em>'.
	 * @see OPLmetamodel.ScriptStatement
	 * @generated
	 */
	EClass getScriptStatement();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.SearchProcedure <em>Search Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Procedure</em>'.
	 * @see OPLmetamodel.SearchProcedure
	 * @generated
	 */
	EClass getSearchProcedure();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see OPLmetamodel.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.Sequence#getIntervals <em>Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intervals</em>'.
	 * @see OPLmetamodel.Sequence#getIntervals()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Intervals();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.Sequence#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Types</em>'.
	 * @see OPLmetamodel.Sequence#getTypes()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Types();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Setting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setting</em>'.
	 * @see OPLmetamodel.Setting
	 * @generated
	 */
	EClass getSetting();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Type</em>'.
	 * @see OPLmetamodel.SetType
	 * @generated
	 */
	EClass getSetType();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.SetType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see OPLmetamodel.SetType#getName()
	 * @see #getSetType()
	 * @generated
	 */
	EAttribute getSetType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.SetType#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Type</em>'.
	 * @see OPLmetamodel.SetType#getBaseType()
	 * @see #getSetType()
	 * @generated
	 */
	EReference getSetType_BaseType();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.SetType#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see OPLmetamodel.SetType#getElements()
	 * @see #getSetType()
	 * @generated
	 */
	EReference getSetType_Elements();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.SetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Value</em>'.
	 * @see OPLmetamodel.SetValue
	 * @generated
	 */
	EClass getSetValue();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.SetValue#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see OPLmetamodel.SetValue#getItems()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_Items();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.StateFunction <em>State Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Function</em>'.
	 * @see OPLmetamodel.StateFunction
	 * @generated
	 */
	EClass getStateFunction();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.StateFunction#getTransitionMatrix <em>Transition Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition Matrix</em>'.
	 * @see OPLmetamodel.StateFunction#getTransitionMatrix()
	 * @see #getStateFunction()
	 * @generated
	 */
	EReference getStateFunction_TransitionMatrix();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.StepFunction <em>Step Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Function</em>'.
	 * @see OPLmetamodel.StepFunction
	 * @generated
	 */
	EClass getStepFunction();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Expression</em>'.
	 * @see OPLmetamodel.StringExpression
	 * @generated
	 */
	EClass getStringExpression();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.StringExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see OPLmetamodel.StringExpression#getBody()
	 * @see #getStringExpression()
	 * @generated
	 */
	EAttribute getStringExpression_Body();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see OPLmetamodel.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.TupleBinding <em>Tuple Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Binding</em>'.
	 * @see OPLmetamodel.TupleBinding
	 * @generated
	 */
	EClass getTupleBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.TupleBinding#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vars</em>'.
	 * @see OPLmetamodel.TupleBinding#getVars()
	 * @see #getTupleBinding()
	 * @generated
	 */
	EReference getTupleBinding_Vars();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see OPLmetamodel.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.UnaryExpression#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see OPLmetamodel.UnaryExpression#getExp()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Exp();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.UnaryExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see OPLmetamodel.UnaryExpression#getOp()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Op();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.VariableBinding <em>Variable Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Binding</em>'.
	 * @see OPLmetamodel.VariableBinding
	 * @generated
	 */
	EClass getVariableBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link OPLmetamodel.VariableBinding#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vars</em>'.
	 * @see OPLmetamodel.VariableBinding#getVars()
	 * @see #getVariableBinding()
	 * @generated
	 */
	EReference getVariableBinding_Vars();

	/**
	 * Returns the meta object for the containment reference '{@link OPLmetamodel.VariableBinding#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see OPLmetamodel.VariableBinding#getDomain()
	 * @see #getVariableBinding()
	 * @generated
	 */
	EReference getVariableBinding_Domain();

	/**
	 * Returns the meta object for class '{@link OPLmetamodel.Writeln <em>Writeln</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writeln</em>'.
	 * @see OPLmetamodel.Writeln
	 * @generated
	 */
	EClass getWriteln();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.Writeln#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see OPLmetamodel.Writeln#getString()
	 * @see #getWriteln()
	 * @generated
	 */
	EAttribute getWriteln_String();

	/**
	 * Returns the meta object for the attribute '{@link OPLmetamodel.Writeln#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arg</em>'.
	 * @see OPLmetamodel.Writeln#getArg()
	 * @see #getWriteln()
	 * @generated
	 */
	EAttribute getWriteln_Arg();

	/**
	 * Returns the meta object for enum '{@link OPLmetamodel.AggOp <em>Agg Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Agg Op</em>'.
	 * @see OPLmetamodel.AggOp
	 * @generated
	 */
	EEnum getAggOp();

	/**
	 * Returns the meta object for enum '{@link OPLmetamodel.BinaryOp <em>Binary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Op</em>'.
	 * @see OPLmetamodel.BinaryOp
	 * @generated
	 */
	EEnum getBinaryOp();

	/**
	 * Returns the meta object for enum '{@link OPLmetamodel.LogicalOp <em>Logical Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Op</em>'.
	 * @see OPLmetamodel.LogicalOp
	 * @generated
	 */
	EEnum getLogicalOp();

	/**
	 * Returns the meta object for enum '{@link OPLmetamodel.MembershipOp <em>Membership Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Membership Op</em>'.
	 * @see OPLmetamodel.MembershipOp
	 * @generated
	 */
	EEnum getMembershipOp();

	/**
	 * Returns the meta object for enum '{@link OPLmetamodel.OptimizationMode <em>Optimization Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Optimization Mode</em>'.
	 * @see OPLmetamodel.OptimizationMode
	 * @generated
	 */
	EEnum getOptimizationMode();

	/**
	 * Returns the meta object for enum '{@link OPLmetamodel.Quantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantifier</em>'.
	 * @see OPLmetamodel.Quantifier
	 * @generated
	 */
	EEnum getQuantifier();

	/**
	 * Returns the meta object for enum '{@link OPLmetamodel.RelationalOp <em>Relational Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relational Op</em>'.
	 * @see OPLmetamodel.RelationalOp
	 * @generated
	 */
	EEnum getRelationalOp();

	/**
	 * Returns the meta object for enum '{@link OPLmetamodel.SetOp <em>Set Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Set Op</em>'.
	 * @see OPLmetamodel.SetOp
	 * @generated
	 */
	EEnum getSetOp();

	/**
	 * Returns the meta object for enum '{@link OPLmetamodel.UnaryOp <em>Unary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Op</em>'.
	 * @see OPLmetamodel.UnaryOp
	 * @generated
	 */
	EEnum getUnaryOp();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Identifier</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getIdentifier();

	/**
	 * Returns the meta object for data type '{@link java.text.SimpleDateFormat <em>Timepoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timepoint</em>'.
	 * @see java.text.SimpleDateFormat
	 * @model instanceClass="java.text.SimpleDateFormat"
	 * @generated
	 */
	EDataType getTimepoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OPLmetamodelFactory getOPLmetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.AbstractBinaryOperatorImpl <em>Abstract Binary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.AbstractBinaryOperatorImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getAbstractBinaryOperator()
		 * @generated
		 */
		EClass ABSTRACT_BINARY_OPERATOR = eINSTANCE.getAbstractBinaryOperator();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.AbstractTypeImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getAbstractType()
		 * @generated
		 */
		EClass ABSTRACT_TYPE = eINSTANCE.getAbstractType();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ActivityDeclarationImpl <em>Activity Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ActivityDeclarationImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getActivityDeclaration()
		 * @generated
		 */
		EClass ACTIVITY_DECLARATION = eINSTANCE.getActivityDeclaration();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DECLARATION__DURATION = eINSTANCE.getActivityDeclaration_Duration();

		/**
		 * The meta object literal for the '<em><b>Earliest Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DECLARATION__EARLIEST_START_TIME = eINSTANCE.getActivityDeclaration_EarliestStartTime();

		/**
		 * The meta object literal for the '<em><b>Latest End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DECLARATION__LATEST_END_TIME = eINSTANCE.getActivityDeclaration_LatestEndTime();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.AggregateExpImpl <em>Aggregate Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.AggregateExpImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getAggregateExp()
		 * @generated
		 */
		EClass AGGREGATE_EXP = eINSTANCE.getAggregateExp();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE_EXP__OP = eINSTANCE.getAggregateExp_Op();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_EXP__PARAMETERS = eINSTANCE.getAggregateExp_Parameters();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_EXP__BODY = eINSTANCE.getAggregateExp_Body();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.AllExpressionImpl <em>All Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.AllExpressionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getAllExpression()
		 * @generated
		 */
		EClass ALL_EXPRESSION = eINSTANCE.getAllExpression();

		/**
		 * The meta object literal for the '<em><b>Qualifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_EXPRESSION__QUALIFIERS = eINSTANCE.getAllExpression_Qualifiers();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALL_EXPRESSION__BODY = eINSTANCE.getAllExpression_Body();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ArrayDereferenceImpl <em>Array Dereference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ArrayDereferenceImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getArrayDereference()
		 * @generated
		 */
		EClass ARRAY_DEREFERENCE = eINSTANCE.getArrayDereference();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_DEREFERENCE__ARRAY = eINSTANCE.getArrayDereference_Array();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_DEREFERENCE__INDEX = eINSTANCE.getArrayDereference_Index();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ArraySlotConstraintImpl <em>Array Slot Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ArraySlotConstraintImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getArraySlotConstraint()
		 * @generated
		 */
		EClass ARRAY_SLOT_CONSTRAINT = eINSTANCE.getArraySlotConstraint();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_SLOT_CONSTRAINT__TARGET = eINSTANCE.getArraySlotConstraint_Target();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ArrayTypeImpl <em>Array Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ArrayTypeImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getArrayType()
		 * @generated
		 */
		EClass ARRAY_TYPE = eINSTANCE.getArrayType();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE__BASE_TYPE = eINSTANCE.getArrayType_BaseType();

		/**
		 * The meta object literal for the '<em><b>Subscripts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE__SUBSCRIPTS = eINSTANCE.getArrayType_Subscripts();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ArrayValueImpl <em>Array Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ArrayValueImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getArrayValue()
		 * @generated
		 */
		EClass ARRAY_VALUE = eINSTANCE.getArrayValue();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_VALUE__ITEMS = eINSTANCE.getArrayValue_Items();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.AssertionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__EXP = eINSTANCE.getAssertion_Exp();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.BinaryExpressionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LHS = eINSTANCE.getBinaryExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RHS = eINSTANCE.getBinaryExpression_Rhs();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__OP = eINSTANCE.getBinaryExpression_Op();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.BinaryOperatorImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EClass BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_OPERATOR__OP = eINSTANCE.getBinaryOperator_Op();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.BindingRefImpl <em>Binding Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.BindingRefImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBindingRef()
		 * @generated
		 */
		EClass BINDING_REF = eINSTANCE.getBindingRef();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.BlockExpressionImpl <em>Block Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.BlockExpressionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBlockExpression()
		 * @generated
		 */
		EClass BLOCK_EXPRESSION = eINSTANCE.getBlockExpression();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_EXPRESSION__BLOCKS = eINSTANCE.getBlockExpression_Blocks();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.BooleanBlockImpl <em>Boolean Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.BooleanBlockImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBooleanBlock()
		 * @generated
		 */
		EClass BOOLEAN_BLOCK = eINSTANCE.getBooleanBlock();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.BooleanExpressionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXPRESSION__BODY = eINSTANCE.getBooleanExpression_Body();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.BooleanTypeImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.BuiltInFunctionImpl <em>Built In Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.BuiltInFunctionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBuiltInFunction()
		 * @generated
		 */
		EClass BUILT_IN_FUNCTION = eINSTANCE.getBuiltInFunction();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.CollectionExpressionImpl <em>Collection Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.CollectionExpressionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getCollectionExpression()
		 * @generated
		 */
		EClass COLLECTION_EXPRESSION = eINSTANCE.getCollectionExpression();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_EXPRESSION__IS_UNIQUE = eINSTANCE.getCollectionExpression_IsUnique();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ConstraintImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__EXP = eINSTANCE.getConstraint_Exp();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ComprehensionImpl <em>Comprehension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ComprehensionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getComprehension()
		 * @generated
		 */
		EClass COMPREHENSION = eINSTANCE.getComprehension();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.CumulativeFunctionImpl <em>Cumulative Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.CumulativeFunctionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getCumulativeFunction()
		 * @generated
		 */
		EClass CUMULATIVE_FUNCTION = eINSTANCE.getCumulativeFunction();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.DataDeclarationImpl <em>Data Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.DataDeclarationImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getDataDeclaration()
		 * @generated
		 */
		EClass DATA_DECLARATION = eINSTANCE.getDataDeclaration();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DECLARATION__VARIABLE = eINSTANCE.getDataDeclaration_Variable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DECLARATION__TYPE = eINSTANCE.getDataDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Is Decision Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DECLARATION__IS_DECISION_VAR = eINSTANCE.getDataDeclaration_IsDecisionVar();

		/**
		 * The meta object literal for the '<em><b>Is Decision Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DECLARATION__IS_DECISION_EXPR = eINSTANCE.getDataDeclaration_IsDecisionExpr();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DECLARATION__VALUE = eINSTANCE.getDataDeclaration_Value();

		/**
		 * The meta object literal for the '<em><b>Value Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DECLARATION__VALUE_CONSTRAINT = eINSTANCE.getDataDeclaration_ValueConstraint();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.DataInitMethodsImpl <em>Data Init Methods</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.DataInitMethodsImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getDataInitMethods()
		 * @generated
		 */
		EClass DATA_INIT_METHODS = eINSTANCE.getDataInitMethods();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.DataObjectImpl <em>Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.DataObjectImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getDataObject()
		 * @generated
		 */
		EClass DATA_OBJECT = eINSTANCE.getDataObject();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OBJECT__BODY = eINSTANCE.getDataObject_Body();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.DataRefImpl <em>Data Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.DataRefImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getDataRef()
		 * @generated
		 */
		EClass DATA_REF = eINSTANCE.getDataRef();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.DeclarationImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATION__ORDER = eINSTANCE.getDeclaration_Order();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.DeferredInitImpl <em>Deferred Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.DeferredInitImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getDeferredInit()
		 * @generated
		 */
		EClass DEFERRED_INIT = eINSTANCE.getDeferredInit();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.DefinedTypeImpl <em>Defined Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.DefinedTypeImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getDefinedType()
		 * @generated
		 */
		EClass DEFINED_TYPE = eINSTANCE.getDefinedType();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.DisplayInstructionImpl <em>Display Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.DisplayInstructionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getDisplayInstruction()
		 * @generated
		 */
		EClass DISPLAY_INSTRUCTION = eINSTANCE.getDisplayInstruction();

		/**
		 * The meta object literal for the '<em><b>Exps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_INSTRUCTION__EXPS = eINSTANCE.getDisplayInstruction_Exps();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_INSTRUCTION__PARAMETERS = eINSTANCE.getDisplayInstruction_Parameters();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.EnumerationTypeImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getEnumerationType()
		 * @generated
		 */
		EClass ENUMERATION_TYPE = eINSTANCE.getEnumerationType();

		/**
		 * The meta object literal for the '<em><b>Redefined Base Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_TYPE__REDEFINED_BASE_TYPE = eINSTANCE.getEnumerationType_RedefinedBaseType();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.EnumLiteralImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getEnumLiteral()
		 * @generated
		 */
		EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.EntityImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ErrorImpl <em>Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ErrorImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getError()
		 * @generated
		 */
		EClass ERROR = eINSTANCE.getError();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ExpressionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.FloatRangeTypeImpl <em>Float Range Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.FloatRangeTypeImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getFloatRangeType()
		 * @generated
		 */
		EClass FLOAT_RANGE_TYPE = eINSTANCE.getFloatRangeType();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.FloatTypeImpl <em>Float Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.FloatTypeImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getFloatType()
		 * @generated
		 */
		EClass FLOAT_TYPE = eINSTANCE.getFloatType();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.FormalParameterImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getFormalParameter()
		 * @generated
		 */
		EClass FORMAL_PARAMETER = eINSTANCE.getFormalParameter();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_PARAMETER__DOMAIN = eINSTANCE.getFormalParameter_Domain();

		/**
		 * The meta object literal for the '<em><b>Bound Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_PARAMETER__BOUND_VARS = eINSTANCE.getFormalParameter_BoundVars();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_PARAMETER__IS_ORDERED = eINSTANCE.getFormalParameter_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Require</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_PARAMETER__REQUIRE = eINSTANCE.getFormalParameter_Require();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ExtensionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Exps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__EXPS = eINSTANCE.getExtension_Exps();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.FloatExpressionImpl <em>Float Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.FloatExpressionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getFloatExpression()
		 * @generated
		 */
		EClass FLOAT_EXPRESSION = eINSTANCE.getFloatExpression();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_EXPRESSION__BODY = eINSTANCE.getFloatExpression_Body();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ForAllConstraintImpl <em>For All Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ForAllConstraintImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getForAllConstraint()
		 * @generated
		 */
		EClass FOR_ALL_CONSTRAINT = eINSTANCE.getForAllConstraint();

		/**
		 * The meta object literal for the '<em><b>Qualifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_ALL_CONSTRAINT__QUALIFIERS = eINSTANCE.getForAllConstraint_Qualifiers();

		/**
		 * The meta object literal for the '<em><b>Exps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_ALL_CONSTRAINT__EXPS = eINSTANCE.getForAllConstraint_Exps();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.FunctionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__BODY = eINSTANCE.getFunction_Body();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.FunctionCallImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_CALL__FUNCTION_NAME = eINSTANCE.getFunctionCall_FunctionName();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__ARGS = eINSTANCE.getFunctionCall_Args();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.FunctionRefImpl <em>Function Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.FunctionRefImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getFunctionRef()
		 * @generated
		 */
		EClass FUNCTION_REF = eINSTANCE.getFunctionRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_REF__NAME = eINSTANCE.getFunctionRef_Name();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.IfConstraintImpl <em>If Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.IfConstraintImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getIfConstraint()
		 * @generated
		 */
		EClass IF_CONSTRAINT = eINSTANCE.getIfConstraint();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_CONSTRAINT__TEST = eINSTANCE.getIfConstraint_Test();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_CONSTRAINT__THEN = eINSTANCE.getIfConstraint_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_CONSTRAINT__ELSE = eINSTANCE.getIfConstraint_Else();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.IfExpressionImpl <em>If Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.IfExpressionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getIfExpression()
		 * @generated
		 */
		EClass IF_EXPRESSION = eINSTANCE.getIfExpression();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__TEST = eINSTANCE.getIfExpression_Test();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__THEN = eINSTANCE.getIfExpression_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__ELSE = eINSTANCE.getIfExpression_Else();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.InImpl <em>In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.InImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getIn()
		 * @generated
		 */
		EClass IN = eINSTANCE.getIn();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.IntegerTypeImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getIntegerType()
		 * @generated
		 */
		EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.InitializationImpl <em>Initialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.InitializationImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getInitialization()
		 * @generated
		 */
		EClass INITIALIZATION = eINSTANCE.getInitialization();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.IntervalImpl <em>Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.IntervalImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getInterval()
		 * @generated
		 */
		EClass INTERVAL = eINSTANCE.getInterval();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__IS_OPTIONAL = eINSTANCE.getInterval_IsOptional();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__BOUNDS = eINSTANCE.getInterval_Bounds();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__SIZE = eINSTANCE.getInterval_Size();

		/**
		 * The meta object literal for the '<em><b>Intensity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__INTENSITY = eINSTANCE.getInterval_Intensity();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.IntegerExpressionImpl <em>Integer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.IntegerExpressionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getIntegerExpression()
		 * @generated
		 */
		EClass INTEGER_EXPRESSION = eINSTANCE.getIntegerExpression();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_EXPRESSION__BODY = eINSTANCE.getIntegerExpression_Body();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.IntegerRangeTypeImpl <em>Integer Range Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.IntegerRangeTypeImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getIntegerRangeType()
		 * @generated
		 */
		EClass INTEGER_RANGE_TYPE = eINSTANCE.getIntegerRangeType();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.IndexValuePairImpl <em>Index Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.IndexValuePairImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getIndexValuePair()
		 * @generated
		 */
		EClass INDEX_VALUE_PAIR = eINSTANCE.getIndexValuePair();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_VALUE_PAIR__INDEX = eINSTANCE.getIndexValuePair_Index();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_VALUE_PAIR__VALUE = eINSTANCE.getIndexValuePair_Value();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ModelImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__ID = eINSTANCE.getModel_Id();

		/**
		 * The meta object literal for the '<em><b>Is Constraint Problem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__IS_CONSTRAINT_PROBLEM = eINSTANCE.getModel_IsConstraintProblem();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TYPES = eINSTANCE.getModel_Types();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DATA = eINSTANCE.getModel_Data();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONSTRAINTS = eINSTANCE.getModel_Constraints();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__INSTRUCTION = eINSTANCE.getModel_Instruction();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__FUNCTIONS = eINSTANCE.getModel_Functions();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ACTIVITIES = eINSTANCE.getModel_Activities();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__RESOURCES = eINSTANCE.getModel_Resources();

		/**
		 * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ASSERTIONS = eINSTANCE.getModel_Assertions();

		/**
		 * The meta object literal for the '<em><b>Schedule Init</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SCHEDULE_INIT = eINSTANCE.getModel_ScheduleInit();

		/**
		 * The meta object literal for the '<em><b>Scripts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SCRIPTS = eINSTANCE.getModel_Scripts();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SETTINGS = eINSTANCE.getModel_Settings();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DECLARATIONS = eINSTANCE.getModel_Declarations();

		/**
		 * The meta object literal for the '<em><b>Search</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SEARCH = eINSTANCE.getModel_Search();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.NumberImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.NumericExpressionImpl <em>Numeric Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.NumericExpressionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getNumericExpression()
		 * @generated
		 */
		EClass NUMERIC_EXPRESSION = eINSTANCE.getNumericExpression();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.NumericTypeImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getNumericType()
		 * @generated
		 */
		EClass NUMERIC_TYPE = eINSTANCE.getNumericType();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ObjectiveImpl <em>Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ObjectiveImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getObjective()
		 * @generated
		 */
		EClass OBJECTIVE = eINSTANCE.getObjective();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE__ACTION = eINSTANCE.getObjective_Action();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE__EXPRESSION = eINSTANCE.getObjective_Expression();

		/**
		 * The meta object literal for the '<em><b>Is Linear Relaxation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE__IS_LINEAR_RELAXATION = eINSTANCE.getObjective_IsLinearRelaxation();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.OperatorImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ParameterDeclarationImpl <em>Parameter Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ParameterDeclarationImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getParameterDeclaration()
		 * @generated
		 */
		EClass PARAMETER_DECLARATION = eINSTANCE.getParameterDeclaration();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ParameterDomainImpl <em>Parameter Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ParameterDomainImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getParameterDomain()
		 * @generated
		 */
		EClass PARAMETER_DOMAIN = eINSTANCE.getParameterDomain();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ParameterRefImpl <em>Parameter Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ParameterRefImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getParameterRef()
		 * @generated
		 */
		EClass PARAMETER_REF = eINSTANCE.getParameterRef();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.PathDereferenceImpl <em>Path Dereference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.PathDereferenceImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getPathDereference()
		 * @generated
		 */
		EClass PATH_DEREFERENCE = eINSTANCE.getPathDereference();

		/**
		 * The meta object literal for the '<em><b>Deref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_DEREFERENCE__DEREF = eINSTANCE.getPathDereference_Deref();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_DEREFERENCE__BASE = eINSTANCE.getPathDereference_Base();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.PathExpressionImpl <em>Path Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.PathExpressionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getPathExpression()
		 * @generated
		 */
		EClass PATH_EXPRESSION = eINSTANCE.getPathExpression();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.PiecewiseExpressionImpl <em>Piecewise Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.PiecewiseExpressionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getPiecewiseExpression()
		 * @generated
		 */
		EClass PIECEWISE_EXPRESSION = eINSTANCE.getPiecewiseExpression();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.PiecewiseLinearFunctionImpl <em>Piecewise Linear Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.PiecewiseLinearFunctionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getPiecewiseLinearFunction()
		 * @generated
		 */
		EClass PIECEWISE_LINEAR_FUNCTION = eINSTANCE.getPiecewiseLinearFunction();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.PositiveFloatTypeImpl <em>Positive Float Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.PositiveFloatTypeImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getPositiveFloatType()
		 * @generated
		 */
		EClass POSITIVE_FLOAT_TYPE = eINSTANCE.getPositiveFloatType();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.PrimitiveExpressionImpl <em>Primitive Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.PrimitiveExpressionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getPrimitiveExpression()
		 * @generated
		 */
		EClass PRIMITIVE_EXPRESSION = eINSTANCE.getPrimitiveExpression();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.PrimitiveTypeImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.PositiveIntegerTypeImpl <em>Positive Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.PositiveIntegerTypeImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getPositiveIntegerType()
		 * @generated
		 */
		EClass POSITIVE_INTEGER_TYPE = eINSTANCE.getPositiveIntegerType();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.QueryUserImpl <em>Query User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.QueryUserImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getQueryUser()
		 * @generated
		 */
		EClass QUERY_USER = eINSTANCE.getQueryUser();

		/**
		 * The meta object literal for the '<em><b>Ask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_USER__ASK = eINSTANCE.getQueryUser_Ask();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.RangeExpressionImpl <em>Range Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.RangeExpressionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRangeExpression()
		 * @generated
		 */
		EClass RANGE_EXPRESSION = eINSTANCE.getRangeExpression();

		/**
		 * The meta object literal for the '<em><b>Lower Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_EXPRESSION__LOWER_LIMIT = eINSTANCE.getRangeExpression_LowerLimit();

		/**
		 * The meta object literal for the '<em><b>Upper Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_EXPRESSION__UPPER_LIMIT = eINSTANCE.getRangeExpression_UpperLimit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_EXPRESSION__TYPE = eINSTANCE.getRangeExpression_Type();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.RangeTypeImpl <em>Range Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.RangeTypeImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRangeType()
		 * @generated
		 */
		EClass RANGE_TYPE = eINSTANCE.getRangeType();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_TYPE__UPPER_BOUND = eINSTANCE.getRangeType_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_TYPE__LOWER_BOUND = eINSTANCE.getRangeType_LowerBound();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ReadFileImpl <em>Read File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ReadFileImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getReadFile()
		 * @generated
		 */
		EClass READ_FILE = eINSTANCE.getReadFile();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ_FILE__PATH = eINSTANCE.getReadFile_Path();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.RecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.RecordImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRecord()
		 * @generated
		 */
		EClass RECORD = eINSTANCE.getRecord();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__NAME = eINSTANCE.getRecord_Name();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__FIELDS = eINSTANCE.getRecord_Fields();

		/**
		 * The meta object literal for the '<em><b>Is Tuple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__IS_TUPLE = eINSTANCE.getRecord_IsTuple();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.RecordFieldImpl <em>Record Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.RecordFieldImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRecordField()
		 * @generated
		 */
		EClass RECORD_FIELD = eINSTANCE.getRecordField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_FIELD__NAME = eINSTANCE.getRecordField_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_FIELD__TYPE = eINSTANCE.getRecordField_Type();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.RecordValueImpl <em>Record Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.RecordValueImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRecordValue()
		 * @generated
		 */
		EClass RECORD_VALUE = eINSTANCE.getRecordValue();

		/**
		 * The meta object literal for the '<em><b>Field Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_VALUE__FIELD_PAIRS = eINSTANCE.getRecordValue_FieldPairs();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ReferenceImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__NAME = eINSTANCE.getReference_Name();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ReflectiveFunctionImpl <em>Reflective Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ReflectiveFunctionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getReflectiveFunction()
		 * @generated
		 */
		EClass REFLECTIVE_FUNCTION = eINSTANCE.getReflectiveFunction();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.RelationalExpressionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRelationalExpression()
		 * @generated
		 */
		EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Redefined Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_EXPRESSION__REDEFINED_OP = eINSTANCE.getRelationalExpression_RedefinedOp();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.RelationalInitImpl <em>Relational Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.RelationalInitImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRelationalInit()
		 * @generated
		 */
		EClass RELATIONAL_INIT = eINSTANCE.getRelationalInit();

		/**
		 * The meta object literal for the '<em><b>Binding Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_INIT__BINDING_VAR = eINSTANCE.getRelationalInit_BindingVar();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_INIT__SOURCES = eINSTANCE.getRelationalInit_Sources();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_INIT__RELATION = eINSTANCE.getRelationalInit_Relation();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.RelationalOperatorImpl <em>Relational Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.RelationalOperatorImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRelationalOperator()
		 * @generated
		 */
		EClass RELATIONAL_OPERATOR = eINSTANCE.getRelationalOperator();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_OPERATOR__OP = eINSTANCE.getRelationalOperator_Op();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ResourceDeclarationImpl <em>Resource Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ResourceDeclarationImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getResourceDeclaration()
		 * @generated
		 */
		EClass RESOURCE_DECLARATION = eINSTANCE.getResourceDeclaration();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ScheduleInitializationImpl <em>Schedule Initialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ScheduleInitializationImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getScheduleInitialization()
		 * @generated
		 */
		EClass SCHEDULE_INITIALIZATION = eINSTANCE.getScheduleInitialization();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ScriptImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__ID = eINSTANCE.getScript_Id();

		/**
		 * The meta object literal for the '<em><b>Is Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__IS_MAIN = eINSTANCE.getScript_IsMain();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__STATEMENTS = eINSTANCE.getScript_Statements();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.ScriptStatementImpl <em>Script Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.ScriptStatementImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getScriptStatement()
		 * @generated
		 */
		EClass SCRIPT_STATEMENT = eINSTANCE.getScriptStatement();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.SearchProcedureImpl <em>Search Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.SearchProcedureImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getSearchProcedure()
		 * @generated
		 */
		EClass SEARCH_PROCEDURE = eINSTANCE.getSearchProcedure();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.SequenceImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Intervals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__INTERVALS = eINSTANCE.getSequence_Intervals();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__TYPES = eINSTANCE.getSequence_Types();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.SettingImpl <em>Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.SettingImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getSetting()
		 * @generated
		 */
		EClass SETTING = eINSTANCE.getSetting();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.SetTypeImpl <em>Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.SetTypeImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getSetType()
		 * @generated
		 */
		EClass SET_TYPE = eINSTANCE.getSetType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_TYPE__NAME = eINSTANCE.getSetType_Name();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_TYPE__BASE_TYPE = eINSTANCE.getSetType_BaseType();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_TYPE__ELEMENTS = eINSTANCE.getSetType_Elements();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.SetValueImpl <em>Set Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.SetValueImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getSetValue()
		 * @generated
		 */
		EClass SET_VALUE = eINSTANCE.getSetValue();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__ITEMS = eINSTANCE.getSetValue_Items();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.StateFunctionImpl <em>State Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.StateFunctionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getStateFunction()
		 * @generated
		 */
		EClass STATE_FUNCTION = eINSTANCE.getStateFunction();

		/**
		 * The meta object literal for the '<em><b>Transition Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_FUNCTION__TRANSITION_MATRIX = eINSTANCE.getStateFunction_TransitionMatrix();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.StepFunctionImpl <em>Step Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.StepFunctionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getStepFunction()
		 * @generated
		 */
		EClass STEP_FUNCTION = eINSTANCE.getStepFunction();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.StringExpressionImpl <em>String Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.StringExpressionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getStringExpression()
		 * @generated
		 */
		EClass STRING_EXPRESSION = eINSTANCE.getStringExpression();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_EXPRESSION__BODY = eINSTANCE.getStringExpression_Body();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.StringTypeImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.TupleBindingImpl <em>Tuple Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.TupleBindingImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getTupleBinding()
		 * @generated
		 */
		EClass TUPLE_BINDING = eINSTANCE.getTupleBinding();

		/**
		 * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_BINDING__VARS = eINSTANCE.getTupleBinding_Vars();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.UnaryExpressionImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__EXP = eINSTANCE.getUnaryExpression_Exp();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OP = eINSTANCE.getUnaryExpression_Op();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.VariableBindingImpl <em>Variable Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.VariableBindingImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getVariableBinding()
		 * @generated
		 */
		EClass VARIABLE_BINDING = eINSTANCE.getVariableBinding();

		/**
		 * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_BINDING__VARS = eINSTANCE.getVariableBinding_Vars();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_BINDING__DOMAIN = eINSTANCE.getVariableBinding_Domain();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.impl.WritelnImpl <em>Writeln</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.impl.WritelnImpl
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getWriteln()
		 * @generated
		 */
		EClass WRITELN = eINSTANCE.getWriteln();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITELN__STRING = eINSTANCE.getWriteln_String();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITELN__ARG = eINSTANCE.getWriteln_Arg();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.AggOp <em>Agg Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.AggOp
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getAggOp()
		 * @generated
		 */
		EEnum AGG_OP = eINSTANCE.getAggOp();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.BinaryOp <em>Binary Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.BinaryOp
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getBinaryOp()
		 * @generated
		 */
		EEnum BINARY_OP = eINSTANCE.getBinaryOp();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.LogicalOp <em>Logical Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.LogicalOp
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getLogicalOp()
		 * @generated
		 */
		EEnum LOGICAL_OP = eINSTANCE.getLogicalOp();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.MembershipOp <em>Membership Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.MembershipOp
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getMembershipOp()
		 * @generated
		 */
		EEnum MEMBERSHIP_OP = eINSTANCE.getMembershipOp();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.OptimizationMode <em>Optimization Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.OptimizationMode
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getOptimizationMode()
		 * @generated
		 */
		EEnum OPTIMIZATION_MODE = eINSTANCE.getOptimizationMode();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.Quantifier <em>Quantifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.Quantifier
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getQuantifier()
		 * @generated
		 */
		EEnum QUANTIFIER = eINSTANCE.getQuantifier();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.RelationalOp <em>Relational Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.RelationalOp
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getRelationalOp()
		 * @generated
		 */
		EEnum RELATIONAL_OP = eINSTANCE.getRelationalOp();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.SetOp <em>Set Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.SetOp
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getSetOp()
		 * @generated
		 */
		EEnum SET_OP = eINSTANCE.getSetOp();

		/**
		 * The meta object literal for the '{@link OPLmetamodel.UnaryOp <em>Unary Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OPLmetamodel.UnaryOp
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getUnaryOp()
		 * @generated
		 */
		EEnum UNARY_OP = eINSTANCE.getUnaryOp();

		/**
		 * The meta object literal for the '<em>Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getIdentifier()
		 * @generated
		 */
		EDataType IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em>Timepoint</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.text.SimpleDateFormat
		 * @see OPLmetamodel.impl.OPLmetamodelPackageImpl#getTimepoint()
		 * @generated
		 */
		EDataType TIMEPOINT = eINSTANCE.getTimepoint();

	}

} //OPLmetamodelPackage
