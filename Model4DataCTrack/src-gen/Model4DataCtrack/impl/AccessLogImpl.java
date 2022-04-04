/**
 */
package Model4DataCtrack.impl;

import Model4DataCtrack.AccessLog;
import Model4DataCtrack.ActionType;
import Model4DataCtrack.Model4DataCtrackPackage;
import Model4DataCtrack.PList;
import Model4DataCtrack.StatelessAppCTP;
import Model4DataCtrack.StickyPolicy;

import Model4DataCtrack.Storage;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.impl.AccessLogImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.AccessLogImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.AccessLogImpl#getTp <em>Tp</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.AccessLogImpl#getL1 <em>L1</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.AccessLogImpl#getSp1 <em>Sp1</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.AccessLogImpl#getO <em>O</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.AccessLogImpl#getAction <em>Action</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.AccessLogImpl#getNl <em>Nl</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.AccessLogImpl#getNsp <em>Nsp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessLogImpl extends MinimalEObjectImpl.Container implements AccessLog {
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
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected Component base_Component;

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
	 * The cached value of the '{@link #getL1() <em>L1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1()
	 * @generated
	 * @ordered
	 */
	protected Storage l1;

	/**
	 * The cached value of the '{@link #getSp1() <em>Sp1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSp1()
	 * @generated
	 * @ordered
	 */
	protected StickyPolicy sp1;

	/**
	 * The cached value of the '{@link #getO() <em>O</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getO()
	 * @generated
	 * @ordered
	 */
	protected EList<PList> o;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final ActionType ACTION_EDEFAULT = ActionType.READ;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected ActionType action = ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNl() <em>Nl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNl()
	 * @generated
	 * @ordered
	 */
	protected Storage nl;

	/**
	 * The cached value of the '{@link #getNsp() <em>Nsp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsp()
	 * @generated
	 * @ordered
	 */
	protected StickyPolicy nsp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4DataCtrackPackage.Literals.ACCESS_LOG;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.ACCESS_LOG__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.ACCESS_LOG__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ActionType newAction) {
		ActionType oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.ACCESS_LOG__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage getNl() {
		if (nl != null && nl.eIsProxy()) {
			InternalEObject oldNl = (InternalEObject)nl;
			nl = (Storage)eResolveProxy(oldNl);
			if (nl != oldNl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.ACCESS_LOG__NL, oldNl, nl));
			}
		}
		return nl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage basicGetNl() {
		return nl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNl(Storage newNl) {
		Storage oldNl = nl;
		nl = newNl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.ACCESS_LOG__NL, oldNl, nl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StickyPolicy getNsp() {
		if (nsp != null && nsp.eIsProxy()) {
			InternalEObject oldNsp = (InternalEObject)nsp;
			nsp = (StickyPolicy)eResolveProxy(oldNsp);
			if (nsp != oldNsp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.ACCESS_LOG__NSP, oldNsp, nsp));
			}
		}
		return nsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StickyPolicy basicGetNsp() {
		return nsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNsp(StickyPolicy newNsp) {
		StickyPolicy oldNsp = nsp;
		nsp = newNsp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.ACCESS_LOG__NSP, oldNsp, nsp));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.ACCESS_LOG__TP, oldTp, tp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.ACCESS_LOG__TP, oldTp, tp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage getL1() {
		if (l1 != null && l1.eIsProxy()) {
			InternalEObject oldL1 = (InternalEObject)l1;
			l1 = (Storage)eResolveProxy(oldL1);
			if (l1 != oldL1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.ACCESS_LOG__L1, oldL1, l1));
			}
		}
		return l1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage basicGetL1() {
		return l1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL1(Storage newL1) {
		Storage oldL1 = l1;
		l1 = newL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.ACCESS_LOG__L1, oldL1, l1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StickyPolicy getSp1() {
		if (sp1 != null && sp1.eIsProxy()) {
			InternalEObject oldSp1 = (InternalEObject)sp1;
			sp1 = (StickyPolicy)eResolveProxy(oldSp1);
			if (sp1 != oldSp1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.ACCESS_LOG__SP1, oldSp1, sp1));
			}
		}
		return sp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StickyPolicy basicGetSp1() {
		return sp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSp1(StickyPolicy newSp1) {
		StickyPolicy oldSp1 = sp1;
		sp1 = newSp1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.ACCESS_LOG__SP1, oldSp1, sp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PList> getO() {
		if (o == null) {
			o = new EObjectContainmentEList<PList>(PList.class, this, Model4DataCtrackPackage.ACCESS_LOG__O);
		}
		return o;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.ACCESS_LOG__BASE_COMPONENT, oldBase_Component, base_Component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.ACCESS_LOG__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean log_access_match_sp_access(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Model4DataCtrackValidator.ACCESS_LOG__LOG_ACCESS_MATCH_SP_ACCESS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "log_access_match_sp_access", EObjectValidator.getObjectLabel(this, context) }),
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
			case Model4DataCtrackPackage.ACCESS_LOG__O:
				return ((InternalEList<?>)getO()).basicRemove(otherEnd, msgs);
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
			case Model4DataCtrackPackage.ACCESS_LOG__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case Model4DataCtrackPackage.ACCESS_LOG__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case Model4DataCtrackPackage.ACCESS_LOG__TP:
				if (resolve) return getTp();
				return basicGetTp();
			case Model4DataCtrackPackage.ACCESS_LOG__L1:
				if (resolve) return getL1();
				return basicGetL1();
			case Model4DataCtrackPackage.ACCESS_LOG__SP1:
				if (resolve) return getSp1();
				return basicGetSp1();
			case Model4DataCtrackPackage.ACCESS_LOG__O:
				return getO();
			case Model4DataCtrackPackage.ACCESS_LOG__ACTION:
				return getAction();
			case Model4DataCtrackPackage.ACCESS_LOG__NL:
				if (resolve) return getNl();
				return basicGetNl();
			case Model4DataCtrackPackage.ACCESS_LOG__NSP:
				if (resolve) return getNsp();
				return basicGetNsp();
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
			case Model4DataCtrackPackage.ACCESS_LOG__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case Model4DataCtrackPackage.ACCESS_LOG__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case Model4DataCtrackPackage.ACCESS_LOG__TP:
				setTp((StatelessAppCTP)newValue);
				return;
			case Model4DataCtrackPackage.ACCESS_LOG__L1:
				setL1((Storage)newValue);
				return;
			case Model4DataCtrackPackage.ACCESS_LOG__SP1:
				setSp1((StickyPolicy)newValue);
				return;
			case Model4DataCtrackPackage.ACCESS_LOG__O:
				getO().clear();
				getO().addAll((Collection<? extends PList>)newValue);
				return;
			case Model4DataCtrackPackage.ACCESS_LOG__ACTION:
				setAction((ActionType)newValue);
				return;
			case Model4DataCtrackPackage.ACCESS_LOG__NL:
				setNl((Storage)newValue);
				return;
			case Model4DataCtrackPackage.ACCESS_LOG__NSP:
				setNsp((StickyPolicy)newValue);
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
			case Model4DataCtrackPackage.ACCESS_LOG__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case Model4DataCtrackPackage.ACCESS_LOG__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case Model4DataCtrackPackage.ACCESS_LOG__TP:
				setTp((StatelessAppCTP)null);
				return;
			case Model4DataCtrackPackage.ACCESS_LOG__L1:
				setL1((Storage)null);
				return;
			case Model4DataCtrackPackage.ACCESS_LOG__SP1:
				setSp1((StickyPolicy)null);
				return;
			case Model4DataCtrackPackage.ACCESS_LOG__O:
				getO().clear();
				return;
			case Model4DataCtrackPackage.ACCESS_LOG__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case Model4DataCtrackPackage.ACCESS_LOG__NL:
				setNl((Storage)null);
				return;
			case Model4DataCtrackPackage.ACCESS_LOG__NSP:
				setNsp((StickyPolicy)null);
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
			case Model4DataCtrackPackage.ACCESS_LOG__BASE_CLASS:
				return base_Class != null;
			case Model4DataCtrackPackage.ACCESS_LOG__BASE_COMPONENT:
				return base_Component != null;
			case Model4DataCtrackPackage.ACCESS_LOG__TP:
				return tp != null;
			case Model4DataCtrackPackage.ACCESS_LOG__L1:
				return l1 != null;
			case Model4DataCtrackPackage.ACCESS_LOG__SP1:
				return sp1 != null;
			case Model4DataCtrackPackage.ACCESS_LOG__O:
				return o != null && !o.isEmpty();
			case Model4DataCtrackPackage.ACCESS_LOG__ACTION:
				return action != ACTION_EDEFAULT;
			case Model4DataCtrackPackage.ACCESS_LOG__NL:
				return nl != null;
			case Model4DataCtrackPackage.ACCESS_LOG__NSP:
				return nsp != null;
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
			case Model4DataCtrackPackage.ACCESS_LOG___LOG_ACCESS_MATCH_SP_ACCESS__DIAGNOSTICCHAIN_MAP:
				return log_access_match_sp_access((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //AccessLogImpl
