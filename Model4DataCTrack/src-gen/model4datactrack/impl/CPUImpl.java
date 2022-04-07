/**
 */
package Model4DataCtrack.impl;

import Model4DataCtrack.CPU;
import Model4DataCtrack.Model4DataCtrackPackage;

import Model4DataCtrack.util.Model4DataCtrackValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.impl.CPUImpl#getCores <em>Cores</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.CPUImpl#getFLOPs <em>FLO Ps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CPUImpl extends HardwareImpl implements CPU {
	/**
	 * The default value of the '{@link #getCores() <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected static final int CORES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCores() <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected int cores = CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getFLOPs() <em>FLO Ps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLOPs()
	 * @generated
	 * @ordered
	 */
	protected static final double FLO_PS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFLOPs() <em>FLO Ps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLOPs()
	 * @generated
	 * @ordered
	 */
	protected double floPs = FLO_PS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4DataCtrackPackage.Literals.CPU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCores() {
		return cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCores(int newCores) {
		int oldCores = cores;
		cores = newCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.CPU__CORES, oldCores, cores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFLOPs() {
		return floPs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFLOPs(double newFLOPs) {
		double oldFLOPs = floPs;
		floPs = newFLOPs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.CPU__FLO_PS, oldFLOPs, floPs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean cpu_cores_and_flops_greater_than_0(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Model4DataCtrackValidator.CPU__CPU_CORES_AND_FLOPS_GREATER_THAN_0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "cpu_cores_and_flops_greater_than_0", EObjectValidator.getObjectLabel(this, context) }),
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
			case Model4DataCtrackPackage.CPU__CORES:
				return getCores();
			case Model4DataCtrackPackage.CPU__FLO_PS:
				return getFLOPs();
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
			case Model4DataCtrackPackage.CPU__CORES:
				setCores((Integer)newValue);
				return;
			case Model4DataCtrackPackage.CPU__FLO_PS:
				setFLOPs((Double)newValue);
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
			case Model4DataCtrackPackage.CPU__CORES:
				setCores(CORES_EDEFAULT);
				return;
			case Model4DataCtrackPackage.CPU__FLO_PS:
				setFLOPs(FLO_PS_EDEFAULT);
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
			case Model4DataCtrackPackage.CPU__CORES:
				return cores != CORES_EDEFAULT;
			case Model4DataCtrackPackage.CPU__FLO_PS:
				return floPs != FLO_PS_EDEFAULT;
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
			case Model4DataCtrackPackage.CPU___CPU_CORES_AND_FLOPS_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP:
				return cpu_cores_and_flops_greater_than_0((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (cores: ");
		result.append(cores);
		result.append(", FLOPs: ");
		result.append(floPs);
		result.append(')');
		return result.toString();
	}

} //CPUImpl
