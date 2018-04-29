package fr.univavignon.rodeo.api;



import static org.junit.Assert.*;
import org.junit.* ; 
import org.mockito.Mockito;
import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;

/**
 * 
 * @author EL-KHATTAB MAHMOUD
 *
 */

public class IGameStateTest {
	
	private static IGameState iGameState ; 
	private static IAnimal animal = IAnimalTest.getAnimalInstance();

	public static IGameState getGameStateMock() {
		//I should create a mock for IAnimal 
		IGameState iGameState = Mockito.mock(IGameState.class);
		
		Mockito.doThrow(new IllegalStateException("The area cannot be explored"))
        .when(iGameState).exploreArea();
		
		Mockito.doThrow(new IllegalArgumentException("The argument is null"))
		.when(iGameState).catchAnimal(null);
		
		
		Mockito.doThrow(new IllegalStateException("animal can not be found in current areas"))
        					.when(iGameState).catchAnimal(animal);
		
		Mockito.doThrow(new IllegalArgumentException("The argument is null"))
        .when(iGameState).getSpecieLevel(null);
		
		Mockito.when(iGameState.getProgression()).thenReturn(10);
		
		return iGameState ;
	}
	
	public IGameState getGameStateInstance() {
		return getGameStateMock();
	}
	
	@Test(expected = IllegalStateException.class)
	public void testExploreArea() {
		
		iGameState = getGameStateInstance();
		iGameState.exploreArea();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCatchAnimalIllegalArgument() {
		
		iGameState = getGameStateInstance();
		iGameState.catchAnimal(null);
		
	}
	
	@Test(expected = IllegalStateException.class)
	public void testCatchAnimalIllegalState() {
		
		iGameState = getGameStateInstance();
		iGameState.catchAnimal(animal);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetSpecieLevel() {
		iGameState = getGameStateInstance();
		iGameState.getSpecieLevel(null);
	}
	
	@Test
	public void testgetProgression(){	
		iGameState = getGameStateInstance();
		assertEquals(iGameState.getProgression(), 10);
	}
	
}
