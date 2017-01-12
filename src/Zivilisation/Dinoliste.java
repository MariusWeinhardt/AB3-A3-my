package Zivilisation;
import java.util.LinkedList;
import java.util.ListIterator;

import Dinosaurier.Dinosaurier;

/**
 * The Class Dinoliste.
 */
public class Dinoliste {
	
	/** The liste. */
	LinkedList<Dinosaurier> liste = new LinkedList<Dinosaurier>();
	
	/**
	 * Function.
	 */
	void function(){
	
	
	
	//liste.add(new Dodo());	

	
	for(ListIterator<Dinosaurier> iterator= liste.listIterator(); iterator.hasNext();){
		System.out.println(iterator.next());
	}

	}

	
	
	
	/**
	 * Entfernen.
	 *
	 * @param dino the dino
	 */
	public void entfernen(Dinosaurier dino){
		/*ListIterator<Dinosaurier> iterator= liste.listIterator();
		//uses iterator to delete instead of direct object reference
		while(iterator!=dino){
			iterator.next();
		}
		
		liste.remove(iterator);*/
		
		//void cancel(coolection c)
		//for timertask t: c
		//t.cancel
		
		ListIterator<Dinosaurier> iterator=liste.listIterator();
		
		for (Dinosaurier temp : liste) {
				if(temp!=dino && iterator.hasNext()){
					iterator.next();
				}
			System.out.println(temp.getName());
		}
		
		liste.remove(iterator);
	}

	
	
	
	
	/**
	 * Adds the dino at the last position.
	 *
	 * @param dino the dino
	 */
	public void add(Dinosaurier dino) {
		liste.add(dino);
		
	}

	
	


}

