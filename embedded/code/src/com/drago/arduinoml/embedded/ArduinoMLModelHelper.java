package com.drago.arduinoml.embedded;

import java.util.Map;

import io.github.mosser.arduinoml.kernel.behavioral.State;
import io.github.mosser.arduinoml.kernel.behavioral.Transition;
import io.github.mosser.arduinoml.kernel.structural.SIGNAL;
import io.github.mosser.arduinoml.kernel.structural.Sensor;

public class ArduinoMLModelHelper {

	private Transition transition;
	private State from;
	private State to;
	
	public ArduinoMLModelHelper() {
		transition = null;
		from = null;
		to = null;
	}
	
	public void setupTransition(Map<Sensor, SIGNAL> transitionConditions) {
		this.from = null;
		this.to = null;
		this.transition = new Transition();
		this.transition.setSensors(transitionConditions);
	}
	
	public void setupTransition(State from, State to, Sensor sensor, SIGNAL signal) {
		if(this.from == null && this.to == null && from != null && to != null) {
			this.from = from;
			this.to = to;
			transition.setNext(to);
			from.addTransition(transition);
		}
		
		transition.addSensor(sensor, signal);
	}
	
	public void setupTransitionDelay(int delay) {
		transition.setDelay(delay);
	}
	
}
