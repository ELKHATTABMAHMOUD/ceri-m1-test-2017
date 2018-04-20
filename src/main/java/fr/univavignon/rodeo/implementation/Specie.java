package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

public class Specie extends NamedObject implements ISpecie {

	
	private int area ; 
	private List<IAnimal> animals ; 
	
	public Specie(String name, int area ){
		super(name);
		this.area = area ; 
		this.animals= new ArrayList<IAnimal>(10) ; 
	}
	
	public int getArea() {
		// TODO Auto-generated method stub
		return this.area;
	}

	public List<IAnimal> getAnimals() {
		// TODO Auto-generated method stub
		return this.animals;
	}

}
