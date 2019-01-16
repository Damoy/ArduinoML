package com.drago.arduinoml.internal;
import java.io.File;

public class ArduinoML {
	public static void main(String[] args) {
		 ArduinoMLDSL dsl = new ArduinoMLDSL();
		 if(args.length > 0) {
		 dsl.eval(new File(args[0]));
		 } else {
		 System.out.println("/!\\ Missing arg: Please specify the path to a Groovy script file to execute");
		 }
	}
}