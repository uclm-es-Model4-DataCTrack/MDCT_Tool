/**
 */
package model4datactrackprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.AccessLog#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link model4datactrackprofile.AccessLog#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link model4datactrackprofile.AccessLog#getTp <em>Tp</em>}</li>
 *   <li>{@link model4datactrackprofile.AccessLog#getL1 <em>L1</em>}</li>
 *   <li>{@link model4datactrackprofile.AccessLog#getSp1 <em>Sp1</em>}</li>
 *   <li>{@link model4datactrackprofile.AccessLog#getO <em>O</em>}</li>
 *   <li>{@link model4datactrackprofile.AccessLog#getAction <em>Action</em>}</li>
 *   <li>{@link model4datactrackprofile.AccessLog#getNl <em>Nl</em>}</li>
 *   <li>{@link model4datactrackprofile.AccessLog#getNsp <em>Nsp</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getAccessLog()
 * @model
 * @generated
 */
public interface AccessLog extends EObject {
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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getAccessLog_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.AccessLog#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getAccessLog_Base_Component()
	 * @model ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.AccessLog#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

	/**
	 * Returns the value of the '<em><b>Tp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tp</em>' reference.
	 * @see #setTp(StatelessAppCTP)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getAccessLog_Tp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StatelessAppCTP getTp();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.AccessLog#getTp <em>Tp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tp</em>' reference.
	 * @see #getTp()
	 * @generated
	 */
	void setTp(StatelessAppCTP value);

	/**
	 * Returns the value of the '<em><b>L1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>L1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L1</em>' reference.
	 * @see #setL1(Storage)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getAccessLog_L1()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Storage getL1();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.AccessLog#getL1 <em>L1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L1</em>' reference.
	 * @see #getL1()
	 * @generated
	 */
	void setL1(Storage value);

	/**
	 * Returns the value of the '<em><b>Sp1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sp1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sp1</em>' reference.
	 * @see #setSp1(StickyPolicy)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getAccessLog_Sp1()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StickyPolicy getSp1();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.AccessLog#getSp1 <em>Sp1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sp1</em>' reference.
	 * @see #getSp1()
	 * @generated
	 */
	void setSp1(StickyPolicy value);

	/**
	 * Returns the value of the '<em><b>O</b></em>' containment reference list.
	 * The list contents are of type {@link model4datactrackprofile.PList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>O</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>O</em>' containment reference list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getAccessLog_O()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<PList> getO();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link model4datactrackprofile.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see model4datactrackprofile.ActionType
	 * @see #setAction(ActionType)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getAccessLog_Action()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActionType getAction();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.AccessLog#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see model4datactrackprofile.ActionType
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionType value);

	/**
	 * Returns the value of the '<em><b>Nl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nl</em>' reference.
	 * @see #setNl(Storage)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getAccessLog_Nl()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Storage getNl();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.AccessLog#getNl <em>Nl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nl</em>' reference.
	 * @see #getNl()
	 * @generated
	 */
	void setNl(Storage value);

	/**
	 * Returns the value of the '<em><b>Nsp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nsp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nsp</em>' reference.
	 * @see #setNsp(StickyPolicy)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getAccessLog_Nsp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StickyPolicy getNsp();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.AccessLog#getNsp <em>Nsp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nsp</em>' reference.
	 * @see #getNsp()
	 * @generated
	 */
	void setNsp(StickyPolicy value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AccessLog.allInstances()->forAll(log | log.nsp.accessHistory->exists(access | access.tp = log.tp and access.actionPerformed=log.action))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean log_access_match_sp_access(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AccessLog
