/**
 */
package Model4DataCtrack;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.Infrastructure#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link Model4DataCtrack.Infrastructure#getNetwork <em>Network</em>}</li>
 *   <li>{@link Model4DataCtrack.Infrastructure#getCloudProvider <em>Cloud Provider</em>}</li>
 *   <li>{@link Model4DataCtrack.Infrastructure#getDatacenterelements <em>Datacenterelements</em>}</li>
 * </ul>
 *
 * @see Model4DataCtrack.Model4DataCtrackPackage#getInfrastructure()
 * @model
 * @generated
 */
public interface Infrastructure extends EObject {
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
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getInfrastructure_Base_Component()
	 * @model ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.Infrastructure#getBase_Component <em>Base Component</em>}' reference.
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
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getInfrastructure_Network()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Bandwidth getNetwork();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.Infrastructure#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Bandwidth value);

	/**
	 * Returns the value of the '<em><b>Cloud Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Provider</em>' reference.
	 * @see #setCloudProvider(ControllerCP)
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getInfrastructure_CloudProvider()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ControllerCP getCloudProvider();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.Infrastructure#getCloudProvider <em>Cloud Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Provider</em>' reference.
	 * @see #getCloudProvider()
	 * @generated
	 */
	void setCloudProvider(ControllerCP value);

	/**
	 * Returns the value of the '<em><b>Datacenterelements</b></em>' containment reference list.
	 * The list contents are of type {@link Model4DataCtrack.DataCenterElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datacenterelements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datacenterelements</em>' containment reference list.
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getInfrastructure_Datacenterelements()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<DataCenterElement> getDatacenterelements();

} // Infrastructure
