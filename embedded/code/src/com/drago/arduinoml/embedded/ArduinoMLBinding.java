package com.drago.arduinoml.embedded;

import java.util.Map;

import groovy.lang.Binding;
import groovy.lang.Script;

public class ArduinoMLBinding extends Binding {
	// can be useful to return the script in case of syntax trick
	private Script script;
	
	private ArduinoMLModel model;
	
	public ArduinoMLBinding() {
		super();
	}
	
	@SuppressWarnings("rawtypes")
	public ArduinoMLBinding(Map variables) {
		super(variables);
	}
	
	public ArduinoMLBinding(Script script) {
		super();
		this.script = script;
	}
	
	
	public void setScript(Script script) {
		this.script = script;
	}
	
	public void setArduinoMLModel(ArduinoMLModel model) {
		this.model = model;
	}
	
	@Override
	public Object getVariable(String name) {
//		if ("seb".equals(name)) {
//			// could do something else like: ((App) this.getVariable("app")).action();
//			return script;
//		}
		return super.getVariable(name);
	}
	
	@Override
	public void setVariable(String name, Object value) {
		super.setVariable(name, value);
	}
	
	public ArduinoMLModel getArduinoMLModel() {
		return this.model;
	}
}
