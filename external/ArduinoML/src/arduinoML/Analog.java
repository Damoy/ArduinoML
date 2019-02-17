/**
 */
package arduinoML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.Analog#isDebug <em>Debug</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getAnalog()
 * @model
 * @generated
 */
public interface Analog extends Brick {

	/**
	 * Returns the value of the '<em><b>Debug</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debug</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debug</em>' attribute.
	 * @see #setDebug(boolean)
	 * @see arduinoML.ArduinoMLPackage#getAnalog_Debug()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDebug();

	/**
	 * Sets the value of the '{@link arduinoML.Analog#isDebug <em>Debug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debug</em>' attribute.
	 * @see #isDebug()
	 * @generated
	 */
	void setDebug(boolean value);
} // Analog
