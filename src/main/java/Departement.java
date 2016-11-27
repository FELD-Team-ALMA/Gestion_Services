package main.java;

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
	String nom;
	List<Enseignant> enseignants;
	
	/**
	 * Constructeur de Departement
	 * @param nom : un String pour le nom du département
	 */
	public Departement(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Getter pour le nom du département
	 * @return un String
	 */
	public String getNomDept() {
		return nom;
	}
	
	/**
	 * 
	 */

}
