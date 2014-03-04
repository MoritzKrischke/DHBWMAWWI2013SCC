package Kapitel5.AutoBsp;

import java.util.GregorianCalendar;

public class Auto {

	private String farbe;
	private int leistung = 100;
	private String kennzeichen;
	private int baujahr;
	
	private static int autoZaehler = 0;
	
	private boolean hatBeule = false;
	
	// Definition von erlaubten Farben
	public static final String ERLAUBTE_FARBE_BLAU = "BLAU";
	public static final String ERLAUBTE_FARBE_ROT = "RED";
	public static final String ERLAUBTE_FARBE_LILA = "LILA";
	
	
	public Auto(String farbe, int leistung, String kennzeichen, int baujahr){
		this.setFarbe(farbe);
		this.setLeistung(leistung);
		this.setKennzeichen(kennzeichen);
		this.setBaujahr(baujahr);
		
		autoZaehler++;
	}
	
	public Auto(String kennzeichen, int baujahr){
		this(ERLAUBTE_FARBE_BLAU, 100, kennzeichen, baujahr);
		
	}
	
	public Auto(int leistung, String farbe){
		
	}


	public String getFarbe() {
		return farbe;
	}


	public void setFarbe(String farbe) {
		
		// Übergabeparameter in Grossbuchstaben um Tippfehler auszugleichen 
		String upperCaseFarbe = farbe.toUpperCase();
		
		if(upperCaseFarbe.equals(ERLAUBTE_FARBE_BLAU)
				|| upperCaseFarbe.equals(ERLAUBTE_FARBE_LILA)   
				|| upperCaseFarbe.equals(ERLAUBTE_FARBE_ROT)){
			this.farbe = farbe;
		}else{
			// Fehlerfall in der Validierung
			this.farbe = ERLAUBTE_FARBE_BLAU;
			System.err.println("Angegebene Farbe (\"" + upperCaseFarbe + "\") ist ung�ltig - Farbe wurde gesetzt auf: " + this.farbe);
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
			System.err.println("Angegebene Leistung (\"" + leistung + "\") ist ung�ltig - Leistung wurde gesetzt auf: " + this.leistung);
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
			System.err.println("Angegebenes Jahr (\"" + baujahr + "\") ist ung�ltig - Baujahr wurde gesetzt auf: " + this.baujahr);
		}
	}
	
	
	public void gegenTreten(){
		this.hatBeule = true;
	}
	
	public boolean hatBeule(){
		return hatBeule;
	}
	
	public static int getAutoZaehler(){
		return autoZaehler;
	}
	
}
