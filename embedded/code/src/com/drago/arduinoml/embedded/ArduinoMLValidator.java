package com.drago.arduinoml.embedded;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArduinoMLValidator {

	private ArduinoMLValidator() {}
	
	public static void validatePin(int pin) {
		validate(pin >= 0 && pin <= 19, "Inquired pin \"" + pin + "\" is invalid. Authorized range is [0-19].");
	}
	
	public static void validateDelayMilliseconds(int delayMs) {
		validate(delayMs >= 0 && delayMs <= Math.pow(2, 32), "Inquired delay \"" + delayMs + "\" is out of range."
				+ "Authorized one is [0-2^32]");
	}
	
	public static void validateVariableName(String variableName) {
		validate(variableName != null && !variableName.isEmpty(), "Variable name \"" + variableName + "\" should not be empty.");
		boolean valid = !Character.isDigit(variableName.charAt(0));
		validate(valid, "Variable name \"" + variableName + "\" should not start with a digit.");
		Pattern pattern = Pattern.compile("[.*$=)\\-('\"&]");
		Matcher matcher = pattern.matcher(variableName);
		validate(!matcher.find(), "Variable name \"" + variableName + "\" is badly formed.");
	}
	
	public static void validate(boolean cond, String errorMsg) {
		if (!cond) throw new RuntimeException(errorMsg);
	}
	
}
