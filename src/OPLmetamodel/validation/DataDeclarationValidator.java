/**
 *
 * $Id$
 */
package OPLmetamodel.validation;

import OPLmetamodel.AbstractType;
import OPLmetamodel.DataRef;
import OPLmetamodel.Expression;
import OPLmetamodel.Initialization;

/**
 * A sample validator interface for {@link OPLmetamodel.DataDeclaration}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DataDeclarationValidator {
	boolean validate();

	boolean validateVariable(DataRef value);
	boolean validateType(AbstractType value);
	boolean validateIsDecisionVar(boolean value);
	boolean validateIsDecisionExpr(boolean value);
	boolean validateValue(Initialization value);
	boolean validateValueConstraint(Expression value);
}
