/**
 */
package model4datactrackprofile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>breach Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.breachInfo#getData <em>Data</em>}</li>
 *   <li>{@link model4datactrackprofile.breachInfo#getTp <em>Tp</em>}</li>
 *   <li>{@link model4datactrackprofile.breachInfo#getAction <em>Action</em>}</li>
 *   <li>{@link model4datactrackprofile.breachInfo#getNewData <em>New Data</em>}</li>
 *   <li>{@link model4datactrackprofile.breachInfo#getNewLocation <em>New Location</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getbreachInfo()
 * @model
 * @generated
 */
public interface breachInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Data)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getbreachInfo_Data()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.breachInfo#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getbreachInfo_Tp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StatelessAppCTP getTp();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.breachInfo#getTp <em>Tp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tp</em>' reference.
	 * @see #getTp()
	 * @generated
	 */
	void setTp(StatelessAppCTP value);

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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getbreachInfo_Action()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActionType getAction();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.breachInfo#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see model4datactrackprofile.ActionType
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionType value);

	/**
	 * Returns the value of the '<em><b>New Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Data</em>' reference.
	 * @see #setNewData(Data)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getbreachInfo_NewData()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Data getNewData();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.breachInfo#getNewData <em>New Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Data</em>' reference.
	 * @see #getNewData()
	 * @generated
	 */
	void setNewData(Data value);

	/**
	 * Returns the value of the '<em><b>New Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Location</em>' reference.
	 * @see #setNewLocation(Storage)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getbreachInfo_NewLocation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Storage getNewLocation();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.breachInfo#getNewLocation <em>New Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Location</em>' reference.
	 * @see #getNewLocation()
	 * @generated
	 */
	void setNewLocation(Storage value);

} // breachInfo
