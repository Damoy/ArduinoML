package arduinoML.homemade;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import arduinoML.App;
import arduinoML.concretesyntax.ArduinoMLStandaloneSetup;

public class Main {

	public static void main(String[] args) throws IOException {
		String destinationPath= "resources/FirstExample.xmi";
		String code ="";
		File folder = new File("./resources");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			String[] filename = listOfFiles[i].getName().split(Pattern.quote("."));
			
			if(filename[0].contains("Mode") || filename[0].contains("RequiredEx"))
				continue;

			if (listOfFiles[i].isFile() && filename[1].equals("aml")) {
				String modelPath = "resources/" + listOfFiles[i].getName();
				System.out.println(listOfFiles[i].getName() + " start\n");

				try {

					ArduinoML2xmi(modelPath, destinationPath);
					code = xmi2NativeArduino(destinationPath);
					if (!code.equals("")) {
						BufferedWriter out = new BufferedWriter(new FileWriter("./out_files/" + filename[0] + ".ino"));
						out.write(code);
						if (out != null) out.close();
					}
					
					System.out.println(code);
					System.out.println("\n" + listOfFiles[i].getName() + " done\n");
					System.out.println("- - - - - - - - - - - - -\n");

				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		}

		System.out.println("ALL FILES ARE DONE");
	}

	private static void ArduinoML2xmi(String modelPath, String destinationPath) throws IOException{
		// register ArduinoML
		ResourceSet resources = new ResourceSetImpl();
		Map<String, Object> packageRegistry = resources.getPackageRegistry();
		packageRegistry.put(arduinoML.ArduinoMLPackage.eNS_URI, arduinoML.ArduinoMLPackage.eINSTANCE);

		// load ArduinoML dependencies 
		Injector injector = new ArduinoMLStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

		// load the dsl file and parse it
		URI uri = URI.createURI(modelPath);
		Resource xtextResource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(xtextResource);
		Resource xmiResource = resourceSet.createResource(URI.createURI(destinationPath));
		// add the root (often forgotten)
		xmiResource.getContents().add(xtextResource.getContents().get(0));

		xmiResource.save(null);
	}


	private static String xmi2NativeArduino(String xmiPath) throws IOException{
		// register ArduinoML
		ResourceSet resourceSet = new ResourceSetImpl();
		Map<String, Object> packageRegistry = resourceSet.getPackageRegistry();
		packageRegistry.put(arduinoML.ArduinoMLPackage.eNS_URI, arduinoML.ArduinoMLPackage.eINSTANCE);

		// load the xmi file
		XMIResource resource = new XMIResourceImpl(URI.createURI("file:"+xmiPath));
		resource.load(null);

		// get the root of the model
		App app = (App) resource.getContents().get(0);

		// Launch the visitor on the root
		ArduinoMLSwitchPrinter visitor = new ArduinoMLSwitchPrinter();
		return visitor.doSwitch(app);
	}
}
