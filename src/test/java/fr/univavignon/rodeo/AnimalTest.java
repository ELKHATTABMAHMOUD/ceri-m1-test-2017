package fr.univavignon.rodeo;



import static org.junit.Assert.*;
import org.junit.* ; 
import org.mockito.Mock;
import org.mockito.Mockito;


import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.implementation.Animal;



public class AnimalTest {
	
	
	private Animal animal ; 
	/**
	 * this method provides a mock instance of IAnimal and it will
	 * be used in every method to create an IAnimal instance 
	 */
	@Before
	public void getAnimalInstance() {
		animal = new Animal("animal1",2,true,false,true);
	}

	//Then create a testMethod for every IAnimal's method. 
	
	@Test
	public void testGetXP(){
		assertEquals(animal.getXP(), 2);
	}
	
	@Test
	public void testIsSecret(){
		assertEquals(animal.isSecret(), true);
	}
	
	@Test
	public void testIsEndangered(){
		assertEquals(animal.isEndangered(), false);
	}
	
	@Test
	public void testIsBoss(){
		assertEquals(animal.isBoss(), true);
	}
	

}
