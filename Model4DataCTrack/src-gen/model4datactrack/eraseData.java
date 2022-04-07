/**
 */
package Model4DataCtrack;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>erase Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.eraseData#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link Model4DataCtrack.eraseData#getData <em>Data</em>}</li>
 *   <li>{@link Model4DataCtrack.eraseData#getMachines <em>Machines</em>}</li>
 * </ul>
 *
 * @see Model4DataCtrack.Model4DataCtrackPackage#geteraseData()
 * @model
 * @generated
 */
public interface eraseData extends EObject {
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
	 * @see Model4DataCtrack.Model4DataCtrackPackage#geteraseData_Base_Message()
	 * @model ordered="false"
	 * @generated
	 */
	Message getBase_Message();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.eraseData#getBase_Message <em>Base Message</em>}' reference.
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
	 * @see Model4DataCtrack.Model4DataCtrackPackage#geteraseData_Data()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.eraseData#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

	/**
	 * Returns the value of the '<em><b>Machines</b></em>' reference list.
	 * The list contents are of type {@link Model4DataCtrack.SSMProcessor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machines</em>' reference list.
	 * @see Model4DataCtrack.Model4DataCtrackPackage#geteraseData_Machines()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<SSMProcessor> getMachines();

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
	boolean machine_contains_data_to_erase(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean eraseData_destination_machines_comply_with_GDPR(DiagnosticChain diagnostics, Map<Object, Object> context);

} // eraseData
