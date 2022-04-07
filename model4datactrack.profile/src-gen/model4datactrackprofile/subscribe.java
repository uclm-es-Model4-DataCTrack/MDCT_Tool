/**
 */
package model4datactrackprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>subscribe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.subscribe#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link model4datactrackprofile.subscribe#getData <em>Data</em>}</li>
 *   <li>{@link model4datactrackprofile.subscribe#getMachines <em>Machines</em>}</li>
 *   <li>{@link model4datactrackprofile.subscribe#getBreaches <em>Breaches</em>}</li>
 *   <li>{@link model4datactrackprofile.subscribe#getMaxSubscriptionTime <em>Max Subscription Time</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getsubscribe()
 * @model
 * @generated
 */
public interface subscribe extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Message</em>' reference.
	 * @see #setBase_Message(Message)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getsubscribe_Base_Message()
	 * @model ordered="false"
	 * @generated
	 */
	Message getBase_Message();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.subscribe#getBase_Message <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Message</em>' reference.
	 * @see #getBase_Message()
	 * @generated
	 */
	void setBase_Message(Message value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Data)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getsubscribe_Data()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.subscribe#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

	/**
	 * Returns the value of the '<em><b>Machines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machines</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machines</em>' reference.
	 * @see #setMachines(SSMProcessor)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getsubscribe_Machines()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SSMProcessor getMachines();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.subscribe#getMachines <em>Machines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machines</em>' reference.
	 * @see #getMachines()
	 * @generated
	 */
	void setMachines(SSMProcessor value);

	/**
	 * Returns the value of the '<em><b>Breaches</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breaches</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breaches</em>' attribute list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getsubscribe_Breaches()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getBreaches();

	/**
	 * Returns the value of the '<em><b>Max Subscription Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Subscription Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Subscription Time</em>' containment reference.
	 * @see #setMaxSubscriptionTime(Time)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getsubscribe_MaxSubscriptionTime()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Time getMaxSubscriptionTime();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.subscribe#getMaxSubscriptionTime <em>Max Subscription Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Subscription Time</em>' containment reference.
	 * @see #getMaxSubscriptionTime()
	 * @generated
	 */
	void setMaxSubscriptionTime(Time value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.maxSubscriptionTime.value>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean maxSubTime_greater_than_0(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.machines->forAll(m | m.storage.data->includes(self.data))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean machine_contains_data_to_subscribe_to(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.machines->forAll(m | m.GDPRCompliance=true)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean subscribe_destination_machines_comply_with_GDPR(DiagnosticChain diagnostics, Map<Object, Object> context);

} // subscribe
