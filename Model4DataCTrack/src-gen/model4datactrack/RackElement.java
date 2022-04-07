/**
 */
package Model4DataCtrack;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rack Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.RackElement#getNumberOfRacks <em>Number Of Racks</em>}</li>
 *   <li>{@link Model4DataCtrack.RackElement#getRackType <em>Rack Type</em>}</li>
 * </ul>
 *
 * @see Model4DataCtrack.Model4DataCtrackPackage#getRackElement()
 * @model
 * @generated
 */
public interface RackElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Racks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Racks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Racks</em>' attribute.
	 * @see #setNumberOfRacks(int)
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getRackElement_NumberOfRacks()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfRacks();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.RackElement#getNumberOfRacks <em>Number Of Racks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Racks</em>' attribute.
	 * @see #getNumberOfRacks()
	 * @generated
	 */
	void setNumberOfRacks(int value);

	/**
	 * Returns the value of the '<em><b>Rack Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rack Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rack Type</em>' reference.
	 * @see #setRackType(Rack)
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getRackElement_RackType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Rack getRackType();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.RackElement#getRackType <em>Rack Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rack Type</em>' reference.
	 * @see #getRackType()
	 * @generated
	 */
	void setRackType(Rack value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.numberOfRacks>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean no_empty_datacenters(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RackElement
