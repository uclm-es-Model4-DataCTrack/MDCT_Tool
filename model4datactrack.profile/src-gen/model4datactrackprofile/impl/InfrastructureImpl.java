/**
 */
package model4datactrackprofile.impl;

import java.util.Collection;

import model4datactrackprofile.Bandwidth;
import model4datactrackprofile.ControllerCP;
import model4datactrackprofile.DataCenterElement;
import model4datactrackprofile.Infrastructure;
import model4datactrackprofile.Model4datactrackprofilePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.impl.InfrastructureImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.InfrastructureImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.InfrastructureImpl#getCloudProvider <em>Cloud Provider</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.InfrastructureImpl#getDatacenterelements <em>Datacenterelements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureImpl extends MinimalEObjectImpl.Container implements Infrastructure {
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
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected Bandwidth network;

	/**
	 * The cached value of the '{@link #getCloudProvider() <em>Cloud Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudProvider()
	 * @generated
	 * @ordered
	 */
	protected ControllerCP cloudProvider;

	/**
	 * The cached value of the '{@link #getDatacenterelements() <em>Datacenterelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterelements()
	 * @generated
	 * @ordered
	 */
	protected EList<DataCenterElement> datacenterelements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4datactrackprofilePackage.Literals.INFRASTRUCTURE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.INFRASTRUCTURE__BASE_COMPONENT, oldBase_Component, base_Component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.INFRASTRUCTURE__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bandwidth getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(Bandwidth newNetwork, NotificationChain msgs) {
		Bandwidth oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.INFRASTRUCTURE__NETWORK, oldNetwork, newNetwork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(Bandwidth newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject)network).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model4datactrackprofilePackage.INFRASTRUCTURE__NETWORK, null, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject)newNetwork).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model4datactrackprofilePackage.INFRASTRUCTURE__NETWORK, null, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.INFRASTRUCTURE__NETWORK, newNetwork, newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerCP getCloudProvider() {
		if (cloudProvider != null && cloudProvider.eIsProxy()) {
			InternalEObject oldCloudProvider = (InternalEObject)cloudProvider;
			cloudProvider = (ControllerCP)eResolveProxy(oldCloudProvider);
			if (cloudProvider != oldCloudProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4datactrackprofilePackage.INFRASTRUCTURE__CLOUD_PROVIDER, oldCloudProvider, cloudProvider));
			}
		}
		return cloudProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerCP basicGetCloudProvider() {
		return cloudProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudProvider(ControllerCP newCloudProvider) {
		ControllerCP oldCloudProvider = cloudProvider;
		cloudProvider = newCloudProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.INFRASTRUCTURE__CLOUD_PROVIDER, oldCloudProvider, cloudProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataCenterElement> getDatacenterelements() {
		if (datacenterelements == null) {
			datacenterelements = new EObjectContainmentEList<DataCenterElement>(DataCenterElement.class, this, Model4datactrackprofilePackage.INFRASTRUCTURE__DATACENTERELEMENTS);
		}
		return datacenterelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Model4datactrackprofilePackage.INFRASTRUCTURE__NETWORK:
				return basicSetNetwork(null, msgs);
			case Model4datactrackprofilePackage.INFRASTRUCTURE__DATACENTERELEMENTS:
				return ((InternalEList<?>)getDatacenterelements()).basicRemove(otherEnd, msgs);
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
			case Model4datactrackprofilePackage.INFRASTRUCTURE__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case Model4datactrackprofilePackage.INFRASTRUCTURE__NETWORK:
				return getNetwork();
			case Model4datactrackprofilePackage.INFRASTRUCTURE__CLOUD_PROVIDER:
				if (resolve) return getCloudProvider();
				return basicGetCloudProvider();
			case Model4datactrackprofilePackage.INFRASTRUCTURE__DATACENTERELEMENTS:
				return getDatacenterelements();
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
			case Model4datactrackprofilePackage.INFRASTRUCTURE__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case Model4datactrackprofilePackage.INFRASTRUCTURE__NETWORK:
				setNetwork((Bandwidth)newValue);
				return;
			case Model4datactrackprofilePackage.INFRASTRUCTURE__CLOUD_PROVIDER:
				setCloudProvider((ControllerCP)newValue);
				return;
			case Model4datactrackprofilePackage.INFRASTRUCTURE__DATACENTERELEMENTS:
				getDatacenterelements().clear();
				getDatacenterelements().addAll((Collection<? extends DataCenterElement>)newValue);
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
			case Model4datactrackprofilePackage.INFRASTRUCTURE__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case Model4datactrackprofilePackage.INFRASTRUCTURE__NETWORK:
				setNetwork((Bandwidth)null);
				return;
			case Model4datactrackprofilePackage.INFRASTRUCTURE__CLOUD_PROVIDER:
				setCloudProvider((ControllerCP)null);
				return;
			case Model4datactrackprofilePackage.INFRASTRUCTURE__DATACENTERELEMENTS:
				getDatacenterelements().clear();
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
			case Model4datactrackprofilePackage.INFRASTRUCTURE__BASE_COMPONENT:
				return base_Component != null;
			case Model4datactrackprofilePackage.INFRASTRUCTURE__NETWORK:
				return network != null;
			case Model4datactrackprofilePackage.INFRASTRUCTURE__CLOUD_PROVIDER:
				return cloudProvider != null;
			case Model4datactrackprofilePackage.INFRASTRUCTURE__DATACENTERELEMENTS:
				return datacenterelements != null && !datacenterelements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InfrastructureImpl
