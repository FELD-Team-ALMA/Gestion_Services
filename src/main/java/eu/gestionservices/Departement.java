package eu.gestionservices;

import java.util.ArrayList;
import java.util.List;


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
public class Departement {
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

}
