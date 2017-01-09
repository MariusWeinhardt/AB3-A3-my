package Exceptions;

/**
 * Die Klasse AndereArtException diese Exception wird nur in der Methode
 * paaren() des Dinosaurierrs aufgerufen wenn der Dinosaurier versucht sich mit
 * einem Dino der gleichen Art zu paaren
 */
public class AndereArtException extends Exception {
	/**
	 * Instantiert eine neue Exception
	 */
	public AndereArtException() {
		super("Dinosaurier k�nnen sich nicht Arten�bergreifend Paaren !");
	}

}
