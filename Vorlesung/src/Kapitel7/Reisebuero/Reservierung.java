package Kapitel7.Reisebuero;

public interface Reservierung {

	public int freiePlaetze();
	public void buchePlaetze(int anzahl) throws NichtGenugFreiePlaetze, UngueltigeAnzahl;
}
