package Kapitel8;

public class TestKlasse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object meinObjekt = null;
		
		try{
			
			meinObjekt.toString();
		
		}catch(NullPointerException exc1){
			System.out.println("Fehler aufgetreten: " + exc1.getMessage());
		}
		
		System.out.println("Weiter gehts!");
		
		int div = 0;
		if(div != 0){
			int a = 50 / div;
		}
	}

}
