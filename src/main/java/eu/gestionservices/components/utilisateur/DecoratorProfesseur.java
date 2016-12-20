package eu.gestionservices.components.utilisateur;

import javax.persistence.*;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DISC", discriminatorType=DiscriminatorType.STRING)
public abstract class DecoratorProfesseur implements Professeur {
	
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private int id;
    
	protected Professeur decorateProfesseur;
	
	public DecoratorProfesseur(Professeur decorateUtilisateur){
		this.decorateProfesseur=decorateUtilisateur;
	}

}
