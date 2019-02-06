/**
 */
package arduinoML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.TransitionMode#getMode <em>Mode</em>}</li>
 *   <li>{@link arduinoML.TransitionMode#getNext_mode <em>Next mode</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getTransitionMode()
 * @model
 * @generated
 */
public interface TransitionMode extends Transition {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link arduinoML.Mode#getTransitions_mode <em>Transitions mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' container reference.
	 * @see #setMode(Mode)
	 * @see arduinoML.ArduinoMLPackage#getTransitionMode_Mode()
	 * @see arduinoML.Mode#getTransitions_mode
	 * @model opposite="transitions_mode" required="true" transient="false"
	 * @generated
	 */
	Mode getMode();

	/**
	 * Sets the value of the '{@link arduinoML.TransitionMode#getMode <em>Mode</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' container reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Mode value);

	/**
	 * Returns the value of the '<em><b>Next mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next mode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next mode</em>' reference.
	 * @see #setNext_mode(Mode)
	 * @see arduinoML.ArduinoMLPackage#getTransitionMode_Next_mode()
	 * @model required="true"
	 * @generated
	 */
	Mode getNext_mode();

	/**
	 * Sets the value of the '{@link arduinoML.TransitionMode#getNext_mode <em>Next mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next mode</em>' reference.
	 * @see #getNext_mode()
	 * @generated
	 */
	void setNext_mode(Mode value);

} // TransitionMode
