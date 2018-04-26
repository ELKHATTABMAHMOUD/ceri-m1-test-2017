package fr.univavignon.rodeo.api;



import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.* ; 
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class IEnvironmentProviderTest {
	
	
	
	public static IEnvironmentProvider getIEnvironmentProviderInstance() {
		
		IEnvironmentProvider iEnvProvider = Mockito.mock(IEnvironmentProvider.class);
		IEnvironment iEnvironment = IEnvironmentTest.getEnvironmentInstance();
		
		Mockito.when(iEnvProvider.getEnvironment("")).thenReturn(null);
		Mockito.when(iEnvProvider.getEnvironment("environment 1")).thenReturn(iEnvironment);
		
		List<String> list = new ArrayList<String>(2);
		list.add("Environnment1");
		list.add("Environnment2");
		Mockito.when(iEnvProvider.getAvailableEnvironments()).thenReturn(list);
		
		Mockito.doThrow(new IllegalArgumentException("The area cannot be explored")).when(iEnvProvider).getEnvironment(null);
		
		return iEnvProvider ;
	}
	
	@Test 
	public void getAvailableEnvironmentsTest() {
		IEnvironmentProvider iEnvProvider = getIEnvironmentProviderInstance();
		List<String> list = new ArrayList<String>(2);
		list.add("Environnment1");
		list.add("Environnment2");
		assertEquals(iEnvProvider.getAvailableEnvironments(), list);
		
	}
	
	@Test 
	public void testGetEnvironment() {
		
		IEnvironmentProvider iEnvProvider = getIEnvironmentProviderInstance();
		assertEquals(iEnvProvider.getEnvironment(""), null);
		IEnvironment IEnvironment = IEnvironmentTest.getEnvironmentInstance();
		assertEquals(iEnvProvider.getEnvironment("environment 1").getName(), IEnvironment.getName());
		
	}
	
	/**
	 * Test in case of providing a null parameter to retrieve an environment
	 * in this case an IllegalArgumentException is thrown
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetEnvironmentException() {
		IEnvironmentProvider iEnvProvider = getIEnvironmentProviderInstance();
		iEnvProvider.getEnvironment(null);
	}

}
