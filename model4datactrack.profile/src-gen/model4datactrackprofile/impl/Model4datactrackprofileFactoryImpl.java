/**
 */
package model4datactrackprofile.impl;

import model4datactrackprofile.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Model4datactrackprofileFactoryImpl extends EFactoryImpl implements Model4datactrackprofileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Model4datactrackprofileFactory init() {
		try {
			Model4datactrackprofileFactory theModel4datactrackprofileFactory = (Model4datactrackprofileFactory)EPackage.Registry.INSTANCE.getEFactory(Model4datactrackprofilePackage.eNS_URI);
			if (theModel4datactrackprofileFactory != null) {
				return theModel4datactrackprofileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Model4datactrackprofileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model4datactrackprofileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Model4datactrackprofilePackage.INFRASTRUCTURE: return createInfrastructure();
			case Model4datactrackprofilePackage.BANDWIDTH: return createBandwidth();
			case Model4datactrackprofilePackage.CONTROLLER_CP: return createControllerCP();
			case Model4datactrackprofilePackage.SLA: return createSLA();
			case Model4datactrackprofilePackage.TIME: return createTime();
			case Model4datactrackprofilePackage.STATELESS_APP_CTP: return createStatelessAppCTP();
			case Model4datactrackprofilePackage.ACCESS_LOG: return createAccessLog();
			case Model4datactrackprofilePackage.STORAGE: return createStorage();
			case Model4datactrackprofilePackage.SIZE: return createSize();
			case Model4datactrackprofilePackage.DATA: return createData();
			case Model4datactrackprofilePackage.DATA_ARCHIVE: return createDataArchive();
			case Model4datactrackprofilePackage.DATA_FIELD: return createDataField();
			case Model4datactrackprofilePackage.STICKY_POLICY: return createStickyPolicy();
			case Model4datactrackprofilePackage.PERMISSION_PER_TP: return createPermissionPerTP();
			case Model4datactrackprofilePackage.PLIST: return createPList();
			case Model4datactrackprofilePackage.ACCES_PER_TP: return createAccesPerTP();
			case Model4datactrackprofilePackage.DATA_CENTER_ELEMENT: return createDataCenterElement();
			case Model4datactrackprofilePackage.DATA_CENTER: return createDataCenter();
			case Model4datactrackprofilePackage.RACK_ELEMENT: return createRackElement();
			case Model4datactrackprofilePackage.CPU: return createCPU();
			case Model4datactrackprofilePackage.MEMORY: return createMemory();
			case Model4datactrackprofilePackage.LATENCY: return createLatency();
			case Model4datactrackprofilePackage.COMPUTING_RACK: return createComputingRack();
			case Model4datactrackprofilePackage.STORAGE_RACK: return createStorageRack();
			case Model4datactrackprofilePackage.SSM_PROCESSOR: return createSSMProcessor();
			case Model4datactrackprofilePackage.USER: return createUser();
			case Model4datactrackprofilePackage.SEND_DATA: return createsendData();
			case Model4datactrackprofilePackage.NEW_RESTRICTIONS: return createnewRestrictions();
			case Model4datactrackprofilePackage.RECTIFY_DATA: return createrectifyData();
			case Model4datactrackprofilePackage.REMOVE_DATA: return createremoveData();
			case Model4datactrackprofilePackage.ERASE_DATA: return createeraseData();
			case Model4datactrackprofilePackage.CONSENT: return createconsent();
			case Model4datactrackprofilePackage.ASK_AUTHENTICATION: return createaskAuthentication();
			case Model4datactrackprofilePackage.TP: return createtp();
			case Model4datactrackprofilePackage.READ_DATA: return createreadData();
			case Model4datactrackprofilePackage.PERMISSION: return createpermission();
			case Model4datactrackprofilePackage.NOTIFY: return createnotify();
			case Model4datactrackprofilePackage.UP_DATE: return createupDate();
			case Model4datactrackprofilePackage.NEW_DATA: return createnewData();
			case Model4datactrackprofilePackage.ASK_DATA_INFORMATION: return createaskDataInformation();
			case Model4datactrackprofilePackage.REPORT_DATA_MANAGEMENT: return createreportDataManagement();
			case Model4datactrackprofilePackage.SUBSCRIBE: return createsubscribe();
			case Model4datactrackprofilePackage.INFORM_BREACHES: return createinformBreaches();
			case Model4datactrackprofilePackage.TIMEOUT_SUBSCRIPTION: return createtimeoutSubscription();
			case Model4datactrackprofilePackage.WRITE_DATA: return createwriteData();
			case Model4datactrackprofilePackage.ACCESS_INFORMATION: return createaccessInformation();
			case Model4datactrackprofilePackage.REMOVE_SP_IN_LOG: return createremoveSPInLog();
			case Model4datactrackprofilePackage.INFO: return createInfo();
			case Model4datactrackprofilePackage.TRUSTED_SCM: return createTrustedSCM();
			case Model4datactrackprofilePackage.UNTRUSTED_SCM: return createUntrustedSCM();
			case Model4datactrackprofilePackage.CONSENT_INFO: return createconsentInfo();
			case Model4datactrackprofilePackage.OK: return createok();
			case Model4datactrackprofilePackage.INFORMATION_NOT_FOR_FREE: return createinformationNotForFree();
			case Model4datactrackprofilePackage.WANT_TO_ACCESS: return createwantToAccess();
			case Model4datactrackprofilePackage.REPORT_DATA_DMANAGEMENT_FOR_FREE: return createreportDataDManagementForFree();
			case Model4datactrackprofilePackage.CHECK_CHANGES: return createcheckChanges();
			case Model4datactrackprofilePackage.SP: return createSP();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Model4datactrackprofilePackage.BANDWIDTH_UNIT:
				return createBandwidthUnitFromString(eDataType, initialValue);
			case Model4datactrackprofilePackage.TIME_UNIT:
				return createTimeUnitFromString(eDataType, initialValue);
			case Model4datactrackprofilePackage.SIZE_UNIT:
				return createSizeUnitFromString(eDataType, initialValue);
			case Model4datactrackprofilePackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Model4datactrackprofilePackage.BANDWIDTH_UNIT:
				return convertBandwidthUnitToString(eDataType, instanceValue);
			case Model4datactrackprofilePackage.TIME_UNIT:
				return convertTimeUnitToString(eDataType, instanceValue);
			case Model4datactrackprofilePackage.SIZE_UNIT:
				return convertSizeUnitToString(eDataType, instanceValue);
			case Model4datactrackprofilePackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infrastructure createInfrastructure() {
		InfrastructureImpl infrastructure = new InfrastructureImpl();
		return infrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bandwidth createBandwidth() {
		BandwidthImpl bandwidth = new BandwidthImpl();
		return bandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerCP createControllerCP() {
		ControllerCPImpl controllerCP = new ControllerCPImpl();
		return controllerCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SLA createSLA() {
		SLAImpl sla = new SLAImpl();
		return sla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatelessAppCTP createStatelessAppCTP() {
		StatelessAppCTPImpl statelessAppCTP = new StatelessAppCTPImpl();
		return statelessAppCTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLog createAccessLog() {
		AccessLogImpl accessLog = new AccessLogImpl();
		return accessLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage createStorage() {
		StorageImpl storage = new StorageImpl();
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size createSize() {
		SizeImpl size = new SizeImpl();
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataArchive createDataArchive() {
		DataArchiveImpl dataArchive = new DataArchiveImpl();
		return dataArchive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataField createDataField() {
		DataFieldImpl dataField = new DataFieldImpl();
		return dataField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StickyPolicy createStickyPolicy() {
		StickyPolicyImpl stickyPolicy = new StickyPolicyImpl();
		return stickyPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionPerTP createPermissionPerTP() {
		PermissionPerTPImpl permissionPerTP = new PermissionPerTPImpl();
		return permissionPerTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PList createPList() {
		PListImpl pList = new PListImpl();
		return pList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccesPerTP createAccesPerTP() {
		AccesPerTPImpl accesPerTP = new AccesPerTPImpl();
		return accesPerTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCenterElement createDataCenterElement() {
		DataCenterElementImpl dataCenterElement = new DataCenterElementImpl();
		return dataCenterElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCenter createDataCenter() {
		DataCenterImpl dataCenter = new DataCenterImpl();
		return dataCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RackElement createRackElement() {
		RackElementImpl rackElement = new RackElementImpl();
		return rackElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPU createCPU() {
		CPUImpl cpu = new CPUImpl();
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory createMemory() {
		MemoryImpl memory = new MemoryImpl();
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Latency createLatency() {
		LatencyImpl latency = new LatencyImpl();
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingRack createComputingRack() {
		ComputingRackImpl computingRack = new ComputingRackImpl();
		return computingRack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageRack createStorageRack() {
		StorageRackImpl storageRack = new StorageRackImpl();
		return storageRack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSMProcessor createSSMProcessor() {
		SSMProcessorImpl ssmProcessor = new SSMProcessorImpl();
		return ssmProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sendData createsendData() {
		sendDataImpl sendData = new sendDataImpl();
		return sendData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public newRestrictions createnewRestrictions() {
		newRestrictionsImpl newRestrictions = new newRestrictionsImpl();
		return newRestrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rectifyData createrectifyData() {
		rectifyDataImpl rectifyData = new rectifyDataImpl();
		return rectifyData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public removeData createremoveData() {
		removeDataImpl removeData = new removeDataImpl();
		return removeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eraseData createeraseData() {
		eraseDataImpl eraseData = new eraseDataImpl();
		return eraseData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public consent createconsent() {
		consentImpl consent = new consentImpl();
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public askAuthentication createaskAuthentication() {
		askAuthenticationImpl askAuthentication = new askAuthenticationImpl();
		return askAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tp createtp() {
		tpImpl tp = new tpImpl();
		return tp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public readData createreadData() {
		readDataImpl readData = new readDataImpl();
		return readData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public permission createpermission() {
		permissionImpl permission = new permissionImpl();
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public notify createnotify() {
		notifyImpl notify = new notifyImpl();
		return notify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public upDate createupDate() {
		upDateImpl upDate = new upDateImpl();
		return upDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public newData createnewData() {
		newDataImpl newData = new newDataImpl();
		return newData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public askDataInformation createaskDataInformation() {
		askDataInformationImpl askDataInformation = new askDataInformationImpl();
		return askDataInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public reportDataManagement createreportDataManagement() {
		reportDataManagementImpl reportDataManagement = new reportDataManagementImpl();
		return reportDataManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public subscribe createsubscribe() {
		subscribeImpl subscribe = new subscribeImpl();
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public informBreaches createinformBreaches() {
		informBreachesImpl informBreaches = new informBreachesImpl();
		return informBreaches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public timeoutSubscription createtimeoutSubscription() {
		timeoutSubscriptionImpl timeoutSubscription = new timeoutSubscriptionImpl();
		return timeoutSubscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public writeData createwriteData() {
		writeDataImpl writeData = new writeDataImpl();
		return writeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public accessInformation createaccessInformation() {
		accessInformationImpl accessInformation = new accessInformationImpl();
		return accessInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public removeSPInLog createremoveSPInLog() {
		removeSPInLogImpl removeSPInLog = new removeSPInLogImpl();
		return removeSPInLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Info createInfo() {
		InfoImpl info = new InfoImpl();
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrustedSCM createTrustedSCM() {
		TrustedSCMImpl trustedSCM = new TrustedSCMImpl();
		return trustedSCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UntrustedSCM createUntrustedSCM() {
		UntrustedSCMImpl untrustedSCM = new UntrustedSCMImpl();
		return untrustedSCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public consentInfo createconsentInfo() {
		consentInfoImpl consentInfo = new consentInfoImpl();
		return consentInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ok createok() {
		okImpl ok = new okImpl();
		return ok;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public informationNotForFree createinformationNotForFree() {
		informationNotForFreeImpl informationNotForFree = new informationNotForFreeImpl();
		return informationNotForFree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public wantToAccess createwantToAccess() {
		wantToAccessImpl wantToAccess = new wantToAccessImpl();
		return wantToAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public reportDataDManagementForFree createreportDataDManagementForFree() {
		reportDataDManagementForFreeImpl reportDataDManagementForFree = new reportDataDManagementForFreeImpl();
		return reportDataDManagementForFree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public checkChanges createcheckChanges() {
		checkChangesImpl checkChanges = new checkChangesImpl();
		return checkChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SP createSP() {
		SPImpl sp = new SPImpl();
		return sp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BandwidthUnit createBandwidthUnitFromString(EDataType eDataType, String initialValue) {
		BandwidthUnit result = BandwidthUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBandwidthUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue) {
		TimeUnit result = TimeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeUnit createSizeUnitFromString(EDataType eDataType, String initialValue) {
		SizeUnit result = SizeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model4datactrackprofilePackage getModel4datactrackprofilePackage() {
		return (Model4datactrackprofilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Model4datactrackprofilePackage getPackage() {
		return Model4datactrackprofilePackage.eINSTANCE;
	}

} //Model4datactrackprofileFactoryImpl
