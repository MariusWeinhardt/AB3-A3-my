package Dinosaurier;

import Exceptions.AndereArtException;
import Exceptions.AnzahlZuKleinException;
import Exceptions.GleicherDinosaurierException;
import Exceptions.GleichesGeschlechtException;
import Zivilisation.Mensch;
import Zivilisation.Ressource;
import Zivilisation.Stamm;

/**
 * Die Klasse Dinosaurier.
 *
 * @author Marius
 */

/**
 * 
 * Dinosaurier ist eine abstrakte Klasse die f�r die erstellung der objekte der
 * Sub klassen im Packet Herbivoren und Karnivoren veratntwortlich ist
 *
 */
public abstract class Dinosaurier {

	/** Der counter. wird bei der erstellung eines jeden objektes hochge�hlt */
	// Initialisierung der Attribute
	private static int counter;

	/** Die id. */
	private int ID;

	/** Das leben. */
	private int leben;

	/** Die staerke. */
	private int staerke;

	/** Der stamm. */
	private Stamm stamm;
	
	
	/** The name. */
	private String name;
	
	

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	private void setName(String name) {
		this.name = name;
	}

	/**
	 * Der Konsruktor von Dinosaurier ist daf�r verantwortlich jedem erstelltem
	 * objekt eine einzigartige ID zuzuweisen.
	 * 
	 * counter wird bei der erstellung eines jeden Objektes erh�ht
	 * 
	 * ID wird von counter festgelegt jedes Objekt besitzt eine andere ID.
	 *
	 */
	protected Dinosaurier() {
		// ID von counter anlegen danach counter inkrementieren
		ID = counter++;
		//wenn der name nicht explizit in der main zugewisen wird hat der dino nur eine id als namen
		name=""+ID;
	}

	/**
	 * Gibt die ID des Objektes zur�ck.
	 *
	 * @return die ID des objektes
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Gibt das leben des Objektes zur�ck.
	 *
	 * @return das leben des objektes
	 */
	public int getleben() {
		return leben;
	}

	/**
	 * Gibt die staerke des Objektes zur�ck.
	 *
	 * @return die staerke des objektes
	 */
	public int getstaerke() {
		return staerke;
	}

	/**
	 * Gibt den stamm z�ruck.
	 *
	 * @return stamm
	 */
	public Stamm getStamm() {
		return stamm;
	}

	/**
	 * Setzt das leben.
	 *
	 * @param leben
	 *            Das leben des objektes wird auf den �bergebenen wert gesetzt
	 */
	public void setleben(int leben) {
		this.leben = leben;
	}

	/**
	 * setzt denn stamm auf den �bergebenden parameter.
	 *
	 * @param stamm
	 *            �bergebener wert
	 */
	public void setStamm(Stamm stamm) {
		this.stamm = stamm;
	}

	/**
	 * Die staerke des objektes wird auf den �bergebenen wert gesetzt .
	 *
	 * @param staerke
	 *            ist der ubergebene parameter
	 */
	protected void setstaerke(int staerke) {
		this.staerke = staerke;
	}

	// action handeling f�r die verschiedenen objekte
	/**
	 * action ist daf�r verantwortlich die verschiedenen aktionen der
	 * Dinosaurier und Menschen auszuf�hren. Je nach typ des �bergebenen objekts
	 * wird das leben um einen errechneten wert verringert oder die Ressource um
	 * einen errechneten wert erh�ht.
	 * 
	 * @param Ziel
	 *            ein Objekt das entweder ein Dinosaurier eine Ressource oder
	 *            ein Mensch ist
	 * @param dmgMult
	 *            gibt den schaden multiplikator an der entweder 0,1 oder 2 ist
	 * @param harvestMult
	 *            gibt den Ernte multiplikator an der entweder 0,1 oder 2 ist
	 * @throws AnzahlZuKleinException
	 *             Wenn die Anzahl 0 oder weniger betr�gt wird diese Exception
	 *             ausgel�st
	 */
	protected void action(Object Ziel, int dmgMult, int harvestMult) throws AnzahlZuKleinException {

		if (Ziel instanceof Dinosaurier) {
			((Dinosaurier) Ziel).setleben(((Dinosaurier) Ziel).getleben() - (getstaerke() * dmgMult));
		}

		if (Ziel instanceof Mensch) {
			((Mensch) Ziel).setleben(((Mensch) Ziel).getleben() - (getstaerke() * dmgMult));
		}

		if (Ziel instanceof Ressource) {

			if (getStamm() == null) {
				System.out.println("Der Dinosaurer hat keinen Stamm und kann deshalb keine Ressourcen sammeln");
			} else {

				getStamm().verwalteRessourcen((Ressource) Ziel, (getstaerke() * harvestMult));

				((Ressource) Ziel).setanzahl(((Ressource) Ziel).getanzahl() - (getstaerke() * harvestMult));
			}

		}

	}

	/**
	 * Gibt einen String zur�ck der den laut eines Dinosauriers darstellt. In
	 * den Unterklassen implementiert
	 * 
	 * @return String
	 * 
	 */
	protected abstract String giblaut();

	/**
	 * Gibt einen neuen Dinosaurier zur�ck wenn beide partner unterschiedlichen
	 * geschlechts sind und von der gleichen Art.
	 * 
	 * @param partner
	 *            ein objekt von Dinosaurier definiert den partner
	 * @return gibt ein Objekt einer Dinosaurier Klasse zur�ck
	 * @throws AndereArtException
	 *             Wenn der Partner von einer anderen art ist als der Dino der
	 *             diese Methode aufruft wird diese Exception geworfen
	 * @throws GleicherDinosaurierException
	 *             Wenn der partner der gleiche Dinosaurier ist der auch die
	 *             Methode aufruft wird diese Exception geworfen
	 * @throws GleichesGeschlechtException
	 *             Wenn das Geschlecht des Partners und des Aufrufers gleich ist
	 */
	protected abstract Dinosaurier paaren(Dinosaurier partner)
			throws GleicherDinosaurierException, AndereArtException, GleichesGeschlechtException;

}
