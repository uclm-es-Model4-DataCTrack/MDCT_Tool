/**
 */
package Model4DataCtrack;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>send Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.sendData#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link Model4DataCtrack.sendData#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link Model4DataCtrack.sendData#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see Model4DataCtrack.Model4DataCtrackPackage#getsendData()
 * @model
 * @generated
 */
public interface sendData extends EObject {
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
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getsendData_Base_Message()
	 * @model ordered="false"
	 * @generated
	 */
	Message getBase_Message();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.sendData#getBase_Message <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Message</em>' reference.
	 * @see #getBase_Message()
	 * @generated
	 */
	void setBase_Message(Message value);

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
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getsendData_MaxTime()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Time getMaxTime();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.sendData#getMaxTime <em>Max Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' containment reference.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(Time value);

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
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getsendData_Data()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.sendData#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

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
	boolean sendData_timeunit_not_days_or_hours_or_minutes(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.maxTime.value>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean sendData_maxTime_value_greater_than_0(DiagnosticChain diagnostics, Map<Object, Object> context);

} // sendData
