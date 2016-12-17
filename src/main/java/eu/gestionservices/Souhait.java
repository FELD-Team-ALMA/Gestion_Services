package eu.gestionservices;

import eu.gestionservices.components.utilisateur.Enseignant;

/**
 * Classe pour gérer les souhaits des enseignants
 * 
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 *
 */
public abstract class Souhait {
	
	// TODO Auto-generated method stub 
	private boolean visible; // indique si le souhait doit �tre visible ou non
	/**
	 * Constructeur de souhait. De base un souhait n'est pas visible
	 */
	public Souhait(){
		visible=false;
	}
	
	/**
	 * Rend visible (publie) un souhait
	 */
	public void publication(){
		visible=true;
	}
	
	/**
	 * Fonction toString Necessaire pour l'affichage
	 * @return String : string des caracteristique du Souhait
	 */
	abstract public String toString();
	
}
