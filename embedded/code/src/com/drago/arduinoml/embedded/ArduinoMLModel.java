package com.drago.arduinoml.embedded;

import java.util.*;

import groovy.lang.Binding;

import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.behavioral.Action;
import io.github.mosser.arduinoml.kernel.behavioral.State;
import io.github.mosser.arduinoml.kernel.generator.ToWiring;
import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.Actuator;
import io.github.mosser.arduinoml.kernel.structural.Brick;
import io.github.mosser.arduinoml.kernel.structural.SIGNAL;
import io.github.mosser.arduinoml.kernel.structural.Sensor;

public class ArduinoMLModel {

	private List<Brick> bricks;
	private List<State> states;

	private State initialState;
	private Binding binding;
	
	private ArduinoMLModelHelper helper;
	
	public ArduinoMLModel(Binding binding) {
		this.bricks = new ArrayList<Brick>();
		this.states = new ArrayList<State>();
		this.binding = binding;
		this.helper = new ArduinoMLModelHelper();
	}
	
	public void createSensor(String name, Integer pinNumber) {
		ArduinoMLValidator.validateVariableName(name);
		ArduinoMLValidator.validatePin(pinNumber);
		Sensor sensor = new Sensor();
		sensor.setName(name);
		sensor.setPin(pinNumber);
		this.bricks.add(sensor);
		this.binding.setVariable(name, sensor);
	}
	
	public void createActuator(String name, Integer pinNumber) {
		ArduinoMLValidator.validateVariableName(name);
		ArduinoMLValidator.validatePin(pinNumber);
		Actuator actuator = new Actuator();
		actuator.setName(name);
		actuator.setPin(pinNumber);
		this.bricks.add(actuator);
		this.binding.setVariable(name, actuator);
	}
	
	public void createState(int delay, List<Action> actions) {
		ArduinoMLValidator.validateDelayMilliseconds(delay);
		State state = new State();
		state.setActions(actions);
		state.setTransitions(new ArrayList<>());
		this.states.add(state);
	}
	
	public void createState(String name, int delay, List<Action> actions) {
		ArduinoMLValidator.validateVariableName(name);
		ArduinoMLValidator.validateDelayMilliseconds(delay);
		State state = new State();
		state.setName(name);
		state.setActions(actions);
		state.setTransitions(new ArrayList<>());
		this.states.add(state);
		this.binding.setVariable(name, state);
	}
	
	public void setLastStateName(String name) {
		ArduinoMLValidator.validateVariableName(name);
		State state = this.states.get(this.states.size() - 1); 
		state.setName(name);
		this.binding.setVariable(name, state);
	}
	
	public void setupTransitionConditions(Map<Sensor, SIGNAL> transitionConditions) {
		ArduinoMLValidator.validate(transitionConditions != null, "Error occured while creating transitions conditions.");
		helper.setupTransition(transitionConditions);
	}
	
	public void setupTransitionStates(State from, State to) {
		ArduinoMLValidator.validate(from != null && to != null, "Error occured while trying to setup transition with null state.");
		helper.setupTransition(from, to);
	}
	
	public void setupTransitionCondition(Sensor sensor, SIGNAL signal) {
		ArduinoMLValidator.validate(sensor != null, "Error occured while trying to setup transition with null sensor.");
		helper.setupTransition(sensor, signal);
	}
	
	public void setupTransition(State from, State to, Sensor sensor, SIGNAL signal) {
		ArduinoMLValidator.validate(from != null && to != null, "Error occured while trying to setup transition with null state.");
		ArduinoMLValidator.validate(sensor != null, "Error occured while trying to setup transition with null sensor.");
		helper.setupTransition(from, to, sensor, signal);
	}
	
	public void setupTransitionDelay(Integer delay) {
		ArduinoMLValidator.validateDelayMilliseconds(delay);
		helper.setupTransitionDelay(delay.intValue());
	}
	
	public void setInitialState(State state) {
		this.initialState = state;
	}
	
	@SuppressWarnings("rawtypes")
	public Object generateCode(String appName) {
		App app = new App();
		app.setName(appName);
		app.setBricks(this.bricks);
		app.setStates(this.states);
		app.setInitial(this.initialState);
		Visitor codeGenerator = new ToWiring();
		app.accept(codeGenerator);
		return codeGenerator.getResult();
	}
}
