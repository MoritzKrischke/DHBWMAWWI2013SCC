package Kapitel7.Reisebuero;

public class Reisebuero {

	
	public static void main(String[] args) {
	
		Reservierung reservieren1 = gibMirWasZumBuchen();
		
		//reservieren1.fliegen();
		
		System.out.println(reservieren1.freiePlaetze());
		
		reservieren1.buchePlaetze(27);
		
		System.out.println(reservieren1.freiePlaetze());
		
		
	}
	
	public static Reservierung gibMirWasZumBuchen(){
		
		
		return new Konzert(2500); //Flugzeug(25, 4);
		
	}

}
