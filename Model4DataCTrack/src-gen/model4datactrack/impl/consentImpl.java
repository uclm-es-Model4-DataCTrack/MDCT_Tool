/**
 */
package Model4DataCtrack.impl;

import Model4DataCtrack.ActionType;
import Model4DataCtrack.Data;
import Model4DataCtrack.Model4DataCtrackPackage;
import Model4DataCtrack.consent;

import Model4DataCtrack.util.Model4DataCtrackValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

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
 * An implementation of the model object '<em><b>consent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.impl.consentImpl#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.consentImpl#getData <em>Data</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.consentImpl#getAction <em>Action</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.consentImpl#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @generated
 */
public class consentImpl extends MinimalEObjectImpl.Container implements consent {
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
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final ActionType ACTION_EDEFAULT = ActionType.READ;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected ActionType action = ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected EList<String> purpose;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected consentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4DataCtrackPackage.Literals.CONSENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.CONSENT__BASE_MESSAGE, oldBase_Message, base_Message));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.CONSENT__BASE_MESSAGE, oldBase_Message, base_Message));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.CONSENT__DATA, oldData, data));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.CONSENT__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ActionType newAction) {
		ActionType oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.CONSENT__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPurpose() {
		if (purpose == null) {
			purpose = new EDataTypeUniqueEList<String>(String.class, this, Model4DataCtrackPackage.CONSENT__PURPOSE);
		}
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean consent_machine_complies_with_GDPR(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Model4DataCtrackValidator.CONSENT__CONSENT_MACHINE_COMPLIES_WITH_GDPR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "consent_machine_complies_with_GDPR", EObjectValidator.getObjectLabel(this, context) }),
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Model4DataCtrackPackage.CONSENT__BASE_MESSAGE:
				if (resolve) return getBase_Message();
				return basicGetBase_Message();
			case Model4DataCtrackPackage.CONSENT__DATA:
				if (resolve) return getData();
				return basicGetData();
			case Model4DataCtrackPackage.CONSENT__ACTION:
				return getAction();
			case Model4DataCtrackPackage.CONSENT__PURPOSE:
				return getPurpose();
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
			case Model4DataCtrackPackage.CONSENT__BASE_MESSAGE:
				setBase_Message((Message)newValue);
				return;
			case Model4DataCtrackPackage.CONSENT__DATA:
				setData((Data)newValue);
				return;
			case Model4DataCtrackPackage.CONSENT__ACTION:
				setAction((ActionType)newValue);
				return;
			case Model4DataCtrackPackage.CONSENT__PURPOSE:
				getPurpose().clear();
				getPurpose().addAll((Collection<? extends String>)newValue);
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
			case Model4DataCtrackPackage.CONSENT__BASE_MESSAGE:
				setBase_Message((Message)null);
				return;
			case Model4DataCtrackPackage.CONSENT__DATA:
				setData((Data)null);
				return;
			case Model4DataCtrackPackage.CONSENT__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case Model4DataCtrackPackage.CONSENT__PURPOSE:
				getPurpose().clear();
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
			case Model4DataCtrackPackage.CONSENT__BASE_MESSAGE:
				return base_Message != null;
			case Model4DataCtrackPackage.CONSENT__DATA:
				return data != null;
			case Model4DataCtrackPackage.CONSENT__ACTION:
				return action != ACTION_EDEFAULT;
			case Model4DataCtrackPackage.CONSENT__PURPOSE:
				return purpose != null && !purpose.isEmpty();
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
			case Model4DataCtrackPackage.CONSENT___CONSENT_MACHINE_COMPLIES_WITH_GDPR__DIAGNOSTICCHAIN_MAP:
				return consent_machine_complies_with_GDPR((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (action: ");
		result.append(action);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(')');
		return result.toString();
	}

} //consentImpl
