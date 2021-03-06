/**
 *
 * $Id$
 */
package OPLmetamodel.validation;

import OPLmetamodel.ActivityDeclaration;
import OPLmetamodel.Constraint;
import OPLmetamodel.DataDeclaration;
import OPLmetamodel.Declaration;
import OPLmetamodel.DefinedType;
import OPLmetamodel.Function;
import OPLmetamodel.Objective;
import OPLmetamodel.ResourceDeclaration;
import OPLmetamodel.ScheduleInitialization;
import OPLmetamodel.Script;
import OPLmetamodel.SearchProcedure;
import OPLmetamodel.Setting;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link OPLmetamodel.Model}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ModelValidator {
	boolean validate();

	boolean validateId(String value);
	boolean validateIsConstraintProblem(boolean value);
	boolean validateTypes(EList<DefinedType> value);
	boolean validateData(EList<DataDeclaration> value);
	boolean validateConstraints(EList<Constraint> value);
	boolean validateInstruction(Objective value);
	boolean validateFunctions(EList<Function> value);
	boolean validateActivities(EList<ActivityDeclaration> value);
	boolean validateResources(ResourceDeclaration value);
	boolean validateAssertions(EList<Constraint> value);
	boolean validateScheduleInit(EList<ScheduleInitialization> value);
	boolean validateScripts(EList<Script> value);
	boolean validateSettings(EList<Setting> value);
	boolean validateDeclarations(EList<Declaration> value);
	boolean validateSearch(SearchProcedure value);
}
