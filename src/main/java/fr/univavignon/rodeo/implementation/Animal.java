package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;

/**
 * 
 * @author EL-KHATTAB MAHMOUD
 *
 */
public class Animal extends NamedObject implements IAnimal {
	 
	private int XP ; 
	private boolean secret ; 
	private boolean endangered ; 
	private boolean boss ;
	
	public Animal(String name, int XP, boolean secret, boolean endangered, boolean boss){
		super(name) ; 
		this.XP = XP ; 
		this.secret = secret ; 
		this.endangered = endangered ; 
		this.boss = boss ; 
		
	}

	public int getXP() {
		// TODO Auto-generated method stub
		return this.XP;
	}

	public boolean isSecret() {
		// TODO Auto-generated method stub
		return this.secret;
	}

	public boolean isEndangered() {
		// TODO Auto-generated method stub
		return this.endangered;
	}

	public boolean isBoss() {
		// TODO Auto-generated method stub
		return this.boss;
	}

	
}
