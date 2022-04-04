/**
 */
package Model4DataCtrack;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sticky Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.StickyPolicy#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link Model4DataCtrack.StickyPolicy#getPermission <em>Permission</em>}</li>
 *   <li>{@link Model4DataCtrack.StickyPolicy#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link Model4DataCtrack.StickyPolicy#getOwner <em>Owner</em>}</li>
 *   <li>{@link Model4DataCtrack.StickyPolicy#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link Model4DataCtrack.StickyPolicy#getController <em>Controller</em>}</li>
 *   <li>{@link Model4DataCtrack.StickyPolicy#getAccessHistory <em>Access History</em>}</li>
 * </ul>
 *
 * @see Model4DataCtrack.Model4DataCtrackPackage#getStickyPolicy()
 * @model
 * @generated
 */
public interface StickyPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getStickyPolicy_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.StickyPolicy#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Permission</b></em>' containment reference list.
	 * The list contents are of type {@link Model4DataCtrack.PermissionPerTP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' containment reference list.
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getStickyPolicy_Permission()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<PermissionPerTP> getPermission();

	/**
	 * Returns the value of the '<em><b>Access History</b></em>' containment reference list.
	 * The list contents are of type {@link Model4DataCtrack.AccesPerTP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access History</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access History</em>' containment reference list.
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getStickyPolicy_AccessHistory()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AccesPerTP> getAccessHistory();

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' reference.
	 * @see #setController(ControllerCP)
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getStickyPolicy_Controller()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ControllerCP getController();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.StickyPolicy#getController <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(ControllerCP value);

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
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getStickyPolicy_Base_Component()
	 * @model ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.StickyPolicy#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(PList)
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getStickyPolicy_Owner()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PList getOwner();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.StickyPolicy#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(PList value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute list.
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getStickyPolicy_Purpose()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getPurpose();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.accessHistory->forAll(his | his.purpose->forAll(p | self.purpose->includes(p)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean allowed_access_purpose(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.accessHistory->forAll( his | AccessLog.allInstances()->exists( log | log.tp = his.tp and log.action = his.actionPerformed) )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean all_tps_in_history_given_permissions(DiagnosticChain diagnostics, Map<Object, Object> context);

} // StickyPolicy
