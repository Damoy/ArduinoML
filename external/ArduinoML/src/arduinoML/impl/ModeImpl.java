/**
 */
package arduinoML.impl;

import arduinoML.ArduinoMLPackage;
import arduinoML.Brick;
import arduinoML.Mode;
import arduinoML.State;

import arduinoML.TransitionMode;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.impl.ModeImpl#getBricks <em>Bricks</em>}</li>
 *   <li>{@link arduinoML.impl.ModeImpl#getStates <em>States</em>}</li>
 *   <li>{@link arduinoML.impl.ModeImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link arduinoML.impl.ModeImpl#getTransitions_mode <em>Transitions mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModeImpl extends NamedElementImpl implements Mode {
	/**
	 * The cached value of the '{@link #getBricks() <em>Bricks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBricks()
	 * @generated
	 * @ordered
	 */
	protected EList<Brick> bricks;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected State initial;

	/**
	 * The cached value of the '{@link #getTransitions_mode() <em>Transitions mode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions_mode()
	 * @generated
	 * @ordered
	 */
	protected EList<TransitionMode> transitions_mode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoMLPackage.Literals.MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Brick> getBricks() {
		if (bricks == null) {
			bricks = new EObjectContainmentEList<Brick>(Brick.class, this, ArduinoMLPackage.MODE__BRICKS);
		}
		return bricks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, ArduinoMLPackage.MODE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getInitial() {
		if (initial != null && initial.eIsProxy()) {
			InternalEObject oldInitial = (InternalEObject)initial;
			initial = (State)eResolveProxy(oldInitial);
			if (initial != oldInitial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoMLPackage.MODE__INITIAL, oldInitial, initial));
			}
		}
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitial(State newInitial) {
		State oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.MODE__INITIAL, oldInitial, initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransitionMode> getTransitions_mode() {
		if (transitions_mode == null) {
			transitions_mode = new EObjectContainmentWithInverseEList<TransitionMode>(TransitionMode.class, this, ArduinoMLPackage.MODE__TRANSITIONS_MODE, ArduinoMLPackage.TRANSITION_MODE__MODE);
		}
		return transitions_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoMLPackage.MODE__TRANSITIONS_MODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions_mode()).basicAdd(otherEnd, msgs);
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
			case ArduinoMLPackage.MODE__BRICKS:
				return ((InternalEList<?>)getBricks()).basicRemove(otherEnd, msgs);
			case ArduinoMLPackage.MODE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case ArduinoMLPackage.MODE__TRANSITIONS_MODE:
				return ((InternalEList<?>)getTransitions_mode()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoMLPackage.MODE__BRICKS:
				return getBricks();
			case ArduinoMLPackage.MODE__STATES:
				return getStates();
			case ArduinoMLPackage.MODE__INITIAL:
				if (resolve) return getInitial();
				return basicGetInitial();
			case ArduinoMLPackage.MODE__TRANSITIONS_MODE:
				return getTransitions_mode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArduinoMLPackage.MODE__BRICKS:
				getBricks().clear();
				getBricks().addAll((Collection<? extends Brick>)newValue);
				return;
			case ArduinoMLPackage.MODE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case ArduinoMLPackage.MODE__INITIAL:
				setInitial((State)newValue);
				return;
			case ArduinoMLPackage.MODE__TRANSITIONS_MODE:
				getTransitions_mode().clear();
				getTransitions_mode().addAll((Collection<? extends TransitionMode>)newValue);
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
			case ArduinoMLPackage.MODE__BRICKS:
				getBricks().clear();
				return;
			case ArduinoMLPackage.MODE__STATES:
				getStates().clear();
				return;
			case ArduinoMLPackage.MODE__INITIAL:
				setInitial((State)null);
				return;
			case ArduinoMLPackage.MODE__TRANSITIONS_MODE:
				getTransitions_mode().clear();
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
			case ArduinoMLPackage.MODE__BRICKS:
				return bricks != null && !bricks.isEmpty();
			case ArduinoMLPackage.MODE__STATES:
				return states != null && !states.isEmpty();
			case ArduinoMLPackage.MODE__INITIAL:
				return initial != null;
			case ArduinoMLPackage.MODE__TRANSITIONS_MODE:
				return transitions_mode != null && !transitions_mode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModeImpl
