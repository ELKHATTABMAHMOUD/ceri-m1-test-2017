package fr.univavignon.rodeo.api;



import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.* ; 
import org.mockito.Mockito;
import fr.univavignon.rodeo.api.*;



public class IEnvironmentTest {
	
	public static IEnvironment getEnvironmentMock() {
		//I should create a mock for IAnimal 
		IEnvironment iEnvir = Mockito.mock(IEnvironment.class) ;
		
		Mockito.when(iEnvir.getAreas()).thenReturn(2);
		
		List<ISpecie> ispecies = new ArrayList<ISpecie>(2);
		ispecies.add(ISpecieTest.getSpecieInstance());
		ispecies.add(ISpecieTest.getSpecieInstance());
		
		Mockito.when(iEnvir.getSpecies()).thenReturn(ispecies);
		
		return iEnvir;
		
	}
	public static IEnvironment getEnvironmentInstance() {
		return getEnvironmentMock();
	}
	@Test 
	public void testGetAreas() {
		IEnvironment IEnvironment =  getEnvironmentInstance(); 
		assertEquals(IEnvironment.getAreas(), 2);
	}

	@Test 
	public void testGetSpecies() {
		IEnvironment iEnvironment = getEnvironmentInstance();

		List<ISpecie> iSpecies = new ArrayList<ISpecie>(2);
		iSpecies.add(ISpecieTest.getSpecieInstance());
		iSpecies.add(ISpecieTest.getSpecieInstance());
		
		assertEquals(iEnvironment.getSpecies().size(), iSpecies.size());
		for(int i=0 ; i< 2 ; i++) {
			assertEquals(iEnvironment.getSpecies().get(i).getName(), iSpecies.get(i).getName());
			assertEquals(iEnvironment.getSpecies().get(i).getArea(), iSpecies.get(i).getArea());
		}
		
	}
}
