package Exceptions;

/**
 * Die Klasse GleichesGeschlechtException wird nur geworfen wenn das Geschlecht
	 * der Dinosaurier beim paarungsversuch gleich ist..
 */
public class GleichesGeschlechtException extends Exception {

	/**
	 * Instanziiert einen Neue Exception wird nur geworfen wenn das Geschlecht
	 * der Dinosaurier beim paarungsversuch gleich ist.
	 */
	public GleichesGeschlechtException() {
		super("Die Dinosaurier haben das Gleiche Geschlecht und knnen sich daher nicht paaren !");
	}
}
