/**
 */
package model4datactrackprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.Memory#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link model4datactrackprofile.Memory#getLatency <em>Latency</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getMemory()
 * @model
 * @generated
 */
public interface Memory extends Hardware {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' containment reference.
	 * @see #setCapacity(Size)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getMemory_Capacity()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Size getCapacity();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.Memory#getCapacity <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' containment reference.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(Size value);

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' containment reference.
	 * @see #setLatency(Latency)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getMemory_Latency()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Latency getLatency();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.Memory#getLatency <em>Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' containment reference.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(Latency value);

} // Memory
