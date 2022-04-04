/**
 */
package Model4DataCtrack;

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
 *   <li>{@link Model4DataCtrack.DataArchive#getContents <em>Contents</em>}</li>
 *   <li>{@link Model4DataCtrack.DataArchive#getIdData <em>Id Data</em>}</li>
 * </ul>
 *
 * @see Model4DataCtrack.Model4DataCtrackPackage#getDataArchive()
 * @model
 * @generated
 */
public interface DataArchive extends EObject {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link Model4DataCtrack.DataField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getDataArchive_Contents()
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
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getDataArchive_IdData()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getIdData();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.DataArchive#getIdData <em>Id Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Data</em>' attribute.
	 * @see #getIdData()
	 * @generated
	 */
	void setIdData(String value);

} // DataArchive
