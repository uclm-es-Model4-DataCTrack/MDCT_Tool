/**
 */
package model4datactrackprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acces Per TP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.AccesPerTP#getTp <em>Tp</em>}</li>
 *   <li>{@link model4datactrackprofile.AccesPerTP#getActionPerformed <em>Action Performed</em>}</li>
 *   <li>{@link model4datactrackprofile.AccesPerTP#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getAccesPerTP()
 * @model
 * @generated
 */
public interface AccesPerTP extends EObject {
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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getAccesPerTP_Tp()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StatelessAppCTP getTp();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.AccesPerTP#getTp <em>Tp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tp</em>' reference.
	 * @see #getTp()
	 * @generated
	 */
	void setTp(StatelessAppCTP value);

	/**
	 * Returns the value of the '<em><b>Action Performed</b></em>' attribute.
	 * The literals are from the enumeration {@link model4datactrackprofile.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Performed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Performed</em>' attribute.
	 * @see model4datactrackprofile.ActionType
	 * @see #setActionPerformed(ActionType)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getAccesPerTP_ActionPerformed()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActionType getActionPerformed();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.AccesPerTP#getActionPerformed <em>Action Performed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Performed</em>' attribute.
	 * @see model4datactrackprofile.ActionType
	 * @see #getActionPerformed()
	 * @generated
	 */
	void setActionPerformed(ActionType value);

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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getAccesPerTP_Purpose()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getPurpose();

} // AccesPerTP
