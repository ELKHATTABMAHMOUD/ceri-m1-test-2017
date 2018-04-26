package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class EnvironmentProvider implements IEnvironmentProvider {

	private List<Environment> environments ; 
	public EnvironmentProvider() {
		this.environments = new ArrayList<Environment>(10);
	}
	public List<String> getAvailableEnvironments() {
		// TODO Auto-generated method stub
		ArrayList<String> envirs = new ArrayList<String>(10);
		for(Environment envir : environments) {
			envirs.add(envir.getName());
		}
		return envirs;
	}

	public IEnvironment getEnvironment(String name)
			throws IllegalArgumentException {
		
		// TODO Auto-generated method stub
		if(name.equals(null))
			throw new IllegalArgumentException();
		
		for(Environment environment : environments) {
			if(environment.getName().equals(name))
				return environment;
		}
		return null;
	}

}
