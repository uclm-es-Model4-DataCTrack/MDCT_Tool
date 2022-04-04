/**
 */
package Model4DataCtrack.impl;

import Model4DataCtrack.AccesPerTP;
import Model4DataCtrack.AccessLog;
import Model4DataCtrack.ActionType;
import Model4DataCtrack.Bandwidth;
import Model4DataCtrack.BandwidthUnit;
import Model4DataCtrack.ComputingRack;
import Model4DataCtrack.ControllerCP;
import Model4DataCtrack.Data;
import Model4DataCtrack.DataArchive;
import Model4DataCtrack.DataCenter;
import Model4DataCtrack.DataCenterElement;
import Model4DataCtrack.DataField;
import Model4DataCtrack.Hardware;
import Model4DataCtrack.Info;
import Model4DataCtrack.Infrastructure;
import Model4DataCtrack.Latency;
import Model4DataCtrack.Machine;
import Model4DataCtrack.Memory;
import Model4DataCtrack.Model4DataCtrackFactory;
import Model4DataCtrack.Model4DataCtrackPackage;
import Model4DataCtrack.PList;
import Model4DataCtrack.PermissionPerTP;
import Model4DataCtrack.Principal;
import Model4DataCtrack.Rack;
import Model4DataCtrack.RackElement;
import Model4DataCtrack.SSMProcessor;
import Model4DataCtrack.Size;
import Model4DataCtrack.SizeUnit;
import Model4DataCtrack.StatelessAppCTP;
import Model4DataCtrack.StatelessComputationMachine;
import Model4DataCtrack.StickyPolicy;
import Model4DataCtrack.Storage;
import Model4DataCtrack.StorageRack;
import Model4DataCtrack.Time;
import Model4DataCtrack.TimeUnit;
import Model4DataCtrack.TrustedSCM;
import Model4DataCtrack.UntrustedSCM;
import Model4DataCtrack.User;
import Model4DataCtrack.accessInformation;
import Model4DataCtrack.askAuthentication;
import Model4DataCtrack.askDataInformation;
import Model4DataCtrack.checkChanges;
import Model4DataCtrack.consent;
import Model4DataCtrack.consentInfo;
import Model4DataCtrack.eraseData;
import Model4DataCtrack.informBreaches;
import Model4DataCtrack.informationNotForFree;
import Model4DataCtrack.newData;
import Model4DataCtrack.newRestrictions;
import Model4DataCtrack.notify;
import Model4DataCtrack.ok;
import Model4DataCtrack.permission;
import Model4DataCtrack.readData;
import Model4DataCtrack.rectifyData;
import Model4DataCtrack.removeData;
import Model4DataCtrack.removeSPInLog;
import Model4DataCtrack.reportDataDManagementForFree;
import Model4DataCtrack.reportDataManagement;
import Model4DataCtrack.sendData;
import Model4DataCtrack.subscribe;
import Model4DataCtrack.timeoutSubscription;
import Model4DataCtrack.tp;
import Model4DataCtrack.upDate;

import Model4DataCtrack.util.Model4DataCtrackValidator;

