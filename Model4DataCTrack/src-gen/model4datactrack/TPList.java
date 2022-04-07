/**
 */
package Model4DataCtrack;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TP List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.TPList#getList <em>List</em>}</li>
 * </ul>
 *
 * @see Model4DataCtrack.Model4DataCtrackPackage#getTPList()
 * @model
 * @generated
 */
public interface TPList extends EObject {
	/**
	 * Returns the value of the '<em><b>List</b></em>' reference list.
	 * The list contents are of type {@link Model4DataCtrack.StatelessAppCTP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' reference list.
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getTPList_List()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<StatelessAppCTP> getList();

} // TPList
