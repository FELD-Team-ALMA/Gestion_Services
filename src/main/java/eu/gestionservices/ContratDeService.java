package eu.gestionservices;

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
