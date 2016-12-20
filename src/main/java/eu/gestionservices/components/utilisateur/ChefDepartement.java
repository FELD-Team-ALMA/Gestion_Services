package eu.gestionservices.components.utilisateur;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import eu.gestionservices.Affectation;
import eu.gestionservices.ContratDeService;
import eu.gestionservices.Enseignement;
import eu.gestionservices.Module;
import eu.gestionservices.Souhait;
import eu.gestionservices.exceptions.IllegalEnseignantException;

public class ChefDepartement extends DecoratorProfesseur {

	private List<Souhait> souhaitEnAttente; // Tout les souhaits que le chef doit traiter

	/**
	 * Constructeur de ChefDepartement 
	 * @param enseignant : l'enseignant qui devient chef de departement
	 * @throws IllegalEnseignantException si l'enseignant n'a pas de departement
	 * @warning un chef de departement doit avoir un departement et est forcement chef de celui-ci
	 */
	public ChefDepartement(Enseignant enseignant) throws IllegalEnseignantException {
		super(enseignant);
		if( enseignant.getDepartement()!=null){
			this.souhaitEnAttente= new ArrayList<Souhait>();
		}else{
			throw new IllegalEnseignantException("Pour etre chef de departement on doit faire partie d'un department");
		}
			
	}
	
