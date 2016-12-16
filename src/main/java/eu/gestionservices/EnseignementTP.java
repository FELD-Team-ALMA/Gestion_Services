package eu.gestionservices;

public class EnseignementTP extends Enseignement {

	public EnseignementTP(String id, int minutes, int nbEtudiants, int nbGroupes){
		super(id,minutes,nbEtudiants,nbGroupes);
		equivalentHeuresTD = new HeuresTD(equivalentHeuresTD.convertFromTP(minutes)); //On convetie le nombre d'heures du CM en nombre d'heures de TD
	
	}
}
