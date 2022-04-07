/**
 */
package Model4DataCtrack;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>consent Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.consentInfo#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link Model4DataCtrack.consentInfo#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link Model4DataCtrack.consentInfo#getAction <em>Action</em>}</li>
 *   <li>{@link Model4DataCtrack.consentInfo#getTp <em>Tp</em>}</li>
 * </ul>
 *
 * @see Model4DataCtrack.Model4DataCtrackPackage#getconsentInfo()
 * @model
 * @generated
 */
public interface consentInfo extends EObject {
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
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getconsentInfo_Base_Message()
	 * @model ordered="false"
	 * @generated
	 */
	Message getBase_Message();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.consentInfo#getBase_Message <em>Base Message</em>}' reference.
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
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getconsentInfo_Purpose()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getPurpose();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link Model4DataCtrack.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see Model4DataCtrack.ActionType
	 * @see #setAction(ActionType)
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getconsentInfo_Action()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActionType getAction();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.consentInfo#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see Model4DataCtrack.ActionType
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionType value);

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
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getconsentInfo_Tp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StatelessAppCTP getTp();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.consentInfo#getTp <em>Tp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tp</em>' reference.
	 * @see #getTp()
	 * @generated
	 */
	void setTp(StatelessAppCTP value);

} // consentInfo
