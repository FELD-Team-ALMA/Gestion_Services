package eu.gestionservices.components.utilisateur;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import eu.gestionservices.Affectation;
import eu.gestionservices.ContratDeService;
import eu.gestionservices.Module;
import eu.gestionservices.Souhait;
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
 * @author CharlÃ¨ne Servantie
 */

@Entity
public class Enseignant implements Professeur{
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private int id;
        
	String nom;
	String prenom;
	/** 
	 * L'adresse mail est unique et permet de différencier deux enseignants 
	 * portant le mÃªme nom et prénom
	 * L'adresse mail est unique et permet de différencier deux enseignants 
	 *  portant le mÃªme nom et prénom
	 */
	String mail;
	
	/** 
	 * Les profs peuvent Ãªtre Ã  temps plein
	 * 
	 */
	String statut; 
	Departement departement;
	ContratDeService contrat;
	List<Affectation> listeAffectations;
	List<Souhait> listeDemande; // l'historique des souhait fait par l'enseignant
	
	
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
			this.listeDemande= new ArrayList<Souhait>();
		} else {
			throw new IllegalEnseignantException("Champ prenom,nom et mail sont obligatoires");
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
			this.departement=departement;
			this.listeAffectations= new ArrayList<Affectation>();
			this.listeDemande= new ArrayList<Souhait>();
			
		} else {
			throw new IllegalEnseignantException("Champ prenom,nom et mail sont obligatoires");
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
	 * Getter du departement
	 * @return un Departement
	 */
	public void setDepartement(Departement departement) {
		this.departement=departement;
	}
	/**
	 * Getter du contrat
	 * @return un String
	 */
	public ContratDeService getContrat() {
		return contrat;
	}
	
	/**
	 * Setter du contrat
	 * @return un String
	 */
	public void setContrat( ContratDeService contrat) {
		this.contrat=contrat;
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
		return this.listeDemande;
		
	}

	@Override
	public void makeDemande( Souhait souhait) {
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
	 * Rajoute une affection à l'enseignant
	 * @param affectation : l'Affectation à affecter
	 */
	public void addAffectation( Affectation affectation){
		this.listeAffectations.add(affectation);
	}
	
	public String toString(){
		String retour="";
		
		retour+=this.nom+" "+this.prenom+" "+this.mail;
		
		return retour;
	}
	


}
