package Kapitel8.Uebungen;

public class FalscheParameter extends Exception {

	public FalscheParameter(String farbe, boolean ledersitz){
		super("Falsche Parameter! Die Kombination aus Farbe: " + farbe + " und Ledersitz: " + ledersitz + " ist nicht gestattet!");
	}
	
}
