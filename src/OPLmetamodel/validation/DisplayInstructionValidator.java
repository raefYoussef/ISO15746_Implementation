/**
 *
 * $Id$
 */
package OPLmetamodel.validation;

import OPLmetamodel.Expression;
import OPLmetamodel.ParameterDeclaration;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link OPLmetamodel.DisplayInstruction}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DisplayInstructionValidator {
	boolean validate();

	boolean validateExps(EList<Expression> value);
	boolean validateParameters(EList<ParameterDeclaration> value);
}