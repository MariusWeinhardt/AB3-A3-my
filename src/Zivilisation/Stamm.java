package Zivilisation;

import java.util.LinkedList;

import Dinosaurier.Dinosaurier;
import Exceptions.AnzahlZuKleinException;
import Exceptions.ArrayistLeerException;
import Exceptions.ArrayistVollException;
import Exceptions.NameZuKurzException;

/**
 * Die Klasse Stamm.
 *
 * @author Marius
 */

/**
 * Die Klasse Stamm verwaltet Menschen und Dinosaurier und verwaltet außerdem
 * auch noch ressourcen
 * 
 */
public class Stamm {

	/** Der namen. */
	String namen;

	/** Die ressourcen. */
	private Ressource[] ressourcen = new Ressource[10];
	
	/** Die mitglieder. */
	private Menschenhashset Hashset = new Menschenhashset() ;
	
	/** The liste. */
	private Dinoliste Liste= new Dinoliste<Dinosaurier>(); 

	/** Die dinos. */

	/**
	 * Intiiert einen neuen Stamm
	 *
	 * @param namen
	 *            der namen
	 * @throws NameZuKurzException
	 *             wenn der name zu kurz ist weniger wie 2 zeichen hat
	 */
	public Stamm(String namen) throws NameZuKurzException {
		if (namen.length() >= 2)
			this.namen = namen;
		else
			throw new NameZuKurzException();
	}

	/**
	 * Setzt den namen.
	 *
	 * @param namen
	 *            der neue name
	 */
	private void setNamen(String namen) {

		this.namen = namen;

	}

	/**
	 * gibt den zurück namen.
	 *
	 * @return der namen
	 */
	public String getNamen() {
		return namen;
	}

	/**
	 * löscht menschen aus dem mitglieder array und richtet es neu aus
	 *
	 * @param mensch
	 *            der Mensch
	 * @throws ArrayistLeerException
	 *             wenn das Array leer ist
	 */
	// try catch wenn mensch nicht im array vorkommt
	public void ausStammEntlassen(Mensch mensch) throws ArrayistLeerException {
		//entfernenhashset();
	}

	/**
	 * mitglied Hinzufügen fügt in das bergebene objekte in das array ein.
	 *
	 * @param mensch
	 *            das übergebende objekt wird in das array mitglieder
	 *            aufgenommen
	 * @throws ArrayistVollException
	 *             the arrayist voll
	 */
	public void mitgliedHinzufuegen(Mensch mensch) throws ArrayistVollException {
		//hinzufügenhasset();
	}

	/**
	 * Verwalte ressourcen fügt dem array ressourcen hinzu.
	 *
	 * @param ressource
	 *            the ressource
	 * @param anzahl
	 *            the anzahl
	 * @throws AnzahlZuKleinException
	 *             the anzahl zu klein
	 */
	public void verwalteRessourcen(Ressource ressource, int anzahl) throws AnzahlZuKleinException {
		int zähler = 0;
		// null pointer exception da er auf getname der ressource zugreift die
		// man noch nicht erstellt hat
		try {
			if (ressourcen[0] == null) {
				ressourcen[0] = new Ressource(ressource.getname(), anzahl);
			} else {

				if (ressourcen != null) {
					while (ressourcen[zähler].getname() != ressource.getname()) {
						zähler++;
					}

					ressourcen[zähler].setanzahl(ressourcen[zähler].getanzahl() + anzahl);
				}
			}

		} catch (NullPointerException e) {
			zähler = 0;
			while (ressourcen[zähler] != null) {
				zähler++;
			}
			ressourcen[zähler] = new Ressource(ressource.getname(), anzahl);
		}

	}

	/**
	 * Verwildern löscht dinos aus dem dinos array und richtet es neu aus.
	 *
	 * @param dino
	 *            der dino
	 * @throws ArrayistLeerException
	 *             die arrayliste ist leer
	 */
	// läuft über dinoliste
	public void verwildern(Dinosaurier dino) {
		dino.setStamm(null);
		Liste.remove(dino);
	}

	/**
	 * Zaehmen fügt dem dinos array einen dino hinzu.
	 *
	 * @param dino
	 *            objekt wird dem array hinzugefügt
	 * @throws ArrayistVollException
	 *             wenn das Arrayvollist
	 */
	public void zaehmen(Dinosaurier dino) {
		if(dino.getStamm()==null){
			dino.setStamm(this);
			Liste.addFirst(dino);
		}
		
		
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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String mitglieders = "";
		String dinoss = "";
		String ressourcens = "";
		int zähler = 0;

	//mitgliederausgabe
		zähler = 0;
		
		//ausgabe umschreiben
		/*
		while (dinos[zähler] != null) {
			dinoss = dinoss + dinos[zähler].getID() + " ";
			zähler++;
		}
	*/
		//listenausgabe dinos
			System.out.println(Liste.toString());
	
		
		zähler = 0;
		while (ressourcen[zähler] != null) {
			ressourcens = ressourcens + ressourcen[zähler].getname() + " " + ressourcen[zähler].getanzahl() + " ";
			zähler++;
		}

		return "Name: " + getNamen() + " Mitglieder: " + mitglieders + " Dinos: " + dinoss + " Ressourcen: "
				+ ressourcens;
	}

	/**
	 * @return the liste
	 */
	public Dinoliste getListe() {
		return Liste;
	}

	/**
	 * @param liste the liste to set
	 */
	public void setListe(Dinoliste liste) {
		Liste = liste;
	}

}
