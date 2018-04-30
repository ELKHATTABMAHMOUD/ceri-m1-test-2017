package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;
import fr.univavignon.rodeo.api.IAnimal;

/**
 * 
 * @author EL-KHATTAB MAHMOUD
 *
 */
public class IAnimalTest {
	
	
	/**
	 * this method provides a mock instance of IAnimal and it will
	 * be used in every method to create an IAnimal instance 
	 */

	public static IAnimal getAnimalMock() {
		//I should create a mock for IAnimal 
		IAnimal iAnimal = Mockito.mock(IAnimal.class); 
		
		Mockito.when(iAnimal.getXP()).thenReturn(2);
		Mockito.when(iAnimal.isSecret()).thenReturn(true);
		Mockito.when(iAnimal.isEndangered()).thenReturn(false);	
		Mockito.when(iAnimal.isBoss()).thenReturn(true);
		
		return iAnimal ;   
		
	}

	//Then create a testMethod for every IAnimal's method. 
	public static IAnimal getAnimalInstance() {
		return getAnimalMock();
	}
	
	@Test
	public void testGetXP(){
		IAnimal iAnimal = getAnimalInstance();
		assertEquals(iAnimal.getXP(), 2);
	}
	
	@Test
	public void testIsSecret(){
		IAnimal iAnimal = getAnimalInstance();
		assertEquals(iAnimal.isSecret(), true);
	}
	
	@Test
	public void testIsEndangered(){
		IAnimal iAnimal = getAnimalInstance();
		
		assertEquals(iAnimal.isEndangered(), false);
	}
	
	@Test
	public void testIsBoss(){
		IAnimal iAnimal = getAnimalInstance();
		assertEquals(iAnimal.isBoss(), true);
	}
	

}
