package eu.gestionservices;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EnseignementTP extends Enseignement {
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private int id;
	public EnseignementTP(String id, int minutes, int nbEtudiants, int nbGroupes){
		super(id,minutes,nbEtudiants,nbGroupes);
		equivalentHeuresTD = new HeuresTD(equivalentHeuresTD.convertFromTP(minutes)); //On convetie le nombre d'heures du TP en nombre d'heures de TD
	
	}
	
	
	/**
	 * Crée une string qui affiche en heures le nombre de minute de l'enseignement pour un meilleur lecture ( nombre heures réelle et pas l'équivalent en HeuresTD)
	 * @return stringHeures: une string -> une string qui affiche le nombre d'heure de l'enseignement
	 * @warning Arondie a 1 decimale et affiche de la forme 20,5 et pas 20h30
	 */
	public String toStringHours(){
		double nbminutes = this.equivalentHeuresTD.toTP(); // attention convertion int vers double
		
		String stringHeures= String.format("%.1f",nbminutes/60.0); // 1f indique qu'on veut le formet décimale et 1 décimale
		
		return stringHeures;
			
	}
	
	/**
	 * toString pour enseignement
	 * @return retour : une string des caracteristique de l'enseignement 
	 * @warning Arondie a 1 decimale et affiche de la forme 20,5 et pas 20h30 le nombre d'heures
	 */
	public String toString(){
		String retour="";
		retour+="Module : "+this.idModule+ "Type : TP   Nbheures : "+this.toStringHours()+" Nb etudiant "+this.nbEtudiants+" Nbgroupes :"+this.nbGroupes;
		return retour;
	}
}
