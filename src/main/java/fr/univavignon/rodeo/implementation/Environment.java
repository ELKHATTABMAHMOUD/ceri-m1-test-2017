package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

public class Environment extends NamedObject implements IEnvironment {

	private int areas ; 
	private List<ISpecie> species ; 
	
	public Environment(String name , int areas, List<ISpecie> species ){
		super(name);
		this.areas = areas ; 
		this.species = new ArrayList<ISpecie>(2);
		this.species = species ;
		
	}

	public int getAreas() {
		// TODO Auto-generated method stub
		return this.areas;
	}

	public List<ISpecie> getSpecies() {
		// TODO Auto-generated method stub
		return this.species;
	}

}
