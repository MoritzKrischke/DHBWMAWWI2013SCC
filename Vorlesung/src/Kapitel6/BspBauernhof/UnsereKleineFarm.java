package Kapitel6.BspBauernhof;

public class UnsereKleineFarm {

	
	public static void main(String[] args) {
		
		Hund bello = new Hund(15.6f, "Bello", 60.0f, "Dogge");

		System.out.println(bello.toString());
		
		bello.atmen();
		bello.bewegen();
		bello.fressen();
		bello.bellen();
		
		
		Tier irgendEinTier;
		
		irgendEinTier = bello;
		
		bello = null;
		
		irgendEinTier.bewegen();
		
		
		java.lang.Object etwas;
		
		etwas = irgendEinTier;
		
		Tier[] stall = new Tier[5];
		
		stall[0] = irgendEinTier;
		stall[1] = new Vogel(10f, "erstes Vögelchen", 18f, true);
		stall[2] = new Hund(15f, "zweiter Hund", 23f, "Dogge");
		
		for(int i = 0; i < stall.length; i++){
			if(stall[i] != null){
				stall[i].bewegen();
				stall[i].atmen();
				stall[i].fressen();
			}
		}
		
		Hund neuerHund;
		
		neuerHund = (Hund)stall[0];
		
		neuerHund.bellen();
		
		for(int i = 0; i < stall.length; i++){
			if(stall[i] != null){
				if(stall[i] instanceof Hund){ 
					neuerHund = (Hund)stall[i];
					neuerHund.bellen();
				}
				if(stall[i] instanceof Vogel){
					Vogel neuerVogel = (Vogel)stall[i];
					neuerVogel.zwitschern();
				}
			}
		}
	}

}
