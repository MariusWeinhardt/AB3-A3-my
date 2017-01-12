package Zivilisation;

import java.util.LinkedList;
import java.util.ListIterator;

import Dinosaurier.Dinosaurier;

public class Menschliste {
	LinkedList<Mensch> liste = new LinkedList<Mensch>();
	
	void function(){
	
	
	
	//liste.add(new Dodo());
	
	for(ListIterator<Mensch> iterator= liste.listIterator(); iterator.hasNext();){
		System.out.println(iterator.next());
	}
	

	
	for(ListIterator<Mensch> iterator= liste.listIterator(); iterator.hasNext();){
		System.out.println(iterator.next());
	}

	}

	public void entfernen(Mensch mensch){
		liste.remove(mensch);
	}

	public void add(Mensch mensch) {
		liste.add(mensch);
		
	}

}
