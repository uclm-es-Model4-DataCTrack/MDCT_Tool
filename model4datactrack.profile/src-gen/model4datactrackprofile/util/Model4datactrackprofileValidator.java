/**
 */
package model4datactrackprofile.util;

import java.util.Map;

import model4datactrackprofile.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see model4datactrackprofile.Model4datactrackprofilePackage
 * @generated
 */
public class Model4datactrackprofileValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Model4datactrackprofileValidator INSTANCE = new Model4datactrackprofileValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "model4datactrackprofile";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Bandwidth value greater than 0' of 'Bandwidth'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BANDWIDTH__BANDWIDTH_VALUE_GREATER_THAN_0 = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'New Location machine not under sla with controller' of 'Controller CP'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER_CP__NEW_LOCATION_MACHINE_NOT_UNDER_SLA_WITH_CONTROLLER = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Location1 machine not under sla with controller' of 'Controller CP'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROLLER_CP__LOCATION1_MACHINE_NOT_UNDER_SLA_WITH_CONTROLLER = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Time value greater than 0' of 'Time'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TIME__TIME_VALUE_GREATER_THAN_0 = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Log access match sp access' of 'Access Log'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACCESS_LOG__LOG_ACCESS_MATCH_SP_ACCESS = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number Of Drivers greater than 0' of 'Storage'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STORAGE__NUMBER_OF_DRIVERS_GREATER_THAN_0 = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Size value greater than 0' of 'Size'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIZE__SIZE_VALUE_GREATER_THAN_0 = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Allowed access purpose' of 'Sticky Policy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STICKY_POLICY__ALLOWED_ACCESS_PURPOSE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All tps in history given permissions' of 'Sticky Policy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STICKY_POLICY__ALL_TPS_IN_HISTORY_GIVEN_PERMISSIONS = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No empty infra' of 'Data Center Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_CENTER_ELEMENT__NO_EMPTY_INFRA = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No empty datacenters' of 'Rack Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RACK_ELEMENT__NO_EMPTY_DATACENTERS = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No empty racks' of 'Rack'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RACK__NO_EMPTY_RACKS = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cpu cores and flops greater than 0' of 'CPU'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CPU__CPU_CORES_AND_FLOPS_GREATER_THAN_0 = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Latency not in us or ns' of 'Latency'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LATENCY__LATENCY_NOT_IN_US_OR_NS = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Latency name not empty' of 'Latency'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LATENCY__LATENCY_NAME_NOT_EMPTY = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'SSM Proccessor complies GDPR' of 'SSM Processor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SSM_PROCESSOR__SSM_PROCCESSOR_COMPLIES_GDPR = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Send Data timeunit not days or hours or minutes' of 'send Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEND_DATA__SEND_DATA_TIMEUNIT_NOT_DAYS_OR_HOURS_OR_MINUTES = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Send Data max Time value greater than 0' of 'send Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEND_DATA__SEND_DATA_MAX_TIME_VALUE_GREATER_THAN_0 = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No empty rectify fields' of 'rectify Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECTIFY_DATA__NO_EMPTY_RECTIFY_FIELDS = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Machine contains data to erase' of 'erase Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ERASE_DATA__MACHINE_CONTAINS_DATA_TO_ERASE = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Erase Data destination machines comply with GDPR' of 'erase Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ERASE_DATA__ERASE_DATA_DESTINATION_MACHINES_COMPLY_WITH_GDPR = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Consent machine complies with GDPR' of 'consent'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT__CONSENT_MACHINE_COMPLIES_WITH_GDPR = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No access permission given without user consent' of 'permission'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERMISSION__NO_ACCESS_PERMISSION_GIVEN_WITHOUT_USER_CONSENT = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Notify destination machines comply with GDPR' of 'notify'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NOTIFY__NOTIFY_DESTINATION_MACHINES_COMPLY_WITH_GDPR = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Machine contains data to update' of 'up Date'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UP_DATE__MACHINE_CONTAINS_DATA_TO_UPDATE = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Up Date destination machines comply with GDPR' of 'up Date'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UP_DATE__UP_DATE_DESTINATION_MACHINES_COMPLY_WITH_GDPR = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No empty new Data fields' of 'new Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEW_DATA__NO_EMPTY_NEW_DATA_FIELDS = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Machine contains data to rectify' of 'new Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEW_DATA__MACHINE_CONTAINS_DATA_TO_RECTIFY = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'New Data destination machines comply with GDPR' of 'new Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NEW_DATA__NEW_DATA_DESTINATION_MACHINES_COMPLY_WITH_GDPR = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Max Sub Time greater than 0' of 'subscribe'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBE__MAX_SUB_TIME_GREATER_THAN_0 = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Machine contains data to subscribe to' of 'subscribe'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBE__MACHINE_CONTAINS_DATA_TO_SUBSCRIBE_TO = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subscribe destination machines comply with GDPR' of 'subscribe'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSCRIBE__SUBSCRIBE_DESTINATION_MACHINES_COMPLY_WITH_GDPR = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No empty write fields' of 'write Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WRITE_DATA__NO_EMPTY_WRITE_FIELDS = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Write Data timeunit not days or hours or minutes' of 'write Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WRITE_DATA__WRITE_DATA_TIMEUNIT_NOT_DAYS_OR_HOURS_OR_MINUTES = 34;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 34;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model4datactrackprofileValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Model4datactrackprofilePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Model4datactrackprofilePackage.INFRASTRUCTURE:
				return validateInfrastructure((Infrastructure)value, diagnostics, context);
			case Model4datactrackprofilePackage.BANDWIDTH:
				return validateBandwidth((Bandwidth)value, diagnostics, context);
			case Model4datactrackprofilePackage.CONTROLLER_CP:
				return validateControllerCP((ControllerCP)value, diagnostics, context);
			case Model4datactrackprofilePackage.SLA:
				return validateSLA((SLA)value, diagnostics, context);
			case Model4datactrackprofilePackage.TIME:
				return validateTime((Time)value, diagnostics, context);
			case Model4datactrackprofilePackage.STATELESS_APP_CTP:
				return validateStatelessAppCTP((StatelessAppCTP)value, diagnostics, context);
			case Model4datactrackprofilePackage.PRINCIPAL:
				return validatePrincipal((Principal)value, diagnostics, context);
			case Model4datactrackprofilePackage.ACCESS_LOG:
				return validateAccessLog((AccessLog)value, diagnostics, context);
			case Model4datactrackprofilePackage.STORAGE:
				return validateStorage((Storage)value, diagnostics, context);
			case Model4datactrackprofilePackage.HARDWARE:
				return validateHardware((Hardware)value, diagnostics, context);
			case Model4datactrackprofilePackage.SIZE:
				return validateSize((Size)value, diagnostics, context);
			case Model4datactrackprofilePackage.DATA:
				return validateData((Data)value, diagnostics, context);
			case Model4datactrackprofilePackage.DATA_ARCHIVE:
				return validateDataArchive((DataArchive)value, diagnostics, context);
			case Model4datactrackprofilePackage.DATA_FIELD:
				return validateDataField((DataField)value, diagnostics, context);
			case Model4datactrackprofilePackage.STICKY_POLICY:
				return validateStickyPolicy((StickyPolicy)value, diagnostics, context);
			case Model4datactrackprofilePackage.PERMISSION_PER_TP:
				return validatePermissionPerTP((PermissionPerTP)value, diagnostics, context);
			case Model4datactrackprofilePackage.PLIST:
				return validatePList((PList)value, diagnostics, context);
			case Model4datactrackprofilePackage.ACCES_PER_TP:
				return validateAccesPerTP((AccesPerTP)value, diagnostics, context);
			case Model4datactrackprofilePackage.DATA_CENTER_ELEMENT:
				return validateDataCenterElement((DataCenterElement)value, diagnostics, context);
			case Model4datactrackprofilePackage.DATA_CENTER:
				return validateDataCenter((DataCenter)value, diagnostics, context);
			case Model4datactrackprofilePackage.RACK_ELEMENT:
				return validateRackElement((RackElement)value, diagnostics, context);
			case Model4datactrackprofilePackage.RACK:
				return validateRack((Rack)value, diagnostics, context);
			case Model4datactrackprofilePackage.MACHINE:
				return validateMachine((Machine)value, diagnostics, context);
			case Model4datactrackprofilePackage.CPU:
				return validateCPU((CPU)value, diagnostics, context);
			case Model4datactrackprofilePackage.MEMORY:
				return validateMemory((Memory)value, diagnostics, context);
			case Model4datactrackprofilePackage.LATENCY:
				return validateLatency((Latency)value, diagnostics, context);
			case Model4datactrackprofilePackage.COMPUTING_RACK:
				return validateComputingRack((ComputingRack)value, diagnostics, context);
			case Model4datactrackprofilePackage.STATELESS_COMPUTATION_MACHINE:
				return validateStatelessComputationMachine((StatelessComputationMachine)value, diagnostics, context);
			case Model4datactrackprofilePackage.STORAGE_RACK:
				return validateStorageRack((StorageRack)value, diagnostics, context);
			case Model4datactrackprofilePackage.SSM_PROCESSOR:
				return validateSSMProcessor((SSMProcessor)value, diagnostics, context);
			case Model4datactrackprofilePackage.USER:
				return validateUser((User)value, diagnostics, context);
			case Model4datactrackprofilePackage.SEND_DATA:
				return validatesendData((sendData)value, diagnostics, context);
			case Model4datactrackprofilePackage.NEW_RESTRICTIONS:
				return validatenewRestrictions((newRestrictions)value, diagnostics, context);
			case Model4datactrackprofilePackage.RECTIFY_DATA:
				return validaterectifyData((rectifyData)value, diagnostics, context);
			case Model4datactrackprofilePackage.REMOVE_DATA:
				return validateremoveData((removeData)value, diagnostics, context);
			case Model4datactrackprofilePackage.ERASE_DATA:
				return validateeraseData((eraseData)value, diagnostics, context);
			case Model4datactrackprofilePackage.CONSENT:
				return validateconsent((consent)value, diagnostics, context);
			case Model4datactrackprofilePackage.ASK_AUTHENTICATION:
				return validateaskAuthentication((askAuthentication)value, diagnostics, context);
			case Model4datactrackprofilePackage.TP:
				return validatetp((tp)value, diagnostics, context);
			case Model4datactrackprofilePackage.READ_DATA:
				return validatereadData((readData)value, diagnostics, context);
			case Model4datactrackprofilePackage.PERMISSION:
				return validatepermission((permission)value, diagnostics, context);
			case Model4datactrackprofilePackage.NOTIFY:
				return validatenotify((notify)value, diagnostics, context);
			case Model4datactrackprofilePackage.UP_DATE:
				return validateupDate((upDate)value, diagnostics, context);
			case Model4datactrackprofilePackage.NEW_DATA:
				return validatenewData((newData)value, diagnostics, context);
			case Model4datactrackprofilePackage.ASK_DATA_INFORMATION:
				return validateaskDataInformation((askDataInformation)value, diagnostics, context);
			case Model4datactrackprofilePackage.REPORT_DATA_MANAGEMENT:
				return validatereportDataManagement((reportDataManagement)value, diagnostics, context);
			case Model4datactrackprofilePackage.SUBSCRIBE:
				return validatesubscribe((subscribe)value, diagnostics, context);
			case Model4datactrackprofilePackage.INFORM_BREACHES:
				return validateinformBreaches((informBreaches)value, diagnostics, context);
			case Model4datactrackprofilePackage.TIMEOUT_SUBSCRIPTION:
				return validatetimeoutSubscription((timeoutSubscription)value, diagnostics, context);
			case Model4datactrackprofilePackage.WRITE_DATA:
				return validatewriteData((writeData)value, diagnostics, context);
			case Model4datactrackprofilePackage.ACCESS_INFORMATION:
				return validateaccessInformation((accessInformation)value, diagnostics, context);
			case Model4datactrackprofilePackage.REMOVE_SP_IN_LOG:
				return validateremoveSPInLog((removeSPInLog)value, diagnostics, context);
			case Model4datactrackprofilePackage.INFO:
				return validateInfo((Info)value, diagnostics, context);
			case Model4datactrackprofilePackage.TRUSTED_SCM:
				return validateTrustedSCM((TrustedSCM)value, diagnostics, context);
			case Model4datactrackprofilePackage.UNTRUSTED_SCM:
				return validateUntrustedSCM((UntrustedSCM)value, diagnostics, context);
			case Model4datactrackprofilePackage.CONSENT_INFO:
				return validateconsentInfo((consentInfo)value, diagnostics, context);
			case Model4datactrackprofilePackage.OK:
				return validateok((ok)value, diagnostics, context);
			case Model4datactrackprofilePackage.INFORMATION_NOT_FOR_FREE:
				return validateinformationNotForFree((informationNotForFree)value, diagnostics, context);
			case Model4datactrackprofilePackage.WANT_TO_ACCESS:
				return validatewantToAccess((wantToAccess)value, diagnostics, context);
			case Model4datactrackprofilePackage.REPORT_DATA_DMANAGEMENT_FOR_FREE:
				return validatereportDataDManagementForFree((reportDataDManagementForFree)value, diagnostics, context);
			case Model4datactrackprofilePackage.CHECK_CHANGES:
				return validatecheckChanges((checkChanges)value, diagnostics, context);
			case Model4datactrackprofilePackage.SP:
				return validateSP((SP)value, diagnostics, context);
			case Model4datactrackprofilePackage.BANDWIDTH_UNIT:
				return validateBandwidthUnit((BandwidthUnit)value, diagnostics, context);
			case Model4datactrackprofilePackage.TIME_UNIT:
				return validateTimeUnit((TimeUnit)value, diagnostics, context);
			case Model4datactrackprofilePackage.SIZE_UNIT:
				return validateSizeUnit((SizeUnit)value, diagnostics, context);
			case Model4datactrackprofilePackage.ACTION_TYPE:
				return validateActionType((ActionType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructure(Infrastructure infrastructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(infrastructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBandwidth(Bandwidth bandwidth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bandwidth, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bandwidth, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bandwidth, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bandwidth, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bandwidth, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bandwidth, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bandwidth, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bandwidth, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bandwidth, diagnostics, context);
		if (result || diagnostics != null) result &= validateBandwidth_bandwidth_value_greater_than_0(bandwidth, diagnostics, context);
		return result;
	}

	/**
	 * Validates the bandwidth_value_greater_than_0 constraint of '<em>Bandwidth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBandwidth_bandwidth_value_greater_than_0(Bandwidth bandwidth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bandwidth.bandwidth_value_greater_than_0(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControllerCP(ControllerCP controllerCP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controllerCP, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controllerCP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controllerCP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controllerCP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controllerCP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controllerCP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controllerCP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controllerCP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controllerCP, diagnostics, context);
		if (result || diagnostics != null) result &= validateControllerCP_newLocation_machine_not_under_sla_with_controller(controllerCP, diagnostics, context);
		if (result || diagnostics != null) result &= validateControllerCP_location1_machine_not_under_sla_with_controller(controllerCP, diagnostics, context);
		return result;
	}

	/**
	 * Validates the newLocation_machine_not_under_sla_with_controller constraint of '<em>Controller CP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControllerCP_newLocation_machine_not_under_sla_with_controller(ControllerCP controllerCP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return controllerCP.newLocation_machine_not_under_sla_with_controller(diagnostics, context);
	}

	/**
	 * Validates the location1_machine_not_under_sla_with_controller constraint of '<em>Controller CP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControllerCP_location1_machine_not_under_sla_with_controller(ControllerCP controllerCP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return controllerCP.location1_machine_not_under_sla_with_controller(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSLA(SLA sla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sla, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime(Time time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(time, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(time, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(time, diagnostics, context);
		if (result || diagnostics != null) result &= validateTime_time_value_greater_than_0(time, diagnostics, context);
		return result;
	}

	/**
	 * Validates the time_value_greater_than_0 constraint of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTime_time_value_greater_than_0(Time time, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return time.time_value_greater_than_0(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatelessAppCTP(StatelessAppCTP statelessAppCTP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statelessAppCTP, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrincipal(Principal principal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(principal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessLog(AccessLog accessLog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(accessLog, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(accessLog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(accessLog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(accessLog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(accessLog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(accessLog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(accessLog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(accessLog, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(accessLog, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccessLog_log_access_match_sp_access(accessLog, diagnostics, context);
		return result;
	}

	/**
	 * Validates the log_access_match_sp_access constraint of '<em>Access Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessLog_log_access_match_sp_access(AccessLog accessLog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return accessLog.log_access_match_sp_access(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorage(Storage storage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storage, diagnostics, context);
		if (result || diagnostics != null) result &= validateStorage_numberOfDrivers_greater_than_0(storage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the numberOfDrivers_greater_than_0 constraint of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorage_numberOfDrivers_greater_than_0(Storage storage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return storage.numberOfDrivers_greater_than_0(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHardware(Hardware hardware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hardware, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSize(Size size, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(size, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(size, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(size, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(size, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(size, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(size, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(size, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(size, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(size, diagnostics, context);
		if (result || diagnostics != null) result &= validateSize_size_value_greater_than_0(size, diagnostics, context);
		return result;
	}

	/**
	 * Validates the size_value_greater_than_0 constraint of '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSize_size_value_greater_than_0(Size size, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return size.size_value_greater_than_0(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(data, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataArchive(DataArchive dataArchive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataArchive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataField(DataField dataField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStickyPolicy(StickyPolicy stickyPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stickyPolicy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stickyPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stickyPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stickyPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stickyPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stickyPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stickyPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stickyPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stickyPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateStickyPolicy_allowed_access_purpose(stickyPolicy, diagnostics, context);
		if (result || diagnostics != null) result &= validateStickyPolicy_all_tps_in_history_given_permissions(stickyPolicy, diagnostics, context);
		return result;
	}

	/**
	 * Validates the allowed_access_purpose constraint of '<em>Sticky Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStickyPolicy_allowed_access_purpose(StickyPolicy stickyPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stickyPolicy.allowed_access_purpose(diagnostics, context);
	}

	/**
	 * Validates the all_tps_in_history_given_permissions constraint of '<em>Sticky Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStickyPolicy_all_tps_in_history_given_permissions(StickyPolicy stickyPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return stickyPolicy.all_tps_in_history_given_permissions(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermissionPerTP(PermissionPerTP permissionPerTP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(permissionPerTP, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePList(PList pList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccesPerTP(AccesPerTP accesPerTP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accesPerTP, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCenterElement(DataCenterElement dataCenterElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataCenterElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataCenterElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataCenterElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataCenterElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataCenterElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataCenterElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataCenterElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataCenterElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataCenterElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataCenterElement_no_empty_infra(dataCenterElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the no_empty_infra constraint of '<em>Data Center Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCenterElement_no_empty_infra(DataCenterElement dataCenterElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataCenterElement.no_empty_infra(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCenter(DataCenter dataCenter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataCenter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRackElement(RackElement rackElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rackElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rackElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rackElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rackElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rackElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rackElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rackElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rackElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rackElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRackElement_no_empty_datacenters(rackElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the no_empty_datacenters constraint of '<em>Rack Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRackElement_no_empty_datacenters(RackElement rackElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rackElement.no_empty_datacenters(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRack(Rack rack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rack, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rack, diagnostics, context);
		if (result || diagnostics != null) result &= validateRack_no_empty_racks(rack, diagnostics, context);
		return result;
	}

	/**
	 * Validates the no_empty_racks constraint of '<em>Rack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRack_no_empty_racks(Rack rack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rack.no_empty_racks(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine(Machine machine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(machine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPU(CPU cpu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cpu, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cpu, diagnostics, context);
		if (result || diagnostics != null) result &= validateCPU_cpu_cores_and_flops_greater_than_0(cpu, diagnostics, context);
		return result;
	}

	/**
	 * Validates the cpu_cores_and_flops_greater_than_0 constraint of '<em>CPU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPU_cpu_cores_and_flops_greater_than_0(CPU cpu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cpu.cpu_cores_and_flops_greater_than_0(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemory(Memory memory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatency(Latency latency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(latency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(latency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(latency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(latency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(latency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(latency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(latency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(latency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(latency, diagnostics, context);
		if (result || diagnostics != null) result &= validateLatency_latency_not_in_us_or_ns(latency, diagnostics, context);
		if (result || diagnostics != null) result &= validateLatency_latency_name_not_empty(latency, diagnostics, context);
		return result;
	}

	/**
	 * Validates the latency_not_in_us_or_ns constraint of '<em>Latency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatency_latency_not_in_us_or_ns(Latency latency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return latency.latency_not_in_us_or_ns(diagnostics, context);
	}

	/**
	 * Validates the latency_name_not_empty constraint of '<em>Latency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatency_latency_name_not_empty(Latency latency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return latency.latency_name_not_empty(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputingRack(ComputingRack computingRack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(computingRack, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(computingRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(computingRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(computingRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(computingRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(computingRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(computingRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(computingRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(computingRack, diagnostics, context);
		if (result || diagnostics != null) result &= validateRack_no_empty_racks(computingRack, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatelessComputationMachine(StatelessComputationMachine statelessComputationMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statelessComputationMachine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageRack(StorageRack storageRack, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storageRack, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storageRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storageRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storageRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storageRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storageRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storageRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storageRack, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storageRack, diagnostics, context);
		if (result || diagnostics != null) result &= validateRack_no_empty_racks(storageRack, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSSMProcessor(SSMProcessor ssmProcessor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ssmProcessor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ssmProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ssmProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ssmProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ssmProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ssmProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ssmProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ssmProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ssmProcessor, diagnostics, context);
		if (result || diagnostics != null) result &= validateSSMProcessor_SSMProccessor_complies_GDPR(ssmProcessor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SSMProccessor_complies_GDPR constraint of '<em>SSM Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSSMProcessor_SSMProccessor_complies_GDPR(SSMProcessor ssmProcessor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ssmProcessor.SSMProccessor_complies_GDPR(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(user, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesendData(sendData sendData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sendData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sendData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sendData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sendData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sendData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sendData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sendData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sendData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sendData, diagnostics, context);
		if (result || diagnostics != null) result &= validatesendData_sendData_timeunit_not_days_or_hours_or_minutes(sendData, diagnostics, context);
		if (result || diagnostics != null) result &= validatesendData_sendData_maxTime_value_greater_than_0(sendData, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sendData_timeunit_not_days_or_hours_or_minutes constraint of '<em>send Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesendData_sendData_timeunit_not_days_or_hours_or_minutes(sendData sendData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sendData.sendData_timeunit_not_days_or_hours_or_minutes(diagnostics, context);
	}

	/**
	 * Validates the sendData_maxTime_value_greater_than_0 constraint of '<em>send Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesendData_sendData_maxTime_value_greater_than_0(sendData sendData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sendData.sendData_maxTime_value_greater_than_0(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatenewRestrictions(newRestrictions newRestrictions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(newRestrictions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validaterectifyData(rectifyData rectifyData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rectifyData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rectifyData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rectifyData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rectifyData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rectifyData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rectifyData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rectifyData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rectifyData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rectifyData, diagnostics, context);
		if (result || diagnostics != null) result &= validaterectifyData_no_empty_rectify_fields(rectifyData, diagnostics, context);
		return result;
	}

	/**
	 * Validates the no_empty_rectify_fields constraint of '<em>rectify Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validaterectifyData_no_empty_rectify_fields(rectifyData rectifyData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rectifyData.no_empty_rectify_fields(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateremoveData(removeData removeData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(removeData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateeraseData(eraseData eraseData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eraseData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eraseData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eraseData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eraseData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eraseData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eraseData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eraseData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eraseData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eraseData, diagnostics, context);
		if (result || diagnostics != null) result &= validateeraseData_machine_contains_data_to_erase(eraseData, diagnostics, context);
		if (result || diagnostics != null) result &= validateeraseData_eraseData_destination_machines_comply_with_GDPR(eraseData, diagnostics, context);
		return result;
	}

	/**
	 * Validates the machine_contains_data_to_erase constraint of '<em>erase Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateeraseData_machine_contains_data_to_erase(eraseData eraseData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eraseData.machine_contains_data_to_erase(diagnostics, context);
	}

	/**
	 * Validates the eraseData_destination_machines_comply_with_GDPR constraint of '<em>erase Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateeraseData_eraseData_destination_machines_comply_with_GDPR(eraseData eraseData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eraseData.eraseData_destination_machines_comply_with_GDPR(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateconsent(consent consent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(consent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(consent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(consent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(consent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(consent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(consent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(consent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(consent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(consent, diagnostics, context);
		if (result || diagnostics != null) result &= validateconsent_consent_machine_complies_with_GDPR(consent, diagnostics, context);
		return result;
	}

	/**
	 * Validates the consent_machine_complies_with_GDPR constraint of '<em>consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateconsent_consent_machine_complies_with_GDPR(consent consent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consent.consent_machine_complies_with_GDPR(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateaskAuthentication(askAuthentication askAuthentication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(askAuthentication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetp(tp tp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatereadData(readData readData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(readData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatepermission(permission permission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(permission, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(permission, diagnostics, context);
		if (result || diagnostics != null) result &= validatepermission_no_access_permission_given_without_user_consent(permission, diagnostics, context);
		return result;
	}

	/**
	 * Validates the no_access_permission_given_without_user_consent constraint of '<em>permission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatepermission_no_access_permission_given_without_user_consent(permission permission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return permission.no_access_permission_given_without_user_consent(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatenotify(notify notify, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(notify, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(notify, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(notify, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(notify, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(notify, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(notify, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(notify, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(notify, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(notify, diagnostics, context);
		if (result || diagnostics != null) result &= validatenotify_notify_destination_machines_comply_with_GDPR(notify, diagnostics, context);
		return result;
	}

	/**
	 * Validates the notify_destination_machines_comply_with_GDPR constraint of '<em>notify</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatenotify_notify_destination_machines_comply_with_GDPR(notify notify, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return notify.notify_destination_machines_comply_with_GDPR(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateupDate(upDate upDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(upDate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(upDate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(upDate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(upDate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(upDate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(upDate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(upDate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(upDate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(upDate, diagnostics, context);
		if (result || diagnostics != null) result &= validateupDate_machine_contains_data_to_update(upDate, diagnostics, context);
		if (result || diagnostics != null) result &= validateupDate_upDate_destination_machines_comply_with_GDPR(upDate, diagnostics, context);
		return result;
	}

	/**
	 * Validates the machine_contains_data_to_update constraint of '<em>up Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateupDate_machine_contains_data_to_update(upDate upDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return upDate.machine_contains_data_to_update(diagnostics, context);
	}

	/**
	 * Validates the upDate_destination_machines_comply_with_GDPR constraint of '<em>up Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateupDate_upDate_destination_machines_comply_with_GDPR(upDate upDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return upDate.upDate_destination_machines_comply_with_GDPR(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatenewData(newData newData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(newData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(newData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(newData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(newData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(newData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(newData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(newData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(newData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(newData, diagnostics, context);
		if (result || diagnostics != null) result &= validatenewData_no_empty_newData_fields(newData, diagnostics, context);
		if (result || diagnostics != null) result &= validatenewData_machine_contains_data_to_rectify(newData, diagnostics, context);
		if (result || diagnostics != null) result &= validatenewData_newData_destination_machines_comply_with_GDPR(newData, diagnostics, context);
		return result;
	}

	/**
	 * Validates the no_empty_newData_fields constraint of '<em>new Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatenewData_no_empty_newData_fields(newData newData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newData.no_empty_newData_fields(diagnostics, context);
	}

	/**
	 * Validates the machine_contains_data_to_rectify constraint of '<em>new Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatenewData_machine_contains_data_to_rectify(newData newData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newData.machine_contains_data_to_rectify(diagnostics, context);
	}

	/**
	 * Validates the newData_destination_machines_comply_with_GDPR constraint of '<em>new Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatenewData_newData_destination_machines_comply_with_GDPR(newData newData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return newData.newData_destination_machines_comply_with_GDPR(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateaskDataInformation(askDataInformation askDataInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(askDataInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatereportDataManagement(reportDataManagement reportDataManagement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reportDataManagement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesubscribe(subscribe subscribe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subscribe, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validatesubscribe_maxSubTime_greater_than_0(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validatesubscribe_machine_contains_data_to_subscribe_to(subscribe, diagnostics, context);
		if (result || diagnostics != null) result &= validatesubscribe_subscribe_destination_machines_comply_with_GDPR(subscribe, diagnostics, context);
		return result;
	}

	/**
	 * Validates the maxSubTime_greater_than_0 constraint of '<em>subscribe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesubscribe_maxSubTime_greater_than_0(subscribe subscribe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscribe.maxSubTime_greater_than_0(diagnostics, context);
	}

	/**
	 * Validates the machine_contains_data_to_subscribe_to constraint of '<em>subscribe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesubscribe_machine_contains_data_to_subscribe_to(subscribe subscribe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscribe.machine_contains_data_to_subscribe_to(diagnostics, context);
	}

	/**
	 * Validates the subscribe_destination_machines_comply_with_GDPR constraint of '<em>subscribe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesubscribe_subscribe_destination_machines_comply_with_GDPR(subscribe subscribe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subscribe.subscribe_destination_machines_comply_with_GDPR(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateinformBreaches(informBreaches informBreaches, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(informBreaches, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetimeoutSubscription(timeoutSubscription timeoutSubscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeoutSubscription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatewriteData(writeData writeData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(writeData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(writeData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(writeData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(writeData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(writeData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(writeData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(writeData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(writeData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(writeData, diagnostics, context);
		if (result || diagnostics != null) result &= validatewriteData_no_empty_write_fields(writeData, diagnostics, context);
		if (result || diagnostics != null) result &= validatewriteData_writeData_timeunit_not_days_or_hours_or_minutes(writeData, diagnostics, context);
		return result;
	}

	/**
	 * Validates the no_empty_write_fields constraint of '<em>write Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatewriteData_no_empty_write_fields(writeData writeData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return writeData.no_empty_write_fields(diagnostics, context);
	}

	/**
	 * Validates the writeData_timeunit_not_days_or_hours_or_minutes constraint of '<em>write Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatewriteData_writeData_timeunit_not_days_or_hours_or_minutes(writeData writeData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return writeData.writeData_timeunit_not_days_or_hours_or_minutes(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateaccessInformation(accessInformation accessInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accessInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateremoveSPInLog(removeSPInLog removeSPInLog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(removeSPInLog, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfo(Info info, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(info, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrustedSCM(TrustedSCM trustedSCM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trustedSCM, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUntrustedSCM(UntrustedSCM untrustedSCM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(untrustedSCM, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateconsentInfo(consentInfo consentInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consentInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateok(ok ok, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ok, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateinformationNotForFree(informationNotForFree informationNotForFree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(informationNotForFree, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatewantToAccess(wantToAccess wantToAccess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wantToAccess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatereportDataDManagementForFree(reportDataDManagementForFree reportDataDManagementForFree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reportDataDManagementForFree, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecheckChanges(checkChanges checkChanges, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(checkChanges, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSP(SP sp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBandwidthUnit(BandwidthUnit bandwidthUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnit(TimeUnit timeUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizeUnit(SizeUnit sizeUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Model4datactrackprofileValidator
