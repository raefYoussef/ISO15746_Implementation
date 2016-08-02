package ISO15746_Impl;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;
import org.apache.commons.io.FilenameUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import OPLmetamodel.*;

public class Parser 
{
	public void parse() 
	{
		boolean debugMode = false;
		
		File directory = new File("ISO15746_Instances");
		File[] directoryListing = directory.listFiles();
		
		// checks if directory exists
		if(directoryListing != null)
		{
			// iterates over files in directory
			for (int i = 0; i < directoryListing.length; i++) 
			{
				File file = directoryListing[i];
				String fileExt = FilenameUtils.getExtension(file.getName());
				String fileBase = FilenameUtils.getBaseName(file.getName());
				
				// checks if the file is an xml file
				if(file.isFile() && fileExt.equals("xml"))
				{
					try 
					{
						if(debugMode){System.out.println("Found valid File: " + fileBase + "." + fileExt);}
						
						// parses xml file and builds a content tree
						DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
						DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
						Document xmlDoc = dBuilder.parse(file);
						xmlDoc.getDocumentElement().normalize();
						
						// looks for 'OptimizationModule' nodes
						NodeList optModuleList = xmlDoc.getElementsByTagName("iso:OptimizationModule");
						
						// proceeds if 'OptimizationModule' nodes are found
						if(optModuleList.getLength() != 0)
						{	
							if(debugMode){System.out.println("\tFound valid OptimizationModule");}
							
							// iterates through 'OptimizationModule' nodes
							for(int j = 0; j < optModuleList.getLength(); j++)
							{
								Node optModuleNode = optModuleList.item(j);
								
								if(optModuleNode.getNodeType() == Node.ELEMENT_NODE)
								{
									Element optModuleElement = (Element) optModuleNode;
									
									//looks for 'VendorAttributesOptimizationModule' nodes 
									NodeList optVenAttrList = optModuleElement.getElementsByTagName("iso:VendorAttributesOptimizationModule");
									
									// iterates through 'VendorAttributesOptimizationModule' nodes
									for(int k = 0; k < optVenAttrList.getLength(); k++)
									{
										Node optVenAttrNode = optVenAttrList.item(k);
										
										// check if the 'VendorAttributesOptimizationModule' node belongs to the current 'OptimizationModule' Node
										if(optVenAttrNode.getParentNode().isSameNode(optModuleNode))
										{
											if(optVenAttrNode.getNodeType() == Node.ELEMENT_NODE)
											{
												Element optVenAttrElement = (Element) optVenAttrNode;
												
												//looks for 'SteadyStateOpt' nodes 
												NodeList optTypeList = optVenAttrElement.getElementsByTagName("iso:SteadyStateOpt");
												
												// iterates through 'SteadyStateOpt' nodes
												for(int l = 0; l < optTypeList.getLength(); l++)
												{
													Node optTypeNode = optTypeList.item(l);
													
													// check if the 'OptimizationModule' is of 'SteadyStateOpt' type
													if(optTypeNode.getParentNode().isSameNode(optVenAttrElement))
													{
														if(debugMode){System.out.println("\t\tFound valid  SteadyStateOpt");}
														
														if(optTypeNode.getNodeType() == Node.ELEMENT_NODE)
														{
															Element optTypeElement = (Element) optTypeNode;
															
															// Initiate the OPL model
															OPLmetamodelPackage.eINSTANCE.eClass();
															OPLmetamodelFactory oplModelFactory = OPLmetamodelFactory.eINSTANCE;
															Model oplModel = oplModelFactory.createModel();
															
															// looks for the 'name' nodes of the 'OptimizationModule' element
															NodeList optNameList = optModuleElement.getElementsByTagName("iso:name");
															
															// checks for the 'name' node that belongs to the current 'OptimizationModule' node
															String optName = "";
															for(int m = 0; m < optNameList.getLength(); m++)
															{
																Node optNameNode = optNameList.item(m);
																
																if(optNameNode.getParentNode().isSameNode(optModuleNode))
																{
																	if(optNameNode.getNodeType() == Node.ELEMENT_NODE)
																	{
																		Element optNameElement = (Element) optNameNode;
																		
																		if(debugMode){System.out.println("\t\t\tModule name: " + optNameElement.getTextContent());}
																		optName = optNameElement.getTextContent();
																	}
																}
															}
															
															// if the 'OptimizationModule' does not have a name
															if(optName.equals(""))
															{
																optName = "Model_" + j;
															}
															
															// set the 'id' of the optimization model
															oplModel.setId(fileBase + "_" + optName);
															
															
															// looks for the 'Solver' nodes of the 'SteadyStateOpt' nodes
															NodeList optSolverList = optTypeElement.getElementsByTagName("iso:Solver");
															
															// iterate through 'Solver' nodes
															boolean isCpSolver = false;
															for (int m = 0; m < optSolverList.getLength(); m++) 
															{
																Node optSolverNode = optSolverList.item(m);
																
																// checks for the 'Solver' node that belongs to the current 'SteadyStateOpt' node
																if(optSolverNode.getParentNode().isSameNode(optTypeNode))
																{
																	if(optSolverNode.getNodeType() == Node.ELEMENT_NODE)
																	{
																		Element optSolverElement = (Element) optSolverNode;
																		
																		// checks if the solver element text match a tag
																		String[] tags = {"constraint","constraint programming","cp","cplex cp","ilog cp","ibm cp","ilog cplex cp","ibm ilog cplex cp"};
																		for (int n = 0; n < tags.length; n++) 
																		{
																			if(optSolverElement.getTextContent().equalsIgnoreCase(tags[n]))
																			{
																				isCpSolver = true;
																			}
																		}
																	}
																}
															}
															
															// set the 'IsConstraintProblem' of the optimization model
															oplModel.setIsConstraintProblem(isCpSolver);
															if(debugMode){System.out.println("\t\t\tIs Constraint Problem: " + isCpSolver);}
															
															
															// looks for 'iso:VariableSet' nodes
															NodeList optVarSetList = optModuleElement.getElementsByTagName("iso:VariableSets");
															
															// iterate through 'VariableSet' nodes (Handles regular vars., decision vars., and decision exprs.)
															int varCount = 1;
															int constraintCount = 1;
															int objCount = 1;
															for(int m = 0; m < optVarSetList.getLength(); m++)
															{
																Node optVarSetNode = optVarSetList.item(m);
																
																// checks for the 'VariableSet' nodes that belongs to the current 'OptimizationModule' element
																if(optVarSetNode.getParentNode().isSameNode(optModuleNode))
																{																	
																	if(optVarSetNode.getNodeType() == Node.ELEMENT_NODE)
																	{
																		Element optVarSetElement = (Element) optVarSetNode;
																		
																		if(debugMode){System.out.println("\t\t\tFound valid Variable Set");}

																		
																		// looks for 'iso:StateVariableSet' nodes
																		NodeList optStateSetList = optVarSetElement.getElementsByTagName("iso:StateVariableSet");
																		
																		// iterate through 'StateVariableSet' nodes (Handles vars.)
																		for(int n = 0; n < optStateSetList.getLength(); n++)
																		{
																			Node optStateSetNode = optStateSetList.item(n);
																			
																			// checks for the 'StateVariableSet' nodes that belong to current 'VariableSet'
																			if(optStateSetNode.getParentNode().isSameNode(optVarSetNode))
																			{
																				if(optStateSetNode.getNodeType() == Node.ELEMENT_NODE)
																				{
																					Element optStateSetElement = (Element) optStateSetNode;
																					
																					if(debugMode){System.out.println("\t\t\t\tFound valid State Variable Set");}

																					// looks for 'iso:Variable' nodes
																					NodeList optStateVarList = optStateSetElement.getElementsByTagName("iso:Variable");
																					
																					// iterate through 'Variable' nodes
																					for(int o = 0; o < optStateVarList.getLength(); o++)
																					{
																						Node optStateVarNode = optStateVarList.item(o);
																						
																						// checks for the 'Variable' nodes that belong to current 'StateVariableSet'
																						if(optStateVarNode.getParentNode().isSameNode(optStateSetNode))
																						{
																							if(optStateVarNode.getNodeType() == Node.ELEMENT_NODE)
																							{
																								Element optStateVarElement = (Element) optStateVarNode;
																								
																								String varName = optStateVarElement.getElementsByTagName("iso:VariableID").item(0).getTextContent();
																								String varDataType = optStateVarElement.getElementsByTagName("iso:DataType").item(0).getTextContent();
																								String varValue = optStateVarElement.getElementsByTagName("iso:ProcessValue").item(0).getTextContent();
																								String varIsActiveText = optStateVarElement.getElementsByTagName("iso:VariableActive").item(0).getTextContent();
																								boolean varIsActive = Boolean.parseBoolean(varIsActiveText) || varIsActiveText.equalsIgnoreCase("1");

																								if(debugMode)
																								{
																									System.out.println("\t\t\t\t\tFound State Variable");
																									System.out.println("\t\t\t\t\t\tName: " + varName);
																									System.out.println("\t\t\t\t\t\tDataType: " + varDataType);
																									System.out.println("\t\t\t\t\t\tValue: " + varValue);
																									System.out.println("\t\t\t\t\t\tIs Active: " + varIsActive);
																								}
																								
																								if(varIsActive)
																								{																	
																									// instantiate data declaration. State variables aren't dvar or dexpr. 
																									DataDeclaration varDataDec = oplModelFactory.createDataDeclaration();
																									varDataDec.setIsDecisionExpr(false);
																									varDataDec.setIsDecisionVar(false);
																									varDataDec.setOrder(varCount++);
																									
																									
																									// data reference serves as name of variable
																									DataRef varDataRef = oplModelFactory.createDataRef();
																									varDataRef.setName(varName);
																									varDataDec.setVariable(varDataRef);
																									
																									// determine type of variable (so far supports int and float)
																									if(varDataType.equalsIgnoreCase("integer") || varDataType.equalsIgnoreCase("int"))
																									{
																										varDataDec.setType(oplModelFactory.createIntegerType());
																									}
																									else
																									{
																										varDataDec.setType(oplModelFactory.createFloatType());
																									}
																									
																									// if specified, set the value of the variable
																									if(! varValue.equals(""))
																									{
																										DataObject varDataObj = oplModelFactory.createDataObject();
																										varDataObj.setBody(varValue);
																										varDataDec.setValue(varDataObj);
																									}
																									
																									// add to opl model
																									oplModel.getData().add(varDataDec);
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																		
																		
																		// looks for 'iso:IndependantVariableSet' nodes
																		NodeList optIndSetList = optVarSetElement.getElementsByTagName("iso:IndependantVariableSet");
																		
																		// iterate through 'iso:IndependantVariableSet' nodes (Handles dvars)
																		for(int n = 0; n < optIndSetList.getLength(); n++)
																		{
																			Node optIndSetNode = optIndSetList.item(n);
																			
																			// checks for the 'IndependantVariableSet' nodes that belong to current 'VariableSet'
																			if(optIndSetNode.getParentNode().isSameNode(optVarSetNode))
																			{
																				if(optIndSetNode.getNodeType() == Node.ELEMENT_NODE)
																				{
																					Element optIndSetElement = (Element) optIndSetNode;
																					
																					if(debugMode){System.out.println("\t\t\t\tFound valid Indepenedent Variable Set");}

																					// looks for 'iso:Variable' nodes
																					NodeList optIndVarList = optIndSetElement.getElementsByTagName("iso:Variable");
																					
																					// iterate through 'Variable' nodes
																					for(int o = 0; o < optIndVarList.getLength(); o++)
																					{
																						Node optIndVarNode = optIndVarList.item(o);
																						
																						// checks for the 'Variable' nodes that belong to current 'IndependantVariableSet'
																						if(optIndVarNode.getParentNode().isSameNode(optIndSetNode))
																						{
																							if(optIndVarNode.getNodeType() == Node.ELEMENT_NODE)
																							{
																								Element optIndVarElement = (Element) optIndVarNode;
																								
																								String varName = optIndVarElement.getElementsByTagName("iso:VariableID").item(0).getTextContent();
																								String varDataType = optIndVarElement.getElementsByTagName("iso:DataType").item(0).getTextContent();
																								String varMinLimit = optIndVarElement.getElementsByTagName("iso:MinimumLimit").item(0).getTextContent();
																								String varMaxLimit = optIndVarElement.getElementsByTagName("iso:MaximumLimit").item(0).getTextContent();
																								String varIsActiveText = optIndVarElement.getElementsByTagName("iso:VariableActive").item(0).getTextContent();
																								boolean varIsActive = Boolean.parseBoolean(varIsActiveText) || varIsActiveText.equalsIgnoreCase("1");

																								if(debugMode)
																								{
																									System.out.println("\t\t\t\t\tFound Independant Variable");
																									System.out.println("\t\t\t\t\t\tName: " + varName);
																									System.out.println("\t\t\t\t\t\tDataType: " + varDataType);
																									System.out.println("\t\t\t\t\t\tMin Limit: " + varMinLimit);
																									System.out.println("\t\t\t\t\t\tMax Limit: " + varMaxLimit);
																									System.out.println("\t\t\t\t\t\tIs Active: " + varIsActive);
																								}
																								
																								if(varIsActive)
																								{																	
																									// instantiate data declaration. Ind variables are dvars. 
																									DataDeclaration varDataDec = oplModelFactory.createDataDeclaration();
																									varDataDec.setIsDecisionExpr(false);
																									varDataDec.setIsDecisionVar(true);
																									varDataDec.setOrder(varCount++);
																									
																									
																									// data reference serves as name of variable
																									DataRef varDataRef = oplModelFactory.createDataRef();
																									varDataRef.setName(varName);
																									varDataDec.setVariable(varDataRef);
																									
																									// determine type of variable and value(so far supports int, int range, float, float range)
																									if(varDataType.equalsIgnoreCase("integer") || varDataType.equalsIgnoreCase("int"))
																									{
																										// if constraint problem, the type becomes an int range with the specified limits 
																										if(isCpSolver)
																										{
																											// if the limits are valid
																											if(!varMinLimit.equals("") && !varMaxLimit.equals(""))
																											{
																												IntegerRangeType intRange = oplModelFactory.createIntegerRangeType();
																												intRange.setBaseType(oplModelFactory.createIntegerType());
																												intRange.setLowerBound(oplModelFactory.createIntegerType());
																												intRange.setUpperBound(oplModelFactory.createIntegerType());
																												varDataDec.setType(intRange);
																												
																												DataObject varDataObj = oplModelFactory.createDataObject();
																												varDataObj.setBody(varMinLimit + " .. " + varMaxLimit);
																												varDataDec.setValue(varDataObj);
																											}
																											else
																											{
																												varDataDec.setType(oplModelFactory.createFloatType());
																											}
																										}
																										// if mathematical problem, the type is an int and the limits are added as constraints
																										else
																										{
																											// if the min limit is valid
																											if(!varMinLimit.equals(""))
																											{
																												varDataDec.setType(oplModelFactory.createIntegerType());
																												
																												Constraint varConstraint = oplModelFactory.createConstraint();
																												RelationalExpression varConstraintExp = oplModelFactory.createRelationalExpression();
																												DataRef varConstraintLhs = oplModelFactory.createDataRef();
																												RelationalOp varConstraintOp = RelationalOp.GREATER_THAN_OR_EQUAL_TO; 
																												FloatExpression varConstraintRhs = oplModelFactory.createFloatExpression();
																												RelationalOperator varConstraintDummyRelational =  oplModelFactory.createRelationalOperator();
																												
																												
																												varConstraintLhs.setName(varName);
																												varConstraintRhs.setBody(varMinLimit);
																												varConstraintExp.setRedefinedOp(varConstraintOp);
																												varConstraintExp.setLhs(varConstraintLhs);
																												varConstraintExp.setRhs(varConstraintRhs);
																												varConstraintExp.setBody("");
																												varConstraintDummyRelational.setOp(RelationalOp.GREATER_THAN_OR_EQUAL_TO);
																												varConstraintExp.setOp(varConstraintDummyRelational);
																												
																												
																												varConstraint.setName("Constraint"+constraintCount);
																												varConstraint.setOrder(constraintCount++);
																												varConstraint.setExp(varConstraintExp);
																												
																												oplModel.getConstraints().add(varConstraint);
																											}
																											
																											// if the max limit is valid
																											if(!varMaxLimit.equals(""))
																											{
																												varDataDec.setType(oplModelFactory.createIntegerType());
																												
																												Constraint varConstraint = oplModelFactory.createConstraint();
																												RelationalExpression varConstraintExp = oplModelFactory.createRelationalExpression();
																												DataRef varConstraintLhs = oplModelFactory.createDataRef();
																												RelationalOp varConstraintOp = RelationalOp.LESS_THAN_OR_EQUAL_TO; 
																												FloatExpression varConstraintRhs = oplModelFactory.createFloatExpression();
																												RelationalOperator varConstraintDummyRelational =  oplModelFactory.createRelationalOperator();
																												
																												varConstraintLhs.setName(varName);
																												varConstraintRhs.setBody(varMaxLimit);
																												varConstraintExp.setRedefinedOp(varConstraintOp);
																												varConstraintExp.setLhs(varConstraintLhs);
																												varConstraintExp.setRhs(varConstraintRhs);
																												varConstraintExp.setBody("");
																												varConstraintDummyRelational.setOp(RelationalOp.LESS_THAN_OR_EQUAL_TO);
																												varConstraintExp.setOp(varConstraintDummyRelational);
																												
																												varConstraint.setName("Constraint"+constraintCount);
																												varConstraint.setOrder(constraintCount++);
																												varConstraint.setExp(varConstraintExp);
																												
																												oplModel.getConstraints().add(varConstraint);
																											}
																										}
																									}
																									else
																									{
																										// if constraint problem, the type becomes an float range with the specified limits 
																										if(isCpSolver)
																										{
																											// if the limits are valid
																											if(!varMinLimit.equals("") && !varMaxLimit.equals(""))
																											{
																												FloatRangeType floatRange = oplModelFactory.createFloatRangeType();
																												floatRange.setBaseType(oplModelFactory.createFloatType());
																												floatRange.setLowerBound(oplModelFactory.createFloatType());
																												floatRange.setUpperBound(oplModelFactory.createFloatType());
																												varDataDec.setType(floatRange);
																												
																												DataObject varDataObj = oplModelFactory.createDataObject();
																												varDataObj.setBody(varMinLimit + " .. " + varMaxLimit);
																												varDataDec.setValue(varDataObj);
																											}
																											else
																											{
																												varDataDec.setType(oplModelFactory.createFloatType());
																											}
																										}
																										// if mathematical problem, the type is a float and the limits are added as constraints
																										else
																										{
																											// if the min limit is valid
																											if(!varMinLimit.equals(""))
																											{
																												varDataDec.setType(oplModelFactory.createFloatType());
																												
																												Constraint varConstraint = oplModelFactory.createConstraint();
																												RelationalExpression varConstraintExp = oplModelFactory.createRelationalExpression();
																												DataRef varConstraintLhs = oplModelFactory.createDataRef();
																												RelationalOp varConstraintOp = RelationalOp.GREATER_THAN_OR_EQUAL_TO; 
																												FloatExpression varConstraintRhs = oplModelFactory.createFloatExpression();
																												RelationalOperator varConstraintDummyRelational = oplModelFactory.createRelationalOperator();		
																												
																												varConstraintLhs.setName(varName);
																												varConstraintRhs.setBody(varMinLimit);
																												varConstraintExp.setRedefinedOp(varConstraintOp);
																												varConstraintExp.setLhs(varConstraintLhs);
																												varConstraintExp.setRhs(varConstraintRhs);
																												varConstraintExp.setBody("");
																												varConstraintDummyRelational.setOp(RelationalOp.GREATER_THAN_OR_EQUAL_TO);
																												varConstraintExp.setOp(varConstraintDummyRelational);
																												
																												varConstraint.setName("Constraint"+constraintCount);
																												varConstraint.setOrder(constraintCount++);
																												varConstraint.setExp(varConstraintExp);
																												
																												oplModel.getConstraints().add(varConstraint);
																											}
																											
																											// if the max limit is valid
																											if(!varMaxLimit.equals(""))
																											{
																												varDataDec.setType(oplModelFactory.createFloatType());
																												
																												Constraint varConstraint = oplModelFactory.createConstraint();
																												RelationalExpression varConstraintExp = oplModelFactory.createRelationalExpression();
																												DataRef varConstraintLhs = oplModelFactory.createDataRef();
																												RelationalOp varConstraintOp = RelationalOp.LESS_THAN_OR_EQUAL_TO; 
																												FloatExpression varConstraintRhs = oplModelFactory.createFloatExpression();
																												RelationalOperator varConstraintDummyRelational = oplModelFactory.createRelationalOperator();		

																												varConstraintLhs.setName(varName);
																												varConstraintRhs.setBody(varMaxLimit);
																												varConstraintExp.setRedefinedOp(varConstraintOp);
																												varConstraintExp.setLhs(varConstraintLhs);
																												varConstraintExp.setRhs(varConstraintRhs);
																												varConstraintExp.setBody("");
																												varConstraintDummyRelational.setOp(RelationalOp.GREATER_THAN_OR_EQUAL_TO);
																												varConstraintExp.setOp(varConstraintDummyRelational);
																												
																												varConstraint.setName("Constraint"+constraintCount);
																												varConstraint.setOrder(constraintCount++);
																												varConstraint.setExp(varConstraintExp);
																												
																												oplModel.getConstraints().add(varConstraint);
																											}
																										}
																									}
																									
																									
																									// add to opl model
																									oplModel.getData().add(varDataDec);
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																		
																		
																		// looks for 'iso:DependantVariableSet' nodes
																		NodeList optDepSetList = optVarSetElement.getElementsByTagName("iso:DependantVariableSet");
																		
																		// iterate through 'DependantVariableSet' nodes (Handles dexprs.)
																		for(int n = 0; n < optDepSetList.getLength(); n++)
																		{
																			Node optDepSetNode = optDepSetList.item(n);
																			
																			// checks for the 'DependantVariableSet' nodes that belong to current 'VariableSet'
																			if(optDepSetNode.getParentNode().isSameNode(optVarSetNode))
																			{
																				if(optDepSetNode.getNodeType() == Node.ELEMENT_NODE)
																				{
																					Element optDepSetElement = (Element) optDepSetNode;
																					
																					if(debugMode){System.out.println("\t\t\t\tFound valid Dependant Variable Set");}

																					// looks for 'iso:Variable' nodes
																					NodeList optDepVarList = optDepSetElement.getElementsByTagName("iso:Variable");
																					
																					// iterate through 'Variable' nodes
																					for(int o = 0; o < optDepVarList.getLength(); o++)
																					{
																						Node optDepVarNode = optDepVarList.item(o);
																						
																						// checks for the 'Variable' nodes that belong to current 'DependantVariableSet'
																						if(optDepVarNode.getParentNode().isSameNode(optDepSetNode))
																						{
																							if(optDepVarNode.getNodeType() == Node.ELEMENT_NODE)
																							{
																								Element optDepVarElement = (Element) optDepVarNode;
																								
																								String varName = optDepVarElement.getElementsByTagName("iso:VariableID").item(0).getTextContent();
																								String varDataType = optDepVarElement.getElementsByTagName("iso:DataType").item(0).getTextContent();
																								String varValue = optDepVarElement.getElementsByTagName("iso:ProcessValue").item(0).getTextContent();
																								String varIsActiveText = optDepVarElement.getElementsByTagName("iso:VariableActive").item(0).getTextContent();
																								boolean varIsActive = Boolean.parseBoolean(varIsActiveText) || varIsActiveText.equalsIgnoreCase("1");

																								if(debugMode)
																								{
																									System.out.println("\t\t\t\t\tFound Dependant Variable");
																									System.out.println("\t\t\t\t\t\tName: " + varName);
																									System.out.println("\t\t\t\t\t\tDataType: " + varDataType);
																									System.out.println("\t\t\t\t\t\tValue: " + varValue);
																									System.out.println("\t\t\t\t\t\tIs Active: " + varIsActive);
																								}
																								
																								if(varIsActive && ! varValue.equals(""))
																								{																	
																									// instantiate data declaration. Dep variables are dexpr. 
																									DataDeclaration varDataDec = oplModelFactory.createDataDeclaration();
																									varDataDec.setIsDecisionExpr(true);
																									varDataDec.setIsDecisionVar(false);
																									varDataDec.setOrder(varCount++);
																									
																									
																									// data reference serves as name of variable
																									DataRef varDataRef = oplModelFactory.createDataRef();
																									varDataRef.setName(varName);
																									varDataDec.setVariable(varDataRef);
																									
																									// determine type of variable (so far supports int and float)
																									if(varDataType.equalsIgnoreCase("integer") || varDataType.equalsIgnoreCase("int"))
																									{
																										varDataDec.setType(oplModelFactory.createIntegerType());
																									}
																									else
																									{
																										varDataDec.setType(oplModelFactory.createFloatType());
																									}
																									
																									
																									DataObject varDataObj = oplModelFactory.createDataObject();
																									varDataObj.setBody(varValue);
																									varDataDec.setValue(varDataObj);
																									
																									
																									// add to opl model
																									oplModel.getData().add(varDataDec);
																								}
																							}
																						}
																					}
																				}
																			}
																		} 
																	}
																}
															}
															
															
															// look for 'ObjectiveFunction' nodes
															NodeList optObjFuncList = optTypeElement.getElementsByTagName("iso:ObjectiveFunction");
															
															// iterate through 'ObjectiveFunction' nodes
															for(int m = 0; m < optObjFuncList.getLength(); m++)
															{
																Node optObjFuncNode = optObjFuncList.item(m);
																
																// check if 'ObjectiveFunction' node belongs to current 'SteadyStateOpt' node
																if(optObjFuncNode.getParentNode().isSameNode(optTypeNode))
																{
																	if(optObjFuncNode.getNodeType() == Node.ELEMENT_NODE)
																	{
																		Element optObjFuncElement = (Element) optObjFuncNode;
																		
																		if(debugMode)
																		{
																			System.out.println("\t\t\tFound valid Objective Function");
																			System.out.println("\t\t\t\tBody: (minimize) " + optObjFuncElement.getTextContent());
																		}
																		
																		Objective objFunc = oplModelFactory.createObjective();
																		DataRef objVar = oplModelFactory.createDataRef();
																		
																		objVar.setName(optObjFuncElement.getTextContent());
																		objFunc.setExpression(objVar);
																		objFunc.setOrder(objCount++);
																		oplModel.setInstruction(objFunc);
																	}
																}
															}
															
															
															// look for 'ModelConstraintsSet' nodes
															NodeList optConstraintSetList = optTypeElement.getElementsByTagName("iso:ModelConstraintsSet");
															
															// iterate through 'ModelConstraintsSet' nodes
															for (int m = 0; m < optConstraintSetList.getLength(); m++) 
															{
																Node optConstraintSetNode = optConstraintSetList.item(m);
																
																// check if 'ModelConstraintsSet' node belongs to current 'SteadyStateOpt' node
																if(optConstraintSetNode.getParentNode().isSameNode(optTypeNode))
																{
																	if(optConstraintSetNode.getNodeType() == Node.ELEMENT_NODE)
																	{
																		Element optConstraintSetElement = (Element) optConstraintSetNode;
																		
																		if(debugMode){System.out.println("\t\t\tFound valid Constraint Set");}
																		
																		// look for 'Constraint' nodes
																		NodeList optConstraintList = optConstraintSetElement.getElementsByTagName("iso:Constraint");
																		
																		// iterate through 'ModelConstraintsSet' nodes
																		for (int n = 0; n < optConstraintList.getLength(); n++) 
																		{
																			Node optConstraintNode = optConstraintList.item(n);
																			
																			// check if 'Constraints' node belongs to current 'ModelConstraintsSet' node
																			if(optConstraintNode.getParentNode().isSameNode(optConstraintSetNode))
																			{
																				if(optConstraintNode.getNodeType() == Node.ELEMENT_NODE)
																				{
																					Element optConstraintElement = (Element) optConstraintNode;
																					
																					if(debugMode)
																					{
																						System.out.println("\t\t\t\tFound valid Constraint");
																						System.out.println("\t\t\t\t\tBody: " + optConstraintElement.getTextContent());
																					}
																					
																					
																					String[] parsedConstraint = optConstraintElement.getTextContent().split("(?<=\\s)(?=[<>]=?\\s|[!=]=\\s)|(?<=\\s[<>])(?=[\\s])|(?<=\\s==|\\s!=|\\s<=|\\s>=)(?=\\s)",3);
																					if(debugMode){System.out.println("\t\t\t\t\tParsed: " + Arrays.toString(parsedConstraint));}
																					
																					if(parsedConstraint.length == 3)
																					{
																						Constraint constraint = oplModelFactory.createConstraint();
																						RelationalExpression constraintExp = oplModelFactory.createRelationalExpression();
																						DataRef constraintLhs = oplModelFactory.createDataRef();
																						FloatExpression constraintRhs = oplModelFactory.createFloatExpression();
																						RelationalOperator varConstraintDummyRelational = oplModelFactory.createRelationalOperator();		
																						RelationalOp constraintOp;
																						
																						switch (parsedConstraint[1]) 
																						{
																						case "<":
																							constraintOp = RelationalOp.LESS_THAN;
																							varConstraintDummyRelational.setOp(RelationalOp.LESS_THAN);
																							break;
																						case "<=":
																							constraintOp = RelationalOp.LESS_THAN_OR_EQUAL_TO;
																							varConstraintDummyRelational.setOp(RelationalOp.LESS_THAN_OR_EQUAL_TO);
																							break;
																						case ">":
																							constraintOp = RelationalOp.GREATER_THAN;
																							varConstraintDummyRelational.setOp(RelationalOp.GREATER_THAN);
																							break;
																						case ">=":
																							constraintOp = RelationalOp.GREATER_THAN_OR_EQUAL_TO;
																							varConstraintDummyRelational.setOp(RelationalOp.GREATER_THAN_OR_EQUAL_TO);
																							break;
																						case "==":
																							constraintOp = RelationalOp.EQUAL_TO;
																							varConstraintDummyRelational.setOp(RelationalOp.EQUAL_TO);
																							break;
																						case "!=":
																							constraintOp = RelationalOp.NOT_EQUAL_TO;
																							varConstraintDummyRelational.setOp(RelationalOp.NOT_EQUAL_TO);
																							break;
																						default:
																							constraintOp = RelationalOp.LESS_THAN_OR_EQUAL_TO;
																							break;
																						}

																						constraintLhs.setName(parsedConstraint[0]);
																						constraintRhs.setBody(parsedConstraint[2]);
																						constraintExp.setRedefinedOp(constraintOp);
																						constraintExp.setLhs(constraintLhs);
																						constraintExp.setRhs(constraintRhs);
																						constraintExp.setBody("");
																						constraintExp.setOp(varConstraintDummyRelational);
																						
																						constraint.setName("Constraint"+constraintCount);
																						constraint.setOrder(constraintCount++);
																						constraint.setExp(constraintExp);
																						
																						oplModel.getConstraints().add(constraint);
																					}
																				}
																			}
																		}
																	}
																}
															}
															
										
															// Serialize the created model and save in xmi format
															
															// Register the XMI resource factory for the .xmi extension
															Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
															Map<String, Object> m = reg.getExtensionToFactoryMap();
															m.put("xmi",new XMIResourceFactoryImpl());
															
															// obtain a new resource set
															ResourceSet resourceSet = new ResourceSetImpl();
															Resource resource = resourceSet.createResource(URI.createURI("OPL_Instances/" + fileBase + "_" + optName + ".xmi"));
															resource.getContents().add(oplModel);
															
															Map<Object, Object> options = new HashMap<>();
															options.put(XMIResource.OPTION_SCHEMA_LOCATION,Boolean.TRUE);
															
															// save
															try 
															{
																resource.save(options);
															}
															catch (Exception e) 
															{
																e.printStackTrace();
															}
														}
													}
												}
											}
										}
									} 
								}	
							}
						}
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
					}
				}
			}
		}
		else
		{
			System.out.println("Directory 'ISO15746_Instances' does not exist.");
		}
	}
}
