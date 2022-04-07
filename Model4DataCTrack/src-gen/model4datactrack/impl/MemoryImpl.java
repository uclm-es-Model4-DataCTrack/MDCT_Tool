/**
 */
package Model4DataCtrack.impl;

import Model4DataCtrack.Latency;
import Model4DataCtrack.Memory;
import Model4DataCtrack.Model4DataCtrackPackage;
import Model4DataCtrack.Size;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.impl.MemoryImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.MemoryImpl#getLatency <em>Latency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryImpl extends HardwareImpl implements Memory {
	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected Size capacity;

	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected Latency latency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4DataCtrackPackage.Literals.MEMORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapacity(Size newCapacity, NotificationChain msgs) {
		Size oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.MEMORY__CAPACITY, oldCapacity, newCapacity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(Size newCapacity) {
		if (newCapacity != capacity) {
			NotificationChain msgs = null;
			if (capacity != null)
				msgs = ((InternalEObject)capacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model4DataCtrackPackage.MEMORY__CAPACITY, null, msgs);
			if (newCapacity != null)
				msgs = ((InternalEObject)newCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model4DataCtrackPackage.MEMORY__CAPACITY, null, msgs);
			msgs = basicSetCapacity(newCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.MEMORY__CAPACITY, newCapacity, newCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Latency getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatency(Latency newLatency, NotificationChain msgs) {
		Latency oldLatency = latency;
		latency = newLatency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.MEMORY__LATENCY, oldLatency, newLatency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(Latency newLatency) {
		if (newLatency != latency) {
			NotificationChain msgs = null;
			if (latency != null)
				msgs = ((InternalEObject)latency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model4DataCtrackPackage.MEMORY__LATENCY, null, msgs);
			if (newLatency != null)
				msgs = ((InternalEObject)newLatency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model4DataCtrackPackage.MEMORY__LATENCY, null, msgs);
			msgs = basicSetLatency(newLatency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.MEMORY__LATENCY, newLatency, newLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Model4DataCtrackPackage.MEMORY__CAPACITY:
				return basicSetCapacity(null, msgs);
			case Model4DataCtrackPackage.MEMORY__LATENCY:
				return basicSetLatency(null, msgs);
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
			case Model4DataCtrackPackage.MEMORY__CAPACITY:
				return getCapacity();
			case Model4DataCtrackPackage.MEMORY__LATENCY:
				return getLatency();
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
			case Model4DataCtrackPackage.MEMORY__CAPACITY:
				setCapacity((Size)newValue);
				return;
			case Model4DataCtrackPackage.MEMORY__LATENCY:
				setLatency((Latency)newValue);
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
			case Model4DataCtrackPackage.MEMORY__CAPACITY:
				setCapacity((Size)null);
				return;
			case Model4DataCtrackPackage.MEMORY__LATENCY:
				setLatency((Latency)null);
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
			case Model4DataCtrackPackage.MEMORY__CAPACITY:
				return capacity != null;
			case Model4DataCtrackPackage.MEMORY__LATENCY:
				return latency != null;
		}
		return super.eIsSet(featureID);
	}

} //MemoryImpl
