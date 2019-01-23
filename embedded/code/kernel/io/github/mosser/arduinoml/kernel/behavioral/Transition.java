package io.github.mosser.arduinoml.kernel.behavioral;

import java.util.HashMap;
import java.util.Map;

import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.*;

public class Transition implements Visitable {

	private State next;
	//private Sensor sensor;
	//private SIGNAL value;
	private Map<Sensor, SIGNAL> sensors = new HashMap<Sensor, SIGNAL>();


	public State getNext() {
		return next;
	}

	public void setNext(State next) {
		this.next = next;
	}
	
	public Map<Sensor, SIGNAL> getSensors() {
		return sensors;
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
//	public Sensor getSensor() {
//		return sensor;
//	}
//
//	public void setSensor(Sensor sensor) {
//		this.sensor = sensor;
//	}
//
//	public SIGNAL getValue() {
//		return value;
//	}
//
//	public void setValue(SIGNAL value) {
//		this.value = value;
//	}


	@Override
	public void accept(@SuppressWarnings("rawtypes") Visitor visitor) {
		visitor.visit(this);
	}
}
