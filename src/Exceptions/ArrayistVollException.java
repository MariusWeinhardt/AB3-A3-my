package Exceptions;

/**
 * Die Klasse ArrayistVollException. wird nur aufgerufen wenn Ein array voll ist
 * und man versucht etwas hineinzuschreiben
 */
public class ArrayistVollException extends Exception {

	/**
	 * Instanziert eine neue Exception
	 */
	public ArrayistVollException() {
		super("Das Array ist voll !");
	}
}
