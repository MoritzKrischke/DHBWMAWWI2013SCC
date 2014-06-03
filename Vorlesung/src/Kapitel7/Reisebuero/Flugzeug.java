package Kapitel7.Reisebuero;

public class Flugzeug implements Reservierung{

	private boolean[][] plaetze;
	
	public Flugzeug(int reihen, int sitzeProReihe){
		plaetze = new boolean[reihen][sitzeProReihe];
		
		for(int i = 0; i < plaetze.length; i++){
			for(int j = 0; j < plaetze[i].length; j++){
				plaetze[i][j] = false;
			}
		}
		
	}
	
	public void fliegen(){
		System.out.println("Hui");
	}
	
	@Override
	public int freiePlaetze() {
		
		int frei = 0;
		
		for(int i = 0; i < plaetze.length; i++){
			for(int j = 0; j < plaetze[i].length; j++){
				if(plaetze[i][j] == false){
					frei++;
				}
			}
		}
		
		
		return frei;
	}

	@Override
	public void buchePlaetze(int anzahl) throws NichtGenugFreiePlaetze, UngueltigeAnzahl{
		
		if(anzahl < 1){
			throw new UngueltigeAnzahl(anzahl);
		}
		
		if(anzahl <= freiePlaetze()){
			
			for(int i = 0; i < plaetze.length; i++){
				for(int j = 0; j < plaetze[i].length; j++){
					if(plaetze[i][j] == false && anzahl > 0){
						plaetze[i][j] = true;
						anzahl--;
					}
				}
			}
		}else{
			throw new NichtGenugFreiePlaetze(freiePlaetze());
		}
		
	}

	
	
	

}
