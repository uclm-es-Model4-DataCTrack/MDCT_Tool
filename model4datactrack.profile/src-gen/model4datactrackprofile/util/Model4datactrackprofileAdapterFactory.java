/**
 */
package model4datactrackprofile.util;

import model4datactrackprofile.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model4datactrackprofile.Model4datactrackprofilePackage
 * @generated
 */
public class Model4datactrackprofileAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Model4datactrackprofilePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model4datactrackprofileAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Model4datactrackprofilePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Model4datactrackprofileSwitch<Adapter> modelSwitch =
		new Model4datactrackprofileSwitch<Adapter>() {
			@Override
			public Adapter caseInfrastructure(Infrastructure object) {
				return createInfrastructureAdapter();
			}
			@Override
			public Adapter caseBandwidth(Bandwidth object) {
				return createBandwidthAdapter();
			}
			@Override
			public Adapter caseControllerCP(ControllerCP object) {
				return createControllerCPAdapter();
			}
			@Override
			public Adapter caseSLA(SLA object) {
				return createSLAAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter caseStatelessAppCTP(StatelessAppCTP object) {
				return createStatelessAppCTPAdapter();
			}
			@Override
			public Adapter casePrincipal(Principal object) {
				return createPrincipalAdapter();
			}
			@Override
			public Adapter caseAccessLog(AccessLog object) {
				return createAccessLogAdapter();
			}
			@Override
			public Adapter caseStorage(Storage object) {
				return createStorageAdapter();
			}
			@Override
			public Adapter caseHardware(Hardware object) {
				return createHardwareAdapter();
			}
			@Override
			public Adapter caseSize(Size object) {
				return createSizeAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseDataArchive(DataArchive object) {
				return createDataArchiveAdapter();
			}
			@Override
			public Adapter caseDataField(DataField object) {
				return createDataFieldAdapter();
			}
			@Override
			public Adapter caseStickyPolicy(StickyPolicy object) {
				return createStickyPolicyAdapter();
			}
			@Override
			public Adapter casePermissionPerTP(PermissionPerTP object) {
				return createPermissionPerTPAdapter();
			}
			@Override
			public Adapter casePList(PList object) {
				return createPListAdapter();
			}
			@Override
			public Adapter caseAccesPerTP(AccesPerTP object) {
				return createAccesPerTPAdapter();
			}
			@Override
			public Adapter caseDataCenterElement(DataCenterElement object) {
				return createDataCenterElementAdapter();
			}
			@Override
			public Adapter caseDataCenter(DataCenter object) {
				return createDataCenterAdapter();
			}
			@Override
			public Adapter caseRackElement(RackElement object) {
				return createRackElementAdapter();
			}
			@Override
			public Adapter caseRack(Rack object) {
				return createRackAdapter();
			}
			@Override
			public Adapter caseMachine(Machine object) {
				return createMachineAdapter();
			}
			@Override
			public Adapter caseCPU(CPU object) {
				return createCPUAdapter();
			}
			@Override
			public Adapter caseMemory(Memory object) {
				return createMemoryAdapter();
			}
			@Override
			public Adapter caseLatency(Latency object) {
				return createLatencyAdapter();
			}
			@Override
			public Adapter caseComputingRack(ComputingRack object) {
				return createComputingRackAdapter();
			}
			@Override
			public Adapter caseStatelessComputationMachine(StatelessComputationMachine object) {
				return createStatelessComputationMachineAdapter();
			}
			@Override
			public Adapter caseStorageRack(StorageRack object) {
				return createStorageRackAdapter();
			}
			@Override
			public Adapter caseSSMProcessor(SSMProcessor object) {
				return createSSMProcessorAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter casesendData(sendData object) {
				return createsendDataAdapter();
			}
			@Override
			public Adapter casenewRestrictions(newRestrictions object) {
				return createnewRestrictionsAdapter();
			}
			@Override
			public Adapter caserectifyData(rectifyData object) {
				return createrectifyDataAdapter();
			}
			@Override
			public Adapter caseremoveData(removeData object) {
				return createremoveDataAdapter();
			}
			@Override
			public Adapter caseeraseData(eraseData object) {
				return createeraseDataAdapter();
			}
			@Override
			public Adapter caseconsent(consent object) {
				return createconsentAdapter();
			}
			@Override
			public Adapter caseaskAuthentication(askAuthentication object) {
				return createaskAuthenticationAdapter();
			}
			@Override
			public Adapter casetp(tp object) {
				return createtpAdapter();
			}
			@Override
			public Adapter casereadData(readData object) {
				return createreadDataAdapter();
			}
			@Override
			public Adapter casepermission(permission object) {
				return createpermissionAdapter();
			}
			@Override
			public Adapter casenotify(notify object) {
				return createnotifyAdapter();
			}
			@Override
			public Adapter caseupDate(upDate object) {
				return createupDateAdapter();
			}
			@Override
			public Adapter casenewData(newData object) {
				return createnewDataAdapter();
			}
			@Override
			public Adapter caseaskDataInformation(askDataInformation object) {
				return createaskDataInformationAdapter();
			}
			@Override
			public Adapter casereportDataManagement(reportDataManagement object) {
				return createreportDataManagementAdapter();
			}
			@Override
			public Adapter casesubscribe(subscribe object) {
				return createsubscribeAdapter();
			}
			@Override
			public Adapter casebreachInfo(breachInfo object) {
				return createbreachInfoAdapter();
			}
			@Override
			public Adapter caseinformBreaches(informBreaches object) {
				return createinformBreachesAdapter();
			}
			@Override
			public Adapter casetimeoutSubscription(timeoutSubscription object) {
				return createtimeoutSubscriptionAdapter();
			}
			@Override
			public Adapter casewriteData(writeData object) {
				return createwriteDataAdapter();
			}
			@Override
			public Adapter caseaccessInformation(accessInformation object) {
				return createaccessInformationAdapter();
			}
			@Override
			public Adapter caseremoveSPInLog(removeSPInLog object) {
				return createremoveSPInLogAdapter();
			}
			@Override
			public Adapter caseInfo(Info object) {
				return createInfoAdapter();
			}
			@Override
			public Adapter caseTrustedSCM(TrustedSCM object) {
				return createTrustedSCMAdapter();
			}
			@Override
			public Adapter caseUntrustedSCM(UntrustedSCM object) {
				return createUntrustedSCMAdapter();
			}
			@Override
			public Adapter caseconsentInfo(consentInfo object) {
				return createconsentInfoAdapter();
			}
			@Override
			public Adapter caseok(ok object) {
				return createokAdapter();
			}
			@Override
			public Adapter caseinformationNotForFree(informationNotForFree object) {
				return createinformationNotForFreeAdapter();
			}
			@Override
			public Adapter casewantToAccess(wantToAccess object) {
				return createwantToAccessAdapter();
			}
			@Override
			public Adapter casereportDataDManagementForFree(reportDataDManagementForFree object) {
				return createreportDataDManagementForFreeAdapter();
			}
			@Override
			public Adapter casecheckChanges(checkChanges object) {
				return createcheckChangesAdapter();
			}
			@Override
			public Adapter caseSP(SP object) {
				return createSPAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.Infrastructure
	 * @generated
	 */
	public Adapter createInfrastructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.Bandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.Bandwidth
	 * @generated
	 */
	public Adapter createBandwidthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.ControllerCP <em>Controller CP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.ControllerCP
	 * @generated
	 */
	public Adapter createControllerCPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.SLA <em>SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.SLA
	 * @generated
	 */
	public Adapter createSLAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.StatelessAppCTP <em>Stateless App CTP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.StatelessAppCTP
	 * @generated
	 */
	public Adapter createStatelessAppCTPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.Principal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.Principal
	 * @generated
	 */
	public Adapter createPrincipalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.AccessLog <em>Access Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.AccessLog
	 * @generated
	 */
	public Adapter createAccessLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.Storage
	 * @generated
	 */
	public Adapter createStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.Hardware
	 * @generated
	 */
	public Adapter createHardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.Size
	 * @generated
	 */
	public Adapter createSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.DataArchive <em>Data Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.DataArchive
	 * @generated
	 */
	public Adapter createDataArchiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.DataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.DataField
	 * @generated
	 */
	public Adapter createDataFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.StickyPolicy <em>Sticky Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.StickyPolicy
	 * @generated
	 */
	public Adapter createStickyPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.PermissionPerTP <em>Permission Per TP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.PermissionPerTP
	 * @generated
	 */
	public Adapter createPermissionPerTPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.PList <em>PList</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.PList
	 * @generated
	 */
	public Adapter createPListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.AccesPerTP <em>Acces Per TP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.AccesPerTP
	 * @generated
	 */
	public Adapter createAccesPerTPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.DataCenterElement <em>Data Center Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.DataCenterElement
	 * @generated
	 */
	public Adapter createDataCenterElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.DataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.DataCenter
	 * @generated
	 */
	public Adapter createDataCenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.RackElement <em>Rack Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.RackElement
	 * @generated
	 */
	public Adapter createRackElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.Rack
	 * @generated
	 */
	public Adapter createRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.CPU <em>CPU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.CPU
	 * @generated
	 */
	public Adapter createCPUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.Memory
	 * @generated
	 */
	public Adapter createMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.Latency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.Latency
	 * @generated
	 */
	public Adapter createLatencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.ComputingRack <em>Computing Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.ComputingRack
	 * @generated
	 */
	public Adapter createComputingRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.StatelessComputationMachine <em>Stateless Computation Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.StatelessComputationMachine
	 * @generated
	 */
	public Adapter createStatelessComputationMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.StorageRack <em>Storage Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.StorageRack
	 * @generated
	 */
	public Adapter createStorageRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.SSMProcessor <em>SSM Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.SSMProcessor
	 * @generated
	 */
	public Adapter createSSMProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.sendData <em>send Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.sendData
	 * @generated
	 */
	public Adapter createsendDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.newRestrictions <em>new Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.newRestrictions
	 * @generated
	 */
	public Adapter createnewRestrictionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.rectifyData <em>rectify Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.rectifyData
	 * @generated
	 */
	public Adapter createrectifyDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.removeData <em>remove Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.removeData
	 * @generated
	 */
	public Adapter createremoveDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.eraseData <em>erase Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.eraseData
	 * @generated
	 */
	public Adapter createeraseDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.consent <em>consent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.consent
	 * @generated
	 */
	public Adapter createconsentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.askAuthentication <em>ask Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.askAuthentication
	 * @generated
	 */
	public Adapter createaskAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.tp <em>tp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.tp
	 * @generated
	 */
	public Adapter createtpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.readData <em>read Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.readData
	 * @generated
	 */
	public Adapter createreadDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.permission <em>permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.permission
	 * @generated
	 */
	public Adapter createpermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.notify <em>notify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.notify
	 * @generated
	 */
	public Adapter createnotifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.upDate <em>up Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.upDate
	 * @generated
	 */
	public Adapter createupDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.newData <em>new Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.newData
	 * @generated
	 */
	public Adapter createnewDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.askDataInformation <em>ask Data Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.askDataInformation
	 * @generated
	 */
	public Adapter createaskDataInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.reportDataManagement <em>report Data Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.reportDataManagement
	 * @generated
	 */
	public Adapter createreportDataManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.subscribe <em>subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.subscribe
	 * @generated
	 */
	public Adapter createsubscribeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.breachInfo <em>breach Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.breachInfo
	 * @generated
	 */
	public Adapter createbreachInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.informBreaches <em>inform Breaches</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.informBreaches
	 * @generated
	 */
	public Adapter createinformBreachesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.timeoutSubscription <em>timeout Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.timeoutSubscription
	 * @generated
	 */
	public Adapter createtimeoutSubscriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.writeData <em>write Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.writeData
	 * @generated
	 */
	public Adapter createwriteDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.accessInformation <em>access Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.accessInformation
	 * @generated
	 */
	public Adapter createaccessInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.removeSPInLog <em>remove SP In Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.removeSPInLog
	 * @generated
	 */
	public Adapter createremoveSPInLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.Info <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.Info
	 * @generated
	 */
	public Adapter createInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.TrustedSCM <em>Trusted SCM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.TrustedSCM
	 * @generated
	 */
	public Adapter createTrustedSCMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.UntrustedSCM <em>Untrusted SCM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.UntrustedSCM
	 * @generated
	 */
	public Adapter createUntrustedSCMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.consentInfo <em>consent Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.consentInfo
	 * @generated
	 */
	public Adapter createconsentInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.ok <em>ok</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.ok
	 * @generated
	 */
	public Adapter createokAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.informationNotForFree <em>information Not For Free</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.informationNotForFree
	 * @generated
	 */
	public Adapter createinformationNotForFreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.wantToAccess <em>want To Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.wantToAccess
	 * @generated
	 */
	public Adapter createwantToAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.reportDataDManagementForFree <em>report Data DManagement For Free</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.reportDataDManagementForFree
	 * @generated
	 */
	public Adapter createreportDataDManagementForFreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.checkChanges <em>check Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.checkChanges
	 * @generated
	 */
	public Adapter createcheckChangesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model4datactrackprofile.SP <em>SP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model4datactrackprofile.SP
	 * @generated
	 */
	public Adapter createSPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Model4datactrackprofileAdapterFactory
