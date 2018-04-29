package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentTest;
import fr.univavignon.rodeo.api.ISpecie;

/**
 * 
 * @author EL-KHATTAB MAHMOUD
 *
 */
public class EnvironmentTest extends IEnvironmentTest {
	
	/**
	 * this method provides a mock instance of IAnimal and it will
	 * be used in every method to create an IAnimal instance 
	 */
	
	@Override
	public IEnvironment getEnvironmentInstance() {
		ISpecie specie = SpecieTest.getSpecieMock();
		List<ISpecie> species  = new ArrayList<ISpecie>() ;
		species.add(specie) ;
		return new Environment("environment 1", 2, species) ;
	}
	
	

}
