package Kapitel9.BspTressSet;

import java.util.Iterator;
import java.util.TreeSet;

public class BspTreeSet {


	public static void main(String[] args) {
		
		TreeSet<Student> menge = new TreeSet<Student>();
		
		
		menge.add(new Student(12345, "Klaus", "Kleber"));
		menge.add(new Student(12389, "Gabi", "Gausel"));
		menge.add(new Student(11111, "Ulf", "Uhu"));
		menge.add(new Student(12111, "Lisa", "Hihi"));
		
		Iterator<Student> i = menge.iterator();
		
		while(i.hasNext()){
			Student s = i.next();
			System.out.println(s.getMatrikelNr() + ": " + s.getNachname() + ", " + s.getVorname());
		}
		
	}

}
