package eu.gestionservices.components;

import java.util.List;

import eu.gestionservices.Affectation;
import eu.gestionservices.Demande;
import eu.gestionservices.Module;

public interface Utilisateur {
	List<Demande> getListDemandes();
	void makeDemande();
	List<Affectation> getListAffectations();
	List<Module> getListModules();

}
