/**
 */
package arduinoML.impl;

import arduinoML.Analog;
import arduinoML.ArduinoMLPackage;
import arduinoML.Compare;
import arduinoML.Digital;
import arduinoML.Signal;
import arduinoML.Time_unit;
import arduinoML.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.impl.TransitionImpl#getD_values <em>Dvalues</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionImpl#getDigitals <em>Digitals</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionImpl#getTime <em>Time</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionImpl#getAnalogs <em>Analogs</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionImpl#getA_values <em>Avalues</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionImpl#getComp <em>Comp</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
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
	protected EList<Integer> a_values;

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
	public EList<Integer> getA_values() {
		if (a_values == null) {
			a_values = new EDataTypeEList<Integer>(Integer.class, this, ArduinoMLPackage.TRANSITION__AVALUES);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoMLPackage.TRANSITION__DVALUES:
				return getD_values();
			case ArduinoMLPackage.TRANSITION__DIGITALS:
				return getDigitals();
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
			case ArduinoMLPackage.TRANSITION__DIGITALS:
				getDigitals().clear();
				getDigitals().addAll((Collection<? extends Digital>)newValue);
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
				getA_values().addAll((Collection<? extends Integer>)newValue);
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
			case ArduinoMLPackage.TRANSITION__DIGITALS:
				getDigitals().clear();
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
			case ArduinoMLPackage.TRANSITION__DIGITALS:
				return digitals != null && !digitals.isEmpty();
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
