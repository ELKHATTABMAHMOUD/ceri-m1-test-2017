package fr.univavignon.rodeo.implementation;



import static org.junit.Assert.*;
import org.junit.* ; 
import org.mockito.Mock;
import org.mockito.Mockito;


import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IAnimalTest;
import fr.univavignon.rodeo.api.INamedObjectTest;
import fr.univavignon.rodeo.implementation.Animal;



public class AnimalTest extends IAnimalTest {
	
	/**
	 * this method provides a mock instance of IAnimal and it will
	 * be used in every method to create an IAnimal instance 
	 */
	
	public static IAnimal getAnimalInstance() {
		IAnimal animal = new Animal("taureau",2,true,false,true);
		return animal ;
	}
	
	@Test
	public void testGetXP(){
		IAnimal animal = getAnimalInstance();
		assertEquals(animal.getXP(), 2);
	}
	
	@Test
	public void testIsSecret(){
		IAnimal animal = getAnimalInstance();
		assertEquals(animal.isSecret(), true);
	}
	
	@Test
	public void testIsEndangered(){
		IAnimal animal = getAnimalInstance();
		assertEquals(animal.isEndangered(), false);
	}
	
	@Test
	public void testIsBoss(){
		IAnimal animal = getAnimalInstance();
		assertEquals(animal.isBoss(), true);
	}
	

}
