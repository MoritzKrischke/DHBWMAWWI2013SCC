package Kapitel6.BspBauernhof;

public class UnsereKleineFarm {

	
	public static void main(String[] args) {
		
		Hund bello = new Hund(15.6f, "Bello", 60.0f, "Dogge");

		bello.atmen();
		bello.bewegen();
		bello.fressen();
		bello.bellen();
	}

}
