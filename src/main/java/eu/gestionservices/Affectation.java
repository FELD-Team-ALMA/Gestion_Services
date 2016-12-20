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


	/**
	 * @return the enseignant
	 */
	public Enseignant getEnseignant() {
		return enseignant;
	}


	/**
	 * @param enseignant the enseignant to set
	 */
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}
	/**
	 * toString pour affectation
	 * @return retour : une string des caracteristique de l'affectation
	 * @warning Arondie a 1 decimale et affiche de la forme 20,5 et pas 20h30 le nombre d'heures
	 */
	public String toString(){
		String retour="";
		retour+=this.enseignant.toString()+"\n";
		retour+=this.enseignement.toString();
		return retour;
	}

}
