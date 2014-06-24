package Kapitel9.BspTressSet;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;

public class BspStudentenListe {
	
	public static void main(String[] args) {
		ArrayList<Student> studenten = new ArrayList<Student>();
		
		studenten.add(new Student(12345, "Klaus", "Kleber"));
		studenten.add(new Student(12389, "Gabi", "Gausel"));
		studenten.add(new Student(11111, "Ulf", "Uhu"));
		studenten.add(new Student(12111, "Lisa", "Hihi"));
		studenten.add(new Student(12389, "Rudi", "Müller"));
	
		
		Iterator<Student> i = studenten.iterator();
		
		System.out.println("Erste Ausgabe:");
		while(i.hasNext()){
			Student s = i.next();
			System.out.println(s.getMatrikelNr() + ": " + s.getNachname() + ", " + s.getVorname());
		}
		
		Collections.sort(studenten);
		
		i = studenten.iterator();
		
		System.out.println("Zweite Ausgabe:");
		while(i.hasNext()){
			Student s = i.next();
			System.out.println(s.getMatrikelNr() + ": " + s.getNachname() + ", " + s.getVorname());
		}
		
		Collections.sort(studenten, new SortierungLaenge());
		
		i = studenten.iterator();
		
		System.out.println("Dritte Ausgabe:");
		while(i.hasNext()){
			Student s = i.next();
			System.out.println(s.getMatrikelNr() + ": " + s.getNachname() + ", " + s.getVorname());
		}
		
	}

}
