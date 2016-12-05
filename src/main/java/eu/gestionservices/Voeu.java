package eu.gestionservices;

/**
 * Classe pour gérer les voeux
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 *
 */
public class Voeu {
	
	private boolean preference;
	
	public Voeu(boolean preference){
		this.preference = preference;
	}
	
	public boolean getPreference(){
		return this.preference;
	}

}
