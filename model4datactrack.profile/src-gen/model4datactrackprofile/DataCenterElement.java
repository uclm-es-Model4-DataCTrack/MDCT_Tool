/**
 */
package model4datactrackprofile;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Center Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.DataCenterElement#getNumberOfDataCenters <em>Number Of Data Centers</em>}</li>
 *   <li>{@link model4datactrackprofile.DataCenterElement#getDataCenterType <em>Data Center Type</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getDataCenterElement()
 * @model
 * @generated
 */
public interface DataCenterElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Data Centers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Data Centers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Data Centers</em>' attribute.
	 * @see #setNumberOfDataCenters(int)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getDataCenterElement_NumberOfDataCenters()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfDataCenters();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.DataCenterElement#getNumberOfDataCenters <em>Number Of Data Centers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Data Centers</em>' attribute.
	 * @see #getNumberOfDataCenters()
	 * @generated
	 */
	void setNumberOfDataCenters(int value);

	/**
	 * Returns the value of the '<em><b>Data Center Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Center Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Center Type</em>' reference.
	 * @see #setDataCenterType(DataCenter)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getDataCenterElement_DataCenterType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataCenter getDataCenterType();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.DataCenterElement#getDataCenterType <em>Data Center Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Center Type</em>' reference.
	 * @see #getDataCenterType()
	 * @generated
	 */
	void setDataCenterType(DataCenter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.numberOfDataCenters>0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean no_empty_infra(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DataCenterElement
