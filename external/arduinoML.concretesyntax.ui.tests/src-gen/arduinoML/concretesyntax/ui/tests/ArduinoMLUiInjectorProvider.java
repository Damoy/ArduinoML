/*
 * generated by Xtext 2.16.0
 */
package arduinoML.concretesyntax.ui.tests;

import arduinoML.concretesyntax.ui.internal.ConcretesyntaxActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class ArduinoMLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ConcretesyntaxActivator.getInstance().getInjector("arduinoML.concretesyntax.ArduinoML");
	}

}