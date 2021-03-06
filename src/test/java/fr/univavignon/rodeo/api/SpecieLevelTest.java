package fr.univavignon.rodeo.api;


import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * 
 * @author EL-KHATTAB MAHMOUD
 *
 */

public class SpecieLevelTest {

	@Test 
	public void testSpecieLevel() {
		
		assertEquals(SpecieLevel.NOVICE.toString(), "NOVICE");
		assertEquals(SpecieLevel.WRANGLER.toString(), "WRANGLER");
		assertEquals(SpecieLevel.CHAMPION.toString(), "CHAMPION");
		assertEquals(SpecieLevel.MASTER.toString(), "MASTER");
		
	}
	
	@Test 
	public void testGetRequiredXP() {
		
		assertEquals(SpecieLevel.NOVICE.getRequiredXP(), 0);
		assertEquals(SpecieLevel.WRANGLER.getRequiredXP(), 25);
		assertEquals(SpecieLevel.CHAMPION.getRequiredXP(), 150);
		assertEquals(SpecieLevel.MASTER.getRequiredXP(), 600);
		
	}
	
}
