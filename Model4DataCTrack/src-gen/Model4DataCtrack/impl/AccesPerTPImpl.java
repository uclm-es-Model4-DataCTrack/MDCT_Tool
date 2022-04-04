/**
 */
package Model4DataCtrack.impl;

import Model4DataCtrack.AccesPerTP;
import Model4DataCtrack.ActionType;
import Model4DataCtrack.Model4DataCtrackPackage;
import Model4DataCtrack.StatelessAppCTP;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acces Per TP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.impl.AccesPerTPImpl#getTp <em>Tp</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.AccesPerTPImpl#getActionPerformed <em>Action Performed</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.AccesPerTPImpl#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccesPerTPImpl extends MinimalEObjectImpl.Container implements AccesPerTP {
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
	 * The default value of the '{@link #getActionPerformed() <em>Action Performed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionPerformed()
	 * @generated
	 * @ordered
	 */
	protected static final ActionType ACTION_PERFORMED_EDEFAULT = ActionType.READ;

	/**
	 * The cached value of the '{@link #getActionPerformed() <em>Action Performed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionPerformed()
	 * @generated
	 * @ordered
	 */
	protected ActionType actionPerformed = ACTION_PERFORMED_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccesPerTPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4DataCtrackPackage.Literals.ACCES_PER_TP;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Model4DataCtrackPackage.ACCES_PER_TP__TP, oldTp, tp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.ACCES_PER_TP__TP, oldTp, tp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType getActionPerformed() {
		return actionPerformed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionPerformed(ActionType newActionPerformed) {
		ActionType oldActionPerformed = actionPerformed;
		actionPerformed = newActionPerformed == null ? ACTION_PERFORMED_EDEFAULT : newActionPerformed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4DataCtrackPackage.ACCES_PER_TP__ACTION_PERFORMED, oldActionPerformed, actionPerformed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPurpose() {
		if (purpose == null) {
			purpose = new EDataTypeUniqueEList<String>(String.class, this, Model4DataCtrackPackage.ACCES_PER_TP__PURPOSE);
		}
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Model4DataCtrackPackage.ACCES_PER_TP__TP:
				if (resolve) return getTp();
				return basicGetTp();
			case Model4DataCtrackPackage.ACCES_PER_TP__ACTION_PERFORMED:
				return getActionPerformed();
			case Model4DataCtrackPackage.ACCES_PER_TP__PURPOSE:
				return getPurpose();
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
			case Model4DataCtrackPackage.ACCES_PER_TP__TP:
				setTp((StatelessAppCTP)newValue);
				return;
			case Model4DataCtrackPackage.ACCES_PER_TP__ACTION_PERFORMED:
				setActionPerformed((ActionType)newValue);
				return;
			case Model4DataCtrackPackage.ACCES_PER_TP__PURPOSE:
				getPurpose().clear();
				getPurpose().addAll((Collection<? extends String>)newValue);
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
			case Model4DataCtrackPackage.ACCES_PER_TP__TP:
				setTp((StatelessAppCTP)null);
				return;
			case Model4DataCtrackPackage.ACCES_PER_TP__ACTION_PERFORMED:
				setActionPerformed(ACTION_PERFORMED_EDEFAULT);
				return;
			case Model4DataCtrackPackage.ACCES_PER_TP__PURPOSE:
				getPurpose().clear();
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
			case Model4DataCtrackPackage.ACCES_PER_TP__TP:
				return tp != null;
			case Model4DataCtrackPackage.ACCES_PER_TP__ACTION_PERFORMED:
				return actionPerformed != ACTION_PERFORMED_EDEFAULT;
			case Model4DataCtrackPackage.ACCES_PER_TP__PURPOSE:
				return purpose != null && !purpose.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder();
		result.append(" (");
		result.append(this.tp);
		result.append(", ");
		result.append(purpose);
		result.append(", ");
		result.append(actionPerformed);
		result.append(')');
		return result.toString();
	}

} //AccesPerTPImpl
