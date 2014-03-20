package Kapitel6.BspFedermappe;

public abstract class Stift {

	private String farbe;
	private boolean permanent;
	private float fuellung;
	
	public Stift(String farbe, boolean permanent, float fuellung){
		setFarbe(farbe);
		setPermanent(permanent);
		setFuellung(fuellung);
	}
	
	public abstract void schreiben(String text);

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public boolean isPermanent() {
		return permanent;
	}

	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}

	public float getFuellung() {
		return fuellung;
	}

	public void setFuellung(float fuellung) {
		this.fuellung = fuellung;
	}
	
	
	
	
	
}
