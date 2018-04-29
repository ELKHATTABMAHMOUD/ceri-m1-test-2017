package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;

/**
 * 
 * @author EL-KHATTAB MAHMOUD
 *
 */
public class GameStateProvider implements IGameStateProvider {

	private List<IGameState> gameStates ; 
	
	public GameStateProvider() {
		// TODO Auto-generated constructor stub
		gameStates = new ArrayList<IGameState>();
	}

	public void save(IGameState gameState) {
		// TODO Auto-generated method stub
		if(gameState!=null)
			this.gameStates.add(gameState);
	}

	public IGameState get(String name) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if(name == null)
			throw new IllegalArgumentException("the given gameState's name is null") ;
		else {
			for(IGameState gameState : gameStates) {
				if(gameState.getName().equals(name))
					return gameState;
			}
		}
		
		return new GameState("myGameState");
	
	}


	
}
