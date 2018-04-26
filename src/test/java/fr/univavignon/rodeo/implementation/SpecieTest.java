package fr.univavignon.rodeo.implementation;



import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.* ; 
import org.mockito.Mock;
import org.mockito.Mockito;


import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IAnimalTest;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.implementation.Animal;



public class SpecieTest {
	
	
	private Specie specie ; 
	/**
	 * this method provides a mock instance of IAnimal and it will
	 * be used in every method to create an IAnimal instance 
	 */
	@Before
	public void getSpecieInstance() {
		
		
		Animal animal1 = new Animal("animal1",2,true,false,true);
		Animal animal2 = new Animal("animal1",4,false,true,false);
		List<IAnimal> animals = new ArrayList<IAnimal>(2);
		animals.add(animal1);
		animals.add(animal2);
		Mockito.when(specie.getAnimals()).thenReturn(animals);
		
	}

	//Then create a testMethod for every IAnimal's method. 
	
	@Test 
	public void testGetArea() {
		assertEquals(specie.getArea(), 2);
	}
	
	@Test 
	public void testGetAnimals() {  
	//	assertEquals(specie.getAnimals(), animals);
	}
	

}
