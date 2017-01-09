package Herbivoren;

import Dinosaurier.Dinosaurier;
import Exceptions.AndereArtException;
import Exceptions.AnzahlZuKleinException;
import Exceptions.GleicherDinosaurierException;
import Exceptions.GleichesGeschlechtException;

/**
 * Die Klasse Dodo verwaltet objekte dieser Klasse.
 */
public class Dodo extends Pflanzenfresser {

	/**
	 * Instanziert einen neuen Dodo mit 1 Stärke und 10 Leben.
	 */
	public Dodo() {
		setstaerke(1);
		setleben(10);
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
	 * @see Dinosaurier.Dinosaurier#giblaut()
	 */
	@Override
	public String giblaut() {

		return "Gurrgurr";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Dinosaurier.Dinosaurier#paaren(Dinosaurier.Dinosaurier)
	 */
	@Override
	public Dinosaurier paaren(Dinosaurier partner) throws GleicherDinosaurierException, AndereArtException, GleichesGeschlechtException {
		// abfrage partner haben anderes geschlecht und gleicher art
		if (partner.getID() % 2 != getID() % 2 && this.equals(partner)) {

			return new Dodo();
		}
		
		if (partner.getID() % 2 == getID() % 2) {
			throw new GleichesGeschlechtException();
		}
		
		if (partner.getID() == getID()) {
			throw new GleicherDinosaurierException();
		} else {
			throw new AndereArtException();
		}

	}

	/**
	 * Picken action-Methode picken() von Dodo.
	 *
	 * @param ziel
	 *            Das ziel
	 * @throws AnzahlZuKleinException
	 *             the anzahl zu klein
	 */
	public void picken(Object ziel) throws AnzahlZuKleinException {
		action(ziel, 0, 0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return "Stärke: " + getstaerke() + " Leben: " + getleben() + " ID: " + getID()+" Name : "+getName();

	}

}
