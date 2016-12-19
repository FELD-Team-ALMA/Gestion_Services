package eu.gestionservices.components.utilisateur;

import eu.gestionservices.ContratDeService;
import eu.gestionservices.components.Utilisateur;

public interface Professeur extends Utilisateur {
	
	public abstract String getNom();
	
	/**
	 * Getter du prénom
	 * @return un String
	 */
	public abstract String getPrenom();
	
	/**
	 * Getter de l'email
	 * @return un String
	 */
	public abstract String getMail();
	
	/**
	 * Getter du departement
	 * @return un Departement
	 */
	public abstract Departement getDepartement();
	
	/**
	 * Getter du contrat
	 * @return un String
	 */
	public abstract ContratDeService getContrat();
	
	/**
	 * Setter du contrat
	 * @return un String
	 */
	public abstract void setContrat( ContratDeService contrat);

}
