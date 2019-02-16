package arduinoML.homemade;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import arduinoML.Action;
import arduinoML.Actuator;
import arduinoML.Analog;
import arduinoML.App;
import arduinoML.ArduinoMLPackage;
import arduinoML.Brick;
import arduinoML.Digital;
import arduinoML.Mode;
import arduinoML.State;
import arduinoML.Transition;
import arduinoML.TransitionMode;
import arduinoML.TransitionState;
import arduinoML.util.ArduinoMLSwitch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see arduinoML.ArduinoMLPackage
 * 
 */
public class ArduinoMLSwitchPrinter extends ArduinoMLSwitch<String> {
	
	// Tools
	Mode currentMode = null;
	Boolean hasBrick = false;
	int if_counter = -1;
	List<TransitionMode> transitionsModeUtil = new ArrayList<TransitionMode>();
	boolean inUniqueModeState = false;
	
	public ArduinoMLSwitchPrinter() {
		if (modelPackage == null) {
			modelPackage = ArduinoMLPackage.eINSTANCE;
		}
	}


	/**
	 * Returns the result of interpreting the object as an instance of '<em>Brick</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Brick</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * 
	 */
	public String caseBrick(Brick object) {
		return "";
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * 
	 */
	public String caseActuator(Actuator object) {
		if (object.getPin() >= 0 && object.getPin() <= 19) {
			return "\tpinMode("+object.getPin()+", OUTPUT);\n";
		}
		return "\t// ERROR OUTPUT : pin " + object.getPin() + " doesn't exist !\n";
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * 
	 */
	public String caseAnalog(Analog object) {
		if (object.getPin() >= 0 && object.getPin() <= 19) {
			return "\tpinMode("+object.getPin()+", INPUT);\n";
		}
		return "\t// ERROR INPUT : pin " + object.getPin() + " doesn't exist !\n";
	}
	
	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * 
	 */
	public String caseDigital(Digital object) {
		if (object.getPin() >= 0 && object.getPin() <= 19) {
			return "\tpinMode("+object.getPin()+", INPUT);\n";
		}
		return "\t// ERROR INPUT : pin " + object.getPin() + " doesn't exist !\n";
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * 
	 */
	public String caseApp(App object) {
		StringBuilder sb = new StringBuilder();
		sb.append("// Code generated by ArduinoML\n"
				+ "// Structural concepts\n"
				+ "void setup() {\n");

		List<Brick> objectBricks = object.getBricks();
		
		// hack to keep first dsl syntax, no mode == one mode hidden
		if(object.getModes().size() ==  1 && object.getInitial_mode() == null) {
			Mode uniqueMode = object.getModes().get(0);
			object.setInitial_mode(uniqueMode);
			objectBricks = new ArrayList<Brick>(uniqueMode.getBricks());
			uniqueMode.getBricks().clear();
			inUniqueModeState = true;
		}
		
		for(Brick b : objectBricks) {
			sb.append(doSwitch(b));
		}
		
		sb.append("}\n\n"
				+ "//Behavioral concepts\n"
				+ "long time=0; long debounce = 200;\n\n");
		
		// if there is only one mode, set it to initial
		for(Mode m : object.getModes()) {
			currentMode = m;
			sb.append(doSwitch(m));
		}
		
		sb.append("void loop() {mode_" + object.getInitial_mode().getName() + "();} // Entering init mode");
		
		return sb.toString();
	}
	
	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * 
	 */
	public String caseMode(Mode object) {
		StringBuilder sb = new StringBuilder();
		sb.append("void mode_" + object.getName() + "() {\n");
		hasBrick = !object.getBricks().isEmpty();
		
		if (hasBrick) {
			sb.append("\t//setup bricks\n");
			for(Brick b : object.getBricks()) {
				sb.append(doSwitch(b));
			}
		}
		
		sb.append("\t//initial state\n");
		sb.append("\tstate_" + object.getInitial().getName() + "();\n");
		sb.append("}\n\n");
		
		if (hasBrick) {
			boolean shouldClose = false;
			
			if(object.getBricks().parallelStream().anyMatch(a -> a instanceof Actuator)) {
				sb.append("void reset_" + object.getName() + "() {\n"); 
				shouldClose = true;
			}
			
			for (Brick b : object.getBricks()) {
				if(b instanceof Actuator){
					sb.append("\tdigitalWrite(" + b.getPin() + ", LOW);\n");
					shouldClose = true;
				}
			}
			
			if(shouldClose)
				sb.append("}\n\n");
		}
		
		// dirty hack..
		// transitionsModeUtil.clear();
		// to use it on states
		transitionsModeUtil.addAll(object.getTransitions_mode());
		
		for(TransitionMode transition : object.getTransitions_mode()) {
			sb.append(doSwitch(transition));
		}
		
		for(State s : object.getStates()) {
			sb.append(doSwitch(s));
		}
		
		return sb.toString();
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * 
	 */
	public String caseState(State object) {
		if_counter = 0;
		StringBuilder sb = new StringBuilder();
		
		sb.append("void state_" + object.getName() + "() {\n");
		
		for(Action a : object.getActions())
			sb.append(doSwitch(a));
		
		sb.append("\tboolean guard = millis() - time > debounce;\n");
		
		// TODO CHECK
		if(currentMode != null) {
			if(!transitionsModeUtil.isEmpty()) {
				List<TransitionMode> transitions =
					transitionsModeUtil.parallelStream()
						.filter(transition -> transition.getMode().getName().equals(currentMode.getName()))
							.collect(Collectors.toList());
				
				for(TransitionMode tm : transitions) {
					sb.append("\t");
					sb.append(tm.getMode().getName().trim());
					sb.append("_to_");
					sb.append(tm.getNext_mode().getName().trim()); // must have next mode
					sb.append("();\n");
				}
			}
		}
		
		for(Transition t : object.getTransitions_state()) {
			sb.append(doSwitch(t));
		}
		
		if (if_counter != 0) {
			sb.append("\telse {\n\t\tstate_"
					+ object.getTransitions_state().get(0).getState().getName()
					+ "(); \n\t}\n");
		}
		
		sb.append("}\n\n");
		return sb.toString();
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * 
	 */
	public String caseAction(Action object) {
		StringBuilder sb = new StringBuilder();
		sb.append("\tdigitalWrite("
				+object.getActuator().getPin()
				+", "+object.getValue().getLiteral()
				+");\n");
		return sb.toString();
	}
	
	public String caseTransition(Transition object) {
		return "";
	}
	
	public String caseTransitionState(TransitionState object) {
		StringBuilder sb = new StringBuilder();
		// if the transition has at least one digital or analog
		if (!object.getDigitals().isEmpty() || !object.getAnalogs().isEmpty()) {
			if_counter++;
			
			// if the transition has at least one digital
			if (!object.getDigitals().isEmpty()) {
				// write the first one
				sb.append("\tif( digitalRead("
						+ object.getDigitals().get(0).getPin()
						+ ") == "
						+ object.getD_values().get(0).getLiteral());
				
				// if more than one digital, append each remaining
				if (object.getDigitals().size() > 1) {
					for (int i = 1; i < object.getDigitals().size(); i++) {
						sb.append(" && digitalRead("
								+ object.getDigitals().get(i).getPin()
								+ ") == "
								+ object.getD_values().get(i).getLiteral());
					}
				}
				
				// if the transition has analogs
				if (object.getAnalogs().size() > 0) {
					for (int i = 0; i < object.getAnalogs().size(); i++) {
						sb.append(" && analogRead("
								+ object.getAnalogs().get(i).getPin()
								+ ") "
								+ comparateur(object.getComp().get(i).getValue())
								+ " " + 
								object.getA_values().get(i));
					}
				}
			} else {
				// transition has no digital
				sb.append("\tif( analogRead("
						+ object.getAnalogs().get(0).getPin()
						+ ") "
						+  comparateur(object.getComp().get(0).getValue())
						+ " "
						+ object.getA_values().get(0));
				
				// if transition has more than one analog, append remaining
				if (object.getAnalogs().size() > 1) {
					for (int i = 1; i < object.getAnalogs().size(); i++) {
						sb.append(" && analogRead("
								+ object.getAnalogs().get(i).getPin()
								+ ") "
								+ comparateur(object.getComp().get(i).getValue())
								+ " "
								+ object.getA_values().get(i));
					}
				}
			}
			
			sb.append(" && guard ) {\n");
			
			// if transition has delay
			if(object.getUnit() != null) {
				int delay = Math.abs(object.getTime()) * object.getUnit().getValue();
				
				if(delay > 0)
					sb.append("\t\tdelay(" + delay + ");\n");
			}
		}
		
		if(!object.getAnalogs().isEmpty() || !object.getDigitals().isEmpty()) {
			if (object.getNext_state() != null) {
				sb.append("\t\ttime = millis();\n\t\tstate_" + object.getNext_state().getName() + "();\n\t}\n");
			} else if(hasBrick){
				if(currentMode.getBricks().parallelStream().anyMatch(a -> a instanceof Actuator)) {
					sb.append("\t\treset_" + currentMode + "();\n");
				}
			}			
		}
		
		// transition has no digital nor analogs
		if(object.getDigitals().isEmpty() && object.getAnalogs().isEmpty()) {
			if(if_counter != 0) {
				sb.append("\tif (true) {\n");
				int delay = Math.abs(object.getTime()) * object.getUnit().getValue();
				if(delay > 0) {
					sb.append("\t\tdelay(" + delay + ");\n");
				}
				
				// sb.append("\tif (true) {\n"	+ "\t\tdelay(" + delay + ");\n");
				
				if (object.getNext_state() != null) {
					sb.append("\t\tstate_" + object.getNext_state().getName() + "();\n\t}\n");
				} else if (hasBrick){
					if(currentMode.getBricks().parallelStream().anyMatch(a -> a instanceof Actuator)) {
						sb.append("\t\treset_" + currentMode + "();\n");
					}
				}
			} else {
				// sb.append("\tdelay(" + Math.abs(object.getTime()) * object.getUnit().getValue() + ");\n");
				int delay = Math.abs(object.getTime()) * object.getUnit().getValue();
				if(delay > 0) {
					sb.append("\tdelay(" + delay + ");\n");
				}
				
				if (object.getNext_state() != null) {
					sb.append("\tstate_" + object.getNext_state().getName() + "();\n");
				} else if (hasBrick){
					if(currentMode.getBricks().parallelStream().anyMatch(a -> a instanceof Actuator)) {
						sb.append("\t\treset_" + currentMode + "();\n");
					}
				}
			}
		}
		
		return sb.toString();
	}
	
	public String caseTransitionMode(TransitionMode object) {
		// creating dedicated functions to mode transitions
		StringBuilder sb = new StringBuilder();
		sb.append("void ");
		sb.append(object.getMode().getName());
		sb.append("_to_");
		sb.append(object.getNext_mode().getName()); // must have next mode
		sb.append("(){\n");
		
		sb.append("\tboolean guard = millis() - time > debounce;\n");
		
		// beginning of if condition
		// if the transition has at least one digital or analog
		if (!object.getDigitals().isEmpty() || !object.getAnalogs().isEmpty()) {
			if_counter++;
			
			// if the transition has at least one digital
			if (!object.getDigitals().isEmpty()) {
				// write the first one
				sb.append("\tif( digitalRead("
						+ object.getDigitals().get(0).getPin()
						+ ") == "
						+ object.getD_values().get(0).getLiteral());
				
				// if more than one digital, append each remaining
				if (object.getDigitals().size() > 1) {
					for (int i = 1; i < object.getDigitals().size(); i++) {
						sb.append(" && digitalRead("
								+ object.getDigitals().get(i).getPin()
								+ ") == "
								+ object.getD_values().get(i).getLiteral());
					}
				}
				
				// if the transition has analogs
				if (object.getAnalogs().size() > 0) {
					for (int i = 0; i < object.getAnalogs().size(); i++) {
						sb.append(" && analogRead("
								+ object.getAnalogs().get(i).getPin()
								+ ") "
								+ comparateur(object.getComp().get(i).getValue())
								+ " " + 
								object.getA_values().get(i));
					}
				}
			} else {
				// transition has no digital
				sb.append("\tif( analogRead("
						+ object.getAnalogs().get(0).getPin()
						+ ") "
						+  comparateur(object.getComp().get(0).getValue())
						+ " "
						+ object.getA_values().get(0));
				
				// if transition has more than one analog, append remaining
				if (object.getAnalogs().size() > 1) {
					for (int i = 1; i < object.getAnalogs().size(); i++) {
						sb.append(" && analogRead("
								+ object.getAnalogs().get(i).getPin()
								+ ") "
								+ comparateur(object.getComp().get(i).getValue())
								+ " "
								+ object.getA_values().get(i));
					}
				}
			}
			
			sb.append(" && guard ) {\n");
			
			// if transition has delay
			if(object.getUnit() != null) {
				int delay = Math.abs(object.getTime()) * object.getUnit().getValue();
				
				if(delay > 0)
					sb.append("\t\tdelay(" + delay + ");\n");		
			}
			
			// should reset only there is an actuator to reset
			if(object.getMode().getBricks().parallelStream().anyMatch(a -> a instanceof Actuator)) {
				sb.append("\t\treset_" + object.getMode().getName() + "();\n");
			}
			
			sb.append("\t\ttime = millis();\n");
			sb.append("\t\tmode_" + object.getNext_mode().getName());
			sb.append("();\n");
			sb.append("\t}\n");
		}
		
		sb.append("}\n");
		return sb.toString();
	}
	
	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * 
	 */
	@Override
	public String defaultCase(EObject object) {
		return "";
	}
	
	private String comparateur(int comp) {
		String res = "ERROR";
		switch (comp) {
			case 0: res = "<";
					break;
			case 1: res = "<=";
					break;
			case 2: res = "==";
					break;
			case 3: res = ">=";
					break;
			case 4: res = ">";
					break;
			default: break;
		}
		return res;
	}

} //ArduinoMLSwitch
