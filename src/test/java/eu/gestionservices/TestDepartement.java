package eu.gestionservices;



/**
 * Classe de test pour la classe Departement 
 * 
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import eu.gestionservices.components.utilisateur.Departement;
import eu.gestionservices.components.utilisateur.Enseignant;



@RunWith(MockitoJUnitRunner.class)
public class TestDepartement {
    @Mock
    private Enseignant chefDepartementNew;

    @Mock
    private Enseignant chefDepartementTransition;

    @Mock
    private String nom;
    @InjectMocks
    private Departement departement;

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#Departement(java.lang.String)}.
     */
    @Test
    public void testDepartement() throws Exception {
        throw new RuntimeException("not yet implemented");
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#getNomDept()}.
     */
    @Test
    public void testGetNomDept() throws Exception {
        throw new RuntimeException("not yet implemented");
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#getEnseignants()}.
     */
    @Test
    public void testGetEnseignants() throws Exception {
        throw new RuntimeException("not yet implemented");
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#getChefDepartement()}.
     */
    @Test
    public void testGetChefDepartement() throws Exception {
        throw new RuntimeException("not yet implemented");
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#setChefDepartementNew(eu.gestionservices.components.utilisateur.Enseignant)}.
     */
    @Test
    public void testSetChefDepartementNew() throws Exception {
        throw new RuntimeException("not yet implemented");
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#setChefDepartementTransition(eu.gestionservices.components.utilisateur.Enseignant)}.
     */
    @Test
    public void testSetChefDepartementTransition() throws Exception {
        throw new RuntimeException("not yet implemented");
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#addEnseignant(eu.gestionservices.components.utilisateur.Enseignant)}.
     */
    @Test
    public void testAddEnseignant() throws Exception {
        throw new RuntimeException("not yet implemented");
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#removeEnseignant(eu.gestionservices.components.utilisateur.Enseignant)}.
     */
    @Test
    public void testRemoveEnseignant() throws Exception {
        throw new RuntimeException("not yet implemented");
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#addModule(eu.gestionservices.Module)}.
     */
    @Test
    public void testAddModule() throws Exception {
        throw new RuntimeException("not yet implemented");
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#removeModule(eu.gestionservices.Module)}.
     */
    @Test
    public void testRemoveModule() throws Exception {
        throw new RuntimeException("not yet implemented");
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#getListDemandes()}.
     */
    @Test
    public void testGetListDemandes() throws Exception {
        throw new RuntimeException("not yet implemented");
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#makeDemande(eu.gestionservices.Souhait)}.
     */
    @Test
    public void testMakeDemande() throws Exception {
        throw new RuntimeException("not yet implemented");
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#getListAffectations()}.
     */
    @Test
    public void testGetListAffectations() throws Exception {
        throw new RuntimeException("not yet implemented");
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#getListModules()}.
     */
    @Test
    public void testGetListModules() throws Exception {
        throw new RuntimeException("not yet implemented");
    }

}
