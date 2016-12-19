package eu.gestionservices;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
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
public class Voeu extends Souhait {
	
	private HashMap<Enseignement, Boolean> voeux; 
	/**
	 * Constructeur de souhait. De base un souhait n'est pas visible
	 * @param enseignant : l'enseignant emettant le souhait
	 */
	public Voeu(Enseignant enseignant){
		super(enseignant);
		this.voeux = new HashMap<Enseignement, Boolean>();
	}
	
	public Voeu(HashMap<Enseignement, Boolean> voeux,Enseignant enseignant){
		super(enseignant);
		this.voeux = voeux;
	}
	
	public HashMap<Enseignement, Boolean> getVoeux(){
		return this.voeux;
	}
	
	public boolean getPreference(Enseignement enseignement){
		return voeux.get(enseignement);
	}
	
	public void addPreference(Enseignement enseignement, Boolean preference){
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
		Set<Entry<Enseignement, Boolean>> setVoeux = this.voeux.entrySet();
	    Iterator<Entry<Enseignement, Boolean>> it = setVoeux.iterator();

	    // Une sorte de for_each
		while (it.hasNext()){
			Entry<Enseignement, Boolean> e= it.next(); // malgre ce que la syntaxe laisse penser on choppe quand meme le premier element
			nbHeuresVoeu+=e.getKey().getEquivalentHeuresTD().getMinute();
		}
		
		//cf warning
		return (contrat.getHeuresMin().getMinute()<=(nbHeuresVoeu*1.5));

	}
	
	
	/**
	 * Fonction toString Necessaire pour l'affichage
	 * @return String : string des caracteristique du Souhait
	 */
	public String toString(){
		// TODO 
		
		return "";
	}



		
	
}
