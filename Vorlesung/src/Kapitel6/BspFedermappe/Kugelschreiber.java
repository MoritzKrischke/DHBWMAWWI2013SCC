package Kapitel6.BspFedermappe;

public class Kugelschreiber extends Stift {

	
	public Kugelschreiber(String farbe, float fuellung) {
		super(farbe, true, fuellung);
	}

	
	@Override
	public void schreiben(String text) {
		setFuellung(getFuellung() - (float)text.length() / 100);
		
		if(getFuellung() > 0){
			System.out.println("Geschrieben: " + text);
		}else{
			System.out.println("Der " + getFarbe() + " Kugelschreiber ist leer.");
		}
	}
	
	public void wechselMine(){
		setFuellung(100);
	}

}
