package Zivilisation;

import Dinosaurier.Dinosaurier;
import Exceptions.NameZuKurzException;
import Karnivoren.Fleischfresser;

/**
 * Die Klasse Jaeger
 */
public class Jaeger extends Mensch {

	/**
	 * Instanziiert einen neuen jaeger
	 *
	 * @param name
	 *            der Name
	 * @throws NameZuKurzException
	 *             Wenn der name weniger wie 2 zeichen hat
	 */
	public Jaeger(String name) throws NameZuKurzException {
		super(name);
		setleben(50);
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
		if (dino instanceof Fleischfresser) {
			setReittier(dino);
			// test
			// System.out.println("Reitet "+getReittier());
		} else {
			// test
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
