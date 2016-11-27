package eu.gestionservices;

public class ContratDeService {
	
	private String nom;
	private HeuresTD minHeures;
	private HeuresTD maxHeures;
	
	public ContratDeService() {
		
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
