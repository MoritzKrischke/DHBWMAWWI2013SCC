package Kapitel6.BspBauernhof;

public class Fisch extends Tier {

	private boolean knorpelfisch;
	
	public Fisch(float gewicht, String bezeichnung, float groesse, boolean knorpelfisch) {
		super(gewicht, bezeichnung, groesse);
		
		setKnorpelfisch(knorpelfisch);
		
	}

	public void blubbern(){
		System.out.println("Der Fisch blubbert!");
	}

	public boolean isKnorpelfisch() {
		return knorpelfisch;
	}

	public void setKnorpelfisch(boolean knorpelfisch) {
		this.knorpelfisch = knorpelfisch;
	}

	@Override
	public void atmen() {
		System.out.println("Der Fisch atmet - blub blub!");
		
	}
	
	
	
}
