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
 *   <li>{@link arduinoML.State#getTransitions_state <em>Transitions state</em>}</li>
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
	 * Returns the value of the '<em><b>Transitions state</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoML.TransitionState}.
	 * It is bidirectional and its opposite is '{@link arduinoML.TransitionState#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions state</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions state</em>' containment reference list.
	 * @see arduinoML.ArduinoMLPackage#getState_Transitions_state()
	 * @see arduinoML.TransitionState#getState
	 * @model opposite="state" containment="true" required="true"
	 * @generated
	 */
	EList<TransitionState> getTransitions_state();

} // State
