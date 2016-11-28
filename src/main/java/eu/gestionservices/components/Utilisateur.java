package eu.gestionservices.components;

<<<<<<< HEAD
public interface Utilisateur {
	void getListDemandes();
	void makeDemande();
	void getListAffectations();
	void getListModules();
=======
import java.util.List;

import eu.gestionservices.Affectation;
import eu.gestionservices.Demande;
import eu.gestionservices.Module;

public interface Utilisateur {
	List<Demande> getListDemandes();
	void makeDemande();
	List<Affectation> getListAffectations();
	List<Module> getListModules();
>>>>>>> 1a9f109fcea9cf44c36ccf99508db3b5786c2038

}
