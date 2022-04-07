/**
 */
package model4datactrackprofile.impl;

import java.util.Collection;

import model4datactrackprofile.DataArchive;
import model4datactrackprofile.DataField;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Archive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.impl.DataArchiveImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link model4datactrackprofile.impl.DataArchiveImpl#getIdData <em>Id Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataArchiveImpl extends MinimalEObjectImpl.Container implements DataArchive {
	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<DataField> contents;

	/**
	 * The default value of the '{@link #getIdData() <em>Id Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdData()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdData() <em>Id Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdData()
	 * @generated
	 * @ordered
	 */
	protected String idData = ID_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataArchiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4datactrackprofilePackage.Literals.DATA_ARCHIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataField> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<DataField>(DataField.class, this, Model4datactrackprofilePackage.DATA_ARCHIVE__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdData() {
		return idData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdData(String newIdData) {
		String oldIdData = idData;
		idData = newIdData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Model4datactrackprofilePackage.DATA_ARCHIVE__ID_DATA, oldIdData, idData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Model4datactrackprofilePackage.DATA_ARCHIVE__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
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
			case Model4datactrackprofilePackage.DATA_ARCHIVE__CONTENTS:
				return getContents();
			case Model4datactrackprofilePackage.DATA_ARCHIVE__ID_DATA:
				return getIdData();
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
			case Model4datactrackprofilePackage.DATA_ARCHIVE__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends DataField>)newValue);
				return;
			case Model4datactrackprofilePackage.DATA_ARCHIVE__ID_DATA:
				setIdData((String)newValue);
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
			case Model4datactrackprofilePackage.DATA_ARCHIVE__CONTENTS:
				getContents().clear();
				return;
			case Model4datactrackprofilePackage.DATA_ARCHIVE__ID_DATA:
				setIdData(ID_DATA_EDEFAULT);
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
			case Model4datactrackprofilePackage.DATA_ARCHIVE__CONTENTS:
				return contents != null && !contents.isEmpty();
			case Model4datactrackprofilePackage.DATA_ARCHIVE__ID_DATA:
				return ID_DATA_EDEFAULT == null ? idData != null : !ID_DATA_EDEFAULT.equals(idData);
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
		result.append(" (idData: ");
		result.append(idData);
		result.append(')');
		return result.toString();
	}

} //DataArchiveImpl
