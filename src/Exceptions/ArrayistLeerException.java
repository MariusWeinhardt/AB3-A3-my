package Exceptions;

/**
 * Die Klasse ArrayistLeerException. wird nur aufgerufen wenn ein Array leer ist
 * und man versucht etwas herauszulöschen
 */
public class ArrayistLeerException extends Exception {

	/**
	 * Instanziert eine neue Exception
	 */
	public ArrayistLeerException() {
		super("Das Array enthält keine Elemente");
	}
}
