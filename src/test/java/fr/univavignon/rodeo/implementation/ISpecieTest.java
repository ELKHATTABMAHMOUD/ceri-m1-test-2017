package fr.univavignon.rodeo.implementation;



import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.* ; 
import org.mockito.Mockito;
import org.mockito.Mock ;

import fr.univavignon.rodeo.api.*;



public class ISpecieTest {

	public static ISpecie getSpecieInstance() {
		//I should create a mock for IAnimal 
		return Mockito.mock(ISpecie.class);
	}
	
	@Test 
	public void testGetArea() {
		ISpecie Ispecie = getSpecieInstance();
		Mockito.when(Ispecie.getArea()).thenReturn(2);
		assertEquals(Ispecie.getArea(), 2);
	}
	
	@Test 
	public void testGetAnimals() {
		ISpecie Ispecie = getSpecieInstance();
		
		IAnimal IAnimal = IAnimalTest.getAnimalInstance();   
		List<IAnimal> animals = new ArrayList<IAnimal>(1);
		animals.add(IAnimal);
		Mockito.when(Ispecie.getAnimals()).thenReturn(animals);
		assertEquals(Ispecie.getAnimals(), animals);
	}
}
