/**
 */
package arduinoML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.AppState#getInitial_state <em>Initial state</em>}</li>
 *   <li>{@link arduinoML.AppState#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getAppState()
 * @model
 * @generated
 */
public interface AppState extends App {
	/**
	 * Returns the value of the '<em><b>Initial state</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial state</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial state</em>' reference.
	 * @see #setInitial_state(State)
	 * @see arduinoML.ArduinoMLPackage#getAppState_Initial_state()
	 * @model required="true"
	 * @generated
	 */
	State getInitial_state();

	/**
	 * Sets the value of the '{@link arduinoML.AppState#getInitial_state <em>Initial state</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial state</em>' reference.
	 * @see #getInitial_state()
	 * @generated
	 */
	void setInitial_state(State value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoML.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see arduinoML.ArduinoMLPackage#getAppState_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

} // AppState
