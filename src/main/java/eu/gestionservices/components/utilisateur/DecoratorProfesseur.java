package eu.gestionservices.components.utilisateur;

public abstract class DecoratorProfesseur implements Professeur {
	
	protected Professeur decorateProfesseur;
	
	public DecoratorProfesseur(Professeur decorateUtilisateur){
		this.decorateProfesseur=decorateUtilisateur;
	}

}
