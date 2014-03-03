package Kapitel5.AutoBsp;

import java.util.GregorianCalendar;

public class Auto {

	private String farbe;
	private int leistung;
	private String kennzeichen;
	private int baujahr;
	
	private boolean hatBeule = false;
	
	// Definition von erlaubten Farben
	public final String ERLAUBTE_FARBE_BLAU = "BLAU";
	public final String ERLAUBTE_FARBE_ROT = "ROT";
	public final String ERLAUBTE_FARBE_LILA = "LILA";
	
	
	public Auto(String farbe, int leistung, String kennzeichen, int baujahr){
		this.setFarbe(farbe);
		this.setLeistung(leistung);
		this.setKennzeichen(kennzeichen);
		this.setBaujahr(baujahr);
	}


	public String getFarbe() {
		return farbe;
	}


	public void setFarbe(String farbe) {
		
		// Übergabeparameter in Großbuchstaben um Tippfehler auszugleichen 
		String upperCaseFarbe = farbe.toUpperCase();
		
		if(upperCaseFarbe == ERLAUBTE_FARBE_BLAU
				|| upperCaseFarbe == ERLAUBTE_FARBE_LILA  
				|| upperCaseFarbe == ERLAUBTE_FARBE_ROT ){
			this.farbe = farbe;
		}else{
			// Fehlerfall in der Validierung
			this.farbe = ERLAUBTE_FARBE_BLAU;
			System.err.println("Angegebene Farbe (\"" + upperCaseFarbe + "\") ist ungültig - Farbe wurde gesetzt auf: " + this.farbe);
		}
		
		
	}


	public int getLeistung() {
		return leistung;
	}


	protected void setLeistung(int leistung) {
		
		// setzen einer Standardleistung
		this.leistung = 100;
				
		// Validierung der Leistung
		if(leistung >= 50 && leistung <= 250){
			// Erfolgreiche Validierung
			this.leistung = leistung;
		}else{
			// Fehlerfall in der Validierung
			System.err.println("Angegebene Leistung (\"" + leistung + "\") ist ungültig - Leistung wurde gesetzt auf: " + this.leistung);
		}
		
	}


	public String getKennzeichen() {
		return kennzeichen;
	}


	protected void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}


	public int getBaujahr() {
		return baujahr;
	}


	private void setBaujahr(int baujahr) {
		
		int aktuellesJahr = new GregorianCalendar().get(GregorianCalendar.YEAR);
		
		this.baujahr = aktuellesJahr;
		
		// Validierung des Jahres 
		if(baujahr >= 1886 && baujahr <= aktuellesJahr){
			this.baujahr = baujahr;
		}else{
			// Fehlerfall in der Validierung
			System.err.println("Angegebenes Jahr (\"" + baujahr + "\") ist ungültig - Baujahr wurde gesetzt auf: " + this.baujahr);
		}
	}
	
	
	public void gegenTreten(){
		this.hatBeule = true;
	}
	
	public boolean hatBeule(){
		return hatBeule;
	}
	
	
}
