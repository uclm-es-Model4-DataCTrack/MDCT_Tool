/**
 */
package model4datactrackprofile.impl;

import model4datactrackprofile.Model4datactrackprofilePackage;
import model4datactrackprofile.StatelessAppCTP;
import model4datactrackprofile.tp;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.impl.tpImpl#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.tpImpl#getTp <em>Tp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class tpImpl extends MinimalEObjectImpl.Container implements tp {
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
	 * The cached value of the '{@link #getTp() <em>Tp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTp()
	 * @generated
	 * @ordered
	 */
	protected StatelessAppCTP tp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected tpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4datactrackprofilePackage.Literals.TP;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.TP__BASE_MESSAGE, oldBase_Message, base_Message));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.TP__BASE_MESSAGE, oldBase_Message, base_Message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatelessAppCTP getTp() {
		if (tp != null && tp.eIsProxy()) {
			InternalEObject oldTp = (InternalEObject)tp;
			tp = (StatelessAppCTP)eResolveProxy(oldTp);
			if (tp != oldTp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.TP__TP, oldTp, tp));
			}
		}
		return tp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatelessAppCTP basicGetTp() {
		return tp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTp(StatelessAppCTP newTp) {
		StatelessAppCTP oldTp = tp;
		tp = newTp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.TP__TP, oldTp, tp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Model4datactrackprofilePackage.TP__BASE_MESSAGE:
				if (resolve) return getBase_Message();
				return basicGetBase_Message();
			case Model4datactrackprofilePackage.TP__TP:
				if (resolve) return getTp();
				return basicGetTp();
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
			case Model4datactrackprofilePackage.TP__BASE_MESSAGE:
				setBase_Message((Message)newValue);
				return;
			case Model4datactrackprofilePackage.TP__TP:
				setTp((StatelessAppCTP)newValue);
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
			case Model4datactrackprofilePackage.TP__BASE_MESSAGE:
				setBase_Message((Message)null);
				return;
			case Model4datactrackprofilePackage.TP__TP:
				setTp((StatelessAppCTP)null);
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
			case Model4datactrackprofilePackage.TP__BASE_MESSAGE:
				return base_Message != null;
			case Model4datactrackprofilePackage.TP__TP:
				return tp != null;
		}
		return super.eIsSet(featureID);
	}

} //tpImpl
