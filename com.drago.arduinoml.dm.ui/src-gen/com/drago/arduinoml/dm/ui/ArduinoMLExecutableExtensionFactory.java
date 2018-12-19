/*
 * generated by Xtext 2.16.0
 */
package com.drago.arduinoml.dm.ui;

import com.drago.arduinoml.dm.ui.internal.DmActivator;
import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ArduinoMLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(DmActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		DmActivator activator = DmActivator.getInstance();
		return activator != null ? activator.getInjector(DmActivator.COM_DRAGO_ARDUINOML_DM_ARDUINOML) : null;
	}

}