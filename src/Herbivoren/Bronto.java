package Herbivoren;

import Dinosaurier.Dinosaurier;
import Exceptions.AndereArtException;
import Exceptions.GleicherDinosaurierException;
import Exceptions.GleichesGeschlechtException;

/**
 * Die Klasse Bronto verwaltet objekte dieser Klasse.
 *
 * @author Marius
 */

public class Bronto extends Pflanzenfresser {

	/**
	 * Instanziert einen neuen Brontor mit 8 Stärke und 130 Leben.
	 */
	public Bronto() {
		setstaerke(8);
		setleben(130);
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
		return "Duuuh…";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Dinosaurier.Dinosaurier#paaren(Dinosaurier.Dinosaurier)
	 */
	@Override
	public Dinosaurier paaren(Dinosaurier partner) throws GleicherDinosaurierException, AndereArtException, GleichesGeschlechtException {
		if (partner.getID() % 2 != getID() % 2 && (this.equals(partner))) {
			return new Bronto();
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
