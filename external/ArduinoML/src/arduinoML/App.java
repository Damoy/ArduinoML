/**
 */
package arduinoML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.App#getBricks <em>Bricks</em>}</li>
 *   <li>{@link arduinoML.App#getStates <em>States</em>}</li>
 *   <li>{@link arduinoML.App#getModes <em>Modes</em>}</li>
 *   <li>{@link arduinoML.App#getInitial_state <em>Initial state</em>}</li>
 *   <li>{@link arduinoML.App#getInitial_mode <em>Initial mode</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getApp()
 * @model
 * @generated
 */
public interface App extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Bricks</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoML.Brick}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bricks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bricks</em>' containment reference list.
	 * @see arduinoML.ArduinoMLPackage#getApp_Bricks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Brick> getBricks();

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
	 * @see arduinoML.ArduinoMLPackage#getApp_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Modes</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoML.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes</em>' containment reference list.
	 * @see arduinoML.ArduinoMLPackage#getApp_Modes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mode> getModes();

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
	 * @see arduinoML.ArduinoMLPackage#getApp_Initial_state()
	 * @model
	 * @generated
	 */
	State getInitial_state();

	/**
	 * Sets the value of the '{@link arduinoML.App#getInitial_state <em>Initial state</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial state</em>' reference.
	 * @see #getInitial_state()
	 * @generated
	 */
	void setInitial_state(State value);

	/**
	 * Returns the value of the '<em><b>Initial mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial mode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial mode</em>' reference.
	 * @see #setInitial_mode(Mode)
	 * @see arduinoML.ArduinoMLPackage#getApp_Initial_mode()
	 * @model required="true"
	 * @generated
	 */
	Mode getInitial_mode();

	/**
	 * Sets the value of the '{@link arduinoML.App#getInitial_mode <em>Initial mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial mode</em>' reference.
	 * @see #getInitial_mode()
	 * @generated
	 */
	void setInitial_mode(Mode value);

} // App
