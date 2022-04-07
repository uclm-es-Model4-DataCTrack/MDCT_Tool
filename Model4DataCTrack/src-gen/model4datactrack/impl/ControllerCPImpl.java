/**
 */
package Model4DataCtrack.impl;

import Model4DataCtrack.AccessLog;
import Model4DataCtrack.ControllerCP;
import Model4DataCtrack.Model4DataCtrackPackage;
import Model4DataCtrack.SLA;

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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.Lifeline;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller CP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.impl.ControllerCPImpl#getBase_Lifeline <em>Base Lifeline</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.ControllerCPImpl#getResourceAllocationPolicy <em>Resource Allocation Policy</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.ControllerCPImpl#getIdProvider <em>Id Provider</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.ControllerCPImpl#getSla <em>Sla</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.ControllerCPImpl#getAccesslog <em>Accesslog</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerCPImpl extends MinimalEObjectImpl.Container implements ControllerCP {
	/**
	 * The cached value of the '{@link #getBase_Lifeline() <em>Base Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Lifeline()
	 * @generated
	 * @ordered
	 */
	protected Lifeline base_Lifeline;

	/**
	 * The default value of the '{@link #getResourceAllocationPolicy() <em>Resource Allocation Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAllocationPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_ALLOCATION_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceAllocationPolicy() <em>Resource Allocation Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAllocationPolicy()
	 * @generated
	 * @ordered
	 */
	protected String resourceAllocationPolicy = RESOURCE_ALLOCATION_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdProvider() <em>Id Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdProvider() <em>Id Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdProvider()
	 * @generated
	 * @ordered
	 */
	protected String idProvider = ID_PROVIDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSla() <em>Sla</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSla()
	 * @generated
	 * @ordered
	 */
	protected EList<SLA> sla;

	/**
	 * The cached value of the '{@link #getAccesslog() <em>Accesslog</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesslog()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessLog> accesslog;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerCPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4DataCtrackPackage.Literals.CONTROLLER_CP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getBase_Lifeline() {
		if (base_Lifeline != null && base_Lifeline.eIsProxy()) {
			InternalEObject oldBase_Lifeline = (InternalEObject)base_Lifeline;
			base_Lifeline = (Lifeline)eResolveProxy(oldBase_Lifeline);
			if (base_Lifeline != oldBase_Lifeline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.CONTROLLER_CP__BASE_LIFELINE, oldBase_Lifeline, base_Lifeline));
			}
		}
		return base_Lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline basicGetBase_Lifeline() {
		return base_Lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Lifeline(Lifeline newBase_Lifeline) {
		Lifeline oldBase_Lifeline = base_Lifeline;
		base_Lifeline = newBase_Lifeline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.CONTROLLER_CP__BASE_LIFELINE, oldBase_Lifeline, base_Lifeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceAllocationPolicy() {
		return resourceAllocationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceAllocationPolicy(String newResourceAllocationPolicy) {
		String oldResourceAllocationPolicy = resourceAllocationPolicy;
		resourceAllocationPolicy = newResourceAllocationPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.CONTROLLER_CP__RESOURCE_ALLOCATION_POLICY, oldResourceAllocationPolicy, resourceAllocationPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdProvider() {
		return idProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdProvider(String newIdProvider) {
		String oldIdProvider = idProvider;
		idProvider = newIdProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.CONTROLLER_CP__ID_PROVIDER, oldIdProvider, idProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SLA> getSla() {
		if (sla == null) {
			sla = new EObjectResolvingEList<SLA>(SLA.class, this, Model4DataCtrackPackage.CONTROLLER_CP__SLA);
		}
		return sla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccessLog> getAccesslog() {
		if (accesslog == null) {
			accesslog = new EObjectResolvingEList<AccessLog>(AccessLog.class, this, Model4DataCtrackPackage.CONTROLLER_CP__ACCESSLOG);
		}
		return accesslog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean newLocation_machine_not_under_sla_with_controller(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Model4DataCtrackValidator.CONTROLLER_CP__NEW_LOCATION_MACHINE_NOT_UNDER_SLA_WITH_CONTROLLER,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "newLocation_machine_not_under_sla_with_controller", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean location1_machine_not_under_sla_with_controller(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Model4DataCtrackValidator.CONTROLLER_CP__LOCATION1_MACHINE_NOT_UNDER_SLA_WITH_CONTROLLER,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "location1_machine_not_under_sla_with_controller", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean sourceMachine_not_under_sla_with_controller(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Model4DataCtrackValidator.CONTROLLER_CP__SOURCE_MACHINE_NOT_UNDER_SLA_WITH_CONTROLLER,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "sourceMachine_not_under_sla_with_controller", EObjectValidator.getObjectLabel(this, context) }),
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
			case Model4DataCtrackPackage.CONTROLLER_CP__BASE_LIFELINE:
				if (resolve) return getBase_Lifeline();
				return basicGetBase_Lifeline();
			case Model4DataCtrackPackage.CONTROLLER_CP__RESOURCE_ALLOCATION_POLICY:
				return getResourceAllocationPolicy();
			case Model4DataCtrackPackage.CONTROLLER_CP__ID_PROVIDER:
				return getIdProvider();
			case Model4DataCtrackPackage.CONTROLLER_CP__SLA:
				return getSla();
			case Model4DataCtrackPackage.CONTROLLER_CP__ACCESSLOG:
				return getAccesslog();
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
			case Model4DataCtrackPackage.CONTROLLER_CP__BASE_LIFELINE:
				setBase_Lifeline((Lifeline)newValue);
				return;
			case Model4DataCtrackPackage.CONTROLLER_CP__RESOURCE_ALLOCATION_POLICY:
				setResourceAllocationPolicy((String)newValue);
				return;
			case Model4DataCtrackPackage.CONTROLLER_CP__ID_PROVIDER:
				setIdProvider((String)newValue);
				return;
			case Model4DataCtrackPackage.CONTROLLER_CP__SLA:
				getSla().clear();
				getSla().addAll((Collection<? extends SLA>)newValue);
				return;
			case Model4DataCtrackPackage.CONTROLLER_CP__ACCESSLOG:
				getAccesslog().clear();
				getAccesslog().addAll((Collection<? extends AccessLog>)newValue);
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
			case Model4DataCtrackPackage.CONTROLLER_CP__BASE_LIFELINE:
				setBase_Lifeline((Lifeline)null);
				return;
			case Model4DataCtrackPackage.CONTROLLER_CP__RESOURCE_ALLOCATION_POLICY:
				setResourceAllocationPolicy(RESOURCE_ALLOCATION_POLICY_EDEFAULT);
				return;
			case Model4DataCtrackPackage.CONTROLLER_CP__ID_PROVIDER:
				setIdProvider(ID_PROVIDER_EDEFAULT);
				return;
			case Model4DataCtrackPackage.CONTROLLER_CP__SLA:
				getSla().clear();
				return;
			case Model4DataCtrackPackage.CONTROLLER_CP__ACCESSLOG:
				getAccesslog().clear();
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
			case Model4DataCtrackPackage.CONTROLLER_CP__BASE_LIFELINE:
				return base_Lifeline != null;
			case Model4DataCtrackPackage.CONTROLLER_CP__RESOURCE_ALLOCATION_POLICY:
				return RESOURCE_ALLOCATION_POLICY_EDEFAULT == null ? resourceAllocationPolicy != null : !RESOURCE_ALLOCATION_POLICY_EDEFAULT.equals(resourceAllocationPolicy);
			case Model4DataCtrackPackage.CONTROLLER_CP__ID_PROVIDER:
				return ID_PROVIDER_EDEFAULT == null ? idProvider != null : !ID_PROVIDER_EDEFAULT.equals(idProvider);
			case Model4DataCtrackPackage.CONTROLLER_CP__SLA:
				return sla != null && !sla.isEmpty();
			case Model4DataCtrackPackage.CONTROLLER_CP__ACCESSLOG:
				return accesslog != null && !accesslog.isEmpty();
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
			case Model4DataCtrackPackage.CONTROLLER_CP___NEW_LOCATION_MACHINE_NOT_UNDER_SLA_WITH_CONTROLLER__DIAGNOSTICCHAIN_MAP:
				return newLocation_machine_not_under_sla_with_controller((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Model4DataCtrackPackage.CONTROLLER_CP___LOCATION1_MACHINE_NOT_UNDER_SLA_WITH_CONTROLLER__DIAGNOSTICCHAIN_MAP:
				return location1_machine_not_under_sla_with_controller((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Model4DataCtrackPackage.CONTROLLER_CP___SOURCE_MACHINE_NOT_UNDER_SLA_WITH_CONTROLLER__DIAGNOSTICCHAIN_MAP:
				return sourceMachine_not_under_sla_with_controller((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (resourceAllocationPolicy: ");
		result.append(resourceAllocationPolicy);
		result.append(", idProvider: ");
		result.append(idProvider);
		result.append(')');
		return result.toString();
	}

} //ControllerCPImpl
