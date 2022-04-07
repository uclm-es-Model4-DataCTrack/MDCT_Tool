/**
 */
package Model4DataCtrack;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model4DataCtrack.CPU#getCores <em>Cores</em>}</li>
 *   <li>{@link Model4DataCtrack.CPU#getFLOPs <em>FLO Ps</em>}</li>
 * </ul>
 *
 * @see Model4DataCtrack.Model4DataCtrackPackage#getCPU()
 * @model
 * @generated
 */
public interface CPU extends Hardware {
	/**
	 * Returns the value of the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cores</em>' attribute.
	 * @see #setCores(int)
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getCPU_Cores()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCores();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.CPU#getCores <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cores</em>' attribute.
	 * @see #getCores()
	 * @generated
	 */
	void setCores(int value);

	/**
	 * Returns the value of the '<em><b>FLO Ps</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FLO Ps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FLO Ps</em>' attribute.
	 * @see #setFLOPs(double)
	 * @see Model4DataCtrack.Model4DataCtrackPackage#getCPU_FLOPs()
	 * @model default="0.0" dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getFLOPs();

	/**
	 * Sets the value of the '{@link Model4DataCtrack.CPU#getFLOPs <em>FLO Ps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FLO Ps</em>' attribute.
	 * @see #getFLOPs()
	 * @generated
	 */
	void setFLOPs(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.cores>0 and self.FLOPs>0.0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean cpu_cores_and_flops_greater_than_0(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CPU
