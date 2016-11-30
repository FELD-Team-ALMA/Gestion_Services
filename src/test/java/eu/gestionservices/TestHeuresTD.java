package eu.gestionservices;

import static org.junit.Assert.*;

import org.junit.Test;

import eu.gestionservices.exceptions.IllegalEnseignantException;

public class TestHeuresTD {

	

	/**
	 * Test la fonction toCM()
	 */
	@Test
	public void TestToCMTrue() throws Exception{
	
		HeuresTD heuresTD= new HeuresTD(90);
		HeuresTD heuresTD2= new HeuresTD(heuresTD.toCM());
		HeuresTD heuresCM= new HeuresTD(60);
			
		assertEquals(true, heuresCM.equals(heuresTD2));
	
	}
	
	
	/**
	 * Test la fonction toCM() 
	 */
	@Test
	public void TestToCMFalse() throws Exception{
	
		HeuresTD heuresTD= new HeuresTD(95);
		HeuresTD heuresTD2= new HeuresTD(heuresTD.toCM());
		HeuresTD heuresCM= new HeuresTD(60);
			
		assertEquals(false, heuresCM.equals(heuresTD2));
	
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
	 * Test la fonction toTP()
	 */
	@Test
	public void TestToTPFalse() throws Exception{
	
		HeuresTD heuresTD= new HeuresTD(42);
		HeuresTD heuresTD2= new HeuresTD(heuresTD.toTP());
		HeuresTD heuresTP= new HeuresTD(90);
			
		assertEquals(false, heuresTP.equals(heuresTD2));
	
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
	 * Test la fonction convertFromCM()
	 */
	@Test
	public void TestconvertFromCMFalse() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(90); 
		HeuresTD heuresConvertie = new HeuresTD(heuresTD.convertFromCM(42));
			
		assertEquals(false, heuresTD.equals(heuresConvertie));
	
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
	 * Test la fonction convertFromTP()
	 */
	@Test
	public void TestconvertFromTPFalse() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(60); 
		HeuresTD heuresConvertie = new HeuresTD(heuresTD.convertFromTP(98));
			
		assertEquals(false, heuresTD.equals(heuresConvertie));
	
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
	public void TestAddFalse() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(690); 
		HeuresTD heuresTD2 = new HeuresTD(660);
		
		heuresTD2.add(90);
		assertEquals(false, heuresTD.equals(heuresTD2));
	
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
	 * Test la fonction addFromCM()
	 */
	@Test
	public void TestAddFromCMFalse() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(690); 
		HeuresTD heuresTD2 = new HeuresTD(600);
		
		heuresTD2.addFromCM(90);
		assertEquals(false, heuresTD.equals(heuresTD2));
	
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
	 * Test la fonction addFromTP()
	 */
	@Test
	public void TestAddFromTPFalse() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(660); 
		HeuresTD heuresTD2 = new HeuresTD(600);
		
		heuresTD2.addFromTP(60);
		assertEquals(false, heuresTD.equals(heuresTD2));
	
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
	 * Test la fonction soustrait()
	 */
	@Test
	public void TestSoustraitFalse() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(600); 
		HeuresTD heuresTD2 = new HeuresTD(690);
		
		heuresTD2.soustrait(60);
		assertEquals(false, heuresTD.equals(heuresTD2));
	
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
	 * Test la fonction soustraitFromCM()
	 */
	@Test
	public void TestSoustraitFromCMFalse() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(600); 
		HeuresTD heuresTD2 = new HeuresTD(690);
		
		heuresTD2.soustraitFromCM(90);
		assertEquals(false, heuresTD.equals(heuresTD2));
	
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
	 * Test la fonction soustraitFromTP()
	 */
	@Test
	public void TestSoustraitFromTPFalse() throws Exception{
		
		HeuresTD heuresTD = new HeuresTD(600); 
		HeuresTD heuresTD2 = new HeuresTD(660);
		
		heuresTD2.soustraitFromTP(60);
		assertEquals(false, heuresTD.equals(heuresTD2));
	
	}
	
	
}
