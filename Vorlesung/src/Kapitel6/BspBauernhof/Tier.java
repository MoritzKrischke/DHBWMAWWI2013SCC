package Kapitel6.BspBauernhof;

public class Tier {

	private float gewicht;
	private String bezeichnung;
	private float groesse;
	
	public Tier(float gewicht, String bezeichnung, float groesse){
		setGewicht(gewicht);
		setBezeichnung(bezeichnung);
		setGroesse(groesse);
	}
	
	public void atmen(){
		System.out.println("Das Tier atmet!");
	}
	
	public void fressen(){
		System.out.println("Das Tier frisst!");
	}
	
	public void bewegen(){
		System.out.println("Das Tier bewegt sich!");
	}
	

	public float getGewicht() {
		return gewicht;
	}

	public void setGewicht(float gewicht) {
		this.gewicht = gewicht;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public float getGroesse() {
		return groesse;
	}

	public void setGroesse(float groesse) {
		this.groesse = groesse;
	}
	
	
}
