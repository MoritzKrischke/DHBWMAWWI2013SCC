package Kapitel8.Uebungen.Vorlesung;



public class Autositze {

	// Vorgegebene Farbwerte
	public static final String FARBE_ROT = "ROT";
	public static final String FARBE_GRUEN = "GRUEN";
	public static final String FARBE_BLAU = "BLAU";
	public static final String FARBE_SCHWARZ = "SCHWARZ";
	public static final String FARBE_WEISS = "WEISS";
		
	// Instanzattribute
	private boolean ledersitz;
	private String farbe;
	
	// Konstruktor
		public Autositze(String farbe, boolean ledersitz) throws FalscheParameter{

			if(ledersitz && !(farbe.equals(FARBE_WEISS) || farbe.equals(FARBE_SCHWARZ))){
				throw new FalscheParameter(farbe, ledersitz);
			}
			
			this.ledersitz = ledersitz;
			this.farbe = farbe;
		}
		
		public String getFarbe(){
			return farbe;
		}
		
		public boolean isLedersitz(){
			return ledersitz;
		}
		
		@Override
		public String toString(){
			return "Ein Sitz mit der Farbe: " + this.farbe + " und ledersitz: " + ledersitz;
		}
	
	
}