import Model4DataCtrack.wantToAccess;
import Model4DataCtrack.writeData;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Model4DataCtrackPackageImpl extends EPackageImpl implements Model4DataCtrackPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bandwidthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerCPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ssmProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataArchiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stickyPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionPerTPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass principalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statelessAppCTPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accesPerTPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCenterElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rackElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingRackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statelessComputationMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageRackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newRestrictionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectifyDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eraseDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass askAuthenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass askDataInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportDataManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscribeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informBreachesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeoutSubscriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeSPInLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trustedSCMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass untrustedSCMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass okEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationNotForFreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wantToAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportDataDManagementForFreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkChangesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bandwidthUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sizeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Model4DataCtrack.Model4DataCtrackPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Model4DataCtrackPackageImpl() {
		super(eNS_URI, Model4DataCtrackFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Model4DataCtrackPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Model4DataCtrackPackage init() {
		if (isInited) return (Model4DataCtrackPackage)EPackage.Registry.INSTANCE.getEPackage(Model4DataCtrackPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModel4DataCtrackPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Model4DataCtrackPackageImpl theModel4DataCtrackPackage = registeredModel4DataCtrackPackage instanceof Model4DataCtrackPackageImpl ? (Model4DataCtrackPackageImpl)registeredModel4DataCtrackPackage : new Model4DataCtrackPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModel4DataCtrackPackage.createPackageContents();

		// Initialize created meta-data
		theModel4DataCtrackPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theModel4DataCtrackPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Model4DataCtrackValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theModel4DataCtrackPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Model4DataCtrackPackage.eNS_URI, theModel4DataCtrackPackage);
		return theModel4DataCtrackPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructure() {
		return infrastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructure_Base_Component() {
		return (EReference)infrastructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructure_Network() {
		return (EReference)infrastructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructure_CloudProvider() {
		return (EReference)infrastructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructure_Datacenterelements() {
		return (EReference)infrastructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBandwidth() {
		return bandwidthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBandwidth_Value() {
		return (EAttribute)bandwidthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBandwidth_Unit() {
		return (EAttribute)bandwidthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBandwidth__Bandwidth_value_greater_than_0__DiagnosticChain_Map() {
		return bandwidthEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerCP() {
		return controllerCPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerCP_Base_Lifeline() {
		return (EReference)controllerCPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerCP_ResourceAllocationPolicy() {
		return (EAttribute)controllerCPEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerCP_IdProvider() {
		return (EAttribute)controllerCPEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerCP_Sla() {
		return (EReference)controllerCPEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerCP_Accesslog() {
		return (EReference)controllerCPEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControllerCP__NewLocation_machine_not_under_sla_with_controller__DiagnosticChain_Map() {
		return controllerCPEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControllerCP__Location1_machine_not_under_sla_with_controller__DiagnosticChain_Map() {
		return controllerCPEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControllerCP__SourceMachine_not_under_sla_with_controller__DiagnosticChain_Map() {
		return controllerCPEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSLA() {
		return slaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSLA_Base_Class() {
		return (EReference)slaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSLA_SubjectMatter() {
		return (EAttribute)slaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSLA_ProcessingDuration() {
		return (EReference)slaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSLA_ProcessingNature() {
		return (EAttribute)slaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSLA_ProcessingPurpose() {
		return (EAttribute)slaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSLA_ProcessingInstructions() {
		return (EAttribute)slaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSLA_Base_Component() {
		return (EReference)slaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSLA_Recipients() {
		return (EReference)slaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Value() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Unit() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTime__Time_value_greater_than_0__DiagnosticChain_Map() {
		return timeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessLog() {
		return accessLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessLog_Base_Class() {
		return (EReference)accessLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessLog_Action() {
		return (EAttribute)accessLogEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessLog_Nl() {
		return (EReference)accessLogEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessLog_Nsp() {
		return (EReference)accessLogEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessLog_Tp() {
		return (EReference)accessLogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessLog_L1() {
		return (EReference)accessLogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessLog_Sp1() {
		return (EReference)accessLogEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessLog_O() {
		return (EReference)accessLogEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessLog_Base_Component() {
		return (EReference)accessLogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAccessLog__Log_access_match_sp_access__DiagnosticChain_Map() {
		return accessLogEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSMProcessor() {
		return ssmProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSMProcessor_Base_Lifeline() {
		return (EReference)ssmProcessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSSMProcessor_Sla() {
		return (EReference)ssmProcessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSSMProcessor_GDPRCompliance() {
		return (EAttribute)ssmProcessorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSSMProcessor__SSMProccessor_complies_GDPR__DiagnosticChain_Map() {
		return ssmProcessorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_Base_Component() {
		return (EReference)machineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_Cpu() {
		return (EReference)machineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_Memory() {
		return (EReference)machineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_Storage() {
		return (EReference)machineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCPU() {
		return cpuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCPU_Cores() {
		return (EAttribute)cpuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCPU_FLOPs() {
		return (EAttribute)cpuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCPU__Cpu_cores_and_flops_greater_than_0__DiagnosticChain_Map() {
		return cpuEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHardware() {
		return hardwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHardware_Base_Component() {
		return (EReference)hardwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemory() {
		return memoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemory_Capacity() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemory_Latency() {
		return (EReference)memoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSize() {
		return sizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Value() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Unit() {
		return (EAttribute)sizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSize__Size_value_greater_than_0__DiagnosticChain_Map() {
		return sizeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatency() {
		return latencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatency_Name() {
		return (EAttribute)latencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLatency_Time() {
		return (EReference)latencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLatency__Latency_not_in_us_or_ns__DiagnosticChain_Map() {
		return latencyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLatency__Latency_name_not_empty__DiagnosticChain_Map() {
		return latencyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorage() {
		return storageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorage_NumberOfDrivers() {
		return (EAttribute)storageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorage_DirveCapacity() {
		return (EReference)storageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorage_ReadBandwidth() {
		return (EReference)storageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorage_Data() {
		return (EReference)storageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStorage__NumberOfDrivers_greater_than_0__DiagnosticChain_Map() {
		return storageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Base_Class() {
		return (EReference)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Archive() {
		return (EReference)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_AppliedPolicy() {
		return (EReference)dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Base_Component() {
		return (EReference)dataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataArchive() {
		return dataArchiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataArchive_Contents() {
		return (EReference)dataArchiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataArchive_IdData() {
		return (EAttribute)dataArchiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataField() {
		return dataFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataField_Value() {
		return (EAttribute)dataFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStickyPolicy() {
		return stickyPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStickyPolicy_Base_Class() {
		return (EReference)stickyPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStickyPolicy_Permission() {
		return (EReference)stickyPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStickyPolicy_AccessHistory() {
		return (EReference)stickyPolicyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStickyPolicy_Controller() {
		return (EReference)stickyPolicyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStickyPolicy_Base_Component() {
		return (EReference)stickyPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStickyPolicy_Owner() {
		return (EReference)stickyPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStickyPolicy_Purpose() {
		return (EAttribute)stickyPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStickyPolicy__Allowed_access_purpose__DiagnosticChain_Map() {
		return stickyPolicyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStickyPolicy__All_tps_in_history_given_permissions__DiagnosticChain_Map() {
		return stickyPolicyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermissionPerTP() {
		return permissionPerTPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermissionPerTP_S() {
		return (EReference)permissionPerTPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermissionPerTP_I() {
		return (EReference)permissionPerTPEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPList() {
		return pListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPList_List() {
		return (EReference)pListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrincipal() {
		return principalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrincipal_Base_Component() {
		return (EReference)principalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrincipal_Base_Lifeline() {
		return (EReference)principalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatelessAppCTP() {
		return statelessAppCTPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Instances() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_IdUser() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccesPerTP() {
		return accesPerTPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccesPerTP_Tp() {
		return (EReference)accesPerTPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccesPerTP_ActionPerformed() {
		return (EAttribute)accesPerTPEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccesPerTP_Purpose() {
		return (EAttribute)accesPerTPEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCenterElement() {
		return dataCenterElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCenterElement_NumberOfDataCenters() {
		return (EAttribute)dataCenterElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCenterElement_DataCenterType() {
		return (EReference)dataCenterElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataCenterElement__No_empty_infra__DiagnosticChain_Map() {
		return dataCenterElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCenter() {
		return dataCenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCenter_Base_Component() {
		return (EReference)dataCenterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCenter_Network() {
		return (EReference)dataCenterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataCenter_Rack() {
		return (EReference)dataCenterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRackElement() {
		return rackElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRackElement_NumberOfRacks() {
		return (EAttribute)rackElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRackElement_RackType() {
		return (EReference)rackElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRackElement__No_empty_datacenters__DiagnosticChain_Map() {
		return rackElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRack() {
		return rackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRack_Base_Component() {
		return (EReference)rackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRack_MachinesPerBoard() {
		return (EAttribute)rackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRack_Network() {
		return (EReference)rackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRack_Boards() {
		return (EAttribute)rackEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRack__No_empty_racks__DiagnosticChain_Map() {
		return rackEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputingRack() {
		return computingRackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputingRack_MachineType() {
		return (EReference)computingRackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatelessComputationMachine() {
		return statelessComputationMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatelessComputationMachine_Applications() {
		return (EReference)statelessComputationMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatelessComputationMachine_Purpose() {
		return (EAttribute)statelessComputationMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageRack() {
		return storageRackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorageRack_MachineType() {
		return (EReference)storageRackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsendData() {
		return sendDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsendData_Base_Message() {
		return (EReference)sendDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsendData_MaxTime() {
		return (EReference)sendDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsendData_Data() {
		return (EReference)sendDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsendData__SendData_timeunit_not_days_or_hours_or_minutes__DiagnosticChain_Map() {
		return sendDataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsendData__SendData_maxTime_value_greater_than_0__DiagnosticChain_Map() {
		return sendDataEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnewRestrictions() {
		return newRestrictionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getnewRestrictions_Base_Message() {
		return (EReference)newRestrictionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getnewRestrictions_Data() {
		return (EReference)newRestrictionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getnewRestrictions_NewSP() {
		return (EReference)newRestrictionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getrectifyData() {
		return rectifyDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getrectifyData_Base_Message() {
		return (EReference)rectifyDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getrectifyData_Data() {
		return (EReference)rectifyDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getrectifyData_NewData() {
		return (EReference)rectifyDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getrectifyData__No_empty_rectify_fields__DiagnosticChain_Map() {
		return rectifyDataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getremoveData() {
		return removeDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getremoveData_Base_Message() {
		return (EReference)removeDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getremoveData_Data() {
		return (EReference)removeDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass geteraseData() {
		return eraseDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference geteraseData_Base_Message() {
		return (EReference)eraseDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference geteraseData_Data() {
		return (EReference)eraseDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference geteraseData_Machines() {
		return (EReference)eraseDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation geteraseData__Machine_contains_data_to_erase__DiagnosticChain_Map() {
		return eraseDataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation geteraseData__EraseData_destination_machines_comply_with_GDPR__DiagnosticChain_Map() {
		return eraseDataEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getconsent() {
		return consentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getconsent_Base_Message() {
		return (EReference)consentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getconsent_Data() {
		return (EReference)consentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getconsent_Action() {
		return (EAttribute)consentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getconsent_Purpose() {
		return (EAttribute)consentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getconsent__Consent_machine_complies_with_GDPR__DiagnosticChain_Map() {
		return consentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaskAuthentication() {
		return askAuthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getaskAuthentication_Base_Message() {
		return (EReference)askAuthenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettp() {
		return tpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettp_Base_Message() {
		return (EReference)tpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettp_Tp() {
		return (EReference)tpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getreadData() {
		return readDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreadData_Base_Message() {
		return (EReference)readDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpermission() {
		return permissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpermission_Base_Message() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpermission_Purpose() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpermission_PermissionType() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getpermission__No_access_permission_given_without_user_consent__DiagnosticChain_Map() {
		return permissionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnotify() {
		return notifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getnotify_Base_Message() {
		return (EReference)notifyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getnotify_Data() {
		return (EReference)notifyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getnotify_Machines() {
		return (EReference)notifyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnotify_Breaches() {
		return (EAttribute)notifyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnotify__Notify_destination_machines_comply_with_GDPR__DiagnosticChain_Map() {
		return notifyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getupDate() {
		return upDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getupDate_Base_Message() {
		return (EReference)upDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getupDate_Data() {
		return (EReference)upDateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getupDate_Machines() {
		return (EReference)upDateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getupDate_NewSP() {
		return (EReference)upDateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getupDate__Machine_contains_data_to_update__DiagnosticChain_Map() {
		return upDateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getupDate__UpDate_destination_machines_comply_with_GDPR__DiagnosticChain_Map() {
		return upDateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnewData() {
		return newDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getnewData_Base_Message() {
		return (EReference)newDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getnewData_Data() {
		return (EReference)newDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getnewData_Machines() {
		return (EReference)newDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getnewData_NewData() {
		return (EReference)newDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnewData__No_empty_newData_fields__DiagnosticChain_Map() {
		return newDataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnewData__Machine_contains_data_to_rectify__DiagnosticChain_Map() {
		return newDataEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getnewData__NewData_destination_machines_comply_with_GDPR__DiagnosticChain_Map() {
		return newDataEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaskDataInformation() {
		return askDataInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getaskDataInformation_Base_Message() {
		return (EReference)askDataInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getaskDataInformation_User() {
		return (EReference)askDataInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getreportDataManagement() {
		return reportDataManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreportDataManagement_Base_Message() {
		return (EReference)reportDataManagementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsubscribe() {
		return subscribeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsubscribe_Base_Message() {
		return (EReference)subscribeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsubscribe_Data() {
		return (EReference)subscribeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsubscribe_Machines() {
		return (EReference)subscribeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getsubscribe_Breaches() {
		return (EAttribute)subscribeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsubscribe_MaxSubscriptionTime() {
		return (EReference)subscribeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsubscribe__MaxSubTime_greater_than_0__DiagnosticChain_Map() {
		return subscribeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsubscribe__Machine_contains_data_to_subscribe_to__DiagnosticChain_Map() {
		return subscribeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getsubscribe__Subscribe_destination_machines_comply_with_GDPR__DiagnosticChain_Map() {
		return subscribeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getinformBreaches() {
		return informBreachesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getinformBreaches_Base_Message() {
		return (EReference)informBreachesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettimeoutSubscription() {
		return timeoutSubscriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettimeoutSubscription_Base_Message() {
		return (EReference)timeoutSubscriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwriteData() {
		return writeDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwriteData_Base_Message() {
		return (EReference)writeDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwriteData_NewData() {
		return (EReference)writeDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwriteData_MaxTime() {
		return (EReference)writeDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwriteData__No_empty_write_fields__DiagnosticChain_Map() {
		return writeDataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getwriteData__WriteData_timeunit_not_days_or_hours_or_minutes__DiagnosticChain_Map() {
		return writeDataEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaccessInformation() {
		return accessInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getaccessInformation_Base_Message() {
		return (EReference)accessInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getremoveSPInLog() {
		return removeSPInLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getremoveSPInLog_Base_Message() {
		return (EReference)removeSPInLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfo() {
		return infoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfo_Base_Message() {
		return (EReference)infoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfo_MaxTime() {
		return (EReference)infoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfo_Provider() {
		return (EReference)infoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfo_Recipients() {
		return (EReference)infoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrustedSCM() {
		return trustedSCMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUntrustedSCM() {
		return untrustedSCMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getconsentInfo() {
		return consentInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getconsentInfo_Base_Message() {
		return (EReference)consentInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getconsentInfo_Purpose() {
		return (EAttribute)consentInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getconsentInfo_Action() {
		return (EAttribute)consentInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getconsentInfo_Tp() {
		return (EReference)consentInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getok() {
		return okEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getok_Base_Message() {
		return (EReference)okEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getok_Purpose() {
		return (EAttribute)okEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getok_PermissionType() {
		return (EAttribute)okEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getinformationNotForFree() {
		return informationNotForFreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getinformationNotForFree_Base_Message() {
		return (EReference)informationNotForFreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getinformationNotForFree_Price() {
		return (EAttribute)informationNotForFreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwantToAccess() {
		return wantToAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwantToAccess_Base_Message() {
		return (EReference)wantToAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getreportDataDManagementForFree() {
		return reportDataDManagementForFreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreportDataDManagementForFree_Base_Message() {
		return (EReference)reportDataDManagementForFreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcheckChanges() {
		return checkChangesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcheckChanges_Base_Message() {
		return (EReference)checkChangesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSP() {
		return spEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSP_Base_Message() {
		return (EReference)spEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBandwidthUnit() {
		return bandwidthUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnit() {
		return timeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSizeUnit() {
		return sizeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionType() {
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model4DataCtrackFactory getModel4DataCtrackFactory() {
		return (Model4DataCtrackFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		infrastructureEClass = createEClass(INFRASTRUCTURE);
		createEReference(infrastructureEClass, INFRASTRUCTURE__BASE_COMPONENT);
		createEReference(infrastructureEClass, INFRASTRUCTURE__NETWORK);
		createEReference(infrastructureEClass, INFRASTRUCTURE__CLOUD_PROVIDER);
		createEReference(infrastructureEClass, INFRASTRUCTURE__DATACENTERELEMENTS);

		bandwidthEClass = createEClass(BANDWIDTH);
		createEAttribute(bandwidthEClass, BANDWIDTH__VALUE);
		createEAttribute(bandwidthEClass, BANDWIDTH__UNIT);
		createEOperation(bandwidthEClass, BANDWIDTH___BANDWIDTH_VALUE_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP);

		controllerCPEClass = createEClass(CONTROLLER_CP);
		createEReference(controllerCPEClass, CONTROLLER_CP__BASE_LIFELINE);
		createEAttribute(controllerCPEClass, CONTROLLER_CP__RESOURCE_ALLOCATION_POLICY);
		createEAttribute(controllerCPEClass, CONTROLLER_CP__ID_PROVIDER);
		createEReference(controllerCPEClass, CONTROLLER_CP__SLA);
		createEReference(controllerCPEClass, CONTROLLER_CP__ACCESSLOG);
		createEOperation(controllerCPEClass, CONTROLLER_CP___NEW_LOCATION_MACHINE_NOT_UNDER_SLA_WITH_CONTROLLER__DIAGNOSTICCHAIN_MAP);
		createEOperation(controllerCPEClass, CONTROLLER_CP___LOCATION1_MACHINE_NOT_UNDER_SLA_WITH_CONTROLLER__DIAGNOSTICCHAIN_MAP);
		createEOperation(controllerCPEClass, CONTROLLER_CP___SOURCE_MACHINE_NOT_UNDER_SLA_WITH_CONTROLLER__DIAGNOSTICCHAIN_MAP);

		slaEClass = createEClass(SLA);
		createEReference(slaEClass, SLA__BASE_CLASS);
		createEAttribute(slaEClass, SLA__SUBJECT_MATTER);
		createEReference(slaEClass, SLA__PROCESSING_DURATION);
		createEReference(slaEClass, SLA__BASE_COMPONENT);
		createEReference(slaEClass, SLA__RECIPIENTS);
		createEAttribute(slaEClass, SLA__PROCESSING_NATURE);
		createEAttribute(slaEClass, SLA__PROCESSING_PURPOSE);
		createEAttribute(slaEClass, SLA__PROCESSING_INSTRUCTIONS);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__VALUE);
		createEAttribute(timeEClass, TIME__UNIT);
		createEOperation(timeEClass, TIME___TIME_VALUE_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP);

		statelessAppCTPEClass = createEClass(STATELESS_APP_CTP);

		principalEClass = createEClass(PRINCIPAL);
		createEReference(principalEClass, PRINCIPAL__BASE_COMPONENT);
		createEReference(principalEClass, PRINCIPAL__BASE_LIFELINE);

		accessLogEClass = createEClass(ACCESS_LOG);
		createEReference(accessLogEClass, ACCESS_LOG__BASE_CLASS);
		createEReference(accessLogEClass, ACCESS_LOG__BASE_COMPONENT);
		createEReference(accessLogEClass, ACCESS_LOG__TP);
		createEReference(accessLogEClass, ACCESS_LOG__L1);
		createEReference(accessLogEClass, ACCESS_LOG__SP1);
		createEReference(accessLogEClass, ACCESS_LOG__O);
		createEAttribute(accessLogEClass, ACCESS_LOG__ACTION);
		createEReference(accessLogEClass, ACCESS_LOG__NL);
		createEReference(accessLogEClass, ACCESS_LOG__NSP);
		createEOperation(accessLogEClass, ACCESS_LOG___LOG_ACCESS_MATCH_SP_ACCESS__DIAGNOSTICCHAIN_MAP);

		storageEClass = createEClass(STORAGE);
		createEAttribute(storageEClass, STORAGE__NUMBER_OF_DRIVERS);
		createEReference(storageEClass, STORAGE__DIRVE_CAPACITY);
		createEReference(storageEClass, STORAGE__READ_BANDWIDTH);
		createEReference(storageEClass, STORAGE__DATA);
		createEOperation(storageEClass, STORAGE___NUMBER_OF_DRIVERS_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP);

		hardwareEClass = createEClass(HARDWARE);
		createEReference(hardwareEClass, HARDWARE__BASE_COMPONENT);

		sizeEClass = createEClass(SIZE);
		createEAttribute(sizeEClass, SIZE__VALUE);
		createEAttribute(sizeEClass, SIZE__UNIT);
		createEOperation(sizeEClass, SIZE___SIZE_VALUE_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP);

		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__BASE_CLASS);
		createEReference(dataEClass, DATA__ARCHIVE);
		createEReference(dataEClass, DATA__APPLIED_POLICY);
		createEReference(dataEClass, DATA__BASE_COMPONENT);

		dataArchiveEClass = createEClass(DATA_ARCHIVE);
		createEReference(dataArchiveEClass, DATA_ARCHIVE__CONTENTS);
		createEAttribute(dataArchiveEClass, DATA_ARCHIVE__ID_DATA);

		dataFieldEClass = createEClass(DATA_FIELD);
		createEAttribute(dataFieldEClass, DATA_FIELD__VALUE);

		stickyPolicyEClass = createEClass(STICKY_POLICY);
		createEReference(stickyPolicyEClass, STICKY_POLICY__BASE_CLASS);
		createEReference(stickyPolicyEClass, STICKY_POLICY__PERMISSION);
		createEReference(stickyPolicyEClass, STICKY_POLICY__BASE_COMPONENT);
		createEReference(stickyPolicyEClass, STICKY_POLICY__OWNER);
		createEAttribute(stickyPolicyEClass, STICKY_POLICY__PURPOSE);
		createEReference(stickyPolicyEClass, STICKY_POLICY__CONTROLLER);
		createEReference(stickyPolicyEClass, STICKY_POLICY__ACCESS_HISTORY);
		createEOperation(stickyPolicyEClass, STICKY_POLICY___ALLOWED_ACCESS_PURPOSE__DIAGNOSTICCHAIN_MAP);
		createEOperation(stickyPolicyEClass, STICKY_POLICY___ALL_TPS_IN_HISTORY_GIVEN_PERMISSIONS__DIAGNOSTICCHAIN_MAP);

		permissionPerTPEClass = createEClass(PERMISSION_PER_TP);
		createEReference(permissionPerTPEClass, PERMISSION_PER_TP__S);
		createEReference(permissionPerTPEClass, PERMISSION_PER_TP__I);

		pListEClass = createEClass(PLIST);
		createEReference(pListEClass, PLIST__LIST);

		accesPerTPEClass = createEClass(ACCES_PER_TP);
		createEReference(accesPerTPEClass, ACCES_PER_TP__TP);
		createEAttribute(accesPerTPEClass, ACCES_PER_TP__ACTION_PERFORMED);
		createEAttribute(accesPerTPEClass, ACCES_PER_TP__PURPOSE);

		dataCenterElementEClass = createEClass(DATA_CENTER_ELEMENT);
		createEAttribute(dataCenterElementEClass, DATA_CENTER_ELEMENT__NUMBER_OF_DATA_CENTERS);
		createEReference(dataCenterElementEClass, DATA_CENTER_ELEMENT__DATA_CENTER_TYPE);
		createEOperation(dataCenterElementEClass, DATA_CENTER_ELEMENT___NO_EMPTY_INFRA__DIAGNOSTICCHAIN_MAP);

		dataCenterEClass = createEClass(DATA_CENTER);
		createEReference(dataCenterEClass, DATA_CENTER__BASE_COMPONENT);
		createEReference(dataCenterEClass, DATA_CENTER__NETWORK);
		createEReference(dataCenterEClass, DATA_CENTER__RACK);

		rackElementEClass = createEClass(RACK_ELEMENT);
		createEAttribute(rackElementEClass, RACK_ELEMENT__NUMBER_OF_RACKS);
		createEReference(rackElementEClass, RACK_ELEMENT__RACK_TYPE);
		createEOperation(rackElementEClass, RACK_ELEMENT___NO_EMPTY_DATACENTERS__DIAGNOSTICCHAIN_MAP);

		rackEClass = createEClass(RACK);
		createEReference(rackEClass, RACK__BASE_COMPONENT);
		createEAttribute(rackEClass, RACK__MACHINES_PER_BOARD);
		createEReference(rackEClass, RACK__NETWORK);
		createEAttribute(rackEClass, RACK__BOARDS);
		createEOperation(rackEClass, RACK___NO_EMPTY_RACKS__DIAGNOSTICCHAIN_MAP);

		machineEClass = createEClass(MACHINE);
		createEReference(machineEClass, MACHINE__BASE_COMPONENT);
		createEReference(machineEClass, MACHINE__CPU);
		createEReference(machineEClass, MACHINE__MEMORY);
		createEReference(machineEClass, MACHINE__STORAGE);

		cpuEClass = createEClass(CPU);
		createEAttribute(cpuEClass, CPU__CORES);
		createEAttribute(cpuEClass, CPU__FLO_PS);
		createEOperation(cpuEClass, CPU___CPU_CORES_AND_FLOPS_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP);

		memoryEClass = createEClass(MEMORY);
		createEReference(memoryEClass, MEMORY__CAPACITY);
		createEReference(memoryEClass, MEMORY__LATENCY);

		latencyEClass = createEClass(LATENCY);
		createEAttribute(latencyEClass, LATENCY__NAME);
		createEReference(latencyEClass, LATENCY__TIME);
		createEOperation(latencyEClass, LATENCY___LATENCY_NOT_IN_US_OR_NS__DIAGNOSTICCHAIN_MAP);
		createEOperation(latencyEClass, LATENCY___LATENCY_NAME_NOT_EMPTY__DIAGNOSTICCHAIN_MAP);

		computingRackEClass = createEClass(COMPUTING_RACK);
		createEReference(computingRackEClass, COMPUTING_RACK__MACHINE_TYPE);

		statelessComputationMachineEClass = createEClass(STATELESS_COMPUTATION_MACHINE);
		createEReference(statelessComputationMachineEClass, STATELESS_COMPUTATION_MACHINE__APPLICATIONS);
		createEAttribute(statelessComputationMachineEClass, STATELESS_COMPUTATION_MACHINE__PURPOSE);

		storageRackEClass = createEClass(STORAGE_RACK);
		createEReference(storageRackEClass, STORAGE_RACK__MACHINE_TYPE);

		ssmProcessorEClass = createEClass(SSM_PROCESSOR);
		createEReference(ssmProcessorEClass, SSM_PROCESSOR__BASE_LIFELINE);
		createEReference(ssmProcessorEClass, SSM_PROCESSOR__SLA);
		createEAttribute(ssmProcessorEClass, SSM_PROCESSOR__GDPR_COMPLIANCE);
		createEOperation(ssmProcessorEClass, SSM_PROCESSOR___SSM_PROCCESSOR_COMPLIES_GDPR__DIAGNOSTICCHAIN_MAP);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__INSTANCES);
		createEAttribute(userEClass, USER__ID_USER);

		sendDataEClass = createEClass(SEND_DATA);
		createEReference(sendDataEClass, SEND_DATA__BASE_MESSAGE);
		createEReference(sendDataEClass, SEND_DATA__MAX_TIME);
		createEReference(sendDataEClass, SEND_DATA__DATA);
		createEOperation(sendDataEClass, SEND_DATA___SEND_DATA_TIMEUNIT_NOT_DAYS_OR_HOURS_OR_MINUTES__DIAGNOSTICCHAIN_MAP);
		createEOperation(sendDataEClass, SEND_DATA___SEND_DATA_MAX_TIME_VALUE_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP);

		newRestrictionsEClass = createEClass(NEW_RESTRICTIONS);
		createEReference(newRestrictionsEClass, NEW_RESTRICTIONS__BASE_MESSAGE);
		createEReference(newRestrictionsEClass, NEW_RESTRICTIONS__DATA);
		createEReference(newRestrictionsEClass, NEW_RESTRICTIONS__NEW_SP);

		rectifyDataEClass = createEClass(RECTIFY_DATA);
		createEReference(rectifyDataEClass, RECTIFY_DATA__BASE_MESSAGE);
		createEReference(rectifyDataEClass, RECTIFY_DATA__DATA);
		createEReference(rectifyDataEClass, RECTIFY_DATA__NEW_DATA);
		createEOperation(rectifyDataEClass, RECTIFY_DATA___NO_EMPTY_RECTIFY_FIELDS__DIAGNOSTICCHAIN_MAP);

		removeDataEClass = createEClass(REMOVE_DATA);
		createEReference(removeDataEClass, REMOVE_DATA__BASE_MESSAGE);
		createEReference(removeDataEClass, REMOVE_DATA__DATA);

		eraseDataEClass = createEClass(ERASE_DATA);
		createEReference(eraseDataEClass, ERASE_DATA__BASE_MESSAGE);
		createEReference(eraseDataEClass, ERASE_DATA__DATA);
		createEReference(eraseDataEClass, ERASE_DATA__MACHINES);
		createEOperation(eraseDataEClass, ERASE_DATA___MACHINE_CONTAINS_DATA_TO_ERASE__DIAGNOSTICCHAIN_MAP);
		createEOperation(eraseDataEClass, ERASE_DATA___ERASE_DATA_DESTINATION_MACHINES_COMPLY_WITH_GDPR__DIAGNOSTICCHAIN_MAP);

		consentEClass = createEClass(CONSENT);
		createEReference(consentEClass, CONSENT__BASE_MESSAGE);
		createEReference(consentEClass, CONSENT__DATA);
		createEAttribute(consentEClass, CONSENT__ACTION);
		createEAttribute(consentEClass, CONSENT__PURPOSE);
		createEOperation(consentEClass, CONSENT___CONSENT_MACHINE_COMPLIES_WITH_GDPR__DIAGNOSTICCHAIN_MAP);

		askAuthenticationEClass = createEClass(ASK_AUTHENTICATION);
		createEReference(askAuthenticationEClass, ASK_AUTHENTICATION__BASE_MESSAGE);

		tpEClass = createEClass(TP);
		createEReference(tpEClass, TP__BASE_MESSAGE);
		createEReference(tpEClass, TP__TP);

		readDataEClass = createEClass(READ_DATA);
		createEReference(readDataEClass, READ_DATA__BASE_MESSAGE);

		permissionEClass = createEClass(PERMISSION);
		createEReference(permissionEClass, PERMISSION__BASE_MESSAGE);
		createEAttribute(permissionEClass, PERMISSION__PURPOSE);
		createEAttribute(permissionEClass, PERMISSION__PERMISSION_TYPE);
		createEOperation(permissionEClass, PERMISSION___NO_ACCESS_PERMISSION_GIVEN_WITHOUT_USER_CONSENT__DIAGNOSTICCHAIN_MAP);

		notifyEClass = createEClass(NOTIFY);
		createEReference(notifyEClass, NOTIFY__BASE_MESSAGE);
		createEReference(notifyEClass, NOTIFY__DATA);
		createEReference(notifyEClass, NOTIFY__MACHINES);
		createEAttribute(notifyEClass, NOTIFY__BREACHES);
		createEOperation(notifyEClass, NOTIFY___NOTIFY_DESTINATION_MACHINES_COMPLY_WITH_GDPR__DIAGNOSTICCHAIN_MAP);

		upDateEClass = createEClass(UP_DATE);
		createEReference(upDateEClass, UP_DATE__BASE_MESSAGE);
		createEReference(upDateEClass, UP_DATE__DATA);
		createEReference(upDateEClass, UP_DATE__MACHINES);
		createEReference(upDateEClass, UP_DATE__NEW_SP);
		createEOperation(upDateEClass, UP_DATE___MACHINE_CONTAINS_DATA_TO_UPDATE__DIAGNOSTICCHAIN_MAP);
		createEOperation(upDateEClass, UP_DATE___UP_DATE_DESTINATION_MACHINES_COMPLY_WITH_GDPR__DIAGNOSTICCHAIN_MAP);

		newDataEClass = createEClass(NEW_DATA);
		createEReference(newDataEClass, NEW_DATA__BASE_MESSAGE);
		createEReference(newDataEClass, NEW_DATA__DATA);
		createEReference(newDataEClass, NEW_DATA__MACHINES);
		createEReference(newDataEClass, NEW_DATA__NEW_DATA);
		createEOperation(newDataEClass, NEW_DATA___NO_EMPTY_NEW_DATA_FIELDS__DIAGNOSTICCHAIN_MAP);
		createEOperation(newDataEClass, NEW_DATA___MACHINE_CONTAINS_DATA_TO_RECTIFY__DIAGNOSTICCHAIN_MAP);
		createEOperation(newDataEClass, NEW_DATA___NEW_DATA_DESTINATION_MACHINES_COMPLY_WITH_GDPR__DIAGNOSTICCHAIN_MAP);

		askDataInformationEClass = createEClass(ASK_DATA_INFORMATION);
		createEReference(askDataInformationEClass, ASK_DATA_INFORMATION__BASE_MESSAGE);
		createEReference(askDataInformationEClass, ASK_DATA_INFORMATION__USER);

		reportDataManagementEClass = createEClass(REPORT_DATA_MANAGEMENT);
		createEReference(reportDataManagementEClass, REPORT_DATA_MANAGEMENT__BASE_MESSAGE);

		subscribeEClass = createEClass(SUBSCRIBE);
		createEReference(subscribeEClass, SUBSCRIBE__BASE_MESSAGE);
		createEReference(subscribeEClass, SUBSCRIBE__DATA);
		createEReference(subscribeEClass, SUBSCRIBE__MACHINES);
		createEAttribute(subscribeEClass, SUBSCRIBE__BREACHES);
		createEReference(subscribeEClass, SUBSCRIBE__MAX_SUBSCRIPTION_TIME);
		createEOperation(subscribeEClass, SUBSCRIBE___MAX_SUB_TIME_GREATER_THAN_0__DIAGNOSTICCHAIN_MAP);
		createEOperation(subscribeEClass, SUBSCRIBE___MACHINE_CONTAINS_DATA_TO_SUBSCRIBE_TO__DIAGNOSTICCHAIN_MAP);
		createEOperation(subscribeEClass, SUBSCRIBE___SUBSCRIBE_DESTINATION_MACHINES_COMPLY_WITH_GDPR__DIAGNOSTICCHAIN_MAP);

		informBreachesEClass = createEClass(INFORM_BREACHES);
		createEReference(informBreachesEClass, INFORM_BREACHES__BASE_MESSAGE);

		timeoutSubscriptionEClass = createEClass(TIMEOUT_SUBSCRIPTION);
		createEReference(timeoutSubscriptionEClass, TIMEOUT_SUBSCRIPTION__BASE_MESSAGE);

		writeDataEClass = createEClass(WRITE_DATA);
		createEReference(writeDataEClass, WRITE_DATA__BASE_MESSAGE);
		createEReference(writeDataEClass, WRITE_DATA__NEW_DATA);
		createEReference(writeDataEClass, WRITE_DATA__MAX_TIME);
		createEOperation(writeDataEClass, WRITE_DATA___NO_EMPTY_WRITE_FIELDS__DIAGNOSTICCHAIN_MAP);
		createEOperation(writeDataEClass, WRITE_DATA___WRITE_DATA_TIMEUNIT_NOT_DAYS_OR_HOURS_OR_MINUTES__DIAGNOSTICCHAIN_MAP);

		accessInformationEClass = createEClass(ACCESS_INFORMATION);
		createEReference(accessInformationEClass, ACCESS_INFORMATION__BASE_MESSAGE);

		removeSPInLogEClass = createEClass(REMOVE_SP_IN_LOG);
		createEReference(removeSPInLogEClass, REMOVE_SP_IN_LOG__BASE_MESSAGE);

		infoEClass = createEClass(INFO);
		createEReference(infoEClass, INFO__BASE_MESSAGE);
		createEReference(infoEClass, INFO__MAX_TIME);
		createEReference(infoEClass, INFO__PROVIDER);
		createEReference(infoEClass, INFO__RECIPIENTS);

		trustedSCMEClass = createEClass(TRUSTED_SCM);

		untrustedSCMEClass = createEClass(UNTRUSTED_SCM);

		consentInfoEClass = createEClass(CONSENT_INFO);
		createEReference(consentInfoEClass, CONSENT_INFO__BASE_MESSAGE);
		createEAttribute(consentInfoEClass, CONSENT_INFO__PURPOSE);
		createEAttribute(consentInfoEClass, CONSENT_INFO__ACTION);
		createEReference(consentInfoEClass, CONSENT_INFO__TP);

		okEClass = createEClass(OK);
		createEReference(okEClass, OK__BASE_MESSAGE);
		createEAttribute(okEClass, OK__PURPOSE);
		createEAttribute(okEClass, OK__PERMISSION_TYPE);

		informationNotForFreeEClass = createEClass(INFORMATION_NOT_FOR_FREE);
		createEReference(informationNotForFreeEClass, INFORMATION_NOT_FOR_FREE__BASE_MESSAGE);
		createEAttribute(informationNotForFreeEClass, INFORMATION_NOT_FOR_FREE__PRICE);

		wantToAccessEClass = createEClass(WANT_TO_ACCESS);
		createEReference(wantToAccessEClass, WANT_TO_ACCESS__BASE_MESSAGE);

		reportDataDManagementForFreeEClass = createEClass(REPORT_DATA_DMANAGEMENT_FOR_FREE);
		createEReference(reportDataDManagementForFreeEClass, REPORT_DATA_DMANAGEMENT_FOR_FREE__BASE_MESSAGE);

		checkChangesEClass = createEClass(CHECK_CHANGES);
		createEReference(checkChangesEClass, CHECK_CHANGES__BASE_MESSAGE);

		spEClass = createEClass(SP);
		createEReference(spEClass, SP__BASE_MESSAGE);

		// Create enums
		bandwidthUnitEEnum = createEEnum(BANDWIDTH_UNIT);
		timeUnitEEnum = createEEnum(TIME_UNIT);
		sizeUnitEEnum = createEEnum(SIZE_UNIT);
		actionTypeEEnum = createEEnum(ACTION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		statelessAppCTPEClass.getESuperTypes().add(this.getPrincipal());
		storageEClass.getESuperTypes().add(this.getHardware());
		cpuEClass.getESuperTypes().add(this.getHardware());
		memoryEClass.getESuperTypes().add(this.getHardware());
		computingRackEClass.getESuperTypes().add(this.getRack());
		statelessComputationMachineEClass.getESuperTypes().add(this.getMachine());
		storageRackEClass.getESuperTypes().add(this.getRack());
		ssmProcessorEClass.getESuperTypes().add(this.getMachine());
		userEClass.getESuperTypes().add(this.getPrincipal());
		trustedSCMEClass.getESuperTypes().add(this.getStatelessComputationMachine());
		untrustedSCMEClass.getESuperTypes().add(this.getStatelessComputationMachine());

		// Initialize classes, features, and operations; add parameters
		initEClass(infrastructureEClass, Infrastructure.class, "Infrastructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructure_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInfrastructure_Network(), this.getBandwidth(), null, "network", null, 1, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInfrastructure_CloudProvider(), this.getControllerCP(), null, "cloudProvider", null, 1, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInfrastructure_Datacenterelements(), this.getDataCenterElement(), null, "datacenterelements", null, 1, -1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bandwidthEClass, Bandwidth.class, "Bandwidth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBandwidth_Value(), theTypesPackage.getReal(), "value", null, 1, 1, Bandwidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBandwidth_Unit(), this.getBandwidthUnit(), "unit", null, 1, 1, Bandwidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getBandwidth__Bandwidth_value_greater_than_0__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "bandwidth_value_greater_than_0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(controllerCPEClass, ControllerCP.class, "ControllerCP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerCP_Base_Lifeline(), theUMLPackage.getLifeline(), null, "base_Lifeline", null, 0, 1, ControllerCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getControllerCP_ResourceAllocationPolicy(), theTypesPackage.getString(), "resourceAllocationPolicy", null, 1, 1, ControllerCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getControllerCP_IdProvider(), theTypesPackage.getString(), "idProvider", null, 1, 1, ControllerCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getControllerCP_Sla(), this.getSLA(), null, "sla", null, 1, -1, ControllerCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getControllerCP_Accesslog(), this.getAccessLog(), null, "accesslog", null, 1, -1, ControllerCP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getControllerCP__NewLocation_machine_not_under_sla_with_controller__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "newLocation_machine_not_under_sla_with_controller", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControllerCP__Location1_machine_not_under_sla_with_controller__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "location1_machine_not_under_sla_with_controller", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControllerCP__SourceMachine_not_under_sla_with_controller__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sourceMachine_not_under_sla_with_controller", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(slaEClass, Model4DataCtrack.SLA.class, "SLA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSLA_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Model4DataCtrack.SLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSLA_SubjectMatter(), theTypesPackage.getString(), "subjectMatter", null, 1, -1, Model4DataCtrack.SLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSLA_ProcessingDuration(), this.getTime(), null, "processingDuration", null, 1, 1, Model4DataCtrack.SLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSLA_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, Model4DataCtrack.SLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSLA_Recipients(), this.getStatelessAppCTP(), null, "recipients", null, 1, -1, Model4DataCtrack.SLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSLA_ProcessingNature(), theTypesPackage.getString(), "processingNature", null, 1, -1, Model4DataCtrack.SLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSLA_ProcessingPurpose(), theTypesPackage.getString(), "processingPurpose", null, 1, -1, Model4DataCtrack.SLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSLA_ProcessingInstructions(), theTypesPackage.getString(), "processingInstructions", null, 1, -1, Model4DataCtrack.SLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Value(), theTypesPackage.getReal(), "value", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTime_Unit(), this.getTimeUnit(), "unit", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getTime__Time_value_greater_than_0__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "time_value_greater_than_0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(statelessAppCTPEClass, StatelessAppCTP.class, "StatelessAppCTP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(principalEClass, Principal.class, "Principal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrincipal_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, Principal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPrincipal_Base_Lifeline(), theUMLPackage.getLifeline(), null, "base_Lifeline", null, 0, 1, Principal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(accessLogEClass, AccessLog.class, "AccessLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessLog_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, AccessLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessLog_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, AccessLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessLog_Tp(), this.getStatelessAppCTP(), null, "tp", null, 1, 1, AccessLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessLog_L1(), this.getStorage(), null, "l1", null, 1, 1, AccessLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessLog_Sp1(), this.getStickyPolicy(), null, "sp1", null, 1, 1, AccessLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessLog_O(), this.getPList(), null, "O", null, 1, -1, AccessLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessLog_Action(), this.getActionType(), "action", null, 1, 1, AccessLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessLog_Nl(), this.getStorage(), null, "nl", null, 1, 1, AccessLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessLog_Nsp(), this.getStickyPolicy(), null, "nsp", null, 1, 1, AccessLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getAccessLog__Log_access_match_sp_access__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "log_access_match_sp_access", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(storageEClass, Storage.class, "Storage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorage_NumberOfDrivers(), theTypesPackage.getInteger(), "numberOfDrivers", null, 1, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStorage_DirveCapacity(), this.getSize(), null, "dirveCapacity", null, 1, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStorage_ReadBandwidth(), this.getBandwidth(), null, "readBandwidth", null, 1, 1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStorage_Data(), this.getData(), null, "data", null, 0, -1, Storage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStorage__NumberOfDrivers_greater_than_0__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "numberOfDrivers_greater_than_0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hardwareEClass, Hardware.class, "Hardware", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHardware_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, Hardware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sizeEClass, Size.class, "Size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSize_Value(), theTypesPackage.getReal(), "value", null, 1, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSize_Unit(), this.getSizeUnit(), "unit", null, 1, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSize__Size_value_greater_than_0__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "size_value_greater_than_0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getData_Archive(), this.getDataArchive(), null, "archive", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getData_AppliedPolicy(), this.getStickyPolicy(), null, "appliedPolicy", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getData_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataArchiveEClass, DataArchive.class, "DataArchive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataArchive_Contents(), this.getDataField(), null, "contents", null, 1, -1, DataArchive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataArchive_IdData(), theTypesPackage.getString(), "idData", null, 1, 1, DataArchive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataFieldEClass, DataField.class, "DataField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataField_Value(), theTypesPackage.getString(), "value", null, 1, 1, DataField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stickyPolicyEClass, StickyPolicy.class, "StickyPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStickyPolicy_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, StickyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStickyPolicy_Permission(), this.getPermissionPerTP(), null, "permission", null, 1, -1, StickyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStickyPolicy_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, StickyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStickyPolicy_Owner(), this.getPList(), null, "owner", null, 1, 1, StickyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStickyPolicy_Purpose(), theTypesPackage.getString(), "purpose", null, 1, -1, StickyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStickyPolicy_Controller(), this.getControllerCP(), null, "controller", null, 1, 1, StickyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStickyPolicy_AccessHistory(), this.getAccesPerTP(), null, "accessHistory", null, 0, -1, StickyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStickyPolicy__Allowed_access_purpose__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "allowed_access_purpose", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStickyPolicy__All_tps_in_history_given_permissions__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "all_tps_in_history_given_permissions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(permissionPerTPEClass, PermissionPerTP.class, "PermissionPerTP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPermissionPerTP_S(), this.getPList(), null, "S", null, 1, -1, PermissionPerTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPermissionPerTP_I(), this.getPList(), null, "I", null, 1, -1, PermissionPerTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pListEClass, PList.class, "PList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPList_List(), this.getPrincipal(), null, "list", null, 1, -1, PList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(accesPerTPEClass, AccesPerTP.class, "AccesPerTP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccesPerTP_Tp(), this.getStatelessAppCTP(), null, "tp", null, 1, 1, AccesPerTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccesPerTP_ActionPerformed(), this.getActionType(), "actionPerformed", null, 1, 1, AccesPerTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccesPerTP_Purpose(), theTypesPackage.getString(), "purpose", null, 1, -1, AccesPerTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataCenterElementEClass, DataCenterElement.class, "DataCenterElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataCenterElement_NumberOfDataCenters(), theTypesPackage.getInteger(), "numberOfDataCenters", null, 1, 1, DataCenterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataCenterElement_DataCenterType(), this.getDataCenter(), null, "dataCenterType", null, 1, 1, DataCenterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDataCenterElement__No_empty_infra__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "no_empty_infra", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataCenterEClass, DataCenter.class, "DataCenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataCenter_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataCenter_Network(), this.getBandwidth(), null, "network", null, 1, 1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataCenter_Rack(), this.getRackElement(), null, "rack", null, 1, -1, DataCenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rackElementEClass, RackElement.class, "RackElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRackElement_NumberOfRacks(), theTypesPackage.getInteger(), "numberOfRacks", null, 1, 1, RackElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRackElement_RackType(), this.getRack(), null, "rackType", null, 1, 1, RackElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRackElement__No_empty_datacenters__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "no_empty_datacenters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rackEClass, Rack.class, "Rack", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRack_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, Rack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRack_MachinesPerBoard(), theTypesPackage.getInteger(), "machinesPerBoard", null, 1, 1, Rack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRack_Network(), this.getBandwidth(), null, "network", null, 1, 1, Rack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRack_Boards(), theTypesPackage.getInteger(), "boards", null, 1, 1, Rack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRack__No_empty_racks__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "no_empty_racks", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(machineEClass, Machine.class, "Machine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMachine_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMachine_Cpu(), this.getCPU(), null, "cpu", null, 1, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMachine_Memory(), this.getMemory(), null, "memory", null, 1, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMachine_Storage(), this.getStorage(), null, "storage", null, 1, 1, Machine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cpuEClass, Model4DataCtrack.CPU.class, "CPU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCPU_Cores(), theTypesPackage.getInteger(), "cores", null, 1, 1, Model4DataCtrack.CPU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCPU_FLOPs(), theTypesPackage.getReal(), "FLOPs", "0.0", 1, 1, Model4DataCtrack.CPU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCPU__Cpu_cores_and_flops_greater_than_0__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "cpu_cores_and_flops_greater_than_0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(memoryEClass, Memory.class, "Memory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemory_Capacity(), this.getSize(), null, "capacity", null, 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMemory_Latency(), this.getLatency(), null, "latency", null, 1, 1, Memory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(latencyEClass, Latency.class, "Latency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLatency_Name(), theTypesPackage.getString(), "name", null, 1, 1, Latency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLatency_Time(), this.getTime(), null, "time", null, 1, 1, Latency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getLatency__Latency_not_in_us_or_ns__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "latency_not_in_us_or_ns", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLatency__Latency_name_not_empty__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "latency_name_not_empty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(computingRackEClass, ComputingRack.class, "ComputingRack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputingRack_MachineType(), this.getStatelessComputationMachine(), null, "machineType", null, 1, 1, ComputingRack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(statelessComputationMachineEClass, StatelessComputationMachine.class, "StatelessComputationMachine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatelessComputationMachine_Applications(), this.getStatelessAppCTP(), null, "applications", null, 0, -1, StatelessComputationMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStatelessComputationMachine_Purpose(), theTypesPackage.getString(), "purpose", null, 1, 1, StatelessComputationMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(storageRackEClass, StorageRack.class, "StorageRack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStorageRack_MachineType(), this.getSSMProcessor(), null, "machineType", null, 1, 1, StorageRack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ssmProcessorEClass, SSMProcessor.class, "SSMProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSSMProcessor_Base_Lifeline(), theUMLPackage.getLifeline(), null, "base_Lifeline", null, 0, 1, SSMProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSSMProcessor_Sla(), this.getSLA(), null, "sla", null, 1, -1, SSMProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSSMProcessor_GDPRCompliance(), theTypesPackage.getBoolean(), "GDPRCompliance", "true", 1, 1, SSMProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSSMProcessor__SSMProccessor_complies_GDPR__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "SSMProccessor_complies_GDPR", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Instances(), theTypesPackage.getInteger(), "instances", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_IdUser(), theTypesPackage.getString(), "idUser", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sendDataEClass, sendData.class, "sendData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getsendData_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, sendData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getsendData_MaxTime(), this.getTime(), null, "maxTime", null, 1, 1, sendData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getsendData_Data(), this.getData(), null, "data", null, 1, 1, sendData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getsendData__SendData_timeunit_not_days_or_hours_or_minutes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sendData_timeunit_not_days_or_hours_or_minutes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getsendData__SendData_maxTime_value_greater_than_0__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sendData_maxTime_value_greater_than_0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(newRestrictionsEClass, newRestrictions.class, "newRestrictions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getnewRestrictions_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, newRestrictions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getnewRestrictions_Data(), this.getData(), null, "data", null, 1, 1, newRestrictions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getnewRestrictions_NewSP(), this.getStickyPolicy(), null, "newSP", null, 1, 1, newRestrictions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rectifyDataEClass, rectifyData.class, "rectifyData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getrectifyData_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, rectifyData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getrectifyData_Data(), this.getData(), null, "data", null, 1, 1, rectifyData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getrectifyData_NewData(), this.getDataField(), null, "newData", null, 1, -1, rectifyData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getrectifyData__No_empty_rectify_fields__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "no_empty_rectify_fields", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(removeDataEClass, removeData.class, "removeData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getremoveData_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, removeData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getremoveData_Data(), this.getData(), null, "data", null, 1, 1, removeData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eraseDataEClass, eraseData.class, "eraseData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(geteraseData_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, eraseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(geteraseData_Data(), this.getData(), null, "data", null, 1, 1, eraseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(geteraseData_Machines(), this.getSSMProcessor(), null, "machines", null, 1, -1, eraseData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(geteraseData__Machine_contains_data_to_erase__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "machine_contains_data_to_erase", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(geteraseData__EraseData_destination_machines_comply_with_GDPR__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "eraseData_destination_machines_comply_with_GDPR", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(consentEClass, consent.class, "consent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getconsent_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, consent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getconsent_Data(), this.getData(), null, "data", null, 1, 1, consent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getconsent_Action(), this.getActionType(), "action", null, 1, 1, consent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getconsent_Purpose(), theTypesPackage.getString(), "purpose", null, 1, -1, consent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getconsent__Consent_machine_complies_with_GDPR__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "consent_machine_complies_with_GDPR", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(askAuthenticationEClass, askAuthentication.class, "askAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getaskAuthentication_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, askAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tpEClass, tp.class, "tp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(gettp_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, tp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(gettp_Tp(), this.getStatelessAppCTP(), null, "tp", null, 1, 1, tp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(readDataEClass, readData.class, "readData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getreadData_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, readData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(permissionEClass, permission.class, "permission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getpermission_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getpermission_Purpose(), theTypesPackage.getString(), "purpose", null, 1, -1, permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getpermission_PermissionType(), this.getActionType(), "permissionType", null, 1, 1, permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getpermission__No_access_permission_given_without_user_consent__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "no_access_permission_given_without_user_consent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(notifyEClass, notify.class, "notify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getnotify_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, notify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getnotify_Data(), this.getData(), null, "data", null, 1, 1, notify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getnotify_Machines(), this.getSSMProcessor(), null, "machines", null, 1, -1, notify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getnotify_Breaches(), theTypesPackage.getString(), "breaches", null, 1, -1, notify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getnotify__Notify_destination_machines_comply_with_GDPR__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "notify_destination_machines_comply_with_GDPR", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(upDateEClass, upDate.class, "upDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getupDate_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, upDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getupDate_Data(), this.getData(), null, "data", null, 1, 1, upDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getupDate_Machines(), this.getSSMProcessor(), null, "machines", null, 1, -1, upDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getupDate_NewSP(), this.getStickyPolicy(), null, "newSP", null, 1, 1, upDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getupDate__Machine_contains_data_to_update__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "machine_contains_data_to_update", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getupDate__UpDate_destination_machines_comply_with_GDPR__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "upDate_destination_machines_comply_with_GDPR", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(newDataEClass, newData.class, "newData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getnewData_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, newData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getnewData_Data(), this.getData(), null, "data", null, 1, 1, newData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getnewData_Machines(), this.getSSMProcessor(), null, "machines", null, 1, -1, newData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getnewData_NewData(), this.getDataField(), null, "newData", null, 1, -1, newData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getnewData__No_empty_newData_fields__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "no_empty_newData_fields", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnewData__Machine_contains_data_to_rectify__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "machine_contains_data_to_rectify", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getnewData__NewData_destination_machines_comply_with_GDPR__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "newData_destination_machines_comply_with_GDPR", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(askDataInformationEClass, askDataInformation.class, "askDataInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getaskDataInformation_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, askDataInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getaskDataInformation_User(), this.getUser(), null, "user", null, 1, 1, askDataInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reportDataManagementEClass, reportDataManagement.class, "reportDataManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getreportDataManagement_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, reportDataManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subscribeEClass, subscribe.class, "subscribe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getsubscribe_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, subscribe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getsubscribe_Data(), this.getData(), null, "data", null, 1, 1, subscribe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getsubscribe_Machines(), this.getSSMProcessor(), null, "machines", null, 1, 1, subscribe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getsubscribe_Breaches(), theTypesPackage.getString(), "breaches", null, 1, -1, subscribe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getsubscribe_MaxSubscriptionTime(), this.getTime(), null, "maxSubscriptionTime", null, 1, 1, subscribe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getsubscribe__MaxSubTime_greater_than_0__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "maxSubTime_greater_than_0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getsubscribe__Machine_contains_data_to_subscribe_to__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "machine_contains_data_to_subscribe_to", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getsubscribe__Subscribe_destination_machines_comply_with_GDPR__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "subscribe_destination_machines_comply_with_GDPR", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(informBreachesEClass, informBreaches.class, "informBreaches", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getinformBreaches_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, informBreaches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeoutSubscriptionEClass, timeoutSubscription.class, "timeoutSubscription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(gettimeoutSubscription_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, timeoutSubscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(writeDataEClass, writeData.class, "writeData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getwriteData_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, writeData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getwriteData_NewData(), this.getDataField(), null, "newData", null, 1, -1, writeData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getwriteData_MaxTime(), this.getTime(), null, "maxTime", null, 1, 1, writeData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getwriteData__No_empty_write_fields__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "no_empty_write_fields", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getwriteData__WriteData_timeunit_not_days_or_hours_or_minutes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "writeData_timeunit_not_days_or_hours_or_minutes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(accessInformationEClass, accessInformation.class, "accessInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getaccessInformation_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, accessInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(removeSPInLogEClass, removeSPInLog.class, "removeSPInLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getremoveSPInLog_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, removeSPInLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(infoEClass, Info.class, "Info", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfo_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInfo_MaxTime(), this.getTime(), null, "maxTime", null, 1, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInfo_Provider(), this.getControllerCP(), null, "provider", null, 1, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInfo_Recipients(), this.getStatelessAppCTP(), null, "recipients", null, 0, -1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trustedSCMEClass, TrustedSCM.class, "TrustedSCM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(untrustedSCMEClass, UntrustedSCM.class, "UntrustedSCM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(consentInfoEClass, consentInfo.class, "consentInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getconsentInfo_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, consentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getconsentInfo_Purpose(), theTypesPackage.getString(), "purpose", null, 1, -1, consentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getconsentInfo_Action(), this.getActionType(), "action", null, 1, 1, consentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getconsentInfo_Tp(), this.getStatelessAppCTP(), null, "tp", null, 1, 1, consentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(okEClass, ok.class, "ok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getok_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, ok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getok_Purpose(), theTypesPackage.getString(), "purpose", null, 1, -1, ok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getok_PermissionType(), this.getActionType(), "permissionType", null, 1, 1, ok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(informationNotForFreeEClass, informationNotForFree.class, "informationNotForFree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getinformationNotForFree_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, informationNotForFree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getinformationNotForFree_Price(), theTypesPackage.getReal(), "price", null, 1, 1, informationNotForFree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(wantToAccessEClass, wantToAccess.class, "wantToAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getwantToAccess_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, wantToAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reportDataDManagementForFreeEClass, reportDataDManagementForFree.class, "reportDataDManagementForFree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getreportDataDManagementForFree_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, reportDataDManagementForFree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(checkChangesEClass, checkChanges.class, "checkChanges", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getcheckChanges_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, checkChanges.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(spEClass, Model4DataCtrack.SP.class, "SP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSP_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, Model4DataCtrack.SP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bandwidthUnitEEnum, BandwidthUnit.class, "BandwidthUnit");
		addEEnumLiteral(bandwidthUnitEEnum, BandwidthUnit.KBPS);
		addEEnumLiteral(bandwidthUnitEEnum, BandwidthUnit.MBPS);
		addEEnumLiteral(bandwidthUnitEEnum, BandwidthUnit.GBPS);

		initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
		addEEnumLiteral(timeUnitEEnum, TimeUnit.H);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MIN);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.S);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MS);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.US);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.NS);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.DAYS);

		initEEnum(sizeUnitEEnum, SizeUnit.class, "SizeUnit");
		addEEnumLiteral(sizeUnitEEnum, SizeUnit.KBYTE);
		addEEnumLiteral(sizeUnitEEnum, SizeUnit.MBYTE);
		addEEnumLiteral(sizeUnitEEnum, SizeUnit.GBYTE);
		addEEnumLiteral(sizeUnitEEnum, SizeUnit.TBYTE);

		initEEnum(actionTypeEEnum, ActionType.class, "ActionType");
		addEEnumLiteral(actionTypeEEnum, ActionType.READ);
		addEEnumLiteral(actionTypeEEnum, ActionType.WRITE);

		// Create resource
		createResource(eNS_URI);
	}

} //Model4DataCtrackPackageImpl
