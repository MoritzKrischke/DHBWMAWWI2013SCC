package Kapitel9.BspTressSet;

public class Vergleichen {


	public static void main(String[] args) {
		
		
		Student s1 = new Student(123456, "Klaus", "Kinski");
		Student s2 = new Student(123456, "Klaus", "Kinski");
		
		Student sAlias = s1;
		
		System.out.println("HashCode S1: " + s1.hashCode());
		System.out.println("HashCode sAlias: " + sAlias.hashCode());
		
		System.out.println("Speicheradressen:");
		System.out.println("S1: " + s1.toString());
		System.out.println("SAlias: " + sAlias.toString());
		System.out.println("S2: " + s2.toString());
		
		
		System.out.println("HashCode S1: " + s1.hashCode());
		System.out.println("HashCode S2: " + s2.hashCode());
		
		
		System.out.println("Vergleich s1 und s2:");
		// Vergleich über Equals
		if(s1.equals(s2)){
			System.out.println("S1 und S2 sind gleich!");
		}else{
			System.out.println("S1 und S2 sind UNgleich!");
		}
		
		// Vergleich über ==
		if(s1 == s2){
			System.out.println("S1 und S2 sind gleich!");
		}else{
			System.out.println("S1 und S2 sind UNgleich!");
		}
		
		System.out.println("Vergleich s1 und sAlias:");
		// Vergleich über Equals
		if(s1.equals(sAlias)){
			System.out.println("S1 und SAlias sind gleich!");
		}else{
			System.out.println("S1 und SAlias sind UNgleich!");
		}
		
		// Vergleich über ==
		if(s1 == sAlias){
			System.out.println("S1 und SAlias sind gleich!");
		}else{
			System.out.println("S1 und SAlias sind UNgleich!");
		}
	}

}
