package com.drago.arduinoml.embedded;

import java.io.File;

/**
 * Evaluate all files in "./scripts/groovy" directory.<br>
 * Produces output in "./generated" directory.<br>
 */
public class ArduinoML {
	
	public static void main(String[] args) {
		ArduinoMLDSL dsl = new ArduinoMLDSL();
		File[] files = Utils.getAllScripts();

		for (File file : files) {
			if(file.getName().contains("Dual")) {
				eval(dsl, file);
			}
		}
	}

	private static void eval(ArduinoMLDSL dsl, File file) {
		if (file != null)
			dsl.eval(file);
	}
}