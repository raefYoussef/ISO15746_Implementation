/**
 */
package OPLmetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.Declaration#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface Declaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see OPLmetamodel.OPLmetamodelPackage#getDeclaration_Order()
	 * @model required="true" ordered="false"
	 *        annotation="https://metamodel.com/documentation body='the sequence number (starting at 1) in which the declaration is found in the '"
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link OPLmetamodel.Declaration#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

} // Declaration
