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
 * A representation of the model object '<em><b>new Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.newData#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link model4datactrackprofile.newData#getData <em>Data</em>}</li>
 *   <li>{@link model4datactrackprofile.newData#getMachines <em>Machines</em>}</li>
 *   <li>{@link model4datactrackprofile.newData#getNewData <em>New Data</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getnewData()
 * @model
 * @generated
 */
public interface newData extends EObject {
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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getnewData_Base_Message()
	 * @model ordered="false"
	 * @generated
	 */
	Message getBase_Message();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.newData#getBase_Message <em>Base Message</em>}' reference.
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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getnewData_Data()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.newData#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

	/**
	 * Returns the value of the '<em><b>Machines</b></em>' reference list.
	 * The list contents are of type {@link model4datactrackprofile.SSMProcessor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machines</em>' reference list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getnewData_Machines()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<SSMProcessor> getMachines();

	/**
	 * Returns the value of the '<em><b>New Data</b></em>' containment reference list.
	 * The list contents are of type {@link model4datactrackprofile.DataField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Data</em>' containment reference list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getnewData_NewData()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<DataField> getNewData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.newData->forAll(f | f.value.size()>0)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean no_empty_newData_fields(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean machine_contains_data_to_rectify(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean newData_destination_machines_comply_with_GDPR(DiagnosticChain diagnostics, Map<Object, Object> context);

} // newData
