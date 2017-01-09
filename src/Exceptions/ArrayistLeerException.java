package Exceptions;

/**
 * Die Klasse ArrayistLeerException. wird nur aufgerufen wenn ein Array leer ist
 * und man versucht etwas herauszul�schen
 */
public class ArrayistLeerException extends Exception {

	/**
	 * Instanziert eine neue Exception
	 */
	public ArrayistLeerException() {
		super("Das Array enth�lt keine Elemente");
	}
}
