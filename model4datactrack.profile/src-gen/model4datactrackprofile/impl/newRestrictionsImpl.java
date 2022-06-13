/**
 */
package model4datactrackprofile.impl;

import model4datactrackprofile.Data;
import model4datactrackprofile.Model4datactrackprofilePackage;
import model4datactrackprofile.StickyPolicy;
import model4datactrackprofile.newRestrictions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>new Restrictions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.impl.newRestrictionsImpl#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.newRestrictionsImpl#getData <em>Data</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.newRestrictionsImpl#getNewSP <em>New SP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class newRestrictionsImpl extends MinimalEObjectImpl.Container implements newRestrictions {
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
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

	/**
	 * The cached value of the '{@link #getNewSP() <em>New SP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewSP()
	 * @generated
	 * @ordered
	 */
	protected StickyPolicy newSP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected newRestrictionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4datactrackprofilePackage.Literals.NEW_RESTRICTIONS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.NEW_RESTRICTIONS__BASE_MESSAGE, oldBase_Message, base_Message));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.NEW_RESTRICTIONS__BASE_MESSAGE, oldBase_Message, base_Message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject)data;
			data = (Data)eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.NEW_RESTRICTIONS__DATA, oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Data newData) {
		Data oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.NEW_RESTRICTIONS__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StickyPolicy getNewSP() {
		if (newSP != null && newSP.eIsProxy()) {
			InternalEObject oldNewSP = (InternalEObject)newSP;
			newSP = (StickyPolicy)eResolveProxy(oldNewSP);
			if (newSP != oldNewSP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.NEW_RESTRICTIONS__NEW_SP, oldNewSP, newSP));
			}
		}
		return newSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StickyPolicy basicGetNewSP() {
		return newSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewSP(StickyPolicy newNewSP) {
		StickyPolicy oldNewSP = newSP;
		newSP = newNewSP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.NEW_RESTRICTIONS__NEW_SP, oldNewSP, newSP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Model4datactrackprofilePackage.NEW_RESTRICTIONS__BASE_MESSAGE:
				if (resolve) return getBase_Message();
				return basicGetBase_Message();
			case Model4datactrackprofilePackage.NEW_RESTRICTIONS__DATA:
				if (resolve) return getData();
				return basicGetData();
			case Model4datactrackprofilePackage.NEW_RESTRICTIONS__NEW_SP:
				if (resolve) return getNewSP();
				return basicGetNewSP();
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
			case Model4datactrackprofilePackage.NEW_RESTRICTIONS__BASE_MESSAGE:
				setBase_Message((Message)newValue);
				return;
			case Model4datactrackprofilePackage.NEW_RESTRICTIONS__DATA:
				setData((Data)newValue);
				return;
			case Model4datactrackprofilePackage.NEW_RESTRICTIONS__NEW_SP:
				setNewSP((StickyPolicy)newValue);
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
			case Model4datactrackprofilePackage.NEW_RESTRICTIONS__BASE_MESSAGE:
				setBase_Message((Message)null);
				return;
			case Model4datactrackprofilePackage.NEW_RESTRICTIONS__DATA:
				setData((Data)null);
				return;
			case Model4datactrackprofilePackage.NEW_RESTRICTIONS__NEW_SP:
				setNewSP((StickyPolicy)null);
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
			case Model4datactrackprofilePackage.NEW_RESTRICTIONS__BASE_MESSAGE:
				return base_Message != null;
			case Model4datactrackprofilePackage.NEW_RESTRICTIONS__DATA:
				return data != null;
			case Model4datactrackprofilePackage.NEW_RESTRICTIONS__NEW_SP:
				return newSP != null;
		}
		return super.eIsSet(featureID);
	}

} //newRestrictionsImpl
