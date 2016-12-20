package eu.gestionservices;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import eu.gestionservices.components.utilisateur.Departement;
import eu.gestionservices.components.utilisateur.Enseignant;

/**
 * Classe de test pour la classe Departement 
 * 
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 */





//@RunWith(MockitoJUnitRunner.class)
public class TestDepartement {
   /*
	@Mock
    private Enseignant chefDepartementNew;

    @Mock
    private Enseignant chefDepartementTransition;

    @Mock
    private String nom;
    @InjectMocks
    private Departement departement;
    */
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
    	Departement departement = new Departement("");
    	Enseignant enseignant1 = new Enseignant("a", "aa", "aaa"); 
    	try{
    		departement.setChefDepartementNew(enseignant1);
    	}catch (RuntimeException e) {
    		assertNull(departement.getChefDepartement());
		}
    	departement.addEnseignant(enseignant1);
		departement.setChefDepartementNew(enseignant1);
		assertEquals(true, departement.getChefDepartement().equals(enseignant1));
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#setChefDepartementTransition(eu.gestionservices.components.utilisateur.Enseignant)}.
     */
    @Test
    public void testSetChefDepartementTransition() throws Exception {
    	Departement departement = new Departement("");
    	Enseignant enseignant1 = new Enseignant("a", "aa", "aaa"); 
    	try{
    		departement.setChefDepartementNew(enseignant1);
    	}catch (RuntimeException e) {
    		assertNull(departement.getChefDepartement());
		}
    	departement.addEnseignant(enseignant1);
		departement.setChefDepartementNew(enseignant1);
		assertEquals(true, departement.getChefDepartement().equals(enseignant1));
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#addEnseignant(eu.gestionservices.components.utilisateur.Enseignant)}.
     */
    @Test
    public void testAddEnseignant() throws Exception {
	    Departement departement = new Departement("");
		List<Enseignant> enseignants = new ArrayList<Enseignant>();
		Enseignant enseignant1 = new Enseignant("a", "aa", "aaa"); 
		Enseignant enseignant2 = new Enseignant("b", "bb", "bbb");
		assertEquals(true, enseignants.equals(departement.getEnseignants()));

		assertEquals(true, enseignants.equals(departement.getEnseignants()));
		enseignants.add(enseignant2);
    	departement.addEnseignant(enseignant2);
		assertEquals(true, enseignants.equals(departement.getEnseignants()));
		enseignants.add(enseignant1);
    	departement.addEnseignant(enseignant1);
		assertEquals(true, enseignants.equals(departement.getEnseignants()));
		enseignants.add(enseignant2);
    	departement.addEnseignant(enseignant2);
		assertEquals(false, enseignants.equals(departement.getEnseignants()));
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#removeEnseignant(eu.gestionservices.components.utilisateur.Enseignant)}.
     */
    @Test
    public void testRemoveEnseignant() throws Exception {
    	Departement departement = new Departement("");
    	List<Enseignant> enseignants = new ArrayList<Enseignant>();
    	Enseignant enseignant1 = new Enseignant("a", "aa", "aaa"); 
    	Enseignant enseignant2 = new Enseignant("b", "bb", "bbb");
    	assertEquals(true, enseignants.equals(departement.getEnseignants()));
    	
    	assertEquals(true, enseignants.equals(departement.getEnseignants()));
    	departement.removeEnseignant(enseignant1);
    	assertEquals(true, enseignants.equals(departement.getEnseignants()));
    	enseignants.add(enseignant2);
    	departement.addEnseignant(enseignant2);
    	assertEquals(true, enseignants.equals(departement.getEnseignants()));
    	departement.removeEnseignant(enseignant1);
    	assertEquals(true, enseignants.equals(departement.getEnseignants()));
    	enseignants.remove(enseignant2);
    	departement.removeEnseignant(enseignant2);
    	assertEquals(true, enseignants.equals(departement.getEnseignants()));
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#addModule(eu.gestionservices.Module)}.
     */
    @Test
    public void testAddModule() throws Exception {
    	Departement departement = new Departement("");
    	List<Module> modules = new ArrayList<Module>();
    	Module module1 = new Module("a", "aa", "aaa", 1);
    	Module module2 = new Module("b", "bb", "bbb", 1);
    	
    	assertEquals(true, modules.equals(departement.getListModules()));
    	modules.add(module2);
    	departement.addModule(module2);
    	assertEquals(true, modules.equals(departement.getListModules()));
    	modules.add(module1);
    	departement.addModule(module1);
    	assertEquals(true, modules.equals(departement.getListModules()));
    	modules.add(module2);
    	departement.addModule(module2);
    	assertEquals(false, modules.equals(departement.getListModules()));
    }

    /**
     * Test method for {@link eu.gestionservices.components.utilisateur.Departement#removeModule(eu.gestionservices.Module)}.
     */
    @Test
    public void testRemoveModule() throws Exception {
    	Departement departement = new Departement("");
    	List<Module> modules = new ArrayList<Module>();
    	Module module1 = new Module("a", "aa", "aaa", 1);
    	Module module2 = new Module("b", "bb", "bbb", 1);
    	
    	assertEquals(true, modules.equals(departement.getListModules()));
    	departement.removeModule(module1);
    	assertEquals(true, modules.equals(departement.getListModules()));
    	modules.add(module2);
    	departement.addModule(module2);
    	assertEquals(true, modules.equals(departement.getListModules()));
    	departement.removeModule(module1);
    	assertEquals(true, modules.equals(departement.getListModules()));
    	modules.remove(module2);
    	departement.removeModule(module2);
    	assertEquals(true, modules.equals(departement.getListModules()));
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
    	Departement departement = new Departement("");
    	List<Module> modules = new ArrayList<Module>();
    	assertEquals(true, modules.equals(departement.getListModules()));
    	
    	Module module1 = new Module("a", "aa", "aaa", 1);
    	Module module2 = new Module("b", "bb", "bbb", 1);
    	Module module3 = new Module("c", "cc", "ccc", 1);
    	modules.add(module1);
    	modules.add(module2);
    	departement.addModule(module1);
    	departement.addModule(module2);
    	assertEquals(true, modules.equals(departement.getListModules()));
    	modules.add(module3);
    	assertEquals(false, modules.equals(departement.getListModules()));
        //throw new RuntimeException("not yet implemented");
    }

}
