package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

public class Environment extends NamedObject implements IEnvironment {

	private int area ; 
	private List<ISpecie> species ; 
	
	public Environment(String name , int area ){
		super(name);
		this.area = area ; 
		this.species= new ArrayList<ISpecie>(10) ; 
	}

	public int getAreas() {
		// TODO Auto-generated method stub
		return this.area;
	}

	public List<ISpecie> getSpecies() {
		// TODO Auto-generated method stub
		return this.species;
	}

}
