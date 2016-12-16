package eu.gestionservices;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEnseignementCM {

	/**
	 * Test du constructeur de la classe EnseignementCM
	 */
	@Test	
	public void TestConstructeursCM() throws Exception{
		Enseignement enseignement = new EnseignementCM("fdggdf", 60, 42,1); 
		int nbMin=90;
		assertEquals(true, nbMin == enseignement.getEquivalentHeuresTD().getMinute());// rappele 1h30 TD (90min) = 1h CM 

	}
	
	
	/**
	 * Test de la methode toStringHours avec un résultat qui tombe juste (pas de décimale)
	 */
	@Test
	public void TestToStringHoursJuste() throws Exception{
		Enseignement enseignement= new EnseignementTD("fdggdf", 20*60, 42,1);
		String stringCompartive= "20,0";
			
		assertEquals(true, stringCompartive.equals(enseignement.toStringHours()));
		
	}

}
