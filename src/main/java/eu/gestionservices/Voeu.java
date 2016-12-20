package eu.gestionservices;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.persistence.*;

import java.util.Set;

import eu.gestionservices.components.utilisateur.Enseignant;

/**
 * Classe pour gérer les voeux
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 *
 */

@Entity
public class Voeu extends Souhait {
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private int id;
	
	private HashMap<Enseignement,Integer> voeux; // integer =1 si enseignement fortement souhaite et 0 si tolere
	/**
	 * Constructeur de souhait. De base un souhait n'est pas visible
	 * @param enseignant : l'enseignant emettant le souhait
	 */
	public Voeu(Enseignant enseignant){
		super(enseignant);
		this.voeux = new HashMap<Enseignement,Integer>();
	}
	
	public Voeu(HashMap<Enseignement,Integer> voeux,Enseignant enseignant){
		super(enseignant);
		this.voeux = voeux;
	}
	
	public HashMap<Enseignement,Integer> getVoeux(){
		return this.voeux;
	}
	
	public int getPreference(Enseignement enseignement){
		return voeux.get(enseignement);
	}
	/**
	 * Fonction ajoutant souhait (preference) dans la liste de souhait
	 * @param enseignement : enseignement souhaite
	 * @param preference : int 1 si enseignement fortement souhaite et 0 si tolere 
	 * @warning tout autre int que 1 sera considere comme un 0 lors de l'affichage plus tard	 
	 */
	public void addPreference(Enseignement enseignement,int preference ){
		voeux.put(enseignement, preference);
	}
	
	
	/**
	 * Fonction indiquant si le souhait d'un enseignant est valide ou non 
	 * pour eviter d'envoyer des souhait non valide à son chef
	 * @return boolean : return true si le souhait est valide false sinon
	 * @warning Une demande doit au minimum faire 1.5 fois le nombre d'heures minimum du contrat de l'enseignant
	 */
	
	public boolean valide () {
		
		ContratDeService contrat = this.expediteur.getContrat();
		int nbHeuresVoeu=0; // variable contenant le nombre d'heure cumuler des enseignements du voeu
		
		// On prépare le parcourt de la HashMap
		Set<Entry<Enseignement, Integer>> setVoeux = this.voeux.entrySet();
	    Iterator<Entry<Enseignement, Integer>> it = setVoeux.iterator();

	    // Une sorte de for_each
		while (it.hasNext()){
			Entry<Enseignement, Integer> e= it.next(); // malgre ce que la syntaxe laisse penser on choppe quand meme le premier element
			nbHeuresVoeu+=e.getKey().getEquivalentHeuresTD().getMinute();
		}
		
		//cf warning
		return (contrat.getHeuresMin().getMinute()<=(nbHeuresVoeu*1.5));

	}
	
	
	/**
	 * Fonction toString Necessaire pour l'affichage
	 * @return String : string des caracteristique du voeu
	 * @warning toutes preferences avec une valeur autre que 1 sera considere peu souhaite
	 */
	public String toString(){
		
		String retour ="";
		Set<Entry<Enseignement, Integer>> setVoeux = this.voeux.entrySet();
	    Iterator<Entry<Enseignement, Integer>> it = setVoeux.iterator();

	    retour+=this.expediteur.toString()+"\n";
	    
	    // Une sorte de for_each
		while (it.hasNext()){
			Entry<Enseignement, Integer> e= it.next(); // malgre ce que la syntaxe laisse penser on choppe quand meme le premier element
			retour+=e.getKey().toString()+" ";
			if (e.getValue()==1){
				retour+="Enseignement fortement souhaite";
			}else{
				retour+="Enseignement peu souhaite";
			}
		}
		return retour;
	}



		
	
}
