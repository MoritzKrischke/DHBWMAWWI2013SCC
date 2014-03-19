package Kapitel6.BspBauernhof;

public abstract class Tier {

	private float gewicht;
	private String bezeichnung;
	private float groesse;
	
	public Tier(float gewicht, String bezeichnung, float groesse){
		setGewicht(gewicht);
		setBezeichnung(bezeichnung);
		setGroesse(groesse);
	}
	
	public abstract void atmen();
	
	public void fressen(){
		System.out.println("Das Tier frisst!");
	}
	
	public final void bewegen(){
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
	
	public String toString(){
		String ausgabe = "Das Tier hat die Bezeichnung " + getBezeichnung() 
				+ ", ist  " + getGewicht() + " schwer und " 
				+ getGroesse() + " groß " + super.toString();
		
		return ausgabe;
	}
	
	
}
