package Exceptions;

/**
 * Die Klasse NameZuKurzException. wird aufgerufen wenn ein name k�rzer wie 2
 * zeichen ist.
 */
public class NameZuKurzException extends Exception {

	/**
	 * Instanziert eine neue Exception.
	 */
	public NameZuKurzException() {
		super("Der Name enth�lt weniger als 2 Zeichen !");
	}
}
