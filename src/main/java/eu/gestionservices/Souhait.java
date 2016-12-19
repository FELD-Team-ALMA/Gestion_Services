package eu.gestionservices;

import eu.gestionservices.components.utilisateur.Enseignant;

/**
 * Classe pour gÃ©rer les souhaits des enseignants
 * 
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author CharlÃ¨ne Servantie
 *
 */
public abstract class Souhait {
	
 
	private boolean visible; // indique si le souhait doit être visible ou non
	protected Enseignant expediteur; // l'enseignant qui envoie le souhait
	/**
	 * Constructeur de souhait. De base un souhait n'est pas visible
	 * @param enseignant : l'enseignant emettant le souhait
	 */
	public Souhait(Enseignant enseignant){
		this.expediteur=enseignant;
		visible=false;
	}
	
	/**
	 * Rend visible (publie) un souhait --> visible=true
	 */
	public void publication(){
		visible=true;
	}
	
	
	/**
	 * Fonction indiquant si le souhait d'un enseignant est valide ou non 
	 * pour eviter d'envoyer des souhait non valide à son chef
	 * @return boolean : return true si le souhait est valide false sinon
	 */
	public abstract boolean valide();
	
	/**
	 * Fonction toString Necessaire pour l'affichage
	 * @return String : string des caracteristique du Souhait
	 */
	abstract public String toString();
	
}
