package eu.gestionservices.components;

import java.util.List;
import javax.persistence.*;

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

@Entity
public interface Utilisateur {
	List<Souhait> getListDemandes();
	void makeDemande(Souhait souhait);
	List<Affectation> getListAffectations();
	List<Module> getListModules();

}
