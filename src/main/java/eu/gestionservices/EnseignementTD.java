package eu.gestionservices;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EnseignementTD extends Enseignement {
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private int id;
	
	EnseignementTD(String id, int minutes, int nbEtudiants, int nbGroupes){
		super(id,minutes,nbEtudiants,nbGroupes);
	}
	
	/**
	 * toString pour enseignement
	 * @return retour : une string des caracteristique de l'enseignement 
	 * @warning Arondie a 1 decimale et affiche de la forme 20,5 et pas 20h30 le nombre d'heures
	 */
	public String toString(){
		String retour="";
		retour+="Module : "+this.idModule+ "Type : TD   Nbheures : "+this.toStringHours()+" Nb etudiant "+this.nbEtudiants+" Nbgroupes :"+this.nbGroupes;
		return retour;
	}
}
