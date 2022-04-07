/**
 */
package model4datactrackprofile.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import model4datactrackprofile.DataField;
import model4datactrackprofile.Model4datactrackprofilePackage;
import model4datactrackprofile.Time;

import model4datactrackprofile.util.Model4datactrackprofileValidator;

import model4datactrackprofile.writeData;

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>write Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.impl.writeDataImpl#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.writeDataImpl#getNewData <em>New Data</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.writeDataImpl#getMaxTime <em>Max Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class writeDataImpl extends MinimalEObjectImpl.Container implements writeData {
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
	 * The cached value of the '{@link #getNewData() <em>New Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewData()
	 * @generated
	 * @ordered
	 */
	protected EList<DataField> newData;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected writeDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4datactrackprofilePackage.Literals.WRITE_DATA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.WRITE_DATA__BASE_MESSAGE, oldBase_Message, base_Message));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.WRITE_DATA__BASE_MESSAGE, oldBase_Message, base_Message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataField> getNewData() {
		if (newData == null) {
			newData = new EObjectContainmentEList<DataField>(DataField.class, this, Model4datactrackprofilePackage.WRITE_DATA__NEW_DATA);
		}
		return newData;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.WRITE_DATA__MAX_TIME, oldMaxTime, newMaxTime);
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
				msgs = ((InternalEObject)maxTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model4datactrackprofilePackage.WRITE_DATA__MAX_TIME, null, msgs);
			if (newMaxTime != null)
				msgs = ((InternalEObject)newMaxTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model4datactrackprofilePackage.WRITE_DATA__MAX_TIME, null, msgs);
			msgs = basicSetMaxTime(newMaxTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.WRITE_DATA__MAX_TIME, newMaxTime, newMaxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean no_empty_write_fields(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Model4datactrackprofileValidator.WRITE_DATA__NO_EMPTY_WRITE_FIELDS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "no_empty_write_fields", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean writeData_timeunit_not_days_or_hours_or_minutes(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Model4datactrackprofileValidator.WRITE_DATA__WRITE_DATA_TIMEUNIT_NOT_DAYS_OR_HOURS_OR_MINUTES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "writeData_timeunit_not_days_or_hours_or_minutes", EObjectValidator.getObjectLabel(this, context) }),
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
			case Model4datactrackprofilePackage.WRITE_DATA__NEW_DATA:
				return ((InternalEList<?>)getNewData()).basicRemove(otherEnd, msgs);
			case Model4datactrackprofilePackage.WRITE_DATA__MAX_TIME:
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
			case Model4datactrackprofilePackage.WRITE_DATA__BASE_MESSAGE:
				if (resolve) return getBase_Message();
				return basicGetBase_Message();
			case Model4datactrackprofilePackage.WRITE_DATA__NEW_DATA:
				return getNewData();
			case Model4datactrackprofilePackage.WRITE_DATA__MAX_TIME:
				return getMaxTime();
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
			case Model4datactrackprofilePackage.WRITE_DATA__BASE_MESSAGE:
				setBase_Message((Message)newValue);
				return;
			case Model4datactrackprofilePackage.WRITE_DATA__NEW_DATA:
				getNewData().clear();
				getNewData().addAll((Collection<? extends DataField>)newValue);
				return;
			case Model4datactrackprofilePackage.WRITE_DATA__MAX_TIME:
				setMaxTime((Time)newValue);
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
			case Model4datactrackprofilePackage.WRITE_DATA__BASE_MESSAGE:
				setBase_Message((Message)null);
				return;
			case Model4datactrackprofilePackage.WRITE_DATA__NEW_DATA:
				getNewData().clear();
				return;
			case Model4datactrackprofilePackage.WRITE_DATA__MAX_TIME:
				setMaxTime((Time)null);
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
			case Model4datactrackprofilePackage.WRITE_DATA__BASE_MESSAGE:
				return base_Message != null;
			case Model4datactrackprofilePackage.WRITE_DATA__NEW_DATA:
				return newData != null && !newData.isEmpty();
			case Model4datactrackprofilePackage.WRITE_DATA__MAX_TIME:
				return maxTime != null;
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
			case Model4datactrackprofilePackage.WRITE_DATA___NO_EMPTY_WRITE_FIELDS__DIAGNOSTICCHAIN_MAP:
				return no_empty_write_fields((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Model4datactrackprofilePackage.WRITE_DATA___WRITE_DATA_TIMEUNIT_NOT_DAYS_OR_HOURS_OR_MINUTES__DIAGNOSTICCHAIN_MAP:
				return writeData_timeunit_not_days_or_hours_or_minutes((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //writeDataImpl
