/**
 */
package model4datactrackprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Center</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.DataCenter#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link model4datactrackprofile.DataCenter#getNetwork <em>Network</em>}</li>
 *   <li>{@link model4datactrackprofile.DataCenter#getRack <em>Rack</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getDataCenter()
 * @model
 * @generated
 */
public interface DataCenter extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(Component)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getDataCenter_Base_Component()
	 * @model ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.DataCenter#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference.
	 * @see #setNetwork(Bandwidth)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getDataCenter_Network()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Bandwidth getNetwork();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.DataCenter#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Bandwidth value);

	/**
	 * Returns the value of the '<em><b>Rack</b></em>' containment reference list.
	 * The list contents are of type {@link model4datactrackprofile.RackElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rack</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rack</em>' containment reference list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getDataCenter_Rack()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<RackElement> getRack();

} // DataCenter
