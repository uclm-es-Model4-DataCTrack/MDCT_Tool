/**
 */
package Model4DataCtrack.impl;

import Model4DataCtrack.AccesPerTP;
import Model4DataCtrack.ControllerCP;
import Model4DataCtrack.Model4DataCtrackPackage;
import Model4DataCtrack.PList;
import Model4DataCtrack.PermissionPerTP;
import Model4DataCtrack.StickyPolicy;
import Model4DataCtrack.util.Model4DataCtrackValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sticky Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.impl.StickyPolicyImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.StickyPolicyImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.StickyPolicyImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.StickyPolicyImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.StickyPolicyImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.StickyPolicyImpl#getController <em>Controller</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.StickyPolicyImpl#getAccessHistory <em>Access History</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StickyPolicyImpl extends MinimalEObjectImpl.Container implements StickyPolicy {
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
	 * The cached value of the '{@link #getPermission() <em>Permission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected EList<PermissionPerTP> permission;

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
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected PList owner;

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
	 * The cached value of the '{@link #getController() <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected ControllerCP controller;

	/**
	 * The cached value of the '{@link #getAccessHistory() <em>Access History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<AccesPerTP> accessHistory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StickyPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4DataCtrackPackage.Literals.STICKY_POLICY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.STICKY_POLICY__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.STICKY_POLICY__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PermissionPerTP> getPermission() {
		if (permission == null) {
			permission = new EObjectContainmentEList<PermissionPerTP>(PermissionPerTP.class, this, Model4DataCtrackPackage.STICKY_POLICY__PERMISSION);
		}
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccesPerTP> getAccessHistory() {
		if (accessHistory == null) {
			accessHistory = new EObjectContainmentEList<AccesPerTP>(AccesPerTP.class, this, Model4DataCtrackPackage.STICKY_POLICY__ACCESS_HISTORY);
		}
		return accessHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerCP getController() {
		if (controller != null && controller.eIsProxy()) {
			InternalEObject oldController = (InternalEObject)controller;
			controller = (ControllerCP)eResolveProxy(oldController);
			if (controller != oldController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.STICKY_POLICY__CONTROLLER, oldController, controller));
			}
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerCP basicGetController() {
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setController(ControllerCP newController) {
		ControllerCP oldController = controller;
		controller = newController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.STICKY_POLICY__CONTROLLER, oldController, controller));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.STICKY_POLICY__BASE_COMPONENT, oldBase_Component, base_Component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.STICKY_POLICY__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PList getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(PList newOwner, NotificationChain msgs) {
		PList oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.STICKY_POLICY__OWNER, oldOwner, newOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(PList newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Model4DataCtrackPackage.STICKY_POLICY__OWNER, null, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Model4DataCtrackPackage.STICKY_POLICY__OWNER, null, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.STICKY_POLICY__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPurpose() {
		if (purpose == null) {
			purpose = new EDataTypeUniqueEList<String>(String.class, this, Model4DataCtrackPackage.STICKY_POLICY__PURPOSE);
		}
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean allowed_access_purpose(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Model4DataCtrackValidator.DIAGNOSTIC_SOURCE,
						 Model4DataCtrackValidator.STICKY_POLICY__ALLOWED_ACCESS_PURPOSE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "allowed_access_purpose", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean all_tps_in_history_given_permissions(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Model4DataCtrackValidator.DIAGNOSTIC_SOURCE,
						 Model4DataCtrackValidator.STICKY_POLICY__ALL_TPS_IN_HISTORY_GIVEN_PERMISSIONS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "all_tps_in_history_given_permissions", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Model4DataCtrackPackage.STICKY_POLICY__PERMISSION:
				return ((InternalEList<?>)getPermission()).basicRemove(otherEnd, msgs);
			case Model4DataCtrackPackage.STICKY_POLICY__OWNER:
				return basicSetOwner(null, msgs);
			case Model4DataCtrackPackage.STICKY_POLICY__ACCESS_HISTORY:
				return ((InternalEList<?>)getAccessHistory()).basicRemove(otherEnd, msgs);
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
			case Model4DataCtrackPackage.STICKY_POLICY__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case Model4DataCtrackPackage.STICKY_POLICY__PERMISSION:
				return getPermission();
			case Model4DataCtrackPackage.STICKY_POLICY__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case Model4DataCtrackPackage.STICKY_POLICY__OWNER:
				return getOwner();
			case Model4DataCtrackPackage.STICKY_POLICY__PURPOSE:
				return getPurpose();
			case Model4DataCtrackPackage.STICKY_POLICY__CONTROLLER:
				if (resolve) return getController();
				return basicGetController();
			case Model4DataCtrackPackage.STICKY_POLICY__ACCESS_HISTORY:
				return getAccessHistory();
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
			case Model4DataCtrackPackage.STICKY_POLICY__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case Model4DataCtrackPackage.STICKY_POLICY__PERMISSION:
				getPermission().clear();
				getPermission().addAll((Collection<? extends PermissionPerTP>)newValue);
				return;
			case Model4DataCtrackPackage.STICKY_POLICY__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case Model4DataCtrackPackage.STICKY_POLICY__OWNER:
				setOwner((PList)newValue);
				return;
			case Model4DataCtrackPackage.STICKY_POLICY__PURPOSE:
				getPurpose().clear();
				getPurpose().addAll((Collection<? extends String>)newValue);
				return;
			case Model4DataCtrackPackage.STICKY_POLICY__CONTROLLER:
				setController((ControllerCP)newValue);
				return;
			case Model4DataCtrackPackage.STICKY_POLICY__ACCESS_HISTORY:
				getAccessHistory().clear();
				getAccessHistory().addAll((Collection<? extends AccesPerTP>)newValue);
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
			case Model4DataCtrackPackage.STICKY_POLICY__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case Model4DataCtrackPackage.STICKY_POLICY__PERMISSION:
				getPermission().clear();
				return;
			case Model4DataCtrackPackage.STICKY_POLICY__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case Model4DataCtrackPackage.STICKY_POLICY__OWNER:
				setOwner((PList)null);
				return;
			case Model4DataCtrackPackage.STICKY_POLICY__PURPOSE:
				getPurpose().clear();
				return;
			case Model4DataCtrackPackage.STICKY_POLICY__CONTROLLER:
				setController((ControllerCP)null);
				return;
			case Model4DataCtrackPackage.STICKY_POLICY__ACCESS_HISTORY:
				getAccessHistory().clear();
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
			case Model4DataCtrackPackage.STICKY_POLICY__BASE_CLASS:
				return base_Class != null;
			case Model4DataCtrackPackage.STICKY_POLICY__PERMISSION:
				return permission != null && !permission.isEmpty();
			case Model4DataCtrackPackage.STICKY_POLICY__BASE_COMPONENT:
				return base_Component != null;
			case Model4DataCtrackPackage.STICKY_POLICY__OWNER:
				return owner != null;
			case Model4DataCtrackPackage.STICKY_POLICY__PURPOSE:
				return purpose != null && !purpose.isEmpty();
			case Model4DataCtrackPackage.STICKY_POLICY__CONTROLLER:
				return controller != null;
			case Model4DataCtrackPackage.STICKY_POLICY__ACCESS_HISTORY:
				return accessHistory != null && !accessHistory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Model4DataCtrackPackage.STICKY_POLICY___ALLOWED_ACCESS_PURPOSE__DIAGNOSTICCHAIN_MAP:
				return allowed_access_purpose((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Model4DataCtrackPackage.STICKY_POLICY___ALL_TPS_IN_HISTORY_GIVEN_PERMISSIONS__DIAGNOSTICCHAIN_MAP:
				return all_tps_in_history_given_permissions((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(')');
		return result.toString();
	}

} //StickyPolicyImpl
