package kapitel3;

public class Arrays {

	
	public static void main(String[] args) {
		
		// Array mit Werten initialisieren
		int[] zahlen1 = {12, 19, 156, 290, 345};
		
		// Werte durch Iterration einer For-Schleife auslesen
		for(int i = 0; i < zahlen1.length; i++){
			System.out.println("Index " + i + " = " + zahlen1[i]);
		}
		
		
		System.out.println("==========");
		
		System.out.println(zahlen1[3]);
		
		System.out.println(zahlen1.length);

		String einText = "Juhu!!!!!";
		
		System.out.println(einText.length());

		int[] zahlen2;
		
		zahlen2 = new int[10];
		
		zahlen2[5] = 134;
		
		System.out.println(zahlen2[5]);
		System.out.println(zahlen2.length);
		
		
		// initialisueren eines mehrdimensionalen Arrays
		String[][][] mehrDimensional = new String[10][5][];
		
		mehrDimensional[1][2] = new String[10];
		mehrDimensional[1][3] = new String[3];
		
		// zuweisen von Werten ueber den Index
		mehrDimensional[1][2][9] = "Hallo";
		mehrDimensional[1][3][2] = "Hallo2";
		
		// auslesen von Werten ueber den Index
		System.out.println(mehrDimensional[1][2].length);
	}

}
