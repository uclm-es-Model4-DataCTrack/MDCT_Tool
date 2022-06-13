/**
 */
package model4datactrackprofile.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import model4datactrackprofile.Data;
import model4datactrackprofile.Model4datactrackprofilePackage;
import model4datactrackprofile.Time;
import model4datactrackprofile.sendData;

import model4datactrackprofile.util.Model4datactrackprofileValidator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>send Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.impl.sendDataImpl#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.sendDataImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.sendDataImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class sendDataImpl extends MinimalEObjectImpl.Container implements sendData {
	/**
	 * The cached value of the '{@link #getBase_Message() <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Message()
	 * @generated
	 * @ordered
	 */
	protected Message base_Message;

	/**
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected Time maxTime;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected sendDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4datactrackprofilePackage.Literals.SEND_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getBase_Message() {
		if (base_Message != null && base_Message.eIsProxy()) {
			InternalEObject oldBase_Message = (InternalEObject)base_Message;
			base_Message = (Message)eResolveProxy(oldBase_Message);
			if (base_Message != oldBase_Message) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.SEND_DATA__BASE_MESSAGE, oldBase_Message, base_Message));
			}
		}
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetBase_Message() {
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Message(Message newBase_Message) {
		Message oldBase_Message = base_Message;
		base_Message = newBase_Message;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.SEND_DATA__BASE_MESSAGE, oldBase_Message, base_Message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getMaxTime() {
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxTime(Time newMaxTime, NotificationChain msgs) {
		Time oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.SEND_DATA__MAX_TIME, oldMaxTime, newMaxTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTime(Time newMaxTime) {
		if (newMaxTime != maxTime) {
			NotificationChain msgs = null;
			if (maxTime != null)
				msgs = ((InternalEObject)maxTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model4datactrackprofilePackage.SEND_DATA__MAX_TIME, null, msgs);
			if (newMaxTime != null)
				msgs = ((InternalEObject)newMaxTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model4datactrackprofilePackage.SEND_DATA__MAX_TIME, null, msgs);
			msgs = basicSetMaxTime(newMaxTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.SEND_DATA__MAX_TIME, newMaxTime, newMaxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject)data;
			data = (Data)eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.SEND_DATA__DATA, oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Data newData) {
		Data oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.SEND_DATA__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean sendData_timeunit_not_days_or_hours_or_minutes(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Model4datactrackprofileValidator.DIAGNOSTIC_SOURCE,
						 Model4datactrackprofileValidator.SEND_DATA__SEND_DATA_TIMEUNIT_NOT_DAYS_OR_HOURS_OR_MINUTES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "sendData_timeunit_not_days_or_hours_or_minutes", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean sendData_maxTime_value_greater_than_0(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Model4datactrackprofileValidator.DIAGNOSTIC_SOURCE,
						 Model4datactrackprofileValidator.SEND_DATA__SEND_DATA_MAX_TIME_VALUE_GREATER_THAN_0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "sendData_maxTime_value_greater_than_0", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Model4datactrackprofilePackage.SEND_DATA__MAX_TIME:
				return basicSetMaxTime(null, msgs);
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
			case Model4datactrackprofilePackage.SEND_DATA__BASE_MESSAGE:
				if (resolve) return getBase_Message();
				return basicGetBase_Message();
			case Model4datactrackprofilePackage.SEND_DATA__MAX_TIME:
				return getMaxTime();
			case Model4datactrackprofilePackage.SEND_DATA__DATA:
				if (resolve) return getData();
				return basicGetData();
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
			case Model4datactrackprofilePackage.SEND_DATA__BASE_MESSAGE:
				setBase_Message((Message)newValue);
				return;
			case Model4datactrackprofilePackage.SEND_DATA__MAX_TIME:
				setMaxTime((Time)newValue);
				return;
			case Model4datactrackprofilePackage.SEND_DATA__DATA:
				setData((Data)newValue);
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
			case Model4datactrackprofilePackage.SEND_DATA__BASE_MESSAGE:
				setBase_Message((Message)null);
				return;
			case Model4datactrackprofilePackage.SEND_DATA__MAX_TIME:
				setMaxTime((Time)null);
				return;
			case Model4datactrackprofilePackage.SEND_DATA__DATA:
				setData((Data)null);
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
			case Model4datactrackprofilePackage.SEND_DATA__BASE_MESSAGE:
				return base_Message != null;
			case Model4datactrackprofilePackage.SEND_DATA__MAX_TIME:
				return maxTime != null;
			case Model4datactrackprofilePackage.SEND_DATA__DATA:
				return data != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Model4datactrackprofilePackage.SEND_DATA___SEND_DATA_TIMEUNIT_NOT_DAYS_OR_HOURS_OR_MINUTES__DIAGNOSTICCHAIN_MAP:
				return sendData_timeunit_not_days_or_hours_or_minutes((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Model4datactrackprofilePackage.SEND_DATA___SEND_DATA_MAX_TIME_VALUE_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP:
				return sendData_maxTime_value_greater_than_0((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //sendDataImpl
