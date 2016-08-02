/**
 *
 * $Id$
 */
package OPLmetamodel.validation;

import OPLmetamodel.NumericExpression;
import OPLmetamodel.NumericType;

/**
 * A sample validator interface for {@link OPLmetamodel.RangeExpression}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RangeExpressionValidator {
	boolean validate();

	boolean validateLowerLimit(NumericExpression value);
	boolean validateUpperLimit(NumericExpression value);
	boolean validateType(NumericType value);
}