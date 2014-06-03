package Kapitel7.Reisebuero;

public class Konzert implements Reservierung{

	private int freiePlaetze;
	private int gebuchtePlaetze;
	
	public Konzert(int anzahlMoeglicherPlaetze){
		freiePlaetze = anzahlMoeglicherPlaetze;
		gebuchtePlaetze = 0;
	}
	
	@Override
	public int freiePlaetze() {
		return freiePlaetze;
	}

	@Override
	public void buchePlaetze(int anzahl) {
		if(anzahl <= freiePlaetze){
			freiePlaetze -= anzahl;
			gebuchtePlaetze += anzahl;
		}
		
	}

}
