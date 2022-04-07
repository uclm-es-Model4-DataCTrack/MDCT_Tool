/**
 */
package model4datactrackprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Lifeline;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SSM Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.SSMProcessor#getBase_Lifeline <em>Base Lifeline</em>}</li>
 *   <li>{@link model4datactrackprofile.SSMProcessor#getSla <em>Sla</em>}</li>
 *   <li>{@link model4datactrackprofile.SSMProcessor#isGDPRCompliance <em>GDPR Compliance</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getSSMProcessor()
 * @model
 * @generated
 */
public interface SSMProcessor extends Machine {
	/**
	 * Returns the value of the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Lifeline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Lifeline</em>' reference.
	 * @see #setBase_Lifeline(Lifeline)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getSSMProcessor_Base_Lifeline()
	 * @model ordered="false"
	 * @generated
	 */
	Lifeline getBase_Lifeline();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.SSMProcessor#getBase_Lifeline <em>Base Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Lifeline</em>' reference.
	 * @see #getBase_Lifeline()
	 * @generated
	 */
	void setBase_Lifeline(Lifeline value);

	/**
	 * Returns the value of the '<em><b>Sla</b></em>' reference list.
	 * The list contents are of type {@link model4datactrackprofile.SLA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sla</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sla</em>' reference list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getSSMProcessor_Sla()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<SLA> getSla();

	/**
	 * Returns the value of the '<em><b>GDPR Compliance</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GDPR Compliance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GDPR Compliance</em>' attribute.
	 * @see #setGDPRCompliance(boolean)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getSSMProcessor_GDPRCompliance()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isGDPRCompliance();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.SSMProcessor#isGDPRCompliance <em>GDPR Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GDPR Compliance</em>' attribute.
	 * @see #isGDPRCompliance()
	 * @generated
	 */
	void setGDPRCompliance(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.GDPRCompliance=true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean SSMProccessor_complies_GDPR(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SSMProcessor
