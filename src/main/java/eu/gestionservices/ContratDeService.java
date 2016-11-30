package eu.gestionservices;
/**
 * Classe pour gérer les contrats de services 
 * 
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 *
 */
public class ContratDeService {
	
	private String nom;
	private HeuresTD minHeures;
	private HeuresTD maxHeures;
	

	public ContratDeService(String nom, HeuresTD minHeures, HeuresTD maxHeures) {
		this.nom = nom;
		this.minHeures = minHeures;
		this.maxHeures = maxHeures;
	}
	
	public String getNom() {
		return nom;
	}
	
	public HeuresTD getHeuresMax() {
		return maxHeures;
	}
	
	public HeuresTD getHeuresMin() {
		return minHeures;
	}
}
