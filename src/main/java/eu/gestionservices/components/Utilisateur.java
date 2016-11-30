package eu.gestionservices.components;

import java.util.List;

import eu.gestionservices.Affectation;
import eu.gestionservices.Souhait;
import eu.gestionservices.Module;

/**
 * Interface pour les Utilisateurs
 * 
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 * 
 */
public interface Utilisateur {
	List<Souhait> getListDemandes();
	void makeDemande();
	List<Affectation> getListAffectations();
	List<Module> getListModules();

}
