/**
 */
package OPLmetamodel.impl;

import OPLmetamodel.BlockExpression;
import OPLmetamodel.BooleanBlock;
import OPLmetamodel.OPLmetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.impl.BlockExpressionImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockExpressionImpl extends ExpressionImpl implements BlockExpression {
	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected BooleanBlock blocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPLmetamodelPackage.Literals.BLOCK_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBlock getBlocks() {
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlocks(BooleanBlock newBlocks, NotificationChain msgs) {
		BooleanBlock oldBlocks = blocks;
		blocks = newBlocks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.BLOCK_EXPRESSION__BLOCKS, oldBlocks, newBlocks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocks(BooleanBlock newBlocks) {
		if (newBlocks != blocks) {
			NotificationChain msgs = null;
			if (blocks != null)
				msgs = ((InternalEObject)blocks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.BLOCK_EXPRESSION__BLOCKS, null, msgs);
			if (newBlocks != null)
				msgs = ((InternalEObject)newBlocks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OPLmetamodelPackage.BLOCK_EXPRESSION__BLOCKS, null, msgs);
			msgs = basicSetBlocks(newBlocks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPLmetamodelPackage.BLOCK_EXPRESSION__BLOCKS, newBlocks, newBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPLmetamodelPackage.BLOCK_EXPRESSION__BLOCKS:
				return basicSetBlocks(null, msgs);
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
			case OPLmetamodelPackage.BLOCK_EXPRESSION__BLOCKS:
				return getBlocks();
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
			case OPLmetamodelPackage.BLOCK_EXPRESSION__BLOCKS:
				setBlocks((BooleanBlock)newValue);
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
			case OPLmetamodelPackage.BLOCK_EXPRESSION__BLOCKS:
				setBlocks((BooleanBlock)null);
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
			case OPLmetamodelPackage.BLOCK_EXPRESSION__BLOCKS:
				return blocks != null;
		}
		return super.eIsSet(featureID);
	}

} //BlockExpressionImpl
