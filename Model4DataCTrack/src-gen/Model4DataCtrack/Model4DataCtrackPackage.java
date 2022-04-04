/**
 */
package Model4DataCtrack;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Model4DataCtrack.Model4DataCtrackFactory
 * @model kind="package"
 * @generated
 */
public interface Model4DataCtrackPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Model4DataCtrack";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.model4datactrack.com/Model4DataCTrack/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Model4DataCtrack";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Model4DataCtrackPackage eINSTANCE = Model4DataCtrack.impl.Model4DataCtrackPackageImpl.init();

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.InfrastructureImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getInfrastructure()
	 * @generated
	 */
	int INFRASTRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Cloud Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__CLOUD_PROVIDER = 2;

	/**
	 * The feature id for the '<em><b>Datacenterelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__DATACENTERELEMENTS = 3;

	/**
	 * The number of structural features of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.BandwidthImpl <em>Bandwidth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.BandwidthImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getBandwidth()
	 * @generated
	 */
	int BANDWIDTH = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Bandwidth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Bandwidth value greater than 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH___BANDWIDTH_VALUE_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Bandwidth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.ControllerCPImpl <em>Controller CP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.ControllerCPImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getControllerCP()
	 * @generated
	 */
	int CONTROLLER_CP = 2;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CP__BASE_LIFELINE = 0;

	/**
	 * The feature id for the '<em><b>Resource Allocation Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CP__RESOURCE_ALLOCATION_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Id Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CP__ID_PROVIDER = 2;

	/**
	 * The feature id for the '<em><b>Sla</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CP__SLA = 3;

	/**
	 * The feature id for the '<em><b>Accesslog</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CP__ACCESSLOG = 4;

	/**
	 * The number of structural features of the '<em>Controller CP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CP_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>New Location machine not under sla with controller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CP___NEW_LOCATION_MACHINE_NOT_UNDER_SLA_WITH_CONTROLLER__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Location1 machine not under sla with controller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CP___LOCATION1_MACHINE_NOT_UNDER_SLA_WITH_CONTROLLER__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Source Machine not under sla with controller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CP___SOURCE_MACHINE_NOT_UNDER_SLA_WITH_CONTROLLER__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Controller CP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CP_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.SLAImpl <em>SLA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.SLAImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getSLA()
	 * @generated
	 */
	int SLA = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Subject Matter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__SUBJECT_MATTER = 1;

	/**
	 * The feature id for the '<em><b>Processing Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__PROCESSING_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__BASE_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Recipients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__RECIPIENTS = 4;

	/**
	 * The feature id for the '<em><b>Processing Nature</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__PROCESSING_NATURE = 5;

	/**
	 * The feature id for the '<em><b>Processing Purpose</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__PROCESSING_PURPOSE = 6;

	/**
	 * The feature id for the '<em><b>Processing Instructions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA__PROCESSING_INSTRUCTIONS = 7;

	/**
	 * The number of structural features of the '<em>SLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>SLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.TimeImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Time value greater than 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME___TIME_VALUE_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.AccessLogImpl <em>Access Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.AccessLogImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getAccessLog()
	 * @generated
	 */
	int ACCESS_LOG = 7;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.MachineImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 22;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.SSMProcessorImpl <em>SSM Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.SSMProcessorImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getSSMProcessor()
	 * @generated
	 */
	int SSM_PROCESSOR = 29;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.HardwareImpl <em>Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.HardwareImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getHardware()
	 * @generated
	 */
	int HARDWARE = 9;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.CPUImpl <em>CPU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.CPUImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getCPU()
	 * @generated
	 */
	int CPU = 23;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.MemoryImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 24;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.SizeImpl <em>Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.SizeImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 10;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.LatencyImpl <em>Latency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.LatencyImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getLatency()
	 * @generated
	 */
	int LATENCY = 25;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.StorageImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 8;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.DataImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getData()
	 * @generated
	 */
	int DATA = 11;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.DataArchiveImpl <em>Data Archive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.DataArchiveImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getDataArchive()
	 * @generated
	 */
	int DATA_ARCHIVE = 12;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.DataFieldImpl <em>Data Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.DataFieldImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getDataField()
	 * @generated
	 */
	int DATA_FIELD = 13;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.StickyPolicyImpl <em>Sticky Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.StickyPolicyImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getStickyPolicy()
	 * @generated
	 */
	int STICKY_POLICY = 14;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.PermissionPerTPImpl <em>Permission Per TP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.PermissionPerTPImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getPermissionPerTP()
	 * @generated
	 */
	int PERMISSION_PER_TP = 15;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.PListImpl <em>PList</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.PListImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getPList()
	 * @generated
	 */
	int PLIST = 16;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.PrincipalImpl <em>Principal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.PrincipalImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getPrincipal()
	 * @generated
	 */
	int PRINCIPAL = 6;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__BASE_LIFELINE = 1;

	/**
	 * The number of structural features of the '<em>Principal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Principal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.StatelessAppCTPImpl <em>Stateless App CTP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.StatelessAppCTPImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getStatelessAppCTP()
	 * @generated
	 */
	int STATELESS_APP_CTP = 5;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.UserImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getUser()
	 * @generated
	 */
	int USER = 30;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.AccesPerTPImpl <em>Acces Per TP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.AccesPerTPImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getAccesPerTP()
	 * @generated
	 */
	int ACCES_PER_TP = 17;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_APP_CTP__BASE_COMPONENT = PRINCIPAL__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_APP_CTP__BASE_LIFELINE = PRINCIPAL__BASE_LIFELINE;

	/**
	 * The number of structural features of the '<em>Stateless App CTP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_APP_CTP_FEATURE_COUNT = PRINCIPAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stateless App CTP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_APP_CTP_OPERATION_COUNT = PRINCIPAL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG__BASE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Tp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG__TP = 2;

	/**
	 * The feature id for the '<em><b>L1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG__L1 = 3;

	/**
	 * The feature id for the '<em><b>Sp1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG__SP1 = 4;

	/**
	 * The feature id for the '<em><b>O</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG__O = 5;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG__ACTION = 6;

	/**
	 * The feature id for the '<em><b>Nl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG__NL = 7;

	/**
	 * The feature id for the '<em><b>Nsp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG__NSP = 8;

	/**
	 * The number of structural features of the '<em>Access Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Log access match sp access</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG___LOG_ACCESS_MATCH_SP_ACCESS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Access Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LOG_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__BASE_COMPONENT = HARDWARE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Number Of Drivers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__NUMBER_OF_DRIVERS = HARDWARE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dirve Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__DIRVE_CAPACITY = HARDWARE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Read Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__READ_BANDWIDTH = HARDWARE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__DATA = HARDWARE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = HARDWARE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Number Of Drivers greater than 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE___NUMBER_OF_DRIVERS_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = HARDWARE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Size value greater than 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE___SIZE_VALUE_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ARCHIVE = 1;

	/**
	 * The feature id for the '<em><b>Applied Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__APPLIED_POLICY = 2;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__BASE_COMPONENT = 3;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ARCHIVE__CONTENTS = 0;

	/**
	 * The feature id for the '<em><b>Id Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ARCHIVE__ID_DATA = 1;

	/**
	 * The number of structural features of the '<em>Data Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ARCHIVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Archive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ARCHIVE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Data Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKY_POLICY__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKY_POLICY__PERMISSION = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKY_POLICY__BASE_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKY_POLICY__OWNER = 3;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKY_POLICY__PURPOSE = 4;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKY_POLICY__CONTROLLER = 5;

	/**
	 * The feature id for the '<em><b>Access History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKY_POLICY__ACCESS_HISTORY = 6;

	/**
	 * The number of structural features of the '<em>Sticky Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKY_POLICY_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Allowed access purpose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKY_POLICY___ALLOWED_ACCESS_PURPOSE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>All tps in history given permissions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKY_POLICY___ALL_TPS_IN_HISTORY_GIVEN_PERMISSIONS__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Sticky Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STICKY_POLICY_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_PER_TP__S = 0;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_PER_TP__I = 1;

	/**
	 * The number of structural features of the '<em>Permission Per TP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_PER_TP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Permission Per TP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_PER_TP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLIST__LIST = 0;

	/**
	 * The number of structural features of the '<em>PList</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>PList</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLIST_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Tp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCES_PER_TP__TP = 0;

	/**
	 * The feature id for the '<em><b>Action Performed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCES_PER_TP__ACTION_PERFORMED = 1;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCES_PER_TP__PURPOSE = 2;

	/**
	 * The number of structural features of the '<em>Acces Per TP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCES_PER_TP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Acces Per TP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCES_PER_TP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.DataCenterElementImpl <em>Data Center Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.DataCenterElementImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getDataCenterElement()
	 * @generated
	 */
	int DATA_CENTER_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Number Of Data Centers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_ELEMENT__NUMBER_OF_DATA_CENTERS = 0;

	/**
	 * The feature id for the '<em><b>Data Center Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_ELEMENT__DATA_CENTER_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Data Center Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>No empty infra</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_ELEMENT___NO_EMPTY_INFRA__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Data Center Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.DataCenterImpl <em>Data Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.DataCenterImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getDataCenter()
	 * @generated
	 */
	int DATA_CENTER = 19;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Rack</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__RACK = 2;

	/**
	 * The number of structural features of the '<em>Data Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.RackElementImpl <em>Rack Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.RackElementImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getRackElement()
	 * @generated
	 */
	int RACK_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Number Of Racks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_ELEMENT__NUMBER_OF_RACKS = 0;

	/**
	 * The feature id for the '<em><b>Rack Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_ELEMENT__RACK_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Rack Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>No empty datacenters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_ELEMENT___NO_EMPTY_DATACENTERS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Rack Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.RackImpl <em>Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.RackImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getRack()
	 * @generated
	 */
	int RACK = 21;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Machines Per Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__MACHINES_PER_BOARD = 1;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__NETWORK = 2;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__BOARDS = 3;

	/**
	 * The number of structural features of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>No empty racks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK___NO_EMPTY_RACKS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__CPU = 1;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__MEMORY = 2;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__STORAGE = 3;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__BASE_COMPONENT = HARDWARE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__CORES = HARDWARE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>FLO Ps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__FLO_PS = HARDWARE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CPU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_FEATURE_COUNT = HARDWARE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Cpu cores and flops greater than 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU___CPU_CORES_AND_FLOPS_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP = HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>CPU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_OPERATION_COUNT = HARDWARE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__BASE_COMPONENT = HARDWARE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__CAPACITY = HARDWARE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__LATENCY = HARDWARE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FEATURE_COUNT = HARDWARE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_OPERATION_COUNT = HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__TIME = 1;

	/**
	 * The number of structural features of the '<em>Latency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Latency not in us or ns</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY___LATENCY_NOT_IN_US_OR_NS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Latency name not empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY___LATENCY_NAME_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Latency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.ComputingRackImpl <em>Computing Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.ComputingRackImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getComputingRack()
	 * @generated
	 */
	int COMPUTING_RACK = 26;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RACK__BASE_COMPONENT = RACK__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Machines Per Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RACK__MACHINES_PER_BOARD = RACK__MACHINES_PER_BOARD;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RACK__NETWORK = RACK__NETWORK;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RACK__BOARDS = RACK__BOARDS;

	/**
	 * The feature id for the '<em><b>Machine Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RACK__MACHINE_TYPE = RACK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Computing Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RACK_FEATURE_COUNT = RACK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>No empty racks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RACK___NO_EMPTY_RACKS__DIAGNOSTICCHAIN_MAP = RACK___NO_EMPTY_RACKS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Computing Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_RACK_OPERATION_COUNT = RACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.StatelessComputationMachineImpl <em>Stateless Computation Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.StatelessComputationMachineImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getStatelessComputationMachine()
	 * @generated
	 */
	int STATELESS_COMPUTATION_MACHINE = 27;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_COMPUTATION_MACHINE__BASE_COMPONENT = MACHINE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_COMPUTATION_MACHINE__CPU = MACHINE__CPU;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_COMPUTATION_MACHINE__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_COMPUTATION_MACHINE__STORAGE = MACHINE__STORAGE;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_COMPUTATION_MACHINE__APPLICATIONS = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_COMPUTATION_MACHINE__PURPOSE = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stateless Computation Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_COMPUTATION_MACHINE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stateless Computation Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATELESS_COMPUTATION_MACHINE_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.StorageRackImpl <em>Storage Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.StorageRackImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getStorageRack()
	 * @generated
	 */
	int STORAGE_RACK = 28;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RACK__BASE_COMPONENT = RACK__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Machines Per Board</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RACK__MACHINES_PER_BOARD = RACK__MACHINES_PER_BOARD;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RACK__NETWORK = RACK__NETWORK;

	/**
	 * The feature id for the '<em><b>Boards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RACK__BOARDS = RACK__BOARDS;

	/**
	 * The feature id for the '<em><b>Machine Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RACK__MACHINE_TYPE = RACK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Storage Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RACK_FEATURE_COUNT = RACK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>No empty racks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RACK___NO_EMPTY_RACKS__DIAGNOSTICCHAIN_MAP = RACK___NO_EMPTY_RACKS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Storage Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_RACK_OPERATION_COUNT = RACK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSM_PROCESSOR__BASE_COMPONENT = MACHINE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSM_PROCESSOR__CPU = MACHINE__CPU;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSM_PROCESSOR__MEMORY = MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSM_PROCESSOR__STORAGE = MACHINE__STORAGE;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSM_PROCESSOR__BASE_LIFELINE = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sla</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSM_PROCESSOR__SLA = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>GDPR Compliance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSM_PROCESSOR__GDPR_COMPLIANCE = MACHINE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SSM Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSM_PROCESSOR_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>SSM Proccessor complies GDPR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSM_PROCESSOR___SSM_PROCCESSOR_COMPLIES_GDPR__DIAGNOSTICCHAIN_MAP = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>SSM Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSM_PROCESSOR_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BASE_COMPONENT = PRINCIPAL__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BASE_LIFELINE = PRINCIPAL__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__INSTANCES = PRINCIPAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID_USER = PRINCIPAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = PRINCIPAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = PRINCIPAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.sendDataImpl <em>send Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.sendDataImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getsendData()
	 * @generated
	 */
	int SEND_DATA = 31;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_DATA__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_DATA__MAX_TIME = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_DATA__DATA = 2;

	/**
	 * The number of structural features of the '<em>send Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_DATA_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Send Data timeunit not days or hours or minutes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_DATA___SEND_DATA_TIMEUNIT_NOT_DAYS_OR_HOURS_OR_MINUTES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Send Data max Time value greater than 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_DATA___SEND_DATA_MAX_TIME_VALUE_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>send Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_DATA_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.newRestrictionsImpl <em>new Restrictions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.newRestrictionsImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getnewRestrictions()
	 * @generated
	 */
	int NEW_RESTRICTIONS = 32;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_RESTRICTIONS__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_RESTRICTIONS__DATA = 1;

	/**
	 * The feature id for the '<em><b>New SP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_RESTRICTIONS__NEW_SP = 2;

	/**
	 * The number of structural features of the '<em>new Restrictions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_RESTRICTIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>new Restrictions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_RESTRICTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.rectifyDataImpl <em>rectify Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.rectifyDataImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getrectifyData()
	 * @generated
	 */
	int RECTIFY_DATA = 33;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFY_DATA__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFY_DATA__DATA = 1;

	/**
	 * The feature id for the '<em><b>New Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFY_DATA__NEW_DATA = 2;

	/**
	 * The number of structural features of the '<em>rectify Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFY_DATA_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>No empty rectify fields</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFY_DATA___NO_EMPTY_RECTIFY_FIELDS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>rectify Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTIFY_DATA_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.removeDataImpl <em>remove Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.removeDataImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getremoveData()
	 * @generated
	 */
	int REMOVE_DATA = 34;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA__DATA = 1;

	/**
	 * The number of structural features of the '<em>remove Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>remove Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.eraseDataImpl <em>erase Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.eraseDataImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#geteraseData()
	 * @generated
	 */
	int ERASE_DATA = 35;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERASE_DATA__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERASE_DATA__DATA = 1;

	/**
	 * The feature id for the '<em><b>Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERASE_DATA__MACHINES = 2;

	/**
	 * The number of structural features of the '<em>erase Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERASE_DATA_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Machine contains data to erase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERASE_DATA___MACHINE_CONTAINS_DATA_TO_ERASE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Erase Data destination machines comply with GDPR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERASE_DATA___ERASE_DATA_DESTINATION_MACHINES_COMPLY_WITH_GDPR__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>erase Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERASE_DATA_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.consentImpl <em>consent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.consentImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getconsent()
	 * @generated
	 */
	int CONSENT = 36;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__DATA = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__ACTION = 2;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__PURPOSE = 3;

	/**
	 * The number of structural features of the '<em>consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Consent machine complies with GDPR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT___CONSENT_MACHINE_COMPLIES_WITH_GDPR__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.askAuthenticationImpl <em>ask Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.askAuthenticationImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getaskAuthentication()
	 * @generated
	 */
	int ASK_AUTHENTICATION = 37;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_AUTHENTICATION__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>ask Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_AUTHENTICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ask Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_AUTHENTICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.tpImpl <em>tp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.tpImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#gettp()
	 * @generated
	 */
	int TP = 38;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Tp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP__TP = 1;

	/**
	 * The number of structural features of the '<em>tp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>tp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.readDataImpl <em>read Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.readDataImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getreadData()
	 * @generated
	 */
	int READ_DATA = 39;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_DATA__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>read Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>read Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.permissionImpl <em>permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.permissionImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getpermission()
	 * @generated
	 */
	int PERMISSION = 40;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PURPOSE = 1;

	/**
	 * The feature id for the '<em><b>Permission Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PERMISSION_TYPE = 2;

	/**
	 * The number of structural features of the '<em>permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>No access permission given without user consent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION___NO_ACCESS_PERMISSION_GIVEN_WITHOUT_USER_CONSENT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.notifyImpl <em>notify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.notifyImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getnotify()
	 * @generated
	 */
	int NOTIFY = 41;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY__DATA = 1;

	/**
	 * The feature id for the '<em><b>Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY__MACHINES = 2;

	/**
	 * The feature id for the '<em><b>Breaches</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY__BREACHES = 3;

	/**
	 * The number of structural features of the '<em>notify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Notify destination machines comply with GDPR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY___NOTIFY_DESTINATION_MACHINES_COMPLY_WITH_GDPR__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>notify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.upDateImpl <em>up Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.upDateImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getupDate()
	 * @generated
	 */
	int UP_DATE = 42;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_DATE__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_DATE__DATA = 1;

	/**
	 * The feature id for the '<em><b>Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_DATE__MACHINES = 2;

	/**
	 * The feature id for the '<em><b>New SP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_DATE__NEW_SP = 3;

	/**
	 * The number of structural features of the '<em>up Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_DATE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Machine contains data to update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_DATE___MACHINE_CONTAINS_DATA_TO_UPDATE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Up Date destination machines comply with GDPR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_DATE___UP_DATE_DESTINATION_MACHINES_COMPLY_WITH_GDPR__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>up Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UP_DATE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.newDataImpl <em>new Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.newDataImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getnewData()
	 * @generated
	 */
	int NEW_DATA = 43;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA__DATA = 1;

	/**
	 * The feature id for the '<em><b>Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA__MACHINES = 2;

	/**
	 * The feature id for the '<em><b>New Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA__NEW_DATA = 3;

	/**
	 * The number of structural features of the '<em>new Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>No empty new Data fields</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA___NO_EMPTY_NEW_DATA_FIELDS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Machine contains data to rectify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA___MACHINE_CONTAINS_DATA_TO_RECTIFY__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>New Data destination machines comply with GDPR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA___NEW_DATA_DESTINATION_MACHINES_COMPLY_WITH_GDPR__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>new Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_DATA_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.askDataInformationImpl <em>ask Data Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.askDataInformationImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getaskDataInformation()
	 * @generated
	 */
	int ASK_DATA_INFORMATION = 44;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_DATA_INFORMATION__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_DATA_INFORMATION__USER = 1;

	/**
	 * The number of structural features of the '<em>ask Data Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_DATA_INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ask Data Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASK_DATA_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.reportDataManagementImpl <em>report Data Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.reportDataManagementImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getreportDataManagement()
	 * @generated
	 */
	int REPORT_DATA_MANAGEMENT = 45;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_DATA_MANAGEMENT__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>report Data Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_DATA_MANAGEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>report Data Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_DATA_MANAGEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.subscribeImpl <em>subscribe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.subscribeImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getsubscribe()
	 * @generated
	 */
	int SUBSCRIBE = 46;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE__DATA = 1;

	/**
	 * The feature id for the '<em><b>Machines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE__MACHINES = 2;

	/**
	 * The feature id for the '<em><b>Breaches</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE__BREACHES = 3;

	/**
	 * The feature id for the '<em><b>Max Subscription Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE__MAX_SUBSCRIPTION_TIME = 4;

	/**
	 * The number of structural features of the '<em>subscribe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Max Sub Time greater than 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE___MAX_SUB_TIME_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Machine contains data to subscribe to</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE___MACHINE_CONTAINS_DATA_TO_SUBSCRIBE_TO__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Subscribe destination machines comply with GDPR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE___SUBSCRIBE_DESTINATION_MACHINES_COMPLY_WITH_GDPR__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>subscribe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.informBreachesImpl <em>inform Breaches</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.informBreachesImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getinformBreaches()
	 * @generated
	 */
	int INFORM_BREACHES = 47;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORM_BREACHES__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>inform Breaches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORM_BREACHES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>inform Breaches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORM_BREACHES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.timeoutSubscriptionImpl <em>timeout Subscription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.timeoutSubscriptionImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#gettimeoutSubscription()
	 * @generated
	 */
	int TIMEOUT_SUBSCRIPTION = 48;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_SUBSCRIPTION__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>timeout Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_SUBSCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>timeout Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_SUBSCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.writeDataImpl <em>write Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.writeDataImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getwriteData()
	 * @generated
	 */
	int WRITE_DATA = 49;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_DATA__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>New Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_DATA__NEW_DATA = 1;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_DATA__MAX_TIME = 2;

	/**
	 * The number of structural features of the '<em>write Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_DATA_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>No empty write fields</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_DATA___NO_EMPTY_WRITE_FIELDS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Write Data timeunit not days or hours or minutes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_DATA___WRITE_DATA_TIMEUNIT_NOT_DAYS_OR_HOURS_OR_MINUTES__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>write Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_DATA_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.accessInformationImpl <em>access Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.accessInformationImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getaccessInformation()
	 * @generated
	 */
	int ACCESS_INFORMATION = 50;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_INFORMATION__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>access Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_INFORMATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>access Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.removeSPInLogImpl <em>remove SP In Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.removeSPInLogImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getremoveSPInLog()
	 * @generated
	 */
	int REMOVE_SP_IN_LOG = 51;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SP_IN_LOG__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>remove SP In Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SP_IN_LOG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>remove SP In Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SP_IN_LOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.InfoImpl <em>Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.InfoImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getInfo()
	 * @generated
	 */
	int INFO = 52;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__MAX_TIME = 1;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__PROVIDER = 2;

	/**
	 * The feature id for the '<em><b>Recipients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__RECIPIENTS = 3;

	/**
	 * The number of structural features of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.TrustedSCMImpl <em>Trusted SCM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.TrustedSCMImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getTrustedSCM()
	 * @generated
	 */
	int TRUSTED_SCM = 53;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_SCM__BASE_COMPONENT = STATELESS_COMPUTATION_MACHINE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_SCM__CPU = STATELESS_COMPUTATION_MACHINE__CPU;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_SCM__MEMORY = STATELESS_COMPUTATION_MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_SCM__STORAGE = STATELESS_COMPUTATION_MACHINE__STORAGE;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_SCM__APPLICATIONS = STATELESS_COMPUTATION_MACHINE__APPLICATIONS;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_SCM__PURPOSE = STATELESS_COMPUTATION_MACHINE__PURPOSE;

	/**
	 * The number of structural features of the '<em>Trusted SCM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_SCM_FEATURE_COUNT = STATELESS_COMPUTATION_MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trusted SCM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUSTED_SCM_OPERATION_COUNT = STATELESS_COMPUTATION_MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.UntrustedSCMImpl <em>Untrusted SCM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.UntrustedSCMImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getUntrustedSCM()
	 * @generated
	 */
	int UNTRUSTED_SCM = 54;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTRUSTED_SCM__BASE_COMPONENT = STATELESS_COMPUTATION_MACHINE__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTRUSTED_SCM__CPU = STATELESS_COMPUTATION_MACHINE__CPU;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTRUSTED_SCM__MEMORY = STATELESS_COMPUTATION_MACHINE__MEMORY;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTRUSTED_SCM__STORAGE = STATELESS_COMPUTATION_MACHINE__STORAGE;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTRUSTED_SCM__APPLICATIONS = STATELESS_COMPUTATION_MACHINE__APPLICATIONS;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTRUSTED_SCM__PURPOSE = STATELESS_COMPUTATION_MACHINE__PURPOSE;

	/**
	 * The number of structural features of the '<em>Untrusted SCM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTRUSTED_SCM_FEATURE_COUNT = STATELESS_COMPUTATION_MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Untrusted SCM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNTRUSTED_SCM_OPERATION_COUNT = STATELESS_COMPUTATION_MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.consentInfoImpl <em>consent Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.consentInfoImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getconsentInfo()
	 * @generated
	 */
	int CONSENT_INFO = 55;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_INFO__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_INFO__PURPOSE = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_INFO__ACTION = 2;

	/**
	 * The feature id for the '<em><b>Tp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_INFO__TP = 3;

	/**
	 * The number of structural features of the '<em>consent Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>consent Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.okImpl <em>ok</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.okImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getok()
	 * @generated
	 */
	int OK = 56;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK__PURPOSE = 1;

	/**
	 * The feature id for the '<em><b>Permission Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK__PERMISSION_TYPE = 2;

	/**
	 * The number of structural features of the '<em>ok</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ok</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.informationNotForFreeImpl <em>information Not For Free</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.informationNotForFreeImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getinformationNotForFree()
	 * @generated
	 */
	int INFORMATION_NOT_FOR_FREE = 57;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_NOT_FOR_FREE__BASE_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_NOT_FOR_FREE__PRICE = 1;

	/**
	 * The number of structural features of the '<em>information Not For Free</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_NOT_FOR_FREE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>information Not For Free</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_NOT_FOR_FREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.wantToAccessImpl <em>want To Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.wantToAccessImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getwantToAccess()
	 * @generated
	 */
	int WANT_TO_ACCESS = 58;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WANT_TO_ACCESS__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>want To Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WANT_TO_ACCESS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>want To Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WANT_TO_ACCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.reportDataDManagementForFreeImpl <em>report Data DManagement For Free</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.reportDataDManagementForFreeImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getreportDataDManagementForFree()
	 * @generated
	 */
	int REPORT_DATA_DMANAGEMENT_FOR_FREE = 59;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_DATA_DMANAGEMENT_FOR_FREE__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>report Data DManagement For Free</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_DATA_DMANAGEMENT_FOR_FREE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>report Data DManagement For Free</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_DATA_DMANAGEMENT_FOR_FREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.checkChangesImpl <em>check Changes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.checkChangesImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getcheckChanges()
	 * @generated
	 */
	int CHECK_CHANGES = 60;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CHANGES__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>check Changes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CHANGES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>check Changes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CHANGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.impl.SPImpl <em>SP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.impl.SPImpl
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getSP()
	 * @generated
	 */
	int SP = 61;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>SP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>SP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.BandwidthUnit <em>Bandwidth Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.BandwidthUnit
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getBandwidthUnit()
	 * @generated
	 */
	int BANDWIDTH_UNIT = 62;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.TimeUnit
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 63;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.SizeUnit <em>Size Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.SizeUnit
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getSizeUnit()
	 * @generated
	 */
	int SIZE_UNIT = 64;

	/**
	 * The meta object id for the '{@link Model4DataCtrack.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model4DataCtrack.ActionType
	 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 65;


	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure</em>'.
	 * @see Model4DataCtrack.Infrastructure
	 * @generated
	 */
	EClass getInfrastructure();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.Infrastructure#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see Model4DataCtrack.Infrastructure#getBase_Component()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EReference getInfrastructure_Base_Component();

	/**
	 * Returns the meta object for the containment reference '{@link Model4DataCtrack.Infrastructure#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network</em>'.
	 * @see Model4DataCtrack.Infrastructure#getNetwork()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EReference getInfrastructure_Network();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.Infrastructure#getCloudProvider <em>Cloud Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cloud Provider</em>'.
	 * @see Model4DataCtrack.Infrastructure#getCloudProvider()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EReference getInfrastructure_CloudProvider();

	/**
	 * Returns the meta object for the containment reference list '{@link Model4DataCtrack.Infrastructure#getDatacenterelements <em>Datacenterelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datacenterelements</em>'.
	 * @see Model4DataCtrack.Infrastructure#getDatacenterelements()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EReference getInfrastructure_Datacenterelements();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.Bandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bandwidth</em>'.
	 * @see Model4DataCtrack.Bandwidth
	 * @generated
	 */
	EClass getBandwidth();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.Bandwidth#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Model4DataCtrack.Bandwidth#getValue()
	 * @see #getBandwidth()
	 * @generated
	 */
	EAttribute getBandwidth_Value();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.Bandwidth#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see Model4DataCtrack.Bandwidth#getUnit()
	 * @see #getBandwidth()
	 * @generated
	 */
	EAttribute getBandwidth_Unit();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.Bandwidth#bandwidth_value_greater_than_0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Bandwidth value greater than 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bandwidth value greater than 0</em>' operation.
	 * @see Model4DataCtrack.Bandwidth#bandwidth_value_greater_than_0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBandwidth__Bandwidth_value_greater_than_0__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.ControllerCP <em>Controller CP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller CP</em>'.
	 * @see Model4DataCtrack.ControllerCP
	 * @generated
	 */
	EClass getControllerCP();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.ControllerCP#getBase_Lifeline <em>Base Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Lifeline</em>'.
	 * @see Model4DataCtrack.ControllerCP#getBase_Lifeline()
	 * @see #getControllerCP()
	 * @generated
	 */
	EReference getControllerCP_Base_Lifeline();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.ControllerCP#getResourceAllocationPolicy <em>Resource Allocation Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Allocation Policy</em>'.
	 * @see Model4DataCtrack.ControllerCP#getResourceAllocationPolicy()
	 * @see #getControllerCP()
	 * @generated
	 */
	EAttribute getControllerCP_ResourceAllocationPolicy();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.ControllerCP#getIdProvider <em>Id Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Provider</em>'.
	 * @see Model4DataCtrack.ControllerCP#getIdProvider()
	 * @see #getControllerCP()
	 * @generated
	 */
	EAttribute getControllerCP_IdProvider();

	/**
	 * Returns the meta object for the reference list '{@link Model4DataCtrack.ControllerCP#getSla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sla</em>'.
	 * @see Model4DataCtrack.ControllerCP#getSla()
	 * @see #getControllerCP()
	 * @generated
	 */
	EReference getControllerCP_Sla();

	/**
	 * Returns the meta object for the reference list '{@link Model4DataCtrack.ControllerCP#getAccesslog <em>Accesslog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accesslog</em>'.
	 * @see Model4DataCtrack.ControllerCP#getAccesslog()
	 * @see #getControllerCP()
	 * @generated
	 */
	EReference getControllerCP_Accesslog();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.ControllerCP#newLocation_machine_not_under_sla_with_controller(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>New Location machine not under sla with controller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Location machine not under sla with controller</em>' operation.
	 * @see Model4DataCtrack.ControllerCP#newLocation_machine_not_under_sla_with_controller(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getControllerCP__NewLocation_machine_not_under_sla_with_controller__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.ControllerCP#location1_machine_not_under_sla_with_controller(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Location1 machine not under sla with controller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Location1 machine not under sla with controller</em>' operation.
	 * @see Model4DataCtrack.ControllerCP#location1_machine_not_under_sla_with_controller(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getControllerCP__Location1_machine_not_under_sla_with_controller__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.ControllerCP#sourceMachine_not_under_sla_with_controller(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Source Machine not under sla with controller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Machine not under sla with controller</em>' operation.
	 * @see Model4DataCtrack.ControllerCP#sourceMachine_not_under_sla_with_controller(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getControllerCP__SourceMachine_not_under_sla_with_controller__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.SLA <em>SLA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLA</em>'.
	 * @see Model4DataCtrack.SLA
	 * @generated
	 */
	EClass getSLA();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.SLA#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see Model4DataCtrack.SLA#getBase_Class()
	 * @see #getSLA()
	 * @generated
	 */
	EReference getSLA_Base_Class();

	/**
	 * Returns the meta object for the attribute list '{@link Model4DataCtrack.SLA#getSubjectMatter <em>Subject Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Subject Matter</em>'.
	 * @see Model4DataCtrack.SLA#getSubjectMatter()
	 * @see #getSLA()
	 * @generated
	 */
	EAttribute getSLA_SubjectMatter();

	/**
	 * Returns the meta object for the containment reference '{@link Model4DataCtrack.SLA#getProcessingDuration <em>Processing Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processing Duration</em>'.
	 * @see Model4DataCtrack.SLA#getProcessingDuration()
	 * @see #getSLA()
	 * @generated
	 */
	EReference getSLA_ProcessingDuration();

	/**
	 * Returns the meta object for the attribute list '{@link Model4DataCtrack.SLA#getProcessingNature <em>Processing Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Processing Nature</em>'.
	 * @see Model4DataCtrack.SLA#getProcessingNature()
	 * @see #getSLA()
	 * @generated
	 */
	EAttribute getSLA_ProcessingNature();

	/**
	 * Returns the meta object for the attribute list '{@link Model4DataCtrack.SLA#getProcessingPurpose <em>Processing Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Processing Purpose</em>'.
	 * @see Model4DataCtrack.SLA#getProcessingPurpose()
	 * @see #getSLA()
	 * @generated
	 */
	EAttribute getSLA_ProcessingPurpose();

	/**
	 * Returns the meta object for the attribute list '{@link Model4DataCtrack.SLA#getProcessingInstructions <em>Processing Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Processing Instructions</em>'.
	 * @see Model4DataCtrack.SLA#getProcessingInstructions()
	 * @see #getSLA()
	 * @generated
	 */
	EAttribute getSLA_ProcessingInstructions();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.SLA#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see Model4DataCtrack.SLA#getBase_Component()
	 * @see #getSLA()
	 * @generated
	 */
	EReference getSLA_Base_Component();

	/**
	 * Returns the meta object for the reference list '{@link Model4DataCtrack.SLA#getRecipients <em>Recipients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recipients</em>'.
	 * @see Model4DataCtrack.SLA#getRecipients()
	 * @see #getSLA()
	 * @generated
	 */
	EReference getSLA_Recipients();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see Model4DataCtrack.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.Time#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Model4DataCtrack.Time#getValue()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Value();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.Time#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see Model4DataCtrack.Time#getUnit()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Unit();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.Time#time_value_greater_than_0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Time value greater than 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Time value greater than 0</em>' operation.
	 * @see Model4DataCtrack.Time#time_value_greater_than_0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTime__Time_value_greater_than_0__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.AccessLog <em>Access Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Log</em>'.
	 * @see Model4DataCtrack.AccessLog
	 * @generated
	 */
	EClass getAccessLog();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.AccessLog#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see Model4DataCtrack.AccessLog#getBase_Class()
	 * @see #getAccessLog()
	 * @generated
	 */
	EReference getAccessLog_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.AccessLog#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see Model4DataCtrack.AccessLog#getAction()
	 * @see #getAccessLog()
	 * @generated
	 */
	EAttribute getAccessLog_Action();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.AccessLog#getNl <em>Nl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nl</em>'.
	 * @see Model4DataCtrack.AccessLog#getNl()
	 * @see #getAccessLog()
	 * @generated
	 */
	EReference getAccessLog_Nl();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.AccessLog#getNsp <em>Nsp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nsp</em>'.
	 * @see Model4DataCtrack.AccessLog#getNsp()
	 * @see #getAccessLog()
	 * @generated
	 */
	EReference getAccessLog_Nsp();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.AccessLog#getTp <em>Tp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tp</em>'.
	 * @see Model4DataCtrack.AccessLog#getTp()
	 * @see #getAccessLog()
	 * @generated
	 */
	EReference getAccessLog_Tp();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.AccessLog#getL1 <em>L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>L1</em>'.
	 * @see Model4DataCtrack.AccessLog#getL1()
	 * @see #getAccessLog()
	 * @generated
	 */
	EReference getAccessLog_L1();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.AccessLog#getSp1 <em>Sp1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sp1</em>'.
	 * @see Model4DataCtrack.AccessLog#getSp1()
	 * @see #getAccessLog()
	 * @generated
	 */
	EReference getAccessLog_Sp1();

	/**
	 * Returns the meta object for the containment reference list '{@link Model4DataCtrack.AccessLog#getO <em>O</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>O</em>'.
	 * @see Model4DataCtrack.AccessLog#getO()
	 * @see #getAccessLog()
	 * @generated
	 */
	EReference getAccessLog_O();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.AccessLog#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see Model4DataCtrack.AccessLog#getBase_Component()
	 * @see #getAccessLog()
	 * @generated
	 */
	EReference getAccessLog_Base_Component();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.AccessLog#log_access_match_sp_access(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Log access match sp access</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log access match sp access</em>' operation.
	 * @see Model4DataCtrack.AccessLog#log_access_match_sp_access(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAccessLog__Log_access_match_sp_access__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.SSMProcessor <em>SSM Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSM Processor</em>'.
	 * @see Model4DataCtrack.SSMProcessor
	 * @generated
	 */
	EClass getSSMProcessor();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.SSMProcessor#getBase_Lifeline <em>Base Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Lifeline</em>'.
	 * @see Model4DataCtrack.SSMProcessor#getBase_Lifeline()
	 * @see #getSSMProcessor()
	 * @generated
	 */
	EReference getSSMProcessor_Base_Lifeline();

	/**
	 * Returns the meta object for the reference list '{@link Model4DataCtrack.SSMProcessor#getSla <em>Sla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sla</em>'.
	 * @see Model4DataCtrack.SSMProcessor#getSla()
	 * @see #getSSMProcessor()
	 * @generated
	 */
	EReference getSSMProcessor_Sla();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.SSMProcessor#isGDPRCompliance <em>GDPR Compliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GDPR Compliance</em>'.
	 * @see Model4DataCtrack.SSMProcessor#isGDPRCompliance()
	 * @see #getSSMProcessor()
	 * @generated
	 */
	EAttribute getSSMProcessor_GDPRCompliance();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.SSMProcessor#SSMProccessor_complies_GDPR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>SSM Proccessor complies GDPR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>SSM Proccessor complies GDPR</em>' operation.
	 * @see Model4DataCtrack.SSMProcessor#SSMProccessor_complies_GDPR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSSMProcessor__SSMProccessor_complies_GDPR__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see Model4DataCtrack.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.Machine#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see Model4DataCtrack.Machine#getBase_Component()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.Machine#getCpu <em>Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cpu</em>'.
	 * @see Model4DataCtrack.Machine#getCpu()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Cpu();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.Machine#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Memory</em>'.
	 * @see Model4DataCtrack.Machine#getMemory()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Memory();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.Machine#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Storage</em>'.
	 * @see Model4DataCtrack.Machine#getStorage()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Storage();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.CPU <em>CPU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPU</em>'.
	 * @see Model4DataCtrack.CPU
	 * @generated
	 */
	EClass getCPU();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.CPU#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cores</em>'.
	 * @see Model4DataCtrack.CPU#getCores()
	 * @see #getCPU()
	 * @generated
	 */
	EAttribute getCPU_Cores();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.CPU#getFLOPs <em>FLO Ps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLO Ps</em>'.
	 * @see Model4DataCtrack.CPU#getFLOPs()
	 * @see #getCPU()
	 * @generated
	 */
	EAttribute getCPU_FLOPs();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.CPU#cpu_cores_and_flops_greater_than_0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Cpu cores and flops greater than 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cpu cores and flops greater than 0</em>' operation.
	 * @see Model4DataCtrack.CPU#cpu_cores_and_flops_greater_than_0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCPU__Cpu_cores_and_flops_greater_than_0__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware</em>'.
	 * @see Model4DataCtrack.Hardware
	 * @generated
	 */
	EClass getHardware();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.Hardware#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see Model4DataCtrack.Hardware#getBase_Component()
	 * @see #getHardware()
	 * @generated
	 */
	EReference getHardware_Base_Component();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see Model4DataCtrack.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for the containment reference '{@link Model4DataCtrack.Memory#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capacity</em>'.
	 * @see Model4DataCtrack.Memory#getCapacity()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_Capacity();

	/**
	 * Returns the meta object for the containment reference '{@link Model4DataCtrack.Memory#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latency</em>'.
	 * @see Model4DataCtrack.Memory#getLatency()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_Latency();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size</em>'.
	 * @see Model4DataCtrack.Size
	 * @generated
	 */
	EClass getSize();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.Size#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Model4DataCtrack.Size#getValue()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Value();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.Size#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see Model4DataCtrack.Size#getUnit()
	 * @see #getSize()
	 * @generated
	 */
	EAttribute getSize_Unit();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.Size#size_value_greater_than_0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Size value greater than 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Size value greater than 0</em>' operation.
	 * @see Model4DataCtrack.Size#size_value_greater_than_0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSize__Size_value_greater_than_0__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.Latency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency</em>'.
	 * @see Model4DataCtrack.Latency
	 * @generated
	 */
	EClass getLatency();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.Latency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Model4DataCtrack.Latency#getName()
	 * @see #getLatency()
	 * @generated
	 */
	EAttribute getLatency_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Model4DataCtrack.Latency#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see Model4DataCtrack.Latency#getTime()
	 * @see #getLatency()
	 * @generated
	 */
	EReference getLatency_Time();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.Latency#latency_not_in_us_or_ns(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Latency not in us or ns</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Latency not in us or ns</em>' operation.
	 * @see Model4DataCtrack.Latency#latency_not_in_us_or_ns(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLatency__Latency_not_in_us_or_ns__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.Latency#latency_name_not_empty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Latency name not empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Latency name not empty</em>' operation.
	 * @see Model4DataCtrack.Latency#latency_name_not_empty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLatency__Latency_name_not_empty__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see Model4DataCtrack.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.Storage#getNumberOfDrivers <em>Number Of Drivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Drivers</em>'.
	 * @see Model4DataCtrack.Storage#getNumberOfDrivers()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_NumberOfDrivers();

	/**
	 * Returns the meta object for the containment reference '{@link Model4DataCtrack.Storage#getDirveCapacity <em>Dirve Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dirve Capacity</em>'.
	 * @see Model4DataCtrack.Storage#getDirveCapacity()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_DirveCapacity();

	/**
	 * Returns the meta object for the containment reference '{@link Model4DataCtrack.Storage#getReadBandwidth <em>Read Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Read Bandwidth</em>'.
	 * @see Model4DataCtrack.Storage#getReadBandwidth()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_ReadBandwidth();

	/**
	 * Returns the meta object for the reference list '{@link Model4DataCtrack.Storage#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see Model4DataCtrack.Storage#getData()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_Data();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.Storage#numberOfDrivers_greater_than_0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Number Of Drivers greater than 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Number Of Drivers greater than 0</em>' operation.
	 * @see Model4DataCtrack.Storage#numberOfDrivers_greater_than_0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStorage__NumberOfDrivers_greater_than_0__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see Model4DataCtrack.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.Data#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see Model4DataCtrack.Data#getBase_Class()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Base_Class();

	/**
	 * Returns the meta object for the containment reference '{@link Model4DataCtrack.Data#getArchive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive</em>'.
	 * @see Model4DataCtrack.Data#getArchive()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Archive();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.Data#getAppliedPolicy <em>Applied Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applied Policy</em>'.
	 * @see Model4DataCtrack.Data#getAppliedPolicy()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_AppliedPolicy();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.Data#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see Model4DataCtrack.Data#getBase_Component()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Base_Component();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.DataArchive <em>Data Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Archive</em>'.
	 * @see Model4DataCtrack.DataArchive
	 * @generated
	 */
	EClass getDataArchive();

	/**
	 * Returns the meta object for the containment reference list '{@link Model4DataCtrack.DataArchive#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see Model4DataCtrack.DataArchive#getContents()
	 * @see #getDataArchive()
	 * @generated
	 */
	EReference getDataArchive_Contents();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.DataArchive#getIdData <em>Id Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Data</em>'.
	 * @see Model4DataCtrack.DataArchive#getIdData()
	 * @see #getDataArchive()
	 * @generated
	 */
	EAttribute getDataArchive_IdData();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.DataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Field</em>'.
	 * @see Model4DataCtrack.DataField
	 * @generated
	 */
	EClass getDataField();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.DataField#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Model4DataCtrack.DataField#getValue()
	 * @see #getDataField()
	 * @generated
	 */
	EAttribute getDataField_Value();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.StickyPolicy <em>Sticky Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sticky Policy</em>'.
	 * @see Model4DataCtrack.StickyPolicy
	 * @generated
	 */
	EClass getStickyPolicy();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.StickyPolicy#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see Model4DataCtrack.StickyPolicy#getBase_Class()
	 * @see #getStickyPolicy()
	 * @generated
	 */
	EReference getStickyPolicy_Base_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link Model4DataCtrack.StickyPolicy#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permission</em>'.
	 * @see Model4DataCtrack.StickyPolicy#getPermission()
	 * @see #getStickyPolicy()
	 * @generated
	 */
	EReference getStickyPolicy_Permission();

	/**
	 * Returns the meta object for the containment reference list '{@link Model4DataCtrack.StickyPolicy#getAccessHistory <em>Access History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access History</em>'.
	 * @see Model4DataCtrack.StickyPolicy#getAccessHistory()
	 * @see #getStickyPolicy()
	 * @generated
	 */
	EReference getStickyPolicy_AccessHistory();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.StickyPolicy#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller</em>'.
	 * @see Model4DataCtrack.StickyPolicy#getController()
	 * @see #getStickyPolicy()
	 * @generated
	 */
	EReference getStickyPolicy_Controller();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.StickyPolicy#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see Model4DataCtrack.StickyPolicy#getBase_Component()
	 * @see #getStickyPolicy()
	 * @generated
	 */
	EReference getStickyPolicy_Base_Component();

	/**
	 * Returns the meta object for the containment reference '{@link Model4DataCtrack.StickyPolicy#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owner</em>'.
	 * @see Model4DataCtrack.StickyPolicy#getOwner()
	 * @see #getStickyPolicy()
	 * @generated
	 */
	EReference getStickyPolicy_Owner();

	/**
	 * Returns the meta object for the attribute list '{@link Model4DataCtrack.StickyPolicy#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Purpose</em>'.
	 * @see Model4DataCtrack.StickyPolicy#getPurpose()
	 * @see #getStickyPolicy()
	 * @generated
	 */
	EAttribute getStickyPolicy_Purpose();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.StickyPolicy#allowed_access_purpose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Allowed access purpose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Allowed access purpose</em>' operation.
	 * @see Model4DataCtrack.StickyPolicy#allowed_access_purpose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStickyPolicy__Allowed_access_purpose__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.StickyPolicy#all_tps_in_history_given_permissions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>All tps in history given permissions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All tps in history given permissions</em>' operation.
	 * @see Model4DataCtrack.StickyPolicy#all_tps_in_history_given_permissions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStickyPolicy__All_tps_in_history_given_permissions__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.PermissionPerTP <em>Permission Per TP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission Per TP</em>'.
	 * @see Model4DataCtrack.PermissionPerTP
	 * @generated
	 */
	EClass getPermissionPerTP();

	/**
	 * Returns the meta object for the containment reference list '{@link Model4DataCtrack.PermissionPerTP#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>S</em>'.
	 * @see Model4DataCtrack.PermissionPerTP#getS()
	 * @see #getPermissionPerTP()
	 * @generated
	 */
	EReference getPermissionPerTP_S();

	/**
	 * Returns the meta object for the containment reference list '{@link Model4DataCtrack.PermissionPerTP#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see Model4DataCtrack.PermissionPerTP#getI()
	 * @see #getPermissionPerTP()
	 * @generated
	 */
	EReference getPermissionPerTP_I();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.PList <em>PList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PList</em>'.
	 * @see Model4DataCtrack.PList
	 * @generated
	 */
	EClass getPList();

	/**
	 * Returns the meta object for the reference list '{@link Model4DataCtrack.PList#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List</em>'.
	 * @see Model4DataCtrack.PList#getList()
	 * @see #getPList()
	 * @generated
	 */
	EReference getPList_List();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.Principal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Principal</em>'.
	 * @see Model4DataCtrack.Principal
	 * @generated
	 */
	EClass getPrincipal();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.Principal#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see Model4DataCtrack.Principal#getBase_Component()
	 * @see #getPrincipal()
	 * @generated
	 */
	EReference getPrincipal_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.Principal#getBase_Lifeline <em>Base Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Lifeline</em>'.
	 * @see Model4DataCtrack.Principal#getBase_Lifeline()
	 * @see #getPrincipal()
	 * @generated
	 */
	EReference getPrincipal_Base_Lifeline();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.StatelessAppCTP <em>Stateless App CTP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stateless App CTP</em>'.
	 * @see Model4DataCtrack.StatelessAppCTP
	 * @generated
	 */
	EClass getStatelessAppCTP();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see Model4DataCtrack.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.User#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instances</em>'.
	 * @see Model4DataCtrack.User#getInstances()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Instances();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.User#getIdUser <em>Id User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id User</em>'.
	 * @see Model4DataCtrack.User#getIdUser()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_IdUser();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.AccesPerTP <em>Acces Per TP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acces Per TP</em>'.
	 * @see Model4DataCtrack.AccesPerTP
	 * @generated
	 */
	EClass getAccesPerTP();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.AccesPerTP#getTp <em>Tp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tp</em>'.
	 * @see Model4DataCtrack.AccesPerTP#getTp()
	 * @see #getAccesPerTP()
	 * @generated
	 */
	EReference getAccesPerTP_Tp();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.AccesPerTP#getActionPerformed <em>Action Performed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Performed</em>'.
	 * @see Model4DataCtrack.AccesPerTP#getActionPerformed()
	 * @see #getAccesPerTP()
	 * @generated
	 */
	EAttribute getAccesPerTP_ActionPerformed();

	/**
	 * Returns the meta object for the attribute list '{@link Model4DataCtrack.AccesPerTP#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Purpose</em>'.
	 * @see Model4DataCtrack.AccesPerTP#getPurpose()
	 * @see #getAccesPerTP()
	 * @generated
	 */
	EAttribute getAccesPerTP_Purpose();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.DataCenterElement <em>Data Center Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Center Element</em>'.
	 * @see Model4DataCtrack.DataCenterElement
	 * @generated
	 */
	EClass getDataCenterElement();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.DataCenterElement#getNumberOfDataCenters <em>Number Of Data Centers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Data Centers</em>'.
	 * @see Model4DataCtrack.DataCenterElement#getNumberOfDataCenters()
	 * @see #getDataCenterElement()
	 * @generated
	 */
	EAttribute getDataCenterElement_NumberOfDataCenters();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.DataCenterElement#getDataCenterType <em>Data Center Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Center Type</em>'.
	 * @see Model4DataCtrack.DataCenterElement#getDataCenterType()
	 * @see #getDataCenterElement()
	 * @generated
	 */
	EReference getDataCenterElement_DataCenterType();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.DataCenterElement#no_empty_infra(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No empty infra</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No empty infra</em>' operation.
	 * @see Model4DataCtrack.DataCenterElement#no_empty_infra(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDataCenterElement__No_empty_infra__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.DataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Center</em>'.
	 * @see Model4DataCtrack.DataCenter
	 * @generated
	 */
	EClass getDataCenter();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.DataCenter#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see Model4DataCtrack.DataCenter#getBase_Component()
	 * @see #getDataCenter()
	 * @generated
	 */
	EReference getDataCenter_Base_Component();

	/**
	 * Returns the meta object for the containment reference '{@link Model4DataCtrack.DataCenter#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network</em>'.
	 * @see Model4DataCtrack.DataCenter#getNetwork()
	 * @see #getDataCenter()
	 * @generated
	 */
	EReference getDataCenter_Network();

	/**
	 * Returns the meta object for the containment reference list '{@link Model4DataCtrack.DataCenter#getRack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rack</em>'.
	 * @see Model4DataCtrack.DataCenter#getRack()
	 * @see #getDataCenter()
	 * @generated
	 */
	EReference getDataCenter_Rack();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.RackElement <em>Rack Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rack Element</em>'.
	 * @see Model4DataCtrack.RackElement
	 * @generated
	 */
	EClass getRackElement();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.RackElement#getNumberOfRacks <em>Number Of Racks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Racks</em>'.
	 * @see Model4DataCtrack.RackElement#getNumberOfRacks()
	 * @see #getRackElement()
	 * @generated
	 */
	EAttribute getRackElement_NumberOfRacks();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.RackElement#getRackType <em>Rack Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rack Type</em>'.
	 * @see Model4DataCtrack.RackElement#getRackType()
	 * @see #getRackElement()
	 * @generated
	 */
	EReference getRackElement_RackType();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.RackElement#no_empty_datacenters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No empty datacenters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No empty datacenters</em>' operation.
	 * @see Model4DataCtrack.RackElement#no_empty_datacenters(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRackElement__No_empty_datacenters__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rack</em>'.
	 * @see Model4DataCtrack.Rack
	 * @generated
	 */
	EClass getRack();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.Rack#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see Model4DataCtrack.Rack#getBase_Component()
	 * @see #getRack()
	 * @generated
	 */
	EReference getRack_Base_Component();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.Rack#getMachinesPerBoard <em>Machines Per Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machines Per Board</em>'.
	 * @see Model4DataCtrack.Rack#getMachinesPerBoard()
	 * @see #getRack()
	 * @generated
	 */
	EAttribute getRack_MachinesPerBoard();

	/**
	 * Returns the meta object for the containment reference '{@link Model4DataCtrack.Rack#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network</em>'.
	 * @see Model4DataCtrack.Rack#getNetwork()
	 * @see #getRack()
	 * @generated
	 */
	EReference getRack_Network();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.Rack#getBoards <em>Boards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boards</em>'.
	 * @see Model4DataCtrack.Rack#getBoards()
	 * @see #getRack()
	 * @generated
	 */
	EAttribute getRack_Boards();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.Rack#no_empty_racks(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No empty racks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No empty racks</em>' operation.
	 * @see Model4DataCtrack.Rack#no_empty_racks(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRack__No_empty_racks__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.ComputingRack <em>Computing Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Rack</em>'.
	 * @see Model4DataCtrack.ComputingRack
	 * @generated
	 */
	EClass getComputingRack();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.ComputingRack#getMachineType <em>Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Machine Type</em>'.
	 * @see Model4DataCtrack.ComputingRack#getMachineType()
	 * @see #getComputingRack()
	 * @generated
	 */
	EReference getComputingRack_MachineType();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.StatelessComputationMachine <em>Stateless Computation Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stateless Computation Machine</em>'.
	 * @see Model4DataCtrack.StatelessComputationMachine
	 * @generated
	 */
	EClass getStatelessComputationMachine();

	/**
	 * Returns the meta object for the reference list '{@link Model4DataCtrack.StatelessComputationMachine#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applications</em>'.
	 * @see Model4DataCtrack.StatelessComputationMachine#getApplications()
	 * @see #getStatelessComputationMachine()
	 * @generated
	 */
	EReference getStatelessComputationMachine_Applications();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.StatelessComputationMachine#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see Model4DataCtrack.StatelessComputationMachine#getPurpose()
	 * @see #getStatelessComputationMachine()
	 * @generated
	 */
	EAttribute getStatelessComputationMachine_Purpose();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.StorageRack <em>Storage Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Rack</em>'.
	 * @see Model4DataCtrack.StorageRack
	 * @generated
	 */
	EClass getStorageRack();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.StorageRack#getMachineType <em>Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Machine Type</em>'.
	 * @see Model4DataCtrack.StorageRack#getMachineType()
	 * @see #getStorageRack()
	 * @generated
	 */
	EReference getStorageRack_MachineType();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.sendData <em>send Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>send Data</em>'.
	 * @see Model4DataCtrack.sendData
	 * @generated
	 */
	EClass getsendData();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.sendData#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.sendData#getBase_Message()
	 * @see #getsendData()
	 * @generated
	 */
	EReference getsendData_Base_Message();

	/**
	 * Returns the meta object for the containment reference '{@link Model4DataCtrack.sendData#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Time</em>'.
	 * @see Model4DataCtrack.sendData#getMaxTime()
	 * @see #getsendData()
	 * @generated
	 */
	EReference getsendData_MaxTime();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.sendData#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see Model4DataCtrack.sendData#getData()
	 * @see #getsendData()
	 * @generated
	 */
	EReference getsendData_Data();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.sendData#sendData_timeunit_not_days_or_hours_or_minutes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Send Data timeunit not days or hours or minutes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Data timeunit not days or hours or minutes</em>' operation.
	 * @see Model4DataCtrack.sendData#sendData_timeunit_not_days_or_hours_or_minutes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getsendData__SendData_timeunit_not_days_or_hours_or_minutes__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.sendData#sendData_maxTime_value_greater_than_0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Send Data max Time value greater than 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Data max Time value greater than 0</em>' operation.
	 * @see Model4DataCtrack.sendData#sendData_maxTime_value_greater_than_0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getsendData__SendData_maxTime_value_greater_than_0__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.newRestrictions <em>new Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>new Restrictions</em>'.
	 * @see Model4DataCtrack.newRestrictions
	 * @generated
	 */
	EClass getnewRestrictions();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.newRestrictions#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.newRestrictions#getBase_Message()
	 * @see #getnewRestrictions()
	 * @generated
	 */
	EReference getnewRestrictions_Base_Message();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.newRestrictions#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see Model4DataCtrack.newRestrictions#getData()
	 * @see #getnewRestrictions()
	 * @generated
	 */
	EReference getnewRestrictions_Data();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.newRestrictions#getNewSP <em>New SP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New SP</em>'.
	 * @see Model4DataCtrack.newRestrictions#getNewSP()
	 * @see #getnewRestrictions()
	 * @generated
	 */
	EReference getnewRestrictions_NewSP();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.rectifyData <em>rectify Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>rectify Data</em>'.
	 * @see Model4DataCtrack.rectifyData
	 * @generated
	 */
	EClass getrectifyData();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.rectifyData#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.rectifyData#getBase_Message()
	 * @see #getrectifyData()
	 * @generated
	 */
	EReference getrectifyData_Base_Message();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.rectifyData#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see Model4DataCtrack.rectifyData#getData()
	 * @see #getrectifyData()
	 * @generated
	 */
	EReference getrectifyData_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link Model4DataCtrack.rectifyData#getNewData <em>New Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Data</em>'.
	 * @see Model4DataCtrack.rectifyData#getNewData()
	 * @see #getrectifyData()
	 * @generated
	 */
	EReference getrectifyData_NewData();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.rectifyData#no_empty_rectify_fields(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No empty rectify fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No empty rectify fields</em>' operation.
	 * @see Model4DataCtrack.rectifyData#no_empty_rectify_fields(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getrectifyData__No_empty_rectify_fields__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.removeData <em>remove Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>remove Data</em>'.
	 * @see Model4DataCtrack.removeData
	 * @generated
	 */
	EClass getremoveData();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.removeData#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.removeData#getBase_Message()
	 * @see #getremoveData()
	 * @generated
	 */
	EReference getremoveData_Base_Message();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.removeData#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see Model4DataCtrack.removeData#getData()
	 * @see #getremoveData()
	 * @generated
	 */
	EReference getremoveData_Data();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.eraseData <em>erase Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>erase Data</em>'.
	 * @see Model4DataCtrack.eraseData
	 * @generated
	 */
	EClass geteraseData();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.eraseData#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.eraseData#getBase_Message()
	 * @see #geteraseData()
	 * @generated
	 */
	EReference geteraseData_Base_Message();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.eraseData#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see Model4DataCtrack.eraseData#getData()
	 * @see #geteraseData()
	 * @generated
	 */
	EReference geteraseData_Data();

	/**
	 * Returns the meta object for the reference list '{@link Model4DataCtrack.eraseData#getMachines <em>Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Machines</em>'.
	 * @see Model4DataCtrack.eraseData#getMachines()
	 * @see #geteraseData()
	 * @generated
	 */
	EReference geteraseData_Machines();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.eraseData#machine_contains_data_to_erase(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Machine contains data to erase</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Machine contains data to erase</em>' operation.
	 * @see Model4DataCtrack.eraseData#machine_contains_data_to_erase(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation geteraseData__Machine_contains_data_to_erase__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.eraseData#eraseData_destination_machines_comply_with_GDPR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Erase Data destination machines comply with GDPR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Erase Data destination machines comply with GDPR</em>' operation.
	 * @see Model4DataCtrack.eraseData#eraseData_destination_machines_comply_with_GDPR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation geteraseData__EraseData_destination_machines_comply_with_GDPR__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.consent <em>consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>consent</em>'.
	 * @see Model4DataCtrack.consent
	 * @generated
	 */
	EClass getconsent();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.consent#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.consent#getBase_Message()
	 * @see #getconsent()
	 * @generated
	 */
	EReference getconsent_Base_Message();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.consent#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see Model4DataCtrack.consent#getData()
	 * @see #getconsent()
	 * @generated
	 */
	EReference getconsent_Data();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.consent#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see Model4DataCtrack.consent#getAction()
	 * @see #getconsent()
	 * @generated
	 */
	EAttribute getconsent_Action();

	/**
	 * Returns the meta object for the attribute list '{@link Model4DataCtrack.consent#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Purpose</em>'.
	 * @see Model4DataCtrack.consent#getPurpose()
	 * @see #getconsent()
	 * @generated
	 */
	EAttribute getconsent_Purpose();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.consent#consent_machine_complies_with_GDPR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Consent machine complies with GDPR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Consent machine complies with GDPR</em>' operation.
	 * @see Model4DataCtrack.consent#consent_machine_complies_with_GDPR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getconsent__Consent_machine_complies_with_GDPR__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.askAuthentication <em>ask Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ask Authentication</em>'.
	 * @see Model4DataCtrack.askAuthentication
	 * @generated
	 */
	EClass getaskAuthentication();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.askAuthentication#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.askAuthentication#getBase_Message()
	 * @see #getaskAuthentication()
	 * @generated
	 */
	EReference getaskAuthentication_Base_Message();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.tp <em>tp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tp</em>'.
	 * @see Model4DataCtrack.tp
	 * @generated
	 */
	EClass gettp();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.tp#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.tp#getBase_Message()
	 * @see #gettp()
	 * @generated
	 */
	EReference gettp_Base_Message();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.tp#getTp <em>Tp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tp</em>'.
	 * @see Model4DataCtrack.tp#getTp()
	 * @see #gettp()
	 * @generated
	 */
	EReference gettp_Tp();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.readData <em>read Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>read Data</em>'.
	 * @see Model4DataCtrack.readData
	 * @generated
	 */
	EClass getreadData();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.readData#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.readData#getBase_Message()
	 * @see #getreadData()
	 * @generated
	 */
	EReference getreadData_Base_Message();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.permission <em>permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>permission</em>'.
	 * @see Model4DataCtrack.permission
	 * @generated
	 */
	EClass getpermission();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.permission#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.permission#getBase_Message()
	 * @see #getpermission()
	 * @generated
	 */
	EReference getpermission_Base_Message();

	/**
	 * Returns the meta object for the attribute list '{@link Model4DataCtrack.permission#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Purpose</em>'.
	 * @see Model4DataCtrack.permission#getPurpose()
	 * @see #getpermission()
	 * @generated
	 */
	EAttribute getpermission_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.permission#getPermissionType <em>Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission Type</em>'.
	 * @see Model4DataCtrack.permission#getPermissionType()
	 * @see #getpermission()
	 * @generated
	 */
	EAttribute getpermission_PermissionType();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.permission#no_access_permission_given_without_user_consent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No access permission given without user consent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No access permission given without user consent</em>' operation.
	 * @see Model4DataCtrack.permission#no_access_permission_given_without_user_consent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getpermission__No_access_permission_given_without_user_consent__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.notify <em>notify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>notify</em>'.
	 * @see Model4DataCtrack.notify
	 * @generated
	 */
	EClass getnotify();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.notify#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.notify#getBase_Message()
	 * @see #getnotify()
	 * @generated
	 */
	EReference getnotify_Base_Message();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.notify#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see Model4DataCtrack.notify#getData()
	 * @see #getnotify()
	 * @generated
	 */
	EReference getnotify_Data();

	/**
	 * Returns the meta object for the reference list '{@link Model4DataCtrack.notify#getMachines <em>Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Machines</em>'.
	 * @see Model4DataCtrack.notify#getMachines()
	 * @see #getnotify()
	 * @generated
	 */
	EReference getnotify_Machines();

	/**
	 * Returns the meta object for the attribute list '{@link Model4DataCtrack.notify#getBreaches <em>Breaches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Breaches</em>'.
	 * @see Model4DataCtrack.notify#getBreaches()
	 * @see #getnotify()
	 * @generated
	 */
	EAttribute getnotify_Breaches();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.notify#notify_destination_machines_comply_with_GDPR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Notify destination machines comply with GDPR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Notify destination machines comply with GDPR</em>' operation.
	 * @see Model4DataCtrack.notify#notify_destination_machines_comply_with_GDPR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getnotify__Notify_destination_machines_comply_with_GDPR__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.upDate <em>up Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>up Date</em>'.
	 * @see Model4DataCtrack.upDate
	 * @generated
	 */
	EClass getupDate();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.upDate#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.upDate#getBase_Message()
	 * @see #getupDate()
	 * @generated
	 */
	EReference getupDate_Base_Message();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.upDate#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see Model4DataCtrack.upDate#getData()
	 * @see #getupDate()
	 * @generated
	 */
	EReference getupDate_Data();

	/**
	 * Returns the meta object for the reference list '{@link Model4DataCtrack.upDate#getMachines <em>Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Machines</em>'.
	 * @see Model4DataCtrack.upDate#getMachines()
	 * @see #getupDate()
	 * @generated
	 */
	EReference getupDate_Machines();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.upDate#getNewSP <em>New SP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New SP</em>'.
	 * @see Model4DataCtrack.upDate#getNewSP()
	 * @see #getupDate()
	 * @generated
	 */
	EReference getupDate_NewSP();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.upDate#machine_contains_data_to_update(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Machine contains data to update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Machine contains data to update</em>' operation.
	 * @see Model4DataCtrack.upDate#machine_contains_data_to_update(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getupDate__Machine_contains_data_to_update__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.upDate#upDate_destination_machines_comply_with_GDPR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Up Date destination machines comply with GDPR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Up Date destination machines comply with GDPR</em>' operation.
	 * @see Model4DataCtrack.upDate#upDate_destination_machines_comply_with_GDPR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getupDate__UpDate_destination_machines_comply_with_GDPR__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.newData <em>new Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>new Data</em>'.
	 * @see Model4DataCtrack.newData
	 * @generated
	 */
	EClass getnewData();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.newData#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.newData#getBase_Message()
	 * @see #getnewData()
	 * @generated
	 */
	EReference getnewData_Base_Message();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.newData#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see Model4DataCtrack.newData#getData()
	 * @see #getnewData()
	 * @generated
	 */
	EReference getnewData_Data();

	/**
	 * Returns the meta object for the reference list '{@link Model4DataCtrack.newData#getMachines <em>Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Machines</em>'.
	 * @see Model4DataCtrack.newData#getMachines()
	 * @see #getnewData()
	 * @generated
	 */
	EReference getnewData_Machines();

	/**
	 * Returns the meta object for the containment reference list '{@link Model4DataCtrack.newData#getNewData <em>New Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Data</em>'.
	 * @see Model4DataCtrack.newData#getNewData()
	 * @see #getnewData()
	 * @generated
	 */
	EReference getnewData_NewData();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.newData#no_empty_newData_fields(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No empty new Data fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No empty new Data fields</em>' operation.
	 * @see Model4DataCtrack.newData#no_empty_newData_fields(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getnewData__No_empty_newData_fields__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.newData#machine_contains_data_to_rectify(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Machine contains data to rectify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Machine contains data to rectify</em>' operation.
	 * @see Model4DataCtrack.newData#machine_contains_data_to_rectify(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getnewData__Machine_contains_data_to_rectify__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.newData#newData_destination_machines_comply_with_GDPR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>New Data destination machines comply with GDPR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Data destination machines comply with GDPR</em>' operation.
	 * @see Model4DataCtrack.newData#newData_destination_machines_comply_with_GDPR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getnewData__NewData_destination_machines_comply_with_GDPR__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.askDataInformation <em>ask Data Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ask Data Information</em>'.
	 * @see Model4DataCtrack.askDataInformation
	 * @generated
	 */
	EClass getaskDataInformation();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.askDataInformation#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.askDataInformation#getBase_Message()
	 * @see #getaskDataInformation()
	 * @generated
	 */
	EReference getaskDataInformation_Base_Message();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.askDataInformation#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see Model4DataCtrack.askDataInformation#getUser()
	 * @see #getaskDataInformation()
	 * @generated
	 */
	EReference getaskDataInformation_User();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.reportDataManagement <em>report Data Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>report Data Management</em>'.
	 * @see Model4DataCtrack.reportDataManagement
	 * @generated
	 */
	EClass getreportDataManagement();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.reportDataManagement#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.reportDataManagement#getBase_Message()
	 * @see #getreportDataManagement()
	 * @generated
	 */
	EReference getreportDataManagement_Base_Message();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.subscribe <em>subscribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>subscribe</em>'.
	 * @see Model4DataCtrack.subscribe
	 * @generated
	 */
	EClass getsubscribe();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.subscribe#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.subscribe#getBase_Message()
	 * @see #getsubscribe()
	 * @generated
	 */
	EReference getsubscribe_Base_Message();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.subscribe#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see Model4DataCtrack.subscribe#getData()
	 * @see #getsubscribe()
	 * @generated
	 */
	EReference getsubscribe_Data();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.subscribe#getMachines <em>Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Machines</em>'.
	 * @see Model4DataCtrack.subscribe#getMachines()
	 * @see #getsubscribe()
	 * @generated
	 */
	EReference getsubscribe_Machines();

	/**
	 * Returns the meta object for the attribute list '{@link Model4DataCtrack.subscribe#getBreaches <em>Breaches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Breaches</em>'.
	 * @see Model4DataCtrack.subscribe#getBreaches()
	 * @see #getsubscribe()
	 * @generated
	 */
	EAttribute getsubscribe_Breaches();

	/**
	 * Returns the meta object for the containment reference '{@link Model4DataCtrack.subscribe#getMaxSubscriptionTime <em>Max Subscription Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Subscription Time</em>'.
	 * @see Model4DataCtrack.subscribe#getMaxSubscriptionTime()
	 * @see #getsubscribe()
	 * @generated
	 */
	EReference getsubscribe_MaxSubscriptionTime();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.subscribe#maxSubTime_greater_than_0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Max Sub Time greater than 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Max Sub Time greater than 0</em>' operation.
	 * @see Model4DataCtrack.subscribe#maxSubTime_greater_than_0(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getsubscribe__MaxSubTime_greater_than_0__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.subscribe#machine_contains_data_to_subscribe_to(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Machine contains data to subscribe to</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Machine contains data to subscribe to</em>' operation.
	 * @see Model4DataCtrack.subscribe#machine_contains_data_to_subscribe_to(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getsubscribe__Machine_contains_data_to_subscribe_to__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.subscribe#subscribe_destination_machines_comply_with_GDPR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subscribe destination machines comply with GDPR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subscribe destination machines comply with GDPR</em>' operation.
	 * @see Model4DataCtrack.subscribe#subscribe_destination_machines_comply_with_GDPR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getsubscribe__Subscribe_destination_machines_comply_with_GDPR__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.informBreaches <em>inform Breaches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>inform Breaches</em>'.
	 * @see Model4DataCtrack.informBreaches
	 * @generated
	 */
	EClass getinformBreaches();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.informBreaches#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.informBreaches#getBase_Message()
	 * @see #getinformBreaches()
	 * @generated
	 */
	EReference getinformBreaches_Base_Message();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.timeoutSubscription <em>timeout Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>timeout Subscription</em>'.
	 * @see Model4DataCtrack.timeoutSubscription
	 * @generated
	 */
	EClass gettimeoutSubscription();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.timeoutSubscription#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.timeoutSubscription#getBase_Message()
	 * @see #gettimeoutSubscription()
	 * @generated
	 */
	EReference gettimeoutSubscription_Base_Message();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.writeData <em>write Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>write Data</em>'.
	 * @see Model4DataCtrack.writeData
	 * @generated
	 */
	EClass getwriteData();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.writeData#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.writeData#getBase_Message()
	 * @see #getwriteData()
	 * @generated
	 */
	EReference getwriteData_Base_Message();

	/**
	 * Returns the meta object for the containment reference list '{@link Model4DataCtrack.writeData#getNewData <em>New Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Data</em>'.
	 * @see Model4DataCtrack.writeData#getNewData()
	 * @see #getwriteData()
	 * @generated
	 */
	EReference getwriteData_NewData();

	/**
	 * Returns the meta object for the containment reference '{@link Model4DataCtrack.writeData#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Time</em>'.
	 * @see Model4DataCtrack.writeData#getMaxTime()
	 * @see #getwriteData()
	 * @generated
	 */
	EReference getwriteData_MaxTime();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.writeData#no_empty_write_fields(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No empty write fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No empty write fields</em>' operation.
	 * @see Model4DataCtrack.writeData#no_empty_write_fields(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getwriteData__No_empty_write_fields__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link Model4DataCtrack.writeData#writeData_timeunit_not_days_or_hours_or_minutes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Write Data timeunit not days or hours or minutes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write Data timeunit not days or hours or minutes</em>' operation.
	 * @see Model4DataCtrack.writeData#writeData_timeunit_not_days_or_hours_or_minutes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getwriteData__WriteData_timeunit_not_days_or_hours_or_minutes__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.accessInformation <em>access Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>access Information</em>'.
	 * @see Model4DataCtrack.accessInformation
	 * @generated
	 */
	EClass getaccessInformation();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.accessInformation#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.accessInformation#getBase_Message()
	 * @see #getaccessInformation()
	 * @generated
	 */
	EReference getaccessInformation_Base_Message();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.removeSPInLog <em>remove SP In Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>remove SP In Log</em>'.
	 * @see Model4DataCtrack.removeSPInLog
	 * @generated
	 */
	EClass getremoveSPInLog();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.removeSPInLog#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.removeSPInLog#getBase_Message()
	 * @see #getremoveSPInLog()
	 * @generated
	 */
	EReference getremoveSPInLog_Base_Message();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.Info <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info</em>'.
	 * @see Model4DataCtrack.Info
	 * @generated
	 */
	EClass getInfo();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.Info#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.Info#getBase_Message()
	 * @see #getInfo()
	 * @generated
	 */
	EReference getInfo_Base_Message();

	/**
	 * Returns the meta object for the containment reference '{@link Model4DataCtrack.Info#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Time</em>'.
	 * @see Model4DataCtrack.Info#getMaxTime()
	 * @see #getInfo()
	 * @generated
	 */
	EReference getInfo_MaxTime();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.Info#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see Model4DataCtrack.Info#getProvider()
	 * @see #getInfo()
	 * @generated
	 */
	EReference getInfo_Provider();

	/**
	 * Returns the meta object for the reference list '{@link Model4DataCtrack.Info#getRecipients <em>Recipients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recipients</em>'.
	 * @see Model4DataCtrack.Info#getRecipients()
	 * @see #getInfo()
	 * @generated
	 */
	EReference getInfo_Recipients();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.TrustedSCM <em>Trusted SCM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trusted SCM</em>'.
	 * @see Model4DataCtrack.TrustedSCM
	 * @generated
	 */
	EClass getTrustedSCM();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.UntrustedSCM <em>Untrusted SCM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Untrusted SCM</em>'.
	 * @see Model4DataCtrack.UntrustedSCM
	 * @generated
	 */
	EClass getUntrustedSCM();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.consentInfo <em>consent Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>consent Info</em>'.
	 * @see Model4DataCtrack.consentInfo
	 * @generated
	 */
	EClass getconsentInfo();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.consentInfo#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.consentInfo#getBase_Message()
	 * @see #getconsentInfo()
	 * @generated
	 */
	EReference getconsentInfo_Base_Message();

	/**
	 * Returns the meta object for the attribute list '{@link Model4DataCtrack.consentInfo#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Purpose</em>'.
	 * @see Model4DataCtrack.consentInfo#getPurpose()
	 * @see #getconsentInfo()
	 * @generated
	 */
	EAttribute getconsentInfo_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.consentInfo#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see Model4DataCtrack.consentInfo#getAction()
	 * @see #getconsentInfo()
	 * @generated
	 */
	EAttribute getconsentInfo_Action();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.consentInfo#getTp <em>Tp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tp</em>'.
	 * @see Model4DataCtrack.consentInfo#getTp()
	 * @see #getconsentInfo()
	 * @generated
	 */
	EReference getconsentInfo_Tp();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.ok <em>ok</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ok</em>'.
	 * @see Model4DataCtrack.ok
	 * @generated
	 */
	EClass getok();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.ok#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.ok#getBase_Message()
	 * @see #getok()
	 * @generated
	 */
	EReference getok_Base_Message();

	/**
	 * Returns the meta object for the attribute list '{@link Model4DataCtrack.ok#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Purpose</em>'.
	 * @see Model4DataCtrack.ok#getPurpose()
	 * @see #getok()
	 * @generated
	 */
	EAttribute getok_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.ok#getPermissionType <em>Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission Type</em>'.
	 * @see Model4DataCtrack.ok#getPermissionType()
	 * @see #getok()
	 * @generated
	 */
	EAttribute getok_PermissionType();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.informationNotForFree <em>information Not For Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>information Not For Free</em>'.
	 * @see Model4DataCtrack.informationNotForFree
	 * @generated
	 */
	EClass getinformationNotForFree();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.informationNotForFree#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.informationNotForFree#getBase_Message()
	 * @see #getinformationNotForFree()
	 * @generated
	 */
	EReference getinformationNotForFree_Base_Message();

	/**
	 * Returns the meta object for the attribute '{@link Model4DataCtrack.informationNotForFree#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Model4DataCtrack.informationNotForFree#getPrice()
	 * @see #getinformationNotForFree()
	 * @generated
	 */
	EAttribute getinformationNotForFree_Price();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.wantToAccess <em>want To Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>want To Access</em>'.
	 * @see Model4DataCtrack.wantToAccess
	 * @generated
	 */
	EClass getwantToAccess();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.wantToAccess#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.wantToAccess#getBase_Message()
	 * @see #getwantToAccess()
	 * @generated
	 */
	EReference getwantToAccess_Base_Message();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.reportDataDManagementForFree <em>report Data DManagement For Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>report Data DManagement For Free</em>'.
	 * @see Model4DataCtrack.reportDataDManagementForFree
	 * @generated
	 */
	EClass getreportDataDManagementForFree();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.reportDataDManagementForFree#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.reportDataDManagementForFree#getBase_Message()
	 * @see #getreportDataDManagementForFree()
	 * @generated
	 */
	EReference getreportDataDManagementForFree_Base_Message();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.checkChanges <em>check Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>check Changes</em>'.
	 * @see Model4DataCtrack.checkChanges
	 * @generated
	 */
	EClass getcheckChanges();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.checkChanges#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.checkChanges#getBase_Message()
	 * @see #getcheckChanges()
	 * @generated
	 */
	EReference getcheckChanges_Base_Message();

	/**
	 * Returns the meta object for class '{@link Model4DataCtrack.SP <em>SP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SP</em>'.
	 * @see Model4DataCtrack.SP
	 * @generated
	 */
	EClass getSP();

	/**
	 * Returns the meta object for the reference '{@link Model4DataCtrack.SP#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see Model4DataCtrack.SP#getBase_Message()
	 * @see #getSP()
	 * @generated
	 */
	EReference getSP_Base_Message();

	/**
	 * Returns the meta object for enum '{@link Model4DataCtrack.BandwidthUnit <em>Bandwidth Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bandwidth Unit</em>'.
	 * @see Model4DataCtrack.BandwidthUnit
	 * @generated
	 */
	EEnum getBandwidthUnit();

	/**
	 * Returns the meta object for enum '{@link Model4DataCtrack.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see Model4DataCtrack.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the meta object for enum '{@link Model4DataCtrack.SizeUnit <em>Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size Unit</em>'.
	 * @see Model4DataCtrack.SizeUnit
	 * @generated
	 */
	EEnum getSizeUnit();

	/**
	 * Returns the meta object for enum '{@link Model4DataCtrack.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see Model4DataCtrack.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Model4DataCtrackFactory getModel4DataCtrackFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.InfrastructureImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getInfrastructure()
		 * @generated
		 */
		EClass INFRASTRUCTURE = eINSTANCE.getInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE__BASE_COMPONENT = eINSTANCE.getInfrastructure_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE__NETWORK = eINSTANCE.getInfrastructure_Network();

		/**
		 * The meta object literal for the '<em><b>Cloud Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE__CLOUD_PROVIDER = eINSTANCE.getInfrastructure_CloudProvider();

		/**
		 * The meta object literal for the '<em><b>Datacenterelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE__DATACENTERELEMENTS = eINSTANCE.getInfrastructure_Datacenterelements();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.BandwidthImpl <em>Bandwidth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.BandwidthImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getBandwidth()
		 * @generated
		 */
		EClass BANDWIDTH = eINSTANCE.getBandwidth();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANDWIDTH__VALUE = eINSTANCE.getBandwidth_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANDWIDTH__UNIT = eINSTANCE.getBandwidth_Unit();

		/**
		 * The meta object literal for the '<em><b>Bandwidth value greater than 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BANDWIDTH___BANDWIDTH_VALUE_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBandwidth__Bandwidth_value_greater_than_0__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.ControllerCPImpl <em>Controller CP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.ControllerCPImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getControllerCP()
		 * @generated
		 */
		EClass CONTROLLER_CP = eINSTANCE.getControllerCP();

		/**
		 * The meta object literal for the '<em><b>Base Lifeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_CP__BASE_LIFELINE = eINSTANCE.getControllerCP_Base_Lifeline();

		/**
		 * The meta object literal for the '<em><b>Resource Allocation Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CP__RESOURCE_ALLOCATION_POLICY = eINSTANCE.getControllerCP_ResourceAllocationPolicy();

		/**
		 * The meta object literal for the '<em><b>Id Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CP__ID_PROVIDER = eINSTANCE.getControllerCP_IdProvider();

		/**
		 * The meta object literal for the '<em><b>Sla</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_CP__SLA = eINSTANCE.getControllerCP_Sla();

		/**
		 * The meta object literal for the '<em><b>Accesslog</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_CP__ACCESSLOG = eINSTANCE.getControllerCP_Accesslog();

		/**
		 * The meta object literal for the '<em><b>New Location machine not under sla with controller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER_CP___NEW_LOCATION_MACHINE_NOT_UNDER_SLA_WITH_CONTROLLER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getControllerCP__NewLocation_machine_not_under_sla_with_controller__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Location1 machine not under sla with controller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER_CP___LOCATION1_MACHINE_NOT_UNDER_SLA_WITH_CONTROLLER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getControllerCP__Location1_machine_not_under_sla_with_controller__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Source Machine not under sla with controller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER_CP___SOURCE_MACHINE_NOT_UNDER_SLA_WITH_CONTROLLER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getControllerCP__SourceMachine_not_under_sla_with_controller__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.SLAImpl <em>SLA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.SLAImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getSLA()
		 * @generated
		 */
		EClass SLA = eINSTANCE.getSLA();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__BASE_CLASS = eINSTANCE.getSLA_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Subject Matter</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLA__SUBJECT_MATTER = eINSTANCE.getSLA_SubjectMatter();

		/**
		 * The meta object literal for the '<em><b>Processing Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__PROCESSING_DURATION = eINSTANCE.getSLA_ProcessingDuration();

		/**
		 * The meta object literal for the '<em><b>Processing Nature</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLA__PROCESSING_NATURE = eINSTANCE.getSLA_ProcessingNature();

		/**
		 * The meta object literal for the '<em><b>Processing Purpose</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLA__PROCESSING_PURPOSE = eINSTANCE.getSLA_ProcessingPurpose();

		/**
		 * The meta object literal for the '<em><b>Processing Instructions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLA__PROCESSING_INSTRUCTIONS = eINSTANCE.getSLA_ProcessingInstructions();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__BASE_COMPONENT = eINSTANCE.getSLA_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Recipients</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLA__RECIPIENTS = eINSTANCE.getSLA_Recipients();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.TimeImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__VALUE = eINSTANCE.getTime_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__UNIT = eINSTANCE.getTime_Unit();

		/**
		 * The meta object literal for the '<em><b>Time value greater than 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME___TIME_VALUE_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTime__Time_value_greater_than_0__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.AccessLogImpl <em>Access Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.AccessLogImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getAccessLog()
		 * @generated
		 */
		EClass ACCESS_LOG = eINSTANCE.getAccessLog();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_LOG__BASE_CLASS = eINSTANCE.getAccessLog_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_LOG__ACTION = eINSTANCE.getAccessLog_Action();

		/**
		 * The meta object literal for the '<em><b>Nl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_LOG__NL = eINSTANCE.getAccessLog_Nl();

		/**
		 * The meta object literal for the '<em><b>Nsp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_LOG__NSP = eINSTANCE.getAccessLog_Nsp();

		/**
		 * The meta object literal for the '<em><b>Tp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_LOG__TP = eINSTANCE.getAccessLog_Tp();

		/**
		 * The meta object literal for the '<em><b>L1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_LOG__L1 = eINSTANCE.getAccessLog_L1();

		/**
		 * The meta object literal for the '<em><b>Sp1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_LOG__SP1 = eINSTANCE.getAccessLog_Sp1();

		/**
		 * The meta object literal for the '<em><b>O</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_LOG__O = eINSTANCE.getAccessLog_O();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_LOG__BASE_COMPONENT = eINSTANCE.getAccessLog_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Log access match sp access</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCESS_LOG___LOG_ACCESS_MATCH_SP_ACCESS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAccessLog__Log_access_match_sp_access__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.SSMProcessorImpl <em>SSM Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.SSMProcessorImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getSSMProcessor()
		 * @generated
		 */
		EClass SSM_PROCESSOR = eINSTANCE.getSSMProcessor();

		/**
		 * The meta object literal for the '<em><b>Base Lifeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSM_PROCESSOR__BASE_LIFELINE = eINSTANCE.getSSMProcessor_Base_Lifeline();

		/**
		 * The meta object literal for the '<em><b>Sla</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSM_PROCESSOR__SLA = eINSTANCE.getSSMProcessor_Sla();

		/**
		 * The meta object literal for the '<em><b>GDPR Compliance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSM_PROCESSOR__GDPR_COMPLIANCE = eINSTANCE.getSSMProcessor_GDPRCompliance();

		/**
		 * The meta object literal for the '<em><b>SSM Proccessor complies GDPR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SSM_PROCESSOR___SSM_PROCCESSOR_COMPLIES_GDPR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSSMProcessor__SSMProccessor_complies_GDPR__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.MachineImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__BASE_COMPONENT = eINSTANCE.getMachine_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Cpu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__CPU = eINSTANCE.getMachine_Cpu();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__MEMORY = eINSTANCE.getMachine_Memory();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__STORAGE = eINSTANCE.getMachine_Storage();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.CPUImpl <em>CPU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.CPUImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getCPU()
		 * @generated
		 */
		EClass CPU = eINSTANCE.getCPU();

		/**
		 * The meta object literal for the '<em><b>Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU__CORES = eINSTANCE.getCPU_Cores();

		/**
		 * The meta object literal for the '<em><b>FLO Ps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU__FLO_PS = eINSTANCE.getCPU_FLOPs();

		/**
		 * The meta object literal for the '<em><b>Cpu cores and flops greater than 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPU___CPU_CORES_AND_FLOPS_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCPU__Cpu_cores_and_flops_greater_than_0__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.HardwareImpl <em>Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.HardwareImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getHardware()
		 * @generated
		 */
		EClass HARDWARE = eINSTANCE.getHardware();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE__BASE_COMPONENT = eINSTANCE.getHardware_Base_Component();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.MemoryImpl <em>Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.MemoryImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getMemory()
		 * @generated
		 */
		EClass MEMORY = eINSTANCE.getMemory();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__CAPACITY = eINSTANCE.getMemory_Capacity();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__LATENCY = eINSTANCE.getMemory_Latency();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.SizeImpl <em>Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.SizeImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getSize()
		 * @generated
		 */
		EClass SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__VALUE = eINSTANCE.getSize_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE__UNIT = eINSTANCE.getSize_Unit();

		/**
		 * The meta object literal for the '<em><b>Size value greater than 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIZE___SIZE_VALUE_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSize__Size_value_greater_than_0__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.LatencyImpl <em>Latency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.LatencyImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getLatency()
		 * @generated
		 */
		EClass LATENCY = eINSTANCE.getLatency();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATENCY__NAME = eINSTANCE.getLatency_Name();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LATENCY__TIME = eINSTANCE.getLatency_Time();

		/**
		 * The meta object literal for the '<em><b>Latency not in us or ns</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LATENCY___LATENCY_NOT_IN_US_OR_NS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLatency__Latency_not_in_us_or_ns__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Latency name not empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LATENCY___LATENCY_NAME_NOT_EMPTY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLatency__Latency_name_not_empty__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.StorageImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '<em><b>Number Of Drivers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__NUMBER_OF_DRIVERS = eINSTANCE.getStorage_NumberOfDrivers();

		/**
		 * The meta object literal for the '<em><b>Dirve Capacity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__DIRVE_CAPACITY = eINSTANCE.getStorage_DirveCapacity();

		/**
		 * The meta object literal for the '<em><b>Read Bandwidth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__READ_BANDWIDTH = eINSTANCE.getStorage_ReadBandwidth();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__DATA = eINSTANCE.getStorage_Data();

		/**
		 * The meta object literal for the '<em><b>Number Of Drivers greater than 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORAGE___NUMBER_OF_DRIVERS_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStorage__NumberOfDrivers_greater_than_0__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.DataImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__BASE_CLASS = eINSTANCE.getData_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Archive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__ARCHIVE = eINSTANCE.getData_Archive();

		/**
		 * The meta object literal for the '<em><b>Applied Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__APPLIED_POLICY = eINSTANCE.getData_AppliedPolicy();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__BASE_COMPONENT = eINSTANCE.getData_Base_Component();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.DataArchiveImpl <em>Data Archive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.DataArchiveImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getDataArchive()
		 * @generated
		 */
		EClass DATA_ARCHIVE = eINSTANCE.getDataArchive();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ARCHIVE__CONTENTS = eINSTANCE.getDataArchive_Contents();

		/**
		 * The meta object literal for the '<em><b>Id Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ARCHIVE__ID_DATA = eINSTANCE.getDataArchive_IdData();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.DataFieldImpl <em>Data Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.DataFieldImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getDataField()
		 * @generated
		 */
		EClass DATA_FIELD = eINSTANCE.getDataField();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FIELD__VALUE = eINSTANCE.getDataField_Value();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.StickyPolicyImpl <em>Sticky Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.StickyPolicyImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getStickyPolicy()
		 * @generated
		 */
		EClass STICKY_POLICY = eINSTANCE.getStickyPolicy();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STICKY_POLICY__BASE_CLASS = eINSTANCE.getStickyPolicy_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STICKY_POLICY__PERMISSION = eINSTANCE.getStickyPolicy_Permission();

		/**
		 * The meta object literal for the '<em><b>Access History</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STICKY_POLICY__ACCESS_HISTORY = eINSTANCE.getStickyPolicy_AccessHistory();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STICKY_POLICY__CONTROLLER = eINSTANCE.getStickyPolicy_Controller();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STICKY_POLICY__BASE_COMPONENT = eINSTANCE.getStickyPolicy_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STICKY_POLICY__OWNER = eINSTANCE.getStickyPolicy_Owner();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STICKY_POLICY__PURPOSE = eINSTANCE.getStickyPolicy_Purpose();

		/**
		 * The meta object literal for the '<em><b>Allowed access purpose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STICKY_POLICY___ALLOWED_ACCESS_PURPOSE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStickyPolicy__Allowed_access_purpose__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>All tps in history given permissions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STICKY_POLICY___ALL_TPS_IN_HISTORY_GIVEN_PERMISSIONS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStickyPolicy__All_tps_in_history_given_permissions__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.PermissionPerTPImpl <em>Permission Per TP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.PermissionPerTPImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getPermissionPerTP()
		 * @generated
		 */
		EClass PERMISSION_PER_TP = eINSTANCE.getPermissionPerTP();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION_PER_TP__S = eINSTANCE.getPermissionPerTP_S();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION_PER_TP__I = eINSTANCE.getPermissionPerTP_I();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.PListImpl <em>PList</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.PListImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getPList()
		 * @generated
		 */
		EClass PLIST = eINSTANCE.getPList();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLIST__LIST = eINSTANCE.getPList_List();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.PrincipalImpl <em>Principal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.PrincipalImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getPrincipal()
		 * @generated
		 */
		EClass PRINCIPAL = eINSTANCE.getPrincipal();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINCIPAL__BASE_COMPONENT = eINSTANCE.getPrincipal_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Base Lifeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINCIPAL__BASE_LIFELINE = eINSTANCE.getPrincipal_Base_Lifeline();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.StatelessAppCTPImpl <em>Stateless App CTP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.StatelessAppCTPImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getStatelessAppCTP()
		 * @generated
		 */
		EClass STATELESS_APP_CTP = eINSTANCE.getStatelessAppCTP();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.UserImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__INSTANCES = eINSTANCE.getUser_Instances();

		/**
		 * The meta object literal for the '<em><b>Id User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID_USER = eINSTANCE.getUser_IdUser();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.AccesPerTPImpl <em>Acces Per TP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.AccesPerTPImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getAccesPerTP()
		 * @generated
		 */
		EClass ACCES_PER_TP = eINSTANCE.getAccesPerTP();

		/**
		 * The meta object literal for the '<em><b>Tp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCES_PER_TP__TP = eINSTANCE.getAccesPerTP_Tp();

		/**
		 * The meta object literal for the '<em><b>Action Performed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCES_PER_TP__ACTION_PERFORMED = eINSTANCE.getAccesPerTP_ActionPerformed();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCES_PER_TP__PURPOSE = eINSTANCE.getAccesPerTP_Purpose();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.DataCenterElementImpl <em>Data Center Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.DataCenterElementImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getDataCenterElement()
		 * @generated
		 */
		EClass DATA_CENTER_ELEMENT = eINSTANCE.getDataCenterElement();

		/**
		 * The meta object literal for the '<em><b>Number Of Data Centers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CENTER_ELEMENT__NUMBER_OF_DATA_CENTERS = eINSTANCE.getDataCenterElement_NumberOfDataCenters();

		/**
		 * The meta object literal for the '<em><b>Data Center Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CENTER_ELEMENT__DATA_CENTER_TYPE = eINSTANCE.getDataCenterElement_DataCenterType();

		/**
		 * The meta object literal for the '<em><b>No empty infra</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_CENTER_ELEMENT___NO_EMPTY_INFRA__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDataCenterElement__No_empty_infra__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.DataCenterImpl <em>Data Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.DataCenterImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getDataCenter()
		 * @generated
		 */
		EClass DATA_CENTER = eINSTANCE.getDataCenter();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CENTER__BASE_COMPONENT = eINSTANCE.getDataCenter_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CENTER__NETWORK = eINSTANCE.getDataCenter_Network();

		/**
		 * The meta object literal for the '<em><b>Rack</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CENTER__RACK = eINSTANCE.getDataCenter_Rack();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.RackElementImpl <em>Rack Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.RackElementImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getRackElement()
		 * @generated
		 */
		EClass RACK_ELEMENT = eINSTANCE.getRackElement();

		/**
		 * The meta object literal for the '<em><b>Number Of Racks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RACK_ELEMENT__NUMBER_OF_RACKS = eINSTANCE.getRackElement_NumberOfRacks();

		/**
		 * The meta object literal for the '<em><b>Rack Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK_ELEMENT__RACK_TYPE = eINSTANCE.getRackElement_RackType();

		/**
		 * The meta object literal for the '<em><b>No empty datacenters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RACK_ELEMENT___NO_EMPTY_DATACENTERS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRackElement__No_empty_datacenters__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.RackImpl <em>Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.RackImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getRack()
		 * @generated
		 */
		EClass RACK = eINSTANCE.getRack();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK__BASE_COMPONENT = eINSTANCE.getRack_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Machines Per Board</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RACK__MACHINES_PER_BOARD = eINSTANCE.getRack_MachinesPerBoard();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK__NETWORK = eINSTANCE.getRack_Network();

		/**
		 * The meta object literal for the '<em><b>Boards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RACK__BOARDS = eINSTANCE.getRack_Boards();

		/**
		 * The meta object literal for the '<em><b>No empty racks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RACK___NO_EMPTY_RACKS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRack__No_empty_racks__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.ComputingRackImpl <em>Computing Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.ComputingRackImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getComputingRack()
		 * @generated
		 */
		EClass COMPUTING_RACK = eINSTANCE.getComputingRack();

		/**
		 * The meta object literal for the '<em><b>Machine Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_RACK__MACHINE_TYPE = eINSTANCE.getComputingRack_MachineType();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.StatelessComputationMachineImpl <em>Stateless Computation Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.StatelessComputationMachineImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getStatelessComputationMachine()
		 * @generated
		 */
		EClass STATELESS_COMPUTATION_MACHINE = eINSTANCE.getStatelessComputationMachine();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATELESS_COMPUTATION_MACHINE__APPLICATIONS = eINSTANCE.getStatelessComputationMachine_Applications();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATELESS_COMPUTATION_MACHINE__PURPOSE = eINSTANCE.getStatelessComputationMachine_Purpose();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.StorageRackImpl <em>Storage Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.StorageRackImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getStorageRack()
		 * @generated
		 */
		EClass STORAGE_RACK = eINSTANCE.getStorageRack();

		/**
		 * The meta object literal for the '<em><b>Machine Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_RACK__MACHINE_TYPE = eINSTANCE.getStorageRack_MachineType();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.sendDataImpl <em>send Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.sendDataImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getsendData()
		 * @generated
		 */
		EClass SEND_DATA = eINSTANCE.getsendData();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_DATA__BASE_MESSAGE = eINSTANCE.getsendData_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_DATA__MAX_TIME = eINSTANCE.getsendData_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_DATA__DATA = eINSTANCE.getsendData_Data();

		/**
		 * The meta object literal for the '<em><b>Send Data timeunit not days or hours or minutes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEND_DATA___SEND_DATA_TIMEUNIT_NOT_DAYS_OR_HOURS_OR_MINUTES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getsendData__SendData_timeunit_not_days_or_hours_or_minutes__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Send Data max Time value greater than 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEND_DATA___SEND_DATA_MAX_TIME_VALUE_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP = eINSTANCE.getsendData__SendData_maxTime_value_greater_than_0__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.newRestrictionsImpl <em>new Restrictions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.newRestrictionsImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getnewRestrictions()
		 * @generated
		 */
		EClass NEW_RESTRICTIONS = eINSTANCE.getnewRestrictions();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_RESTRICTIONS__BASE_MESSAGE = eINSTANCE.getnewRestrictions_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_RESTRICTIONS__DATA = eINSTANCE.getnewRestrictions_Data();

		/**
		 * The meta object literal for the '<em><b>New SP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_RESTRICTIONS__NEW_SP = eINSTANCE.getnewRestrictions_NewSP();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.rectifyDataImpl <em>rectify Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.rectifyDataImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getrectifyData()
		 * @generated
		 */
		EClass RECTIFY_DATA = eINSTANCE.getrectifyData();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTIFY_DATA__BASE_MESSAGE = eINSTANCE.getrectifyData_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTIFY_DATA__DATA = eINSTANCE.getrectifyData_Data();

		/**
		 * The meta object literal for the '<em><b>New Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTIFY_DATA__NEW_DATA = eINSTANCE.getrectifyData_NewData();

		/**
		 * The meta object literal for the '<em><b>No empty rectify fields</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECTIFY_DATA___NO_EMPTY_RECTIFY_FIELDS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getrectifyData__No_empty_rectify_fields__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.removeDataImpl <em>remove Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.removeDataImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getremoveData()
		 * @generated
		 */
		EClass REMOVE_DATA = eINSTANCE.getremoveData();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_DATA__BASE_MESSAGE = eINSTANCE.getremoveData_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_DATA__DATA = eINSTANCE.getremoveData_Data();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.eraseDataImpl <em>erase Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.eraseDataImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#geteraseData()
		 * @generated
		 */
		EClass ERASE_DATA = eINSTANCE.geteraseData();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERASE_DATA__BASE_MESSAGE = eINSTANCE.geteraseData_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERASE_DATA__DATA = eINSTANCE.geteraseData_Data();

		/**
		 * The meta object literal for the '<em><b>Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERASE_DATA__MACHINES = eINSTANCE.geteraseData_Machines();

		/**
		 * The meta object literal for the '<em><b>Machine contains data to erase</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ERASE_DATA___MACHINE_CONTAINS_DATA_TO_ERASE__DIAGNOSTICCHAIN_MAP = eINSTANCE.geteraseData__Machine_contains_data_to_erase__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Erase Data destination machines comply with GDPR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ERASE_DATA___ERASE_DATA_DESTINATION_MACHINES_COMPLY_WITH_GDPR__DIAGNOSTICCHAIN_MAP = eINSTANCE.geteraseData__EraseData_destination_machines_comply_with_GDPR__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.consentImpl <em>consent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.consentImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getconsent()
		 * @generated
		 */
		EClass CONSENT = eINSTANCE.getconsent();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSENT__BASE_MESSAGE = eINSTANCE.getconsent_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSENT__DATA = eINSTANCE.getconsent_Data();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSENT__ACTION = eINSTANCE.getconsent_Action();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSENT__PURPOSE = eINSTANCE.getconsent_Purpose();

		/**
		 * The meta object literal for the '<em><b>Consent machine complies with GDPR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONSENT___CONSENT_MACHINE_COMPLIES_WITH_GDPR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getconsent__Consent_machine_complies_with_GDPR__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.askAuthenticationImpl <em>ask Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.askAuthenticationImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getaskAuthentication()
		 * @generated
		 */
		EClass ASK_AUTHENTICATION = eINSTANCE.getaskAuthentication();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASK_AUTHENTICATION__BASE_MESSAGE = eINSTANCE.getaskAuthentication_Base_Message();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.tpImpl <em>tp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.tpImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#gettp()
		 * @generated
		 */
		EClass TP = eINSTANCE.gettp();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TP__BASE_MESSAGE = eINSTANCE.gettp_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Tp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TP__TP = eINSTANCE.gettp_Tp();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.readDataImpl <em>read Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.readDataImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getreadData()
		 * @generated
		 */
		EClass READ_DATA = eINSTANCE.getreadData();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_DATA__BASE_MESSAGE = eINSTANCE.getreadData_Base_Message();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.permissionImpl <em>permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.permissionImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getpermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getpermission();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__BASE_MESSAGE = eINSTANCE.getpermission_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__PURPOSE = eINSTANCE.getpermission_Purpose();

		/**
		 * The meta object literal for the '<em><b>Permission Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__PERMISSION_TYPE = eINSTANCE.getpermission_PermissionType();

		/**
		 * The meta object literal for the '<em><b>No access permission given without user consent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERMISSION___NO_ACCESS_PERMISSION_GIVEN_WITHOUT_USER_CONSENT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getpermission__No_access_permission_given_without_user_consent__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.notifyImpl <em>notify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.notifyImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getnotify()
		 * @generated
		 */
		EClass NOTIFY = eINSTANCE.getnotify();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFY__BASE_MESSAGE = eINSTANCE.getnotify_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFY__DATA = eINSTANCE.getnotify_Data();

		/**
		 * The meta object literal for the '<em><b>Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFY__MACHINES = eINSTANCE.getnotify_Machines();

		/**
		 * The meta object literal for the '<em><b>Breaches</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFY__BREACHES = eINSTANCE.getnotify_Breaches();

		/**
		 * The meta object literal for the '<em><b>Notify destination machines comply with GDPR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTIFY___NOTIFY_DESTINATION_MACHINES_COMPLY_WITH_GDPR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getnotify__Notify_destination_machines_comply_with_GDPR__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.upDateImpl <em>up Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.upDateImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getupDate()
		 * @generated
		 */
		EClass UP_DATE = eINSTANCE.getupDate();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UP_DATE__BASE_MESSAGE = eINSTANCE.getupDate_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UP_DATE__DATA = eINSTANCE.getupDate_Data();

		/**
		 * The meta object literal for the '<em><b>Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UP_DATE__MACHINES = eINSTANCE.getupDate_Machines();

		/**
		 * The meta object literal for the '<em><b>New SP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UP_DATE__NEW_SP = eINSTANCE.getupDate_NewSP();

		/**
		 * The meta object literal for the '<em><b>Machine contains data to update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UP_DATE___MACHINE_CONTAINS_DATA_TO_UPDATE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getupDate__Machine_contains_data_to_update__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Up Date destination machines comply with GDPR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UP_DATE___UP_DATE_DESTINATION_MACHINES_COMPLY_WITH_GDPR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getupDate__UpDate_destination_machines_comply_with_GDPR__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.newDataImpl <em>new Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.newDataImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getnewData()
		 * @generated
		 */
		EClass NEW_DATA = eINSTANCE.getnewData();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_DATA__BASE_MESSAGE = eINSTANCE.getnewData_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_DATA__DATA = eINSTANCE.getnewData_Data();

		/**
		 * The meta object literal for the '<em><b>Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_DATA__MACHINES = eINSTANCE.getnewData_Machines();

		/**
		 * The meta object literal for the '<em><b>New Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_DATA__NEW_DATA = eINSTANCE.getnewData_NewData();

		/**
		 * The meta object literal for the '<em><b>No empty new Data fields</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEW_DATA___NO_EMPTY_NEW_DATA_FIELDS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getnewData__No_empty_newData_fields__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Machine contains data to rectify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEW_DATA___MACHINE_CONTAINS_DATA_TO_RECTIFY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getnewData__Machine_contains_data_to_rectify__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>New Data destination machines comply with GDPR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEW_DATA___NEW_DATA_DESTINATION_MACHINES_COMPLY_WITH_GDPR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getnewData__NewData_destination_machines_comply_with_GDPR__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.askDataInformationImpl <em>ask Data Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.askDataInformationImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getaskDataInformation()
		 * @generated
		 */
		EClass ASK_DATA_INFORMATION = eINSTANCE.getaskDataInformation();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASK_DATA_INFORMATION__BASE_MESSAGE = eINSTANCE.getaskDataInformation_Base_Message();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASK_DATA_INFORMATION__USER = eINSTANCE.getaskDataInformation_User();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.reportDataManagementImpl <em>report Data Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.reportDataManagementImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getreportDataManagement()
		 * @generated
		 */
		EClass REPORT_DATA_MANAGEMENT = eINSTANCE.getreportDataManagement();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_DATA_MANAGEMENT__BASE_MESSAGE = eINSTANCE.getreportDataManagement_Base_Message();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.subscribeImpl <em>subscribe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.subscribeImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getsubscribe()
		 * @generated
		 */
		EClass SUBSCRIBE = eINSTANCE.getsubscribe();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE__BASE_MESSAGE = eINSTANCE.getsubscribe_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE__DATA = eINSTANCE.getsubscribe_Data();

		/**
		 * The meta object literal for the '<em><b>Machines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE__MACHINES = eINSTANCE.getsubscribe_Machines();

		/**
		 * The meta object literal for the '<em><b>Breaches</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIBE__BREACHES = eINSTANCE.getsubscribe_Breaches();

		/**
		 * The meta object literal for the '<em><b>Max Subscription Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIBE__MAX_SUBSCRIPTION_TIME = eINSTANCE.getsubscribe_MaxSubscriptionTime();

		/**
		 * The meta object literal for the '<em><b>Max Sub Time greater than 0</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBE___MAX_SUB_TIME_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP = eINSTANCE.getsubscribe__MaxSubTime_greater_than_0__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Machine contains data to subscribe to</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBE___MACHINE_CONTAINS_DATA_TO_SUBSCRIBE_TO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getsubscribe__Machine_contains_data_to_subscribe_to__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Subscribe destination machines comply with GDPR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBSCRIBE___SUBSCRIBE_DESTINATION_MACHINES_COMPLY_WITH_GDPR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getsubscribe__Subscribe_destination_machines_comply_with_GDPR__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.informBreachesImpl <em>inform Breaches</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.informBreachesImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getinformBreaches()
		 * @generated
		 */
		EClass INFORM_BREACHES = eINSTANCE.getinformBreaches();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORM_BREACHES__BASE_MESSAGE = eINSTANCE.getinformBreaches_Base_Message();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.timeoutSubscriptionImpl <em>timeout Subscription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.timeoutSubscriptionImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#gettimeoutSubscription()
		 * @generated
		 */
		EClass TIMEOUT_SUBSCRIPTION = eINSTANCE.gettimeoutSubscription();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_SUBSCRIPTION__BASE_MESSAGE = eINSTANCE.gettimeoutSubscription_Base_Message();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.writeDataImpl <em>write Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.writeDataImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getwriteData()
		 * @generated
		 */
		EClass WRITE_DATA = eINSTANCE.getwriteData();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_DATA__BASE_MESSAGE = eINSTANCE.getwriteData_Base_Message();

		/**
		 * The meta object literal for the '<em><b>New Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_DATA__NEW_DATA = eINSTANCE.getwriteData_NewData();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_DATA__MAX_TIME = eINSTANCE.getwriteData_MaxTime();

		/**
		 * The meta object literal for the '<em><b>No empty write fields</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WRITE_DATA___NO_EMPTY_WRITE_FIELDS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getwriteData__No_empty_write_fields__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Write Data timeunit not days or hours or minutes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WRITE_DATA___WRITE_DATA_TIMEUNIT_NOT_DAYS_OR_HOURS_OR_MINUTES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getwriteData__WriteData_timeunit_not_days_or_hours_or_minutes__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.accessInformationImpl <em>access Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.accessInformationImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getaccessInformation()
		 * @generated
		 */
		EClass ACCESS_INFORMATION = eINSTANCE.getaccessInformation();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_INFORMATION__BASE_MESSAGE = eINSTANCE.getaccessInformation_Base_Message();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.removeSPInLogImpl <em>remove SP In Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.removeSPInLogImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getremoveSPInLog()
		 * @generated
		 */
		EClass REMOVE_SP_IN_LOG = eINSTANCE.getremoveSPInLog();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_SP_IN_LOG__BASE_MESSAGE = eINSTANCE.getremoveSPInLog_Base_Message();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.InfoImpl <em>Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.InfoImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getInfo()
		 * @generated
		 */
		EClass INFO = eINSTANCE.getInfo();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO__BASE_MESSAGE = eINSTANCE.getInfo_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO__MAX_TIME = eINSTANCE.getInfo_MaxTime();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO__PROVIDER = eINSTANCE.getInfo_Provider();

		/**
		 * The meta object literal for the '<em><b>Recipients</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO__RECIPIENTS = eINSTANCE.getInfo_Recipients();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.TrustedSCMImpl <em>Trusted SCM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.TrustedSCMImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getTrustedSCM()
		 * @generated
		 */
		EClass TRUSTED_SCM = eINSTANCE.getTrustedSCM();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.UntrustedSCMImpl <em>Untrusted SCM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.UntrustedSCMImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getUntrustedSCM()
		 * @generated
		 */
		EClass UNTRUSTED_SCM = eINSTANCE.getUntrustedSCM();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.consentInfoImpl <em>consent Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.consentInfoImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getconsentInfo()
		 * @generated
		 */
		EClass CONSENT_INFO = eINSTANCE.getconsentInfo();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSENT_INFO__BASE_MESSAGE = eINSTANCE.getconsentInfo_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSENT_INFO__PURPOSE = eINSTANCE.getconsentInfo_Purpose();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSENT_INFO__ACTION = eINSTANCE.getconsentInfo_Action();

		/**
		 * The meta object literal for the '<em><b>Tp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSENT_INFO__TP = eINSTANCE.getconsentInfo_Tp();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.okImpl <em>ok</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.okImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getok()
		 * @generated
		 */
		EClass OK = eINSTANCE.getok();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OK__BASE_MESSAGE = eINSTANCE.getok_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OK__PURPOSE = eINSTANCE.getok_Purpose();

		/**
		 * The meta object literal for the '<em><b>Permission Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OK__PERMISSION_TYPE = eINSTANCE.getok_PermissionType();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.informationNotForFreeImpl <em>information Not For Free</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.informationNotForFreeImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getinformationNotForFree()
		 * @generated
		 */
		EClass INFORMATION_NOT_FOR_FREE = eINSTANCE.getinformationNotForFree();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_NOT_FOR_FREE__BASE_MESSAGE = eINSTANCE.getinformationNotForFree_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_NOT_FOR_FREE__PRICE = eINSTANCE.getinformationNotForFree_Price();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.wantToAccessImpl <em>want To Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.wantToAccessImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getwantToAccess()
		 * @generated
		 */
		EClass WANT_TO_ACCESS = eINSTANCE.getwantToAccess();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WANT_TO_ACCESS__BASE_MESSAGE = eINSTANCE.getwantToAccess_Base_Message();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.reportDataDManagementForFreeImpl <em>report Data DManagement For Free</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.reportDataDManagementForFreeImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getreportDataDManagementForFree()
		 * @generated
		 */
		EClass REPORT_DATA_DMANAGEMENT_FOR_FREE = eINSTANCE.getreportDataDManagementForFree();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_DATA_DMANAGEMENT_FOR_FREE__BASE_MESSAGE = eINSTANCE.getreportDataDManagementForFree_Base_Message();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.checkChangesImpl <em>check Changes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.checkChangesImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getcheckChanges()
		 * @generated
		 */
		EClass CHECK_CHANGES = eINSTANCE.getcheckChanges();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_CHANGES__BASE_MESSAGE = eINSTANCE.getcheckChanges_Base_Message();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.impl.SPImpl <em>SP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.impl.SPImpl
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getSP()
		 * @generated
		 */
		EClass SP = eINSTANCE.getSP();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SP__BASE_MESSAGE = eINSTANCE.getSP_Base_Message();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.BandwidthUnit <em>Bandwidth Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.BandwidthUnit
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getBandwidthUnit()
		 * @generated
		 */
		EEnum BANDWIDTH_UNIT = eINSTANCE.getBandwidthUnit();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.TimeUnit
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.SizeUnit <em>Size Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.SizeUnit
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getSizeUnit()
		 * @generated
		 */
		EEnum SIZE_UNIT = eINSTANCE.getSizeUnit();

		/**
		 * The meta object literal for the '{@link Model4DataCtrack.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model4DataCtrack.ActionType
		 * @see Model4DataCtrack.impl.Model4DataCtrackPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

	}

} //Model4DataCtrackPackage
