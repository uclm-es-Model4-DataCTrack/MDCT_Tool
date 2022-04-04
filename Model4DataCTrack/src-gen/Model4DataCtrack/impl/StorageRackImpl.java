/**
 */
package Model4DataCtrack.impl;

import Model4DataCtrack.Model4DataCtrackPackage;
import Model4DataCtrack.SSMProcessor;
import Model4DataCtrack.StorageRack;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Rack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.impl.StorageRackImpl#getMachineType <em>Machine Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageRackImpl extends RackImpl implements StorageRack {
	/**
	 * The cached value of the '{@link #getMachineType() <em>Machine Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineType()
	 * @generated
	 * @ordered
	 */
	protected SSMProcessor machineType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageRackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4DataCtrackPackage.Literals.STORAGE_RACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSMProcessor getMachineType() {
		if (machineType != null && machineType.eIsProxy()) {
			InternalEObject oldMachineType = (InternalEObject)machineType;
			machineType = (SSMProcessor)eResolveProxy(oldMachineType);
			if (machineType != oldMachineType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.STORAGE_RACK__MACHINE_TYPE, oldMachineType, machineType));
			}
		}
		return machineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSMProcessor basicGetMachineType() {
		return machineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachineType(SSMProcessor newMachineType) {
		SSMProcessor oldMachineType = machineType;
		machineType = newMachineType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.STORAGE_RACK__MACHINE_TYPE, oldMachineType, machineType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Model4DataCtrackPackage.STORAGE_RACK__MACHINE_TYPE:
				if (resolve) return getMachineType();
				return basicGetMachineType();
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
			case Model4DataCtrackPackage.STORAGE_RACK__MACHINE_TYPE:
				setMachineType((SSMProcessor)newValue);
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
			case Model4DataCtrackPackage.STORAGE_RACK__MACHINE_TYPE:
				setMachineType((SSMProcessor)null);
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
			case Model4DataCtrackPackage.STORAGE_RACK__MACHINE_TYPE:
				return machineType != null;
		}
		return super.eIsSet(featureID);
	}

} //StorageRackImpl
