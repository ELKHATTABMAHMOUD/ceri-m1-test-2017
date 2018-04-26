package fr.univavignon.rodeo.implementation;



import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.* ; 
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;
import fr.univavignon.rodeo.api.IEnvironmentProviderTest;
import fr.univavignon.rodeo.api.IEnvironmentTest;

public class EnvironmentProviderTest extends IEnvironmentProviderTest {
	
	
	@Override
	public IEnvironmentProvider getEnvironmentProviderInstance() {
		List<IEnvironment> environments = new ArrayList<IEnvironment>(1);
		environments.add(IEnvironmentTest.getEnvironmentMock());
		
		return new EnvironmentProvider(environments) ;
	}
	

}
