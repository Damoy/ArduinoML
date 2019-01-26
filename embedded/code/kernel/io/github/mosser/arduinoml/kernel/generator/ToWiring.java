package io.github.mosser.arduinoml.kernel.generator;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.behavioral.*;
import io.github.mosser.arduinoml.kernel.structural.*;

/**
 * Quick and dirty visitor to support the generation of Wiring code
 */
public class ToWiring extends Visitor<StringBuffer> {

	private final static String CURRENT_STATE = "current_state";

	public ToWiring() {
		this.result = new StringBuffer();
	}

	private void w(String s) {
		result.append(String.format("%s\n",s));
	}
	
	private void wn(String s) {
		result.append(String.format("%s",s));
	}

	@Override
	public void visit(App app) {
		w("// Wiring code generated from an ArduinoML model");
		w(String.format("// Application name: %s\n", app.getName()));

		w("void setup(){");
		for(Brick brick: app.getBricks()){
			brick.accept(this);
		}
		w("}\n");

		w("long time = 0; long debounce = 200;\n");

		for(State state: app.getStates()){
			state.accept(this);
		}

		if (app.getInitial() != null) {
			w("void loop() {");
			w(String.format("  state_%s();", app.getInitial().getName()));
			w("}");
		}
	}

	@Override
	public void visit(Actuator actuator) {
	 	w(String.format("  pinMode(%d, OUTPUT); // %s [Actuator]", actuator.getPin(), actuator.getName()));
	}


	@Override
	public void visit(Sensor sensor) {
		w(String.format("  pinMode(%d, INPUT);  // %s [Sensor]", sensor.getPin(), sensor.getName()));
	}

	@Override
	public void visit(State state) {
		w(String.format("void state_%s() {",state.getName()));
		for(Action action: state.getActions()) {
			action.accept(this);
		}
		
		List<Transition> transitions = state.getTransitions();
		
		if(transitions != null && !transitions.isEmpty()) {
			w("  boolean guard = millis() - time > debounce;");
			context.put(CURRENT_STATE, state);
			
			for(Transition transition : transitions) {
				transition.accept(this);
			}
			
			w("  else {");
			w(String.format("    state_%s();",((State) context.get(CURRENT_STATE)).getName()));
			w("  }");
		}
		
		w("}\n");
	}

	@Override
	public void visit(Transition transition) {
		visit(transition.getSensors());
		w("    time = millis();");

		if(transition.hasDelay()) {
			w("    delay(" + transition.getDelay() + ");");
		}
		
		w(String.format("    state_%s();",transition.getNext().getName()));
		w("  }");
	}
	
	private void visit(Map<Sensor, SIGNAL> sensors) {
		Iterator<Entry<Sensor, SIGNAL>> it = sensors.entrySet().iterator();
		
		wn("  if( ");
		
		while(it.hasNext()) {
			Entry<Sensor, SIGNAL> entry = it.next();
			Sensor sensor = entry.getKey();
			SIGNAL signal = entry.getValue();
			wn(String.format("digitalRead(%d) == %s", sensor.getPin(), signal));
			
			if(it.hasNext()) {
				wn(" && ");
			}
			
		}
		
		w(" && guard ) {");
	}

	@Override
	public void visit(Action action) {
		w(String.format("  digitalWrite(%d,%s);",action.getActuator().getPin(),action.getValue()));
	}

}
