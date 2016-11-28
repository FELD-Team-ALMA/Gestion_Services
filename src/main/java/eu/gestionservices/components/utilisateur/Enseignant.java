package eu.gestionservices.components.utilisateur;

<<<<<<< HEAD
=======
import java.util.List;

import eu.gestionservices.Affectation;
import eu.gestionservices.Demande;
import eu.gestionservices.Module;
>>>>>>> 1a9f109fcea9cf44c36ccf99508db3b5786c2038
import eu.gestionservices.components.Utilisateur;
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
public class Enseignant implements Utilisateur{
	String nom;
	String prenom;
	
<<<<<<< HEAD
	/** 
	 * L'adresse mail est unique et permet de différencier deux enseignants 
	 * portant le même nom et prénom
=======
	/** L'adresse mail est unique et permet de différencier deux enseignants 
	 *  portant le même nom et prénom
>>>>>>> 1a9f109fcea9cf44c36ccf99508db3b5786c2038
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
<<<<<<< HEAD
		} else {
=======
		}
		else {
>>>>>>> 1a9f109fcea9cf44c36ccf99508db3b5786c2038
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

	@Override
<<<<<<< HEAD
	public void getListDemandes() {
=======
	public List<Demande> getListDemandes() {
		return null;
>>>>>>> 1a9f109fcea9cf44c36ccf99508db3b5786c2038
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeDemande() {
		// TODO Auto-generated method stub
		
	}

	@Override
<<<<<<< HEAD
	public void getListAffectations() {
=======
	public List<Affectation> getListAffectations() {
		return null;
>>>>>>> 1a9f109fcea9cf44c36ccf99508db3b5786c2038
		// TODO Auto-generated method stub
		
	}

	@Override
<<<<<<< HEAD
	public void getListModules() {
=======
	public List<Module> getListModules() {
		return null;
>>>>>>> 1a9f109fcea9cf44c36ccf99508db3b5786c2038
		// TODO Auto-generated method stub
		
	}
	

}
