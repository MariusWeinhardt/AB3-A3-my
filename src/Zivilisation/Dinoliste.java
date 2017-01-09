package Zivilisation;
import java.util.LinkedList;
import java.util.ListIterator;

import Dinosaurier.Dinosaurier;

public class Dinoliste {
	
	LinkedList<Dinosaurier> liste = new LinkedList<Dinosaurier>();
	void function(){
	
	
	
	//liste.add(new Dodo());
	
	for(ListIterator<Dinosaurier> iterator= liste.listIterator(); iterator.hasNext();){
		System.out.println(iterator.next());
	}
	

	
	for(ListIterator<Dinosaurier> iterator= liste.listIterator(); iterator.hasNext();){
		System.out.println(iterator.next());
	}

	}

	public void entfernen(Dinosaurier dino){
		liste.remove(dino);
	}

	public void add(Dinosaurier dino) {
		liste.add(dino);
		
	}

	
	


}

