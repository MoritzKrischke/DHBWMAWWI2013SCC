package Kapitel9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import Kapitel5.AutoBsp.Auto;
import Kapitel6.BspBauernhof.*;

public class TestArrayList {


	public static void main(String[] args) {
		
		ArrayList<Auto> liste = new ArrayList<Auto>();

		Auto meinAuto = new Auto(175, Auto.ERLAUBTE_FARBE_LILA);
		
		
		liste.add(meinAuto);
		
		//liste.add("Hallo");
		//liste.add("Müller");
		//liste.add("gleich Feierabend");
		liste.add(meinAuto);
		//liste.add(16); //autoboxing - Integer Wrapper Klasse
		
		System.out.println(liste.size());
		
		liste.remove(1);
		
		System.out.println(liste.size());
		
		
		//System.out.println(liste.get(1));
		
		
		System.out.println("Listenausgabe:");

		Iterator<Auto> i = liste.iterator();
		
		while(i.hasNext()){
			Auto auto = i.next();

				auto.gegenTreten();
				System.out.println(auto.hatBeule());

			System.out.println(auto);
			//i.next();
		}
		
		while(liste.remove(meinAuto)){
			
		}
		
		System.out.println("Listenausgabe:");		
 		i = liste.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
			//i.next();
		}
		
		
	}

}
