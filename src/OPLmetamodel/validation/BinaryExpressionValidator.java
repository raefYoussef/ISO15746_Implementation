/**
 *
 * $Id$
 */
package OPLmetamodel.validation;

import OPLmetamodel.AbstractBinaryOperator;
import OPLmetamodel.Expression;

/**
 * A sample validator interface for {@link OPLmetamodel.BinaryExpression}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BinaryExpressionValidator {
	boolean validate();

	boolean validateLhs(Expression value);
	boolean validateRhs(Expression value);
	boolean validateOp(AbstractBinaryOperator value);
}
