/**
 */
package model4datactrackprofile.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import model4datactrackprofile.DataCenter;
import model4datactrackprofile.DataCenterElement;
import model4datactrackprofile.Model4datactrackprofilePackage;

import model4datactrackprofile.util.Model4datactrackprofileValidator;

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

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Center Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.impl.DataCenterElementImpl#getNumberOfDataCenters <em>Number Of Data Centers</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.DataCenterElementImpl#getDataCenterType <em>Data Center Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataCenterElementImpl extends MinimalEObjectImpl.Container implements DataCenterElement {
	/**
	 * The default value of the '{@link #getNumberOfDataCenters() <em>Number Of Data Centers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDataCenters()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_DATA_CENTERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfDataCenters() <em>Number Of Data Centers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDataCenters()
	 * @generated
	 * @ordered
	 */
	protected int numberOfDataCenters = NUMBER_OF_DATA_CENTERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataCenterType() <em>Data Center Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCenterType()
	 * @generated
	 * @ordered
	 */
	protected DataCenter dataCenterType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCenterElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4datactrackprofilePackage.Literals.DATA_CENTER_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfDataCenters() {
		return numberOfDataCenters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfDataCenters(int newNumberOfDataCenters) {
		int oldNumberOfDataCenters = numberOfDataCenters;
		numberOfDataCenters = newNumberOfDataCenters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.DATA_CENTER_ELEMENT__NUMBER_OF_DATA_CENTERS, oldNumberOfDataCenters, numberOfDataCenters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCenter getDataCenterType() {
		if (dataCenterType != null && dataCenterType.eIsProxy()) {
			InternalEObject oldDataCenterType = (InternalEObject)dataCenterType;
			dataCenterType = (DataCenter)eResolveProxy(oldDataCenterType);
			if (dataCenterType != oldDataCenterType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.DATA_CENTER_ELEMENT__DATA_CENTER_TYPE, oldDataCenterType, dataCenterType));
			}
		}
		return dataCenterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCenter basicGetDataCenterType() {
		return dataCenterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataCenterType(DataCenter newDataCenterType) {
		DataCenter oldDataCenterType = dataCenterType;
		dataCenterType = newDataCenterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.DATA_CENTER_ELEMENT__DATA_CENTER_TYPE, oldDataCenterType, dataCenterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean no_empty_infra(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Model4datactrackprofileValidator.DATA_CENTER_ELEMENT__NO_EMPTY_INFRA,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "no_empty_infra", EObjectValidator.getObjectLabel(this, context) }),
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
			case Model4datactrackprofilePackage.DATA_CENTER_ELEMENT__NUMBER_OF_DATA_CENTERS:
				return getNumberOfDataCenters();
			case Model4datactrackprofilePackage.DATA_CENTER_ELEMENT__DATA_CENTER_TYPE:
				if (resolve) return getDataCenterType();
				return basicGetDataCenterType();
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
			case Model4datactrackprofilePackage.DATA_CENTER_ELEMENT__NUMBER_OF_DATA_CENTERS:
				setNumberOfDataCenters((Integer)newValue);
				return;
			case Model4datactrackprofilePackage.DATA_CENTER_ELEMENT__DATA_CENTER_TYPE:
				setDataCenterType((DataCenter)newValue);
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
			case Model4datactrackprofilePackage.DATA_CENTER_ELEMENT__NUMBER_OF_DATA_CENTERS:
				setNumberOfDataCenters(NUMBER_OF_DATA_CENTERS_EDEFAULT);
				return;
			case Model4datactrackprofilePackage.DATA_CENTER_ELEMENT__DATA_CENTER_TYPE:
				setDataCenterType((DataCenter)null);
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
			case Model4datactrackprofilePackage.DATA_CENTER_ELEMENT__NUMBER_OF_DATA_CENTERS:
				return numberOfDataCenters != NUMBER_OF_DATA_CENTERS_EDEFAULT;
			case Model4datactrackprofilePackage.DATA_CENTER_ELEMENT__DATA_CENTER_TYPE:
				return dataCenterType != null;
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
			case Model4datactrackprofilePackage.DATA_CENTER_ELEMENT___NO_EMPTY_INFRA__DIAGNOSTICCHAIN_MAP:
				return no_empty_infra((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (numberOfDataCenters: ");
		result.append(numberOfDataCenters);
		result.append(')');
		return result.toString();
	}

} //DataCenterElementImpl
