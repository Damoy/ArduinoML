package com.drago.arduinoml.embedded;

import java.io.File;

/**
 * Evaluate all files in "./scripts/groovy" directory.<br>
 * Produces output in "./generated" directory.<br>
 */
public class ArduinoML {
	
	public static void main(String[] args) {
		for (File file : ArduinoMLUtils.getAllScripts()) {
			ArduinoMLUtils.infoln("Processing " + file.getName() + " file...");
			eval(new ArduinoMLDSL(), file);
			ArduinoMLUtils.infoln("Done.");
		}
	}

	private static void eval(ArduinoMLDSL dsl, File file) {
		if (file != null)
			dsl.eval(file);
	}
}