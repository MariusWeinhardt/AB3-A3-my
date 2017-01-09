package Herbivoren;

import Dinosaurier.Dinosaurier;
import Exceptions.AndereArtException;
import Exceptions.GleicherDinosaurierException;
import Exceptions.GleichesGeschlechtException;

/**
 * The Klasse Triceratops verwaltet objekte dieser Klasse.
 */
public class Triceratops extends Pflanzenfresser {

	/**
	 * Instanziert einen neuen Triceratops mit 5 Stärke und 60 Leben.
	 */
	public Triceratops() {
		setstaerke(5);
		setleben(60);
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
		return "Roooow…";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Dinosaurier.Dinosaurier#paaren(Dinosaurier.Dinosaurier)
	 */
	@Override
	public Dinosaurier paaren(Dinosaurier partner) throws GleicherDinosaurierException, AndereArtException, GleichesGeschlechtException {
		if (partner.getID() % 2 != getID() % 2 && this.equals(partner)) {

			return new Triceratops();
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
