package eu.gestionservices;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEnseignementTP {

	

	
	/**
	 * Test du constructeur de la classe EnseignementTP
	 */
	@Test	
	public void TestConstructeursTP() throws Exception{
		Enseignement enseignement = new EnseignementTP("fdggdf", 90, 42,1); 
		int nbMin=60;
		assertEquals(true, nbMin == enseignement.getEquivalentHeuresTD().getMinute());// rappele 1h30 TP (90min) = 1h TD 

	}
	
	/**
	 * Test de la methode ToStringHours avec un résultat qui tombe juste (pas de décimale)
	 */
	@Test
	public void TestToStringHoursJuste() throws Exception{
		Enseignement enseignement= new EnseignementCM("fdggdf", 20*60, 42,1);
		String stringCompartive= "20,0";
			
		assertEquals(true, stringCompartive.equals(enseignement.toStringHours()));
		
	}
}
