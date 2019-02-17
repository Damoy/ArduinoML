/**
 */
package arduinoML.impl;

import arduinoML.ArduinoMLPackage;
import arduinoML.Mode;
import arduinoML.TransitionMode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.impl.TransitionModeImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionModeImpl#getNext_mode <em>Next mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionModeImpl extends TransitionImpl implements TransitionMode {
	/**
	 * The cached value of the '{@link #getNext_mode() <em>Next mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext_mode()
	 * @generated
	 * @ordered
	 */
	protected Mode next_mode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoMLPackage.Literals.TRANSITION_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mode getMode() {
		if (eContainerFeatureID() != ArduinoMLPackage.TRANSITION_MODE__MODE) return null;
		return (Mode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMode(Mode newMode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMode, ArduinoMLPackage.TRANSITION_MODE__MODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(Mode newMode) {
		if (newMode != eInternalContainer() || (eContainerFeatureID() != ArduinoMLPackage.TRANSITION_MODE__MODE && newMode != null)) {
			if (EcoreUtil.isAncestor(this, newMode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMode != null)
				msgs = ((InternalEObject)newMode).eInverseAdd(this, ArduinoMLPackage.MODE__TRANSITIONS_MODE, Mode.class, msgs);
			msgs = basicSetMode(newMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.TRANSITION_MODE__MODE, newMode, newMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mode getNext_mode() {
		if (next_mode != null && next_mode.eIsProxy()) {
			InternalEObject oldNext_mode = (InternalEObject)next_mode;
			next_mode = (Mode)eResolveProxy(oldNext_mode);
			if (next_mode != oldNext_mode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoMLPackage.TRANSITION_MODE__NEXT_MODE, oldNext_mode, next_mode));
			}
		}
		return next_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode basicGetNext_mode() {
		return next_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNext_mode(Mode newNext_mode) {
		Mode oldNext_mode = next_mode;
		next_mode = newNext_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.TRANSITION_MODE__NEXT_MODE, oldNext_mode, next_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoMLPackage.TRANSITION_MODE__MODE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMode((Mode)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoMLPackage.TRANSITION_MODE__MODE:
				return basicSetMode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ArduinoMLPackage.TRANSITION_MODE__MODE:
				return eInternalContainer().eInverseRemove(this, ArduinoMLPackage.MODE__TRANSITIONS_MODE, Mode.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoMLPackage.TRANSITION_MODE__MODE:
				return getMode();
			case ArduinoMLPackage.TRANSITION_MODE__NEXT_MODE:
				if (resolve) return getNext_mode();
				return basicGetNext_mode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArduinoMLPackage.TRANSITION_MODE__MODE:
				setMode((Mode)newValue);
				return;
			case ArduinoMLPackage.TRANSITION_MODE__NEXT_MODE:
				setNext_mode((Mode)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArduinoMLPackage.TRANSITION_MODE__MODE:
				setMode((Mode)null);
				return;
			case ArduinoMLPackage.TRANSITION_MODE__NEXT_MODE:
				setNext_mode((Mode)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArduinoMLPackage.TRANSITION_MODE__MODE:
				return getMode() != null;
			case ArduinoMLPackage.TRANSITION_MODE__NEXT_MODE:
				return next_mode != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionModeImpl
