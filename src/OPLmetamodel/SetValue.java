/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.SetValue#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getSetValue()
 * @model
 * @generated
 */
public interface SetValue extends Expression {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getSetValue_Items()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getItems();

} // SetValue
