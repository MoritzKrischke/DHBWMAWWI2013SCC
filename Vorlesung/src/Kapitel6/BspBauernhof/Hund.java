package Kapitel6.BspBauernhof;

public class Hund extends Tier{

	private String rasse;
	
	public Hund(float gewicht, String bezeichnung, float groesse, String rasse) {
		super(gewicht, bezeichnung, groesse);
		
		this.setRasse(rasse);
		
	}
	
	public void atmen(){
		System.out.println("Der Hund schnauft!");
	}
	
	public void bellen(){
		System.out.println("Wuff!");
		
	}
	
	@Override
	public void fressen(){
		super.fressen();
		System.out.println("Der Hund frisst Fleisch!");
	}


	public String getRasse() {
		return rasse;
	}

	public void setRasse(String rasse) {
		this.rasse = rasse;
	}
	
	public String toString(){
		return "Der Hund " + getBezeichnung() + " " + super.toString();
	}
	
	

}
