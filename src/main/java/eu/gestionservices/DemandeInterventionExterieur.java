package eu.gestionservices;

import eu.gestionservices.components.utilisateur.Enseignant;

public class DemandeInterventionExterieur extends Souhait{

	private String motif; // String indiquant le motif et le sujet de la demande
	private String lieu;// L'endroit ou ce deplace
	private HeuresTD nbHeures;// Le nombre d'heures travailler
	
	
	public  DemandeInterventionExterieur( String motif, String lieu, HeuresTD nbHeures)throws RuntimeException {
		if (!motif.isEmpty() || !lieu.isEmpty()) {
		this.motif=motif;
		this.lieu=lieu;
		this.nbHeures=nbHeures;
		}else{
			throw new RuntimeException("Il faut indiquer le lieu et le motif de votre demande");
		}
	}
	
	
	/**
	 * Fonction indiquant si le souhait d'un enseignant est valide ou non 
	 * pour eviter d'envoyer des souhait non valide à son chef
	 * @return boolean : return true
	 * @warning Une demande d'intervention exterieur est toujours valide c'est au chef de departement de decide si il est d'accord ou non
	 */
	@Override
	public boolean valide(Enseignant enseignant) {
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
