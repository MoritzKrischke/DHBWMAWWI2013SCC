package Kapitel7.Reisebuero;

public class NichtGenugFreiePlaetze extends Exception {

	public NichtGenugFreiePlaetze(int freiePlaetze) {
		super("Nicht genug freie Plaetze! Es sind noch " + freiePlaetze + " Plaetze frei");
	}
	
}
