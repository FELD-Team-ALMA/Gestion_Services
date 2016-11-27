package test.java;

import org.junit.Test;

import main.java.Enseignant;
import main.java.exceptions.IllegalEnseignantNameException;

/**
 * Classe de test pour la classe Enseignant 
 * @author Charlène Servantie
 *
 */
public class TestEnseignant {
	
	/**
	 * Vérifier qu'on ne peut pas faire d'enseignant sans nom 
	 * ni prénom
	 * @throws IllegalEnseignantNameException 
	 */
	@Test(expected=IllegalEnseignantNameException.class)
	public void testEnseignantNull() throws IllegalEnseignantNameException {
		new Enseignant("","");
	}

}
