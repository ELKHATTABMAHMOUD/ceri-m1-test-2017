package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.INamedObject;

/**
 * 
 * @author EL-KHATTAB MAHMOUD
 *
 */
public class NamedObject implements INamedObject{

	private String name ; 
	
	public NamedObject(String name){
		this.name = name ;
	}
	
	public String getName(){
		// TODO Auto-generated method stub
		return this.name;
	}
	
}
