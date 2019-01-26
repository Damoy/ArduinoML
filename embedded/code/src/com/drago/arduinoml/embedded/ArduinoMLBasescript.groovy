package com.drago.arduinoml.embedded;

import io.github.mosser.arduinoml.kernel.behavioral.Action
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.RETURN
import com.sun.org.apache.xpath.internal.operations.And

import io.github.mosser.arduinoml.kernel.behavioral.State
import io.github.mosser.arduinoml.kernel.structural.Actuator
import io.github.mosser.arduinoml.kernel.structural.Sensor
import io.github.mosser.arduinoml.kernel.structural.SIGNAL
import static ArduinoMLUtils.*

abstract class ArduinoMLBasescript extends Script {
	// sensor "name" pin n
	def sensor(String name) {
		[onPin: { n -> ((ArduinoMLBinding)this.getBinding()).getArduinoMLModel().createSensor(name, n)}]
	}
	
	// actuator "name" pin n
	def actuator(String name) {
		[onPin: { n -> ((ArduinoMLBinding)this.getBinding()).getArduinoMLModel().createActuator(name, n) }]
	}
	
	// state "name" means actuator becomes signal [and actuator becomes signal]*n
	def state(String name) {
		List<Action> actions = new ArrayList<Action>()
		((ArduinoMLBinding) this.getBinding()).getArduinoMLModel().createState(name, 0, actions)
		// recursive closure to allow multiple and statements
		def closure
		closure = { actuator ->
			[becomes: { signal ->
				Action action = new Action()
				action.setActuator(actuator instanceof String ? (Actuator)((ArduinoMLBinding)this.getBinding()).getVariable(actuator) : (Actuator)actuator)
				action.setValue(signal instanceof String ? (SIGNAL)((ArduinoMLBinding)this.getBinding()).getVariable(signal) : (SIGNAL)signal)
				actions.add(action)
				[and: closure]
			}]
		}
		[means: closure]
	}
	
	// initial state
	def initial(String state) {
		((ArduinoMLBinding) this.getBinding()).getArduinoMLModel().setInitialState(state instanceof String ? (State)((ArduinoMLBinding)this.getBinding()).getVariable(state) : (State)state)
	}
	
	def delay(Integer delay) {
		Map<Sensor, SIGNAL> transitionConditions = new HashMap<Sensor, SIGNAL>()
		((ArduinoMLBinding) this.getBinding()).getArduinoMLModel().setupTransition(transitionConditions)
		((ArduinoMLBinding) this.getBinding()).getArduinoMLModel().setupTransitionDelay(delay);

		def closure
		closure = { sensor ->
			[becomes: { signal ->
				((ArduinoMLBinding) this.getBinding()).getArduinoMLModel().setupTransition(
					null, null,
					sensor instanceof String ? (Sensor)((ArduinoMLBinding)this.getBinding()).getVariable(sensor) : (Sensor)sensor,
					signal instanceof String ? (SIGNAL)((ArduinoMLBinding)this.getBinding()).getVariable(signal) : (SIGNAL)signal)
				[and: closure]
			}]
		}
		
		["from": {
				state1 -> 
					[to: { state2 ->
			            [when: { sensor ->
			                [becomes: { signal ->
			                    ((ArduinoMLBinding) this.getBinding()).getArduinoMLModel().setupTransition(
			                        state1 instanceof String ? (State)((ArduinoMLBinding)this.getBinding()).getVariable(state1) : (State)state1,
			                        state2 instanceof String ? (State)((ArduinoMLBinding)this.getBinding()).getVariable(state2) : (State)state2,
			                        sensor instanceof String ? (Sensor)((ArduinoMLBinding)this.getBinding()).getVariable(sensor) : (Sensor)sensor,
			                        signal instanceof String ? (SIGNAL)((ArduinoMLBinding)this.getBinding()).getVariable(signal) : (SIGNAL)signal)
								[and: closure]
			                }]
			            }]
			        }]
		}]
	}
	
	// from state1 to state2 when sensor becomes signal
	def from(String state1) {
		Map<Sensor, SIGNAL> transitionConditions = new HashMap<Sensor, SIGNAL>()
		((ArduinoMLBinding) this.getBinding()).getArduinoMLModel().setupTransition(transitionConditions)

		def closure
		closure = { sensor ->
			[becomes: { signal ->
				((ArduinoMLBinding) this.getBinding()).getArduinoMLModel().setupTransition(
					null, null,
					sensor instanceof String ? (Sensor)((ArduinoMLBinding)this.getBinding()).getVariable(sensor) : (Sensor)sensor,
					signal instanceof String ? (SIGNAL)((ArduinoMLBinding)this.getBinding()).getVariable(signal) : (SIGNAL)signal)
				[and: closure(state1)]
			}]
		}
				
		[to: { state2 ->
            [when: { sensor ->
                [becomes: { signal ->
                    ((ArduinoMLBinding) this.getBinding()).getArduinoMLModel().setupTransition(
                        state1 instanceof String ? (State)((ArduinoMLBinding)this.getBinding()).getVariable(state1) : (State)state1,
                        state2 instanceof String ? (State)((ArduinoMLBinding)this.getBinding()).getVariable(state2) : (State)state2,
                        sensor instanceof String ? (Sensor)((ArduinoMLBinding)this.getBinding()).getVariable(sensor) : (Sensor)sensor,
                        signal instanceof String ? (SIGNAL)((ArduinoMLBinding)this.getBinding()).getVariable(signal) : (SIGNAL)signal)
					[and: closure]
                }]
            }]
        }]
    }
	
	// export name
	def export(String name) {
		String result = ((ArduinoMLBinding) this.getBinding()).getArduinoMLModel().generateCode(name).toString()
		export(name, result)
	}
	
	// disable run method while running
	int count = 0
	abstract void scriptBody()
	def run() {
		if(count == 0) {
			count++
			scriptBody()
		} else {
			println "Run method is disabled"
		}
	}
}