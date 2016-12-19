package eu.gestionservices;

public class EnseignementCM extends Enseignement {

	
	public EnseignementCM(String id, int minutes, int nbEtudiants, int nbGroupes){
		super(id,minutes,nbEtudiants,nbGroupes);
		equivalentHeuresTD = new HeuresTD(equivalentHeuresTD.convertFromCM(minutes)); //On convetie le nombre d'heures du CM en nombre d'heures de TD
	
	}
	/**
	 * Crée une string qui affiche en heures le nombre de minute de l'enseignement pour un meilleur lecture ( nombre heures réelle et pas l'équivalent en HeuresTD)
	 * @return stringHeures: une string -> une string qui affiche le nombre d'heure de l'enseignement
	 * @warning Arondie a 1 decimale et affiche de la frome 20,5 et pas 20h30
	 */
	public String toStringHours(){
		double nbminutes = this.equivalentHeuresTD.toCM(); // attention convertion int vers double
		
		String stringHeures= String.format("%.1f",nbminutes/60.0); // 1f indique qu'on veut le formet décimale et 1 décimale
		
		return stringHeures;
		
	}
}
