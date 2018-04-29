package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;
import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IAnimalTest;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.ISpecieTest;

/**
 * 
 * @author EL-KHATTAB MAHMOUD
 *
 */
public class SpecieTest extends ISpecieTest {
	
	/**
	 * This method provides an instance of Specie and
	 * it will be used in every method to get a Specie
	 *  instance for testing Specie's methods 
	 */
	
	@Override
	public ISpecie getSpecieInstance() {
		
		IAnimal animal1 = IAnimalTest.getAnimalMock();
		List<IAnimal> animals = new ArrayList<IAnimal>(1);
		animals.add(animal1);
		
		return new Specie("specie1", 2, animals) ;
		
	}

}
