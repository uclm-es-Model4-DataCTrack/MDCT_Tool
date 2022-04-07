/**
 */
package model4datactrackprofile.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import model4datactrackprofile.Model4datactrackprofilePackage;
import model4datactrackprofile.SLA;
import model4datactrackprofile.SSMProcessor;

import model4datactrackprofile.util.Model4datactrackprofileValidator;

import org.eclipse.emf.common.notify.Notification;

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

import org.eclipse.uml2.uml.Lifeline;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SSM Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.impl.SSMProcessorImpl#getBase_Lifeline <em>Base Lifeline</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.SSMProcessorImpl#getSla <em>Sla</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.SSMProcessorImpl#isGDPRCompliance <em>GDPR Compliance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SSMProcessorImpl extends MachineImpl implements SSMProcessor {
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
	 * The cached value of the '{@link #getSla() <em>Sla</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSla()
	 * @generated
	 * @ordered
	 */
	protected EList<SLA> sla;

	/**
	 * The default value of the '{@link #isGDPRCompliance() <em>GDPR Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGDPRCompliance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GDPR_COMPLIANCE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGDPRCompliance() <em>GDPR Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGDPRCompliance()
	 * @generated
	 * @ordered
	 */
	protected boolean gdprCompliance = GDPR_COMPLIANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SSMProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4datactrackprofilePackage.Literals.SSM_PROCESSOR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.SSM_PROCESSOR__BASE_LIFELINE, oldBase_Lifeline, base_Lifeline));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.SSM_PROCESSOR__BASE_LIFELINE, oldBase_Lifeline, base_Lifeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SLA> getSla() {
		if (sla == null) {
			sla = new EObjectResolvingEList<SLA>(SLA.class, this, Model4datactrackprofilePackage.SSM_PROCESSOR__SLA);
		}
		return sla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGDPRCompliance() {
		return gdprCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDPRCompliance(boolean newGDPRCompliance) {
		boolean oldGDPRCompliance = gdprCompliance;
		gdprCompliance = newGDPRCompliance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.SSM_PROCESSOR__GDPR_COMPLIANCE, oldGDPRCompliance, gdprCompliance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SSMProccessor_complies_GDPR(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Model4datactrackprofileValidator.SSM_PROCESSOR__SSM_PROCCESSOR_COMPLIES_GDPR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SSMProccessor_complies_GDPR", EObjectValidator.getObjectLabel(this, context) }),
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
			case Model4datactrackprofilePackage.SSM_PROCESSOR__BASE_LIFELINE:
				if (resolve) return getBase_Lifeline();
				return basicGetBase_Lifeline();
			case Model4datactrackprofilePackage.SSM_PROCESSOR__SLA:
				return getSla();
			case Model4datactrackprofilePackage.SSM_PROCESSOR__GDPR_COMPLIANCE:
				return isGDPRCompliance();
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
			case Model4datactrackprofilePackage.SSM_PROCESSOR__BASE_LIFELINE:
				setBase_Lifeline((Lifeline)newValue);
				return;
			case Model4datactrackprofilePackage.SSM_PROCESSOR__SLA:
				getSla().clear();
				getSla().addAll((Collection<? extends SLA>)newValue);
				return;
			case Model4datactrackprofilePackage.SSM_PROCESSOR__GDPR_COMPLIANCE:
				setGDPRCompliance((Boolean)newValue);
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
			case Model4datactrackprofilePackage.SSM_PROCESSOR__BASE_LIFELINE:
				setBase_Lifeline((Lifeline)null);
				return;
			case Model4datactrackprofilePackage.SSM_PROCESSOR__SLA:
				getSla().clear();
				return;
			case Model4datactrackprofilePackage.SSM_PROCESSOR__GDPR_COMPLIANCE:
				setGDPRCompliance(GDPR_COMPLIANCE_EDEFAULT);
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
			case Model4datactrackprofilePackage.SSM_PROCESSOR__BASE_LIFELINE:
				return base_Lifeline != null;
			case Model4datactrackprofilePackage.SSM_PROCESSOR__SLA:
				return sla != null && !sla.isEmpty();
			case Model4datactrackprofilePackage.SSM_PROCESSOR__GDPR_COMPLIANCE:
				return gdprCompliance != GDPR_COMPLIANCE_EDEFAULT;
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
			case Model4datactrackprofilePackage.SSM_PROCESSOR___SSM_PROCCESSOR_COMPLIES_GDPR__DIAGNOSTICCHAIN_MAP:
				return SSMProccessor_complies_GDPR((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (GDPRCompliance: ");
		result.append(gdprCompliance);
		result.append(')');
		return result.toString();
	}

} //SSMProcessorImpl
