package Kapitel7.Reisebuero;

public class Reisebuero {

	
	public static void main(String[] args){
	
		Reservierung reservieren1 = gibMirWasZumBuchen();
		
		//reservieren1.fliegen();
		
		System.out.println(reservieren1.freiePlaetze());
		
		try{
			reservieren1.buchePlaetze(-5);
		}catch(UngueltigeAnzahl e){
			System.out.println("Fehler 2");
		}catch(Exception e){
			System.out.println("Fehler 1 : " + e.getMessage());
		}
		
		System.out.println(reservieren1.freiePlaetze());
		
		
	}
	
	public static Reservierung gibMirWasZumBuchen(){
		
		
		return new Konzert(2500); //Flugzeug(25, 4);
		
	}

}
