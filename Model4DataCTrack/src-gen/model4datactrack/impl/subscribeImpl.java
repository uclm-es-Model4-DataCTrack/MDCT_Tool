/**
 */
package Model4DataCtrack.impl;

import Model4DataCtrack.Data;
import Model4DataCtrack.Model4DataCtrackPackage;
import Model4DataCtrack.SSMProcessor;
import Model4DataCtrack.Time;
import Model4DataCtrack.subscribe;

import Model4DataCtrack.util.Model4DataCtrackValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>subscribe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.impl.subscribeImpl#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.subscribeImpl#getData <em>Data</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.subscribeImpl#getMachines <em>Machines</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.subscribeImpl#getBreaches <em>Breaches</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.subscribeImpl#getMaxSubscriptionTime <em>Max Subscription Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class subscribeImpl extends MinimalEObjectImpl.Container implements subscribe {
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
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

	/**
	 * The cached value of the '{@link #getMachines() <em>Machines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachines()
	 * @generated
	 * @ordered
	 */
	protected SSMProcessor machines;

	/**
	 * The cached value of the '{@link #getBreaches() <em>Breaches</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreaches()
	 * @generated
	 * @ordered
	 */
	protected EList<String> breaches;

	/**
	 * The cached value of the '{@link #getMaxSubscriptionTime() <em>Max Subscription Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSubscriptionTime()
	 * @generated
	 * @ordered
	 */
	protected Time maxSubscriptionTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected subscribeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4DataCtrackPackage.Literals.SUBSCRIBE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.SUBSCRIBE__BASE_MESSAGE, oldBase_Message, base_Message));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.SUBSCRIBE__BASE_MESSAGE, oldBase_Message, base_Message));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.SUBSCRIBE__DATA, oldData, data));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.SUBSCRIBE__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSMProcessor getMachines() {
		if (machines != null && machines.eIsProxy()) {
			InternalEObject oldMachines = (InternalEObject)machines;
			machines = (SSMProcessor)eResolveProxy(oldMachines);
			if (machines != oldMachines) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.SUBSCRIBE__MACHINES, oldMachines, machines));
			}
		}
		return machines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSMProcessor basicGetMachines() {
		return machines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachines(SSMProcessor newMachines) {
		SSMProcessor oldMachines = machines;
		machines = newMachines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.SUBSCRIBE__MACHINES, oldMachines, machines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBreaches() {
		if (breaches == null) {
			breaches = new EDataTypeUniqueEList<String>(String.class, this, Model4DataCtrackPackage.SUBSCRIBE__BREACHES);
		}
		return breaches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getMaxSubscriptionTime() {
		return maxSubscriptionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxSubscriptionTime(Time newMaxSubscriptionTime, NotificationChain msgs) {
		Time oldMaxSubscriptionTime = maxSubscriptionTime;
		maxSubscriptionTime = newMaxSubscriptionTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.SUBSCRIBE__MAX_SUBSCRIPTION_TIME, oldMaxSubscriptionTime, newMaxSubscriptionTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSubscriptionTime(Time newMaxSubscriptionTime) {
		if (newMaxSubscriptionTime != maxSubscriptionTime) {
			NotificationChain msgs = null;
			if (maxSubscriptionTime != null)
				msgs = ((InternalEObject)maxSubscriptionTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model4DataCtrackPackage.SUBSCRIBE__MAX_SUBSCRIPTION_TIME, null, msgs);
			if (newMaxSubscriptionTime != null)
				msgs = ((InternalEObject)newMaxSubscriptionTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model4DataCtrackPackage.SUBSCRIBE__MAX_SUBSCRIPTION_TIME, null, msgs);
			msgs = basicSetMaxSubscriptionTime(newMaxSubscriptionTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.SUBSCRIBE__MAX_SUBSCRIPTION_TIME, newMaxSubscriptionTime, newMaxSubscriptionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean maxSubTime_greater_than_0(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Model4DataCtrackValidator.DIAGNOSTIC_SOURCE,
						 Model4DataCtrackValidator.SUBSCRIBE__MAX_SUB_TIME_GREATER_THAN_0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "maxSubTime_greater_than_0", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean machine_contains_data_to_subscribe_to(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Model4DataCtrackValidator.DIAGNOSTIC_SOURCE,
						 Model4DataCtrackValidator.SUBSCRIBE__MACHINE_CONTAINS_DATA_TO_SUBSCRIBE_TO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "machine_contains_data_to_subscribe_to", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean subscribe_destination_machines_comply_with_GDPR(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Model4DataCtrackValidator.DIAGNOSTIC_SOURCE,
						 Model4DataCtrackValidator.SUBSCRIBE__SUBSCRIBE_DESTINATION_MACHINES_COMPLY_WITH_GDPR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "subscribe_destination_machines_comply_with_GDPR", EObjectValidator.getObjectLabel(this, context) }),
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
			case Model4DataCtrackPackage.SUBSCRIBE__MAX_SUBSCRIPTION_TIME:
				return basicSetMaxSubscriptionTime(null, msgs);
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
			case Model4DataCtrackPackage.SUBSCRIBE__BASE_MESSAGE:
				if (resolve) return getBase_Message();
				return basicGetBase_Message();
			case Model4DataCtrackPackage.SUBSCRIBE__DATA:
				if (resolve) return getData();
				return basicGetData();
			case Model4DataCtrackPackage.SUBSCRIBE__MACHINES:
				if (resolve) return getMachines();
				return basicGetMachines();
			case Model4DataCtrackPackage.SUBSCRIBE__BREACHES:
				return getBreaches();
			case Model4DataCtrackPackage.SUBSCRIBE__MAX_SUBSCRIPTION_TIME:
				return getMaxSubscriptionTime();
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
			case Model4DataCtrackPackage.SUBSCRIBE__BASE_MESSAGE:
				setBase_Message((Message)newValue);
				return;
			case Model4DataCtrackPackage.SUBSCRIBE__DATA:
				setData((Data)newValue);
				return;
			case Model4DataCtrackPackage.SUBSCRIBE__MACHINES:
				setMachines((SSMProcessor)newValue);
				return;
			case Model4DataCtrackPackage.SUBSCRIBE__BREACHES:
				getBreaches().clear();
				getBreaches().addAll((Collection<? extends String>)newValue);
				return;
			case Model4DataCtrackPackage.SUBSCRIBE__MAX_SUBSCRIPTION_TIME:
				setMaxSubscriptionTime((Time)newValue);
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
			case Model4DataCtrackPackage.SUBSCRIBE__BASE_MESSAGE:
				setBase_Message((Message)null);
				return;
			case Model4DataCtrackPackage.SUBSCRIBE__DATA:
				setData((Data)null);
				return;
			case Model4DataCtrackPackage.SUBSCRIBE__MACHINES:
				setMachines((SSMProcessor)null);
				return;
			case Model4DataCtrackPackage.SUBSCRIBE__BREACHES:
				getBreaches().clear();
				return;
			case Model4DataCtrackPackage.SUBSCRIBE__MAX_SUBSCRIPTION_TIME:
				setMaxSubscriptionTime((Time)null);
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
			case Model4DataCtrackPackage.SUBSCRIBE__BASE_MESSAGE:
				return base_Message != null;
			case Model4DataCtrackPackage.SUBSCRIBE__DATA:
				return data != null;
			case Model4DataCtrackPackage.SUBSCRIBE__MACHINES:
				return machines != null;
			case Model4DataCtrackPackage.SUBSCRIBE__BREACHES:
				return breaches != null && !breaches.isEmpty();
			case Model4DataCtrackPackage.SUBSCRIBE__MAX_SUBSCRIPTION_TIME:
				return maxSubscriptionTime != null;
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
			case Model4DataCtrackPackage.SUBSCRIBE___MAX_SUB_TIME_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP:
				return maxSubTime_greater_than_0((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Model4DataCtrackPackage.SUBSCRIBE___MACHINE_CONTAINS_DATA_TO_SUBSCRIBE_TO__DIAGNOSTICCHAIN_MAP:
				return machine_contains_data_to_subscribe_to((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Model4DataCtrackPackage.SUBSCRIBE___SUBSCRIBE_DESTINATION_MACHINES_COMPLY_WITH_GDPR__DIAGNOSTICCHAIN_MAP:
				return subscribe_destination_machines_comply_with_GDPR((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (breaches: ");
		result.append(breaches);
		result.append(')');
		return result.toString();
	}

} //subscribeImpl
