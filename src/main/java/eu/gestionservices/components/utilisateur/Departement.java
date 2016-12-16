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
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 *
 */
public class Departement implements Utilisateur{
	private String nom;
	private List<Enseignant> enseignants;
	private List<Module> modules;
	/**
	 * Constructeur de Departement
	 * @param nom : un String pour le nom du département
	 */
	public Departement(String nom) {
		this.nom = nom;
		this.enseignants = new ArrayList<Enseignant>();
		this.modules= new ArrayList<Module>();
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
	 * @param e : Enseignant � add
	 */
	public void addEnseignant(Enseignant e) {
		if (!enseignants.contains(e)) {
			enseignants.add(e);
		}
	}
	
	/**
	 * Retrait d'un enseignant du département
	 * @param e : Enseignant � remove
	 */
	
	public void removeEnseignant(Enseignant e) {
		if (enseignants.contains(e)) {
			enseignants.remove(e);
		}
	}
	
	/**
	 * Ajout d'un module au departement
	 * @param m : Module � add
	 */
	public void addModule(Module m) {
		if (!this.modules.contains(m)) {
			modules.add(m);
		}
	}
	
	/**
	 * Retrait d'un Module au departement
	 * @param m : Module � remove
	 */
	
	public void removeModule(Module m) {
		if (!this.modules.contains(m)) {
			this.modules.remove(m);
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
		return this.modules;		
	}

}
