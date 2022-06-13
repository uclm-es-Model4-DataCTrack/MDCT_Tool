/**
 */
package model4datactrackprofile.impl;

import java.util.Collection;

import model4datactrackprofile.ControllerCP;
import model4datactrackprofile.Info;
import model4datactrackprofile.Model4datactrackprofilePackage;
import model4datactrackprofile.StatelessAppCTP;
import model4datactrackprofile.Time;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.impl.InfoImpl#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.InfoImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.InfoImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.InfoImpl#getRecipients <em>Recipients</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfoImpl extends MinimalEObjectImpl.Container implements Info {
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
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected Time maxTime;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected ControllerCP provider;

	/**
	 * The cached value of the '{@link #getRecipients() <em>Recipients</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipients()
	 * @generated
	 * @ordered
	 */
	protected EList<StatelessAppCTP> recipients;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4datactrackprofilePackage.Literals.INFO;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.INFO__BASE_MESSAGE, oldBase_Message, base_Message));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.INFO__BASE_MESSAGE, oldBase_Message, base_Message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getMaxTime() {
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxTime(Time newMaxTime, NotificationChain msgs) {
		Time oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.INFO__MAX_TIME, oldMaxTime, newMaxTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTime(Time newMaxTime) {
		if (newMaxTime != maxTime) {
			NotificationChain msgs = null;
			if (maxTime != null)
				msgs = ((InternalEObject)maxTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model4datactrackprofilePackage.INFO__MAX_TIME, null, msgs);
			if (newMaxTime != null)
				msgs = ((InternalEObject)newMaxTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model4datactrackprofilePackage.INFO__MAX_TIME, null, msgs);
			msgs = basicSetMaxTime(newMaxTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.INFO__MAX_TIME, newMaxTime, newMaxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerCP getProvider() {
		if (provider != null && provider.eIsProxy()) {
			InternalEObject oldProvider = (InternalEObject)provider;
			provider = (ControllerCP)eResolveProxy(oldProvider);
			if (provider != oldProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.INFO__PROVIDER, oldProvider, provider));
			}
		}
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerCP basicGetProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(ControllerCP newProvider) {
		ControllerCP oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.INFO__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatelessAppCTP> getRecipients() {
		if (recipients == null) {
			recipients = new EObjectResolvingEList<StatelessAppCTP>(StatelessAppCTP.class, this, Model4datactrackprofilePackage.INFO__RECIPIENTS);
		}
		return recipients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Model4datactrackprofilePackage.INFO__MAX_TIME:
				return basicSetMaxTime(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Model4datactrackprofilePackage.INFO__BASE_MESSAGE:
				if (resolve) return getBase_Message();
				return basicGetBase_Message();
			case Model4datactrackprofilePackage.INFO__MAX_TIME:
				return getMaxTime();
			case Model4datactrackprofilePackage.INFO__PROVIDER:
				if (resolve) return getProvider();
				return basicGetProvider();
			case Model4datactrackprofilePackage.INFO__RECIPIENTS:
				return getRecipients();
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
			case Model4datactrackprofilePackage.INFO__BASE_MESSAGE:
				setBase_Message((Message)newValue);
				return;
			case Model4datactrackprofilePackage.INFO__MAX_TIME:
				setMaxTime((Time)newValue);
				return;
			case Model4datactrackprofilePackage.INFO__PROVIDER:
				setProvider((ControllerCP)newValue);
				return;
			case Model4datactrackprofilePackage.INFO__RECIPIENTS:
				getRecipients().clear();
				getRecipients().addAll((Collection<? extends StatelessAppCTP>)newValue);
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
			case Model4datactrackprofilePackage.INFO__BASE_MESSAGE:
				setBase_Message((Message)null);
				return;
			case Model4datactrackprofilePackage.INFO__MAX_TIME:
				setMaxTime((Time)null);
				return;
			case Model4datactrackprofilePackage.INFO__PROVIDER:
				setProvider((ControllerCP)null);
				return;
			case Model4datactrackprofilePackage.INFO__RECIPIENTS:
				getRecipients().clear();
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
			case Model4datactrackprofilePackage.INFO__BASE_MESSAGE:
				return base_Message != null;
			case Model4datactrackprofilePackage.INFO__MAX_TIME:
				return maxTime != null;
			case Model4datactrackprofilePackage.INFO__PROVIDER:
				return provider != null;
			case Model4datactrackprofilePackage.INFO__RECIPIENTS:
				return recipients != null && !recipients.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InfoImpl
