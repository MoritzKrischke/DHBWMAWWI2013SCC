package Kapitel6.BspFedermappe;

public class Fueller extends Stift {

	
	public Fueller(String farbe, float fuellung) {
		super(farbe, false, fuellung);
	}

	
	@Override
	public void schreiben(String text) {
		setFuellung(getFuellung() - (float)text.length() / 10);
		
		if(getFuellung() > 0){
			System.out.println("Geschrieben: " + text);
		}else{
			System.out.println("Der " + getFarbe() + " Fueller ist leer.");
		}
	}
	
	public void wechselPatrone(){
		setFuellung(50);
	}

}
