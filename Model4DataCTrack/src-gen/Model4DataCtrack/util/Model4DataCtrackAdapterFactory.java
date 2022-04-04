/**
 */
package Model4DataCtrack.util;

import Model4DataCtrack.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Model4DataCtrack.Model4DataCtrackPackage
 * @generated
 */
public class Model4DataCtrackAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Model4DataCtrackPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model4DataCtrackAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Model4DataCtrackPackage.eINSTANCE;
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
	protected Model4DataCtrackSwitch<Adapter> modelSwitch =
		new Model4DataCtrackSwitch<Adapter>() {
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
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.Infrastructure
	 * @generated
	 */
	public Adapter createInfrastructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.Bandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.Bandwidth
	 * @generated
	 */
	public Adapter createBandwidthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.ControllerCP <em>Controller CP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.ControllerCP
	 * @generated
	 */
	public Adapter createControllerCPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.SLA <em>SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.SLA
	 * @generated
	 */
	public Adapter createSLAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.AccessLog <em>Access Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.AccessLog
	 * @generated
	 */
	public Adapter createAccessLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.SSMProcessor <em>SSM Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.SSMProcessor
	 * @generated
	 */
	public Adapter createSSMProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.CPU <em>CPU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.CPU
	 * @generated
	 */
	public Adapter createCPUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.Hardware
	 * @generated
	 */
	public Adapter createHardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.Memory
	 * @generated
	 */
	public Adapter createMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.Size
	 * @generated
	 */
	public Adapter createSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.Latency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.Latency
	 * @generated
	 */
	public Adapter createLatencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.Storage
	 * @generated
	 */
	public Adapter createStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.DataArchive <em>Data Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.DataArchive
	 * @generated
	 */
	public Adapter createDataArchiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.DataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.DataField
	 * @generated
	 */
	public Adapter createDataFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.StickyPolicy <em>Sticky Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.StickyPolicy
	 * @generated
	 */
	public Adapter createStickyPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.PermissionPerTP <em>Permission Per TP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.PermissionPerTP
	 * @generated
	 */
	public Adapter createPermissionPerTPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.PList <em>PList</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.PList
	 * @generated
	 */
	public Adapter createPListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.Principal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.Principal
	 * @generated
	 */
	public Adapter createPrincipalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.StatelessAppCTP <em>Stateless App CTP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.StatelessAppCTP
	 * @generated
	 */
	public Adapter createStatelessAppCTPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.AccesPerTP <em>Acces Per TP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.AccesPerTP
	 * @generated
	 */
	public Adapter createAccesPerTPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.DataCenterElement <em>Data Center Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.DataCenterElement
	 * @generated
	 */
	public Adapter createDataCenterElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.DataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.DataCenter
	 * @generated
	 */
	public Adapter createDataCenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.RackElement <em>Rack Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.RackElement
	 * @generated
	 */
	public Adapter createRackElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.Rack
	 * @generated
	 */
	public Adapter createRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.ComputingRack <em>Computing Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.ComputingRack
	 * @generated
	 */
	public Adapter createComputingRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.StatelessComputationMachine <em>Stateless Computation Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.StatelessComputationMachine
	 * @generated
	 */
	public Adapter createStatelessComputationMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.StorageRack <em>Storage Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.StorageRack
	 * @generated
	 */
	public Adapter createStorageRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.sendData <em>send Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.sendData
	 * @generated
	 */
	public Adapter createsendDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.newRestrictions <em>new Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.newRestrictions
	 * @generated
	 */
	public Adapter createnewRestrictionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.rectifyData <em>rectify Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.rectifyData
	 * @generated
	 */
	public Adapter createrectifyDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.removeData <em>remove Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.removeData
	 * @generated
	 */
	public Adapter createremoveDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.eraseData <em>erase Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.eraseData
	 * @generated
	 */
	public Adapter createeraseDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.consent <em>consent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.consent
	 * @generated
	 */
	public Adapter createconsentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.askAuthentication <em>ask Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.askAuthentication
	 * @generated
	 */
	public Adapter createaskAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.tp <em>tp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.tp
	 * @generated
	 */
	public Adapter createtpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.readData <em>read Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.readData
	 * @generated
	 */
	public Adapter createreadDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.permission <em>permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.permission
	 * @generated
	 */
	public Adapter createpermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.notify <em>notify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.notify
	 * @generated
	 */
	public Adapter createnotifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.upDate <em>up Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.upDate
	 * @generated
	 */
	public Adapter createupDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.newData <em>new Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.newData
	 * @generated
	 */
	public Adapter createnewDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.askDataInformation <em>ask Data Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.askDataInformation
	 * @generated
	 */
	public Adapter createaskDataInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.reportDataManagement <em>report Data Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.reportDataManagement
	 * @generated
	 */
	public Adapter createreportDataManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.subscribe <em>subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.subscribe
	 * @generated
	 */
	public Adapter createsubscribeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.informBreaches <em>inform Breaches</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.informBreaches
	 * @generated
	 */
	public Adapter createinformBreachesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.timeoutSubscription <em>timeout Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.timeoutSubscription
	 * @generated
	 */
	public Adapter createtimeoutSubscriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.writeData <em>write Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.writeData
	 * @generated
	 */
	public Adapter createwriteDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.accessInformation <em>access Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.accessInformation
	 * @generated
	 */
	public Adapter createaccessInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.removeSPInLog <em>remove SP In Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.removeSPInLog
	 * @generated
	 */
	public Adapter createremoveSPInLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.Info <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.Info
	 * @generated
	 */
	public Adapter createInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.TrustedSCM <em>Trusted SCM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.TrustedSCM
	 * @generated
	 */
	public Adapter createTrustedSCMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.UntrustedSCM <em>Untrusted SCM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.UntrustedSCM
	 * @generated
	 */
	public Adapter createUntrustedSCMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.consentInfo <em>consent Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.consentInfo
	 * @generated
	 */
	public Adapter createconsentInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.ok <em>ok</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.ok
	 * @generated
	 */
	public Adapter createokAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.informationNotForFree <em>information Not For Free</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.informationNotForFree
	 * @generated
	 */
	public Adapter createinformationNotForFreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.wantToAccess <em>want To Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.wantToAccess
	 * @generated
	 */
	public Adapter createwantToAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.reportDataDManagementForFree <em>report Data DManagement For Free</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.reportDataDManagementForFree
	 * @generated
	 */
	public Adapter createreportDataDManagementForFreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.checkChanges <em>check Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.checkChanges
	 * @generated
	 */
	public Adapter createcheckChangesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model4DataCtrack.SP <em>SP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model4DataCtrack.SP
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

} //Model4DataCtrackAdapterFactory
