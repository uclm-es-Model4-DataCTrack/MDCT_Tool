/**
 */
package Model4DataCtrack;

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
 *   <li>{@link Model4DataCtrack.StatelessComputationMachine#getApplications <em>Applications</em>}</li>
 *   <li>{@link Model4DataCtrack.StatelessComputationMachine#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @see Model4DataCtrack.Model4DataCtrackPackage#getStatelessComputationMachine()
 * @model abstract="true"
 * @generated
 */
public interface StatelessComputationMachine extends Machine {
	/**
	 * Returns the value of the '<em><b>Applications</b></em>' reference list.
	 * The list contents are of type {@link Model4DataCtrack.StatelessAppCTP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' reference list.
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getStatelessComputationMachine_Applications()
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
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getStatelessComputationMachine_Purpose()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.StatelessComputationMachine#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

} // StatelessComputationMachine
