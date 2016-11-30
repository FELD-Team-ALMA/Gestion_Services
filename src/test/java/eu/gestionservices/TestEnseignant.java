package eu.gestionservices;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import eu.gestionservices.components.utilisateur.Enseignant;
import eu.gestionservices.exceptions.IllegalEnseignantException;


/**
 * Classe de test pour la classe Enseignant 
 * 
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 */
public class TestEnseignant {
	
	/**
	 * Vérifier qu'on ne peut pas faire d'enseignant sans nom 
	 * ni prénom, ni mail
	 * @throws IllegalEnseignantException 
	 */
	@Test(expected=IllegalEnseignantException.class)
	public void testEnseignantNull() throws IllegalEnseignantException {
		new Enseignant("","", "");
	}
	
	/**
	 * Test de la méthode equals sur deux enseignants similaires
	 */
	@Test
	public void testEqualsSimilaire() {
		try {
			Enseignant test = new Enseignant("bob", "smith", "bob.smith@email.com");
			Enseignant test2 = new Enseignant("bob", "smith", "bob.smith@email.com");
			assertEquals(true, test.equals(test2));
		} catch (IllegalEnseignantException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Test de la méthode equals sur deux enseignants différents
	 */
	@Test
	public void testEqualsDifferent() {
		try {
			Enseignant test = new Enseignant("bob", "smith", "bob.smith@email.com");
			Enseignant test2 = new Enseignant("maggie", "smith", "maggie.smith@email.com");
			assertEquals(false, test.equals(test2));
		} catch (IllegalEnseignantException e) {
			e.printStackTrace();
		}
	}
	

}
