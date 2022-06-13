/**
 */
package model4datactrackprofile.impl;

import model4datactrackprofile.ActionType;
import model4datactrackprofile.Data;
import model4datactrackprofile.Model4datactrackprofilePackage;
import model4datactrackprofile.StatelessAppCTP;
import model4datactrackprofile.Storage;
import model4datactrackprofile.breachInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>breach Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.impl.breachInfoImpl#getData <em>Data</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.breachInfoImpl#getTp <em>Tp</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.breachInfoImpl#getAction <em>Action</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.breachInfoImpl#getNewData <em>New Data</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.breachInfoImpl#getNewLocation <em>New Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class breachInfoImpl extends MinimalEObjectImpl.Container implements breachInfo {
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
	 * The cached value of the '{@link #getTp() <em>Tp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTp()
	 * @generated
	 * @ordered
	 */
	protected StatelessAppCTP tp;

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
	 * The cached value of the '{@link #getNewData() <em>New Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewData()
	 * @generated
	 * @ordered
	 */
	protected Data newData;

	/**
	 * The cached value of the '{@link #getNewLocation() <em>New Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewLocation()
	 * @generated
	 * @ordered
	 */
	protected Storage newLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected breachInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4datactrackprofilePackage.Literals.BREACH_INFO;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.BREACH_INFO__DATA, oldData, data));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.BREACH_INFO__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatelessAppCTP getTp() {
		if (tp != null && tp.eIsProxy()) {
			InternalEObject oldTp = (InternalEObject)tp;
			tp = (StatelessAppCTP)eResolveProxy(oldTp);
			if (tp != oldTp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.BREACH_INFO__TP, oldTp, tp));
			}
		}
		return tp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatelessAppCTP basicGetTp() {
		return tp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTp(StatelessAppCTP newTp) {
		StatelessAppCTP oldTp = tp;
		tp = newTp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.BREACH_INFO__TP, oldTp, tp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.BREACH_INFO__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getNewData() {
		if (newData != null && newData.eIsProxy()) {
			InternalEObject oldNewData = (InternalEObject)newData;
			newData = (Data)eResolveProxy(oldNewData);
			if (newData != oldNewData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.BREACH_INFO__NEW_DATA, oldNewData, newData));
			}
		}
		return newData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetNewData() {
		return newData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewData(Data newNewData) {
		Data oldNewData = newData;
		newData = newNewData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.BREACH_INFO__NEW_DATA, oldNewData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage getNewLocation() {
		if (newLocation != null && newLocation.eIsProxy()) {
			InternalEObject oldNewLocation = (InternalEObject)newLocation;
			newLocation = (Storage)eResolveProxy(oldNewLocation);
			if (newLocation != oldNewLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.BREACH_INFO__NEW_LOCATION, oldNewLocation, newLocation));
			}
		}
		return newLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage basicGetNewLocation() {
		return newLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewLocation(Storage newNewLocation) {
		Storage oldNewLocation = newLocation;
		newLocation = newNewLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.BREACH_INFO__NEW_LOCATION, oldNewLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Model4datactrackprofilePackage.BREACH_INFO__DATA:
				if (resolve) return getData();
				return basicGetData();
			case Model4datactrackprofilePackage.BREACH_INFO__TP:
				if (resolve) return getTp();
				return basicGetTp();
			case Model4datactrackprofilePackage.BREACH_INFO__ACTION:
				return getAction();
			case Model4datactrackprofilePackage.BREACH_INFO__NEW_DATA:
				if (resolve) return getNewData();
				return basicGetNewData();
			case Model4datactrackprofilePackage.BREACH_INFO__NEW_LOCATION:
				if (resolve) return getNewLocation();
				return basicGetNewLocation();
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
			case Model4datactrackprofilePackage.BREACH_INFO__DATA:
				setData((Data)newValue);
				return;
			case Model4datactrackprofilePackage.BREACH_INFO__TP:
				setTp((StatelessAppCTP)newValue);
				return;
			case Model4datactrackprofilePackage.BREACH_INFO__ACTION:
				setAction((ActionType)newValue);
				return;
			case Model4datactrackprofilePackage.BREACH_INFO__NEW_DATA:
				setNewData((Data)newValue);
				return;
			case Model4datactrackprofilePackage.BREACH_INFO__NEW_LOCATION:
				setNewLocation((Storage)newValue);
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
			case Model4datactrackprofilePackage.BREACH_INFO__DATA:
				setData((Data)null);
				return;
			case Model4datactrackprofilePackage.BREACH_INFO__TP:
				setTp((StatelessAppCTP)null);
				return;
			case Model4datactrackprofilePackage.BREACH_INFO__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case Model4datactrackprofilePackage.BREACH_INFO__NEW_DATA:
				setNewData((Data)null);
				return;
			case Model4datactrackprofilePackage.BREACH_INFO__NEW_LOCATION:
				setNewLocation((Storage)null);
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
			case Model4datactrackprofilePackage.BREACH_INFO__DATA:
				return data != null;
			case Model4datactrackprofilePackage.BREACH_INFO__TP:
				return tp != null;
			case Model4datactrackprofilePackage.BREACH_INFO__ACTION:
				return action != ACTION_EDEFAULT;
			case Model4datactrackprofilePackage.BREACH_INFO__NEW_DATA:
				return newData != null;
			case Model4datactrackprofilePackage.BREACH_INFO__NEW_LOCATION:
				return newLocation != null;
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
		result.append(" (action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //breachInfoImpl
