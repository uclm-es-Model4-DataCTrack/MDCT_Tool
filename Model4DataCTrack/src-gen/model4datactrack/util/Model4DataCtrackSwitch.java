/**
 */
package Model4DataCtrack.util;

import Model4DataCtrack.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Model4DataCtrack.Model4DataCtrackPackage
 * @generated
 */
public class Model4DataCtrackSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Model4DataCtrackPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model4DataCtrackSwitch() {
		if (modelPackage == null) {
			modelPackage = Model4DataCtrackPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Model4DataCtrackPackage.INFRASTRUCTURE: {
				Infrastructure infrastructure = (Infrastructure)theEObject;
				T result = caseInfrastructure(infrastructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.BANDWIDTH: {
				Bandwidth bandwidth = (Bandwidth)theEObject;
				T result = caseBandwidth(bandwidth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.CONTROLLER_CP: {
				ControllerCP controllerCP = (ControllerCP)theEObject;
				T result = caseControllerCP(controllerCP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.SLA: {
				SLA sla = (SLA)theEObject;
				T result = caseSLA(sla);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.STATELESS_APP_CTP: {
				StatelessAppCTP statelessAppCTP = (StatelessAppCTP)theEObject;
				T result = caseStatelessAppCTP(statelessAppCTP);
				if (result == null) result = casePrincipal(statelessAppCTP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.PRINCIPAL: {
				Principal principal = (Principal)theEObject;
				T result = casePrincipal(principal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.ACCESS_LOG: {
				AccessLog accessLog = (AccessLog)theEObject;
				T result = caseAccessLog(accessLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.STORAGE: {
				Storage storage = (Storage)theEObject;
				T result = caseStorage(storage);
				if (result == null) result = caseHardware(storage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.HARDWARE: {
				Hardware hardware = (Hardware)theEObject;
				T result = caseHardware(hardware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.SIZE: {
				Size size = (Size)theEObject;
				T result = caseSize(size);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.DATA_ARCHIVE: {
				DataArchive dataArchive = (DataArchive)theEObject;
				T result = caseDataArchive(dataArchive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.DATA_FIELD: {
				DataField dataField = (DataField)theEObject;
				T result = caseDataField(dataField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.STICKY_POLICY: {
				StickyPolicy stickyPolicy = (StickyPolicy)theEObject;
				T result = caseStickyPolicy(stickyPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.PERMISSION_PER_TP: {
				PermissionPerTP permissionPerTP = (PermissionPerTP)theEObject;
				T result = casePermissionPerTP(permissionPerTP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.PLIST: {
				PList pList = (PList)theEObject;
				T result = casePList(pList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.ACCES_PER_TP: {
				AccesPerTP accesPerTP = (AccesPerTP)theEObject;
				T result = caseAccesPerTP(accesPerTP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.DATA_CENTER_ELEMENT: {
				DataCenterElement dataCenterElement = (DataCenterElement)theEObject;
				T result = caseDataCenterElement(dataCenterElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.DATA_CENTER: {
				DataCenter dataCenter = (DataCenter)theEObject;
				T result = caseDataCenter(dataCenter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.RACK_ELEMENT: {
				RackElement rackElement = (RackElement)theEObject;
				T result = caseRackElement(rackElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.RACK: {
				Rack rack = (Rack)theEObject;
				T result = caseRack(rack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.MACHINE: {
				Machine machine = (Machine)theEObject;
				T result = caseMachine(machine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.CPU: {
				CPU cpu = (CPU)theEObject;
				T result = caseCPU(cpu);
				if (result == null) result = caseHardware(cpu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.MEMORY: {
				Memory memory = (Memory)theEObject;
				T result = caseMemory(memory);
				if (result == null) result = caseHardware(memory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.LATENCY: {
				Latency latency = (Latency)theEObject;
				T result = caseLatency(latency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.COMPUTING_RACK: {
				ComputingRack computingRack = (ComputingRack)theEObject;
				T result = caseComputingRack(computingRack);
				if (result == null) result = caseRack(computingRack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.STATELESS_COMPUTATION_MACHINE: {
				StatelessComputationMachine statelessComputationMachine = (StatelessComputationMachine)theEObject;
				T result = caseStatelessComputationMachine(statelessComputationMachine);
				if (result == null) result = caseMachine(statelessComputationMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.STORAGE_RACK: {
				StorageRack storageRack = (StorageRack)theEObject;
				T result = caseStorageRack(storageRack);
				if (result == null) result = caseRack(storageRack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.SSM_PROCESSOR: {
				SSMProcessor ssmProcessor = (SSMProcessor)theEObject;
				T result = caseSSMProcessor(ssmProcessor);
				if (result == null) result = caseMachine(ssmProcessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = casePrincipal(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.SEND_DATA: {
				sendData sendData = (sendData)theEObject;
				T result = casesendData(sendData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.NEW_RESTRICTIONS: {
				newRestrictions newRestrictions = (newRestrictions)theEObject;
				T result = casenewRestrictions(newRestrictions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.RECTIFY_DATA: {
				rectifyData rectifyData = (rectifyData)theEObject;
				T result = caserectifyData(rectifyData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.REMOVE_DATA: {
				removeData removeData = (removeData)theEObject;
				T result = caseremoveData(removeData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.ERASE_DATA: {
				eraseData eraseData = (eraseData)theEObject;
				T result = caseeraseData(eraseData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.CONSENT: {
				consent consent = (consent)theEObject;
				T result = caseconsent(consent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.ASK_AUTHENTICATION: {
				askAuthentication askAuthentication = (askAuthentication)theEObject;
				T result = caseaskAuthentication(askAuthentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.TP: {
				tp tp = (tp)theEObject;
				T result = casetp(tp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.READ_DATA: {
				readData readData = (readData)theEObject;
				T result = casereadData(readData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.PERMISSION: {
				permission permission = (permission)theEObject;
				T result = casepermission(permission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.NOTIFY: {
				notify notify = (notify)theEObject;
				T result = casenotify(notify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.UP_DATE: {
				upDate upDate = (upDate)theEObject;
				T result = caseupDate(upDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.NEW_DATA: {
				newData newData = (newData)theEObject;
				T result = casenewData(newData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.ASK_DATA_INFORMATION: {
				askDataInformation askDataInformation = (askDataInformation)theEObject;
				T result = caseaskDataInformation(askDataInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.REPORT_DATA_MANAGEMENT: {
				reportDataManagement reportDataManagement = (reportDataManagement)theEObject;
				T result = casereportDataManagement(reportDataManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.SUBSCRIBE: {
				subscribe subscribe = (subscribe)theEObject;
				T result = casesubscribe(subscribe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.INFORM_BREACHES: {
				informBreaches informBreaches = (informBreaches)theEObject;
				T result = caseinformBreaches(informBreaches);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.TIMEOUT_SUBSCRIPTION: {
				timeoutSubscription timeoutSubscription = (timeoutSubscription)theEObject;
				T result = casetimeoutSubscription(timeoutSubscription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.WRITE_DATA: {
				writeData writeData = (writeData)theEObject;
				T result = casewriteData(writeData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.ACCESS_INFORMATION: {
				accessInformation accessInformation = (accessInformation)theEObject;
				T result = caseaccessInformation(accessInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.REMOVE_SP_IN_LOG: {
				removeSPInLog removeSPInLog = (removeSPInLog)theEObject;
				T result = caseremoveSPInLog(removeSPInLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.INFO: {
				Info info = (Info)theEObject;
				T result = caseInfo(info);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.TRUSTED_SCM: {
				TrustedSCM trustedSCM = (TrustedSCM)theEObject;
				T result = caseTrustedSCM(trustedSCM);
				if (result == null) result = caseStatelessComputationMachine(trustedSCM);
				if (result == null) result = caseMachine(trustedSCM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.UNTRUSTED_SCM: {
				UntrustedSCM untrustedSCM = (UntrustedSCM)theEObject;
				T result = caseUntrustedSCM(untrustedSCM);
				if (result == null) result = caseStatelessComputationMachine(untrustedSCM);
				if (result == null) result = caseMachine(untrustedSCM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.CONSENT_INFO: {
				consentInfo consentInfo = (consentInfo)theEObject;
				T result = caseconsentInfo(consentInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.OK: {
				ok ok = (ok)theEObject;
				T result = caseok(ok);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.INFORMATION_NOT_FOR_FREE: {
				informationNotForFree informationNotForFree = (informationNotForFree)theEObject;
				T result = caseinformationNotForFree(informationNotForFree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.WANT_TO_ACCESS: {
				wantToAccess wantToAccess = (wantToAccess)theEObject;
				T result = casewantToAccess(wantToAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.REPORT_DATA_DMANAGEMENT_FOR_FREE: {
				reportDataDManagementForFree reportDataDManagementForFree = (reportDataDManagementForFree)theEObject;
				T result = casereportDataDManagementForFree(reportDataDManagementForFree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.CHECK_CHANGES: {
				checkChanges checkChanges = (checkChanges)theEObject;
				T result = casecheckChanges(checkChanges);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Model4DataCtrackPackage.SP: {
				SP sp = (SP)theEObject;
				T result = caseSP(sp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructure(Infrastructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bandwidth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bandwidth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBandwidth(Bandwidth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller CP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller CP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerCP(ControllerCP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SLA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SLA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSLA(SLA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessLog(AccessLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SSM Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SSM Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSSMProcessor(SSMProcessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine(Machine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCPU(CPU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardware(Hardware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemory(Memory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSize(Size object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Latency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Latency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLatency(Latency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Archive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Archive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataArchive(DataArchive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataField(DataField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sticky Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sticky Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStickyPolicy(StickyPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permission Per TP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permission Per TP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermissionPerTP(PermissionPerTP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PList</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PList</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePList(PList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Principal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Principal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrincipal(Principal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stateless App CTP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stateless App CTP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatelessAppCTP(StatelessAppCTP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acces Per TP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acces Per TP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccesPerTP(AccesPerTP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Center Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Center Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCenterElement(DataCenterElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Center</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Center</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCenter(DataCenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rack Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rack Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRackElement(RackElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRack(Rack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computing Rack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computing Rack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputingRack(ComputingRack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stateless Computation Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stateless Computation Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatelessComputationMachine(StatelessComputationMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Rack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Rack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageRack(StorageRack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>send Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>send Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesendData(sendData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>new Restrictions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>new Restrictions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenewRestrictions(newRestrictions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>rectify Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>rectify Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caserectifyData(rectifyData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>remove Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>remove Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseremoveData(removeData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>erase Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>erase Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseeraseData(eraseData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>consent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>consent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconsent(consent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ask Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ask Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaskAuthentication(askAuthentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetp(tp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>read Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>read Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casereadData(readData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepermission(permission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>notify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>notify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenotify(notify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>up Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>up Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseupDate(upDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>new Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>new Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenewData(newData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ask Data Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ask Data Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaskDataInformation(askDataInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>report Data Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>report Data Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casereportDataManagement(reportDataManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>subscribe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>subscribe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesubscribe(subscribe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>inform Breaches</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>inform Breaches</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseinformBreaches(informBreaches object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>timeout Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>timeout Subscription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetimeoutSubscription(timeoutSubscription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>write Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>write Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewriteData(writeData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>access Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>access Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaccessInformation(accessInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>remove SP In Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>remove SP In Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseremoveSPInLog(removeSPInLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfo(Info object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trusted SCM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trusted SCM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrustedSCM(TrustedSCM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Untrusted SCM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Untrusted SCM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUntrustedSCM(UntrustedSCM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>consent Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>consent Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconsentInfo(consentInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ok</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ok</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseok(ok object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>information Not For Free</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>information Not For Free</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseinformationNotForFree(informationNotForFree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>want To Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>want To Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewantToAccess(wantToAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>report Data DManagement For Free</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>report Data DManagement For Free</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casereportDataDManagementForFree(reportDataDManagementForFree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>check Changes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>check Changes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecheckChanges(checkChanges object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSP(SP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Model4DataCtrackSwitch
