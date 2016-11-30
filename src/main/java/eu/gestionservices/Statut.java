package eu.gestionservices;

/**
 * Une interface pour le statut permet d'ouvrir à l'extension le 
 * logiciel (sinon le statut est pour le moment juste représenté 
 * par un String
 * 
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 *
 */
public interface Statut {
	
	void getStatut();
	String toString();
	
}
