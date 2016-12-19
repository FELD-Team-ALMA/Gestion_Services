package eu.gestionservices.components.utilisateur;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import eu.gestionservices.Affectation;
import eu.gestionservices.Souhait;
import eu.gestionservices.Module;
import eu.gestionservices.components.Utilisateur;
import eu.gestionservices.exceptions.IllegalEnseignantException;


/**
 * Classe repr√©sentant les d√©partements : entit√© administrative identifi√©e
 * par un nom. Il comprend un ensemble de modules et d'enseignements qui lui
 * sont rattach√©s. Chaque d√©partement a pour responsable un chef de d√©partement
 * Plusieurs enseignants peuvent donner des enseignements pour le compte de
 * chaque d√©partement
 * 
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charl√®ne Servantie
 *
 */
public class Departement implements Utilisateur{
	private String nom;
	private ChefDepartement chefDepartement; // Il fait aussi partie des eneignant du departement
	private List<Enseignant> enseignants;
	private List<Module> modules;
	/**
	 * Constructeur de Departement (aucun chef definit)
	 * @param nom : un String pour le nom du departement
	 * @warning le departement n'a pas encore de chef
	 */
	public Departement(String nom) {
		this.nom = nom;
		this.enseignants = new ArrayList<Enseignant>();
		this.modules= new ArrayList<Module>();
	}
	

	/**
	 * Getter pour le nom du d√©partement
	 * @return un String
	 */
	public String getNomDept() {
		return nom;
	}

	/**
	 * @return the chefDepartement
	 */
	public List<Enseignant> getEnseignants() {
		return enseignants;
	}

	/**
	 * @return the chefDepartement
	 */
	public ChefDepartement getChefDepartement() {
		return chefDepartement;
	}

	/**
	 * Definit le chef de departement quand le departement n'avait pas encore de chef
	 * @param chefDepartement : l'Enseignant qui devient le chef
	 * @warning le chef doit Ítre un enseignant du departement
	 */
	public void setChefDepartementNew(Enseignant chefDepartement) throws RuntimeException {
		if (enseignants.contains(chefDepartement)){
			try { // Le constructeur de Enseignant lance une exception si on donne les mauvais paramËtre il faut s'en occuper
				
				this.chefDepartement = new ChefDepartement(chefDepartement);
				
			} catch (IllegalEnseignantException e) {
				// TODO Auto-generated catch block
			}
		} else {
				throw new RuntimeException("Cette enseignant ne fait pas encore partie du departement il ne peut pas encor etre chef");
			}
	}
		
	
	/**
	 * Definit le chef de departement quand le departement en avait deja un ( pour ne pas perdre les souhait en attente)
	 * @param chefDepartement : l'Enseignant qui devient le chef
	 * @warning le chef doit Ítre un enseignant du departement
	 */
	public void setChefDepartementTransition(Enseignant chefDepartement) throws RuntimeException {
		if (enseignants.contains(chefDepartement)){
			try { // Le constructeur de Enseignant lance une exception si on donne les mauvais paramËtre il faut s'en occuper
				ArrayList<Souhait> souhaitRestants= (ArrayList<Souhait>) this.chefDepartement.getSouhaitEnAttente(); 
				// On recupere les souhaits pas encore gere pas le precedent chef
				this.chefDepartement = new ChefDepartement(chefDepartement,souhaitRestants);
				
			} catch (IllegalEnseignantException e) {
				// TODO Auto-generated catch block
			}
		} else {
				throw new RuntimeException("Cette enseignant ne fait pas encore partie du departement il ne peut pas encor etre chef");
			}
	}


	/**
	 * Ajout d'un enseignant au d√©partement
	 * @param e : Enseignant ‡ add
	 */
	public void addEnseignant(Enseignant e) {
		if (!enseignants.contains(e)) {
			enseignants.add(e);
		}
	}
	
	/**
	 * Retrait d'un enseignant du d√©partement
	 * @param e : Enseignant ‡ remove
	 */
	
	public void removeEnseignant(Enseignant e) {
		if (enseignants.contains(e)) {
			enseignants.remove(e);
		}
	}
	
	/**
	 * Ajout d'un module au departement
	 * @param m : Module ‡ add
	 */
	public void addModule(Module m) {
		if (!this.modules.contains(m)) {
			modules.add(m);
		}
	}
	
	/**
	 * Retrait d'un Module au departement
	 * @param m : Module ‡ remove
	 */
	
	public void removeModule(Module m) {
		if (!this.modules.contains(m)) {
			this.modules.remove(m);
		}
	}
	

	@Override
	public List<Souhait> getListDemandes() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeDemande(Souhait souhait) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Affectation> getListAffectations() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Module> getListModules() {
		return this.modules;		
	}


}
