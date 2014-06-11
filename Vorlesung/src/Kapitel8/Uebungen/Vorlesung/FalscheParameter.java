package Kapitel8.Uebungen.Vorlesung;

public class FalscheParameter extends Exception {

	public FalscheParameter(String farbe, boolean ledersitz){
		super("Falsche Parameter! Die Kombination Farbe: "
				+ farbe + 
				" und " +  (ledersitz ? "Ledersitze" : "Stoffsitze")
				+ " ist ungültig!");
	}
	
}