	/**
	 * Constructeur de ChefDepartement utilise pour transition de chef
	 * @param enseignant : l'enseignant qui devient chef de departement
	 * @param souhaitEnAttente : la liste de souhait non traiter
	 * @throws IllegalEnseignantException si l'enseignant n'a pas de departement
	 * @warning un chef de departement doit avoir un departement et est forcement chef de celui-ci
	 */
	public ChefDepartement(Enseignant enseignant, ArrayList<Souhait> souhaitEnAttente ) throws IllegalEnseignantException {
		super(enseignant); 
		if( enseignant.getDepartement()!=null){
			this.souhaitEnAttente= souhaitEnAttente;
		}else{
			throw new IllegalEnseignantException("Pour etre chef de departement on doit faire partie d'un department");
		}
			
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
		// TODO ameliore la complexite de la fonction
		if (this.souhaitEnAttente.contains(souhait)){
			int positionSouhait = this.souhaitEnAttente.indexOf(souhait); // On recupere la position de l'objet
			this.souhaitEnAttente.get(positionSouhait).publication();
		}else{ 
			throw new RuntimeException(" Ce souhait n'existe pas");
		}
	}
		
		
	/**
	 * Affecter un enseignement Ã  un enseignant
	 * @param enseignant : l'enseignant Ã  qui on affecte l'enseignement
	 * @param enseignement : l'enseignement affecter Ã  l'enseignant 
	 * @warning Marche meme si l'enseignant ne souhaitait pas cette enseignenent
	 */
	public void affecter(Enseignant enseignant, Enseignement enseignement)throws RuntimeException{
		boolean contient =false; // indique si l'enseignement en question fait partie des enseignement du departement 
		int i=0;// compteur pour parcourir une ArrayListe
		
		// Verifie si l'enseignant Ã  qui on affecte l'enseignement fait partie du departement du chef
		if (this.decorateProfesseur.getDepartement().getEnseignants().contains(enseignant)){ 
			
			while ((contient) || (i<this.decorateProfesseur.getDepartement().getListModules().size())){
				if (enseignement.getIdModule()== this.decorateProfesseur.getDepartement().getListModules().get(i).getIdModule()){
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
	
	/**
	 * Remove une affectation à un enseignant
	 * @param affectation : affectation Ã  remove
	 * @return boolean : return true si le remove a fait quelque chose
	 */
	
	public boolean removeAffectation( Affectation affectation){
		// Verifie si l'enseignant Ã  qui on affecte l'enseignement fait partie du departement du chef
		if (this.decorateProfesseur.getDepartement().getEnseignants().contains(affectation.getEnseignant())){
			return affectation.getEnseignant().getListAffectations().remove(affectation); // remove retourn un boolean indiquant si le remove a fait quelque chose		
		}else{
			return false;
		}	
	}
	
	
	
	/**
	 * Affecter l'affectation d'un enseignant Ã  un autre  
	 * @param affectation : affectation Ã  remove
	 * @param enseignant : l'enseignant Ã  qui on attribut l'affectation
	 * @return boolean : return true si l'affection existait dans la liste.
	 * @warning meme si l'ancien enseignant n'avait pas cette affectation le nouveau l'obient quand meme
	 */
	
	public boolean changeAffectation( Affectation affectation,Enseignant enseignant) throws RuntimeException{
		// Verifie si l'enseignant Ã  qui on affecte l'enseignement fait partie du departement du chef
		if (this.decorateProfesseur.getDepartement().getEnseignants().contains(affectation.getEnseignant()) &&
			this.decorateProfesseur.getDepartement().getEnseignants().contains(enseignant)){ // Verifie que les 2 enseignants appartiennent au departement
			enseignant.addAffectation(affectation);
			return affectation.getEnseignant().getListAffectations().remove(affectation); // removeretourn un boolean indiquant si le remove a fait quelque chose		
		}else{
			throw  new RuntimeException("Au moins 1 des deux enseignant n'appartient pas Ã  votre departement");
		}	
	}

	
	/**
	 * Renvoit la string du souhait specifie de la liste de souhait en attente
	 * @param souhait : le souhait d'on on veut le toString
	 * @return string : le toString() du souhait specifie
	 * @warning si le souhait n'existe pas renvoit "Le souhait n'existe pas"
	 */
	public String toStringSpecifiqueSouhait( Souhait souhait){
		
		if (this.souhaitEnAttente.contains(souhait)){
			int positionSouhait = this.souhaitEnAttente.indexOf(souhait); // On recupere la position de l'objet
			return this.souhaitEnAttente.get(positionSouhait).toString();
		}else{
			return " Le souhait n'existe pas";
		}

	}
	
	

	/**
	 * Renvoit le dernier souhait de la liste de souhait en attente
	 * @return Souhait : le dernier souhait de la liste de souhait en attente
	 * @throws throws RunTimeException si la liste de souhait en attente est vide
	 */
	public Souhait getLastSouhait() throws RuntimeException{
		
		if(!(this.souhaitEnAttente.isEmpty())){
			return this.souhaitEnAttente.get(this.souhaitEnAttente.size()-1);
		}else {
			throw new RuntimeException(" Il n'y a plus de souhait en attente");
		}
		
	}
	
	/**
	 * Renvoit le premier souhait de la liste de souhait en attente
	 * @return Souhait : le premier souhait de la liste de souhait en attente
	 * @throws throws RunTimeException si la liste de souhait en attente est vide
	 */
	public Souhait getFirstSouhait() throws RuntimeException{
		
		if(!(this.souhaitEnAttente.isEmpty())){
			return this.souhaitEnAttente.get(0);
		}else {
			throw new RuntimeException(" Il n'y a plus de souhait en attente");
		}
		
	}
	
	/**
	 * Renvoit les souhait de l'enseignant specifie
	 * @param enseignant : l'enseignant d'on on veut les souhait
	 * @return {@link Souhait}: le souhait de l'enseignant specifie
	 * @throws throws RunTimeException si l'enseignant ne fait pas partie du departement du chef de departement
	 */
	public List<Souhait> getEnseignantSouhait(Enseignant enseignant) throws RuntimeException{
		
		ArrayList<Souhait> souhaitsEnseignant= new ArrayList<Souhait>();
		
		// Verifie si l'enseignant Ã  qui on affecte l'enseignement fait partie du departement du chef
		if (this.decorateProfesseur.getDepartement().getEnseignants().contains(enseignant)){
			
			for (int i=0;i<this.souhaitEnAttente.size();++i){
				// Choppe tout les souhait de l'enseignant
				if(this.souhaitEnAttente.get(i).getExpiditeur()==enseignant){
					souhaitsEnseignant.add(this.souhaitEnAttente.get(i));
				}
			}		
			return souhaitsEnseignant;
			
		}else {
			throw new RuntimeException("L'enseignant ne fait pas partie de votre departement");
		}
		
	}
	
	
	
	/**
	 * Remove le dernier souhait des souhait en attente
	 * @throws throws RunTimeException si la liste de souhait en attente est vide
	 */
	public void removeLastSouhait() throws RuntimeException{
		
		if(!(this.souhaitEnAttente.isEmpty())){
			this.souhaitEnAttente.remove(this.souhaitEnAttente.size()-1);
		}else {
			throw new RuntimeException(" Il n'y a plus de souhait en attente");
		}
		
	}
	
	/**
	 * Remove le premier souhait des souhait en attente
	 * @throws throws RunTimeException si la liste de souhait en attente est vide
	 */
	public void removeFirstSouhait() throws RuntimeException{
		
		if(!(this.souhaitEnAttente.isEmpty())){
			this.souhaitEnAttente.remove(0);
		}else {
			throw new RuntimeException(" Il n'y a plus de souhait en attente");
		}
		
	}
	
	//------ Debut Implementation des methodes de Professeur
	
	@Override
	public List<Souhait> getListDemandes() {
		return this.decorateProfesseur.getListDemandes();
	}

	@Override
	public void makeDemande(Souhait souhait) {
		this.decorateProfesseur.makeDemande(souhait);
		
	}

	@Override
	public List<Affectation> getListAffectations() {
		return this.decorateProfesseur.getListAffectations();
	}

	@Override
	public List<Module> getListModules() {
		return this.decorateProfesseur.getListModules();
	}

	@Override
	public String getNom() {
		
		return this.decorateProfesseur.getNom();
	}

	@Override
	public String getPrenom() {
		return this.decorateProfesseur.getPrenom();
	}

	@Override
	public String getMail() {
		return this.decorateProfesseur.getMail();
	}

	@Override
	public Departement getDepartement() {
		return this.decorateProfesseur.getDepartement();
	}

	@Override
	public ContratDeService getContrat() {
		return this.decorateProfesseur.getContrat();
	}

	@Override
	public void setContrat(ContratDeService contrat) {
		this.decorateProfesseur.setContrat(contrat);
		
	}
	
	
	//------ Fin Implementation des methodes de Professeur
	
	
	
}
