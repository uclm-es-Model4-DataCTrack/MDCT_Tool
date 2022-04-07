/**
 */
package model4datactrackprofile.impl;

import model4datactrackprofile.Model4datactrackprofilePackage;
import model4datactrackprofile.User;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.impl.UserImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.UserImpl#getIdUser <em>Id User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends PrincipalImpl implements User {
	/**
	 * The default value of the '{@link #getInstances() <em>Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTANCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected int instances = INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdUser() <em>Id User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdUser()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdUser() <em>Id User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdUser()
	 * @generated
	 * @ordered
	 */
	protected String idUser = ID_USER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4datactrackprofilePackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInstances() {
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstances(int newInstances) {
		int oldInstances = instances;
		instances = newInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.USER__INSTANCES, oldInstances, instances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdUser() {
		return idUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdUser(String newIdUser) {
		String oldIdUser = idUser;
		idUser = newIdUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.USER__ID_USER, oldIdUser, idUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Model4datactrackprofilePackage.USER__INSTANCES:
				return getInstances();
			case Model4datactrackprofilePackage.USER__ID_USER:
				return getIdUser();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Model4datactrackprofilePackage.USER__INSTANCES:
				setInstances((Integer)newValue);
				return;
			case Model4datactrackprofilePackage.USER__ID_USER:
				setIdUser((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Model4datactrackprofilePackage.USER__INSTANCES:
				setInstances(INSTANCES_EDEFAULT);
				return;
			case Model4datactrackprofilePackage.USER__ID_USER:
				setIdUser(ID_USER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Model4datactrackprofilePackage.USER__INSTANCES:
				return instances != INSTANCES_EDEFAULT;
			case Model4datactrackprofilePackage.USER__ID_USER:
				return ID_USER_EDEFAULT == null ? idUser != null : !ID_USER_EDEFAULT.equals(idUser);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (instances: ");
		result.append(instances);
		result.append(", idUser: ");
		result.append(idUser);
		result.append(')');
		return result.toString();
	}

} //UserImpl
