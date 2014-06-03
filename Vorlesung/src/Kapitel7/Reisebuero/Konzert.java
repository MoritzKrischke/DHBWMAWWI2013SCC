package Kapitel7.Reisebuero;

import Kapitel4.Uebungen.Ungerade;

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
	public void buchePlaetze(int anzahl) throws NichtGenugFreiePlaetze, UngueltigeAnzahl{
		if(anzahl < 1){
			throw new UngueltigeAnzahl(anzahl);
		}
		
		if(anzahl <= freiePlaetze){
			freiePlaetze -= anzahl;
			gebuchtePlaetze += anzahl;
		}else{
			throw new NichtGenugFreiePlaetze(freiePlaetze);
		}
		
	}

}
