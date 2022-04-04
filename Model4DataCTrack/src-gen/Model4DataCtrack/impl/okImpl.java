/**
 */
package Model4DataCtrack.impl;

import Model4DataCtrack.ActionType;
import Model4DataCtrack.Model4DataCtrackPackage;
import Model4DataCtrack.ok;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ok</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.impl.okImpl#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.okImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.okImpl#getPermissionType <em>Permission Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class okImpl extends MinimalEObjectImpl.Container implements ok {
	/**
	 * The cached value of the '{@link #getBase_Message() <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Message()
	 * @generated
	 * @ordered
	 */
	protected Message base_Message;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected EList<String> purpose;

	/**
	 * The default value of the '{@link #getPermissionType() <em>Permission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionType()
	 * @generated
	 * @ordered
	 */
	protected static final ActionType PERMISSION_TYPE_EDEFAULT = ActionType.READ;

	/**
	 * The cached value of the '{@link #getPermissionType() <em>Permission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionType()
	 * @generated
	 * @ordered
	 */
	protected ActionType permissionType = PERMISSION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected okImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4DataCtrackPackage.Literals.OK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getBase_Message() {
		if (base_Message != null && base_Message.eIsProxy()) {
			InternalEObject oldBase_Message = (InternalEObject)base_Message;
			base_Message = (Message)eResolveProxy(oldBase_Message);
			if (base_Message != oldBase_Message) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.OK__BASE_MESSAGE, oldBase_Message, base_Message));
			}
		}
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetBase_Message() {
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Message(Message newBase_Message) {
		Message oldBase_Message = base_Message;
		base_Message = newBase_Message;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.OK__BASE_MESSAGE, oldBase_Message, base_Message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPurpose() {
		if (purpose == null) {
			purpose = new EDataTypeUniqueEList<String>(String.class, this, Model4DataCtrackPackage.OK__PURPOSE);
		}
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType getPermissionType() {
		return permissionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermissionType(ActionType newPermissionType) {
		ActionType oldPermissionType = permissionType;
		permissionType = newPermissionType == null ? PERMISSION_TYPE_EDEFAULT : newPermissionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.OK__PERMISSION_TYPE, oldPermissionType, permissionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Model4DataCtrackPackage.OK__BASE_MESSAGE:
				if (resolve) return getBase_Message();
				return basicGetBase_Message();
			case Model4DataCtrackPackage.OK__PURPOSE:
				return getPurpose();
			case Model4DataCtrackPackage.OK__PERMISSION_TYPE:
				return getPermissionType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Model4DataCtrackPackage.OK__BASE_MESSAGE:
				setBase_Message((Message)newValue);
				return;
			case Model4DataCtrackPackage.OK__PURPOSE:
				getPurpose().clear();
				getPurpose().addAll((Collection<? extends String>)newValue);
				return;
			case Model4DataCtrackPackage.OK__PERMISSION_TYPE:
				setPermissionType((ActionType)newValue);
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
			case Model4DataCtrackPackage.OK__BASE_MESSAGE:
				setBase_Message((Message)null);
				return;
			case Model4DataCtrackPackage.OK__PURPOSE:
				getPurpose().clear();
				return;
			case Model4DataCtrackPackage.OK__PERMISSION_TYPE:
				setPermissionType(PERMISSION_TYPE_EDEFAULT);
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
			case Model4DataCtrackPackage.OK__BASE_MESSAGE:
				return base_Message != null;
			case Model4DataCtrackPackage.OK__PURPOSE:
				return purpose != null && !purpose.isEmpty();
			case Model4DataCtrackPackage.OK__PERMISSION_TYPE:
				return permissionType != PERMISSION_TYPE_EDEFAULT;
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
		result.append(" (purpose: ");
		result.append(purpose);
		result.append(", permissionType: ");
		result.append(permissionType);
		result.append(')');
		return result.toString();
	}

} //okImpl
