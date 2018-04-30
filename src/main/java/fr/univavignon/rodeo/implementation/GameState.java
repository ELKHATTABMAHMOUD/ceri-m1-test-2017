package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.SpecieLevel;

/**
 * 
 * @author EL-KHATTAB MAHMOUD
 *
 */
public class GameState extends NamedObject implements IGameState {

	 private int progression ;
	
	
	public GameState(String name) {
		super(name);
		this.progression = 10;
		// TODO Auto-generated constructor stub
	}

	public void exploreArea() throws IllegalStateException {
		// TODO Auto-generated method stub
		throw new IllegalStateException("the area ca not be explored");
	}

	public void catchAnimal(IAnimal animal) throws IllegalArgumentException, IllegalStateException {
		// TODO Auto-generated method stub
		if(animal == null)
			throw new IllegalArgumentException("The given animal is null"); 
		else
			throw new IllegalStateException("The given animal can not be found in current area"); 		
		
	}

	public SpecieLevel getSpecieLevel(ISpecie specie) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if(specie == null)
			throw new IllegalArgumentException("The parameter has been provided is null");
		else {		
			int xpAmount =0;  
			for(IAnimal animal : specie.getAnimals())
				xpAmount += animal.getXP();
			if(xpAmount >= 600)
				return SpecieLevel.MASTER;
			else{
				if(xpAmount >= 150)
					return SpecieLevel.CHAMPION;
				else{
					if(xpAmount >= 25)
						return SpecieLevel.WRANGLER;
				}
			}
		}
		return SpecieLevel.NOVICE;		
		
	}

	public int getProgression() {
		// TODO Auto-generated method stub
		return this.progression;
	}
	
	 
	

	
}
