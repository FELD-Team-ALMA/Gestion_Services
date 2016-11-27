package main.java;

import main.java.exceptions.IllegalEnseignantNameException;

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
	String mail;
	/** 
	 * Les profs peuvent être à temps plein
	 * 
	 */
	String statut; 
	Departement departement;
	
	public Enseignant(String nom, String prenom) throws IllegalEnseignantNameException {
		if (!nom.isEmpty() || !prenom.isEmpty()) {
			this.nom = nom;
			this.prenom = prenom;
		}
		else {
			throw new IllegalEnseignantNameException();
		}
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}

}
