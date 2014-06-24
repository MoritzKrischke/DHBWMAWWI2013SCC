package Kapitel9.BspTressSet;

import java.util.Comparator;

public class SortierungLaenge implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
		if(s1.getNachname().length() != s2.getNachname().length()){
			return s1.getNachname().length() - s2.getNachname().length();
		}
		if(s1.getVorname().length() != s2.getVorname().length()){
			return s1.getVorname().length() - s2.getVorname().length();
		}
		
		return s1.compareTo(s2);
	}

}
