/**
 *
 * $Id$
 */
package OPLmetamodel.validation;

import OPLmetamodel.NumericType;
import OPLmetamodel.RangeType;
import OPLmetamodel.StepFunction;

/**
 * A sample validator interface for {@link OPLmetamodel.Interval}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IntervalValidator {
	boolean validate();

	boolean validateIsOptional(boolean value);
	boolean validateBounds(RangeType value);
	boolean validateSize(NumericType value);
	boolean validateIntensity(StepFunction value);
}
