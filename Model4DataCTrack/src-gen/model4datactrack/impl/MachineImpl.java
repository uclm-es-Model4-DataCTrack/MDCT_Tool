/**
 */
package Model4DataCtrack.impl;

import Model4DataCtrack.CPU;
import Model4DataCtrack.Machine;
import Model4DataCtrack.Memory;
import Model4DataCtrack.Model4DataCtrackPackage;
import Model4DataCtrack.Storage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.impl.MachineImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.MachineImpl#getCpu <em>Cpu</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.MachineImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.MachineImpl#getStorage <em>Storage</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MachineImpl extends MinimalEObjectImpl.Container implements Machine {
	/**
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected Component base_Component;

	/**
	 * The cached value of the '{@link #getCpu() <em>Cpu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu()
	 * @generated
	 * @ordered
	 */
	protected CPU cpu;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected Memory memory;

	/**
	 * The cached value of the '{@link #getStorage() <em>Storage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected Storage storage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4DataCtrackPackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.MACHINE__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Component(Component newBase_Component) {
		Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.MACHINE__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPU getCpu() {
		if (cpu != null && cpu.eIsProxy()) {
			InternalEObject oldCpu = (InternalEObject)cpu;
			cpu = (CPU)eResolveProxy(oldCpu);
			if (cpu != oldCpu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.MACHINE__CPU, oldCpu, cpu));
			}
		}
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPU basicGetCpu() {
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpu(CPU newCpu) {
		CPU oldCpu = cpu;
		cpu = newCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.MACHINE__CPU, oldCpu, cpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory getMemory() {
		if (memory != null && memory.eIsProxy()) {
			InternalEObject oldMemory = (InternalEObject)memory;
			memory = (Memory)eResolveProxy(oldMemory);
			if (memory != oldMemory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.MACHINE__MEMORY, oldMemory, memory));
			}
		}
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory basicGetMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(Memory newMemory) {
		Memory oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.MACHINE__MEMORY, oldMemory, memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage getStorage() {
		if (storage != null && storage.eIsProxy()) {
			InternalEObject oldStorage = (InternalEObject)storage;
			storage = (Storage)eResolveProxy(oldStorage);
			if (storage != oldStorage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.MACHINE__STORAGE, oldStorage, storage));
			}
		}
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage basicGetStorage() {
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorage(Storage newStorage) {
		Storage oldStorage = storage;
		storage = newStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.MACHINE__STORAGE, oldStorage, storage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Model4DataCtrackPackage.MACHINE__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case Model4DataCtrackPackage.MACHINE__CPU:
				if (resolve) return getCpu();
				return basicGetCpu();
			case Model4DataCtrackPackage.MACHINE__MEMORY:
				if (resolve) return getMemory();
				return basicGetMemory();
			case Model4DataCtrackPackage.MACHINE__STORAGE:
				if (resolve) return getStorage();
				return basicGetStorage();
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
			case Model4DataCtrackPackage.MACHINE__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case Model4DataCtrackPackage.MACHINE__CPU:
				setCpu((CPU)newValue);
				return;
			case Model4DataCtrackPackage.MACHINE__MEMORY:
				setMemory((Memory)newValue);
				return;
			case Model4DataCtrackPackage.MACHINE__STORAGE:
				setStorage((Storage)newValue);
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
			case Model4DataCtrackPackage.MACHINE__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case Model4DataCtrackPackage.MACHINE__CPU:
				setCpu((CPU)null);
				return;
			case Model4DataCtrackPackage.MACHINE__MEMORY:
				setMemory((Memory)null);
				return;
			case Model4DataCtrackPackage.MACHINE__STORAGE:
				setStorage((Storage)null);
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
			case Model4DataCtrackPackage.MACHINE__BASE_COMPONENT:
				return base_Component != null;
			case Model4DataCtrackPackage.MACHINE__CPU:
				return cpu != null;
			case Model4DataCtrackPackage.MACHINE__MEMORY:
				return memory != null;
			case Model4DataCtrackPackage.MACHINE__STORAGE:
				return storage != null;
		}
		return super.eIsSet(featureID);
	}

} //MachineImpl
