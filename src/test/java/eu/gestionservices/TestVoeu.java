package eu.gestionservices;

import static org.junit.Assert.*;

import org.junit.Test;

import eu.gestionservices.components.utilisateur.Enseignant;
import eu.gestionservices.exceptions.IllegalEnseignantException;

public class TestVoeu {

	
	/**
	 * Test de la methode valide quand on s'attend à ce que la demande soit valider
	 * @throws IllegalEnseignantException 
	 * @throws Exception
	 */
	@Test
	public void testValideExpectTrue() throws Exception, IllegalEnseignantException{
		Enseignement ens1= new EnseignementCM("fdggdf", 60, 42,1); 
		Enseignement ens2 = new EnseignementTD("qsdf",90, 42,2);
		HeuresTD minHeures = new HeuresTD(50);
		HeuresTD maxHeures = new HeuresTD(500);
		// Le total des 2 enseignement et 180 minutes en heuresTD
		
		// c'est cette ligne qui force le throws IllegalEnseignantException
		Enseignant enseignant= new Enseignant("SUNYE","Gerson", "mail@univ-nantes.fr"); 
		ContratDeService contrat = new ContratDeService("contrat1", minHeures, maxHeures);
		enseignant.setContrat(contrat);
		//-----
		
		Voeu listVoeux = new Voeu(enseignant);
		listVoeux.addPreference(ens1, 1);
		listVoeux.addPreference(ens2, 0);
		
		
		
		assert(listVoeux.valide());
	}
		
	/**
	 * Test de la methode valide quand on s'attend à ce que la demande ne soit pas valider
	 * @throws IllegalEnseignantException 
	 * @throws Exception
	 */	
	@Test
	public void testValideExpectFalse() throws Exception, IllegalEnseignantException{
		Enseignement ens1= new EnseignementCM("fdggdf", 60, 42,1); 
		Enseignement ens2 = new EnseignementTD("qsdf",90, 42,2);
		HeuresTD minHeures = new HeuresTD(300);
		HeuresTD maxHeures = new HeuresTD(500);
		// Le total des 2 enseignement et 180 minutes en heuresTD
		
		// c'est cette ligne qui force le throws IllegalEnseignantException
		Enseignant enseignant= new Enseignant("SUNYE","Gerson", "mail@univ-nantes.fr"); 
		ContratDeService contrat = new ContratDeService("contrat1", minHeures, maxHeures);
		enseignant.setContrat(contrat);
		//-----
		
		Voeu listVoeux = new Voeu(enseignant);
		listVoeux.addPreference(ens1, 1);
		listVoeux.addPreference(ens2, 0);
		
		
		
		assert(!(listVoeux.valide()));
	}	
		

}
