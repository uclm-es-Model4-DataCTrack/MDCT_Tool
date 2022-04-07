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
 * A representation of the model object '<em><b>write Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.writeData#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link model4datactrackprofile.writeData#getNewData <em>New Data</em>}</li>
 *   <li>{@link model4datactrackprofile.writeData#getMaxTime <em>Max Time</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getwriteData()
 * @model
 * @generated
 */
public interface writeData extends EObject {
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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getwriteData_Base_Message()
	 * @model ordered="false"
	 * @generated
	 */
	Message getBase_Message();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.writeData#getBase_Message <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Message</em>' reference.
	 * @see #getBase_Message()
	 * @generated
	 */
	void setBase_Message(Message value);

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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getwriteData_NewData()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<DataField> getNewData();

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' containment reference.
	 * @see #setMaxTime(Time)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getwriteData_MaxTime()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Time getMaxTime();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.writeData#getMaxTime <em>Max Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' containment reference.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(Time value);

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
	boolean no_empty_write_fields(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.maxTime.unit=TimeUnit::days or
	 * self.maxTime.unit=TimeUnit::h or
	 * self.maxTime.unit=TimeUnit::min
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean writeData_timeunit_not_days_or_hours_or_minutes(DiagnosticChain diagnostics, Map<Object, Object> context);

} // writeData
