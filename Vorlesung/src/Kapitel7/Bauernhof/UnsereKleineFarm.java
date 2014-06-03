package Kapitel7.Bauernhof;

public class UnsereKleineFarm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Hund bello = new Hund();
		
		bello.fressen();
		bello.bewegen();
		bello.bellen();
		bello.atmen();
		
		Tier einTier;
		
		einTier = bello;
		
		einTier.atmen();
		einTier.bewegen();
		einTier.fressen();
		
		
		
		
		

	}

}
