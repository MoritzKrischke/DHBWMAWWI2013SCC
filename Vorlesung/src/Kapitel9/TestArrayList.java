package Kapitel9;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {


	public static void main(String[] args) {
		
		ArrayList liste = new ArrayList();

		liste.add("Hallo");
		liste.add("Müller");
		liste.add("gleich Feierabend");
		liste.add(16); //outoboxing - Integer Wrapper Klasse
		
		System.out.println(liste.size());
		
		liste.remove(1);
		
		System.out.println(liste.size());
		
		
		System.out.println(liste.get(1));
		
		
		Iterator i = liste.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		
		
		
		
	}

}
