/**
 */
package Model4DataCtrack;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ask Data Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.askDataInformation#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link Model4DataCtrack.askDataInformation#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see Model4DataCtrack.Model4DataCtrackPackage#getaskDataInformation()
 * @model
 * @generated
 */
public interface askDataInformation extends EObject {
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
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getaskDataInformation_Base_Message()
	 * @model ordered="false"
	 * @generated
	 */
	Message getBase_Message();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.askDataInformation#getBase_Message <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Message</em>' reference.
	 * @see #getBase_Message()
	 * @generated
	 */
	void setBase_Message(Message value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getaskDataInformation_User()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.askDataInformation#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

} // askDataInformation
