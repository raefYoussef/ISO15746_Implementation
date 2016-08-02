/**
 */
package OPLmetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link OPLmetamodel.Extension#getExps <em>Exps</em>}</li>
 * </ul>
 *
 * @see OPLmetamodel.OPLmetamodelPackage#getExtension()
 * @model
 * @generated
 */
public interface Extension extends CollectionExpression {
	/**
	 * Returns the value of the '<em><b>Exps</b></em>' containment reference list.
	 * The list contents are of type {@link OPLmetamodel.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exps</em>' containment reference list.
	 * @see OPLmetamodel.OPLmetamodelPackage#getExtension_Exps()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Expression> getExps();

} // Extension
