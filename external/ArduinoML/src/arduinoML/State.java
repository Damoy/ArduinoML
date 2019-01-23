/**
 */
package arduinoML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.State#getActions <em>Actions</em>}</li>
 *   <li>{@link arduinoML.State#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoML.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see arduinoML.ArduinoMLPackage#getState_Actions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link arduinoML.Transition#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference.
	 * @see #setTransition(Transition)
	 * @see arduinoML.ArduinoMLPackage#getState_Transition()
	 * @see arduinoML.Transition#getState
	 * @model opposite="state" containment="true" required="true"
	 * @generated
	 */

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoML.Transition}.
	 * It is bidirectional and its opposite is '{@link arduinoML.Transition#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see arduinoML.ArduinoMLPackage#getState_Transitions()
	 * @see arduinoML.Transition#getState
	 * @model opposite="state" containment="true" required="true"
	 * @generated
	 */

	EList<Transition> getTransitions();

} // State
