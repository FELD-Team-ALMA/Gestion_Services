package eu.gestionservices;

import eu.gestionservices.components.utilisateur.Enseignant;

/**
 * Classe pour g√©rer les souhaits des enseignants
 * 
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charl√®ne Servantie
 *
 */
public abstract class Souhait {
	
	// TODO Auto-generated method stub 
	private boolean visible; // indique si le souhait doit Ítre visible ou non
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
	 * Fonction indiquant si le souhait d'un enseignant est valide ou non 
	 * pour eviter d'envoyer des souhait non valide ‡ son chef
	 * @return boolean : return true si le souhait est valide false sinon
	 */
	public abstract boolean valide(Enseignant enseignant);
	
	/**
	 * Fonction toString Necessaire pour l'affichage
	 * @return String : string des caracteristique du Souhait
	 */
	abstract public String toString();
	
}
