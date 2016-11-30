package eu.gestionservices;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Classe de test pour la classe HeuresTD
 * 
 * @author Montalvo Araya
 * @author Charles-Eric Begaudeau
 * @author Marie Delavergne
 * @author Charlène Servantie
 *
 */
public class TestHeuresTD {

	
	/**
	 * Test de la methode equals sur deux HeuresTD similaires
	 */
	@Test
	public void TestEqualsSimilaires() throws Exception{
		
		HeuresTD heuresTD= new HeuresTD(90);
		HeuresTD heuresTD2= new HeuresTD(90);
		
			
		assertEquals(true, heuresTD.equals(heuresTD2));
	
	}
	
	
	/**
	 * Test de la methode equals sur deux HeuresTD similaires
	 */
	@Test
	public void TestEqualsDifferent() throws Exception{
		
		HeuresTD heuresTD= new HeuresTD(90);
		HeuresTD heuresTD2= new HeuresTD(42);
		
			
		assertEquals(false, heuresTD.equals(heuresTD2));
	
	}
	
	

	/**
	 * Test la fonction toCM() valeur standar
	 */
	@Test
	public void TestToCM() throws Exception{
	
		HeuresTD heuresTD= new HeuresTD(90);
		HeuresTD heuresTD2= new HeuresTD(heuresTD.toCM());
		HeuresTD heuresCM= new HeuresTD(60);
			
		assertEquals(true, heuresCM.equals(heuresTD2));
	
	}
	
	
	/**
	 * Test la fonction toCM() avec 0
	 */
	@Test
	public void TestToCM0() throws Exception{
	
		HeuresTD heuresTD= new HeuresTD();
		HeuresTD heuresTD2= new HeuresTD(heuresTD.toCM());
		HeuresTD heuresCM= new HeuresTD();
			
		assertEquals(true, heuresCM.equals(heuresTD2));
	
	}
	

	/**
	 * Test la fonction toTP()
	 */
	@Test
	public void TestToTPTrue() throws Exception{
	
		HeuresTD heuresTD= new HeuresTD(60);
		HeuresTD heuresTD2= new HeuresTD(heuresTD.toTP());
		HeuresTD heuresTP= new HeuresTD(90);
			
		assertEquals(true, heuresTP.equals(heuresTD2));
	
	}
	
	/**
	 * Test la fonction toTP() avec 0
	 */
	@Test
	public void TestToTP0() throws Exception{
	
		HeuresTD heuresTD= new HeuresTD();
		HeuresTD heuresTD2= new HeuresTD(heuresTD.toTP());
		HeuresTD heuresTP= new HeuresTD();
			
		assertEquals(true, heuresTP.equals(heuresTD2));
	
	}
	
	/**
	 * Test la fonction convertFromCM()
	 */
	@Test
	public void TestconvertFromCMTrue() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(90); 
		HeuresTD heuresConvertie = new HeuresTD(heuresTD.convertFromCM(60));
			
