package Kapitel4.Uebungen;

public class Fakultaet {

	public static void main(String[] args) {
		
		int z = 4;
		
		System.out.print("!z = ");
		
		int erg = 1;
		
		while(z > 0){
			erg *= z--;
		}
		
		System.out.println(erg);
		
	}

}
