/**
 */
package Model4DataCtrack;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.User#getInstances <em>Instances</em>}</li>
 *   <li>{@link Model4DataCtrack.User#getIdUser <em>Id User</em>}</li>
 * </ul>
 *
 * @see Model4DataCtrack.Model4DataCtrackPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Principal {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' attribute.
	 * @see #setInstances(int)
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getUser_Instances()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getInstances();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.User#getInstances <em>Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances</em>' attribute.
	 * @see #getInstances()
	 * @generated
	 */
	void setInstances(int value);

	/**
	 * Returns the value of the '<em><b>Id User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id User</em>' attribute.
	 * @see #setIdUser(String)
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getUser_IdUser()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getIdUser();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.User#getIdUser <em>Id User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id User</em>' attribute.
	 * @see #getIdUser()
	 * @generated
	 */
	void setIdUser(String value);

} // User
