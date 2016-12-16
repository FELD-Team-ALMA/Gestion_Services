package eu.gestionservices;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Classe pour tester la classe Enseignement et ses sous-classe ( vu leurs longeurs)
 * 
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 *
 */

public class TestEnseignementTD {

	
	/**
	 * Test de la methode toStringHours avec un r�sultat qui tombe juste (pas de d�cimale)
	 */
	@Test
	public void TestToStringHoursJuste() throws Exception{
		Enseignement enseignement= new EnseignementTD("fdggdf", 20*60, 42,1);
		String stringCompartive= "20,0";
			
		assertEquals(true, stringCompartive.equals(enseignement.toStringHours()));
		
	}
	
	/**
	 * Test de la methode toStringHours avec un r�sultat avec des d�cimale et qui force un arrondie
	 */
	@Test
	public void TestToStringHoursAvecArrondie() throws Exception{
		Enseignement enseignement= new EnseignementTD("fdggdf", 91, 42,1);
		String stringCompartive= "1,5";
		assertEquals(true, stringCompartive.equals(enseignement.toStringHours()));
		
	}
	
	

	
	
	

}
