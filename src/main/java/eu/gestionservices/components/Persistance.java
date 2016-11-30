package eu.gestionservices.components;

/**
 * Interface pour alterner entre les différentes persistances
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 *
 */
public interface Persistance {
	
	public void saveData();
	public void loadData();

}
