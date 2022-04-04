/**
 */
package Model4DataCtrack.impl;

import Model4DataCtrack.Model4DataCtrackPackage;
import Model4DataCtrack.PList;
import Model4DataCtrack.PermissionPerTP;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permission Per TP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.impl.PermissionPerTPImpl#getS <em>S</em>}</li>
 *   <li>{@link Model4DataCtrack.impl.PermissionPerTPImpl#getI <em>I</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissionPerTPImpl extends MinimalEObjectImpl.Container implements PermissionPerTP {
	/**
	 * The cached value of the '{@link #getS() <em>S</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected EList<PList> s;

	/**
	 * The cached value of the '{@link #getI() <em>I</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI()
	 * @generated
	 * @ordered
	 */
	protected EList<PList> i;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionPerTPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4DataCtrackPackage.Literals.PERMISSION_PER_TP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PList> getS() {
		if (s == null) {
			s = new EObjectContainmentEList<PList>(PList.class, this, Model4DataCtrackPackage.PERMISSION_PER_TP__S);
		}
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PList> getI() {
		if (i == null) {
			i = new EObjectContainmentEList<PList>(PList.class, this, Model4DataCtrackPackage.PERMISSION_PER_TP__I);
		}
		return i;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Model4DataCtrackPackage.PERMISSION_PER_TP__S:
				return ((InternalEList<?>)getS()).basicRemove(otherEnd, msgs);
			case Model4DataCtrackPackage.PERMISSION_PER_TP__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
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
			case Model4DataCtrackPackage.PERMISSION_PER_TP__S:
				return getS();
			case Model4DataCtrackPackage.PERMISSION_PER_TP__I:
				return getI();
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
			case Model4DataCtrackPackage.PERMISSION_PER_TP__S:
				getS().clear();
				getS().addAll((Collection<? extends PList>)newValue);
				return;
			case Model4DataCtrackPackage.PERMISSION_PER_TP__I:
				getI().clear();
				getI().addAll((Collection<? extends PList>)newValue);
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
			case Model4DataCtrackPackage.PERMISSION_PER_TP__S:
				getS().clear();
				return;
			case Model4DataCtrackPackage.PERMISSION_PER_TP__I:
				getI().clear();
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
			case Model4DataCtrackPackage.PERMISSION_PER_TP__S:
				return s != null && !s.isEmpty();
			case Model4DataCtrackPackage.PERMISSION_PER_TP__I:
				return i != null && !i.isEmpty();
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
		result.append(" <");
		result.append(this.s);
		result.append(", ");
		result.append(this.i);
		result.append('>');
		return result.toString();
	}

} //PermissionPerTPImpl
