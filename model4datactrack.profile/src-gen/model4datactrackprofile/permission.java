/**
 */
package model4datactrackprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.permission#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link model4datactrackprofile.permission#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link model4datactrackprofile.permission#getPermissionType <em>Permission Type</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getpermission()
 * @model
 * @generated
 */
public interface permission extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Message</em>' reference.
	 * @see #setBase_Message(Message)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getpermission_Base_Message()
	 * @model ordered="false"
	 * @generated
	 */
	Message getBase_Message();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.permission#getBase_Message <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Message</em>' reference.
	 * @see #getBase_Message()
	 * @generated
	 */
	void setBase_Message(Message value);

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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getpermission_Purpose()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getPurpose();

	/**
	 * Returns the value of the '<em><b>Permission Type</b></em>' attribute.
	 * The literals are from the enumeration {@link model4datactrackprofile.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission Type</em>' attribute.
	 * @see model4datactrackprofile.ActionType
	 * @see #setPermissionType(ActionType)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getpermission_PermissionType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActionType getPermissionType();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.permission#getPermissionType <em>Permission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission Type</em>' attribute.
	 * @see model4datactrackprofile.ActionType
	 * @see #getPermissionType()
	 * @generated
	 */
	void setPermissionType(ActionType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * permission.allInstances()->forAll(ok.allInstances()->exists(okmsg | self.purpose->forAll(p | okmsg.purpose->includes(p)) and okmsg.permissionType = self.permissionType) 
	 * 	and
	 * 	consentInfo.allInstances()->exists(consentmsg | self.purpose->forAll(p | consentmsg.purpose->includes(p)) and consentmsg.action = self.permissionType and StatelessAppCTP.allInstances()->select(tp | tp.base_Lifeline.coveredBy->includes(self.base_Message.receiveEvent))->includes(consentmsg.tp))
	 * )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean no_access_permission_given_without_user_consent(DiagnosticChain diagnostics, Map<Object, Object> context);

} // permission
