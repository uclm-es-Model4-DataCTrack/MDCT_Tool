/**
 */
package model4datactrackprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ok</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.ok#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link model4datactrackprofile.ok#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link model4datactrackprofile.ok#getPermissionType <em>Permission Type</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getok()
 * @model
 * @generated
 */
public interface ok extends EObject {
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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getok_Base_Message()
	 * @model ordered="false"
	 * @generated
	 */
	Message getBase_Message();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.ok#getBase_Message <em>Base Message</em>}' reference.
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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getok_Purpose()
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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getok_PermissionType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActionType getPermissionType();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.ok#getPermissionType <em>Permission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission Type</em>' attribute.
	 * @see model4datactrackprofile.ActionType
	 * @see #getPermissionType()
	 * @generated
	 */
	void setPermissionType(ActionType value);

} // ok
