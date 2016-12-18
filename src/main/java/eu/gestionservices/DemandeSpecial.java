package eu.gestionservices;

import eu.gestionservices.components.utilisateur.Enseignant;

public class DemandeSpecial extends Souhait{

	private String motif;// Indique le motif de la demande
	private HeuresTD nbHeures;// Indique le nombre d'heures de travaille de l'enseignant qui sont affectee
	private boolean plusOuMoins; // Indique si la demande va entrainer plus d'heures trvailler ou moins pour celui qui fait la demande
	
	
	public DemandeSpecial( String motif, HeuresTD nbHeures, boolean plusOuMoins) throws RuntimeException {
		if (!motif.isEmpty()) {
			this.motif=motif;
			this.nbHeures=nbHeures;
			this.plusOuMoins=plusOuMoins;	
		}else {
			throw new RuntimeException("Il faut donner votre motif");
		}
	}
	
	/**
	 * Fonction indiquant si le souhait d'un enseignant est valide ou non 
	 * pour eviter d'envoyer des souhait non valide à son chef
	 * @return boolean : return true
	 * @warning Une demande special est toujours valide c'est au chef de departement de decide si il est d'accord ou non
	 */
	public boolean valide(Enseignant enseignant) {
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
