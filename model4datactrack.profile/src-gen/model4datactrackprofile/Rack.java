/**
 */
package model4datactrackprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.Rack#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link model4datactrackprofile.Rack#getMachinesPerBoard <em>Machines Per Board</em>}</li>
 *   <li>{@link model4datactrackprofile.Rack#getNetwork <em>Network</em>}</li>
 *   <li>{@link model4datactrackprofile.Rack#getBoards <em>Boards</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getRack()
 * @model abstract="true"
 * @generated
 */
public interface Rack extends EObject {
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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getRack_Base_Component()
	 * @model ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.Rack#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

	/**
	 * Returns the value of the '<em><b>Machines Per Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machines Per Board</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machines Per Board</em>' attribute.
	 * @see #setMachinesPerBoard(int)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getRack_MachinesPerBoard()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMachinesPerBoard();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.Rack#getMachinesPerBoard <em>Machines Per Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machines Per Board</em>' attribute.
	 * @see #getMachinesPerBoard()
	 * @generated
	 */
	void setMachinesPerBoard(int value);

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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getRack_Network()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Bandwidth getNetwork();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.Rack#getNetwork <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' containment reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Bandwidth value);

	/**
	 * Returns the value of the '<em><b>Boards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boards</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boards</em>' attribute.
	 * @see #setBoards(int)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getRack_Boards()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getBoards();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.Rack#getBoards <em>Boards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boards</em>' attribute.
	 * @see #getBoards()
	 * @generated
	 */
	void setBoards(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * self.machinesPerBoard>0
	 * and
	 * self.boards>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean no_empty_racks(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Rack
