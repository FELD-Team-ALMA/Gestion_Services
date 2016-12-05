package eu.gestionservices;

import java.util.HashMap;

/**
 * Classe pour gérer les voeux
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 *
 */
public class Voeu {
	
	private HashMap<Enseignement, Boolean> voeux; 

	public Voeu(){
		this.voeux = new HashMap<Enseignement, Boolean>();
	}
	
	public Voeu(HashMap<Enseignement, Boolean> voeux){
		this.voeux = voeux;
	}
	
	public HashMap<Enseignement, Boolean> getVoeux(){
		return this.voeux;
	}
	
	public boolean getPreference(Enseignement enseignment){
		return voeux.get(enseignment);
	}
	
	public void addPreference(Enseignement enseignement, Boolean preference){
		voeux.put(enseignement, preference);
	}
}
