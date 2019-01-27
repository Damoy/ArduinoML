package io.github.mosser.arduinoml.kernel.behavioral;

import java.util.HashMap;
import java.util.Map;

import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.*;

public class Transition implements Visitable {

	private State next;
	private Map<Sensor, SIGNAL> sensors = new HashMap<Sensor, SIGNAL>();
	private int delay = 0;
	
	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}
	
	public boolean hasDelay() {
		return delay > 0;
	}

	public State getNext() {
		return next;
	}

	public void setNext(State next) {
		this.next = next;
	}
	
	public Map<Sensor, SIGNAL> getSensors() {
		return sensors;
	}
	
	public boolean hasConditions() {
		return !sensors.isEmpty();
	}

	public void setSensors(Map<Sensor, SIGNAL> sensors) {
		this.sensors = sensors;
	}
	
	public void addSensor(Sensor sensor, SIGNAL signal) {
		if(sensors.containsKey(sensor)) {
			return;
		}
		sensors.put(sensor, signal);	
	}

	@Override
	public void accept(@SuppressWarnings("rawtypes") Visitor visitor) {
		visitor.visit(this);
	}
}
