package eu.gestionservices;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

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
@RunWith(MockitoJUnitRunner.class)
public class TestEnseignant {
    @Mock
    private Enseignement enseignement;
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
	
	/**
	 * Test de l'ajout d'affectation (addAffectation()) 
	 */
	@Test
	public void testAjoutAffectation() {
		try {
			Enseignant test = new Enseignant("bob", "smith", "bob.smith@email.com");
			Affectation aff = new Affectation(test, enseignement); 
			ArrayList<Affectation> list = new ArrayList<Affectation>();
			list.add(aff);
			test.addAffectation(aff);
			assertEquals(list.size(), test.getListAffectations().size());
			assertEquals(list.get(0), test.getListAffectations().get(0));
			
		} catch (IllegalEnseignantException e) {
			e.printStackTrace();
		}
	}

}
