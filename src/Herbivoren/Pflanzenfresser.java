package Herbivoren;

import Dinosaurier.Dinosaurier;
import Exceptions.AnzahlZuKleinException;

/**
 * Die Klasse Pflanzenfresser verwaltet die stossen Methode aller anderen Klassen im Packet Herbivoren.
 */
public abstract class Pflanzenfresser extends Dinosaurier {

	/**
	 * Instanziert einen Neuen Pflanzenfresser
	 */
	Pflanzenfresser() {
	}

	/**
	 * action-Methode stossen() von Pflanzenfresser
	 *
	 * @param Ziel
	 *            das Ziel
	 * @throws AnzahlZuKleinException
	 *             Wenn die Anzahl kleiner oder gleich 0 ist
	 */
	public void stossen(Object Ziel) throws AnzahlZuKleinException {
		action(Ziel, 1, 2);

	}

}
