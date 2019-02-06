/**
 */
package arduinoML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.TransitionState#getNext_state <em>Next state</em>}</li>
 *   <li>{@link arduinoML.TransitionState#getState <em>State</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getTransitionState()
 * @model
 * @generated
 */
public interface TransitionState extends Transition {
	/**
	 * Returns the value of the '<em><b>Next state</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next state</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next state</em>' reference.
	 * @see #setNext_state(State)
	 * @see arduinoML.ArduinoMLPackage#getTransitionState_Next_state()
	 * @model required="true"
	 * @generated
	 */
	State getNext_state();

	/**
	 * Sets the value of the '{@link arduinoML.TransitionState#getNext_state <em>Next state</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next state</em>' reference.
	 * @see #getNext_state()
	 * @generated
	 */
	void setNext_state(State value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link arduinoML.State#getTransitions_state <em>Transitions state</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see arduinoML.ArduinoMLPackage#getTransitionState_State()
	 * @see arduinoML.State#getTransitions_state
	 * @model opposite="transitions_state" required="true" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link arduinoML.TransitionState#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // TransitionState
