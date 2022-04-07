/**
 */
package model4datactrackprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Lifeline;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller CP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.ControllerCP#getBase_Lifeline <em>Base Lifeline</em>}</li>
 *   <li>{@link model4datactrackprofile.ControllerCP#getResourceAllocationPolicy <em>Resource Allocation Policy</em>}</li>
 *   <li>{@link model4datactrackprofile.ControllerCP#getIdProvider <em>Id Provider</em>}</li>
 *   <li>{@link model4datactrackprofile.ControllerCP#getSla <em>Sla</em>}</li>
 *   <li>{@link model4datactrackprofile.ControllerCP#getAccesslog <em>Accesslog</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getControllerCP()
 * @model
 * @generated
 */
public interface ControllerCP extends EObject {
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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getControllerCP_Base_Lifeline()
	 * @model ordered="false"
	 * @generated
	 */
	Lifeline getBase_Lifeline();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.ControllerCP#getBase_Lifeline <em>Base Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Lifeline</em>' reference.
	 * @see #getBase_Lifeline()
	 * @generated
	 */
	void setBase_Lifeline(Lifeline value);

	/**
	 * Returns the value of the '<em><b>Resource Allocation Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Allocation Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Allocation Policy</em>' attribute.
	 * @see #setResourceAllocationPolicy(String)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getControllerCP_ResourceAllocationPolicy()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getResourceAllocationPolicy();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.ControllerCP#getResourceAllocationPolicy <em>Resource Allocation Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Allocation Policy</em>' attribute.
	 * @see #getResourceAllocationPolicy()
	 * @generated
	 */
	void setResourceAllocationPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Id Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Provider</em>' attribute.
	 * @see #setIdProvider(String)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getControllerCP_IdProvider()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getIdProvider();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.ControllerCP#getIdProvider <em>Id Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Provider</em>' attribute.
	 * @see #getIdProvider()
	 * @generated
	 */
	void setIdProvider(String value);

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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getControllerCP_Sla()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<SLA> getSla();

	/**
	 * Returns the value of the '<em><b>Accesslog</b></em>' reference list.
	 * The list contents are of type {@link model4datactrackprofile.AccessLog}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accesslog</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesslog</em>' reference list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getControllerCP_Accesslog()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<AccessLog> getAccesslog();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.accesslog->forAll(log | self.sla->exists(sla | log.newLocation.sla->includes(sla)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean newLocation_machine_not_under_sla_with_controller(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.accesslog->forAll(log | self.sla->exists(sla | log.location1.sla->includes(sla)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean location1_machine_not_under_sla_with_controller(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ControllerCP
