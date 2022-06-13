/**
 */
package model4datactrackprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SLA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.SLA#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link model4datactrackprofile.SLA#getSubjectMatter <em>Subject Matter</em>}</li>
 *   <li>{@link model4datactrackprofile.SLA#getProcessingDuration <em>Processing Duration</em>}</li>
 *   <li>{@link model4datactrackprofile.SLA#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link model4datactrackprofile.SLA#getRecipients <em>Recipients</em>}</li>
 *   <li>{@link model4datactrackprofile.SLA#getProcessingNature <em>Processing Nature</em>}</li>
 *   <li>{@link model4datactrackprofile.SLA#getProcessingPurpose <em>Processing Purpose</em>}</li>
 *   <li>{@link model4datactrackprofile.SLA#getProcessingInstructions <em>Processing Instructions</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getSLA()
 * @model
 * @generated
 */
public interface SLA extends EObject {
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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getSLA_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.SLA#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Subject Matter</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject Matter</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Matter</em>' attribute list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getSLA_SubjectMatter()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getSubjectMatter();

	/**
	 * Returns the value of the '<em><b>Processing Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Duration</em>' containment reference.
	 * @see #setProcessingDuration(Time)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getSLA_ProcessingDuration()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Time getProcessingDuration();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.SLA#getProcessingDuration <em>Processing Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Duration</em>' containment reference.
	 * @see #getProcessingDuration()
	 * @generated
	 */
	void setProcessingDuration(Time value);

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
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getSLA_Base_Component()
	 * @model ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.SLA#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

	/**
	 * Returns the value of the '<em><b>Recipients</b></em>' reference list.
	 * The list contents are of type {@link model4datactrackprofile.StatelessAppCTP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipients</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipients</em>' reference list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getSLA_Recipients()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<StatelessAppCTP> getRecipients();

	/**
	 * Returns the value of the '<em><b>Processing Nature</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Nature</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Nature</em>' attribute list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getSLA_ProcessingNature()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getProcessingNature();

	/**
	 * Returns the value of the '<em><b>Processing Purpose</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Purpose</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Purpose</em>' attribute list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getSLA_ProcessingPurpose()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getProcessingPurpose();

	/**
	 * Returns the value of the '<em><b>Processing Instructions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Instructions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Instructions</em>' attribute list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getSLA_ProcessingInstructions()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getProcessingInstructions();

} // SLA
