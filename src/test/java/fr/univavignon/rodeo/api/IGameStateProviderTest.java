package fr.univavignon.rodeo.api;



import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.* ; 
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;



public class IGameStateProviderTest {
	
	private static IGameState	iGameState = IGameStateTest.getGameStateInstance();
	private static IGameStateProvider	iGameStateProvider ;
	
	public static IGameStateProvider getGameStateProviderMock() {
		//I should create a mock for IAnimal 
		IGameStateProvider iGameStateProvider = Mockito.mock(IGameStateProvider.class);
		Mockito.doThrow(new IllegalArgumentException("The argument is null"))
        .when(iGameStateProvider).get(null);
		Mockito.when(iGameStateProvider.get("gameState1")).thenReturn(iGameState);
		
		return iGameStateProvider ;
	}
	public static IGameStateProvider getGameStateProviderInstance() {
		return getGameStateProviderMock();
	}
	
	@Test(expected = IllegalArgumentException.class) 
	public void testGet() {
		
		iGameStateProvider = getGameStateProviderInstance();
		iGameStateProvider.get(null);		
		assertEquals(iGameStateProvider.get("gameState1"), iGameState);
	}

}
