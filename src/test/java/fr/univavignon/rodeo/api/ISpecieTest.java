package fr.univavignon.rodeo.api;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.* ; 
import org.mockito.Mockito;


public class ISpecieTest {

	public static ISpecie getSpecieMock() {
		
		ISpecie iSpecie = Mockito.mock(ISpecie.class);
		IAnimal IAnimal = IAnimalTest.getAnimalInstance();  
		List<IAnimal> animals = new ArrayList<IAnimal>(1);
		animals.add(IAnimal);
		Mockito.when(iSpecie.getAnimals()).thenReturn(animals);
		Mockito.when(iSpecie.getArea()).thenReturn(2);
		
		return iSpecie ; 
	}
	
	public ISpecie getSpecieInstance() {
		return getSpecieMock() ;
	}
	
	@Test 
	public void testGetArea() {
		ISpecie iSpecie = getSpecieInstance();
		assertEquals(iSpecie.getArea(), 2);
	}
	
	@Test 
	public void testGetAnimals() {
		ISpecie iSpecie = getSpecieInstance();
		
		IAnimal iAnimal = IAnimalTest.getAnimalInstance();   
		List<IAnimal> animals = new ArrayList<IAnimal>(1);
		animals.add(iAnimal);
		
		assertEquals(iSpecie.getAnimals().get(0).getName(), animals.get(0).getName());
		assertEquals(iSpecie.getAnimals().get(0).getXP(), animals.get(0).getXP());
	}
}
