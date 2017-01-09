package Zivilisation;

import Dinosaurier.Dinosaurier;
import Exceptions.NameZuKurzException;
import Herbivoren.Pflanzenfresser;

/**
 * Die Klasse Sammler.
 */
public class Sammler extends Mensch {

	/**
	 * Instanziiert einen neuen Sammler.
	 *
	 * @param name
	 *            der name
	 * @throws NameZuKurzException
	 *             wenn der name weniger wie 2 zeichen hat
	 */
	public Sammler(String name) throws NameZuKurzException {
		super(name);
		setleben(25);
		setAlter(20);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object ziel) {
		if (ziel.getClass() != getClass()) {
			return false;
		}

		return true;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Zivilisation.Mensch#reiten(Dinosaurier.Dinosaurier)
	 */
	@Override
	public void reiten(Dinosaurier dino) {
		if (dino instanceof Pflanzenfresser) {
			setReittier(dino);
			// testAusgaben
			// System.out.println("Reitet "+reittier);
		} else {
			// Test Ausgabe
			// System.out.println("Nicht möglich");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String stamms = "";

		stamms = "Name: " + getName() + " Leben: " + getleben() + " Alter: " + getAlter();
		if (getStamm() != null)
			stamms = stamms + " Stamm: " + getStamm().getNamen();
		stamms = stamms + " Reittier: " + getReittier().getClass() + " " + getReittier();

		return stamms;
	}
}
