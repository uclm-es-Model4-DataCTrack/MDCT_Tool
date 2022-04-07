/**
 */
package Model4DataCtrack.impl;

import Model4DataCtrack.Data;
import Model4DataCtrack.DataField;
import Model4DataCtrack.Model4DataCtrackPackage;
import Model4DataCtrack.SSMProcessor;
import Model4DataCtrack.newData;

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>new Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.impl.newDataImpl#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.newDataImpl#getData <em>Data</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.newDataImpl#getMachines <em>Machines</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.newDataImpl#getNewData <em>New Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class newDataImpl extends MinimalEObjectImpl.Container implements newData {
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
	 * The cached value of the '{@link #getMachines() <em>Machines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<SSMProcessor> machines;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected newDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4DataCtrackPackage.Literals.NEW_DATA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.NEW_DATA__BASE_MESSAGE, oldBase_Message, base_Message));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.NEW_DATA__BASE_MESSAGE, oldBase_Message, base_Message));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.NEW_DATA__DATA, oldData, data));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.NEW_DATA__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SSMProcessor> getMachines() {
		if (machines == null) {
			machines = new EObjectResolvingEList<SSMProcessor>(SSMProcessor.class, this, Model4DataCtrackPackage.NEW_DATA__MACHINES);
		}
		return machines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataField> getNewData() {
		if (newData == null) {
			newData = new EObjectContainmentEList<DataField>(DataField.class, this, Model4DataCtrackPackage.NEW_DATA__NEW_DATA);
		}
		return newData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean no_empty_newData_fields(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Model4DataCtrackValidator.NEW_DATA__NO_EMPTY_NEW_DATA_FIELDS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "no_empty_newData_fields", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean machine_contains_data_to_rectify(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Model4DataCtrackValidator.NEW_DATA__MACHINE_CONTAINS_DATA_TO_RECTIFY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "machine_contains_data_to_rectify", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean newData_destination_machines_comply_with_GDPR(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Model4DataCtrackValidator.NEW_DATA__NEW_DATA_DESTINATION_MACHINES_COMPLY_WITH_GDPR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "newData_destination_machines_comply_with_GDPR", EObjectValidator.getObjectLabel(this, context) }),
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
			case Model4DataCtrackPackage.NEW_DATA__NEW_DATA:
				return ((InternalEList<?>)getNewData()).basicRemove(otherEnd, msgs);
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
			case Model4DataCtrackPackage.NEW_DATA__BASE_MESSAGE:
				if (resolve) return getBase_Message();
				return basicGetBase_Message();
			case Model4DataCtrackPackage.NEW_DATA__DATA:
				if (resolve) return getData();
				return basicGetData();
			case Model4DataCtrackPackage.NEW_DATA__MACHINES:
				return getMachines();
			case Model4DataCtrackPackage.NEW_DATA__NEW_DATA:
				return getNewData();
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
			case Model4DataCtrackPackage.NEW_DATA__BASE_MESSAGE:
				setBase_Message((Message)newValue);
				return;
			case Model4DataCtrackPackage.NEW_DATA__DATA:
				setData((Data)newValue);
				return;
			case Model4DataCtrackPackage.NEW_DATA__MACHINES:
				getMachines().clear();
				getMachines().addAll((Collection<? extends SSMProcessor>)newValue);
				return;
			case Model4DataCtrackPackage.NEW_DATA__NEW_DATA:
				getNewData().clear();
				getNewData().addAll((Collection<? extends DataField>)newValue);
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
			case Model4DataCtrackPackage.NEW_DATA__BASE_MESSAGE:
				setBase_Message((Message)null);
				return;
			case Model4DataCtrackPackage.NEW_DATA__DATA:
				setData((Data)null);
				return;
			case Model4DataCtrackPackage.NEW_DATA__MACHINES:
				getMachines().clear();
				return;
			case Model4DataCtrackPackage.NEW_DATA__NEW_DATA:
				getNewData().clear();
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
			case Model4DataCtrackPackage.NEW_DATA__BASE_MESSAGE:
				return base_Message != null;
			case Model4DataCtrackPackage.NEW_DATA__DATA:
				return data != null;
			case Model4DataCtrackPackage.NEW_DATA__MACHINES:
				return machines != null && !machines.isEmpty();
			case Model4DataCtrackPackage.NEW_DATA__NEW_DATA:
				return newData != null && !newData.isEmpty();
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
			case Model4DataCtrackPackage.NEW_DATA___NO_EMPTY_NEW_DATA_FIELDS__DIAGNOSTICCHAIN_MAP:
				return no_empty_newData_fields((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Model4DataCtrackPackage.NEW_DATA___MACHINE_CONTAINS_DATA_TO_RECTIFY__DIAGNOSTICCHAIN_MAP:
				return machine_contains_data_to_rectify((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Model4DataCtrackPackage.NEW_DATA___NEW_DATA_DESTINATION_MACHINES_COMPLY_WITH_GDPR__DIAGNOSTICCHAIN_MAP:
				return newData_destination_machines_comply_with_GDPR((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //newDataImpl
