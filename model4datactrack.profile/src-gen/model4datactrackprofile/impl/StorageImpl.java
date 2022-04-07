/**
 */
package model4datactrackprofile.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import model4datactrackprofile.Bandwidth;
import model4datactrackprofile.Data;
import model4datactrackprofile.Model4datactrackprofilePackage;
import model4datactrackprofile.Size;
import model4datactrackprofile.Storage;

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

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.impl.StorageImpl#getNumberOfDrivers <em>Number Of Drivers</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.StorageImpl#getDirveCapacity <em>Dirve Capacity</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.StorageImpl#getReadBandwidth <em>Read Bandwidth</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.StorageImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageImpl extends HardwareImpl implements Storage {
	/**
	 * The default value of the '{@link #getNumberOfDrivers() <em>Number Of Drivers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDrivers()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_DRIVERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfDrivers() <em>Number Of Drivers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDrivers()
	 * @generated
	 * @ordered
	 */
	protected int numberOfDrivers = NUMBER_OF_DRIVERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDirveCapacity() <em>Dirve Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirveCapacity()
	 * @generated
	 * @ordered
	 */
	protected Size dirveCapacity;

	/**
	 * The cached value of the '{@link #getReadBandwidth() <em>Read Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadBandwidth()
	 * @generated
	 * @ordered
	 */
	protected Bandwidth readBandwidth;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4datactrackprofilePackage.Literals.STORAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfDrivers() {
		return numberOfDrivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfDrivers(int newNumberOfDrivers) {
		int oldNumberOfDrivers = numberOfDrivers;
		numberOfDrivers = newNumberOfDrivers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.STORAGE__NUMBER_OF_DRIVERS, oldNumberOfDrivers, numberOfDrivers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getDirveCapacity() {
		return dirveCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirveCapacity(Size newDirveCapacity, NotificationChain msgs) {
		Size oldDirveCapacity = dirveCapacity;
		dirveCapacity = newDirveCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.STORAGE__DIRVE_CAPACITY, oldDirveCapacity, newDirveCapacity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirveCapacity(Size newDirveCapacity) {
		if (newDirveCapacity != dirveCapacity) {
			NotificationChain msgs = null;
			if (dirveCapacity != null)
				msgs = ((InternalEObject)dirveCapacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model4datactrackprofilePackage.STORAGE__DIRVE_CAPACITY, null, msgs);
			if (newDirveCapacity != null)
				msgs = ((InternalEObject)newDirveCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model4datactrackprofilePackage.STORAGE__DIRVE_CAPACITY, null, msgs);
			msgs = basicSetDirveCapacity(newDirveCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.STORAGE__DIRVE_CAPACITY, newDirveCapacity, newDirveCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bandwidth getReadBandwidth() {
		return readBandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadBandwidth(Bandwidth newReadBandwidth, NotificationChain msgs) {
		Bandwidth oldReadBandwidth = readBandwidth;
		readBandwidth = newReadBandwidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.STORAGE__READ_BANDWIDTH, oldReadBandwidth, newReadBandwidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadBandwidth(Bandwidth newReadBandwidth) {
		if (newReadBandwidth != readBandwidth) {
			NotificationChain msgs = null;
			if (readBandwidth != null)
				msgs = ((InternalEObject)readBandwidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model4datactrackprofilePackage.STORAGE__READ_BANDWIDTH, null, msgs);
			if (newReadBandwidth != null)
				msgs = ((InternalEObject)newReadBandwidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model4datactrackprofilePackage.STORAGE__READ_BANDWIDTH, null, msgs);
			msgs = basicSetReadBandwidth(newReadBandwidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.STORAGE__READ_BANDWIDTH, newReadBandwidth, newReadBandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectResolvingEList<Data>(Data.class, this, Model4datactrackprofilePackage.STORAGE__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean numberOfDrivers_greater_than_0(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Model4datactrackprofileValidator.STORAGE__NUMBER_OF_DRIVERS_GREATER_THAN_0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "numberOfDrivers_greater_than_0", EObjectValidator.getObjectLabel(this, context) }),
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
			case Model4datactrackprofilePackage.STORAGE__DIRVE_CAPACITY:
				return basicSetDirveCapacity(null, msgs);
			case Model4datactrackprofilePackage.STORAGE__READ_BANDWIDTH:
				return basicSetReadBandwidth(null, msgs);
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
			case Model4datactrackprofilePackage.STORAGE__NUMBER_OF_DRIVERS:
				return getNumberOfDrivers();
			case Model4datactrackprofilePackage.STORAGE__DIRVE_CAPACITY:
				return getDirveCapacity();
			case Model4datactrackprofilePackage.STORAGE__READ_BANDWIDTH:
				return getReadBandwidth();
			case Model4datactrackprofilePackage.STORAGE__DATA:
				return getData();
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
			case Model4datactrackprofilePackage.STORAGE__NUMBER_OF_DRIVERS:
				setNumberOfDrivers((Integer)newValue);
				return;
			case Model4datactrackprofilePackage.STORAGE__DIRVE_CAPACITY:
				setDirveCapacity((Size)newValue);
				return;
			case Model4datactrackprofilePackage.STORAGE__READ_BANDWIDTH:
				setReadBandwidth((Bandwidth)newValue);
				return;
			case Model4datactrackprofilePackage.STORAGE__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
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
			case Model4datactrackprofilePackage.STORAGE__NUMBER_OF_DRIVERS:
				setNumberOfDrivers(NUMBER_OF_DRIVERS_EDEFAULT);
				return;
			case Model4datactrackprofilePackage.STORAGE__DIRVE_CAPACITY:
				setDirveCapacity((Size)null);
				return;
			case Model4datactrackprofilePackage.STORAGE__READ_BANDWIDTH:
				setReadBandwidth((Bandwidth)null);
				return;
			case Model4datactrackprofilePackage.STORAGE__DATA:
				getData().clear();
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
			case Model4datactrackprofilePackage.STORAGE__NUMBER_OF_DRIVERS:
				return numberOfDrivers != NUMBER_OF_DRIVERS_EDEFAULT;
			case Model4datactrackprofilePackage.STORAGE__DIRVE_CAPACITY:
				return dirveCapacity != null;
			case Model4datactrackprofilePackage.STORAGE__READ_BANDWIDTH:
				return readBandwidth != null;
			case Model4datactrackprofilePackage.STORAGE__DATA:
				return data != null && !data.isEmpty();
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
			case Model4datactrackprofilePackage.STORAGE___NUMBER_OF_DRIVERS_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP:
				return numberOfDrivers_greater_than_0((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (numberOfDrivers: ");
		result.append(numberOfDrivers);
		result.append(')');
		return result.toString();
	}

} //StorageImpl
