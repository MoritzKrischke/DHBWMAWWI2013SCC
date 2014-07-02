package Kapitel9.BspTressSet;

import java.util.Iterator;
import java.util.TreeSet;

public class BspObstMenge {

	
	public static void main(String[] args) {
		TreeSet<String> obst = new TreeSet<String>(new ObstByLength());
		
		obst.add("Banane");
		obst.add("Apfel");
		obst.add("Orange");
		obst.add("Nektarine");
		obst.add("Pflaume");
		
		Iterator<String> i = obst.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}

	}

}
