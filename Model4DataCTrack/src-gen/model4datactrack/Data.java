/**
 */
package Model4DataCtrack;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.Data#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link Model4DataCtrack.Data#getArchive <em>Archive</em>}</li>
 *   <li>{@link Model4DataCtrack.Data#getAppliedPolicy <em>Applied Policy</em>}</li>
 *   <li>{@link Model4DataCtrack.Data#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @see Model4DataCtrack.Model4DataCtrackPackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject {
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
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getData_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.Data#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Archive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archive</em>' containment reference.
	 * @see #setArchive(DataArchive)
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getData_Archive()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	DataArchive getArchive();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.Data#getArchive <em>Archive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive</em>' containment reference.
	 * @see #getArchive()
	 * @generated
	 */
	void setArchive(DataArchive value);

	/**
	 * Returns the value of the '<em><b>Applied Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Policy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Policy</em>' reference.
	 * @see #setAppliedPolicy(StickyPolicy)
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getData_AppliedPolicy()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StickyPolicy getAppliedPolicy();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.Data#getAppliedPolicy <em>Applied Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Policy</em>' reference.
	 * @see #getAppliedPolicy()
	 * @generated
	 */
	void setAppliedPolicy(StickyPolicy value);

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
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getData_Base_Component()
	 * @model ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.Data#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

} // Data
