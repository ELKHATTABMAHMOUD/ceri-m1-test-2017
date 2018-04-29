package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IGameStateProvider;
import fr.univavignon.rodeo.api.IGameStateProviderTest;


/**
 * 
 * @author EL-KHATTAB MAHMOUD
 *
 */
public class GameStateProviderTest extends IGameStateProviderTest {
	
	/**
	 * This method provides an instance of Specie and
	 * it will be used in every method to get a Specie
	 *  instance for testing Specie's methods 
	 */
	
	@Override
	public IGameStateProvider getGameStateProviderInstance() {
		IGameStateProvider gameStateProvider = new GameStateProvider();
		return gameStateProvider ;
		
	}

}
