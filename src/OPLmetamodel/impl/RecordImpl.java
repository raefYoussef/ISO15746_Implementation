/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.AbstractType;
import OPLmetamodel.Declaration;
import OPLmetamodel.DefinedType;
import OPLmetamodel.OPLmetamodelPackage;
import OPLmetamodel.Record;
import OPLmetamodel.RecordField;

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
 * An implementation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.RecordImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link OPLmetamodel.impl.RecordImpl#getName <em>Name</em>}</li>
 *   <li>{@link OPLmetamodel.impl.RecordImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link OPLmetamodel.impl.RecordImpl#isIsTuple <em>Is Tuple</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordImpl extends ParameterDomainImpl implements Record {
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
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<RecordField> fields;

	/**
	 * The default value of the '{@link #isIsTuple() <em>Is Tuple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTuple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TUPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTuple() <em>Is Tuple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTuple()
	 * @generated
	 * @ordered
	 */
	protected boolean isTuple = IS_TUPLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.RECORD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.RECORD__ORDER, oldOrder, order));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.RECORD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<RecordField>(RecordField.class, this, OPLmetamodelPackage.RECORD__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTuple() {
		return isTuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTuple(boolean newIsTuple) {
		boolean oldIsTuple = isTuple;
		isTuple = newIsTuple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.RECORD__IS_TUPLE, oldIsTuple, isTuple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.RECORD__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case OPLmetamodelPackage.RECORD__ORDER:
				return getOrder();
			case OPLmetamodelPackage.RECORD__NAME:
				return getName();
			case OPLmetamodelPackage.RECORD__FIELDS:
				return getFields();
			case OPLmetamodelPackage.RECORD__IS_TUPLE:
				return isIsTuple();
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
			case OPLmetamodelPackage.RECORD__ORDER:
				setOrder((Integer)newValue);
				return;
			case OPLmetamodelPackage.RECORD__NAME:
				setName((String)newValue);
				return;
			case OPLmetamodelPackage.RECORD__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends RecordField>)newValue);
				return;
			case OPLmetamodelPackage.RECORD__IS_TUPLE:
				setIsTuple((Boolean)newValue);
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
			case OPLmetamodelPackage.RECORD__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case OPLmetamodelPackage.RECORD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OPLmetamodelPackage.RECORD__FIELDS:
				getFields().clear();
				return;
			case OPLmetamodelPackage.RECORD__IS_TUPLE:
				setIsTuple(IS_TUPLE_EDEFAULT);
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
			case OPLmetamodelPackage.RECORD__ORDER:
				return order != ORDER_EDEFAULT;
			case OPLmetamodelPackage.RECORD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OPLmetamodelPackage.RECORD__FIELDS:
				return fields != null && !fields.isEmpty();
			case OPLmetamodelPackage.RECORD__IS_TUPLE:
				return isTuple != IS_TUPLE_EDEFAULT;
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
		if (baseClass == AbstractType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Declaration.class) {
			switch (derivedFeatureID) {
				case OPLmetamodelPackage.RECORD__ORDER: return OPLmetamodelPackage.DECLARATION__ORDER;
				default: return -1;
			}
		}
		if (baseClass == DefinedType.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == AbstractType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Declaration.class) {
			switch (baseFeatureID) {
				case OPLmetamodelPackage.DECLARATION__ORDER: return OPLmetamodelPackage.RECORD__ORDER;
				default: return -1;
			}
		}
		if (baseClass == DefinedType.class) {
			switch (baseFeatureID) {
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
		result.append(", isTuple: ");
		result.append(isTuple);
		result.append(')');
		return result.toString();
	}

} //RecordImpl
