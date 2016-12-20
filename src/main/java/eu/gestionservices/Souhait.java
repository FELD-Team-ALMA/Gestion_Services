package eu.gestionservices;

import javax.persistence.*;

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

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DISC", discriminatorType=DiscriminatorType.STRING)
public abstract class Souhait {
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private int id;
 
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
	 * getter expiditeur
	 */
	public Enseignant getExpiditeur(){
		return this.expediteur;
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
