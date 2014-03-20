package Kapitel6.BspFedermappe;

public class Federmaeppchen {

	private static Stift[] maeppchen = new Stift[5];
	
	public static void main(String[] args) {
		kaufeStifte();
		
		// jetzt schreiben wir eine lange Geschichte:
		
		for(int i = 0; i < maeppchen.length; i++){
			
			while(maeppchen[i].getFuellung() > 0){
				maeppchen[i].schreiben("Gaaaaanz lange Geschichte... " + maeppchen[i].getFuellung());
			}
			
		}

	}

	
	private static void kaufeStifte(){
		
		maeppchen[0] = new Kugelschreiber("blau", 20);
		maeppchen[1] = new Bleistift(15);
		maeppchen[2] = new Fueller("lila", 35);
		maeppchen[3] = new Bleistift(10);
		maeppchen[4] = new Kugelschreiber("schwarz", 20);
		

		
	}
	
}
