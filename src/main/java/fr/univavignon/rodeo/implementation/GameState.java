package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.SpecieLevel;

public class GameState extends NamedObject implements IGameState {

	public GameState(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void exploreArea() throws IllegalStateException {
		// TODO Auto-generated method stub
		
	}

	public void catchAnimal(IAnimal animal) throws IllegalArgumentException, IllegalStateException {
		// TODO Auto-generated method stub
		
	}

	public SpecieLevel getSpecieLevel(ISpecie specie) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	public int getProgression() {
		// TODO Auto-generated method stub
		return 0;
	}
	 
	

	
}
