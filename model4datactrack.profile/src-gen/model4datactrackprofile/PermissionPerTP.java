/**
 */
package model4datactrackprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission Per TP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.PermissionPerTP#getS <em>S</em>}</li>
 *   <li>{@link model4datactrackprofile.PermissionPerTP#getI <em>I</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getPermissionPerTP()
 * @model
 * @generated
 */
public interface PermissionPerTP extends EObject {
	/**
	 * Returns the value of the '<em><b>S</b></em>' containment reference list.
	 * The list contents are of type {@link model4datactrackprofile.PList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' containment reference list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getPermissionPerTP_S()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<PList> getS();

	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference list.
	 * The list contents are of type {@link model4datactrackprofile.PList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' containment reference list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getPermissionPerTP_I()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<PList> getI();

} // PermissionPerTP
