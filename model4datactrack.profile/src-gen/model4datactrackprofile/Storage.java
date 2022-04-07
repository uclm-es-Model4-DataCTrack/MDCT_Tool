/**
 */
package model4datactrackprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.Storage#getNumberOfDrivers <em>Number Of Drivers</em>}</li>
 *   <li>{@link model4datactrackprofile.Storage#getDirveCapacity <em>Dirve Capacity</em>}</li>
 *   <li>{@link model4datactrackprofile.Storage#getReadBandwidth <em>Read Bandwidth</em>}</li>
 *   <li>{@link model4datactrackprofile.Storage#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getStorage()
 * @model
 * @generated
 */
public interface Storage extends Hardware {
	/**
	 * Returns the value of the '<em><b>Number Of Drivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Drivers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Drivers</em>' attribute.
	 * @see #setNumberOfDrivers(int)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getStorage_NumberOfDrivers()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfDrivers();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.Storage#getNumberOfDrivers <em>Number Of Drivers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Drivers</em>' attribute.
	 * @see #getNumberOfDrivers()
	 * @generated
	 */
	void setNumberOfDrivers(int value);

	/**
	 * Returns the value of the '<em><b>Dirve Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dirve Capacity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dirve Capacity</em>' containment reference.
	 * @see #setDirveCapacity(Size)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getStorage_DirveCapacity()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Size getDirveCapacity();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.Storage#getDirveCapacity <em>Dirve Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dirve Capacity</em>' containment reference.
	 * @see #getDirveCapacity()
	 * @generated
	 */
	void setDirveCapacity(Size value);

	/**
	 * Returns the value of the '<em><b>Read Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Bandwidth</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Bandwidth</em>' containment reference.
	 * @see #setReadBandwidth(Bandwidth)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getStorage_ReadBandwidth()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Bandwidth getReadBandwidth();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.Storage#getReadBandwidth <em>Read Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Bandwidth</em>' containment reference.
	 * @see #getReadBandwidth()
	 * @generated
	 */
	void setReadBandwidth(Bandwidth value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link model4datactrackprofile.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getStorage_Data()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.numberOfDrivers>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean numberOfDrivers_greater_than_0(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Storage
