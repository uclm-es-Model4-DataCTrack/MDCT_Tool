/**
 */
package Model4DataCtrack.impl;

import Model4DataCtrack.Model4DataCtrackPackage;
import Model4DataCtrack.StatelessAppCTP;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stateless App CTP</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StatelessAppCTPImpl extends PrincipalImpl implements StatelessAppCTP {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatelessAppCTPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Model4DataCtrackPackage.Literals.STATELESS_APP_CTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if(this.getBase_Component() != null) {
			return this.getBase_Component().getName();
		}else {
			return this.getBase_Lifeline().getName();
		}
	}

} //StatelessAppCTPImpl
