package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

/**
 * 
 * @author EL-KHATTAB MAHMOUD
 *
 */
public class Specie extends NamedObject implements ISpecie {

	
	private int area ; 
	private List<IAnimal> animals ; 
	
	public Specie(String name, int area, List<IAnimal> animals ){
		super(name);
		this.area = area ; 
		this.animals= new ArrayList<IAnimal>(10) ; 
		this.animals = animals ; 
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
