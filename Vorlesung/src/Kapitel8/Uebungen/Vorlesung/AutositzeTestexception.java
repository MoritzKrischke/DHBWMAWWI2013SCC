package Kapitel8.Uebungen.Vorlesung;

public class AutositzeTestexception {

	public static void main(String[] args) {
		try{
			Autositze sitz1 = new Autositze(Autositze.FARBE_ROT, false);
			System.out.println(sitz1);
		}catch(FalscheParameter e){
			System.out.println(e.getMessage());
		}
		try{
			Autositze sitz2 = new Autositze(Autositze.FARBE_WEISS, true);
			System.out.println(sitz2);
		}catch(FalscheParameter e){
			System.out.println(e.getMessage());
		}
		try{
			Autositze sitz3 = new Autositze(Autositze.FARBE_BLAU, true);
			System.out.println(sitz3);
		}catch(FalscheParameter e){
			System.out.println(e.getMessage());
		}	
		try{
			Autositze sitz4 = new Autositze(Autositze.FARBE_ROT, false);
			System.out.println(sitz4);
		}catch(FalscheParameter e){
			System.out.println(e.getMessage());
		}catch(Exception e){
			
		}
			
		System.out.println("Sitze erzeugt!");
			
		
		
		System.out.println("Programm zu Ende");
	}

}
