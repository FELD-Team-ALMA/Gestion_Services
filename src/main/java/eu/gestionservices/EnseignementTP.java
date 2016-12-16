package eu.gestionservices;

public class EnseignementTP extends Enseignement {

	public EnseignementTP(String id, int minutes, int nbEtudiants, int nbGroupes){
		super(id,minutes,nbEtudiants,nbGroupes);
		equivalentHeuresTD = new HeuresTD(equivalentHeuresTD.convertFromTP(minutes)); //On convetie le nombre d'heures du TP en nombre d'heures de TD
	
	}
	
	
	/**
	 * Cr�e une string qui affiche en heures le nombre de minute de l'enseignement pour un meilleur lecture ( nombre heures r�elle et pas l'�quivalent en HeuresTD)
	 * @return stringHeures: une string -> une string qui affiche le nombre d'heure de l'enseignement
	 * @warning Arondie a 1 decimale et affiche de la frome 20,5 et pas 20h30
	 */
	public String displayHours(){
		double nbminutes = this.equivalentHeuresTD.toTP(); // attention convertion int vers double
		
		String stringHeures= String.format("%.1f",nbminutes/60.0); // 1f indique qu'on veut le formet d�cimale et 1 d�cimale
		
		return stringHeures;
		
	}
}
