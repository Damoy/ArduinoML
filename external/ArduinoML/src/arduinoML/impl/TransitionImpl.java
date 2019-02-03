/**
 */
package arduinoML.impl;

import arduinoML.Analog;
import arduinoML.ArduinoMLPackage;
import arduinoML.Compare;
import arduinoML.Digital;
import arduinoML.Signal;
import arduinoML.State;
import arduinoML.Time_unit;
import arduinoML.Transition;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.impl.TransitionImpl#getD_values <em>Dvalues</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionImpl#getNext <em>Next</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionImpl#getDigitals <em>Digitals</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionImpl#getState <em>State</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionImpl#getTime <em>Time</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionImpl#getAnalogs <em>Analogs</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionImpl#getA_values <em>Avalues</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionImpl#getComp <em>Comp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getD_values() <em>Dvalues</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD_values()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> d_values;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected State next;

	/**
	 * The cached value of the '{@link #getDigitals() <em>Digitals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitals()
	 * @generated
	 * @ordered
	 */
	protected EList<Digital> digitals;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final Time_unit UNIT_EDEFAULT = Time_unit.MS;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Time_unit unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnalogs() <em>Analogs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalogs()
	 * @generated
	 * @ordered
	 */
	protected EList<Analog> analogs;

	/**
	 * The cached value of the '{@link #getA_values() <em>Avalues</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA_values()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> a_values;

	/**
	 * The cached value of the '{@link #getComp() <em>Comp</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp()
	 * @generated
	 * @ordered
	 */
	protected EList<Compare> comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoMLPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Signal> getD_values() {
		if (d_values == null) {
			d_values = new EDataTypeEList<Signal>(Signal.class, this, ArduinoMLPackage.TRANSITION__DVALUES);
		}
		return d_values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (State)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoMLPackage.TRANSITION__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNext(State newNext) {
		State oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.TRANSITION__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Digital> getDigitals() {
		if (digitals == null) {
			digitals = new EObjectResolvingEList<Digital>(Digital.class, this, ArduinoMLPackage.TRANSITION__DIGITALS);
		}
		return digitals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getState() {
		if (eContainerFeatureID() != ArduinoMLPackage.TRANSITION__STATE) return null;
		return (State)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newState, ArduinoMLPackage.TRANSITION__STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(State newState) {
		if (newState != eInternalContainer() || (eContainerFeatureID() != ArduinoMLPackage.TRANSITION__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, ArduinoMLPackage.STATE__TRANSITIONS, State.class, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.TRANSITION__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.TRANSITION__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Time_unit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(Time_unit newUnit) {
		Time_unit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.TRANSITION__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Analog> getAnalogs() {
		if (analogs == null) {
			analogs = new EObjectResolvingEList<Analog>(Analog.class, this, ArduinoMLPackage.TRANSITION__ANALOGS);
		}
		return analogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getA_values() {
		if (a_values == null) {
			a_values = new EDataTypeEList<Long>(Long.class, this, ArduinoMLPackage.TRANSITION__AVALUES);
		}
		return a_values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Compare> getComp() {
		if (comp == null) {
			comp = new EDataTypeEList<Compare>(Compare.class, this, ArduinoMLPackage.TRANSITION__COMP);
		}
		return comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoMLPackage.TRANSITION__STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetState((State)otherEnd, msgs);
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
			case ArduinoMLPackage.TRANSITION__STATE:
				return basicSetState(null, msgs);
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
			case ArduinoMLPackage.TRANSITION__STATE:
				return eInternalContainer().eInverseRemove(this, ArduinoMLPackage.STATE__TRANSITIONS, State.class, msgs);
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
			case ArduinoMLPackage.TRANSITION__DVALUES:
				return getD_values();
			case ArduinoMLPackage.TRANSITION__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case ArduinoMLPackage.TRANSITION__DIGITALS:
				return getDigitals();
			case ArduinoMLPackage.TRANSITION__STATE:
				return getState();
			case ArduinoMLPackage.TRANSITION__TIME:
				return getTime();
			case ArduinoMLPackage.TRANSITION__UNIT:
				return getUnit();
			case ArduinoMLPackage.TRANSITION__ANALOGS:
				return getAnalogs();
			case ArduinoMLPackage.TRANSITION__AVALUES:
				return getA_values();
			case ArduinoMLPackage.TRANSITION__COMP:
				return getComp();
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
			case ArduinoMLPackage.TRANSITION__DVALUES:
				getD_values().clear();
				getD_values().addAll((Collection<? extends Signal>)newValue);
				return;
			case ArduinoMLPackage.TRANSITION__NEXT:
				setNext((State)newValue);
				return;
			case ArduinoMLPackage.TRANSITION__DIGITALS:
				getDigitals().clear();
				getDigitals().addAll((Collection<? extends Digital>)newValue);
				return;
			case ArduinoMLPackage.TRANSITION__STATE:
				setState((State)newValue);
				return;
			case ArduinoMLPackage.TRANSITION__TIME:
				setTime((Integer)newValue);
				return;
			case ArduinoMLPackage.TRANSITION__UNIT:
				setUnit((Time_unit)newValue);
				return;
			case ArduinoMLPackage.TRANSITION__ANALOGS:
				getAnalogs().clear();
				getAnalogs().addAll((Collection<? extends Analog>)newValue);
				return;
			case ArduinoMLPackage.TRANSITION__AVALUES:
				getA_values().clear();
				getA_values().addAll((Collection<? extends Long>)newValue);
				return;
			case ArduinoMLPackage.TRANSITION__COMP:
				getComp().clear();
				getComp().addAll((Collection<? extends Compare>)newValue);
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
			case ArduinoMLPackage.TRANSITION__DVALUES:
				getD_values().clear();
				return;
			case ArduinoMLPackage.TRANSITION__NEXT:
				setNext((State)null);
				return;
			case ArduinoMLPackage.TRANSITION__DIGITALS:
				getDigitals().clear();
				return;
			case ArduinoMLPackage.TRANSITION__STATE:
				setState((State)null);
				return;
			case ArduinoMLPackage.TRANSITION__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ArduinoMLPackage.TRANSITION__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case ArduinoMLPackage.TRANSITION__ANALOGS:
				getAnalogs().clear();
				return;
			case ArduinoMLPackage.TRANSITION__AVALUES:
				getA_values().clear();
				return;
			case ArduinoMLPackage.TRANSITION__COMP:
				getComp().clear();
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
			case ArduinoMLPackage.TRANSITION__DVALUES:
				return d_values != null && !d_values.isEmpty();
			case ArduinoMLPackage.TRANSITION__NEXT:
				return next != null;
			case ArduinoMLPackage.TRANSITION__DIGITALS:
				return digitals != null && !digitals.isEmpty();
			case ArduinoMLPackage.TRANSITION__STATE:
				return getState() != null;
			case ArduinoMLPackage.TRANSITION__TIME:
				return time != TIME_EDEFAULT;
			case ArduinoMLPackage.TRANSITION__UNIT:
				return unit != UNIT_EDEFAULT;
			case ArduinoMLPackage.TRANSITION__ANALOGS:
				return analogs != null && !analogs.isEmpty();
			case ArduinoMLPackage.TRANSITION__AVALUES:
				return a_values != null && !a_values.isEmpty();
			case ArduinoMLPackage.TRANSITION__COMP:
				return comp != null && !comp.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (d_values: ");
		result.append(d_values);
		result.append(", time: ");
		result.append(time);
		result.append(", unit: ");
		result.append(unit);
		result.append(", a_values: ");
		result.append(a_values);
		result.append(", comp: ");
		result.append(comp);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
