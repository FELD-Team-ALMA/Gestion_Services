package eu.gestionservices.components;

import java.util.List;

import eu.gestionservices.Affectation;
import eu.gestionservices.Souhait;
import eu.gestionservices.Module;

public interface Utilisateur {
	List<Souhait> getListDemandes();
	void makeDemande();
	List<Affectation> getListAffectations();
	List<Module> getListModules();

}
