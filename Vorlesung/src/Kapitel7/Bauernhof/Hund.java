package Kapitel7.Bauernhof;

public class Hund implements Tier{

	public void bellen(){
		System.out.println("Der Hund bellt!");
	}
	
	
	@Override
	public void atmen() {
		System.out.println("Der Hund atmet!");
		
	}

	@Override
	public void fressen() {
		System.out.println("Der Hund frisst!");
		
	}

	@Override
	public void bewegen() {
		System.out.println("Der Hund bewegt sich!");
		
	}

	
	
}
