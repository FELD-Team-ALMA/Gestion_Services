package eu.gestionservices;

import eu.gestionservices.components.utilisateur.Enseignant;

/**
 * Classe pour gérer les affectations
 * 
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 *
 */
public class Affectation {
	private Enseignant enseignant;
	private Enseignement enseignement;
	
	
	public Affectation (Enseignant enseignant, Enseignement enseignement ){
		this.enseignant=enseignant;
		this.enseignement=enseignement;
	}


	/**
	 * @return the enseignement
	 */
	public Enseignement getEnseignement() {
		return enseignement;
	}


	/**
	 * @param enseignement the enseignement to set
	 */
	public void setEnseignement(Enseignement enseignement) {
		this.enseignement = enseignement;
	}
}
