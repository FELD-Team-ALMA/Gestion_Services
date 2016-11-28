package eu.gestionservices.components.utilisateur;

import java.util.ArrayList;
import java.util.List;

import eu.gestionservices.Affectation;
import eu.gestionservices.Souhait;
import eu.gestionservices.Module;
import eu.gestionservices.components.Utilisateur;


/**
 * Classe représentant les départements : entité administrative identifiée
 * par un nom. Il comprend un ensemble de modules et d'enseignements qui lui
 * sont rattachés. Chaque département a pour responsable un chef de département
 * Plusieurs enseignants peuvent donner des enseignements pour le compte de
 * chaque département
 * 
 * @author Charlène Servantie
 *
 */
public class Departement implements Utilisateur{
	private String nom;
	private List<Enseignant> enseignants;
	
	/**
	 * Constructeur de Departement
	 * @param nom : un String pour le nom du département
	 */
	public Departement(String nom) {
		this.nom = nom;
		this.enseignants = new ArrayList<Enseignant>();
	}
	
	/**
	 * Getter pour le nom du département
	 * @return un String
	 */
	public String getNomDept() {
		return nom;
	}
	
	/**
	 * Ajout d'un enseignant au département
	 */
	public void addEnseignant(Enseignant e) {
		if (!enseignants.contains(e)) {
			enseignants.add(e);
		}
	}
	
	/**
	 * Retrait d'un enseignant du département
	 */
	
	public void removeEnseignant(Enseignant e) {
		if (enseignants.contains(e)) {
			enseignants.remove(e);
		}
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
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Module> getListModules() {
		return null;
		// TODO Auto-generated method stub
		
	}

}
