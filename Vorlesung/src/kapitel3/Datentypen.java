package kapitel3;

public class Datentypen {


	public static void main(String[] args) {
		
		// integer Deklaration und Initialisierung
		double zahl = 13;
		
		// Character Deklaration und Initialisierung
		// mit Characterliteral
		char buchstabe = 'a';
		// mit Integerliteral
		char buchstabe2 = 45;
		
		// Deklaration einer Konstanten
		final byte a;
		
		//zahl = 16.0;
		
		// Cast von Doubleliteral zu Byte
		a = (byte)30.0e300;
		
		// Byte Deklaration und Initialisierung
		byte b = 127;
		
		// Rechnungen richten sich im Ergebnis nach dem groessten Datentyp
		// in diesem Fall 2 (Integerliteral)
		b = (byte)(b + 2);
		
		System.out.println(b);
		
		// Double Deklaration und Initialisierung 
		double kleineZahl = .5; //16.0e-3f;
		
		// a = 125;
		
		System.out.println(a);
		
		// Beispiel für String mit Escapesequenzen
		String einText = "\tDas ist ein\nZitat: \"Kreativer Text!\"";
		
		// Initialisierung eines String ueber den Konstruktor
		String neuerText = new String("Text");
		
		// Ausgabe von Texten
		System.out.println(einText);
		System.out.println("Hello World!");

	}

}
