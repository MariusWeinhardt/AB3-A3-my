package Karnivoren;

import Dinosaurier.Dinosaurier;
import Exceptions.AndereArtException;
import Exceptions.GleicherDinosaurierException;
import Exceptions.GleichesGeschlechtException;

/**
 * Die Klasse Rex verwaltet objekte dieser Klasse.
 *
 * @author Marius
 */
public class Rex extends Fleischfresser {

	/**
	 * Instanziert einen neuen Rex mit staerke 10 und leben 100
	 */
	public Rex() {
		setstaerke(10);
		setleben(100);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object ziel) {
		// try catch
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
		return "ROOAAR!!!";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Dinosaurier.Dinosaurier#paaren(Dinosaurier.Dinosaurier)
	 */
	@Override
	public Dinosaurier paaren(Dinosaurier partner)
			throws GleicherDinosaurierException, AndereArtException, GleichesGeschlechtException {
		if (partner.getID() % 2 != getID() % 2 && this.equals(partner)) {

			return new Rex();
		}

		if (partner.getID() == getID()) {
			throw new GleicherDinosaurierException();
		}

		if (partner.getID() % 2 == getID() % 2) {
			throw new GleichesGeschlechtException();
		}

		else {
			throw new AndereArtException();
		}
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
