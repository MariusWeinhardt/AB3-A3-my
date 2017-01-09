package Exceptions;

/**
 * Die Klasse AnzahlZuKleinException Die Exception wird nur geworfen wenn eine
 * Anzahl kleiner oder gleich 0 ist
 */
public class AnzahlZuKleinException extends Exception {
	/**
	 * Instanziert eine neue Exception.
	 * 
	 */
	public AnzahlZuKleinException() {
		super("Die Anzahl ist kleiner oder gleich 0 !");
	}

}
