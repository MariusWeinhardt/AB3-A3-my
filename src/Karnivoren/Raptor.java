package Karnivoren;

import Dinosaurier.Dinosaurier;
import Exceptions.AndereArtException;
import Exceptions.GleicherDinosaurierException;
import Exceptions.GleichesGeschlechtException;

// TODO: Auto-generated Javadoc
/**
 * Die Klasse Raptor verwaltet objekte dieser Klasse
 */
public class Raptor extends Fleischfresser {

	/**
	 * Instanziert einen Neuen Raptor mit Stärke 6 und leben 40
	 */
	public Raptor() {
		setstaerke(6);
		setleben(40);
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
		// TODO Auto-generated method stub
		return "GRRR!";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Dinosaurier.Dinosaurier#paaren(Dinosaurier.Dinosaurier)
	 */
	@Override
	public Dinosaurier paaren(Dinosaurier partner) throws GleicherDinosaurierException, AndereArtException, GleichesGeschlechtException {
		if (partner.getID() % 2 != getID() % 2 && this.equals(partner)) {

			return new Raptor();
		
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
