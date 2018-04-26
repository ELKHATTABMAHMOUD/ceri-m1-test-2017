package fr.univavignon.rodeo.implementation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import fr.univavignon.rodeo.api.INamedObject;

public class NamedObjectTest {
	
	public static INamedObject getNamedObjectInstance() {
		return new NamedObject("name1");
	}
	
	@Test
	public void testGetName(){
		INamedObject iNamedObject = getNamedObjectInstance();
		assertEquals(iNamedObject.getName(), "name1");
	}

}
