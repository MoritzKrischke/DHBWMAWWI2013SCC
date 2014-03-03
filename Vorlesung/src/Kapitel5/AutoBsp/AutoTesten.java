package Kapitel5.AutoBsp;

public class AutoTesten {

	public static void main(String[] args) {
		
		Auto meinAuto = new Auto("ROT", 230, "HD-HO 2001", 1999);
		Auto deinAuto = new Auto("bLAu", 160, "HD-XX 1993", 2013);
		Auto euerAuto = new Auto("gelb", 45, "HD-YY 878", 1713);
		
		System.out.println("mein Auto ist " + meinAuto.getFarbe() 
				+ ", hat " + meinAuto.getLeistung() + "PS, das Kennzeichen " 
				+ meinAuto.getKennzeichen() + " und wurde im Jahr " + meinAuto.getBaujahr() + " gebaut!");

	}

}
