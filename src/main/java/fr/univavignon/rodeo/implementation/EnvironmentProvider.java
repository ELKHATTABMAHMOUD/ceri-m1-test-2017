package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

/**
 * 
 * @author EL-KHATTAB MAHMOUD
 *
 */
public class EnvironmentProvider implements IEnvironmentProvider {

	
	private List<IEnvironment> environments ; 
	
	public EnvironmentProvider(List<IEnvironment> environments) {
		this.environments = environments ;
	}
	public List<String> getAvailableEnvironments() {
		// TODO Auto-generated method stub
		ArrayList<String> environments = new ArrayList<String>(10);
		for(IEnvironment environment : this.environments) {
			environments.add(environment.getName());
		}
		return environments;
	}

	public IEnvironment getEnvironment(String name)
			throws IllegalArgumentException {
		
		// TODO Auto-generated method stub
		if(name == null)
			throw new IllegalArgumentException();
		
		for(IEnvironment environment : this.environments) {
			if(environment.getName().equals(name))
				return environment;
		}
		return null;
	}

}
