package eu.gestionservices;

import eu.gestionservices.exceptions.IllegalEnseignantException;

/**
 * Classe représentant les enseignants : personne physique travaillant
 * pour un département et identifié par son nom, prénom et statut. Un 
 * enseignant peut intervenir dans différents départements pour dispenser
 * un certain nombre d'enseignements. Il peut effectuer des voeux concernant
 * les enseignements qu'il souhaite donner.
 * 
 * @author Charlène Servantie
 *
 */
public class Enseignant {
	String nom;
	String prenom;
	
	/** L'adresse mail est unique et permet de différencier deux enseignants 
	 *  portant le même nom et prénom
	 */
	String mail;
	/** 
	 * Les profs peuvent être à temps plein
	 * 
	 */
	String statut; 
	Departement departement;
	
	public Enseignant(String nom, String prenom, String mail) throws IllegalEnseignantException {
		if (!nom.isEmpty() || !prenom.isEmpty() || !mail.isEmpty()) {
			this.nom = nom;
			this.prenom = prenom;
			this.mail = mail;
		}
		else {
			throw new IllegalEnseignantException();
		}
	}
	
	/**
	 * Getter du nom
	 * @return un String
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Getter du prénom
	 * @return un String
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Getter de l'email
	 * @return un String
	 */
	public String getMail() {
		return mail;
	}
	
	/**
	 * Deux instances d'Enseignant sont égales si et seulement si
	 * leurs emails sont identiques.
	 */
	public boolean equals(Object o) {
		if (o != null) {
			if (o instanceof Enseignant) {
				Enseignant ens = (Enseignant) o;
				if (ens.getMail() == this.getMail()) {
					return true;
				}
			}
		}
		return false;
	}
	

}
