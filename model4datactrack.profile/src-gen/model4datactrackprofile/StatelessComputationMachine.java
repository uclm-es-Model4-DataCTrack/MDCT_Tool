/**
 */
package model4datactrackprofile;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stateless Computation Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.StatelessComputationMachine#getApplications <em>Applications</em>}</li>
 *   <li>{@link model4datactrackprofile.StatelessComputationMachine#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getStatelessComputationMachine()
 * @model abstract="true"
 * @generated
 */
public interface StatelessComputationMachine extends Machine {
	/**
	 * Returns the value of the '<em><b>Applications</b></em>' reference list.
	 * The list contents are of type {@link model4datactrackprofile.StatelessAppCTP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' reference list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getStatelessComputationMachine_Applications()
	 * @model ordered="false"
	 * @generated
	 */
	EList<StatelessAppCTP> getApplications();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getStatelessComputationMachine_Purpose()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.StatelessComputationMachine#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

} // StatelessComputationMachine
