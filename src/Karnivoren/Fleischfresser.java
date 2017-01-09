package Karnivoren;

import Dinosaurier.Dinosaurier;
import Exceptions.AnzahlZuKleinException;

/**
 * Die Klasse Fleischfresser verwaltet die angreifen Methode aller anderen Klassen im Packet Karnivoren.
 */
public abstract class Fleischfresser extends Dinosaurier {

	/**
	 * Instanziert einen neuen Fleischfresser.
	 */
	protected Fleischfresser() {
	}

	/**
	 * action-Methode angreifen() von Pflanzenfresser
	 *
	 * @param Ziel
	 *            das Ziel
	 * @throws AnzahlZuKleinException
	 *             Wenn die Anzahl kleiner oder gleich 0 ist
	 */
	public void angreifen(Object Ziel) throws AnzahlZuKleinException {
		action(Ziel, 2, 1);
	}
}
