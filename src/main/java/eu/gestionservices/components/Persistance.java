package eu.gestionservices.components;

/**
 * Interface pour alterner entre les différentes persistances
 * @author Charlène Servantie
 *
 */
public interface Persistance {
	
	public void saveData();
	public void loadData();

}