		assertEquals(true, heuresTD.equals(heuresConvertie));
	
	}
	
	/**
	 * Test la fonction convertFromCM() avec 0
	 */
	@Test
	public void TestconvertFromCM0() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(); 
		HeuresTD heuresConvertie = new HeuresTD(heuresTD.convertFromCM(0));
			
		assertEquals(true, heuresTD.equals(heuresConvertie));
	
	}
	
	/**
	 * Test la fonction convertFromTP()
	 */
	@Test
	public void TestconvertFromTPTrue() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(60); 
		HeuresTD heuresConvertie = new HeuresTD(heuresTD.convertFromTP(90));
			
		assertEquals(true, heuresTD.equals(heuresConvertie));
	
	}
	
	/**
	 * Test la fonction convertFromTP() avedc 0
	 */
	@Test
	public void TestconvertFromTP0() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(); 
		HeuresTD heuresConvertie = new HeuresTD(heuresTD.convertFromTP(0));
			
		assertEquals(true, heuresTD.equals(heuresConvertie));
	
	}
	
	/**
	 * Test la fonction add()
	 */
	@Test
	public void TestAddTrue() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(690); 
		HeuresTD heuresTD2 = new HeuresTD(600);
		
		heuresTD2.add(90);
		assertEquals(true, heuresTD.equals(heuresTD2));
	
	}
	
	/**
	 * Test la fonction add()
	 */
	@Test
	public void TestAdd0() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(690); 
		HeuresTD heuresTD2 = new HeuresTD(690);
		
		heuresTD2.add(0);
		assertEquals(true, heuresTD.equals(heuresTD2));
	
	}
	
	/**
	 * Test la fonction addFromCM()
	 */
	@Test
	public void TestAddFromCMTrue() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(690); 
		HeuresTD heuresTD2 = new HeuresTD(600);
		
		heuresTD2.addFromCM(60);
		assertEquals(true, heuresTD.equals(heuresTD2));
	
	}
	
	/**
	 * Test la fonction addFromCM() avec 0
	 */
	@Test
	public void TestAddFromCM0() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(690); 
		HeuresTD heuresTD2 = new HeuresTD(690);
		
		heuresTD2.addFromCM(0);
		assertEquals(true, heuresTD.equals(heuresTD2));
	
	}
	
	
	/**
	 * Test la fonction addFromTP() 
	 */
	@Test
	public void TestAddFromTPTrue() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(660); 
		HeuresTD heuresTD2 = new HeuresTD(600);
		
		heuresTD2.addFromTP(90);
		assertEquals(true, heuresTD.equals(heuresTD2));
	
	}
	
	/**
	 * Test la fonction addFromTP() avec 0
	 */
	@Test
	public void TestAddFromTP0() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(660); 
		HeuresTD heuresTD2 = new HeuresTD(660);
		
		heuresTD2.addFromTP(0);
		assertEquals(true, heuresTD.equals(heuresTD2));
	
	}
	
	
	/**
	 * Test la fonction soustrait()
	 */
	@Test
	public void TestSoustraitTrue() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(600); 
		HeuresTD heuresTD2 = new HeuresTD(690);
		
		heuresTD2.soustrait(90);
		assertEquals(true, heuresTD.equals(heuresTD2));
	
	}
	
	/**
	 * Test la fonction soustrait() avec 0
	 */
	@Test
	public void TestSoustrait0() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(690); 
		HeuresTD heuresTD2 = new HeuresTD(690);
		
		heuresTD2.soustrait(0);
		assertEquals(true, heuresTD.equals(heuresTD2));
	
	}
	
	
	/**
	 * Test la fonction soustraitFromCM()
	 */
	@Test
	public void TestSoustraitFromCMTrue() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(600); 
		HeuresTD heuresTD2 = new HeuresTD(690);
		
		heuresTD2.soustraitFromCM(60);
		assertEquals(true, heuresTD.equals(heuresTD2));
	
	}
	
	/**
	 * Test la fonction soustraitFromCM() avec 0
	 */
	@Test
	public void TestSoustraitFromCM0() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(690); 
		HeuresTD heuresTD2 = new HeuresTD(690);
		
		heuresTD2.soustraitFromCM(0);
		assertEquals(true, heuresTD.equals(heuresTD2));
	
	}
	
	/**
	 * Test la fonction soustraitFromTP()
	 */
	@Test
	public void TestSoustraitFromTPTrue() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(600); 
		HeuresTD heuresTD2 = new HeuresTD(660);
		
		heuresTD2.soustraitFromTP(90);
		assertEquals(true, heuresTD.equals(heuresTD2));
	
	}
	
	/**
	 * Test la fonction soustraitFromTP() avec 0
	 */
	@Test
	public void TestSoustraitFromTP0() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(660); 
		HeuresTD heuresTD2 = new HeuresTD(660);
		
		heuresTD2.soustraitFromTP(0);
		assertEquals(true, heuresTD.equals(heuresTD2));
	
	}
	
	
}
