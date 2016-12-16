package eu.gestionservices;


/**
 * Classe pour les enseignements
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author CharlÃ¨ne Servantie
 *
 */

public abstract class Enseignement {

	protected String idModule;
	protected HeuresTD equivalentHeuresTD;
	protected int nbEtudiants; // Le nomvre d'etudiant participant au module
	protected int nbGroupes; // En combien de groupes on doit séparé les étudiant
	
	public Enseignement (String id, int minutes, int nbEtudiants, int nbGroupes){
		idModule=id;
		equivalentHeuresTD= new HeuresTD(minutes);
		this.nbEtudiants=nbEtudiants;
		this.nbGroupes=nbGroupes;
	}


	public String getIdModule() {
		return idModule;
	}


	public HeuresTD getEquivalentHeuresTD() {
		return equivalentHeuresTD;
	}


	public int getNbEtudiants() {
		return nbEtudiants;
	}

	public int getNbGroupes() {
		return nbGroupes;
	}

	/**
	 * Equals de la classe Enseignement
	 */
	@Override
	public boolean equals(Object o) {
		if (o != null) {
			if (o instanceof Enseignement) {
				Enseignement enseignement = (Enseignement) o;
				if ((enseignement.idModule == this.idModule)||( this.equivalentHeuresTD.equals(enseignement.equivalentHeuresTD))||
						(enseignement.nbEtudiants == this.nbEtudiants)||(enseignement.nbGroupes == this.nbGroupes)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	//-----------------------------------
	
	/**
	 * Crée une string qui affiche en heures le nombre de minute de l'enseignement pour un meilleur lecture
	 * @return stringHeures: une string -> une string qui affiche le nombre d'heure de l'enseignement
	 * @warning Arondie a 1 decimale et affiche de la frome 20,5 et pas 20h30
	 */
	
	public String displayHours(){
		
		String stringHeures= String.format("%.1f", this.equivalentHeuresTD.getMinute()/60.0); // 1f indique qu'on veut le formet décimale et 1 décimale
		
		return stringHeures;
		
	}
		
}
