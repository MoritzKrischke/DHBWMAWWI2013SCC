package Kapitel9.BspTressSet;

import java.util.Comparator;

public class SortierungNachnameVorname implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getNachname().compareTo(s2.getNachname()) == 0){
			if(s1.getVorname().compareTo(s2.getVorname()) == 0){
				return s1.compareTo(s2);
			}
			return s1.getVorname().compareTo(s2.getVorname());
		}
		return s1.getNachname().compareTo(s2.getNachname());
	}

}
