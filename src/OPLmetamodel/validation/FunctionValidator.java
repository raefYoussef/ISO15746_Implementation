/**
 *
 * $Id$
 */
package OPLmetamodel.validation;

import OPLmetamodel.Expression;
import OPLmetamodel.FunctionRef;
import OPLmetamodel.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link OPLmetamodel.Function}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FunctionValidator {
	boolean validate();

	boolean validateName(FunctionRef value);
	boolean validateBody(Expression value);
	boolean validateParameters(EList<Reference> value);
}