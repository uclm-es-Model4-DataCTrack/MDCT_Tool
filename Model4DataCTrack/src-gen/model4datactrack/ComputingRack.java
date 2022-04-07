/**
 */
package Model4DataCtrack;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing Rack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.ComputingRack#getMachineType <em>Machine Type</em>}</li>
 * </ul>
 *
 * @see Model4DataCtrack.Model4DataCtrackPackage#getComputingRack()
 * @model
 * @generated
 */
public interface ComputingRack extends Rack {
	/**
	 * Returns the value of the '<em><b>Machine Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Type</em>' reference.
	 * @see #setMachineType(StatelessComputationMachine)
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getComputingRack_MachineType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StatelessComputationMachine getMachineType();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.ComputingRack#getMachineType <em>Machine Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine Type</em>' reference.
	 * @see #getMachineType()
	 * @generated
	 */
	void setMachineType(StatelessComputationMachine value);

} // ComputingRack
