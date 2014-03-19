package Kapitel6.BspBauernhof;

public class Vogel extends Tier {

	private boolean fliegen;
	
	public Vogel(float gewicht, String bezeichnung, float groesse, boolean fliegen) {
		super(gewicht, bezeichnung, groesse);
		setFliegen(fliegen);
	}
	
	public void zwitschern(){
		System.out.println("Der Vogel macht piep piep!");
	}

	public boolean isFliegen() {
		return fliegen;
	}

	public void setFliegen(boolean fliegen) {
		this.fliegen = fliegen;
	}

	@Override
	public void atmen() {
		System.out.println("Der Vogel atment!");
		
	}
	
	

	
}
