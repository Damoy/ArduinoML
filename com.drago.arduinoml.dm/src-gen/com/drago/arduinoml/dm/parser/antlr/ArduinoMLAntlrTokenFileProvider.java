/*
 * generated by Xtext 2.16.0
 */
package com.drago.arduinoml.dm.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ArduinoMLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/drago/arduinoml/dm/parser/antlr/internal/InternalArduinoML.tokens");
	}
}