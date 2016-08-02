package ISO15746_Impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;

public class Driver 
{
	public static void main(String[] args) 
	{
		// parse xml case representation and create optimization metamodel instances
		Parser parser = new Parser();
		parser.parse();
		
		// optimization model to text transformation
		File directory = new File("OPL_Instances");
		File[] directoryListing = directory.listFiles();
		
		for (int i = 0; i < directoryListing.length; i++) 
		{
			URI modelURI = URI.createFileURI(directoryListing[i].getAbsolutePath());
			File targetFolder = new File("OPL_Code");
			List<String> arguments = new ArrayList<String>();
			
			Model2Text generator;
			try 
			{
				generator = new Model2Text(modelURI, targetFolder, arguments);
				generator.doGenerate(new BasicMonitor());
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
