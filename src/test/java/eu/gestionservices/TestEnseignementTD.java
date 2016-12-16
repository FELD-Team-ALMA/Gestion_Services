package eu.gestionservices;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Classe pour tester la classe Enseignement et ses sous-classe ( vu leurs longeurs)
 * 
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author CharlÃ¨ne Servantie
 *
 */

public class TestEnseignementTD {

	
	/**
	 * Test de la methode displayHours avec un résultat qui tombe juste (pas de décimale)
	 */
	@Test
	public void TestDisplayHoursJuste() throws Exception{
		Enseignement enseignement= new EnseignementTD("fdggdf", 20*60, 42,1);
		String stringCompartive= "20,0";
			
		assertEquals(true, stringCompartive.equals(enseignement.displayHours()));
		
	}
	
	/**
	 * Test de la methode displayHours avec un résultat avec des décimale et qui force un arrondie
	 */
	@Test
	public void TestDisplayHoursAvecArrondie() throws Exception{
		Enseignement enseignement= new EnseignementTD("fdggdf", 91, 42,1);
		String stringCompartive= "1,5";
		assertEquals(true, stringCompartive.equals(enseignement.displayHours()));
		
	}
	
	

	
	
	

}
