package eu.gestionservices;

import eu.gestionservices.components.utilisateur.Enseignant;

public class DemandeSpecial extends Souhait{

	private String motif;// Indique le motif de la demande
	private HeuresTD nbHeures;// Indique le nombre d'heures de travaille de l'enseignant qui sont affectee
	private boolean plusOuMoins; // Indique si la demande va entrainer plus d'heures trvailler ou moins pour celui qui fait la demande
	
	/**
	 * Constructeur de la classe {@link DemandeSpecial}
	 * @param motif : string indiquant le motif et explication de la demande
	 * @param nbHeures : HeuresTD combien d'heures (minutes) de travaille sont concerner
	 * @param plusOuMoins : indique si la demande entraine plus ou moins d'heures travailler
	 * @param enseignant : l'enseignant qui fait la demande 
	 * @throws RuntimeException si le champ motif est vide
	 * @warning  Une demande special est toujours valide c'est au chef de departement de decide si il est d'accord ou non
	 */
	public DemandeSpecial( String motif, HeuresTD nbHeures, boolean plusOuMoins,Enseignant enseignant) throws RuntimeException {
		super(enseignant);
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
	public boolean valide() {
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
