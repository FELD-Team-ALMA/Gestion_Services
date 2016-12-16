package eu.gestionservices.components.utilisateur;

import java.util.ArrayList;
import java.util.List;

import eu.gestionservices.Affectation;
import eu.gestionservices.Souhait;
import eu.gestionservices.Module;
import eu.gestionservices.components.Utilisateur;
import eu.gestionservices.exceptions.IllegalEnseignantException;

/**
 * Classe représentant les enseignants : personne physique travaillant
 * pour un département et identifié par son nom, prénom et statut. Un 
 * enseignant peut intervenir dans différents départements pour dispenser
 * un certain nombre d'enseignements. Il peut effectuer des voeux concernant
 * les enseignements qu'il souhaite donner.
 * 
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 */
public class Enseignant implements Utilisateur{
	String nom;
	String prenom;
	/** 
	 * L'adresse mail est unique et permet de différencier deux enseignants 
	 * portant le même nom et prénom
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
	List<Affectation> listeAffectations;
	
	
	/**
	 * Constructeur de Enseignant
	 * @param nom : une String le nom de l'enseignant
	 * @param prenom : une String le prenom de l'enseignant
	 * @param mail : une String le mail de l'enseignant
	 * @warning : l'enseignant n'a pas de status ou de departement
	 */
	public Enseignant(String nom, String prenom, String mail) throws IllegalEnseignantException {
		if (!nom.isEmpty() || !prenom.isEmpty() || !mail.isEmpty()) {
			this.nom = nom;
			this.prenom = prenom;
			this.mail = mail;
			this.listeAffectations= new ArrayList<Affectation>();
		} else {
			throw new IllegalEnseignantException();
		}
	}
	
	/**
	 * Constructeur de Enseignant
	 * @param nom : une String le nom de l'enseignant
	 * @param prenom : une String le prenom de l'enseignant
	 * @param mail : une String le mail de l'enseignant
	 * @param departement : le Departement de l'enseignant
	 * @warning : l'enseignant n'a pas de status 
	 */
	public Enseignant(String nom, String prenom, String mail, Departement departement) throws IllegalEnseignantException {
		if (!nom.isEmpty() || !prenom.isEmpty() || !mail.isEmpty()) {
			this.nom = nom;
			this.prenom = prenom;
			this.mail = mail;
			this.listeAffectations= new ArrayList<Affectation>();
			this.departement=departement;
		} else {
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
	 * Getter du departement
	 * @return un Departement
	 */
	public Departement getDepartement() {
		return this.departement;
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
	public List<Souhait> getListDemandes() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeDemande() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Affectation> getListAffectations() {
		return this.listeAffectations;
		
	}
	
	

	@Override
	public List<Module> getListModules() {
		return null;
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Rajoute une affection � l'enseignant
	 * @param affectation : l'Affectation � affecter
	 */
	public void addAffectation( Affectation affectation){
		this.listeAffectations.add(affectation);
	}
	
	/**
	 * Rajoute une affection � l'enseignant
	 * @param affectation : l'Affectation � retirer
	 * @return 
	 * @return boolean : return true si l'affactation ce trouver dans la liste sinon retourne false si on a voulu enlever une affectation qui n'existait pas
	 */
	
	public boolean removeAffection( Affectation affectation) {
		 
		return this.listeAffectations.remove(affectation);
	}

}
