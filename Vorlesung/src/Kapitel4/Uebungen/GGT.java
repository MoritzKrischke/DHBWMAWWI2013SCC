package Kapitel4.Uebungen;

public class GGT {

	public static void main(String[] args) {
		
		int x = 120;
		int y = 80;
		
		
		if(args.length == 2){
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
		}
		
		
		while(x != y){
			if(x > y){
				x -= y; // x = x - y;
			}else{
				y -= x; // y = y - x;
			}
		}
		
		System.out.println("Der GGT ist " + x);

	}

}
