package Exceptions;

// TODO: Auto-generated Javadoc
/**
 * Die Klasse GleicherDinosaurierException. wird nur in paaren() geworfen wenn
 * der dinosaurier versucht sich mit sich selbst zu paaren
 */
public class GleicherDinosaurierException extends Exception {

	/**
	 * Instanziert eine neue Exception.
	 */
	public GleicherDinosaurierException() {
		super("Dinosaurier können sich nicht mit sich selbst Paaren !");
	}
}
