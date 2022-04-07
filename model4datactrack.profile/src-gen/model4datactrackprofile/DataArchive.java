/**
 */
package model4datactrackprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Archive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.DataArchive#getContents <em>Contents</em>}</li>
 *   <li>{@link model4datactrackprofile.DataArchive#getIdData <em>Id Data</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getDataArchive()
 * @model
 * @generated
 */
public interface DataArchive extends EObject {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link model4datactrackprofile.DataField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getDataArchive_Contents()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<DataField> getContents();

	/**
	 * Returns the value of the '<em><b>Id Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Data</em>' attribute.
	 * @see #setIdData(String)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getDataArchive_IdData()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getIdData();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.DataArchive#getIdData <em>Id Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Data</em>' attribute.
	 * @see #getIdData()
	 * @generated
	 */
	void setIdData(String value);

} // DataArchive
