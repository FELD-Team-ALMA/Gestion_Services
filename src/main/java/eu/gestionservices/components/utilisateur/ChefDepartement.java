package eu.gestionservices.components.utilisateur;

import java.util.ArrayList;
import java.util.List;

import eu.gestionservices.Affectation;
import eu.gestionservices.Enseignement;
import eu.gestionservices.Souhait;
import eu.gestionservices.exceptions.IllegalEnseignantException;

public class ChefDepartement extends Enseignant {

	private List<Souhait> souhaitEnAttente; // Tout les souhaits que le chef doit traiter

	/**
	 * Constructeur de ChefDepartement 
	 * @param nom : une String pour le nom du chef
	 * @param prenom :une String pour le prenom du chef
	 * @param mail :une String pour le mail du chef
	 * @param departement : le Departement de l'enseignant
	 */
	public ChefDepartement(String nom, String prenom, String mail, Departement departement) throws IllegalEnseignantException {
		super(nom,prenom,mail,departement); 
		this.souhaitEnAttente= new ArrayList<Souhait>();	
	}
	
	/**
	 * Constructeur de ChefDepartement utilise pour transition de chef
	 * @param nom : une String pour le nom du chef
	 * @param prenom :une String pour le prenom du chef
	 * @param mail :une String pour le mail du chef
	 * @param departement : le Departement de l'enseignant
	 */
	public ChefDepartement(String nom, String prenom, String mail, Departement departement, ArrayList<Souhait> souhaitEnAttente ) throws IllegalEnseignantException {
		super(nom,prenom,mail,departement); 
		this.souhaitEnAttente= souhaitEnAttente;	
	}
	/**
	 * @return the souhaitEnAttente
	 */
	public List<Souhait> getSouhaitEnAttente() {
		return souhaitEnAttente;
	}
	
	/**
	 * Rend visible (publie) un des souhait de son departement
	 * @param souhait : le soihait que l'on publie (valide)
	 * @warning Ceci n'est pas une affectation
	 */
	public void valider( Souhait souhait) throws RuntimeException{
		// TODO ameliore la complexitede la fonction
		if (this.souhaitEnAttente.contains(souhait)){
			int positionSouhait = this.souhaitEnAttente.indexOf(souhait); // On recupere la position de l'objet
			this.souhaitEnAttente.get(positionSouhait).publication();
		}else{ 
			throw new RuntimeException(" Ce souhait n'existe pas");
		}
	}
		
		
	/**
	 * Affecter un enseignement à un enseignant
	 * @param enseignant : l'enseignant à qui on affecte l'enseignement
	 * @param enseignement : l'enseignement affecter à l'enseignant 
	 * @warning Marche meme si l'enseignant ne souhaitait pas cette enseignenent
	 */
	public void affecter(Enseignant enseignant, Enseignement enseignement)throws RuntimeException{
		boolean contient =false; // indique si l'enseignement en question fait partie des enseignement du departement 
		int i=0;// compteur pour parcourir une ArrayListe
		if (this.departement.getEnseignants().contains(enseignant)){
			
			while ((contient) || (i<this.departement.getListModules().size())){
				if (enseignement.getIdModule()== this.departement.getListModules().get(i).getIdModule()){
					contient=true;
				}
			++i;
			}
			
			if (contient){
				Affectation affectation = new Affectation(enseignant, enseignement);
				enseignant.addAffectation(affectation);
			}else{
				throw new RuntimeException(" Cette enseignement n'existe pas");
			}
		}else {
			throw new RuntimeException(" Cette enseignant n'existe pas");
		}
		
	}


	
	
	
	
}
