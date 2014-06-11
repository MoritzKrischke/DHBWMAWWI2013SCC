package Kapitel8.Uebungen;

public class TestAutositze {


	public static void main(String[] args) {
		
		try {
			Autositz sitz1 = new Autositz(Autositz.FARBE_GRUEN, false);
			System.out.println(sitz1);
			
			Autositz sitz2 = new Autositz(Autositz.FARBE_WEISS, true);
			System.out.println(sitz2);
			
			Autositz sitz3 = new Autositz(Autositz.FARBE_ROT, false);
			System.out.println(sitz3);
			
			Autositz sitz4 = new Autositz(Autositz.FARBE_GRUEN, true);
			System.out.println(sitz4);
			
			Autositz sitz5 = new Autositz(Autositz.FARBE_SCHWARZ, true);
			System.out.println(sitz5);
			
			
			
			
			
		} catch (FalscheParameter e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		
		
	}

}
