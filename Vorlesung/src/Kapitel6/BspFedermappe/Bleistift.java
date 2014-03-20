package Kapitel6.BspFedermappe;

public class Bleistift extends Stift {

	private float laenge;
	
	public Bleistift(float laenge) {
		super("grau", false, 10);
		this.laenge = laenge;
	}

	@Override
	public void schreiben(String text) {
		setFuellung(getFuellung() - (float)text.length() / 10);
		
		if(getFuellung() > 0){
			System.out.println("Geschrieben: " + text);
		}else{
			System.out.println("Der " + getFarbe() + " Bleistift ist stumpf.");
		}
	}

	public void anspitzen(){
		if(laenge > 0){
			setFuellung(10);
			laenge -= 1;
		}else{
			System.out.println("Der Bleistift ist weg!");
		}
	}
}
