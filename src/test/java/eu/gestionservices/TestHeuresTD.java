package eu.gestionservices;

import static org.junit.Assert.*;

import org.junit.Test;

import eu.gestionservices.exceptions.IllegalEnseignantException;

public class TestHeuresTD {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	/**
	 * Test la fonction toCM()
	 */
	@Test
	public void TestToCMTrue() throws Exception{
	
			HeuresTD heureTD= new HeuresTD(90);
			HeuresTD heuresCM= new HeuresTD(60);
			
			assertEquals(true, heuresCM.equals(heureTD.toCM()));
	
	}
	
}
