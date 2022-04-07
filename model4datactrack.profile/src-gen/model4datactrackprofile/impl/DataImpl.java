/**
 */
package model4datactrackprofile.impl;

import model4datactrackprofile.Data;
import model4datactrackprofile.DataArchive;
import model4datactrackprofile.Model4datactrackprofilePackage;
import model4datactrackprofile.StickyPolicy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.impl.DataImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.DataImpl#getArchive <em>Archive</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.DataImpl#getAppliedPolicy <em>Applied Policy</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.DataImpl#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends MinimalEObjectImpl.Container implements Data {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getArchive() <em>Archive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchive()
	 * @generated
	 * @ordered
	 */
	protected DataArchive archive;

	/**
	 * The cached value of the '{@link #getAppliedPolicy() <em>Applied Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedPolicy()
	 * @generated
	 * @ordered
	 */
	protected StickyPolicy appliedPolicy;

	/**
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected Component base_Component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4datactrackprofilePackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.DATA__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.DATA__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataArchive getArchive() {
		return archive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArchive(DataArchive newArchive, NotificationChain msgs) {
		DataArchive oldArchive = archive;
		archive = newArchive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.DATA__ARCHIVE, oldArchive, newArchive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchive(DataArchive newArchive) {
		if (newArchive != archive) {
			NotificationChain msgs = null;
			if (archive != null)
				msgs = ((InternalEObject)archive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model4datactrackprofilePackage.DATA__ARCHIVE, null, msgs);
			if (newArchive != null)
				msgs = ((InternalEObject)newArchive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model4datactrackprofilePackage.DATA__ARCHIVE, null, msgs);
			msgs = basicSetArchive(newArchive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.DATA__ARCHIVE, newArchive, newArchive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StickyPolicy getAppliedPolicy() {
		if (appliedPolicy != null && appliedPolicy.eIsProxy()) {
			InternalEObject oldAppliedPolicy = (InternalEObject)appliedPolicy;
			appliedPolicy = (StickyPolicy)eResolveProxy(oldAppliedPolicy);
			if (appliedPolicy != oldAppliedPolicy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.DATA__APPLIED_POLICY, oldAppliedPolicy, appliedPolicy));
			}
		}
		return appliedPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StickyPolicy basicGetAppliedPolicy() {
		return appliedPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedPolicy(StickyPolicy newAppliedPolicy) {
		StickyPolicy oldAppliedPolicy = appliedPolicy;
		appliedPolicy = newAppliedPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.DATA__APPLIED_POLICY, oldAppliedPolicy, appliedPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.DATA__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Component(Component newBase_Component) {
		Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.DATA__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Model4datactrackprofilePackage.DATA__ARCHIVE:
				return basicSetArchive(null, msgs);
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
			case Model4datactrackprofilePackage.DATA__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case Model4datactrackprofilePackage.DATA__ARCHIVE:
				return getArchive();
			case Model4datactrackprofilePackage.DATA__APPLIED_POLICY:
				if (resolve) return getAppliedPolicy();
				return basicGetAppliedPolicy();
			case Model4datactrackprofilePackage.DATA__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
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
			case Model4datactrackprofilePackage.DATA__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case Model4datactrackprofilePackage.DATA__ARCHIVE:
				setArchive((DataArchive)newValue);
				return;
			case Model4datactrackprofilePackage.DATA__APPLIED_POLICY:
				setAppliedPolicy((StickyPolicy)newValue);
				return;
			case Model4datactrackprofilePackage.DATA__BASE_COMPONENT:
				setBase_Component((Component)newValue);
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
			case Model4datactrackprofilePackage.DATA__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case Model4datactrackprofilePackage.DATA__ARCHIVE:
				setArchive((DataArchive)null);
				return;
			case Model4datactrackprofilePackage.DATA__APPLIED_POLICY:
				setAppliedPolicy((StickyPolicy)null);
				return;
			case Model4datactrackprofilePackage.DATA__BASE_COMPONENT:
				setBase_Component((Component)null);
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
			case Model4datactrackprofilePackage.DATA__BASE_CLASS:
				return base_Class != null;
			case Model4datactrackprofilePackage.DATA__ARCHIVE:
				return archive != null;
			case Model4datactrackprofilePackage.DATA__APPLIED_POLICY:
				return appliedPolicy != null;
			case Model4datactrackprofilePackage.DATA__BASE_COMPONENT:
				return base_Component != null;
		}
		return super.eIsSet(featureID);
	}

} //DataImpl
