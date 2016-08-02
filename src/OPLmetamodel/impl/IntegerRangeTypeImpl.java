/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.AbstractType;
import OPLmetamodel.Declaration;
import OPLmetamodel.DefinedType;
import OPLmetamodel.Entity;
import OPLmetamodel.IntegerRangeType;
import OPLmetamodel.NumericType;
import OPLmetamodel.OPLmetamodelPackage;
import OPLmetamodel.ParameterDomain;
import OPLmetamodel.RangeType;
import OPLmetamodel.SetType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.IntegerRangeTypeImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link OPLmetamodel.impl.IntegerRangeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link OPLmetamodel.impl.IntegerRangeTypeImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link OPLmetamodel.impl.IntegerRangeTypeImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link OPLmetamodel.impl.IntegerRangeTypeImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link OPLmetamodel.impl.IntegerRangeTypeImpl#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerRangeTypeImpl extends IntegerTypeImpl implements IntegerRangeType {
	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected AbstractType baseType;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> elements;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected NumericType upperBound;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected NumericType lowerBound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.INTEGER_RANGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.INTEGER_RANGE_TYPE__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.INTEGER_RANGE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType getBaseType() {
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseType(AbstractType newBaseType, NotificationChain msgs) {
		AbstractType oldBaseType = baseType;
		baseType = newBaseType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.INTEGER_RANGE_TYPE__BASE_TYPE, oldBaseType, newBaseType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseType(AbstractType newBaseType) {
		if (newBaseType != baseType) {
			NotificationChain msgs = null;
			if (baseType != null)
				msgs = ((InternalEObject)baseType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.INTEGER_RANGE_TYPE__BASE_TYPE, null, msgs);
			if (newBaseType != null)
				msgs = ((InternalEObject)newBaseType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.INTEGER_RANGE_TYPE__BASE_TYPE, null, msgs);
			msgs = basicSetBaseType(newBaseType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.INTEGER_RANGE_TYPE__BASE_TYPE, newBaseType, newBaseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Entity>(Entity.class, this, OPLmetamodelPackage.INTEGER_RANGE_TYPE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(NumericType newUpperBound, NotificationChain msgs) {
		NumericType oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.INTEGER_RANGE_TYPE__UPPER_BOUND, oldUpperBound, newUpperBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(NumericType newUpperBound) {
		if (newUpperBound != upperBound) {
			NotificationChain msgs = null;
			if (upperBound != null)
				msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.INTEGER_RANGE_TYPE__UPPER_BOUND, null, msgs);
			if (newUpperBound != null)
				msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.INTEGER_RANGE_TYPE__UPPER_BOUND, null, msgs);
			msgs = basicSetUpperBound(newUpperBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.INTEGER_RANGE_TYPE__UPPER_BOUND, newUpperBound, newUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerBound(NumericType newLowerBound, NotificationChain msgs) {
		NumericType oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.INTEGER_RANGE_TYPE__LOWER_BOUND, oldLowerBound, newLowerBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(NumericType newLowerBound) {
		if (newLowerBound != lowerBound) {
			NotificationChain msgs = null;
			if (lowerBound != null)
				msgs = ((InternalEObject)lowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.INTEGER_RANGE_TYPE__LOWER_BOUND, null, msgs);
			if (newLowerBound != null)
				msgs = ((InternalEObject)newLowerBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.INTEGER_RANGE_TYPE__LOWER_BOUND, null, msgs);
			msgs = basicSetLowerBound(newLowerBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.INTEGER_RANGE_TYPE__LOWER_BOUND, newLowerBound, newLowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__BASE_TYPE:
				return basicSetBaseType(null, msgs);
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__UPPER_BOUND:
				return basicSetUpperBound(null, msgs);
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__LOWER_BOUND:
				return basicSetLowerBound(null, msgs);
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
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__ORDER:
				return getOrder();
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__NAME:
				return getName();
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__BASE_TYPE:
				return getBaseType();
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__ELEMENTS:
				return getElements();
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__UPPER_BOUND:
				return getUpperBound();
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__LOWER_BOUND:
				return getLowerBound();
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
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__ORDER:
				setOrder((Integer)newValue);
				return;
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__NAME:
				setName((String)newValue);
				return;
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__BASE_TYPE:
				setBaseType((AbstractType)newValue);
				return;
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Entity>)newValue);
				return;
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__UPPER_BOUND:
				setUpperBound((NumericType)newValue);
				return;
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__LOWER_BOUND:
				setLowerBound((NumericType)newValue);
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
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__BASE_TYPE:
				setBaseType((AbstractType)null);
				return;
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__ELEMENTS:
				getElements().clear();
				return;
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__UPPER_BOUND:
				setUpperBound((NumericType)null);
				return;
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__LOWER_BOUND:
				setLowerBound((NumericType)null);
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
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__ORDER:
				return order != ORDER_EDEFAULT;
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__BASE_TYPE:
				return baseType != null;
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__UPPER_BOUND:
				return upperBound != null;
			case OPLmetamodelPackage.INTEGER_RANGE_TYPE__LOWER_BOUND:
				return lowerBound != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Declaration.class) {
			switch (derivedFeatureID) {
				case OPLmetamodelPackage.INTEGER_RANGE_TYPE__ORDER: return OPLmetamodelPackage.DECLARATION__ORDER;
				default: return -1;
			}
		}
		if (baseClass == DefinedType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ParameterDomain.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SetType.class) {
			switch (derivedFeatureID) {
				case OPLmetamodelPackage.INTEGER_RANGE_TYPE__NAME: return OPLmetamodelPackage.SET_TYPE__NAME;
				case OPLmetamodelPackage.INTEGER_RANGE_TYPE__BASE_TYPE: return OPLmetamodelPackage.SET_TYPE__BASE_TYPE;
				case OPLmetamodelPackage.INTEGER_RANGE_TYPE__ELEMENTS: return OPLmetamodelPackage.SET_TYPE__ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == RangeType.class) {
			switch (derivedFeatureID) {
				case OPLmetamodelPackage.INTEGER_RANGE_TYPE__UPPER_BOUND: return OPLmetamodelPackage.RANGE_TYPE__UPPER_BOUND;
				case OPLmetamodelPackage.INTEGER_RANGE_TYPE__LOWER_BOUND: return OPLmetamodelPackage.RANGE_TYPE__LOWER_BOUND;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Declaration.class) {
			switch (baseFeatureID) {
				case OPLmetamodelPackage.DECLARATION__ORDER: return OPLmetamodelPackage.INTEGER_RANGE_TYPE__ORDER;
				default: return -1;
			}
		}
		if (baseClass == DefinedType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ParameterDomain.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SetType.class) {
			switch (baseFeatureID) {
				case OPLmetamodelPackage.SET_TYPE__NAME: return OPLmetamodelPackage.INTEGER_RANGE_TYPE__NAME;
				case OPLmetamodelPackage.SET_TYPE__BASE_TYPE: return OPLmetamodelPackage.INTEGER_RANGE_TYPE__BASE_TYPE;
				case OPLmetamodelPackage.SET_TYPE__ELEMENTS: return OPLmetamodelPackage.INTEGER_RANGE_TYPE__ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == RangeType.class) {
			switch (baseFeatureID) {
				case OPLmetamodelPackage.RANGE_TYPE__UPPER_BOUND: return OPLmetamodelPackage.INTEGER_RANGE_TYPE__UPPER_BOUND;
				case OPLmetamodelPackage.RANGE_TYPE__LOWER_BOUND: return OPLmetamodelPackage.INTEGER_RANGE_TYPE__LOWER_BOUND;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (order: ");
		result.append(order);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IntegerRangeTypeImpl
