/**
 */
package Model4DataCtrack.impl;

import Model4DataCtrack.Model4DataCtrackPackage;
import Model4DataCtrack.SLA;
import Model4DataCtrack.StatelessAppCTP;
import Model4DataCtrack.Time;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SLA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.impl.SLAImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.SLAImpl#getSubjectMatter <em>Subject Matter</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.SLAImpl#getProcessingDuration <em>Processing Duration</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.SLAImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.SLAImpl#getRecipients <em>Recipients</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.SLAImpl#getProcessingNature <em>Processing Nature</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.SLAImpl#getProcessingPurpose <em>Processing Purpose</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.SLAImpl#getProcessingInstructions <em>Processing Instructions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SLAImpl extends MinimalEObjectImpl.Container implements SLA {
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
	 * The cached value of the '{@link #getSubjectMatter() <em>Subject Matter</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectMatter()
	 * @generated
	 * @ordered
	 */
	protected EList<String> subjectMatter;

	/**
	 * The cached value of the '{@link #getProcessingDuration() <em>Processing Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingDuration()
	 * @generated
	 * @ordered
	 */
	protected Time processingDuration;

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
	 * The cached value of the '{@link #getRecipients() <em>Recipients</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipients()
	 * @generated
	 * @ordered
	 */
	protected EList<StatelessAppCTP> recipients;

	/**
	 * The cached value of the '{@link #getProcessingNature() <em>Processing Nature</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingNature()
	 * @generated
	 * @ordered
	 */
	protected EList<String> processingNature;

	/**
	 * The cached value of the '{@link #getProcessingPurpose() <em>Processing Purpose</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingPurpose()
	 * @generated
	 * @ordered
	 */
	protected EList<String> processingPurpose;

	/**
	 * The cached value of the '{@link #getProcessingInstructions() <em>Processing Instructions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> processingInstructions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SLAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4DataCtrackPackage.Literals.SLA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.SLA__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.SLA__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSubjectMatter() {
		if (subjectMatter == null) {
			subjectMatter = new EDataTypeUniqueEList<String>(String.class, this, Model4DataCtrackPackage.SLA__SUBJECT_MATTER);
		}
		return subjectMatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getProcessingDuration() {
		return processingDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessingDuration(Time newProcessingDuration, NotificationChain msgs) {
		Time oldProcessingDuration = processingDuration;
		processingDuration = newProcessingDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.SLA__PROCESSING_DURATION, oldProcessingDuration, newProcessingDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingDuration(Time newProcessingDuration) {
		if (newProcessingDuration != processingDuration) {
			NotificationChain msgs = null;
			if (processingDuration != null)
				msgs = ((InternalEObject)processingDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model4DataCtrackPackage.SLA__PROCESSING_DURATION, null, msgs);
			if (newProcessingDuration != null)
				msgs = ((InternalEObject)newProcessingDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model4DataCtrackPackage.SLA__PROCESSING_DURATION, null, msgs);
			msgs = basicSetProcessingDuration(newProcessingDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.SLA__PROCESSING_DURATION, newProcessingDuration, newProcessingDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getProcessingNature() {
		if (processingNature == null) {
			processingNature = new EDataTypeUniqueEList<String>(String.class, this, Model4DataCtrackPackage.SLA__PROCESSING_NATURE);
		}
		return processingNature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getProcessingPurpose() {
		if (processingPurpose == null) {
			processingPurpose = new EDataTypeUniqueEList<String>(String.class, this, Model4DataCtrackPackage.SLA__PROCESSING_PURPOSE);
		}
		return processingPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getProcessingInstructions() {
		if (processingInstructions == null) {
			processingInstructions = new EDataTypeUniqueEList<String>(String.class, this, Model4DataCtrackPackage.SLA__PROCESSING_INSTRUCTIONS);
		}
		return processingInstructions;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.SLA__BASE_COMPONENT, oldBase_Component, base_Component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.SLA__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatelessAppCTP> getRecipients() {
		if (recipients == null) {
			recipients = new EObjectResolvingEList<StatelessAppCTP>(StatelessAppCTP.class, this, Model4DataCtrackPackage.SLA__RECIPIENTS);
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
			case Model4DataCtrackPackage.SLA__PROCESSING_DURATION:
				return basicSetProcessingDuration(null, msgs);
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
			case Model4DataCtrackPackage.SLA__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case Model4DataCtrackPackage.SLA__SUBJECT_MATTER:
				return getSubjectMatter();
			case Model4DataCtrackPackage.SLA__PROCESSING_DURATION:
				return getProcessingDuration();
			case Model4DataCtrackPackage.SLA__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case Model4DataCtrackPackage.SLA__RECIPIENTS:
				return getRecipients();
			case Model4DataCtrackPackage.SLA__PROCESSING_NATURE:
				return getProcessingNature();
			case Model4DataCtrackPackage.SLA__PROCESSING_PURPOSE:
				return getProcessingPurpose();
			case Model4DataCtrackPackage.SLA__PROCESSING_INSTRUCTIONS:
				return getProcessingInstructions();
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
			case Model4DataCtrackPackage.SLA__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case Model4DataCtrackPackage.SLA__SUBJECT_MATTER:
				getSubjectMatter().clear();
				getSubjectMatter().addAll((Collection<? extends String>)newValue);
				return;
			case Model4DataCtrackPackage.SLA__PROCESSING_DURATION:
				setProcessingDuration((Time)newValue);
				return;
			case Model4DataCtrackPackage.SLA__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case Model4DataCtrackPackage.SLA__RECIPIENTS:
				getRecipients().clear();
				getRecipients().addAll((Collection<? extends StatelessAppCTP>)newValue);
				return;
			case Model4DataCtrackPackage.SLA__PROCESSING_NATURE:
				getProcessingNature().clear();
				getProcessingNature().addAll((Collection<? extends String>)newValue);
				return;
			case Model4DataCtrackPackage.SLA__PROCESSING_PURPOSE:
				getProcessingPurpose().clear();
				getProcessingPurpose().addAll((Collection<? extends String>)newValue);
				return;
			case Model4DataCtrackPackage.SLA__PROCESSING_INSTRUCTIONS:
				getProcessingInstructions().clear();
				getProcessingInstructions().addAll((Collection<? extends String>)newValue);
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
			case Model4DataCtrackPackage.SLA__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case Model4DataCtrackPackage.SLA__SUBJECT_MATTER:
				getSubjectMatter().clear();
				return;
			case Model4DataCtrackPackage.SLA__PROCESSING_DURATION:
				setProcessingDuration((Time)null);
				return;
			case Model4DataCtrackPackage.SLA__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case Model4DataCtrackPackage.SLA__RECIPIENTS:
				getRecipients().clear();
				return;
			case Model4DataCtrackPackage.SLA__PROCESSING_NATURE:
				getProcessingNature().clear();
				return;
			case Model4DataCtrackPackage.SLA__PROCESSING_PURPOSE:
				getProcessingPurpose().clear();
				return;
			case Model4DataCtrackPackage.SLA__PROCESSING_INSTRUCTIONS:
				getProcessingInstructions().clear();
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
			case Model4DataCtrackPackage.SLA__BASE_CLASS:
				return base_Class != null;
			case Model4DataCtrackPackage.SLA__SUBJECT_MATTER:
				return subjectMatter != null && !subjectMatter.isEmpty();
			case Model4DataCtrackPackage.SLA__PROCESSING_DURATION:
				return processingDuration != null;
			case Model4DataCtrackPackage.SLA__BASE_COMPONENT:
				return base_Component != null;
			case Model4DataCtrackPackage.SLA__RECIPIENTS:
				return recipients != null && !recipients.isEmpty();
			case Model4DataCtrackPackage.SLA__PROCESSING_NATURE:
				return processingNature != null && !processingNature.isEmpty();
			case Model4DataCtrackPackage.SLA__PROCESSING_PURPOSE:
				return processingPurpose != null && !processingPurpose.isEmpty();
			case Model4DataCtrackPackage.SLA__PROCESSING_INSTRUCTIONS:
				return processingInstructions != null && !processingInstructions.isEmpty();
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
		result.append(" (subjectMatter: ");
		result.append(subjectMatter);
		result.append(", processingNature: ");
		result.append(processingNature);
		result.append(", processingPurpose: ");
		result.append(processingPurpose);
		result.append(", processingInstructions: ");
		result.append(processingInstructions);
		result.append(')');
		return result.toString();
	}

} //SLAImpl
