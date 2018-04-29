package fr.univavignon.rodeo.implementation;


import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateTest;

/**
 * 
 * @author EL-KHATTAB MAHMOUD
 *
 */
public class GameStateTest extends IGameStateTest {
	
	/**
	 * This method provides an instance of Specie and
	 * it will be used in every method to get a Specie
	 *  instance for testing Specie's methods 
	 */
	
	@Override
	public IGameState getGameStateInstance() {
		
		IGameState iGameState = new GameState("gameState1");

		return iGameState ;
		
	}

}
