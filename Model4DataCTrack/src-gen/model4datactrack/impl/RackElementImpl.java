/**
 */
package Model4DataCtrack.impl;

import Model4DataCtrack.Model4DataCtrackPackage;
import Model4DataCtrack.Rack;
import Model4DataCtrack.RackElement;

import Model4DataCtrack.util.Model4DataCtrackValidator;

import java.lang.reflect.InvocationTargetException;

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

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rack Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.impl.RackElementImpl#getNumberOfRacks <em>Number Of Racks</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.RackElementImpl#getRackType <em>Rack Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RackElementImpl extends MinimalEObjectImpl.Container implements RackElement {
	/**
	 * The default value of the '{@link #getNumberOfRacks() <em>Number Of Racks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRacks()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_RACKS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRacks() <em>Number Of Racks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRacks()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRacks = NUMBER_OF_RACKS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRackType() <em>Rack Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRackType()
	 * @generated
	 * @ordered
	 */
	protected Rack rackType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RackElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4DataCtrackPackage.Literals.RACK_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfRacks() {
		return numberOfRacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRacks(int newNumberOfRacks) {
		int oldNumberOfRacks = numberOfRacks;
		numberOfRacks = newNumberOfRacks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.RACK_ELEMENT__NUMBER_OF_RACKS, oldNumberOfRacks, numberOfRacks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rack getRackType() {
		if (rackType != null && rackType.eIsProxy()) {
			InternalEObject oldRackType = (InternalEObject)rackType;
			rackType = (Rack)eResolveProxy(oldRackType);
			if (rackType != oldRackType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.RACK_ELEMENT__RACK_TYPE, oldRackType, rackType));
			}
		}
		return rackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rack basicGetRackType() {
		return rackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRackType(Rack newRackType) {
		Rack oldRackType = rackType;
		rackType = newRackType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.RACK_ELEMENT__RACK_TYPE, oldRackType, rackType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean no_empty_datacenters(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Model4DataCtrackValidator.RACK_ELEMENT__NO_EMPTY_DATACENTERS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "no_empty_datacenters", EObjectValidator.getObjectLabel(this, context) }),
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
			case Model4DataCtrackPackage.RACK_ELEMENT__NUMBER_OF_RACKS:
				return getNumberOfRacks();
			case Model4DataCtrackPackage.RACK_ELEMENT__RACK_TYPE:
				if (resolve) return getRackType();
				return basicGetRackType();
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
			case Model4DataCtrackPackage.RACK_ELEMENT__NUMBER_OF_RACKS:
				setNumberOfRacks((Integer)newValue);
				return;
			case Model4DataCtrackPackage.RACK_ELEMENT__RACK_TYPE:
				setRackType((Rack)newValue);
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
			case Model4DataCtrackPackage.RACK_ELEMENT__NUMBER_OF_RACKS:
				setNumberOfRacks(NUMBER_OF_RACKS_EDEFAULT);
				return;
			case Model4DataCtrackPackage.RACK_ELEMENT__RACK_TYPE:
				setRackType((Rack)null);
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
			case Model4DataCtrackPackage.RACK_ELEMENT__NUMBER_OF_RACKS:
				return numberOfRacks != NUMBER_OF_RACKS_EDEFAULT;
			case Model4DataCtrackPackage.RACK_ELEMENT__RACK_TYPE:
				return rackType != null;
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
			case Model4DataCtrackPackage.RACK_ELEMENT___NO_EMPTY_DATACENTERS__DIAGNOSTICCHAIN_MAP:
				return no_empty_datacenters((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (numberOfRacks: ");
		result.append(numberOfRacks);
		result.append(')');
		return result.toString();
	}

} //RackElementImpl
