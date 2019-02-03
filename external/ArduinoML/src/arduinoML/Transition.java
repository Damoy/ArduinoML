/**
 */
package arduinoML;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.Transition#getD_values <em>Dvalues</em>}</li>
 *   <li>{@link arduinoML.Transition#getNext_state <em>Next state</em>}</li>
 *   <li>{@link arduinoML.Transition#getDigitals <em>Digitals</em>}</li>
 *   <li>{@link arduinoML.Transition#getState <em>State</em>}</li>
 *   <li>{@link arduinoML.Transition#getTime <em>Time</em>}</li>
 *   <li>{@link arduinoML.Transition#getUnit <em>Unit</em>}</li>
 *   <li>{@link arduinoML.Transition#getAnalogs <em>Analogs</em>}</li>
 *   <li>{@link arduinoML.Transition#getA_values <em>Avalues</em>}</li>
 *   <li>{@link arduinoML.Transition#getComp <em>Comp</em>}</li>
 *   <li>{@link arduinoML.Transition#getNext_mode <em>Next mode</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Dvalues</b></em>' attribute list.
	 * The list contents are of type {@link arduinoML.Signal}.
	 * The literals are from the enumeration {@link arduinoML.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dvalues</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dvalues</em>' attribute list.
	 * @see arduinoML.Signal
	 * @see arduinoML.ArduinoMLPackage#getTransition_D_values()
	 * @model unique="false"
	 * @generated
	 */
	EList<Signal> getD_values();

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
	 * @see arduinoML.ArduinoMLPackage#getTransition_Next_state()
	 * @model
	 * @generated
	 */
	State getNext_state();

	/**
	 * Sets the value of the '{@link arduinoML.Transition#getNext_state <em>Next state</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next state</em>' reference.
	 * @see #getNext_state()
	 * @generated
	 */
	void setNext_state(State value);

	/**
	 * Returns the value of the '<em><b>Digitals</b></em>' reference list.
	 * The list contents are of type {@link arduinoML.Digital}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digitals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digitals</em>' reference list.
	 * @see arduinoML.ArduinoMLPackage#getTransition_Digitals()
	 * @model
	 * @generated
	 */
	EList<Digital> getDigitals();

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link arduinoML.State#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see arduinoML.ArduinoMLPackage#getTransition_State()
	 * @see arduinoML.State#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link arduinoML.Transition#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see arduinoML.ArduinoMLPackage#getTransition_Time()
	 * @model default="0"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link arduinoML.Transition#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoML.Time_unit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see arduinoML.Time_unit
	 * @see #setUnit(Time_unit)
	 * @see arduinoML.ArduinoMLPackage#getTransition_Unit()
	 * @model
	 * @generated
	 */
	Time_unit getUnit();

	/**
	 * Sets the value of the '{@link arduinoML.Transition#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see arduinoML.Time_unit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Time_unit value);

	/**
	 * Returns the value of the '<em><b>Analogs</b></em>' reference list.
	 * The list contents are of type {@link arduinoML.Analog}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analogs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analogs</em>' reference list.
	 * @see arduinoML.ArduinoMLPackage#getTransition_Analogs()
	 * @model
	 * @generated
	 */
	EList<Analog> getAnalogs();

	/**
	 * Returns the value of the '<em><b>Avalues</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avalues</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avalues</em>' attribute list.
	 * @see arduinoML.ArduinoMLPackage#getTransition_A_values()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getA_values();

	/**
	 * Returns the value of the '<em><b>Comp</b></em>' attribute list.
	 * The list contents are of type {@link arduinoML.Compare}.
	 * The literals are from the enumeration {@link arduinoML.Compare}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp</em>' attribute list.
	 * @see arduinoML.Compare
	 * @see arduinoML.ArduinoMLPackage#getTransition_Comp()
	 * @model unique="false"
	 * @generated
	 */
	EList<Compare> getComp();

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
	 * @see arduinoML.ArduinoMLPackage#getTransition_Next_mode()
	 * @model
	 * @generated
	 */
	Mode getNext_mode();

	/**
	 * Sets the value of the '{@link arduinoML.Transition#getNext_mode <em>Next mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next mode</em>' reference.
	 * @see #getNext_mode()
	 * @generated
	 */
	void setNext_mode(Mode value);

} // Transition
