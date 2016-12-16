package eu.gestionservices;

/**
 * Classe pour gérer les modules
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 *
 */
public class Module {

	private String nomModule;
	private String idModule;
	private String publicConcerne; // Parcourt + annee d'enseignement
	private EnseignementCM enseignementCM;
	private EnseignementTD enseignementTD;
	private EnseignementTP enseignementTP;
	private int semestre; // indique si c'est un cours du premier ou second semestre.
	
	/**
	 * Constructeur de HeuresTD
	 * @warning avec ce construceur les enseignement ne sont pas initialise
	 */
	
	public Module (String nomModule, String idModule, String publicConcerne, int semestre ){
		this.nomModule=nomModule;
		this.idModule=idModule;
		this.publicConcerne=publicConcerne;
		this.semestre=semestre;
		
		
	}
	
	/**
	 * Constructeur de HeuresTD qui initialise les enseignements
	 * 
	 */
	
	public Module (String nomModule, String idModule, String publicConcerne, int semestre,
			EnseignementCM enseignementCM,EnseignementTD enseignementTD, EnseignementTP enseignementTP){
		this.nomModule=nomModule;
		this.idModule=idModule;
		this.publicConcerne=publicConcerne;
		this.semestre=semestre;		
	}


	/**
	 * @param enseignementCM the enseignementCM to set
	 */
	public void setEnseignementCM(EnseignementCM enseignementCM) {
		this.enseignementCM = enseignementCM;
	}


	/**
	 * @param enseignementTD the enseignementTD to set
	 */
	public void setEnseignementTD(EnseignementTD enseignementTD) {
		this.enseignementTD = enseignementTD;
	}

	/**
	 * @param enseignementTP the enseignementTP to set
	 */
	public void setEnseignementTP(EnseignementTP enseignementTP) {
		this.enseignementTP = enseignementTP;
	}
	
	
	
	//-------------------
	
	public String toString(){
		
		String affichage="";
		
		affichage+=this.nomModule+" id :"+this.idModule+" Public Concern� : "+this.publicConcerne+" semestre:  "+this.semestre+"\n";
		affichage+="CM : groupes : "+this.enseignementCM.getNbGroupes()+ " nbHeures : "+this.enseignementCM.toStringHours()+"\n";
		affichage+="TD : groupes : "+this.enseignementTD.getNbGroupes()+ " nbHeures : "+this.enseignementTD.toStringHours()+"\n";
		affichage+="TP : groupes : "+this.enseignementTP.getNbGroupes()+ " nbHeures : "+this.enseignementTP.toStringHours()+"\n";
		
		return affichage;
	}
	
	
	
}
