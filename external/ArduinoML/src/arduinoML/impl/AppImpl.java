/**
 */
package arduinoML.impl;

import arduinoML.App;
import arduinoML.ArduinoMLPackage;
import arduinoML.Brick;
import arduinoML.Mode;
import arduinoML.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.impl.AppImpl#getBricks <em>Bricks</em>}</li>
 *   <li>{@link arduinoML.impl.AppImpl#getStates <em>States</em>}</li>
 *   <li>{@link arduinoML.impl.AppImpl#getModes <em>Modes</em>}</li>
 *   <li>{@link arduinoML.impl.AppImpl#getInitial_state <em>Initial state</em>}</li>
 *   <li>{@link arduinoML.impl.AppImpl#getInitial_mode <em>Initial mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppImpl extends NamedElementImpl implements App {
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
	 * The cached value of the '{@link #getModes() <em>Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> modes;

	/**
	 * The cached value of the '{@link #getInitial_state() <em>Initial state</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial_state()
	 * @generated
	 * @ordered
	 */
	protected State initial_state;

	/**
	 * The cached value of the '{@link #getInitial_mode() <em>Initial mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial_mode()
	 * @generated
	 * @ordered
	 */
	protected Mode initial_mode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoMLPackage.Literals.APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Brick> getBricks() {
		if (bricks == null) {
			bricks = new EObjectContainmentEList<Brick>(Brick.class, this, ArduinoMLPackage.APP__BRICKS);
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
			states = new EObjectContainmentEList<State>(State.class, this, ArduinoMLPackage.APP__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mode> getModes() {
		if (modes == null) {
			modes = new EObjectContainmentEList<Mode>(Mode.class, this, ArduinoMLPackage.APP__MODES);
		}
		return modes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getInitial_state() {
		if (initial_state != null && initial_state.eIsProxy()) {
			InternalEObject oldInitial_state = (InternalEObject)initial_state;
			initial_state = (State)eResolveProxy(oldInitial_state);
			if (initial_state != oldInitial_state) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoMLPackage.APP__INITIAL_STATE, oldInitial_state, initial_state));
			}
		}
		return initial_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitial_state() {
		return initial_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitial_state(State newInitial_state) {
		State oldInitial_state = initial_state;
		initial_state = newInitial_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.APP__INITIAL_STATE, oldInitial_state, initial_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mode getInitial_mode() {
		if (initial_mode != null && initial_mode.eIsProxy()) {
			InternalEObject oldInitial_mode = (InternalEObject)initial_mode;
			initial_mode = (Mode)eResolveProxy(oldInitial_mode);
			if (initial_mode != oldInitial_mode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoMLPackage.APP__INITIAL_MODE, oldInitial_mode, initial_mode));
			}
		}
		return initial_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode basicGetInitial_mode() {
		return initial_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitial_mode(Mode newInitial_mode) {
		Mode oldInitial_mode = initial_mode;
		initial_mode = newInitial_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.APP__INITIAL_MODE, oldInitial_mode, initial_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoMLPackage.APP__BRICKS:
				return ((InternalEList<?>)getBricks()).basicRemove(otherEnd, msgs);
			case ArduinoMLPackage.APP__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case ArduinoMLPackage.APP__MODES:
				return ((InternalEList<?>)getModes()).basicRemove(otherEnd, msgs);
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
			case ArduinoMLPackage.APP__BRICKS:
				return getBricks();
			case ArduinoMLPackage.APP__STATES:
				return getStates();
			case ArduinoMLPackage.APP__MODES:
				return getModes();
			case ArduinoMLPackage.APP__INITIAL_STATE:
				if (resolve) return getInitial_state();
				return basicGetInitial_state();
			case ArduinoMLPackage.APP__INITIAL_MODE:
				if (resolve) return getInitial_mode();
				return basicGetInitial_mode();
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
			case ArduinoMLPackage.APP__BRICKS:
				getBricks().clear();
				getBricks().addAll((Collection<? extends Brick>)newValue);
				return;
			case ArduinoMLPackage.APP__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case ArduinoMLPackage.APP__MODES:
				getModes().clear();
				getModes().addAll((Collection<? extends Mode>)newValue);
				return;
			case ArduinoMLPackage.APP__INITIAL_STATE:
				setInitial_state((State)newValue);
				return;
			case ArduinoMLPackage.APP__INITIAL_MODE:
				setInitial_mode((Mode)newValue);
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
			case ArduinoMLPackage.APP__BRICKS:
				getBricks().clear();
				return;
			case ArduinoMLPackage.APP__STATES:
				getStates().clear();
				return;
			case ArduinoMLPackage.APP__MODES:
				getModes().clear();
				return;
			case ArduinoMLPackage.APP__INITIAL_STATE:
				setInitial_state((State)null);
				return;
			case ArduinoMLPackage.APP__INITIAL_MODE:
				setInitial_mode((Mode)null);
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
			case ArduinoMLPackage.APP__BRICKS:
				return bricks != null && !bricks.isEmpty();
			case ArduinoMLPackage.APP__STATES:
				return states != null && !states.isEmpty();
			case ArduinoMLPackage.APP__MODES:
				return modes != null && !modes.isEmpty();
			case ArduinoMLPackage.APP__INITIAL_STATE:
				return initial_state != null;
			case ArduinoMLPackage.APP__INITIAL_MODE:
				return initial_mode != null;
		}
		return super.eIsSet(featureID);
	}

} //AppImpl
