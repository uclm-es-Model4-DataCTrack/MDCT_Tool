package model4datactrack.architecture;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.uml.diagram.common.commands.ModelCreationCommandBase;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;


public class M4DCTModelCreationCommand extends ModelCreationCommandBase{


	@Override
	protected EObject createRootElement() {
		return UMLFactory.eINSTANCE.createModel();
	}

	
	@Override
	protected void initializeModel(EObject owner) {
		super.initializeModel(owner);
		Package packageOwner = (Package) owner;
		// Retrieve model4datactrack profile and apply it
		Profile m4dctProfile = (Profile) PackageUtil.loadPackage(URI.createURI("pathmap://MODEL4DATACTRACK_PROFILE/model4datactrack.profile.uml"), owner.eResource().getResourceSet());
		if (m4dctProfile != null) {
			PackageUtil.applyProfile(packageOwner, m4dctProfile, true);
		}
	}

	
}

