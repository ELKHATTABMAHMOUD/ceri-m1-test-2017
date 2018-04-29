package fr.univavignon.rodeo.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import fr.univavignon.rodeo.api.INamedObject;

/**
 * 
 * @author EL-KHATTAB MAHMOUD
 *
 */
public class INamedObjectTest {
	
	public static INamedObject getNamedObjectMock() {
		//I should create a mock for IAnimal 
		INamedObject iNamedObject = Mockito.mock(INamedObject.class);
		Mockito.when(iNamedObject.getName()).thenReturn("name1");
		return iNamedObject ;
	}
	
	public static INamedObject getNamedObjectInstance() {
		return getNamedObjectMock();
	}
	
	@Test
	public void testGetName(){
		INamedObject iNamedObject = getNamedObjectInstance();
		assertEquals(iNamedObject.getName(), "name1");
	}

}
