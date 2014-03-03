package Kapitel5.CallBy;

public class BspCallByValue {

	public static void main(String[] args) {
		
		// Definition von Variablen
		
		int a = 50;
		
		int b;
		
		// Zuweisung a -> b
		// Der Wert aus a wird in b übergeben!
		b = a;
		
		// Verändern von b;
		b = b + 100 * 20;
		
		
		if(a == b){
			System.out.println("Das kann nicht passieren!!");
		}else{
			// Ausgabe der Werte
			System.out.println("a hat den Wert: " + a);
			System.out.println("b hat den Wert: " + b);
			//Erläuterung
			System.out.println("\n\nBei einfachen Datentypen wird in Java Call by value ausgeführt - bedeutet: \nBei einer Zuweisung wird nur der Wert übergeben. Die ursprüngliche Variable (in diesem Fall a)\nändert sich nicht auch wenn die neu zugewiesene Variable (in diesem Fall b)\nmodifiziert wird!");
		}
		
		

	}

}
