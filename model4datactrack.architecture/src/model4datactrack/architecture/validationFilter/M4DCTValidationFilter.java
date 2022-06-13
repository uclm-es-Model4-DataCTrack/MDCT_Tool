package model4datactrack.architecture.validationFilter;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.papyrus.uml.service.validation.api.AbstractPapyrusValidationFilter;

public class M4DCTValidationFilter extends AbstractPapyrusValidationFilter{
	
	@Override
	public List<String> getExpectedValidationContext() {
	List<String> architectureContext = new ArrayList<String>();
	architectureContext.add("model4datactrack.architecture.command.m4dctdsml");
	return architectureContext;
	}

}