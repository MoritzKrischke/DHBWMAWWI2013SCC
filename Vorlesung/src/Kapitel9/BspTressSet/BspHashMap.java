package Kapitel9.BspTressSet;

import java.util.HashMap;
import java.util.Set;

import java.util.Iterator;

public class BspHashMap {


	public static void main(String[] args) {
		
		HashMap<Integer, Student> studentenMap = new HashMap<Integer, Student>();
		
		Student s = new Student(12345, "Klaus", "Kleber");
		studentenMap.put(s.getMatrikelNr(), s);
		
		s = new Student(56273, "Gabi", "Ganz");
		studentenMap.put(s.getMatrikelNr(), s);
		
		s = new Student(85673, "Michi", "Mueller");
		studentenMap.put(s.getMatrikelNr(), s);
		
		
		studentenMap.put(123456, new Student(123456, "Hans", "Halligalli"));
		
		
		s = null;
		
		
		Student v;
		
		v = studentenMap.get(56273);
		
		System.out.println(v.getNachname());
		
		
		Set<Integer> matrikelNr = studentenMap.keySet();
		
		Iterator<Integer> i = matrikelNr.iterator();
		
		while(i.hasNext()){
			Integer matNr = i.next();
			Student u = studentenMap.get(matNr);
			System.out.println(matNr + " " + u.getNachname());
		}
		

	}

}
