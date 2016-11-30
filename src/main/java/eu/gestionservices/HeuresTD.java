package eu.gestionservices;

import eu.gestionservices.components.utilisateur.Enseignant;


public class HeuresTD {
	private int minutes;
	
	
	/**
	 * Constructeur de HeuresTD
	 * @warning minutes intialiser à 0
	 */
	public HeuresTD (){
		minutes = 0;
	}

	
	/**
	 * Constructeur de HeuresTD
	 */
	public HeuresTD(int minutes){
		this.minutes=minutes;
	}
	
	/**
	 * Get l'attribut minutes de la classe HeuresTD
	 */
	public int getMinute() {
		return minutes;
	}

	/**
	 * Equals de la classe HeuresTD
	 */
	public boolean equals(Object o) {
		if (o != null) {
			if (o instanceof HeuresTD) {
				HeuresTD heures = (HeuresTD) o;
				if (heures.minutes == this.minutes) {
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Convertie les minutes de TD en équivalent minutes de CM sachant que 1h de CM = 1h30 de TD
	 * @return minutes: un int ->nombre de minutes converties
	 * @warning les minutes sont arrondies à l'inférieur après convertion
	 */
	public int toCM(){

		
		int minutes=(int)(this.minutes*60)/90; 
		return minutes;
		
	}
	
	
	/**
	 * Convertie les minutes de TD en équivalent minutes de TP sachant que 1h de TD = 1h30 de TP
	 * @return minutes: un int -> nombre de minutes converties
	 * @warning les minutes sont arrondies à l'inferieur apres convertion et ne peut pas accepter des valeurs trop proche de MAX_VALUE
	 */
	public int toTP(){
	
		
		int minutes= (int)(this.minutes*90)/60;
		return minutes;
	}
	
	
	/**
	 * Convertie les minutes de CM  en équivalent minutes de TD sachant que 1h de CM = 1h30 de TD
	 * @return minutes: un int -> nombre de minutes converties
	 * @warning les minutes sont arrondies à l'inferieur apres convertion et ne peut pas accepter des valeurs trop proche de MAX_VALUE
	 */
	public int convertFromCM( int minutes){
	
		int min=(int)(minutes*90.0)/60;
		

		return min;
	}
	
	
	/**
	 * Convertie les minutes de TP  en équivalent minutes de TD sachant que 1h de TD = 1h30 de TP
	 * @return minutes: un int -> nombre de minutes converties
	 * @warning les minutes sont arrondies à l'inférieur après convertion et ne peut pas accepter des valeurs trop proche de MAX_VALUE
	 */
	public int convertFromTP( int minutes){
	
		int min= (int)(minutes*60)/90;
		return min;
	}
	
	
	/**
	 * Rajoute des minutes de TD à l'attribut minutes
	 * @param minutes : un int -> le nombre de minutes de TD à rajouter 
	 */
	
	public void add(int minutes){
		this.minutes+=minutes;
	}
	
	/**
	 * Rajoute des minutes de CM à l'attribut minutes en les convertissant en minutes de  TD sachant que 1h de CM = 1h30 de TD
	 * @param minutes : un int -> le nombre de minutes de CM à rajouter 
	 * @warning les minutes sont arrondies à l'inférieur après convertion et ne peut pas accepter des valeurs trop proche de MAX_VALUE
	 */
	public void addFromCM(int minutes){
		this.minutes+=convertFromCM(minutes);
	}
	
	/**
	 * Rajoute des minutes de TP à l'attribut minutes en les convertissant en minutes de TD sachant que 1h de TD = 1h30 de TP
	 * @param minutes : un int -> le nombre de minutes de TP à rajouter 
	 * @warning les minutes sont arrondies à l'inférieur après convertion et ne peut pas accepter des valeurs trop proche de MAX_VALUE
	 */
	public void addFromTP(int minutes) {
		this.minutes+=convertFromTP(minutes);
	}

	
	/**
	 * Enlève des minutes de TD à l'attribut minutes 
	 * @param minutes : un int -> le nombre de minutes de TP à soustraire 
	 */
	public void soustrait(int minutes){
		this.minutes-=minutes;
	}
	
	/**
	 * Enlève des minutes de CM à l'attribut minutes en les convertissant en minutes de  TD sachant que 1h de CM = 1h30 de TD
	 * @param minutes : un int -> le nombre de minutes de CM à soustraire 
	 * @warning les minutes sont arrondies à l'inférieur après convertion et ne peut pas accepter des valeurs trop proche de MAX_VALUE
	 */
	
	public void soustraitFromCM(int minutes){
		this.minutes-=convertFromCM(minutes);
	}
	
	/**
	 * Enlève des minutes de TP à l'attribut minutes en les convertissant en minutes de TD sachant que 1h de TD = 1h30 de TP
	 * @param minutes : un int -> le nombre de minutes de TP à rajouter 
	 * @warning les minutes sont arrondies à l'inférieur après convertion et ne peut pas accepter des valeurs trop proche de MAX_VALUE
	 */
	
	public void soustraitFromTP(int minutes){
		this.minutes-=convertFromTP(minutes);
	}
}
