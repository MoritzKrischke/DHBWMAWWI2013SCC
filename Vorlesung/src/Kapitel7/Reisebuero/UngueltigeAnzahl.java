package Kapitel7.Reisebuero;

public class UngueltigeAnzahl extends Exception {

	public UngueltigeAnzahl(int anzahl) {
		super("Die Anzahl " + anzahl + " ist ungueltig! Anzahl > 0");
	}
	
}
