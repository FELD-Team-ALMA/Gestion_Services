package eu.gestionservices;

public class EnseignementCM extends Enseignement {

	
	public EnseignementCM(String id, int minutes, int nbEtudiants, int nbGroupes){
		super(id,minutes,nbEtudiants,nbGroupes);
		equivalentHeuresTD = new HeuresTD(equivalentHeuresTD.convertFromCM(minutes)); //On convetie le nombre d'heures du CM en nombre d'heures de TD
	
	}
}
